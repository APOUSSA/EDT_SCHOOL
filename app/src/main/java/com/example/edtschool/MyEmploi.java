package com.example.edtschool;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.Timestamp;
import com.google.firebase.firestore.DocumentReference;




public class MyEmploi extends AppCompatActivity {

    EditText titleEditText, classeEditText;
    TableLayout contentTableLayout;
    TextView pageTitleTextView, deleteEmploiTextViewBtn;
    String title,classe,content,docId;
    ImageView saveEmploiBtn;
    boolean isEditMode = false;
    String[] cour = {"Developpement mobile","CCNA1", "CCNA2", "Cryptographie" ,"Analyse","Redaction scientique","Electonique numerique","POO","Developpement Web","GNU Linus","Les Bases de données","Anglais","Algorithmique","Maths Discètes"};

    AutoCompleteTextView autoCompleteTextView;

    ArrayAdapter<String> adapterItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_emploi);

        titleEditText = findViewById(R.id.emploi_title_text);
        contentTableLayout = findViewById(R.id.emploi_content_text);
        saveEmploiBtn = findViewById(R.id.save_emploi_btn);
        classeEditText = findViewById(R.id.emploi_classe_text);
        pageTitleTextView = findViewById(R.id.page_title);
        deleteEmploiTextViewBtn = findViewById(R.id.delete_emploi_text_view_btn);

        //RECEVOIR LES DONNEES
        title = getIntent().getStringExtra("title");
        classe = getIntent().getStringExtra("classe");
        content = getIntent().getStringExtra("content");
        docId = getIntent().getStringExtra("docId");

        if(docId!=null && !docId.isEmpty()){
            isEditMode = true;
        }

        titleEditText.setText(title);
        classeEditText.setText(classe);
        //contentTableLayout.setLayoutParams(contentTableLayout);

        if(isEditMode){
            pageTitleTextView.setText("Modifie ton Emploi de temps");
            deleteEmploiTextViewBtn.setVisibility(View.VISIBLE);
        }


        saveEmploiBtn.setOnClickListener((v)-> saveEmploi());

        deleteEmploiTextViewBtn.setOnClickListener((v)->deleteEmploiFromFirebase());

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
        String emploiContent = contentTableLayout.getLayoutParams().toString();
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
        if(isEditMode){
            //METTRE A JOUR LA NOTE
            documentReference = Utility.getCollectionReferenceForEmplois().document(docId);
        }else{
            //CREER UN NOUVELLE EMPLOIS DE TEMPS
            documentReference = Utility.getCollectionReferenceForEmplois().document();
        }


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

    void deleteEmploiFromFirebase(){
        DocumentReference documentReference;
            documentReference = Utility.getCollectionReferenceForEmplois().document(docId);
            documentReference.delete().addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task){
                if(task.isSuccessful()){
                    //ajouter l'emploi du temps
                    Utility.showToast(MyEmploi.this, "Emploi du temps supprimer avec succes");
                    finish();
                }else {
                    Utility.showToast(MyEmploi.this, "Echec lors de la suppression de l'emploi du temps");
                }
            }
        });

    }

}