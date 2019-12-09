/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lista miLista = new Lista();
        miLista.add(new Nodo(4));
        miLista.add(new Nodo(15));
        miLista.add(new Nodo(18));
        miLista.add(new Nodo(20));
        miLista.add(new Nodo(21));
      
        boolean vacia = miLista.isEmpty();
                if(vacia)
                    System.out.println("Lista vacia");
                else
                    System.out.println("Lista con nodos");
                miLista.print();
    }
    
    }
    

