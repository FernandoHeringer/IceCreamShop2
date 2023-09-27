/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package icecreamshop2;

import ioutils.IOUtils;
import java.util.Scanner;

/**
 *
 * @author Fernando Heringer
 */
public class IceCreamShop2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        IOUtils myS = new IOUtils();
      
       
        while(true){
        System.out.println("Ice-cream menu \n 1. Raspberry \n 2. Chocolate \n 3. Vanilla \n 4. Leave Shop");
        System.out.println("Please enter the number of your choice:");
        int choice = myS.nextInt();
        
        if (choice == 1){
            System.out.println("You selected RASPBERRY.\n");
            
        } else if (choice == 2){
            System.out.println("You selected CHOCOLATE.\n");
           
        } else if (3 == choice){
            System.out.println("You selected VANILLA.\n");
            
        }  else if (4 == choice){
            System.out.println("Thank you for visiting the Ice Cream Shop!"); 
            break;
        } else if (0 == choice || choice > 4) {
            System.out.println("Invalid choice. Please try again.\n");
            
        }
    }    
    }
}
        
    
    

