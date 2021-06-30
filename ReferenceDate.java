
package linguagempro2;

import java.text.ParseException;
import java.util.Scanner;


public class ReferenceDate {
    public static void main(String[] args) throws ParseException {
        
        Data resultado = new Data();

        int opcao;
        
        Scanner teclado = new Scanner(System.in);
        
        
        System.out.println("............!!! APP INICIADO !!!............");
        System.out.println(resultado.toString());
        
        System.out.println("Digite o dia:");
        resultado.setDia(teclado.nextInt());
        
        System.out.println( "Digite o mês: " );
        resultado.setMes(teclado.nextInt());

        
        System.out.println( "Digite o ano: " );
        resultado.setAno(teclado.nextInt());
        Data objformat = new Data(resultado.getDia(), resultado.getMes(), resultado.getAno());
        
        System.out.println("Escolha uma opção:");
        System.out.println("1- Avançar dia seguinte");
        System.out.println("2- Saber a data que você digitou" );
        System.out.println("0- Para sair do programa ");
        opcao = teclado.nextInt();
        switch (opcao){
            case 0:
                System.exit(0);
            case 1:
               
                resultado.DataSeg();
                
            break;
            
            case 2:
                System.out.println(resultado);
            
            break;
        }
    }
}
