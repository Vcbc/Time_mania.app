
package controller;


public class conteudo_Json {
    
    private final String nome;
    private final String dezenas;
    private final String nome_time_coracao;
    
    public conteudo_Json(String nome, String dezenas, String nome_time_coracao){
    this.nome = nome;
    this.dezenas = dezenas;
    this.nome_time_coracao = nome_time_coracao;
    
}

    public String getNome() {
        return nome;
    }

    public String getDezenas() {
        return dezenas;
    }

    public String getNome_time_coracao() {
        return nome_time_coracao;
    }
    
    
    
}
