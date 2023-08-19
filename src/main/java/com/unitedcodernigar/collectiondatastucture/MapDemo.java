package com.unitedcodernigar.collectiondatastucture;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {

        Map<String,Integer> age = new HashMap<>();
        age.put("Alim",35);
        age.put("Aynur",25);
        age.put("Adil",40);
        System.out.println(age.get("Aynur"));
        age.replace("Alim",50);
        System.out.println(age.get("Alim"));

        // keySet
        Set<String> keys = age.keySet();
        System.out.println(keys);
        //for (String k:keys) {
        //   System.out.println(age.get(k));
        //}

        for (Map.Entry entry:age.entrySet()) {
            System.out.println(entry.getKey()+": "+entry.getValue());
        }


    }
}
