package com.example.edtschool;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.firestore.FirestoreRecyclerAdapter;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;

public class EmploiAdapter extends FirestoreRecyclerAdapter<Emploi, EmploiAdapter.EmploiViewHolder> {

    Context context;

    public EmploiAdapter(@NonNull FirestoreRecyclerOptions<Emploi> options, Context context) {
        super(options);
        this.context = context;
    }

    @Override
    protected void onBindViewHolder(@NonNull EmploiViewHolder holder, int position, @NonNull Emploi emploi) {
        holder.titleTextView.setText(emploi.title);
        holder.contentTextView.setText(emploi.content);
        holder.classeTextView.setText(emploi.classe);
        holder.timestampTextView.setText(Utility.timestampToString(emploi.timestamp));

        holder.itemView.setOnClickListener((v)->{
            Intent intent = new Intent(context,MyEmploi.class);
            intent.putExtra("title",emploi.title);
            intent.putExtra("title",emploi.content);
            intent.putExtra("title",emploi.classe);
            String docId = this.getSnapshots().getSnapshot(position).getId();
            intent.putExtra("docId",docId);
            context.startActivity(intent);
        });

    }

    @NonNull
    @Override
    public EmploiViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_emploi_item,parent,false);
        return new EmploiViewHolder(view);
    }

    class EmploiViewHolder extends RecyclerView.ViewHolder{
        TextView titleTextView, contentTextView, classeTextView, timestampTextView;

        public EmploiViewHolder(@NonNull View itemView) {
            super(itemView);
            titleTextView = itemView.findViewById(R.id.emploi_title_text_view);
            classeTextView = itemView.findViewById(R.id.emploi_classe_text_view);
            contentTextView = itemView.findViewById(R.id.emploi_content_text_view);
            timestampTextView = itemView.findViewById(R.id.emploi_timestamp_text_view);
        }
    }

}

