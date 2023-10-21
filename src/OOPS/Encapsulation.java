package OOPS;

//Encapsulation ,Data hiding ,Data Protection,packages ,Access modifiers,Setters and Getters,Abstraction

import OOPS.encapsulation.file1;

public class Encapsulation {
    public static void main(String[] args) {

//        ChildEncapsulation ch1 = new ChildEncapsulation("Manish kapoor",21);
//        ch1.salary = 10000;
//        System.out.println(ch1.salary);

        laptop l1 = new laptop();
//        here we are setting the value to variable using setters:
        l1.setRam(8);
        l1.setPrice(50000);
        l1.setSsd(512);

//        here we are getting the value to variable using getters:
        l1.getPrice();
        l1.getRam();
        l1.getSsd();





    }
}

class ParentsEncapsulation{
    String name;
    int age;

    protected int salary;


    public ParentsEncapsulation(String name,int age){
        this.age = age;
        this.name = name;
    }
    void work(){
        System.out.println(name +" is doing its work!!!");
    }

}

class ChildEncapsulation extends ParentsEncapsulation{

    public ChildEncapsulation(String name, int age) {
        super(name, age);
    }

    void work(){
        System.out.println("Child " +name + " is doing its work!!!!");
    }
}

class laptop{
    int ram;
    int price;
    int ssd;


//    Setters:
    void setRam(int ram){
        this.ram = ram;
    }
    void setPrice(int price){
        this.price = price;
    }
    void setSsd(int ssd){
        this.ssd = ssd;
    }


//    Getters:

    void getRam(){
        System.out.println(ram);
    }
    void getPrice(){
        System.out.println(price);
    }
    void getSsd(){
        System.out.println(ssd);
    }
}



