package agh.po.symulator;

public class Samochód {
    Silnik silnik;
    SkrzyniaBiegów skrzynia;
    Pozycja pozycja;
    void wlacz(){
        silnik.uruchom();
    }
    void wylacz(){
        silnik.zatrzymaj();
    }
    //public Samochód(Silnik silnik, SkrzyniaBiegów skrzynia, Pozycja pozycja){
      //  this.silnik  = silnik;
        //this.skrzynia = skrzynia;
        //this.pozycja = pozycja;

    //}

    public static void main(String[] args) {
        Samochód car = new Samochód();
        car.silnik = new Silnik("VW", "V8", 9000);
        car.skrzynia = new SkrzyniaBiegów("VW", "DSG", 7);
        car.pozycja = new Pozycja(2.5, 3.2);

    }


}
