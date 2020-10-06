/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package primerechner;

import java.math.BigInteger;

/**
 *
 * @author hoegl
 */
public class EratosthenesPrimeSieve {
    int obergrenze;
    boolean prime[];

    
    public EratosthenesPrimeSieve(int obergrenze) {
        this.obergrenze = obergrenze;
    }

    
    public boolean isPrime(int p){
        prime = new boolean[p+1];
        for (int i = 0; i <p; i++) {
            prime[i]= true;
        }
        
        for(int j = 2; j*j <=p; j++){
            if(prime[j]==true){
                for (int i = j*2; i <=p; i= i+j) {
                   prime[i]= false;
                    
                }
            }
        }
             if(prime[p]==true){
                 return true;
             }
             else {
                 return false;
             }
        
        
     
            
        }
    public void printPrime(int p){
             prime = new boolean[p+1];
        for (int i = 0; i <p; i++) {
            prime[i]= true;
        }
        
        for(int j = 2; j*j <=p; j++){
            if(prime[j]==true){
                for (int i = j*2; i <=p; i= i+j) {
                   prime[i]= false;
                    
                }
            }
        }
    }
}
    

