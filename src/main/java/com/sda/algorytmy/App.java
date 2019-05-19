package com.sda.algorytmy;

import java.util.Arrays;
import java.util.Random;

public class App {
    public static int[] sort(int[] tab) {
        for (int j = 0; j < tab.length - 1; j++) {

            boolean flaga = false;
            for (int i = 0; i < tab.length - 1 - j; i++) {
                if (tab[i] > tab[i + 1]) {
                    int tmp = tab[i + 1];
                    tab[i + 1] = tab[i];
                    tab[i] = tmp;
                    flaga = true;
                }
            }
            if(!flaga){
                break;
            }
        }
        System.out.println(Arrays.toString(tab));
        return tab;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int max = 5000;
        int min = -5000;
        int[] tab = new int[10000];
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < tab.length; i++) {
            int randomNumber = random.nextInt(max - min + 1) + min;
            tab[i] = randomNumber;
            System.out.println(tab[i]);
        }
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("Czas wykonywania: " + totalTime);
        startTime = System.currentTimeMillis();
        sort(tab);
        endTime = System.currentTimeMillis();
        totalTime = endTime - startTime;
        System.out.println("Czas sortowania: " + totalTime);
    }
}
