/*
 Na mesma Matriz implemente um código que verifique o maior número dessa Matriz e
depois apresente.
 */
package Matrizes;

import java.util.Scanner;


public class MatrizMaiorNumero {
    public static void main(String[] args) { 
        int result=0;
        int maior;
        Scanner teclado = new Scanner(System.in);
        int [][] m3x3 = new int [3][3];
        
        //preenchendo linhas e colunas
        for(int i=0;i<m3x3.length;i++){ 
            for( int j=0;j<m3x3[i].length;j++){ 
                 System.out.println("Informe o primeiro valor:");
                 m3x3[i][j] = teclado.nextInt();
            }
              
        }
        
        //Descobrindo o maior valor digitado
        maior=m3x3[0][0];
        for(int i=0;i<m3x3.length;i++){
            for( int j=0;j<m3x3[i].length;j++){ 
                if(m3x3[i][j]>maior){
                    maior=m3x3[i][j];
                }
            }
        }
        System.out.println("O maior valor digitado foi: "+maior);
         //Mostrando a matriz 
         for(int i=0;i<m3x3.length;i++){
            for( int j=0;j<m3x3[i].length;j++){ 
                System.out.print("["+m3x3[i][j]+"]");
            }
            System.out.println("");
        }
    }
}
