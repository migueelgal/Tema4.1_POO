/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03;

/**
 *
 * @author miguel.galera
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        // TODO code application logic here
//        Libro libro1=new Libro("1984","G.Oswell",1984);
//        Libro libro2=new Libro("L001","Moby Dick","Mervill,H.",1984);
//        Libro libro3=new Libro("50 sombras","Mike M.",2010);
//        
//        libro1.setIsbn("L345");
//        System.out.println(libro1.citaBibliografica());
//        System.out.println(libro2.citaBibliografica());
//        System.out.println(libro3.citaBibliografica());
//        
//        System.out.println(libro1.getIsbn());
//        System.out.println(libro2.getIsbn());
//        System.out.println(libro3.getIsbn());
//      
//        
//        
         //          CON ARRAY           
        //--------------------------------//
        
        Libro[] listaLibros=new Libro[10];
        
        Libro unLibro;
        int totalLibros=0;
        
        unLibro=new Libro("1984","G.Oswell",1984);
        listaLibros[totalLibros]=unLibro;
        totalLibros++;
        
        unLibro=new Libro("L001","Moby Dick","Mervill,H.",1984);
        listaLibros[totalLibros]=unLibro;
        totalLibros++;
        
        unLibro=new Libro("50 sombras","Mike M.",2010);
        listaLibros[totalLibros]=unLibro;
        totalLibros++;
        
        for (int i = 0; i < totalLibros; i++) {
            System.out.println(listaLibros[i].citaBibliografica());                
        }
        
        listaLibros[0].setIsbn("5645");
        
        for (int i = 0; i < totalLibros; i++) {
            System.out.println(listaLibros[i].getIsbn());
        }
        
        

        
        
        
        
        
        
    }
    
}
