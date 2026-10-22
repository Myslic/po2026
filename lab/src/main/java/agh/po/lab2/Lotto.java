package agh.po.lab2;
import java.util.*;

public class Lotto {
    public static void main(String[] args) {
        Random r = new Random();
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
        for(int k = 0; k<6;k++){
            typy.add(Integer.parseInt(args[k]));
        }
        System.out.print("Wylosowane liczby = " + lista);
        System.out.print("\nTwoje typy = " + typy);
        int trafienia = 0;
            for(int p = 0; p<6; p++){
                if(lista.contains(typy.get(p))){
                    trafienia++;
                }
            }
        System.out.print("\nLiczba trafien = " + trafienia);
        ArrayList<Integer> komputer = new ArrayList<>();
        int ile_razy = 0;
        Collections.sort(lista);
        long time_start = System.currentTimeMillis();
        boolean start = true;
        while(start){
            for(int j = 1; j<=6; j++) {
                boolean nastepny = true;
                while (nastepny) {
                    int u = r.nextInt(1, 49);
                    boolean powtorzenie = komputer.contains(u);
                    if(!powtorzenie) {
                        komputer.add(u);
                        nastepny = false;
                    }
                }
            }
            ile_razy = ile_razy + 1;
            Collections.sort(komputer);
            if(komputer.equals(lista)){
                start = false;
            }
            else{
                komputer.clear();
            }
        }
        long time_end = System.currentTimeMillis();
        System.out.print("\nWylosowane = " + lista);
        System.out.print("\nTrafione przez komputer = " + komputer);
        System.out.print("\nIle razy kompture losowal = " + ile_razy);
        System.out.println("\nIle mu to zajelo = " + (time_end - time_start) + " ms ");

    }
}

