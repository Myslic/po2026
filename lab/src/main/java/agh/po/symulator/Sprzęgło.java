package agh.po.symulator;

public class Sprzęgło extends Komponent{
    boolean stanSprzegla;

    public Sprzęgło(String producent, String model) {
        super(producent, model);
    }

    void wcisnij(){
        stanSprzegla = true;
    }
    void zwolnij(){
        stanSprzegla = false;
    }

}
