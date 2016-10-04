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
        mybox.higth = 10;
        mybox.wigth = 15;
        System.out.println("Hello World!");
        System.out.print("size of box = " + mybox.higth * mybox.wigth);
    }

}
