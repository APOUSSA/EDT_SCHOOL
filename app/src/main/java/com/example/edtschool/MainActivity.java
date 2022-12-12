package com.example.edtschool;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton addEmploiBtn;
    RecyclerView recyclerView;
    ImageButton menuBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addEmploiBtn = findViewById(R.id.add_emploi_btn);
        recyclerView = findViewById(R.id.recyler_view);
        menuBtn = findViewById(R.id.menu_btn);

        addEmploiBtn.setOnClickListener((v)-> startActivity(new Intent(MainActivity.this, MyEmploi.class)));
        menuBtn.setOnClickListener((v)->showMenu());
        setupRecyclerView();

    }

    void showMenu(){
        //POIR AFFICHER LE MENU

    }

    void setupRecyclerView(){

    }

}