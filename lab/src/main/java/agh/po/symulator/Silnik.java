package agh.po.symulator;

public class Silnik extends Komponent{
    int MaxObroty;
    int obroty;

    public Silnik(String producent, String model, int MaxObroty) {
        super(producent, model);
        this.MaxObroty = MaxObroty;
    }

    void uruchom(){
        obroty = 1000;
    }
    void zatrzymaj(){
        obroty = 0;
    }
}
