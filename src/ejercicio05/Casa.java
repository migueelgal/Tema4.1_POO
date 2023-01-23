/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio05;

/**
 *
 * @author miguel.galera
 */
public class Casa {

    private String propietario;
    private int superficiePlanta1;
    private int superficiePlanta2;
    private double precioVenta;
    private int superficieTotal;
    
    
    public Casa(String propietario,int superficiePlanta1, int superficiePlanta2, double precioVenta){
        this.propietario=propietario;
        this.superficiePlanta1=superficiePlanta1;
        this.superficiePlanta2=superficiePlanta2;
        this.precioVenta=precioVenta;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public int getSuperficiePlanta1() {
        return superficiePlanta1;
    }

    public void setSuperficiePlanta1(int superficiePlanta1) {
        this.superficiePlanta1 = superficiePlanta1;
    }

    public int getSuperficiePlanta2() {
        return superficiePlanta2;
    }

    public void setSuperficiePlanta2(int superficiePlanta2) {
        this.superficiePlanta2 = superficiePlanta2;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }
    
    public int calcularSuperficieTotal(int superficiePlanta1, int superficiePlanta2){
        superficieTotal=superficiePlanta1+superficiePlanta2;
        return superficieTotal;
    }
    
    public void imprimirDatos(){
        System.out.print("     "+this.propietario+"     "+this.superficieTotal+"     "+"     "+this.precioVenta);
    }
    
    
    
    
    
    
    
    
    
}
