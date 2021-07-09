/*
@Autor:
@Nohemi Solorzano 
@Luis Torres
@Versión: 1.0
@Fecha: 08/07/21
*/


/*creacion de los metodos estaticos sobrecargados*/
public class Area{
 
   public static double area(double radio){
      double circulo;
      circulo = 3.14 * radio * radio;
      return circulo;
   }
      public static double area(double base, double altura){
      double rectangulo;
      rectangulo  = base * altura;
      return rectangulo;
   }
   
   public static double area( double pi,  double radio1 , double radio2 ,  double altura){
      double cilindro;
      cilindro  = pi * radio1 *radio2 * altura;
      return cilindro;
   }
   
   public static double area( double medio,  double base,  double altura){
      double triangulo;
      triangulo  = medio * base * altura;
      return triangulo;
   }

}//fin class