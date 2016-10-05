/**
 * Created by Dima on 04.10.2016.
 */
//Вычисляем факториал рекурсивным методом
class Faktorial {
    int step;
    Faktorial(){
        step = 0;
    }

    int fakt(int i) {
        int result;
        ++step;
        System.out.println("Текущий шаг: "+step);
        if (i==1) return 1;
        result = fakt(i-1)*i;
        return result;
    }

}

public class Main {

    public static void main(String[] args) {
        Faktorial ob1 = new Faktorial();
        System.out.println("Факториал числа 10 равен"+ob1.fakt(10));
    }

}
