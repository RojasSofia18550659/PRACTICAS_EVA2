/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class Lista {
     private Nodo inicio;
    public Lista(){
        this.inicio = null;
    }
    //DEVUELVE TRUE SI LA LISTA ESTA VACIA
    public boolean isEmpty(){
        if(inicio == null)
            return true;
        else
            return false;
        
    }
    //AGREGAR UN NODO AL FINAL DE LA LISTA 
    public void add(Nodo nuevo){
        //PRIMERO VERIFICAR SI LA LISTA ESTA VACIA
        if(isEmpty()){
            inicio = nuevo;
        }else{
           Nodo temp = inicio;
           while(temp.getSiguiente() != null){
               temp = temp.getSiguiente();
               
           }
           temp.setSiguiente(nuevo);
        }
        
    }
    //IMPRIMIR LA LISTA 
    public void print(){
        Nodo temp = inicio;
        while(temp != null){
        System.out.print(temp.getValor() + "-");
        temp = temp.getSiguiente();
    }
    }
}
