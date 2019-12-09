/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
import java.util.Scanner;
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sInput = new Scanner(System.in);
        System.out.println("Introduce un número");
        int iVal = sInput.nextInt();
        for (int i = iVal;  i >= 1; i--) {
            System.out.print(i + " - ");
        }
        System.out.println("");
        forFalso(iVal);
        System.out.println("");
        forFals(i, iVal);
    }
      public static void forFalso(int iVal){
          System.out.print(iVal + " - ");
          if(iVal > 1)
          forFalso(iVal - 1);
    }
       public static void forFals(int x, int iVal){
         
           System.out.print(x + " - ");
          if(1 < iVal)
          forFals(x + 1,iVal);
  
    
}
}

