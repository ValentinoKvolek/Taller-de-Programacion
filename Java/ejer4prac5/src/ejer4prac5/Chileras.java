/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer4prac5;

/**
 *
 * @author valen
 */
public class Chileras extends Coro {
    
    
    private int hilera =0;
    private int columna =0;
  
    private int dimension;
    
    private Corista [][] coristas;

    public Chileras(String nombreCoro, Director director, Corista corista, int dimension) {
        super(nombreCoro, director, corista);
        this.setDimension(dimension);
        this.setCoristas(new Corista [dimension][dimension]);
    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    

    public Corista[][] getCoristas() {
        return coristas;
    }

    public void setCoristas(Corista[][] coristas) {
        this.coristas = coristas;
    }
    
    public void agregarCorista(Corista nuevoCorista){
        
        if(hilera < getDimension()){
            
            if(columna< getDimension()){
                
                getCoristas()[hilera][columna] = nuevoCorista;
                columna++;
                
            }
            else { // si la hilera esta llena entonces reseteo
                    columna =0;
                    hilera ++;
            }
        }      
    }
    
    public boolean lleno(){
           
        
        boolean aux = false;
        
        if( (hilera +1) == getDimension()){
            if( (columna +1) == getDimension()){
                aux = true;
            }
        }
    
        return aux;
    }
    
    
public boolean ordenado() {
    
    for (int i = 0; i < hilera; i++) {
        
        int tonoFundamental = getCoristas()[i][0].getTonoFundamental(); 
        
        for (int j = 0; j < columna ; j++) {
      
            if ( getCoristas()[i][j].getTonoFundamental() != tonoFundamental) {
                return false; 
            }
        }
    }
    
    int max = Integer.MAX_VALUE; 
    
    for (int i = 0; i < hilera; i++) {
        
        int tonoPrimerMiembro = getCoristas()[i][0].getTonoFundamental();
        if (tonoPrimerMiembro >= max) {
            return false; // Si el tono actual es mayor o igual al máximo anterior
        }
        
        max = tonoPrimerMiembro; // Actualiza el máximo
    }

    return true; // Todo está ordenado correctamente
}



    
    public void informar(){
        
        System.out.println(super.toString());
        
        for(int i =0; i< hilera ; i++){
            
            for (int j=0; j < getDimension(); j++){
                System.out.println(getCoristas()[i][j].toString());
            }
            
        }
    
    }
}
