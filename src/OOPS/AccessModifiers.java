package OOPS;

//Access Modifiers (Basics) ,Polymorphism(compile time),Constructor,this keyword, static keyword,

public class AccessModifiers {
    public static void main(String[] args) {
//        BankAccount icici = new BankAccount();
//        icici.user_name = "Manish kapoor";
//        icici.setPassword("q3212313saddf32crg33kje2k2jb2");
//            Person p1 = new Person();
//            p1.name = "Manish kapoor";
//            p1.eat();
//            p1.eat("Rajma");
//            p1.eat("Panner",3);
//        System.out.println(Person.count);
//        Person.print();

        Person p2 = new Person("Manish kapoor",21);
        System.out.println(p2.name + " " +p2.age);

        }
}


class BankAccount{
    String user_name;
    private String password;
    public void setPassword(String pwd){
        password = pwd;
    }

}

class Person{
    String name;
    int age;
    static int count = 0;
    public Person(){

        count++;
    }

//    Constructor Overloading: -
//    1 -
//    public Person(String newName,int newAge){
//        this();
//        name = newName;
//        age = newAge;
//    }
//    2: -
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    static void print(){

        System.out.println("Print using without any creating object in main function!!!!");

    }
    void eat(){
        System.out.println(name +" is eating food");
    }
    void eat(String foodName){
        System.out.println(name +" is eating " + foodName);
    }

    void eat(String foodName, int times){
        System.out.println(name + " is eating " +foodName +" " +times +" times in a day");
    }


}