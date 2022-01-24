package com.app.weatherwithyou;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ScienceFragment extends Fragment {

    String API_KEY = "c7fc2c810d3d46b28296da926a4f3d5b";

    ArrayList<ModalClass> modalClassArrayList;
    Adapter adapter;
    String country = "in";
    private RecyclerView recyclerViewofscience; //because of lot of recycler view in a single fragment

    private String category = "science";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        //Attach a fragment
        //Add a view
        //Add an inflator

        View v = inflater.inflate(R.layout.sciencefragment, null);

        recyclerViewofscience = v.findViewById(R.id.recyclerviewofscience);
        modalClassArrayList = new ArrayList<>();
        recyclerViewofscience.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new Adapter(getContext(), modalClassArrayList);
        recyclerViewofscience.setAdapter(adapter);

        findNews();

        return v;

        //how to fetch a specific continues
    }

    private void findNews() {


        ApiUtilities.getApiInterface().getCategoryNews(country,category,100,API_KEY).enqueue(new Callback<News>() {
            @Override
            public void onResponse(Call<News> call, Response<News> response) {

            }

            @Override
            public void onFailure(Call<News> call, Throwable t) {

            }
        });
    }
}
