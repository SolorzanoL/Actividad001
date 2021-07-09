/*
@Autor:
@Nohemi Solorzano 
@Luis Torres
@Versión: 1.0
@Fecha: 08/07/21
*/

/*Declaracion de los atributos */
public class Employed {
    private String nombre;
    private String apellido;
    private String dni;
    private int numHij;
    private int numHor;
    private int tipEmp;
    private int antiguedad;
    private String fecIng;
    private String fecEgr;
    private double sueldo;
      
    /*cracion del constructor con sus parametros*/
    public Employed(String nombre, String apellido, String dni, int numHij,int numHor, 
                    int tipEmp, int antiguedad, String fecIng, String fecEgr, double sueldo){
        
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.numHij = numHij;
        this.numHor = numHor;
        this.tipEmp = tipEmp;
        this.antiguedad = antiguedad;
        this.fecIng = fecIng;
        this.fecEgr = fecEgr;
        this.sueldo = sueldo;
        
        
    }
    
    
    /*creacion de los metodos getter y setter*/ 
    public String getNombre(){
      return nombre;
    }
   
    public void setNombre(String nombre){
      this.nombre = nombre;  
    }
   
    public String getApellido(){
      return apellido;
    }
   
    public void setApellido(String apellido){
      this.apellido = apellido;  
    }
   
    public String getDni(){
      return dni;
    }
   
    public void setDni(String nombre){
      this.nombre = nombre;  
      
    }
   
    public int getNumHij(){
      return numHij;  
    } 
   
    public void setNumHij(int numHij){
      this.numHij = numHij;  
    }
   
    public int getNumHor(){
      return numHor;  
    } 
   
    public void setNumHor(int numHor){
      this.numHor = numHor;  
    }
   
    public int getTipEmp(){
      return tipEmp;  
    } 
   
    public void setTipEmp(int tipEmp){
      this.tipEmp = tipEmp;  
    }
   
    public int getAntiguedad(){
      return antiguedad;  
    } 
   
    public void setAntiguedad(int antiguedad){
      this.antiguedad = antiguedad;  
    }
   
    public String getFecIng(){
      return fecIng;
    }
   
    public void setFecIng(String fecIng){
      this.fecIng = fecIng;  
    }
   
    public String getFecEgr(){
      return fecEgr;
    }
   
    public void setFecEgr(String fecEgr){
      this.fecEgr = fecEgr;  
    }
   
    public double getSueldo(){
      return sueldo;
    }
   
    public void setSueldo(double sueldo){
      this.sueldo = sueldo;  
    }
      
 }
   