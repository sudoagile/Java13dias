import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        while (true) {
            System.out.println("**** Aplicacion Calculadora ****");
            System.out.println("""
                    1. Suma
                    2. Resta
                    3. Multipicación
                    4. División
                    5. Salir
                    """);
            System.out.println("Operación a realizar? ");
            try {
                var operacion = Integer.parseInt(consola.nextLine());
                //Revisar que este dentro de la opciones mencionadas

                if (operacion >= 1 && operacion <= 4) {

                    System.out.println("Proporciona valor operando1: ");

                    var operando1 = Integer.parseInt(consola.nextLine());
                    System.out.println("Proporciona valor operando2:");
                    var operando2 = Integer.parseInt(consola.nextLine());
                    int resultado;
                    switch (operacion) {
                        case 1 -> {
                            resultado = operando1 + operando2;
                            System.out.println("Resultado Suma: " + resultado);
                        }
                        case 2 -> {
                            resultado = operando1 - operando2;
                            System.out.println("Resultado Resta: " + resultado);
                        }
                        case 3 -> {
                            resultado = operando1 * operando2;
                            System.out.println("Resultado Multiplicación: " + resultado);
                        }
                        case 4 -> {
                            resultado = operando1 / operando2;
                            System.out.println("Resultado División: " + resultado);
                        }
                        default -> System.out.println("Opción erronea: " + operacion);

                    }
                } else if (operacion == 5) {
                    System.out.println("Hasta pronto...");
                    break;
                } else {
                    System.out.println("Opción erronea: " + operacion);
                }
                //Imprimimos un salto antes de repetir el ciclo
                System.out.println();
            } catch (Exception e){
                System.out.println("Ocurrio un error: " + e.getMessage() );
            } //Fin try
        }//Fin While}
    }//Fin Main
}//Fin clase