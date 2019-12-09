/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class Nodo {
     private int valor;
    private Nodo siguiente;
    
    public Nodo(){
        this.siguiente = null;
     }
    
    public Nodo(int Nodo){
        this.valor = valor;
        this.siguiente = null;
    }
    public int getValor(){
        return valor;
    }

   public Nodo getSiguiente(){
       return siguiente;
    }
   public void setValor(int valor){
       this.valor=valor;
   }
   public void setSiguiente(Nodo siguiente){
           this.siguiente =siguiente;
   }        
}
