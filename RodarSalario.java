
package linguagempro2;

import java.util.Scanner;

public class RodarSalario {
    public static void main(String[] args) {
        int op;
        
        Gerente ger = new Gerente ();
        Vendedor v = new Vendedor ();

        Scanner teclado= new Scanner (System.in);
        
        System.out.println("........APP INICIADO........");
        
        System.out.println("Como vc gostaria de acessar o app: ");
        System.out.println("1- Vendedor");
        System.out.println("2- Gerente");
        System.out.println("0- Sair do programa");
        op= teclado.nextInt();
        switch (op){
            case 0:
                System.exit(0);
            case 1:
                System.out.println("Digite o Nome do funcionario:");
                v.setNome(teclado.next());
              
                System.out.println("Digite o percentual da comissao:");
                v.setPc(teclado.nextFloat());
              
                System.out.println("Digite o Salário:");
                v.setSalario(teclado.nextInt());
                
                System.out.println(v.toString());
                
                break;
            case 2: 
                System.out.println("Digite o Nome do funcionario:");
                ger.setNome(teclado.next());
            
                System.out.println("Digite o Departamento:");
                ger.setDepart(teclado.next());
    
                System.out.println("Digite o Salário:");
                ger.setSalario(teclado.nextFloat());
                
                System.out.println("Digite o percentual da comissao:");
                
                System.out.println(ger.toString());
                
                break;
       
               
        }
 
    }
}
