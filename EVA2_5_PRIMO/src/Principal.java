
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CIESPN
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("INTRODUCE UN NÚMERO:" );
        int iVal = input.nextInt();
        if(Primo(iVal))
        System.out.println("Es primo");
        else
        System.out.println("No es primo ");
    }
    public static boolean Primo(int Numero){
        
        boolean primo=true;
        for (int i = 2; i < Numero; i++) {
            if ((Numero % i) ==0){
                primo=false;
                break;
            }
            
        }return primo;
    }
}

        
        
    

