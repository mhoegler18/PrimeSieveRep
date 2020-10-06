/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package primerechner;

import java.util.Scanner;

/**
 *
 * @author hoegl
 */
public class Primerechner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        
  
        int obergrenze = in.nextInt();
        EratosthenesPrimeSieve er = new EratosthenesPrimeSieve(obergrenze);
        
     
        er.printPrime(obergrenze);
        
       
    }
    
}
