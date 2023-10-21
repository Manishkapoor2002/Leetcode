package OOPS;
public class ClassNobjects {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTipSize(7);
        System.out.println(p1.tipSize);
        System.out.println(p1.checkThikness());
        p1.setTipSize(-1);
        System.out.println(p1.checkThikness());
    }
}

class Pen{
    String color;
    int tipSize;
    void setColor(String setColor){
        color = setColor;
    }
    void setTipSize(int size){
        tipSize = size;
    }

    String checkThikness(){
        String ret = "";
        if (tipSize>7 && tipSize<=10){
            ret =  "Your Pen is Thicker";
        } else if (tipSize>4 && tipSize<=7) {
            ret = "Your Pen have Perfect Thickness"  ;
        }else if(tipSize>=1 && tipSize<=4){
            ret = "Your pen is not thicker";
        }else if (tipSize<1 || tipSize>10){
            ret = "Set tipSize Correctly (Between 1 to 10)";
        }
        return ret;
    }
}