/*
@Autor:
@Nohemi Solorzano 
@Luis Torres
@Versión: 1.0
@Fecha: 08/07/21
*/
import java.util.Scanner;

public class Banco{
   public static void main(String args[]){
   
   /*declaracion e Instanciciacion*/
   Scanner leer = new Scanner(System.in);
   Monedero mony = new Monedero(12000);
   double monto = 0;
   String opc;
   System.out.println("******************************************************");
   System.out.println("             MODULO DE TRANSACCIONES                   ");
   System.out.println("*******************************************************");
   System.out.print(" Escriba: <D>eposito   <R>etiro    <C>onsulta   <S>alir  ");
   opc = leer.next();
   
   /*Procesamiento y salida Datos*/
   while (!opc.equalsIgnoreCase( "S") ){/*instruccion paracontrolar el ciclo e ignorar mayuscula o minuscula*/

      switch(  opc.toUpperCase()){
      case "D":
               System.out.print(" Instroduzca Monto a Depositar:  ");
               monto = leer.nextDouble();
               mony.setDepositar(monto);
               break;
               
      case "R":
               System.out.print("Introduzca Monto a Retirar:  ");
               monto = leer.nextDouble();
               
               if (mony.getConsultar() - monto > 0 ){
                   mony.setRetirar(monto);
               }         
               else{
                    System.out.println(" Su Saldo es Insuficiente  ");
                   }
               break;
               
      case "C":
               System.out.println(" Su saldo es :  "   + mony.getConsultar());
              break;
                
   }//switch
      System.out.println("******************************************************");
      System.out.println("             MODULO DE TRANSACCIONES                   ");
      System.out.println("*******************************************************");
      System.out.print(" Escriba <D>eposito  <R>etiro <C>onsultar <S>alir  ");
      opc = leer.next();
}//while
}//main
}//class