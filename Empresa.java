/*
@Autor:
@Nohemi Solorzano 
@Luis Torres
@Versión: 1.0
@Fecha: 08/07/21
*/

import java.util.ArrayList;
import java.util.Scanner;

/*Declaracion de atributos e instanciacion de objetos*/ 
public class Empresa {
    
    //@SuppressWarnings("empty-statement")
    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in); 
       
       ArrayList<Employed> listEmployed = new ArrayList<>();/*creacion del ArrayLis*/
       String nombre;
       String apellido ="";
       String dni ="";
       int numHij =0;
       int numHor =0;
       int tipEmp =0;
       int antiguedad =0;
       String fecIng ="";
       String fecEgr ="";
       double sueldo =0;
       int opc ;
       
          /*procesamiento de los datos*/ 
          do {
             System.out.println("***************************************************************************");
             System.out.println("                   MODULO DE TRABAJADORES                                  ");
             System.out.println("***************************************************************************");
             System.out.println(" Tipee 1.-Incluir  2.-Eliminar  3.-Consultar  4.-Salir");
             opc = leer.nextInt();
             switch(opc){
             case 1:
                  leer.nextLine();
                  System.out.print("Nombre: ");
                  nombre = leer.nextLine();
                  System.out.print("Apellidos: ");
                  apellido = leer.nextLine();
                  System.out.print("DNI: ");
                  dni = leer.nextLine();
                  System.out.print("Numero de Hijos: ");
                  numHij = leer.nextInt();
                  System.out.print("Tipo de empleado 1. fijo 2. Temporal 3. Por horas: ");
                  tipEmp = leer.nextInt();
                  switch(tipEmp){
                        case 1:System.out.print(" Años de Antiguedad: ");
                               antiguedad = leer.nextInt();
                               sueldo = 20000 + (antiguedad * 1000)+(numHij * 1000);
                               System.out.println("Sueldo es: " + sueldo);
                               break;
                        case 2:leer.nextLine();
                               System.out.print("Fecha de Ingreso: ");
                               fecIng = leer.nextLine();
                               System.out.print("Fecha de Egreso: ");
                               fecEgr = leer.nextLine();
                               sueldo = 18000 + (numHij * 1000);
                               System.out.println("Sueldo es : " +sueldo);
                               break;
                        case 3:System.out.print("Numero de Horas trabajadas: "); 
                              numHor=leer.nextInt();
                              sueldo= 100*numHor;
                              System.out.println("Sueldo es : " + sueldo);
                
                   }//switch(Tipo de empleado)
                   Employed empleado;
                   empleado = new Employed(nombre, apellido, dni, numHij, numHor, tipEmp, antiguedad, fecIng, fecEgr, sueldo);
                   listEmployed.add(empleado);
                   break;
              case 2:
                   leer.nextLine();
                   System.out.println("******************************************************");
                   System.out.println("             ELIMINAR EMPLEADO                        ");
                   System.out.println("******************************************************");
                   System.out.print("DNI del Empleado a Eliminar:");
                   dni = leer.nextLine();
                   int j=0, enc=0; 
                   while ( ( enc == 0 ) && ( j <listEmployed.size() ) ){
                       if (dni.equals(listEmployed.get(j).getDni() ) ){
                         System.out.println( "El Empleado : " + listEmployed.get(j).getNombre()+ " fue Eliminado");
                         listEmployed.remove(j);
                         enc = 1; 
                       }else{
                            j++;
                         }
                       
                   }  
                   break;
                   
              case 3:System.out.println("******************************************************************************");
                     System.out.println("              CONSULTAR REPORTE TRABAJADORES                                  ");
                     System.out.println("******************************************************************************");
                          
                     System.out.println("Nombre Apellido DNI Hijos Horas Tipo antiguedad Ingreso  Egreso  Sueldo");
                     for(int i = 0; i < listEmployed.size(); i++){                      
                     System.out.println(listEmployed.get(i).getNombre() + "    " + listEmployed.get(i).getApellido() + "   " + listEmployed.get(i).getDni()
                     + "    " +listEmployed.get(i).getNumHij() + "     " +listEmployed.get(i).getNumHor() + "     " +listEmployed.get(i).getTipEmp()
                     +"     " +listEmployed.get(i).getAntiguedad()+"     " +listEmployed.get(i).getFecIng()+"     " +listEmployed.get(i).getFecEgr()
                     +"     " +listEmployed.get(i).getSueldo());
                     }       
                  
                    break;
           
            }//switch(opc) 
 
          }while (opc != 4);
   }
}
