package com.testgit.exemple;

import java.util.HashMap;

public class NameBuilder {
    private String firstName;
    private String lastName;
    private static HashMap<String, String> fullName = new HashMap<String, String>();

    public NameBuilder(){}

    public NameBuilder(String firstName, String lastName){
        fullName.put(lastName, firstName);
    }

    public static void addName(){
        fullName.put("Shadi", "Boomi");
        //TODO Entrez vos noms ici
    }

    public static HashMap<String, String> getNameList(){
        return fullName;
    }

}
