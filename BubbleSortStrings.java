/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesortstrings;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class BubbleSortStrings {

   public static void main(String[] args) 
    {
       Scanner teclado = new Scanner (System.in);
       int n = teclado.nextInt();
       String a[] = new String [n];
       for(int i = 0; i < a.length; i++)
       {
           a[i] = teclado.next();
       }
       
       BubbleSort(a);
       System.out.println(Arrays.toString(a));
     
    }
    
    public static void BubbleSort(String a[])
    {
        for(int i = 0; i < a.length; i++)
        {
            for(int j = i+1; j < a.length; j++)
            {
                if(a[j].compareToIgnoreCase(a[i]) < 0)
                {
                   String aux = a[i];
                   a[i] = a[j];
                   a[j] = aux;
                }
            }
            
        }
    }
    
  
}
