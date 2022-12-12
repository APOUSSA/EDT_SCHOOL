package com.example.edtschool;

import android.content.Context;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;

public class Utility {

    static void showToast(Context context,String message){
        Toast.makeText(context,message, Toast.LENGTH_SHORT).show();
    }

    static CollectionReference getCollectionReferenceForEmplois(){
        FirebaseUser currentUser = FirebaseAuth.getInstance().getCurrentUser();
        return FirebaseFirestore.getInstance().collection("emplois")
                .document(currentUser.getUid()).collection("mon_emplois");
    }

}