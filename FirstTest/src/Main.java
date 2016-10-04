/**
 * Created by Dima on 04.10.2016.
 */

class Box {
    int wigth;
    int higth;

    Box(int w,int h){
        this.wigth = w;
        this.higth = h;
    }
    double Volume () {
//        System.out.print("size of box =");
//        System.out.println(wigth*higth);
        return wigth*higth;
    }

}


public class Main {

    public static void main(String[] args) {

        Box mybox = new Box(10,15);
        Box mybox2 = new Box(12,10);
//        mybox.higth = 10;
//        mybox.wigth = 15;
//        mybox2.higth = 12;
//        mybox2.wigth = 10;
        System.out.println("Hello World!");
//        System.out.print("size of box = " + mybox2.higth * mybox2.wigth);
        System.out.print("size of box = " + mybox.Volume() + " and " + mybox2.Volume());
//        mybox.Volume();
//        mybox2.Volume();
    }

}
