import java.util.Random;

public class App {
    public static void main(String[] args) {
        ComputeMethods compute = new ComputeMethods();

        double degreesF = 100.4;
        double celsius = compute.fToC (degreesF);
        System.out.println("A temperatura em Celsius é de: " + celsius);

        int a = 7;
        int b = 8;
        double hypotenuse = compute.hypotenuse(a, b);
        System.out.println("A hipotenusa do triangulo é de: " + hypotenuse);
        
       
        int rooll = compute.roll();
        System.out.println("A soma dos dados é de:  " +rooll );

    }
}

class ComputeMethods {
    public double fToC(double degreesF) {
        return (degreesF - 32) * 5 / 9;
    }

    public double hypotenuse(int a, int b) {
        return Math.sqrt(a * a + b * b);
    }

    public int roll() {
        return (int) (((Math.random() *6) + 1) + ((Math.random() *6)+ 1));
    }
}