package agh.po.lab2;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lotto {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        for(int i = 1; i<=6; i++) {
            boolean nastepny = true;
            while (nastepny) {
                int n = r.nextInt(1, 49);
                boolean jest = lista.contains(n);
                if (!jest) {
                    lista.add(n);
                    nastepny = false;
                }
            }
        }
        ArrayList<Integer> typy = new ArrayList<>();
        for(int k = 1; k<=6;k++){
            typy.add(scanner.nextInt());
        }
        System.out.print("Wylosowane liczby = " + lista);
        System.out.print("\nTwoje typy =" + typy);
        int trafienia = 0;
            for(int p = 0; p<6; p++){
                if(lista.contains(typy.get(p))){
                    trafienia++;
                }
            }
        System.out.print("\nLiczba trafien = " + trafienia);
        ArrayList<Integer> komputer = new ArrayList<>();
    }
}

