import java.util.Scanner;

public class Triangulo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese la longitud del primer lado del triángulo:");
        int lado1 = scan.nextInt();

        System.out.println("Ingrese la longitud del segundo lado del triángulo:");
        int lado2 = scan.nextInt();

        double area = calcularArea(lado1, lado2);
        System.out.println("El área del triángulo es: " + area);

        scan.close();
    }

    public static double calcularArea(int lado1, int lado2) {
        double area = 0.5 * lado1 * lado2;
        int i = 0;
        return area;
    }
}