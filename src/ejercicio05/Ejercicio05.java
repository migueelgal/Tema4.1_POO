/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio05;

import java.util.Scanner;

/**
 *
 * @author miguel.galera
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        
        Casa[] listaCasas=new Casa[50];
        
        Casa unaCasa;
        int totalCasas=0;
        int opcion=0;
        
        unaCasa=new Casa("Juan",30,45,120000);
        listaCasas[totalCasas]=unaCasa;
        totalCasas++;
        
        unaCasa=new Casa("Pedro",120,0,000);
        listaCasas[totalCasas]=unaCasa;
        totalCasas++;
        
        unaCasa=new Casa("Alicia",70,70,150000);
        listaCasas[totalCasas]=unaCasa;
        totalCasas++;

//        for (int i = 0; i < totalCasas; i++) {
//            listaCasas[i].imprimirDatos();
//        }

            System.out.println("===========");
            System.out.println("MENU CASAS");
            System.out.println("===========");
            System.out.println("1. Añadir casas");
            System.out.println("2. Listar casas");
            System.out.println("3. Cambiar propietario");
            System.out.println("4. Salir");
            System.out.println("              ");
            System.out.println("Elige una opcion: ");
            opcion=Integer.parseInt(teclado.nextLine());
            

            do {

            switch(opcion){
                case 1:
                    System.out.println("== Alta de nueva casa ==");
                    
                    System.out.println("Nuevo propietario: ");
                    String propietario=teclado.nextLine();
                    
                    System.out.println("Superficie PLANTA1: ");
                    int p1=Integer.parseInt(teclado.nextLine());
                    
                    System.out.println("Superficie PLANTA2: ");
                    int p2=Integer.parseInt(teclado.nextLine());
                    
                    System.out.println("Precio de venta: ");
                    int precioVenta=Integer.parseInt(teclado.nextLine());
                    
                    listaCasas[totalCasas]=new Casa(propietario,p1,p2,precioVenta);
                    totalCasas++;                    
                    break;
                    
                case 2:
                        System.out.println("====  Listado de casas ====");
                        for (int i = 0; i < totalCasas ; i++) {
                                System.out.print("CASA "+(i+1)+"-->");
                                listaCasas[i].imprimirDatos();
                        }
                       break;
                case 3:
                        System.out.println("====  Cambiar propietario ====");
                        for (int i = 0; i < totalCasas ; i++) {
                            System.out.print("CASA "+(i+1)+"-->");
                            listaCasas[i].imprimirDatos();
                        }
                        System.out.println("Numero de casa a modificar:");
                        int numCasa=Integer.parseInt(teclado.nextLine());
                        System.out.println("Nuevo propietario:");
                        String nuevoPropietario=teclado.nextLine();
                        listaCasas[numCasa-1].setPropietario(nuevoPropietario);
                    
                        break;
                        
                case 4:                         
                        buscarCasas(listaCasas,totalCasas);
                        break;
                    
            }

            
        } while (opcion<=4);

            
        
        
        
        
        
        
        
    }
    private static void buscarCasas(Casa[] listaCasas, int totalCasas){
        Scanner teclado=new Scanner(System.in);
        
        System.out.println("Buscar casas por precio");
        System.out.println("=======================");
        
        System.out.println("¿Cual es tu precio máximo?");
        int precioMaximo=Integer.parseInt(teclado.nextLine());
        
        for (int i = 0; i < totalCasas; i++) {
            if (listaCasas[i].getPrecioVenta()<=precioMaximo) {
               System.out.print("CASA "+(i+1)+"-->");
               listaCasas[i].imprimirDatos();
                
            }
            
        }
    }
    
}
