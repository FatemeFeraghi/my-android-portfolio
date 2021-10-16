package com.fateme.fatemeandroidportfolio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView list = findViewById(R.id.recycler_view_projects);

        Project[] projects = {
                new Project("Quiz App","A quiz app, teaching me about Activities, Listeners, Objects, ArrayLists and Intents.",R.drawable.restau),
                new Project("BMI Calculator","A BMI calculator, using conditional statements, variables, ListViews and objects.",R.drawable.weight2),
                new Project("Sport App","An sport multi screen app, learning about Android Layouts and Views, performing clear, next and quit Buttons.",R.drawable.sport),
                new Project("Restaurant App","A menu app for a restaurant, learning about Activities, Classes, Objects, Arrays, Intents and Listviews.",R.drawable.restau),
        };

        ProjectsAdapter adapter = new ProjectsAdapter(projects);
        list.setAdapter(adapter);

    }
}