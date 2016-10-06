/**
 * Created by Dima on 04.10.2016.
 */

class Box {
    private double wigth;
    private double higth;
    private double depth;

    Box(Box ob){
        wigth = ob.wigth;
        higth = ob.higth;
        depth = ob.depth;
    }

    Box (double w, double h, double d) {
        wigth = w;
        higth = h;
        depth = d;
    }

    Box(){
        wigth = -1;
        higth = -1;
        depth = -1;
    }

    Box(double len){
        wigth = higth = depth = len;
    }

    double Volume () {
        return wigth*higth*depth;
    }
}

class BoxWeight extends Box {
    double weight;

    BoxWeight(BoxWeight ob){
        super(ob);
        weight = ob.weight;
    }

    BoxWeight (double w, double h, double d, double m) {
        super(w,h,d);
        weight = m;
    }

    BoxWeight(){
        super();
        weight = -1;
    }

    BoxWeight(double len, double m){
        super(len);
        weight = m;
    }
}

class Sipment extends BoxWeight {
    double cost;

    Sipment(Sipment ob){
        super(ob);
        cost = ob.cost;
    }

    Sipment (double w, double h, double d, double m, double c) {
        super(w,h,d,m);
        cost = c;
    }

    Sipment(){
        super();
        cost = -1;
    }

    Sipment(double len, double m, double c){
        super(len, m);
        cost = c;
    }
}

class ColorBox extends Box {
    int color;

    ColorBox (double w,double h, double d, int c) {
        super(w,h,d);
        color = c;
    }
}

public class Main {

    public static void main(String[] args) {
        Sipment mySipment1 = new Sipment(10,20,15,10,3.41);
        Sipment mySipment2 = new Sipment(2,3,4,0.76,1.28);
        double vol;

        vol = myboxweight.Volume();
        System.out.println("Объем myboxweight = "+vol);
        System.out.println("Вес myboxweight = "+myboxweight.weight);
        vol = myplainbox.Volume();
        System.out.println("Объем myplainbox = "+vol);
    }

}
