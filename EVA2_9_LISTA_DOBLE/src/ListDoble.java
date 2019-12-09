/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class ListDoble {
    private Nodo inicio;
     private Nodo fin;
    public ListDoble(){
        this.inicio = null;
        this.fin = null;
   } 
    
    //DEVUELVE TRUE SI LA LISTA ESTA VACIA
    public boolean isEmpty(){
        if(inicio == null)
            return true;
        else
            return false;
        
    }
    //AL FINAL DE LA LISTA
    public void add(Nodo nuevo){
        //LISTA VACIA
        if(isEmpty()){
            inicio = nuevo;
            fin = nuevo;
        }else{
            fin.setSiguiente(nuevo);//HACIA ADELANTE
            nuevo.setPrevio(fin);//HACIA ATRAS
            fin = nuevo;
        }
    }
    //IMPRIMIR LA LISTA 
    public void print(){
        Nodo temp = inicio;
        while(temp != null){
            
        System.out.print(temp.getValor() + "-");
        temp = temp.getSiguiente();
    }
        System.out.println(" ");
        
    }
    //CANTIDAD DE ELEMENTOS DE LA LISTA 
    public int size(){
        int iCont = 0;
        Nodo temp = inicio;
        while( temp != null){
            iCont++;
            temp=temp.getSiguiente();
    }
        return iCont;
    }
    public void clear(){
        inicio = null;
        fin = null;
    }
    public int getAt(int pos){
        //Verificar
        int iCont = 0;
        Nodo temp = inicio;
        while(iCont < pos){
            temp = temp.getSiguiente();
            iCont++;
        }
        return temp.getValor();
    }
     public void printBack(){
        Nodo temp = fin;
        while(temp != null){
            
        System.out.print(temp.getValor() + "-");
        temp = temp.getPrevio();
    }
        System.out.println(" ");
        
    }
}
