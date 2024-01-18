import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("**** Aplicacion Calculadora ****");
        System.out.println("""
                1. Suma
                2. Resta
                3. Multipicación
                4. División
                5. Salir
                """);
        System.out.println("Operación a realizar? ");
        var operacion = Integer.parseInt(consola.nextLine());


        if(operacion >= 1 && operacion <= 4) {

            System.out.println("Proporciona valor operando1: ");

            var operando1 = Integer.parseInt(consola.nextLine());
            System.out.println("Proporciona valor operando2: 23");
            var operando2 = Integer.parseInt(consola.nextLine());
           // var resultado = operando1 + operando2;
           // System.out.println("Resultado: " + resultado);
        }
    }
}
