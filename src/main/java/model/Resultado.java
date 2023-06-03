
package model;


import com.fasterxml.jackson.annotation.JsonProperty;


public class Resultado  {
    
     @JsonProperty("nome_time_coracao")
     String nome_time_coracao;
     @JsonProperty("dezenas")
     String dezenas;
     
     public Resultado(String nome_time_coracao, String dezenas){
         this.dezenas = dezenas;
         this.nome_time_coracao = nome_time_coracao;
         
     }
     public Resultado(){
         
        
     }

    public String getNome_time_coracao() {
        return nome_time_coracao;
    }

    public void setNome_time_coracao(String nome_time_coracao) {
        this.nome_time_coracao = nome_time_coracao;
    }

    public String getDezenas() {
        return dezenas;
    }

    public void setDezenas(String dezenas) {
        this.dezenas = dezenas;
    }

    @Override
    public String toString() {
        return "Resultado{" + "nome_time_coracao=" + nome_time_coracao + ", dezenas=" + dezenas + '}';
    }
     
     
    
}
