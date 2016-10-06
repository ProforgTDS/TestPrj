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

class ColorBox extends Box {
    int color;

    ColorBox (double w,double h, double d, int c) {
        wigth = w;
        higth = h;
        depth = d;
        color = c;
    }
}

public class Main {

    public static void main(String[] args) {
        BoxWeight myboxweight = new BoxWeight(3,5,7,8.37);
        double vol;

        vol = myboxweight.Volume();
        System.out.println("Объем myboxweight = "+vol);
        System.out.println("Вес myboxweight = "+myboxweight.weight);
        myplainbox = myboxweight;
        vol = myplainbox.Volume();
        System.out.println("Объем myplainbox = "+vol);
    }

}
