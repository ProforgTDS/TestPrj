/**
 * Created by Dima on 04.10.2016.
 */

class Box {
    int wigth;
    int higth;
}


public class Main {

    public static void main(String[] args) {

        Box mybox = new Box();
        Box mybox2;
        mybox.higth = 10;
        mybox.wigth = 15;
        mybox2 = mybox;
        mybox = null;
        System.out.println("Hello World!");
        System.out.print("size of box = " + mybox2.higth * mybox2.wigth);
    }

}
