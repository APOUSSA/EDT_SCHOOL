package com.example.edtschool;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.widget.PopupMenu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.firestore.FirestoreRecyclerOptions;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.Query;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton addEmploiBtn;
    RecyclerView recyclerView;
    ImageButton menuBtn;
    EmploiAdapter emploiAdapter;

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
        PopupMenu popupMenu = new PopupMenu(MainActivity.this,menuBtn);
        popupMenu.getMenu().add("Sortir");
        popupMenu.show();
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                if(menuItem.getTitle()=="Sortir"){
                    FirebaseAuth.getInstance().signOut();
                    startActivity(new Intent(MainActivity.this, LoginActivity.class));
                    finish();
                    return true;
                }
                return false;
            }
        });
    }

    void setupRecyclerView(){
        Query query = Utility.getCollectionReferenceForEmplois().orderBy("timestamp", Query.Direction.DESCENDING);
        FirestoreRecyclerOptions<Emploi> options = new FirestoreRecyclerOptions.Builder<Emploi>()
                .setQuery(query,Emploi.class).build();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        emploiAdapter = new EmploiAdapter(options, this);
        recyclerView.setAdapter(emploiAdapter);
    }

    @Override
    protected void onStart() {
        super.onStart();
        emploiAdapter.startListening();
    }

    @Override
    protected void onStop() {
        super.onStop();
        emploiAdapter.stopListening();
    }

    @Override
    protected void onResume() {
        super.onResume();
        emploiAdapter.notifyDataSetChanged();
    }
}