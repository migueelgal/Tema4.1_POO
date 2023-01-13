/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01;

/**
 *
 * @author miguel.galera
 */
public class Bicicleta {
    private double revoluciones;
    private int piñonActual;
    
    public Bicicleta(){
    
}
    public Bicicleta(double revoluciones, int piñonActual){
        this.revoluciones=0;
        this.piñonActual=3;
    }

    public double getRevoluciones() {
        return revoluciones;
    }

    public void setRevoluciones(double revoluciones) {
        this.revoluciones = revoluciones;
    }

    public int getPiñonActual() {
        return piñonActual;
    }

    public void setPiñonActual(int piñonActual) {
        this.piñonActual = piñonActual;
    }
    
    //********* METODOS ********
    public void pedalear(){
        if(this.revoluciones==0){
            this.revoluciones=1;
        }else{
            this.revoluciones=this.revoluciones*2;
        }

    }
    public void frenar(){
        if(this.revoluciones==1){
            this.revoluciones=0;
        }else{
            this.revoluciones=this.revoluciones/2;           
        }  
    }
    public void cambiarPiñon(int piñon){
        if(piñon>=0 && piñon<=5){
            this.piñonActual=piñon;
        }else{
            System.out.println("ERROR. Piñón incorrecto");
        }
    }
    public void mostrarVelocidad(){
        switch(this.piñonActual){
            case 1:
                System.out.println("Velocidad actual: "+(this.revoluciones*2));
                break;

            case 2:
                System.out.println("Velocidad actual: "+(this.revoluciones*1.5));
                break;
            case 3:
                System.out.println("Velocidad actual: "+(this.revoluciones*1));
                break;
            case 4:
                System.out.println("Velocidad actual: "+(this.revoluciones*0.5));
                break;
            case 5:
                System.out.println("Velocidad actual: "+(this.revoluciones*0.3));
        }
    }
    
}
