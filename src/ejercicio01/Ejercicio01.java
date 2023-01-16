/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01;

/**
 *
 * @author miguel.galera
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        

       Bicicleta miBici=new Bicicleta("Juan");
       Bicicleta tuBici=new Bicicleta("Alicia");

       
       miBici.pedalear();
       miBici.pedalear();
       miBici.cambiarPiñon(2);
       
       tuBici.pedalear();
       tuBici.pedalear();
       tuBici.pedalear();
       tuBici.cambiarPiñon(6);
       
       tuBici.pedalear();
       tuBici.pedalear();
       tuBici.pedalear();
       tuBici.cambiarPiñon(5);
       
       miBici.obtenerVelocidad();
       System.out.println("Velocidad actual: "+miBici.obtenerVelocidad());
       
    }
    
}
