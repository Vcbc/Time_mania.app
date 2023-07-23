package model;

import java.util.Date;

public class Resultado {

    String nome_time_coracao;
    String concurso;
    Date data_sorteio;
    Integer dezena1;
    Integer dezena2;
    Integer dezena3;
    Integer dezena4;
    Integer dezena5;
    Integer dezena6;
    Integer dezena7;
    Integer dezena8;
    Integer dezena9;
    Integer dezena10;

    public Resultado(String nome_time_coracao, String concurso, Date data_sorteio, Integer dezena1,Integer dezena2,
    Integer dezena3, Integer dezena4, Integer dezena5, Integer dezena6, Integer dezena7, Integer dezena8, Integer dezena9, Integer dezena10) {
        this.nome_time_coracao = nome_time_coracao;
        this.concurso = concurso;
        this.data_sorteio = data_sorteio;
        this.dezena1 = dezena1;
        this.dezena2 = dezena2;
        this.dezena3 = dezena3;
        this.dezena4 = dezena4;
        this.dezena5 = dezena5;
        this.dezena6 = dezena6;
        this.dezena7 = dezena7;
        this.dezena8 = dezena8;
        this.dezena9 = dezena9;
        this.dezena10 = dezena10;

    }

    public Resultado() {

    }

    public String getNome_time_coracao() {
        return nome_time_coracao;
    }

    public void setNome_time_coracao(String nome_time_coracao) {
        this.nome_time_coracao = nome_time_coracao;
    }

    public String getConcurso() {
        return concurso;
    }

    public Date getData_sorteio() {
        return data_sorteio;
    }

    public void setConcurso(String concurso) {
        this.concurso = concurso;
    }

    public void setData_sorteio(Date data_sorteio) {
        this.data_sorteio = data_sorteio;
    }

    public Integer getDezena1() {
        return dezena1;
    }

    public Integer getDezena2() {
        return dezena2;
    }

    public Integer getDezena3() {
        return dezena3;
    }

    public Integer getDezena4() {
        return dezena4;
    }

    public Integer getDezena5() {
        return dezena5;
    }

    public Integer getDezena6() {
        return dezena6;
    }

    public Integer getDezena7() {
        return dezena7;
    }

    public Integer getDezena8() {
        return dezena8;
    }

    public Integer getDezena9() {
        return dezena9;
    }

    public Integer getDezena10() {
        return dezena10;
    }

    public void setDezena1(Integer dezena1) {
        this.dezena1 = dezena1;
    }

    public void setDezena2(Integer dezena2) {
        this.dezena2 = dezena2;
    }

    public void setDezena3(Integer dezena3) {
        this.dezena3 = dezena3;
    }

    public void setDezena4(Integer dezena4) {
        this.dezena4 = dezena4;
    }

    public void setDezena5(Integer dezena5) {
        this.dezena5 = dezena5;
    }

    public void setDezena6(Integer dezena6) {
        this.dezena6 = dezena6;
    }

    public void setDezena7(Integer dezena7) {
        this.dezena7 = dezena7;
    }

    public void setDezena8(Integer dezena8) {
        this.dezena8 = dezena8;
    }

    public void setDezena9(Integer dezena9) {
        this.dezena9 = dezena9;
    }

    public void setDezena10(Integer dezena10) {
        this.dezena10 = dezena10;
    }

    @Override
    public String toString() {
        return "Resultado{" + "nome_time_coracao=" + nome_time_coracao + ", concurso=" + concurso + ", data_sorteio=" + data_sorteio + ", dezena1=" + dezena1 + ", dezena2=" + dezena2 + ", dezena3=" + dezena3 + ", dezena4=" + dezena4 + ", dezena5=" + dezena5 + ", dezena6=" + dezena6 + ", dezena7=" + dezena7 + ", dezena8=" + dezena8 + ", dezena9=" + dezena9 + ", dezena10=" + dezena10 + '}';
    }
    
    

 }


