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
public class Funcion {
    
    private String titulo;
    
    private int fecha;
    
    private int dimButacas;
    
     private int dimfilas;
    
    private int hora;
    
    private Butaca [][] sala;

    public Funcion(String titulo, int fecha, int hora, int filas, int butacas) {
        this.titulo = titulo;
        this.fecha = fecha;
        this.hora = hora;
        this.dimButacas = butacas;
        this.dimfilas = filas;
        this.setSala(new Butaca [filas][butacas]);
    }
    
    public Butaca[][] getSala() {
        return sala;
    }

    public void setSala(Butaca[][] sala) {
        this.sala = sala;
    }

    public double ocupar(int f, int b, Butaca nuevabutaca){
        
        double total; //asumo que f y b estan dentro de 1..n y 1..m
        this.sala[f][b] = nuevabutaca;
        this.sala[f][b].cambiarEstado();
        
        total = this.sala[f][b].ponerPrecio(f);
        
        return total;
    }
    
    public void desocupar(int f){
        
        for(int j = 0; j < this.dimButacas; j++){
            
            if(this.sala[f-1][j] != null){
                this.sala[f-1][j].cambiarEstado();
            }
        }
        
    }
    
    public String todasButacas(int b){
        
        String aux= "";
        
        for (int  i = 0; i < this.dimfilas ; i ++){
           if(this.sala[i][b-1] != null){
           aux += this.sala[i][b-1].toString(i,b);
           }
        }
        
        return aux;
    }
    
    
    
    
    
    public String toString(){
    
        String aux;
        aux = "TITULO : " + this.titulo + "\n" + 
                   " FECHA: " +  this.fecha + "\n" +
                        "HORA : " + this.hora + "\n" ;
                    for (int i = 0; i<this.dimfilas; i++){
                        for (int j =0; j<this.dimButacas; j++){
                            if(this.sala[i][j]!= null){
                            aux += this.sala[i][j].toString(i, j) + "\n";
                            }
                        }
                            
                            
                    }
                    
        return aux;                
                        
                        
                            
    }
    
    
    
}
