package com.unitedcodernigar.allpracticerepeat.alotofmixfunction;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map1N {
    public static void main(String[] args) {

        Map<String,Integer> restore = new HashMap<>();
        restore.put("Alim",23);
        restore.put("burak",25);
        restore.put("selim",26);
        System.out.println(restore.get("burak"));
        restore.replace("Alim",32);
        System.out.println(restore.get("Alim"));

        // keySet
        Set<String> bake = restore.keySet();
        System.out.println(bake);

        for (Map.Entry entry : restore.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }



    }
}
