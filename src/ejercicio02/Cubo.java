/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio02;

/**
 *
 * @author miguel.galera
 */
public class Cubo {
    private final int capacidadMax;
    private int contenido;
    
    
    public Cubo(int capacidadMax){
        this.capacidadMax=capacidadMax;
        this.contenido=0;
    }

    public int getContenido() {
        return contenido;
    }

    public void setContenido(int contenido) {
        this.contenido = contenido;
    }

    public int getCapacidadMax() {
        return capacidadMax;
    }
    
    public void llenar(){
        this.contenido=this.capacidadMax;
        this.contenido=0;
    }
    public void vaciar(){
        this.contenido=0;
    }
    public void rellenar(int litros){
        if((this.contenido=this.contenido+litros)>this.capacidadMax){
            System.out.println("Imposible rellenar. Se desborda");
        }else{
            this.contenido=this.contenido+litros;
        }
    }    
    public void pintar(){
        for (int nivel = this.capacidadMax; nivel > 0; nivel--) {
            if (this.contenido >=nivel)
                System.out.println("#~~~~~~#");
            else
                System.out.println("#      #"); 
        }
        System.out.println("########");
        System.out.println("");
        
    }


    
    
    
    
    
    
    
    
    
    
    
    
    
    
   
}
