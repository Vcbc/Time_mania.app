package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import tela.Tela_gerador;
import util.ConnectionFactory;



public class Time_controller extends Tela_gerador{
    
    
    
    Connection conexao = null;
    PreparedStatement statement = null;
    ResultSet resultado = null;
    
    
    
    
    public void validar(){
            conexao = ConnectionFactory.getConnection();
            
        String sql = " INSERT INTO info_jogos (NOME, TIME, DATA, NUM1, NUM2, NUM3, NUM4, NUM5, NUM6, NUM7, NUM8, NUM9, NUM10) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
        
        try {
            statement = (PreparedStatement) conexao.prepareStatement(sql);
            
            statement.setString(1, nome.getText() );
            System.out.println("a");
            statement.setString(2, time_escolhido.getText());
            System.out.println("a");
            Date data = new Date();
            SimpleDateFormat formatador = new SimpleDateFormat("yy/MM/dd");
            statement.setString(3, formatador.format(data));
            System.out.println("a");
            statement.setString(4, numero_1.getText());
            System.out.println(numero_1.getText());
            statement.setString(5, numero_2.getText());
            statement.setString(6, numero_3.getText());
            statement.setString(7, numero_4.getText());
            statement.setString(8, numero_5.getText());
            statement.setString(9, numero_6.getText());
            statement.setString(10, numero_7.getText());
            statement.setString(11, numero_8.getText());
            statement.setString(12, numero_9.getText());
            statement.setString(13, numero_10.getText());
            
            
            
            statement.execute();
            
            JOptionPane.showMessageDialog(rootPane, " Jogo validado! ");
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
        
    }
    
    
   
        }
        
        
        
        
        
       
    
    

