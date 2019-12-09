
import javax.swing.JOptionPane;

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
        System.out.println(fibonacci(100));
      }
    public static int fibonacci(int iPos){
        if(iPos ==0 ){
            return 0;
            
        }else if (iPos ==1){
            return 1;
        }else{
            return fibonacci(iPos-1) + fibonacci(iPos-2);
        }
    }
       
    }
      

