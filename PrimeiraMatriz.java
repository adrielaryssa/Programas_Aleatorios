
package Matrizes;

import java.util.Scanner;


public class PrimeiraMatriz {
    public static void main(String[] args) { 
        int result=0;
       
        Scanner teclado = new Scanner(System.in);
        int [][] m3x3 = new int [3][3];
        
        //preenchendo linhas e colunas
        for(int i=0;i<m3x3.length;i++){ 
            for( int j=0;j<m3x3[i].length;j++){ 
                 System.out.println("Informe o primeiro valor:");
                 m3x3[i][j] = teclado.nextInt();
            }
              
        }
        //somando os resultados
         for(int i=0;i<m3x3.length;i++){
            for( int j=0;j<m3x3[i].length;j++){ 
                result += m3x3[i][j];
                
             }
        }
        //Mostrando a matriz 
         for(int i=0;i<m3x3.length;i++){
              //laço d erepetição para preencher a ccoluna. j=coluna 
            for( int j=0;j<m3x3[i].length;j++){ 
                System.out.print("["+m3x3[i][j]+"]");
            }
            System.out.println("");
        }
        System.out.print("O resultado da ssoma dos números é:"+result+"\n");
    }
}
    

