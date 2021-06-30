/*
 Implemente um algoritmo que preencha uma matriz de 4x4 e depois procure um número
específico e depois apresente esse número, como também a matriz.
 */
package Matrizes;

import java.util.Scanner;

public class ProcurandoNumeroNaMatriz {
    public static void main(String[] args) { 
    int result=0;
       
    Scanner teclado = new Scanner(System.in);
    int [][] matriz = new int [4][4];
        
    //preenchendo linhas e colunas
    for(int i=0;i<matriz.length;i++){ 
        for( int j=0;j<matriz[i].length;j++){ 
            System.out.println("Informe os valores:");
            matriz[i][j] = teclado.nextInt();
        }
              
    }
    System.out.println("Digite o numero que você quer encontrar:");   
    int procuran = teclado.nextInt();
    //Procurando
    boolean achou = false;
	for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++){   
                if(matriz[i][j]==procuran){
                   achou = true;
                }  
            }
        }
    //Achou ou nao?
    if(achou){
	System.out.println("O número encontrado foi:" +procuran);
    }else{
	System.out.println("Número não encontrado");
	}
        //Mostrando a matriz 
    for(int i=0;i<matriz.length;i++){
        //laço d erepetição para preencher a ccoluna. j=coluna 
        for( int j=0;j<matriz[i].length;j++){ 
            System.out.print("["+matriz[i][j]+"]");
            }
        System.out.println("");
        }
    }
}
