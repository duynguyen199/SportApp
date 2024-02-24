package com.example.sportapps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    private List<Sport> sportList;

    private CustomAdapter customAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerView3);

        sportList=new ArrayList<>();

        Sport sport1 =new Sport("FootBall",R.drawable.football);
        Sport sport2 =new Sport("Basketball",R.drawable.basketball);
        Sport sport3 =new Sport("Tennis",R.drawable.tennis);
        Sport sport4 =new Sport("Volleyball",R.drawable.volley);
        Sport sport5 =new Sport("Ping",R.drawable.ping);


        sportList.add(sport1);
        sportList.add(sport2);
        sportList.add(sport3);
        sportList.add(sport4);
        sportList.add(sport5);

        customAdapter=new CustomAdapter(sportList);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(customAdapter);

    }
}