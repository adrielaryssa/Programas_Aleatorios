
package linguagempro2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Data {
    int dia=0;
    int mes=0;
    int ano=0;

    public int getDia(){
        return this.dia;
    }
    public void setDia(int d){
        this.dia = d;
    }
     public int getMes(){
        return this.mes;
    }
    public void setMes(int m){
        this.mes = m;
    }
     public int getAno(){
        return this.ano;
    }
    public void setAno(int a){
        this.ano = a;
    }
    //validar data
    public Data(int ano, int mes, int dia){
       
       this.dia = dia;
       this.mes = mes;
       this.ano = ano;
       Date data =  null;
       String extenso = new String(this.dia + "/" + this.mes + "/" + this.ano);
       SimpleDateFormat dataformatada = new SimpleDateFormat("dd/MM/yyyy");
       try {
            dataformatada.setLenient(false);
            data = dataformatada.parse(extenso);
            System.out.println("Essa data é válida!!!");   
        }catch (ParseException e) {
            System.out.println("Essa data não existe");
            System.exit(0);
        } 
    }
     //formatar data
    public Data() throws ParseException {
        Calendar x = Calendar.getInstance();
        Date dt = new Date();
        int dia = 0;
        int mes = 0;
        int ano = 0;
        if (dia == 0){
            dia = x.get(Calendar.DAY_OF_MONTH);
            this.dia = dia;
        }
        if(mes == 0){
            mes =  x.get(Calendar.MONTH);
            this.mes = mes +1;
        }
        if (ano == 0){
            ano = x.get(Calendar.YEAR);
            this.ano = ano;
        }
    }
    //avançar um dia na data 
    public void DataSeg( ){
        boolean sinal;
        LocalDate ds = LocalDate.of(this.ano, this.mes, this.dia);
        DateTimeFormatter formatadorBarra = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        ds = ds.plusDays(1);
        System.out.println(ds.format(formatadorBarra));

    }
    
      
    @Override
    public String toString() {
        LocalDate data = LocalDate.of(this.ano, this.mes, this.dia);
        DateTimeFormatter dataformatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return data.format(dataformatada);        
    }
}
    
  
