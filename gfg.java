
import java.util.Scanner;
public class gfg {  
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите значение x: ");
    double x = scanner.nextDouble();
    System.out.print("Введите точность (например, 0.0001): ");
    double epsilon = scanner.nextDouble();
    double result = 0.0;
    double term = 1.0;
    int n = 0;
    while (Math.abs(term) > epsilon) {
        term = Math.pow(-1, n) * Math.pow(x, n) / factorial(n);
        result += term;
        n++;
    }
    System.out.printf("Значение e^(-%.4f) с точностью %.4f: %.8f\n", x, epsilon, result);
}
public static long factorial(int n) {
    long fact = 1;
    for (int i = 2; i <= n; i++) {
        fact *= i;
    }
    return fact;
}
}
