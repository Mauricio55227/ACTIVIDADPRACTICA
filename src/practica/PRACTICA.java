/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import java.util.Scanner;

/**
 *
 * @author BLANQUET
 */
public class PRACTICA {

    public static int seleccion;
    public static String[][] aCodigo;
    static String[][] aPersonajes; 
    static String sexo;
    public static String[][] Preguntas;
    public static String[][] Incisos;
    public static int Contador;
    
    
      public static void Encabezado() {
        System.out.println("Universidad Autonóma de Campeche");
        System.out.println("Facultad de Ingeniería");
        System.out.println("Ingeniería de Sistemas Computacionales");
        System.out.println("Abril 2021");
    }
    
    public static void Cuerpo(){
        System.out.println("=========================================================");
        System.out.println("Seleccione una opcion para comenzar:");
        System.out.println("");
    }
    
    public static void Pie() {
        System.out.println("---------------------------------------------------------");
        System.out.println("EDC.2021");
    }

    public static String caracter(char car) {
        int numCa = (int) car;
        return aCodigo[numCa - 65][0] + " " + aCodigo[numCa - 65][1];
    }
    
    public static void bucle(String frase, char carFrase[]){
        for (int i = 0; i < frase.length(); i++) {
            if(String.valueOf(carFrase[i]).equals(" ")){
                System.out.println("");
            } else {
                System.out.println(caracter(carFrase[i]));
            }
        }
    }
    
    public static String Pago(String frase, char carFrase[]){
        int contador = 1;
        int precio = 0;
        for (int i = 0; i < frase.length(); i++) {
            if(String.valueOf(carFrase[i]).equals(" ")){
                contador++;
            }
        }
        if(contador <= 5){
            precio = 10;
        } else{
            precio = ((contador - 5) * 3) + 10;
        }
        return "Numero de palabras: " + contador + "\n" + "El total de su cuenta es $" + precio + " pesos";
    }
    
      public static void CodigoMorse (){    
    
        String sFrase;
        aCodigo = new String[26][2];
        aCodigo[0][0] = "A";
        aCodigo[1][0] = "B";
        aCodigo[2][0] = "C";
        aCodigo[3][0] = "D";
        aCodigo[4][0] = "E";
        aCodigo[5][0] = "F";
        aCodigo[6][0] = "G";
        aCodigo[7][0] = "H";
        aCodigo[8][0] = "I";
        aCodigo[9][0] = "J";
        aCodigo[10][0] = "K";
        aCodigo[11][0] = "L";
        aCodigo[12][0] = "M";
        aCodigo[13][0] = "N";
        aCodigo[14][0] = "O";
        aCodigo[15][0] = "P";
        aCodigo[16][0] = "Q";
        aCodigo[17][0] = "R";
        aCodigo[18][0] = "S";
        aCodigo[19][0] = "T";
        aCodigo[20][0] = "U";
        aCodigo[21][0] = "V";
        aCodigo[22][0] = "W";
        aCodigo[23][0] = "X";
        aCodigo[24][0] = "Y";
        aCodigo[25][0] = "Z";
        
        aCodigo[0][1] = ".-";
        aCodigo[1][1] = "-...";
        aCodigo[2][1] = "-.-.";
        aCodigo[3][1] = "-..";
        aCodigo[4][1] = ".";
        aCodigo[5][1] = "..-.";
        aCodigo[6][1] = "--.";
        aCodigo[7][1] = "...";
        aCodigo[8][1] = "..";
        aCodigo[9][1] = ".---";
        aCodigo[10][1] = "-.-";
        aCodigo[11][1] = ".-..";
        aCodigo[12][1] = "--";
        aCodigo[13][1] = "-.";
        aCodigo[14][1] = "---";
        aCodigo[15][1] = ".--.";
        aCodigo[16][1] = "--.-";
        aCodigo[17][1] = ".-.";
        aCodigo[18][1] = "...";
        aCodigo[19][1] = "-";
        aCodigo[20][1] = "..-";
        aCodigo[21][1] = "...-";
        aCodigo[22][1] = ".--";
        aCodigo[23][1] = "-..-";
        aCodigo[24][1] = "-.--";
        aCodigo[25][1] = "--..";
    }
      
