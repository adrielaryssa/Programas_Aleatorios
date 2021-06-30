
package linguagempro2;
public class Gerente extends Empregado{
    private String depart;

    public Gerente(String dpt, String n, float s) {
        super(n, s);
        this.depart = dpt;
    }

    public Gerente() {
    }

    public String getDepart() {
        return depart;
    }

    public float getEsalariosc() {
        return esalariosc;
    }

    public void setDepart(String d) {
        this.depart = d;
    }

    public void setEsalariosc(float esalariosc) {
        this.esalariosc = esalariosc;
    }

    @Override
    public String toString() {
        return "Departamento:" + depart + "\nNome:" + this.getNome() + "\nSalário:" + this.getEsalariosc();
        
    }


    
}
 //O método toString da classe Gerente deve incluir a informação do departamento, 
///além dos dados da superclasse. O construtor da classe  
//deve receber por parâmetro, além as informações da superclasse, a informação do departamento