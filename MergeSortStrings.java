/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergesortstrings;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class MergeSortStrings {

    /**
     * @param args the command line arguments
     */
 
    public static void main(String[] args) {
       Scanner teclado = new Scanner (System.in);
       int n = teclado.nextInt();
       String a [] = new String[n];
       for(int i = 0; i < a.length; i++)
       {
           a[i] = teclado.next();
       }
       int inicio = 0;
       int fim = a.length -1;
       MergeSort(a,inicio,fim);
       System.out.println(Arrays.toString(a));
      
    }
    public static void MergeSort (String a [], int inicio, int fim)
    {
        if(inicio == fim)
            return;
        int meio = (inicio + fim)/2;
       MergeSort(a,inicio,meio);
       MergeSort(a,meio+1,fim);
       Combina(a,inicio,meio,fim); 
         
    }
    public static void Combina (String a[], int inicio, int meio, int fim)
    {
        
        String[] b  = new String [a.length];
        System.arraycopy(a, 0, b, 0, b.length);
        int e = inicio;
        int d = meio + 1;
        int k = inicio;
        
        while(e <= meio && d <= fim)
        {
            if(b[e].compareToIgnoreCase(b[d]) > 0)
            {
                a[k] = b[d];
                k++;
                d++;
            }
            
            else
            {
                a[k] = b[e];
                k++;
                e++;
                
            }
        }
        while(e <= meio)
        {
            a[k] = b[e];
            k++;
            e++;
        }
        while(d <= fim)
        {
            a[k] = b[d];
            k++;
            d++;
        }
      
    }
    
}