    public static void PersonajesSWProceso(String genero){
        sexo = genero;
        for (int i = 0; i < aPersonajes.length; i++) {
            //si el personaje es igual al sexo introducido
            //imprimira los datos
            if(aPersonajes[i][2].equals(sexo)){
                System.out.println(aPersonajes[i][0]);
                System.out.println(aPersonajes[i][1]);
                System.out.println(aPersonajes[i][2]);
                System.out.println();
            }
        }
    }
    
    public static void PersonajesSW (){
        
            aPersonajes = new String[16][3];
            aPersonajes[0][0] = "Luke Skywalker";
            aPersonajes[0][1] = "172";
            aPersonajes[0][2] = "male";
            aPersonajes[1][0] = "R2-D2";
            aPersonajes[1][1] = "96";
            aPersonajes[1][2] = "n/a";
            aPersonajes[2][0] = "C-3PO";
            aPersonajes[2][1] = "167";
            aPersonajes[2][2] = "n/a";
            aPersonajes[3][0] = "Darth Vader";
            aPersonajes[3][1] = "202";
            aPersonajes[3][2] = "male";
            aPersonajes[4][0] = "Leia Organa";
            aPersonajes[4][1] = "150";
            aPersonajes[4][2] = "female";
            aPersonajes[5][0] = "Owen Lars";
            aPersonajes[5][1] = "178";
            aPersonajes[5][2] = "male";
            aPersonajes[6][0] = "Beru Whitesun lars";
            aPersonajes[6][1] = "165";
            aPersonajes[6][2] = "female";
            aPersonajes[7][0] = "R5-D4";
            aPersonajes[7][1] = "97";
            aPersonajes[7][2] = "n/a";
            aPersonajes[8][0] = "Biggs Darklighter";
            aPersonajes[8][1] = "183";
            aPersonajes[8][2] = "male";
            aPersonajes[9][0] = "Obi-Wan Kenobi";
            aPersonajes[9][1] = "182";
            aPersonajes[9][2] = "male";
            aPersonajes[10][0] = "Yoda";
            aPersonajes[10][1] = "66";
            aPersonajes[10][2] = "male";
            aPersonajes[11][0] = "Jek Tono Porkins";
            aPersonajes[11][1] = "180";
            aPersonajes[11][2] = "male";
            aPersonajes[12][0] = "Jabba Desilijic Tiure";
            aPersonajes[12][1] = "175";
            aPersonajes[12][2] = "hermaphrodite";
            aPersonajes[13][0] = "Han Solo";
            aPersonajes[13][1] = "180";
            aPersonajes[13][2] = "male";
            aPersonajes[14][0] = "Chewbacca";
            aPersonajes[14][1] = "228";
            aPersonajes[14][2] = "male";
            aPersonajes[15][0] = "Anakin Skywalker";
            aPersonajes[15][1] = "188";
            aPersonajes[15][2] = "male";
        
    }
    
    public static void While (){
    
    int suma = 0;
    int i = 0;
     
     while (i <= 10){
         
         suma+=i;
         i++;   
         
     }
     
     System.out.println(suma);
        PersonajesSW();
    }
    
   
     public static void QuestionsQuizz() {
        Preguntas = new String[10][2];
        Preguntas[0][0] = "¿Cuál es la sintaxis correcta para generar Hello World en Java?";
        Preguntas[0][1] = "0";
        Preguntas[1][0] = "¿Cómo se insertan comentarios de una línea en Java?";
        Preguntas[1][1] = "1";
        Preguntas[2][0] = "¿Qué tipo de datos se utiliza para crear una variable que almacene texto?";
        Preguntas[2][1] = "2";
        Preguntas[3][0] = "¿Cómo se crea una variable numérica que asigne el valor 5?";
        Preguntas[3][1] = "0";
        Preguntas[4][0] = "¿Qué operador se utiliza para comparar dos valores?";
        Preguntas[4][1] = "1";
        Preguntas[5][0] = "¿Para declarar un arreglo, la variable se define como tipo?";
        Preguntas[5][1] = "2";
        Preguntas[6][0] = "¿Qué instrucción se usa para crear una clase en Java?";
        Preguntas[6][1] = "0";
        Preguntas[7][0] = "¿Cuál es la sentencia correcta para crear un objeto llamado myObj de MyClass? ";
        Preguntas[7][1] = "1";
        Preguntas[8][0] = "¿Cuál es el operador que se utiliza para multiplicar números?";
        Preguntas[8][1] = "2";
        Preguntas[9][0] = "¿Cómo se inicia la sentencia if en Java?";
        Preguntas[9][1] = "0";
    }

