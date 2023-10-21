package OOPS.encapsulation;

public class file2 {
    public static void main(String[] args) {
        ProtectedChildClass pcc1 = new ProtectedChildClass();
        pcc1.printpublic();
        pcc1.printDefault();
        pcc1.printprotected();


    }

}

class ProtectedChildClass extends file1{

}