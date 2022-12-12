package com.example.edtschool;

//import java.sql.Timestamp;
import com.google.firebase.Timestamp;

public class Emploi {

    String title;
    String content;
    String classe;
    Timestamp timestamp;

//    public Emploi(String title) {
//        this.title = title;
//    }

    public Emploi() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }
}
