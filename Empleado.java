/*
@Autor:
@Nohemi Solorzano 
@Luis Torres
@Versión: 1.0
@Fecha: 08/07/21
*/

/* declaracion de los atriburos */
public class Empleado{
   
   private String nombre;
   private String codEmp;
   private int horTra;
   private double pagHor;
   
   /*creacion del metodo constructor*/
   
   public Empleado(String nom, String cod, int hor, double pag){
      nombre = nom;
      codEmp = cod;
      horTra = hor;
      pagHor = pag;
   }
  /* creacion de los metodos getters */
   public String getNombre(){
      return nombre;
   }
   
   public String getCodigo(){
      return codEmp;
   }
   
   public int getHoras(){
      return horTra;
   }
   
   public double getPagos(){
      return pagHor;
   }


}