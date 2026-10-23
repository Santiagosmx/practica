import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       Puntos p = new Puntos();

       int opcion = 0;
       do {
           String menu = """
                   Taller Ejercicios
                   1.Concatenar dos textos
                   2.Imprimir Hola y nombre
                   3.Cuadrado de un número
                   4.Suma de dos números
                   5.Suma, resta, multiplicación, división y residuo de dos números
                   6.Parte entera y parte decimal
                   7.Calcular promedio
                   8.Calcular IVA
                   9.Área y perímetro de un círculo
                   10.Área de un hexágono
                   11.Promedio
                   12.Distancia
                   13.Número n, nn y nnn
                   14.Horas, minutos y segundos
                   15.Par o Impar
                   16.Positivo o negativo
                   17.Descuento
                   18.Nota final
                   19.Ecuación cuadrática
                   20.Usuario y contraseña
                   21.UNO, DOS, TRES
                   22.Cantidad de dígitos
                   23.Incrementando o disminuyendo
                   24.Días de la semana
                   25.Invertir texto
                   26.Primera palabra mayúscula
                   27.Penúltima palabra
                   28.El segundo contiene al primero
                   29.Palíndromo
                   30.Área de polígonos
                   31.10 primeros naturales
                   32.10 primeros impares
                   33.10 primeros pares
                   34.Entero positivo
                   35.Decimal a binario
                   36.Binario a decimal
                   37.Patrón del 1 al 19
                   38.Tríangulo arroba
                   39.Tríangulo invertido
                   40.Problema final
                   0.Salir del programa
                   """;


           System.out.println(menu);
           System.out.print("Elige una opción: ");
           opcion = scanner.nextInt();
           scanner.nextLine();

           switch (opcion){
               case 1:
                   p.punto1();
                   break;
               case 2:
                   p.punto2();
                   break;
               case 3:
                   p.punto3();
                   break;
               case 4:
                   p.punto4();
                   break;
               case 5:
                   p.punto5();
                   break;
               case 6:
                   p.punto6();
                   break;
               case 7:
                   System.out.println("Nota 1: ");
                   double nota1 = scanner.nextDouble();
                   System.out.println("Nota 2: ");
                   double nota2 = scanner.nextDouble();
                   System.out.println("Nota 3: ");
                   double nota3 = scanner.nextDouble();
                   System.out.println("Nota 4: ");
                   double nota4 = scanner.nextDouble();
                   System.out.println("Nota 5: ");
                   double nota5 = scanner.nextDouble();

                   double promedio = p.calcularPromedio(nota1,nota2,nota3,nota4,nota5);
                   System.out.printf("El promedio es: %.2f", promedio);
                   break;
               case 8:
                   System.out.println("¿Cuál es el precio?");
                   double precio = scanner.nextDouble();
                   double precioIVA = p.calcularIVA(precio);
                   System.out.printf("El precio con IVA es: %.2f ", precioIVA );
                   break;
               case 9:
                    p.punto9();
                    break;
               case 10:
                    p.punto10();
                    break;
               case 11:
                    p.promedio();
                    break;
               case 12:
                   System.out.print("Valor de x1: ");
                   double x1 = scanner.nextDouble();
                   System.out.print("Valor de y1: ");
                   double y1 = scanner.nextDouble();
                   System.out.print("Valor de x2: ");
                   double x2 = scanner.nextDouble();
                   System.out.print("Valor de y2: ");
                   double y2 = scanner.nextDouble();

                   p.distancia(x1, y1, x2, y2);
                   break;
               case 13:
                    p.punto13();
                    break;
               case 14:
                   String hora = p.punto14();
                   System.out.println(hora);
                   break;
               case 15:
                   p.parImpar();
                   break;
               case 16:
                   p.positivoNegativo();
                   break;
               case 17:
                   p.descuento();
                   break;
               case 18:
                   p.punto18();
                   break;
               case 19:
                   String solucion = p.punto19();
                   System.out.println(solucion);
                   break;
               case 20:
                   System.out.print("Usuario: ");
                   String usuario = scanner.nextLine();
                   System.out.print("Contrasena ");
                   String contrasena = scanner.nextLine();

                   p.punto20(usuario, contrasena);
                   break;
               case 21:
                    p.punto21();
                    break;
               case 22:
                   p.punto22();
                   break;
               case 23:
                    p.punto23();
                    break;
               case 24:
                    p.punto24();
                    break;
               case 25:
                   System.out.print("Introduzca el texto: ");
                   String texto = scanner.nextLine();
                   System.out.println(p.invertirTexto(texto));
                   break;
               case 26:
                   System.out.print("Introduzca el texto: ");
                   String textoOriginal = scanner.nextLine();
                   System.out.println(p.punto26(textoOriginal));
                   break;
               case 27:
                    p.punto27();
                    break;
               case 28:
                   p.punto28();
                   break;
               case 29:
                   System.out.print("Introduzca la palabra: ");
                   String palabra = scanner.nextLine();
                   System.out.println(p.esPalindromo(palabra));
                   break;
               case 30:
                   double area = p.punto30();
                   System.out.printf("El área de la figura es: %.2f ", area);
                   break;
               case 31:
                   p.punto31();
                   break;
               case 32:
                   p.punto32();
                   break;
               case 33:
                   p.punto33();
                   break;
               case 34:
                   p.punto34();
                   break;
               case 35:
                   p.punto35();
                   break;
               case 36:
                   p.punto36();
                   break;
               case 37:
                   p.punto37();
                   break;
               case 38:
                   p.punto38();
                   break;
               case 39:
                   p.punto39();
                   break;
               case 40:
                   p.punto40();
                   break;
               case 0:
                   break;
               default:
                   System.out.println("Valor no válido");
           }
           if (opcion != 0) {
               System.out.println("\nPresiona Enter para continuar...");
               scanner.nextLine();
           }
       }while(opcion != 0);

       scanner.close();
    }

}