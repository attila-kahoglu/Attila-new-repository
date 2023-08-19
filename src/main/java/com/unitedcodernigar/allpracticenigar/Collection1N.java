package com.unitedcodernigar.allpracticenigar;

public class Collection1N {
    public static void main(String[] args) {

        int[] array = new int[5];
        array[0] = 23;
        array[1] = 24;
        array[2] = 25;
        array[3] = 26;
        array[4] = 27;

        System.out.println(array[3]);
        System.out.println(array[0]);
        System.out.println(array.length);
        System.out.println("---------2----------");


        for (int a : array) {
            System.out.print(a+" ");
        }
        System.out.println();

        System.out.println("--------3---------");

        int[] boor = {32,33,35,36,38,39};
        System.out.println(boor[3]);
        System.out.println(boor[1]);
        System.out.println(boor.length);

        System.out.println("------------4----------");
        int[][] banker = {{23,24,25},{32,33,34},{12,14,16},{22,33,44}};
        System.out.println(banker.length);
        System.out.println(banker[2].length);
        System.out.println(banker[2][1]);
        System.out.println(banker[3][2]);

        System.out.println("-----------5-----------");
        String[] hande = new String[3];
        hande[0] = "finger";
        hande[1] = "pig";
        hande[2] = "ship";
        System.out.println(hande[2]);
        System.out.println(hande[0]);
        System.out.println(hande.length);

        System.out.println("-----------6-------------");

        String[] game = {"play","success","lazy","smart","fast"};
        System.out.println(game.length);
        System.out.println(game[4]);
        System.out.println(game[0]);
        System.out.println("---------7---------");

        String[] show = {"glasses","glass","cup","student","teacher","education"};
        System.out.println(show.length);
        System.out.println(show[3]);
        System.out.println(show[5]);


    }
}
