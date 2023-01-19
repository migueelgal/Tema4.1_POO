/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio04;

import Utilidades.*;
import java.util.Scanner;

/**
 *
 * @author miguel.galera
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        String nombre,email;
        
        int contadorPersonas=0;
        
        Persona[] lista=new Persona[10];
        
        for (int i = 0; i < 10; i++) {
            //Primero leemos datos
            System.out.print("Dime tu nombre: ");
            nombre=teclado.nextLine();
            
            do{
                            System.out.print("Dime tu email: ");
            email=teclado.nextLine();
            
            Persona p=new Persona(nombre,email);
            lista[i]=p;
            contadorPersonas++;
            }while(!Utilidades.checkEmail(email));
           
        
            //Muestro los datos
            for (int j = 0; j < contadorPersonas; j++) {
                lista[i].imprimirDatos();
                
            }
            
            
        }
    }
    
}
