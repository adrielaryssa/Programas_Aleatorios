package atividade3;

import java.util.Scanner;


public class TestandoRepeticao {
    
    public static void main(String[] args) {
        String frase; int c=0;
        System.out.println("Digite uma frase:");
        Scanner fraseusu=new Scanner(System.in);
        frase=fraseusu.nextLine();
        while(c<=10000){ 
            String retorno = repetir(frase);
            System.out.println(frase);
            c++;
    }
       
    
        
        
        
    }
      public static String repetir(String f2){
       return (f2);
    }
}
