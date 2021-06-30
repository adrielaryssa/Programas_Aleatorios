
package linguagempro2;

public class Empregado  {
    private String nome;
    protected float esalariosc;

    public Empregado(String n, float s) {
        this.nome = n;
        this.esalariosc = s;
    }

    public Empregado() {
    }

   

    public String getNome() {
        return nome;
    }

    public float getSalario() {
        return esalariosc;
    }

    public void setNome(String no) {
        this.nome = no;
    }

    public void setSalario(float sa) {
        this.esalariosc = sa;
    }

    @Override
    public String toString() {
        return "Empregado" + "nome=" + nome + ", salario=" + esalariosc;
    }
    
    
}
