/**
 * Created by Dima on 04.10.2016.
 */

class Box {
    double wigth;
    double higth;
    double depth;

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

    BoxWeight (double w,double h, double d, double m) {
        wigth = w;
        higth = h;
        depth = d;
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
        Box myplainbox new Box();
        double vol;

        vol = myboxweight.Volume();
        System.out.println("Объем myboxweight = "+vol);
        System.out.println("Вес myboxweight = "+myboxweight.weight);
        myplainbox = myboxweight;
        vol = myplainbox.Volume();
        System.out.println("Объем myplainbox = "+vol);
    }

}
