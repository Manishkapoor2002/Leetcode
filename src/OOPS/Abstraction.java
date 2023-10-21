package OOPS;

public class Abstraction {

    public static void main(String[] args) {
        BMW bmw1 = new BMW();
        bmw1.start();
        bmw1.price = 23456123;
        System.out.println(bmw1.price);

    }
}


class BMW extends Car{


    @Override
    void start() {
        System.out.println("BMW is started!!!!");
    }
}

abstract class Car{
    int price;

    abstract void start();

}