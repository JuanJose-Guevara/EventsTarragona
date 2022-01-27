package org.insbaixcamp.reservesapp.ui.firebase;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.insbaixcamp.reservesapp.ui.models.Event;
import org.insbaixcamp.reservesapp.ui.models.Opinio;
import org.insbaixcamp.reservesapp.ui.models.Recinte;
import org.insbaixcamp.reservesapp.ui.models.Reserva;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class FirebaseConnection {

    FirebaseDatabase db;
    DatabaseReference myRef;
    Gson gson;
    String jsonValues;
    ArrayList list;
    FireStoreResults fireStoreResults;

    public ArrayList getList() {
        return list;
    }

    public FirebaseConnection () {
        db = FirebaseDatabase.getInstance("https://eventos-tarragona-app-default-rtdb.firebaseio.com/");
        gson = new Gson();
        myRef = db.getReference();
        list = new ArrayList<>();
    }

//    <test>
    public void getOpinions(final FireStoreResults resul) {

        myRef.child("Opinions").get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DataSnapshot> task) {

                String string = gson.toJson(task.getResult().getValue());
                ArrayList<Opinio> opinions = gson.fromJson(string, new TypeToken<ArrayList<Opinio>>(){}.getType());
                list = opinions;

                resul.onResultGet();
            }
        });

    }

    public void getRecintes(final FireStoreResults resul) {

        myRef.child("Recintes").get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DataSnapshot> task) {

                list = new ArrayList();

                String string = gson.toJson(task.getResult().getValue());
//                ArrayList<Recinte> recintes = gson.fromJson(string, new TypeToken<ArrayList<Recinte>>(){}.getType());
                list.add(gson.fromJson(string, Recinte.class));

                resul.onResultGet();
            }
        });

    }

    public void getReserves(final FireStoreResults resul) {

        myRef.child("Reserves").get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DataSnapshot> task) {

                String string = gson.toJson(task.getResult().getValue());
                ArrayList<Reserva> reserves = gson.fromJson(string, new TypeToken<ArrayList<Reserva>>(){}.getType());
                list = reserves;

                resul.onResultGet();
            }
        });

    }


    public void getEvents (final FireStoreResults resul) {

        myRef.child("Events").get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DataSnapshot> task) {

                String string = gson.toJson(task.getResult().getValue());
                ArrayList<Event> events = gson.fromJson(string, new TypeToken<ArrayList<Event>>(){}.getType());
                list = events;

                resul.onResultGet();
            }
        });

    }

    public interface FireStoreResults {
        public void onResultGet();
    }

}
