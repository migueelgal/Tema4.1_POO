/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio03;

/**
 *
 * @author miguel.galera
 */
public class Libro {
    private String isbn;
    private String titulo;
    private String autor;
    private int año;
    
    //Primer constructor
    public Libro(String isbn, String titulo, String autor, int año){
        this.autor=autor;
        this.titulo=titulo;
        this.año=año;
        this.isbn=isbn;
    }
    
    //Segundo constructor
        public Libro(String titulo, String autor, int año){
        this.autor=autor;
        this.titulo=titulo;
        this.año=año;
        this.isbn=null;
    }

    public String getIsbn() {
        
        String isbnNulo;
        if(this.isbn==null){
            isbnNulo=String.format("***[%s] no tiene ISBN***", this.titulo);
            return isbnNulo;
        }else{
            return isbn;  
        }

    }

    public void setIsbn(String isbn) {
        
        isbn=isbn.toUpperCase();
        
        boolean isbnCorrecto=true;
        
        //Comprobacion1: Compruebo que el isbn tiene formato correcto
        if (isbn.length()!=4)isbnCorrecto=false;
        
        //Comprobacion2: que el primer caracter sea una letra
        char letra=isbn.charAt(0);
        if(letra<'A' ||letra>'Z'){
            isbnCorrecto=false;
        }
        
        //Comprobacion3,4,5: que los siguientes caracteres sean numeros
        char digito1=isbn.charAt(1);
        if(digito1 <'0' || digito1>'9') isbnCorrecto=false;
        char digito2=isbn.charAt(2);
        if(digito2 <'0' || digito2>'9') isbnCorrecto=false;
        char digito3=isbn.charAt(3);
        if(digito3 <'0' || digito3>'9') isbnCorrecto=false;
        
        if(isbnCorrecto==false){
            System.out.println("ERROR. ISBN incorrecto");
        }
        
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    public String citaBibliografica(){
        String cita;
        cita=String.format("%s, (%d), %s",this.autor,this.año,this.titulo);
        return cita;
    }
    
    
    
}

