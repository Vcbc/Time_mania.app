
package model;

import java.util.Date;


public class Dados_jogo {
    
     String NOME;
     String TIME;
     Date DATA;
     Integer NUM1;
     Integer NUM2;
     Integer NUM3;
     Integer NUM4;
     Integer NUM5;
     Integer NUM6;
     Integer NUM7;
     Integer NUM8;
     Integer NUM9;
     Integer NUM10;

    public Dados_jogo(String NOME, String TIME, Date DATA, Integer NUM1, Integer NUM2, Integer NUM3, Integer NUM4, Integer NUM5, Integer NUM6, Integer NUM7, Integer NUM8, Integer NUM9, Integer NUM10) {
        this.NOME = NOME;
        this.TIME = TIME;
        this.DATA = DATA;
        this.NUM1 = NUM1;
        this.NUM2 = NUM2;
        this.NUM3 = NUM3;
        this.NUM4 = NUM4;
        this.NUM5 = NUM5;
        this.NUM6 = NUM6;
        this.NUM7 = NUM7;
        this.NUM8 = NUM8;
        this.NUM9 = NUM9;
        this.NUM10 = NUM10;
    }

    public Dados_jogo() {
    }
    
    

    public String getNOME() {
       return NOME;
    }

    public String getTIME() {
        return TIME;
    }

    public Date getDATA() {
        return DATA;
    }

    public Integer getNUM1() {
        return NUM1;
    }

    public Integer getNUM2() {
        return NUM2;
    }

    public Integer getNUM3() {
        return NUM3;
    }

    public Integer getNUM4() {
        return NUM4;
    }

    public Integer getNUM5() {
        return NUM5;
    }

    public Integer getNUM6() {
        return NUM6;
    }

    public Integer getNUM7() {
        return NUM7;
    }

    public Integer getNUM8() {
        return NUM8;
    }

    public Integer getNUM9() {
        return NUM9;
    }

    public Integer getNUM10() {
        return NUM10;
    }

    public void setNOME(String NOME) {
        this.NOME = NOME;
    }

    public void setTIME(String TIME) {
        this.TIME = TIME;
    }

    public void setDATA(Date DATA) {
        this.DATA = DATA;
    }

    public void setNUM1(Integer NUM1) {
        this.NUM1 = NUM1;
    }

    public void setNUM2(Integer NUM2) {
        this.NUM2 = NUM2;
    }

    public void setNUM3(Integer NUM3) {
        this.NUM3 = NUM3;
    }

    public void setNUM4(Integer NUM4) {
        this.NUM4 = NUM4;
    }

    public void setNUM5(Integer NUM5) {
        this.NUM5 = NUM5;
    }

    public void setNUM6(Integer NUM6) {
        this.NUM6 = NUM6;
    }

    public void setNUM7(Integer NUM7) {
        this.NUM7 = NUM7;
    }

    public void setNUM8(Integer NUM8) {
        this.NUM8 = NUM8;
    }

    public void setNUM9(Integer NUM9) {
        this.NUM9 = NUM9;
    }

    public void setNUM10(Integer NUM10) {
        this.NUM10 = NUM10;
    }

    @Override
    public String toString() {
        return "Dados_jogo{" + "NOME=" + NOME + ", TIME=" + TIME + ", DATA=" + DATA + ", NUM1=" + NUM1 + ", NUM2=" + NUM2 + ", NUM3=" + NUM3 + ", NUM4=" + NUM4 + ", NUM5=" + NUM5 + ", NUM6=" + NUM6 + ", NUM7=" + NUM7 + ", NUM8=" + NUM8 + ", NUM9=" + NUM9 + ", NUM10=" + NUM10 + '}';
    }
     
     
    
}
