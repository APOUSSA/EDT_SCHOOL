package com.example.edtschool;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.Timestamp;
import com.google.firebase.firestore.DocumentReference;




public class MyEmploi extends AppCompatActivity {

    EditText titleEditText, classeEditText;
    TableLayout contentTaleLayout;
    ImageView saveEmploiBtn;
    String[] cour = {"Developpement mobile","CCNA1", "CCNA2", "Cryptographie" ,"Analyse","Redaction scientique","Electonique numerique","POO","Developpement Web","GNU Linus","Les Bases de données","Anglais","Algorithmique","Maths Discètes"};

    AutoCompleteTextView autoCompleteTextView;

    ArrayAdapter<String> adapterItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_emploi);

        titleEditText = findViewById(R.id.emploi_title_text);
        contentTaleLayout = findViewById(R.id.emploi_content_text);
        saveEmploiBtn = findViewById(R.id.save_emploi_btn);
        classeEditText = findViewById(R.id.emploi_classe_text);

        saveEmploiBtn.setOnClickListener((v)-> saveEmploi());

        autoCompleteTextView = findViewById(R.id.autocomplete);

        adapterItems = new ArrayAdapter<String>(this,R.layout.list, cour);

        autoCompleteTextView.setAdapter(adapterItems);

        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l){
                String cour = adapterView.getItemAtPosition(position).toString();
                Toast.makeText(MyEmploi.this, "cour "+ cour,Toast.LENGTH_SHORT).show();
            }
        });

        autoCompleteTextView = findViewById(R.id.autocomplete2);

        adapterItems = new ArrayAdapter<String>(this,R.layout.list, cour);

        autoCompleteTextView.setAdapter(adapterItems);

        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l){
                String cour = adapterView.getItemAtPosition(position).toString();
                Toast.makeText(MyEmploi.this, "cour "+ cour,Toast.LENGTH_SHORT).show();
            }
        });

        autoCompleteTextView = findViewById(R.id.autocomplete3);

        adapterItems = new ArrayAdapter<String>(this,R.layout.list, cour);

        autoCompleteTextView.setAdapter(adapterItems);

        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l){
                String cour = adapterView.getItemAtPosition(position).toString();
                Toast.makeText(MyEmploi.this, "cour "+ cour,Toast.LENGTH_SHORT).show();
            }
        });

        autoCompleteTextView = findViewById(R.id.autocomplete4);

        adapterItems = new ArrayAdapter<String>(this,R.layout.list, cour);

        autoCompleteTextView.setAdapter(adapterItems);

        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l){
                String cour = adapterView.getItemAtPosition(position).toString();
                Toast.makeText(MyEmploi.this, "cour "+ cour,Toast.LENGTH_SHORT).show();
            }
        });

        autoCompleteTextView = findViewById(R.id.autocomplete5);

        adapterItems = new ArrayAdapter<String>(this,R.layout.list, cour);

        autoCompleteTextView.setAdapter(adapterItems);

        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l){
                String cour = adapterView.getItemAtPosition(position).toString();
                Toast.makeText(MyEmploi.this, "cour "+ cour,Toast.LENGTH_SHORT).show();
            }
        });

        autoCompleteTextView = findViewById(R.id.autocomplete6);

        adapterItems = new ArrayAdapter<String>(this,R.layout.list, cour);

        autoCompleteTextView.setAdapter(adapterItems);

        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l){
                String cour = adapterView.getItemAtPosition(position).toString();
                Toast.makeText(MyEmploi.this, "cour "+ cour,Toast.LENGTH_SHORT).show();
            }
        });

        autoCompleteTextView = findViewById(R.id.autocomplete7);

        adapterItems = new ArrayAdapter<String>(this,R.layout.list, cour);

        autoCompleteTextView.setAdapter(adapterItems);

        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l){
                String cour = adapterView.getItemAtPosition(position).toString();
                Toast.makeText(MyEmploi.this, "cour "+ cour,Toast.LENGTH_SHORT).show();
            }
        });

        autoCompleteTextView = findViewById(R.id.autocomplete8);

        adapterItems = new ArrayAdapter<String>(this,R.layout.list, cour);

        autoCompleteTextView.setAdapter(adapterItems);

        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l){
                String cour = adapterView.getItemAtPosition(position).toString();
                Toast.makeText(MyEmploi.this, "cour "+ cour,Toast.LENGTH_SHORT).show();
            }
        });

        autoCompleteTextView = findViewById(R.id.autocomplete9);

        adapterItems = new ArrayAdapter<String>(this,R.layout.list, cour);

        autoCompleteTextView.setAdapter(adapterItems);

        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l){
                String cour = adapterView.getItemAtPosition(position).toString();
                Toast.makeText(MyEmploi.this, "cour "+ cour,Toast.LENGTH_SHORT).show();
            }
        });

        autoCompleteTextView = findViewById(R.id.autocomplete10);

        adapterItems = new ArrayAdapter<String>(this,R.layout.list, cour);

        autoCompleteTextView.setAdapter(adapterItems);

        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l){
                String cour = adapterView.getItemAtPosition(position).toString();
                Toast.makeText(MyEmploi.this, "cour "+ cour,Toast.LENGTH_SHORT).show();
            }
        });

        autoCompleteTextView = findViewById(R.id.autocomplete11);

        adapterItems = new ArrayAdapter<String>(this,R.layout.list, cour);

        autoCompleteTextView.setAdapter(adapterItems);

        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l){
                String cour = adapterView.getItemAtPosition(position).toString();
                Toast.makeText(MyEmploi.this, "cour "+ cour,Toast.LENGTH_SHORT).show();
            }
        });

        autoCompleteTextView = findViewById(R.id.autocomplete12);

        adapterItems = new ArrayAdapter<String>(this,R.layout.list, cour);

        autoCompleteTextView.setAdapter(adapterItems);

        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l){
                String cour = adapterView.getItemAtPosition(position).toString();
                Toast.makeText(MyEmploi.this, "cour "+ cour,Toast.LENGTH_SHORT).show();
            }
        });

        autoCompleteTextView = findViewById(R.id.autocomplete13);

        adapterItems = new ArrayAdapter<String>(this,R.layout.list, cour);

        autoCompleteTextView.setAdapter(adapterItems);

        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l){
                String cour = adapterView.getItemAtPosition(position).toString();
                Toast.makeText(MyEmploi.this, "cour "+ cour,Toast.LENGTH_SHORT).show();
            }
        });

        autoCompleteTextView = findViewById(R.id.autocomplete14);

        adapterItems = new ArrayAdapter<String>(this,R.layout.list, cour);

        autoCompleteTextView.setAdapter(adapterItems);

        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l){
                String cour = adapterView.getItemAtPosition(position).toString();
                Toast.makeText(MyEmploi.this, "cour "+ cour,Toast.LENGTH_SHORT).show();
            }
        });

        autoCompleteTextView = findViewById(R.id.autocomplete15);

        adapterItems = new ArrayAdapter<String>(this,R.layout.list, cour);

        autoCompleteTextView.setAdapter(adapterItems);

        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l){
                String cour = adapterView.getItemAtPosition(position).toString();
                Toast.makeText(MyEmploi.this, "cour "+ cour,Toast.LENGTH_SHORT).show();
            }
        });

        autoCompleteTextView = findViewById(R.id.autocomplete16);

        adapterItems = new ArrayAdapter<String>(this,R.layout.list, cour);

        autoCompleteTextView.setAdapter(adapterItems);

        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l){
                String cour = adapterView.getItemAtPosition(position).toString();
                Toast.makeText(MyEmploi.this, "cour "+ cour,Toast.LENGTH_SHORT).show();
            }
        });

        autoCompleteTextView = findViewById(R.id.autocomplete17);

        adapterItems = new ArrayAdapter<String>(this,R.layout.list, cour);

        autoCompleteTextView.setAdapter(adapterItems);

        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l){
                String cour = adapterView.getItemAtPosition(position).toString();
                Toast.makeText(MyEmploi.this, "cour "+ cour,Toast.LENGTH_SHORT).show();
            }
        });

        autoCompleteTextView = findViewById(R.id.autocomplete18);

        adapterItems = new ArrayAdapter<String>(this,R.layout.list, cour);

        autoCompleteTextView.setAdapter(adapterItems);

        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l){
                String cour = adapterView.getItemAtPosition(position).toString();
                Toast.makeText(MyEmploi.this, "cour "+ cour,Toast.LENGTH_SHORT).show();
            }
        });

        autoCompleteTextView = findViewById(R.id.autocomplete19);

        adapterItems = new ArrayAdapter<String>(this,R.layout.list, cour);

        autoCompleteTextView.setAdapter(adapterItems);

        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l){
                String cour = adapterView.getItemAtPosition(position).toString();
                Toast.makeText(MyEmploi.this, "cour "+ cour,Toast.LENGTH_SHORT).show();
            }
        });

        autoCompleteTextView = findViewById(R.id.autocomplete20);

        adapterItems = new ArrayAdapter<String>(this,R.layout.list, cour);

        autoCompleteTextView.setAdapter(adapterItems);

        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l){
                String cour = adapterView.getItemAtPosition(position).toString();
                Toast.makeText(MyEmploi.this, "cour "+ cour,Toast.LENGTH_SHORT).show();
            }
        });

        autoCompleteTextView = findViewById(R.id.autocomplete21);

        adapterItems = new ArrayAdapter<String>(this,R.layout.list, cour);

        autoCompleteTextView.setAdapter(adapterItems);

        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l){
                String cour = adapterView.getItemAtPosition(position).toString();
                Toast.makeText(MyEmploi.this, "cour "+ cour,Toast.LENGTH_SHORT).show();
            }
        });

        autoCompleteTextView = findViewById(R.id.autocomplete22);

        adapterItems = new ArrayAdapter<String>(this,R.layout.list, cour);

        autoCompleteTextView.setAdapter(adapterItems);

        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l){
                String cour = adapterView.getItemAtPosition(position).toString();
                Toast.makeText(MyEmploi.this, "cour "+ cour,Toast.LENGTH_SHORT).show();
            }
        });

        autoCompleteTextView = findViewById(R.id.autocomplete23);

        adapterItems = new ArrayAdapter<String>(this,R.layout.list, cour);

        autoCompleteTextView.setAdapter(adapterItems);

        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l){
                String cour = adapterView.getItemAtPosition(position).toString();
                Toast.makeText(MyEmploi.this, "cour "+ cour,Toast.LENGTH_SHORT).show();
            }
        });

        autoCompleteTextView = findViewById(R.id.autocomplete24);

        adapterItems = new ArrayAdapter<String>(this,R.layout.list, cour);

        autoCompleteTextView.setAdapter(adapterItems);

        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l){
                String cour = adapterView.getItemAtPosition(position).toString();
                Toast.makeText(MyEmploi.this, "cour "+ cour,Toast.LENGTH_SHORT).show();
            }
        });


    }

    void saveEmploi(){
        String emploiTitle = titleEditText.getText().toString();
        String emploiClasse = classeEditText.getText().toString();
        String emploiContent = contentTaleLayout.getLayoutParams().toString();
        if(emploiTitle==null || emploiTitle.isEmpty()){
            titleEditText.setError("Le titre est requis");
            return;
        }

        if(emploiClasse==null || emploiClasse.isEmpty()){
            classeEditText.setError("La classe est requise");
        }

        Emploi emploi = new Emploi();
        emploi.setTitle(emploiTitle);
        emploi.setClasse(emploiClasse);
        emploi.setContent(emploiContent);
        emploi.setTimestamp(Timestamp.now());

        saveEmploiToFirebase(emploi);

    }

    void saveEmploiToFirebase(Emploi emploi){
        DocumentReference documentReference;
        documentReference = Utility.getCollectionReferenceForEmplois().document();

        documentReference.set(emploi).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task){
                if(task.isSuccessful()){
                    //ajouter l'emploi du temps
                    Utility.showToast(MyEmploi.this, "Emploi du temps ajouter avec succes");
                    finish();
                }else {
                    Utility.showToast(MyEmploi.this, "Echec lors de l'ajout de l'emploi du temps");
                }
            }
        });
    }

}