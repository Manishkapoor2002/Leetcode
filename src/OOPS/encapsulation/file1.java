package OOPS.encapsulation;

public class file1 {
    public static void main(String[] args) {
//        file1 f1 = new file1();
//        f1.printAge();

    }

    void printDefault(){
        System.out.println("Hello World!!");
    }

    public void printpublic(){
        System.out.println("this is a public function so it can be called from any file exist in same package");
    }

    protected void printprotected(){
        System.out.println("Your name is NAME");
    }

    private void printprivate(){
        System.out.println("YOur age is 21");
    }


}
