
package linguagempro2;

public class Vendedor extends Empregado{
    private float pc ;
            // (valor obtido x 100) / Valor total

    public Vendedor(String nome, float esalariosc) {
        super(nome, esalariosc);    
    }
    public Vendedor() {
    }

    public float getPc() {
        return pc;
    }

    public float getSal() {
        return esalariosc;
    }

    public void setPc(float pc) {
        this.pc = pc;
    }

    public void setSal(float sal) {
        this.esalariosc = sal;
    }

    @Override
    public String toString() {
        return "Nome:" + this.getNome() + "\nSalário com comissão:" + this.calcusalario(esalariosc) + 
                "\nSalário sem Comissão: " + this.esalariosc;
               
    }

   
    
    public float calcusalario( float novosalario){
       novosalario = this.esalariosc + ((pc/100)*esalariosc) ;
       return novosalario;
    }
   
}
//as informações de nome do empregado 
//salário sem comissão, salario com comissão e percentual de comissã