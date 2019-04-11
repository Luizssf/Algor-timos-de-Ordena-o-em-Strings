/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenacaostrings;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class SelectionSortStrings
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        String [] a = new String [n];
        for(int i = 0; i < a.length; i++)
        {
            a[i] = teclado.next();
        }
       SelectionSort(a);
       System.out.println(Arrays.toString(a));
    }
    
    public static void SelectionSort (String a[])
    {
        for(int i = 0; i < a.length -1; i++)
        {
            int menor = i;
            
            
            for(int j = menor + 1; j < a.length; j++)
            {
                if(a[j].compareToIgnoreCase(a[menor]) < 0)
                {
                    menor = j;
                   
                }
            }
            
            if(menor != i)
            {
                String aux = a[i];
                a[i] = a[menor];
                a[menor] = aux;
            }
        }
        
    }
    
   
}