package org.insbaixcamp.reservesapp.ui.inici;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.insbaixcamp.reservesapp.R;
import org.insbaixcamp.reservesapp.databinding.FragmentIniciBinding;
import org.insbaixcamp.reservesapp.ui.adapter.EventAdapter;
import org.insbaixcamp.reservesapp.ui.models.Event;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private FragmentIniciBinding binding;
    private EventAdapter eventAdapter;
    private LinearLayoutManager linearLayoutManager;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);


        binding = FragmentIniciBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        linearLayoutManager = new LinearLayoutManager(root.getContext(),LinearLayoutManager.VERTICAL,false);
        binding.rvEvents.setLayoutManager(linearLayoutManager);

        homeViewModel.getEventList().observe(getViewLifecycleOwner(), new Observer<ArrayList<Event>>() {
            @Override
            public void onChanged(ArrayList<Event> events) {
                Log.i("Lista Event",events.toString());
                eventAdapter = new EventAdapter(events);
                binding.rvEvents.setAdapter(eventAdapter);
            }
        });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}