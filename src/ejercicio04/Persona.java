/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio04;

/**
 *
 * @author miguel.galera
 */
public class Persona {
    
    private String email;
    private String nombre;
    
    public Persona(String email, String nombre){
        this.nombre=nombre;
        this.email=email;
    }
    
    public void imprimirDatos(){
        System.out.println(this.email+" - "+this.nombre);
    }
    
}
