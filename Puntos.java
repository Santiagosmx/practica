import java.util.Scanner;

public class Puntos {
    void punto1(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe un mensaje: ");
        String mensaje = scanner.nextLine();

        System.out.println("Escribe un segundo mensaje");
        String mensajeDos = scanner.nextLine();

        String mensajeUnido = mensaje + " " + mensajeDos;
        System.out.println(mensajeUnido);
    }
    void punto2(){
        System.out.print("Hola ");
        System.out.println("Santiago");
    }
    void punto3(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe un número: ");
        String valor = scanner.nextLine();
        int numero = Integer.valueOf(valor);

        System.out.println("El cuadrado del número es: " + (numero * numero));
    }
    void punto4(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe un número: ");
        String primero = scanner.nextLine();
        int numero = Integer.valueOf(primero);

        System.out.println("Escribe un segundo número: ");
        String segundo = scanner.nextLine();
        int numeroDos = Integer.valueOf(segundo);

        int suma = numero + numeroDos;
        System.out.printf("La suma de los números es: " + suma);
    }

    void punto5(){
        Scanner scanner = new Scanner (System.in);

        System.out.println("Escribe un número: ");
        String primero = scanner.nextLine();
        int numero = Integer.valueOf(primero);
        double numeroDecimal = Double.valueOf(primero);

        System.out.println("Escribe un segundo número: ");
        String segundo = scanner.nextLine();
        int numeroDos = Integer.valueOf(segundo);

        System.out.println("La suma de los números es: " + (numero + numeroDos));
        System.out.println("La resta de los números es: " + (numero - numeroDos));
        System.out.println("La multiplicación de los números es: " + (numero * numeroDos));
        double division = numeroDecimal / numeroDos;
        System.out.println("La división de los números es: " + (division));
        double residuo = numeroDecimal % numeroDos;
        System.out.println("El residuo de los números es: " + (numero % numeroDos));
    }

    void punto6(){
        Scanner scanner = new Scanner (System.in);

        System.out.println("Escribe un número: ");
        String primero = scanner.nextLine();
        double numero = Double.valueOf(primero);
        int contador = 0;

        while(numero % 1 != 0){
            numero = numero % 10;
            contador ++;
        }
    }

    void punto7(){
        Scanner scanner = new Scanner (System.in);

        System.out.println("Escribe un número: ");
        String primero = scanner.nextLine();
        double numero = Double.valueOf(primero);
        int contador = 0;

        while(numero % 1 != 0){
            numero = numero % 10;
            contador ++;
        }
    }
    double punto8(double primera, double segunda, double tercera, double cuarta, double quinta){

    }
}
