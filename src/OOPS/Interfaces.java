package OOPS;

public class Interfaces {
    public static void main(String[] args) {

        Men m1 = new Men();
        Women w1 = new Women();
        m1.living();
        w1.living();

    }
}

interface Human{
    void living();
}

class Men implements Human{
    @Override
    public void living(){
        System.out.println("Men's are living!!");
    }
}

class Women implements Human{
    @Override
    public void living() {
        System.out.println("Women's are living!!");
    }
}