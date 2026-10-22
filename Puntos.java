import java.util.Scanner;
import java.util.Stack;

public class Puntos {
    Scanner scanner = new Scanner(System.in);
    void punto1() {
        System.out.println("Escribe un mensaje: ");
        String mensaje = scanner.nextLine();

        System.out.println("Escribe un segundo mensaje: ");
        String mensajeDos = scanner.nextLine();

        String mensajeUnido = mensaje + " " + mensajeDos;
        System.out.println(mensajeUnido);
    }

    void punto2() {
        System.out.print("Hola");
        System.out.print("Santiago");
    }

    void punto3() {
        System.out.print("Escribe un número: ");
        double numero = scanner.nextDouble();

        System.out.println("El cuadrado del número es: " + (numero * numero));
    }

    void punto4() {
        System.out.print("Escribe un número: ");
        double numero = scanner.nextDouble();

        System.out.print("Escribe un segundo número: ");
        double numeroDos = scanner.nextDouble();

        double suma = numero + numeroDos;
        System.out.printf("La suma de los números es: %f ", suma );
    }

    void punto5() {
        System.out.print("Escribe un número: ");
        double numero = scanner.nextDouble();

        System.out.print("Escribe un segundo número: ");
        double numeroDos = scanner.nextDouble();

        System.out.println("La suma de los números es: " + (numero + numeroDos));
        System.out.println("La resta de los números es: " + (numero - numeroDos));
        System.out.println("La multiplicación de los números es: " + (numero * numeroDos));
        if ( numeroDos != 0){
            System.out.println("La división de los números es: " + (numero / numeroDos));
            System.out.println("El residuo de los números es: " + (numero % numeroDos));
        }
        else {
            System.out.println("La división no esta definida\nEl residuo de los números no esta definido");
        }
    }

    void punto6() {
        System.out.print("Escribe un número: ");
        double numero = scanner.nextDouble();

        int parteEntera = (int) numero;
        double parteDecimal = numero - parteEntera;

        System.out.println("La parte entera es: " + parteEntera);
        System.out.println("La parte decimal es: " + parteDecimal);
    }

    double calcularPromedio(double primera, double segunda, double tercera, double cuarta, double quinta) {
        primera = primera * (15.0 / 100);
        segunda = segunda * (20.0 / 100);
        tercera = tercera * (15.0 / 100);
        cuarta = cuarta * (30.0 / 100);
        quinta = quinta * (20.0 / 100);

        return (primera + segunda + tercera + cuarta + quinta);
    }

    double calcularIVA(double precio) {
        System.out.println("El precio original es: " + precio);
        double valorIVA = precio * (19.0 / 100);
        System.out.println("El IVA es: " + valorIVA);
        return precio + valorIVA;
    }

    void punto9() {
        double radio = 0;
        do {
            System.out.print("¿Cuál es el valor del radio? ");
            radio = scanner.nextDouble();
        }while (radio < 0);

        double perimetro = 2 *  Math.PI * radio;
        double area = Math.PI * radio * radio;

        System.out.println("El perimetro es: " + perimetro + "\nEl área es: " + area);
    }

    void punto10() {
        double lado = 0;
        do {
            System.out.println("¿Cuál es el valor del lado?");
            lado = scanner.nextDouble();
        }while (lado < 0);

        double area = ((3 * Math.sqrt(3)) / 2 * lado * lado);

        System.out.printf("El área del hexágono regular es %.2f", area);
    }

    void promedio() {
        int cantidad;

        do {
            System.out.println("¿A qué cantidad de números deseas calcularles el promedio?");
            cantidad = scanner.nextInt();
        } while(cantidad <= 0);

        double suma = 0;
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Introduce el número: ");
            double numero = scanner.nextDouble();
            suma = suma + numero;
        }

