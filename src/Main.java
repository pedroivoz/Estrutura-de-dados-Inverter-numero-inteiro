import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite para inverter ");
        int numero = sc.nextInt();
        sc.nextLine();
        int resultado = calcularInverter(numero);
        System.out.println(resultado);

        sc.close();
    }

    public static int calcularInverter(int numero) {
        if (numero < 10) {
            return numero;
        }
        int n1= numero %10;
        if (numero < 10) {
            return n1=numero;
        }
        System.out.print(n1);
        numero = (numero-numero%10)/10;

        return calcularInverter(numero);
    }
}