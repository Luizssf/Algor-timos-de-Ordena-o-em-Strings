/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertionsortstrings;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class InsertionSortStrings {

    public static void main(String[] args) 
    {
         Scanner teclado = new Scanner (System.in);
         int n = teclado.nextInt();
         String a[] = new String [n];
         for(int i = 0; i < a.length; i++)
         {
            a[i] = teclado.next(); 
         }
         InsertionSort(a);
         System.out.println(Arrays.toString(a));
    }
    
    public static void InsertionSort(String a[])
    {
        for(int i = 0; i < a.length; i++)
        {
            int menor = i;
            
            for(int j = i + 1; j < a.length; j++)
            {
                if(a[j].compareToIgnoreCase(a[menor]) < 0)
                {
                    menor = j;
                    Troca(a,i,menor);
                }
            }
        }
    }
    public static void Troca(String a[], int i, int menor)
    {
        
            String aux = a[i];
            a[i] = a[menor];
            a[menor] = aux;
       
        
    }
}
