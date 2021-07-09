/*
@Autor:
@Nohemi Solorzano 
@Luis Torres
@Versión: 1.0
@Fecha: 08/07/21
*/


import java.util.Scanner;

/*decaracion de atributos e instanciacion de objetos*/  
public class Usuario{
   public static void main (String args[]){
      Scanner leer = new Scanner(System.in);
      Area ar = new Area();
      int opc = 0;
      double radio, base, altura, largo, ancho, areCil;
      
      /*Procesamiento  y salida de datos*/
      System.out.println("******************************************************************************");
      System.out.println("                           MODULO DE GEOMETRIA                                ");
      System.out.println("******************************************************************************");
      System.out.print(" Tipee :  1.- Circulo   2.- Rectangulo  3.- Triangulo   4.- Cilindro  0.- Salir:");
      opc = leer.nextInt();
      while (opc != 0){
        switch (opc){
           case 1:System.out.print(" Radio del  Circulo :");
                    radio = leer.nextDouble();
                    System.out.println(" El Area del Circulo es:  "+ ar.area(radio));
                    break;
           case 2:System.out.print(" Largo del  Rectangulo :");
                    largo = leer.nextDouble();
                    System.out.print(" ancho del Rectangulo es:  ");
                    ancho = leer.nextDouble();
                    System.out.println(" El Area del Rectangulo es:  "+ ar.area(largo, ancho));
                    break;
           case 3:System.out.print(" Base del  Triangulo :");
                    base = leer.nextDouble();
                    System.out.print(" altura del triangulo :  ");
                    altura = leer.nextDouble();
                    System.out.println(" El Area del Triangulo es:  "+ ar.area(0.5,base, altura));
                    break;
           case 4: System.out.print(" Radio del  Cilindro :");
                     radio = leer.nextDouble();
                     System.out.print(" altura del circulo:  ");
                     altura = leer.nextDouble();               
                     System.out.println(" El Area del Cilindro es:  "+ ar.area(3.14, radio, radio, altura));
                    break;
                    
                  
        }//fin del switch
        System.out.print("Tipee   1.- Circulo  2.- Rectangulo 3.- Triangulo  4.- Cilindro  0.- Salir:");
        opc = leer.nextInt();

      }//fin While
   }// fin main
}// fin de class