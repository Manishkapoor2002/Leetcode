package OOPS;
//Inheritance, Run-time Polymorphism
public class Inheritance {
    public static void main(String[] args) {

        Child child1 = new Child("Shivam kumar",21);
        child1.printAge();
        child1.printName();
        child1.work();


    }
}

//Parent Class
class Parent{
    String name;
    int age;
    public Parent(int age,String name){
        this.age = age;
        this.name = name;
    }

    void work(){
        System.out.println(name + " is doing its work!!!");
    }
    void printAge(){
        System.out.println(age);
    }
    void printName(){
        System.out.println(name);
    }
}


//Child Class:

class Child extends Parent{

    public Child(String name, int age){
        super(age, name);
    }


//    Run-time polymorphism:-
    void work(){
        System.out.println("Developer "+ name + " is doing its work!!!");
    }
}