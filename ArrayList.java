
package Collections;

import Banco.Conta;

public class ArrayList {
    public class Array<A> {

   private Object[] object = new Object[3];
	private int totalobject = 0;
	
	public void adicionar(A c){
		aumentaEspaco();
		object[this.totalobject] = c;
		this.totalobject++;
                }
                public int size(){
		return this.totalobject;
                }
	
   @Override
	public String toString(){
            if(this.totalobject == 0){
                return "[]";
            }
            StringBuffer buffer = new StringBuffer();
            buffer.append("[");
            for(int i = 0; i < this.totalobject -1; i++){
                buffer.append(object[i]);
                buffer.append(",");
            }
		
            buffer.append(object[this.totalobject-1]);
            buffer.append("]");
        
            return buffer.toString();
	}
	public A procurarPosicao(int posicao){
            if(!verificaPosicaOculpada(posicao)){
                throw new IllegalArgumentException("Posição não existe");
            }
	return(A) object[posicao];
	}
	public void adicionaPosicao(int posicao, A c){
            if(!verificaPosicao(posicao)){
                throw new IllegalArgumentException("Posição não existe!");
            }
            aumentaEspaco();
            for(int i = this.totalobject-1;i>=posicao;i-=1){
                this.object[i+1]= this.object[i];
            }
            this.object[posicao] = c;
            this.totalobject++;
	}
	public void remove(int posicao){
            if(!verificaPosicaOculpada(posicao)){
                throw new IllegalAccessError("Posição Vazia");
            }
            for(int i = posicao;i < this.totalobject;i++){
                this.object[i] = this.object[i+1];
            }
            this.object[this.totalobject-1]=null;
            this.totalobject--;
	}
        public Object procurarNome(String nome) {
            Object c=null;
            for(int cont=0; cont<this.totalobject;cont ++) {
                c = (Conta)this.object[cont];
                if(((Conta)c).getNome().equals(nome)) {
                    return c;
                }
            }
            return null;
	}
        public boolean verificaPosicao(int posicao){
		return posicao >= 0 && posicao <= this.totalobject;
	}
	public Object[] listar(){
            Object[] objreturn = new Object[this.totalobject];
            for(int i=0; i < this.totalobject;i++){
                objreturn[i] = this.object[i];
            }
            return objreturn;
	}
	public boolean verificaPosicaOculpada(int posicao){
            return posicao < this.totalobject && posicao >=0;
	}
        private void aumentaEspaco(){
            if(this.totalobject == this.object.length){
                Object[] newobject = new Object[this.object.length*2];
                System.arraycopy(this.object, 0, newobject, 0, this.object.length);
                this.object = newobject;
            }
        }
    } 
}
