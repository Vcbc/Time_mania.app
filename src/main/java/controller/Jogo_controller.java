package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import util.ConnectionFactory;
import model.Dados_jogo;
import tela.Tela_gerador;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class Jogo_controller {

    Connection conexao = null;
    PreparedStatement statement = null;
    ResultSet resultado = null;

    public void validar(Dados_jogo dados) {

        String sql = " INSERT INTO info_jogos (NOME, TIME, DATA, NUM1, NUM2, NUM3, NUM4, NUM5, NUM6, NUM7, NUM8, NUM9, NUM10) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

        try {
            conexao = ConnectionFactory.getConnection();
            statement = conexao.prepareStatement(sql);
            statement.setString(1, dados.getNOME());
            statement.setString(2, dados.getTIME());
            Date data = new Date();
            SimpleDateFormat formatador = new SimpleDateFormat("yyyy/MM/dd");
            dados.setDATA(data);
            statement.setString(3, formatador.format(dados.getDATA()));
            statement.setInt(4, dados.getNUM1());
            statement.setString(5, dados.getNUM2().toString());
            statement.setString(6, dados.getNUM3().toString());
            statement.setString(7, dados.getNUM4().toString());
            statement.setString(8, dados.getNUM5().toString());
            statement.setString(9, dados.getNUM6().toString());
            statement.setString(10, dados.getNUM7().toString());
            statement.setString(11, dados.getNUM8().toString());
            statement.setString(12, dados.getNUM9().toString());
            statement.setString(13, dados.getNUM10().toString());

            statement.execute();

            JOptionPane.showMessageDialog(null, " Jogo validado! ");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

    public void buscarUltimo(Tela_gerador tela) {
        String sql = "SELECT * FROM info_jogos ORDER BY ID DESC LIMIT 1;";

        try {
            conexao = ConnectionFactory.getConnection();
            statement = conexao.prepareStatement(sql);
            resultado = statement.executeQuery();

            if (resultado.next()) {
                tela.num_jogo.setText(resultado.getString(1));
                tela.nome.setText(resultado.getString(2));
                tela.time_escolhido.setText(resultado.getString(3));
                tela.numero_1.setText(resultado.getString(5));
                tela.numero_2.setText(resultado.getString(6));
                tela.numero_3.setText(resultado.getString(7));
                tela.numero_4.setText(resultado.getString(8));
                tela.numero_5.setText(resultado.getString(9));
                tela.numero_6.setText(resultado.getString(10));
                tela.numero_7.setText(resultado.getString(11));
                tela.numero_8.setText(resultado.getString(12));
                tela.numero_9.setText(resultado.getString(13));
                tela.numero_10.setText(resultado.getString(14));
            
                
                
                
            }else{
                System.out.println("erro");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

}
