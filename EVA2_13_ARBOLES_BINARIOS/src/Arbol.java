/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hotel Don Ruben
 */
public class Arbol {
    private Nodo root;

    public Arbol() {
        root = null;
    }
    
    public void agregarNodo(Nodo nuevo){
        agregarNodoRec(root, nuevo);
    }
    private void agregarNodoRec(Nodo actual, Nodo nuevo){
        if(root == null){//ARBOL VACÍO
            root = nuevo;
        }else{
            if(nuevo.getValor() > actual.getValor()){//MAYOR --> DERECHA
                if(actual.getDer() == null)//ESTÁ VACÍO
                    actual.setDer(nuevo);
                else//YA HAY UN NODO
                    agregarNodoRec(actual.getDer(), nuevo);
            }else if(nuevo.getValor() < actual.getValor()){//MENOR --> iZQUIERDA
                if(actual.getIzq() == null)
                    actual.setIzq(nuevo);
                else
                    agregarNodoRec(actual.getIzq(), nuevo);
            }else{//EL VALOR YA EXISTE
                System.out.println("UPS! YA EXISTE EL VALOR");
            }
        }
    }
    
    public void imprimepostOrder(){
        postOrder(root);
    }
    private void postOrder(Nodo actual){
        if(actual != null){
            //LEER IZQUIERDA
            postOrder(actual.getIzq());
            //LEER DERECHA
            postOrder(actual.getDer());
            //IMPRIMIR
            System.out.print(actual.getValor()+" - ");
        }
    }
    
    
    
    public void imprimePreOrder(){
        PreOrder(root);
    }
    private void PreOrder(Nodo actual){
        if(actual != null){
            //IMPRIMIR
            System.out.print(actual.getValor()+" - ");
            //LEER IZQUIERDA
            PreOrder(actual.getIzq());
            //LEER DERECHA
            PreOrder(actual.getDer());
        }
    }
    
    
    
    public void imprimeInOrder(){
        InOrder(root);
    }
    private void InOrder(Nodo actual){
        if(actual != null){
            //LEER IZQUIERDA
            InOrder(actual.getIzq());
            //IMPRIMIR
            System.out.print(actual.getValor()+" - ");
            //LEER DERECHA
            InOrder(actual.getDer());
        }
    }
}
