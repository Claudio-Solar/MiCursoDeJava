/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.javaesencial;

/**
 *
 * @author victo
 */
public class JavaEsencial {

    public static void main(String[] args) {
       /*1.-Sintaxis de Java*/
       System.out.println("1.- Sintaxis de Java");
       System.out.println("Sintaxis de Java");
       System.out.println("=====================");
       /* 2. Salida de Datos*/
       System.out.println(5+5);
       /* 2. Salida de Datos*/
       System.out.println("2.- Sintaxis de Java");
        //System.out.println(5+5);
        //System.out.print(5+5);
       System.out.println("=====================");
      
       //3. Comentarios
       //Comentarios de una sola linea
       /*Comentarios
       de varias 
       Lineas
       */
       
       //4. Tipos de Datos
       
       /*
       String: Almacena texto como "Hola"
       int: Almcena números enteros, sin decimales: 20
       float: Almacena número de coma flotante como por ejemplo19.99
       char: Almacena caracteres individuales como 'a','b', etc
       boolean: Almacena valores con dos estados: verdadero o falso(True, False)
       */
        System.out.println("4. Tipos de datos y variables");
       String miNombre = "Claudio";
       System.out.println(miNombre);
       System.out.println("=====================");
       
     
      int  miNumero = 19;
       System.out.println(miNumero);
       System.out.println("=====================");
       
       float  miNumeroFloat = 5.99f;
       System.out.println(miNumeroFloat);
       System.out.println("=====================");
       
       char  miCaracter = 'A';
       System.out.println(miCaracter);
       System.out.println("=====================");
       
       boolean miBooeanoVeradero = true;
       boolean miBooeanoFalso = false;
       System.out.println(miBooeanoVeradero);
       System.out.println(miBooeanoFalso);
       System.out.println("=====================");
       
         final int  miNumeroFinal = 20;
        //miNumeroFinal = 25;
       System.out.println(miNumeroFinal);
       System.out.println("=====================");
       
       //Se puede asignar el valor de la variable luego de la creación
       String nombre4;
       nombre4= "Claudio";
       
       //4.1 Impresión de Variables
       
       //Combinar un texto con una variable
       
       String miNombre41="Claudio";
       System.out.println("Hola: "+miNombre41);
       
         //Combinar un texto con dos variables
       String miNombre42="Claudio";
       String miApellido="Solar";
       System.out.println("Hola: "+miNombre42+" "+miApellido);
       
       //Combinar un texto con dos variables
       String miNombre43="Claudio";
       String miApellido2="Solar";
       System.out.println("Hola: "+miNombre42+" "+miApellido);
       
       //Realizar una operacion matematica al momento de mostrar
       int miNumero1=8;
       int miNumero2=14;
       System.out.println(miNumero1+miNumero2);
       
       //Asignar las variables en una sola line
       /*int miNumero41;
       int mi numero42;*/
       int miNumero41=10, miNumero42=14;
        System.out.println(miNumero41+miNumero42);
        
       //Asignar el mismo valor a varias variables
        int numeroMismoX, numeroMismoY, numeroMismoZ;
        numeroMismoX=numeroMismoY=numeroMismoZ=50;
        System.out.println(numeroMismoX+numeroMismoY+numeroMismoZ);
        //4.3 Identificadores
        //Las variables deben identificarse con combres correctos
        
        /* Forma no recomendad
        String n="Claudio";
        */
        //Forma recomendada, utiliza nombres de variables que describan su contenido
        String nombreAlumno = "Claudio";
        System.out.println(nombreAlumno);
        
        //Tipo de Datos numéricos
        //Almacena números entre -128 a 127
        byte miByet=100;
         System.out.println(miByet);
         
         //Almacena números entre -32768 a 32767
          short miShort=1500;
         System.out.println(miShort);
         
         //Almacena número entero
          int miEntero=15;
         System.out.println(miEntero);
         
           //Almacena número decimal fracionario desde -3.4e-038 hasta 3.4e-038
          float miFlotante=15.0f;
         System.out.println(miFlotante);
         
         //Almacena número decimal fracionario desde -1.7e-038 hasta -1.7e-0.8
          double miDouble=15.0d;
         System.out.println(miDouble);
         
         //Valores Cientificos
         float miFlotanteCientifico=12e2f;
          double miDoubleCientifico=7e4d;
         
          System.out.println(miFlotanteCientifico);
          System.out.println(miDoubleCientifico);
         
          //Tipos de Datos Booleanos
          boolean meGustajava =true;
          boolean estoyCansado=false;
          System.out.println(meGustajava);
          System.out.println(estoyCansado);
          
          //Operadores
          
          int operador1=10;
          int operador2=2;
          
          int suma;
          int resta;
          int multiplicacion;
          int division;
          int modulo;
          int incremento;
          int decremento;
          
          suma=operador1+operador2;
          resta=operador1-operador2;
          multiplicacion=operador1*operador2;
          division=operador1/operador2;
          modulo=operador1%operador2;
          incremento=operador1+1;
          decremento=operador2-1;
          //Operador ++ incremento en 1
          //++=+1
          //Operador ++ decremento en 1
          //--=-1
          System.out.println(suma);
          System.out.println(resta);
          System.out.println(multiplicacion);
          System.out.println(division);
          System.out.println(modulo);
          System.out.println(incremento);
          System.out.println(decremento);
          
          
          //Principales metodos de cadena de texto
          //Mayusculas
          
          String mayuscula ="mayusculas";
          System.out.println(mayuscula.toUpperCase());
          //Mayusculas
          
          String minuscula ="MINUSCULA";
          System.out.println(minuscula.toLowerCase());
          
          //Encontrar un caracter o varios en una cadena de texto
          String cadenaCompleto= "Buscame si quieres";
          System.out.println(cadenaCompleto.indexOf("quieres"));
          
          //Concatenación con un método
          
          String nombreConcat="Claudio";
          String espacio=" ";
          String apellidoConcat="Valencia";
          System.out.println(nombreConcat+espacio+apellidoConcat);
           System.out.println(nombreConcat.concat(espacio).concat(apellidoConcat));
           
           //Caracteres especiales
           
           //Mostrar comillas dobles 
           
           String cadenaComillas = "Aqui mostraremos las \"comillas dobles\"sin problemas";
          System.out.println(cadenaComillas);
          
          //Mostrar comillas simples
           
           String cadenaComillasSimples = "Aqui mostraremos las \"comillas simples\"sin problemas";
          System.out.println(cadenaComillasSimples);
          
          //Secuencias Extas
          //Salto de linea
          
          String cadenaExtra1="Hola";
          String cadenaExtra2="java";
          System.out.println(cadenaExtra1+cadenaExtra2);
          
          //Regreso al incio
          String cadenaExtra3="Hola\rJava";
          System.out.println(cadenaExtra3);
          
          //Espaciado Tab
          String cadenaExtra4="Hola\tJava";
          System.out.println(cadenaExtra4);
          
           //Instruccion Regreso de un espacio
          String cadenaExtra5="HolaJava\b";
          System.out.println(cadenaExtra5);
          
          //Instruccion avance de un espacio
          String cadenaExtra6="HolaJ\fava";
          System.out.println(cadenaExtra6);
          
          //Principales funciones Matematicas
          
          //Valor máximo
          System.out.println(Math.max(5, 10));
           System.out.println(Math.min(5, 10));
           
           //Raiz cuadrada
           
           System.out.println(Math.sqrt(36));
           
           //Valor absoluto
           
             System.out.println(Math.abs(-5.2));
             
           // Numeros aleatorios
           
           System.out.println(Math.random());
           
           // Numeros aleatorios entre intervalos
           
           int numeroAleatorio = (int)(Math.random()*1000);
           System.out.println(numeroAleatorio);
           
           //Expresiones Booleanas
           
           //VERDAERO 
           int valorComparacion1=20;
           int valorComparacion2=19;
           
           System.out.println(valorComparacion1>valorComparacion2);
           
           System.out.println(valorComparacion1<valorComparacion2);
           
           System.out.println(valorComparacion1==valorComparacion2);
           
           //FASLO
           
           
           
          
          
          
          
          
    }
          
         
         
         
         
        
        
        
       
       
       
      
       
    }
}
