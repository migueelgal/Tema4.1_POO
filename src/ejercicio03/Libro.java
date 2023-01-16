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

