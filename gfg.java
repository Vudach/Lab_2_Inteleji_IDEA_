
import java.util.Scanner;
public class gfg {  
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите значение x: ");
    double x = scanner.nextDouble();
    System.out.print("Введите точность: ");
    double n = scanner.nextDouble();
    double result = 0.0;
   // double term = 1.0;
    double i = 0;
    while (i < n)
     {
        result += Math.pow(-1, i) * Math.pow(x, i) / factorial(i);
        //result += term;
        i++;
    }
    System.out.printf("Значение e^(-%.4f) с точностью %.4f: %.8f\n", x, n, result);
}
public static double factorial(double n) {
    double r=1;
    for (int i =1; i<= n; i++){
        r=r*i;
    }
    return r;
}
}