package com.codechallenge;

import java.util.HashMap;

public class H {
    String[] letters = {"H","e","l","o","W","r","d"};
   private String classLetter = "H";
    HashMap<String,String> lettermap = new HashMap<>();
    public void MakeMap(){
        for (String letter :letters) {
            lettermap.put(letter,letter);

        }
    }
    public String getLetter(String letter){


        return lettermap.get(letter);
    }
    public String GetClassLetter(){
        return this.classLetter;
    }
}
