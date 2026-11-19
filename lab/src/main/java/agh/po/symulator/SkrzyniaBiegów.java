package agh.po.symulator;

public class SkrzyniaBiegów extends Komponent{
    int aktualnyBieg;
    int iloscBiegow;

    public SkrzyniaBiegów(String producent, String model, int iloscBiegow) {
        super(producent, model);
        this.aktualnyBieg = 1;
        this.iloscBiegow = iloscBiegow;
    }
    void zwiekszBieg(){
        int up = aktualnyBieg + 1;
        if(up <= iloscBiegow)
            aktualnyBieg = up;
    }
    void zmniejszBieg(){
        int down = aktualnyBieg - 1;
        if(down >= 1)
            aktualnyBieg = down;
    }
    int getAktualnyBieg(){
        return aktualnyBieg;
    }
}
