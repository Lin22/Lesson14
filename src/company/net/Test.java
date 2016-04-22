package company.net;

/**
 * Created by flame on 22.04.2016.
 */
public class Test {
    int a, b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        if(a<20){
            System.out.println("Введено неверное значение");
        }else

        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
     if (b<20){
         System.out.println("Введено неверное значение");
     }else{

     }
        this.b = b;
    }
}
