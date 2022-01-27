package org.insbaixcamp.reservesapp;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Menu;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.gson.Gson;

import androidx.annotation.NonNull;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;

import org.insbaixcamp.reservesapp.databinding.ActivityMainBinding;
import org.insbaixcamp.reservesapp.ui.firebase.FirebaseConnection;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        FirebaseConnection fbCon = new FirebaseConnection();

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.appBarMain.toolbar);
        binding.appBarMain.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        DrawerLayout drawer = binding.drawerLayout;
        NavigationView navigationView = binding.navView;
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_inici, R.id.nav_registre, R.id.nav_inici_sesio, R.id.nav_detalls_event)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);



        fbCon.getEvents(new FirebaseConnection.FireStoreResults() {
            @Override
            public void onResultGet() {
                Log.i("firebaseMain", String.valueOf(fbCon.getList()));
            }
        });

//        fbCon.getReserves(new FirebaseConnection.FireStoreResults() {
//            @Override
//            public void onResultGet() {
//                Log.i("firebaseMain", String.valueOf(fbCon.getList()));
//            }
//        });
//
//        fbCon.getRecintes(new FirebaseConnection.FireStoreResults() {
//            @Override
//            public void onResultGet() {
//                Log.i("firebaseMain", String.valueOf(fbCon.getList()));
//            }
//        });
//
//        fbCon.getOpinions(new FirebaseConnection.FireStoreResults() {
//            @Override
//            public void onResultGet() {
//                Log.i("firebaseMain", String.valueOf(fbCon.getList()));
//            }
//        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }
}