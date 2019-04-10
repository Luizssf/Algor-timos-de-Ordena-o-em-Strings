/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksortstrings;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
/**
 *
 * @author User
 */
public class QuickSortStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        String v[] = new String [n];
        int começo = 0;
        int fim =  v.length - 1;
        for(int i = 0; i <  v.length; i++)
        {
            v[i] = teclado.next();
        }
        QuickSortStrings qs = new QuickSortStrings();
        
        qs.quickSort(v,começo,fim);
        System.out.println(Arrays.toString(v));
    }
    

    private void quickSort(String [] v, int começo, int fim) 
    {
       if(começo < fim)
       {
           int p = Particiona(v,começo,fim);
           quickSort(v,começo,p-1);
           quickSort(v,p+1,fim);
       }
    }
    
    public int Particiona(String [] v, int começo, int fim)
    {
        Troca(v,começo,getPivo(começo,fim));
        for(int i = começo+1; i <= fim; i++)
        {
            if(v[i].compareToIgnoreCase(v[começo]) < 0)
            {
                Troca(v,i,começo++);
            
            }
        }
        Troca(v,começo,começo);
        return começo;
    }
   
    public void Troca(String v[], int i, int j)
    {
        String aux = v[i];
         v[i] = v[j];
         v[j] = aux;
     
    }
   
    public int getPivo(int começo, int fim)
    {
        Random pivo = new Random ();
        return pivo.nextInt((fim - começo)+1) + começo;
        
    }
}