        double promedio = (suma) / cantidad;
        System.out.println("El promedio de los números es: " + promedio);
    }

    void distancia(double x1, double y1, double x2, double y2) {

        double distanciaHorizontal = x2 - x1;
        double distanciaVertical = y2 - y1;

        double distancia = Math.sqrt((Math.pow(distanciaHorizontal, 2))+ (Math.pow(distanciaVertical, 2)));

        System.out.println("La distancia es: " + distancia);
    }

    void punto13() {
        int numero = 0;
        int primero = 0;
        int segundo = 0;

        do {
            System.out.print("Escribe un digito n, este será escrito como n, nn y nnn: ");
            numero = scanner.nextInt();
        }while(numero < 0 || numero > 9);

            primero = numero * 11;
            segundo = numero * 111;


        System.out.println("El número n es: " + numero);
        System.out.println("El número nn es: " + primero);
        System.out.println("El número nnn es: " + segundo);
        System.out.println("La suma de los números es: " + (numero + primero + segundo));
    }

    String punto14() {
        System.out.print("Escribe una cantidad de segundos que se convertirán a minutos y horas: ");
        int totalSegundos = scanner.nextInt();
        int horas = totalSegundos / 3600;
        int minutos = (totalSegundos % 3600) / 60;
        int segundos = totalSegundos % 60;

        return String.format("%d:%d:%d", horas, minutos, segundos);
    }

    void parImpar() {
        System.out.println("Escribe un número para determinar si es par o impar.");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
    }

    void positivoNegativo() {
        System.out.println("Escribe un número para determinar si es positivo o negativo");
        int num = scanner.nextInt();

        if (num > 0) {
            System.out.println("El número es positivo");
        } else if (num < 0){
            System.out.println("El número es negativo");
        } else{
            System.out.println("El número no es positivo ni negativo");
        }
    }

    double descuento(double precio) {
        double precioIVA = calcularIVA(precio);
        double iva = precio * 0.19;
        if (iva > 150000){
            precioIVA = precioIVA - (precioIVA * 5/100);
        }
        return precioIVA;
    }

    void punto18() {
        double[] notas = new double[5];
        for (int i = 1; i <= 5; i++) {
            System.out.printf("Nota: %d", i);
            double nota = scanner.nextDouble();
            notas[i - 1] = nota;
        }
        double promedio = calcularPromedio(notas[0], notas[1], notas[2], notas[3], notas[4]);
        if (promedio > 4.5) {
            System.out.println("Felicitaciones");
        } else if (promedio >= 3) {
            System.out.println("Aprobaste");
        } else if (promedio >= 2) {
            System.out.println("Reprobaste");
        } else {
            System.out.println("No se puede habilitar");
        }
    }

    String punto19(double a, double b, double c) {
        if(a == 0){
            return "Valor de a inválido";
        }
        double determinante = ((Math.pow(b, 2)) - (4 * a * c));
        double solucion = -b / (2 * a);
        if (determinante < 0) {
            return "No hay solucion en los reales";
        } else if (determinante == 0) {
            return String.format("La solución es %.2f", solucion);
        } else {
            double primera = solucion + (Math.sqrt(determinante)) / (2 * a);
            double segunda = solucion - (Math.sqrt(determinante)) / (2 * a);
            return String.format("La primera solución es %.2f, y la segunda es %.2f", primera, segunda);
        }
    }

    void punto20(String usuario, String contrasena) {
        String usuarioDefinido = "Carlos";
        String contrasenaDefinida = "1234";

        if (!usuario.equals(usuarioDefinido) && !contrasena.equals(contrasenaDefinida)) {
            System.out.println("Usuario y contraseña incorrectas");
        } else if (!usuario.equals(usuarioDefinido)) {
            System.out.println("Usuario incorrecto");
        } else if (!contrasena.equals(contrasenaDefinida)) {
            System.out.println("Contraseña incorrecta");
        } else {
            System.out.println("Usuario y contraseña correctas");
        }

    }

    String punto21(int numero) {
        String[] numeros = {"Cero", "Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Diez"};
        if (numero >= 0 && numero<= 10){
            return numeros[numero];
        }else{
            return "Número no válido";
        }
    }

    int punto22(int numero) {
        if (numero == 0){
            return 1;
        }
        int digitos = 0;
        while (numero != 0) {
            numero = numero / 10;
            digitos++;
        }
        return digitos;
    }

    void punto23(int a, int b, int c) {
        if (a < b && b < c) {
            System.out.println("Los números están incrementándose");
        } else if (a > b && b > c) {
            System.out.println("Los números están disminuyendo");
        } else {
            System.out.println("Los números ni se incrementan ni disminuyen");
        }
    }

    String punto24(int dia) {
        String[] semana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        if (dia >= 1 && dia <= 7) {
            return semana[dia - 1];
        }
        return "Número inválido";
    }

    String invertirTexto(String texto) {
        int size = texto.length();
        String nuevoTexto = "";
        for (int j = 0; j < size; j++) {
            nuevoTexto = nuevoTexto + texto.charAt(size -j - 1);
        }
        return nuevoTexto;
    }

    String punto26(String texto) {
        if(texto.isEmpty()){
            return texto;
        }

        int size = texto.length();
        char letraMayuscula = Character.toUpperCase(texto.charAt(0));
        texto = letraMayuscula + texto.substring(1);

        for (int i = 1; i < size; i++) {
            char caracterActual = texto.charAt(i);
            if (caracterActual == ' ' && i + 1 < size) {
                caracterActual = Character.toUpperCase(texto.charAt(i + 1));
                texto = texto.substring(0, i + 1) + caracterActual + texto.substring(i + 2, size);
            }
        }
        return texto;
    }

    String punto27(String texto) {
       String[] palabras = texto.split("\\s+");
       int size = palabras.length;
       if(palabras.length >= 2){
           return palabras[size - 2];
       }
       return "El texto no tiene suficientes palabras";
    }

    void punto28(String texto1,String texto2){
        if (texto2.contains(texto1)){
            System.out.println("El segundo texto contiene al primero");
        }
        else{
            System.out.println("El segundo texto no contiene al primero");
        }
    }

    boolean esPalindromo(String palabra){
        String palabraDos = invertirTexto(palabra);
        return palabra.equals(palabraDos);
    }

    double punto30(){

        System.out.println("1.Triángulo equilatero \n 2.Cuadrado \n 3.Pentágono regular \n 4.Hexágono regular \n 5.Octágono regular \n");
        int eleccion = scanner.nextInt();
        double area;
        double lado = 0;
        double apotema = 0;
        switch (eleccion){
            case 1:
                lado = obtenerLado();

                area = (Math.sqrt(3) / 4) * lado * lado;
                return area;
            case 2:
                lado = obtenerLado();

                area = lado * lado;
                return area;
            case 3:
                lado = obtenerLado();
                do {
                    System.out.println("Introduce el valor de la apotema");
                    apotema = scanner.nextDouble();
                }while (apotema < 0);

                area = (5*lado*apotema) / 2;

                return area;

            case 4:
                lado = obtenerLado();

                area = (3*Math.sqrt(3) * lado * lado) / 2;

                return area;

            case 5:
                lado = obtenerLado();

                area = 2 * ( 1 + Math.sqrt(2)) * lado * lado;

                return area;

            default:
                System.out.println("valor no válido");
                return -1;
        }
    }
    double obtenerLado(){
        double lado = 0;
        do {
            System.out.println("Introduce el valor del lado");
            lado = scanner.nextDouble();
        }while (lado < 0);
        return lado;
    }

    void punto31(){
        for (int i = 1; i <= 10 ; i++) {
            System.out.println( i);
        }
    }
    void punto32(){
        for (int i = 1; i <= 20; i += 2) {
                System.out.println(i);
        }
    }
    void punto33(){
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }
    }
    void punto34(){
        int numero = 0;
        do {
            System.out.print("Introduce un número entero positivo: ");
            numero = scanner.nextInt();

        }while(numero <= 0);
        System.out.println("El número es: " + numero);
    }

    void punto35(){
        Stack<Integer> pila = new Stack<>();
        System.out.print("Escribe un número decimal que se convertirá a binario: ");
        int numero = scanner.nextInt();
        int residuo = 0;

        do {
            residuo = numero % 2;
            numero = numero / 2;
            pila.push(residuo);
        }while(numero != 0);

        while(!pila.isEmpty()){
            System.out.print(pila.pop());
        }
    }

    void punto36(){
        int numero = 0;
        do {
            System.out.print("Escribe un número binario que se convertirá a decimal: ");
            numero = scanner.nextInt();
        }while (numero < 0);

        int decimal = 0;
        int residuo = 0;
        boolean correcto = true;
        int i = 0;
        while(numero > 0){
            residuo = numero % 10;
            if(residuo == 1){
                decimal = (int) (decimal + (Math.pow(2, i)));
            }if (residuo != 0 && residuo != 1){
                correcto = false;
                break;
            }
            i++;
            numero = numero / 10;
        }
        if (correcto){
            System.out.println(decimal);
        }else {
            System.out.println("Valor numérico no válido");
        }
    }

    void punto37(){
        for (int i = 0; i < 10 ; i++) {
            for (int j = 1; j <= i + 1; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }

    void punto38() {
        System.out.print("¿Cuál es el número de filas? ");
        int filas = scanner.nextInt();

        for (int i = 0; i < filas; i++) {
            for (int j = 1; j <= i + 1; j++) {
                System.out.print("@");
            }
            System.out.println("");
        }
    }

    void punto39(){
        System.out.print("¿Cuál es el número de filas? ");
        int filas = scanner.nextInt();

        for (int i = 0; i < filas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < filas - i ; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void punto40 (){

        int peso = 0;
        int carga = 0;
        int maximo = 0;
        int minimo = 0;
        int cantidad = 0;
        int cantidadReal = 0;
        double promedio = 0;
        double precio = 0;
        boolean correcto = true;

        do{
            System.out.print("¿Cuántos bultos se van a ingresar? ");
            cantidad = scanner.nextInt();
        }while (cantidad <= 0);


        for (int i = 0; i < cantidad; i++) {
            do{
                System.out.printf("¿Cuánto pesa el bulto número %d? ", i + 1);
                peso = scanner.nextInt();
                if (peso > 500 || peso <= 0){
                    System.out.println("Valor de peso no válido Intente de nuevo");
                }else if((carga + peso) > 18000){
                    System.out.println("Se superó la carga");
                    correcto = false;
                }
            }while(peso > 500 || peso <= 0 || (carga + peso) > 18000);

            if (!correcto){
                break;
            }
            cantidadReal++;
            carga = carga + peso;

            if( i == 0){
                minimo = peso;
            }

            if (peso > maximo) {
                maximo = peso;
            }

            if (peso < minimo){
                minimo = peso;
            }

            if (peso >= 301){
                precio = precio + (peso * 2500);
            }else if (peso >= 26){
                precio = precio + (peso * 1500);
            }
        }
        if(cantidadReal > 0){
            promedio = (double) carga / cantidadReal;
        }
        double dolares = precio * 0.00032;

        System.out.printf("\na.Número total de bultos ingresados para el vuelo: %d\nb. Peso del bulto más pesado y del más liviano: %d, %d\nc. Peso promedio de los bultos: %.2f\nd. Ingreso en pesos y en dólares por concepto de carga: %.2f, %.2f\n", cantidadReal, maximo, minimo, promedio, precio, dolares);
    }
}
