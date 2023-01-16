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
    private final String propietario;

    public Bicicleta(String propietario){
        this.revoluciones=0;
        this.piñonActual=3;
        this.propietario=propietario;
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

    public String getPropietario() {
        return this.propietario;
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
//    public void mostrarVelocidad(){
//        System.out.print("Bici de: "+this.propietario+" --> ");
//        switch(this.piñonActual){
//            
//            case 1:
//                System.out.println("Velocidad actual: "+(this.revoluciones*2));
//                break;
//
//            case 2:
//                System.out.println("Velocidad actual: "+(this.revoluciones*1.5));
//                break;
//            case 3:
//                System.out.println("Velocidad actual: "+(this.revoluciones*1));
//                break;
//            case 4:
//                System.out.println("Velocidad actual: "+(this.revoluciones*0.5));
//                break;
//            case 5:
//                System.out.println("Velocidad actual: "+(this.revoluciones*0.3));
//        }
//    }
    
    public double obtenerVelocidad(){
            double velocidad=0;
        
            switch(this.piñonActual){
            
            case 1:
                velocidad=this.revoluciones*2;
                break;

            case 2:
                velocidad=this.revoluciones*1.5;
                break;
            case 3:
                velocidad=this.revoluciones*1;
                break;
            case 4:
                velocidad=this.revoluciones*0.5;
                break;
            case 5:
                velocidad=this.revoluciones*0.3;
                break;
    }
            return velocidad;

                
    }
            
    
}