    public static void AnswerQuizz() {
        Incisos = new String[10][3];
        Incisos[0][0] = "System.out.println( Hello World );";
        Incisos[0][1] = "echo( Hello World );";
        Incisos[0][2] = "print ( Hello World );";
        Incisos[1][0] = "/* This is a comment";
        Incisos[1][1] = "// This is a comment";
        Incisos[1][2] = "# This is a comment";
        Incisos[2][0] = "myString";
        Incisos[2][1] = "string";
        Incisos[2][2] = "String";
        Incisos[3][0] = "int x = 5;";
        Incisos[3][1] = "num x = 5";
        Incisos[3][2] = "x = 5;";
        Incisos[4][0] = "><";
        Incisos[4][1] = "==";
        Incisos[4][2] = "<>";
        Incisos[5][0] = "{}";
        Incisos[5][1] = "()";
        Incisos[5][2] = "[]";
        Incisos[6][0] = "class";
        Incisos[6][1] = "MyClass";
        Incisos[6][2] = "class()";
        Incisos[7][0] = "class MyClass = new myObj();";
        Incisos[7][1] = "MyClass myObj = new MyClass();";
        Incisos[7][2] = "new myObj = MyClass();";
        Incisos[8][0] = "%";
        Incisos[8][1] = "X";
        Incisos[8][2] = "*";
        Incisos[9][0] = "if (x > y)";
        Incisos[9][1] = "if x > y;";
        Incisos[9][2] = "if x > y then;";
    }

    public static void JAVAQuizzProceso(){
        String respuesta;
        Scanner entrada = new Scanner(System.in);
        
        //entrara un bucle de la longitud de la matriz
        for (int i = 0; i < Preguntas.length; i++) {
            //imprimira las preguntas con 3 posibles respuestas
            System.out.println();
            System.out.println("Pregunta " + (i + 1));
            System.out.println(Preguntas[i][0]);
            System.out.println("0.- " + Incisos[i][0]);
            System.out.println("1.- " + Incisos[i][1]);
            System.out.println("2.- " + Incisos[i][2]);
            System.out.println();
            System.out.print("Determina tu respuesta: ");
            respuesta = entrada.nextLine();
            //si la respuesta es correcta el contador aumentara
            if(Preguntas[i][1].equals(respuesta)){
                Contador++;
            }
        }
    }
    
    public static int Contador(){
        return Contador;
    }
    public static void Seleccion(int opcion){
        
        Scanner input = new Scanner(System.in);   
            switch (opcion) {
            case 1:
                System.out.println("PERSONAJES DE STAR WAR"); 
                System.out.println("Introduce un género");
                System.out.println("male, female, n/a, hermaphrodite");
                String genero = input.nextLine();
                
                PersonajesSW();
                
                PersonajesSWProceso(genero);
                break;
            case 2:
                While();
                break;
            case 3:
                System.out.println("CÓDIGO MORSE"); 
                System.out.println("Escriba una frase: ");
                String frase = input.nextLine().toUpperCase();
                char carFrase[] = frase.toCharArray();
                CodigoMorse();
                bucle(frase, carFrase);
                System.out.println(Pago(frase, carFrase));
                break;
            case 4:
                System.out.print("QUIZZ DE JAVA"); 
                QuestionsQuizz();
                AnswerQuizz();
                JAVAQuizzProceso();
                System.out.println();
                System.out.println("Obtuviste" + Contador + "0 de Calificacion");
                break;
            default:    
            System.out.println("Favor de escribir un número que este dentro de la lista:");   
                break;    
            }
        
    }
    public static void main(String[] args) {
        Encabezado();
        Cuerpo();
        Scanner sc = new Scanner(System.in);
        System.out.println("(1) Codigo Morse");
        System.out.println("(2) Personajes de Star Wars");
        System.out.println("(3) Quizz sobre Java");
        seleccion = sc.nextInt();
            Seleccion(seleccion);
         Pie();    
    }
    
}
