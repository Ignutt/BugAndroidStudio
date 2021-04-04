package com.example.javaproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    ArrayList<State> states = new ArrayList<State>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycleview);
        setInitialState();
        RecyclerView recyclerView = findViewById(R.id.recycleView);
        StateAdapter stateAdapter = new StateAdapter(getLayoutInflater(), states);
        recyclerView.setAdapter(stateAdapter);
    }

    private void setInitialState(){
        states.add(new State("CHAD", "sdfsfsf", R.drawable.germany));
        states.add(new State("CHAD", "sdsfsdsfssfsf", R.drawable.france));
        states.add(new State("CHAD", "sdfsfsf", R.drawable.france));
    }
}