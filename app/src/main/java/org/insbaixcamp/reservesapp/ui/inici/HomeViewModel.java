package org.insbaixcamp.reservesapp.ui.inici;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import org.insbaixcamp.reservesapp.ui.firebase.FirebaseConnection;
import org.insbaixcamp.reservesapp.ui.models.Event;

import java.util.ArrayList;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<ArrayList<Event>> mText;
    private FirebaseConnection fbc;

    public HomeViewModel() {
        fbc = new FirebaseConnection();
        mText = new MutableLiveData<>();
        fbc.getEvents(new FirebaseConnection.FireStoreResults() {
            @Override
            public void onResultGet() {
                mText.setValue(fbc.getList());
            }
        });

    }

    public LiveData<ArrayList<Event>> getEventList() {
        return mText;
    }
}