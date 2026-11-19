package agh.po.symulator;

public class Pozycja {
    double x;
    double y;
    public Pozycja(double x, double y){
        this.x = x;
        this.y = y;
    }
    void UpdatePosition(double X, double Y){
        x = X;
        y = Y;
    }
    String getPosition(){
        return "Pozycja samochodu to" + x + "  " + y;
    }

}
