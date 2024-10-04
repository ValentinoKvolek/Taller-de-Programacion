/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial3;

/**
 *
 * @author valen
 */
public class Butaca {
    
    private String Descriptor =  "butaca : ";
    
    private double precio = 800 + 100;
    
    private boolean estado = false;

    public Butaca(){};

    

    public String getDescriptor() {
        return Descriptor;
    }

    public void setDescriptor(String Descriptor) {
        this.Descriptor = Descriptor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
   
    
    
    public double ponerPrecio(int f){
        
        return this.precio = (this.precio * f);
        
    }
    
    
    public void cambiarEstado(){
        
        if(this.estado == true ){
             this.estado = false;
        }
        else this.estado= true;
    }
    
    public String toString(int i, int b){
        
        String aux;
        aux = "descriptor : " + this.Descriptor + i + b +
                " precio : " +  this.precio +
                    "estado" + this.estado;
        return aux;
                
    
    }
    
}
