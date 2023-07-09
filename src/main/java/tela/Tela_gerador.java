package tela;

import java.text.DateFormat;
import java.util.Date;
import java.util.Random;
import controller.Jogo_controller;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import javax.swing.JOptionPane;
import util.Api_resultado;
import model.Dados_jogo;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import util.ConnectionFactory;

public class Tela_gerador extends javax.swing.JFrame {

    public Tela_gerador() {
        initComponents();
        Date data = new Date();
        DateFormat formatador = DateFormat.getDateInstance(DateFormat.SHORT);
        data_jogo.setText((formatador.format(data)));
        dados.setDATA(data);
        //Api_resultado resultado = new Api_resultado();
        //resultado.request();
    }
    Connection conexao = null;
    Dados_jogo dados = new Dados_jogo();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        numero_1 = new javax.swing.JTextField();
        numero_2 = new javax.swing.JTextField();
        numero_3 = new javax.swing.JTextField();
        numero_4 = new javax.swing.JTextField();
        numero_5 = new javax.swing.JTextField();
        numero_6 = new javax.swing.JTextField();
        numero_7 = new javax.swing.JTextField();
        numero_8 = new javax.swing.JTextField();
        numero_9 = new javax.swing.JTextField();
        numero_10 = new javax.swing.JTextField();
        botao_num_aleatorio = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        NumeroTime = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        num_jogo = new javax.swing.JTextField();
        time_escolhido = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        data_jogo = new javax.swing.JLabel();
        validaJogo = new javax.swing.JButton();
        imprimirJogo = new javax.swing.JButton();
        resultado = new javax.swing.JButton();
        botao_selecionar_time = new javax.swing.JButton();
        botao_time_aleatorio = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Time Mania");
        setBackground(java.awt.Color.white);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jPanel3.setBackground(new java.awt.Color(244, 236, 36));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(32, 152, 82));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TIMEMANIA");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(459, 459, 459)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel1.setBackground(java.awt.Color.white);

        numero_1.setEditable(false);
        numero_1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        numero_1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numero_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        numero_2.setEditable(false);
        numero_2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        numero_2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numero_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        numero_3.setEditable(false);
        numero_3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        numero_3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numero_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        numero_4.setEditable(false);
        numero_4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        numero_4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numero_4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        numero_5.setEditable(false);
        numero_5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        numero_5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numero_5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        numero_6.setEditable(false);
        numero_6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        numero_6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numero_6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        numero_7.setEditable(false);
        numero_7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        numero_7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numero_7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        numero_8.setEditable(false);
        numero_8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        numero_8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numero_8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        numero_9.setEditable(false);
        numero_9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        numero_9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numero_9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        numero_10.setEditable(false);
        numero_10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        numero_10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numero_10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        botao_num_aleatorio.setBackground(new java.awt.Color(32, 152, 82));
        botao_num_aleatorio.setForeground(java.awt.Color.white);
        botao_num_aleatorio.setText("GERAR NÚMEROS ");
        botao_num_aleatorio.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        botao_num_aleatorio.setBorderPainted(false);
        botao_num_aleatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_num_aleatorioMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(32, 152, 82));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Gerador de números automático");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/times12_03.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(32, 152, 82));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Selecione seu time do coração pelo N°");

        NumeroTime.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        NumeroTime.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel4.setBackground(new java.awt.Color(32, 152, 82));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Dados do Jogo");

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("NOME");

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setText("DATA");

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel8.setForeground(java.awt.Color.white);
        jLabel8.setText("JOGO");

        num_jogo.setEditable(false);

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel9.setForeground(java.awt.Color.white);
        jLabel9.setText("TIME");

        data_jogo.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        data_jogo.setForeground(java.awt.Color.white);

        validaJogo.setBackground(new java.awt.Color(244, 236, 36));
        validaJogo.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        validaJogo.setText("Validar Jogo");
        validaJogo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        validaJogo.setBorderPainted(false);
        validaJogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                validaJogoMouseClicked(evt);
            }
        });

        imprimirJogo.setBackground(new java.awt.Color(244, 236, 36));
        imprimirJogo.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        imprimirJogo.setText("Imprimir Jogo");
        imprimirJogo.setBorderPainted(false);
        imprimirJogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imprimirJogoMouseClicked(evt);
            }
        });

        resultado.setBackground(new java.awt.Color(244, 236, 36));
        resultado.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        resultado.setText("Resultados");
        resultado.setBorderPainted(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(data_jogo, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(num_jogo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(validaJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(time_escolhido, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 491, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(resultado, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                            .addComponent(imprimirJogo, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(num_jogo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(validaJogo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(time_escolhido, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(imprimirJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(data_jogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(3, 3, 3)))))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        botao_selecionar_time.setBackground(new java.awt.Color(32, 152, 82));
        botao_selecionar_time.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        botao_selecionar_time.setForeground(java.awt.Color.white);
        botao_selecionar_time.setText("ESCOLHER");
        botao_selecionar_time.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        botao_selecionar_time.setBorderPainted(false);
        botao_selecionar_time.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botao_selecionar_time.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_selecionar_timeMouseClicked(evt);
            }
        });

        botao_time_aleatorio.setBackground(new java.awt.Color(32, 152, 82));
        botao_time_aleatorio.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        botao_time_aleatorio.setForeground(java.awt.Color.white);
        botao_time_aleatorio.setText("NA SORTE");
        botao_time_aleatorio.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        botao_time_aleatorio.setBorderPainted(false);
        botao_time_aleatorio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botao_time_aleatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_time_aleatorioMouseClicked(evt);
            }
        });

        jLabel10.setText("*Para validar o n° do time, clique no botão ESCOLHER");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numero_6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numero_1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numero_2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numero_7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numero_3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numero_8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numero_4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numero_9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numero_5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numero_10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(botao_num_aleatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NumeroTime, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(botao_time_aleatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botao_selecionar_time, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(127, Short.MAX_VALUE))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(numero_1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numero_2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numero_3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numero_4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numero_5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(numero_6)
                            .addComponent(numero_7)
                            .addComponent(numero_8)
                            .addComponent(numero_9)
                            .addComponent(numero_10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addComponent(botao_num_aleatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(173, 173, 173))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(NumeroTime, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(botao_time_aleatorio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(botao_selecionar_time, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botao_num_aleatorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_num_aleatorioMouseClicked
        limpaTela();
        gerarNum();
    }//GEN-LAST:event_botao_num_aleatorioMouseClicked

    private void botao_selecionar_timeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_selecionar_timeMouseClicked
        Escolha_Time();
    }//GEN-LAST:event_botao_selecionar_timeMouseClicked

    private void botao_time_aleatorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_time_aleatorioMouseClicked
        Escolha_Time();
        time_escolhido.setText(null);
        Random random = new Random();
        int time_aleatorio = random.nextInt(80);
        NumeroTime.setText(String.valueOf(time_aleatorio));
    }//GEN-LAST:event_botao_time_aleatorioMouseClicked

    private void validaJogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_validaJogoMouseClicked
        dados.setNOME(nome.getText());
        Jogo_controller controle = new Jogo_controller();
        controle.validar(dados);
        limpaTela();
    }//GEN-LAST:event_validaJogoMouseClicked

    private void imprimirJogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imprimirJogoMouseClicked
        conexao = ConnectionFactory.getConnection();
        Jogo_controller controle = new Jogo_controller();
        controle.buscarUltimo(this);

        try {
            HashMap filtro = new HashMap();
            filtro.put("ID",Integer.parseInt(num_jogo.getText()));
            JasperPrint print = JasperFillManager.fillReport("C:/Reports/DadosDoJogo.jasper", filtro, conexao);

            JasperViewer.viewReport(print, false);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }


    }//GEN-LAST:event_imprimirJogoMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela_gerador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_gerador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_gerador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_gerador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_gerador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField NumeroTime;
    private javax.swing.JButton botao_num_aleatorio;
    private javax.swing.JButton botao_selecionar_time;
    private javax.swing.JButton botao_time_aleatorio;
    public javax.swing.JLabel data_jogo;
    private javax.swing.JButton imprimirJogo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    public javax.swing.JTextField nome;
    public javax.swing.JTextField num_jogo;
    public javax.swing.JTextField numero_1;
    public javax.swing.JTextField numero_10;
    public javax.swing.JTextField numero_2;
    public javax.swing.JTextField numero_3;
    public javax.swing.JTextField numero_4;
    public javax.swing.JTextField numero_5;
    public javax.swing.JTextField numero_6;
    public javax.swing.JTextField numero_7;
    public javax.swing.JTextField numero_8;
    public javax.swing.JTextField numero_9;
    private javax.swing.JButton resultado;
    public javax.swing.JTextField time_escolhido;
    public javax.swing.JButton validaJogo;
    // End of variables declaration//GEN-END:variables

    public void gerarNum() {
        Random random = new Random();
        Set numeros = new TreeSet();

        do {
            numeros.add(random.nextInt(81));
        } while (numeros.size() < 10);

        List<Integer> posicao = new ArrayList();
        {
            posicao.addAll(numeros);

            Integer num1 = posicao.get(0);
            numero_1.setText(String.valueOf(num1));
            dados.setNUM1(Integer.parseInt(numero_1.getText()));
            Integer num2 = posicao.get(1);
            numero_2.setText(String.valueOf(num2));
            dados.setNUM2(Integer.parseInt(numero_2.getText()));
            Integer num3 = posicao.get(2);
            numero_3.setText(String.valueOf(num3));
            dados.setNUM3(Integer.parseInt(numero_3.getText()));
            Integer num4 = posicao.get(3);
            numero_4.setText(String.valueOf(num4));
            dados.setNUM4(Integer.parseInt(numero_4.getText()));
            Integer num5 = posicao.get(4);
            numero_5.setText(String.valueOf(num5));
            dados.setNUM5(Integer.parseInt(numero_5.getText()));
            Integer num6 = posicao.get(5);
            numero_6.setText(String.valueOf(num6));
            dados.setNUM6(Integer.parseInt(numero_6.getText()));
            Integer num7 = posicao.get(6);
            numero_7.setText(String.valueOf(num7));
            dados.setNUM7(Integer.parseInt(numero_7.getText()));
            Integer num8 = posicao.get(7);
            numero_8.setText(String.valueOf(num8));
            dados.setNUM8(Integer.parseInt(numero_8.getText()));
            Integer num9 = posicao.get(8);
            numero_9.setText(String.valueOf(num9));
            dados.setNUM9(Integer.parseInt(numero_9.getText()));
            Integer num10 = posicao.get(9);
            numero_10.setText(String.valueOf(num10));
            dados.setNUM10(Integer.parseInt(numero_10.getText()));
            System.out.println(posicao);

        }

    }

    public String Escolha_Time() {

        String Time_coracao = NumeroTime.getText();

        switch (Time_coracao) {

            case "1":
                Time_coracao = "ABC";
                break;

            case "2":
                Time_coracao = "ALTOS";
                break;

            case "3":
                Time_coracao = "AMÉRICA - MG";
                break;

            case "4":
                Time_coracao = "AMÉRICA - RN";
                break;

            case "5":
                Time_coracao = "APARECIDENSE";
                break;

            case "6":
                Time_coracao = "ATHLÉTICO - PR";
                break;

            case "7":
                Time_coracao = "ATLÉTICO - AC";
                break;

            case "8":
                Time_coracao = "ATLÉTICO - CE";
                break;

            case "9":
                Time_coracao = "ATLÉTICO - GO";
                break;

            case "10":
                Time_coracao = "ATLÉTICO - MG";
                break;

            case "11":
                Time_coracao = "AVAÍ";
                break;

            case "12":
                Time_coracao = "BAHIA";
                break;

            case "13":
                Time_coracao = "BOA ESPORTE";
                break;

            case "14":
                Time_coracao = "BOAVISTA";
                break;

            case "15":
                Time_coracao = "BOTAFOGO - PB";
                break;

            case "16":
                Time_coracao = "BOTAFOGO - RJ ";
                break;

            case "17":
                Time_coracao = "BOTAFOGO - SP";
                break;

            case "18":
                Time_coracao = "BRAGANTINO";
                break;

            case "19":
                Time_coracao = "BRASIL";
                break;

            case "20":
                Time_coracao = "BRASILIENSE";
                break;

            case "21":
                Time_coracao = "BRUSQUE";
                break;

            case "22":
                Time_coracao = "CAMPINENSE";
                break;

            case "23":
                Time_coracao = "CAXIAS";
                break;

            case "24":
                Time_coracao = "CEARÁ";
                break;

            case "25":
                Time_coracao = "CHAPECOENSE";
                break;

            case "26":
                Time_coracao = "CIANORTE";
                break;

            case "27":
                Time_coracao = "CONFIANÇA";
                break;

            case "28":
                Time_coracao = "CORINTHIANS";
                break;

            case "29":
                Time_coracao = "CORITIBA";
                break;

            case "30":
                Time_coracao = "CRB";
                break;

            case "31":
                Time_coracao = "CRICIÚMA";
                break;

            case "32":
                Time_coracao = "CRUZEIRO";
                break;

            case "33":
                Time_coracao = "CSA";
                break;

            case "34":
                Time_coracao = "CUIABÁ";
                break;

            case "35":
                Time_coracao = "FERROVIÁRIA - SP";
                break;

            case "36":
                Time_coracao = "FERROVIÁRIO - CE";
                break;

            case "37":
                Time_coracao = "FIGUEIRENSE";
                break;

            case "38":
                Time_coracao = "FLAMENGO";
                break;

            case "39":
                Time_coracao = "FLORESTA";
                break;

            case "40":
                Time_coracao = "FLUMINENSE";
                break;

            case "41":
                Time_coracao = "FORTALEZA";
                break;

            case "42":
                Time_coracao = "GOIÁS";
                break;

            case "43":
                Time_coracao = "GRÊMIO";
                break;

            case "44":
                Time_coracao = "GUARANI";
                break;

            case "45":
                Time_coracao = "IMPERATRIZ";
                break;

            case "46":
                Time_coracao = "INTERNACIONAL";
                break;

            case "47":
                Time_coracao = "ITUANO";
                break;

            case "48":
                Time_coracao = "JACUIPENSE";
                break;

            case "49":
                Time_coracao = "JOINVILLE";
                break;

            case "50":
                Time_coracao = "JUAZEIRENSE";
                break;

            case "51":
                Time_coracao = "JUVENTUDE";
                break;

            case "52":
                Time_coracao = "LONDRINA";
                break;

            case "53":
                Time_coracao = "LUVERDENSE";
                break;

            case "54":
                Time_coracao = "MANAUS";
                break;

            case "55":
                Time_coracao = "MIRASSOL";
                break;

            case "56":
                Time_coracao = "MOTO CLUB";
                break;

            case "57":
                Time_coracao = "NÁUTICO";
                break;

            case "58":
                Time_coracao = "NOVORIZONTINO";
                break;

            case "59":
                Time_coracao = "OESTE";
                break;

            case "60":
                Time_coracao = "OPERÁRIO";
                break;

            case "61":
                Time_coracao = "PALMEIRAS";
                break;

            case "62":
                Time_coracao = "PARANÁ";
                break;

            case "63":
                Time_coracao = "PAYSANDÚ";
                break;

            case "64":
                Time_coracao = "PONTE PRETA";
                break;

            case "65":
                Time_coracao = "REMO";
                break;

            case "66":
                Time_coracao = "SAMPAIO CORRÊA";
                break;

            case "67":
                Time_coracao = "SANTA CRUZ";
                break;

            case "68":
                Time_coracao = "SANTOS";
                break;

            case "69":
                Time_coracao = "SÃO BENTO";
                break;

            case "70":
                Time_coracao = "SÃO JOSÉ";
                break;

            case "71":
                Time_coracao = "SÃO PAULO";
                break;

            case "72":
                Time_coracao = "SÃO RAIMUNDO";
                break;

            case "73":
                Time_coracao = "SPORT";
                break;

            case "74":
                Time_coracao = "TOMBENSE";
                break;

            case "75":
                Time_coracao = "TREZE";
                break;

            case "76":
                Time_coracao = "VASCO";
                break;

            case "77":
                Time_coracao = "VILA NOVA";
                break;

            case "78":
                Time_coracao = "VITÓRIA";
                break;

            case "79":
                Time_coracao = "VOLTA REDONDA";
                break;

            case "80":
                Time_coracao = "YPIRANGA";
                break;
        }

        time_escolhido.setText(Time_coracao);
        dados.setTIME(time_escolhido.getText());
        return Time_coracao;
    }

    public void limpaTela() {
        num_jogo.setText("");
        nome.setText("");
        NumeroTime.setText("");
        numero_1.setText("");
        numero_2.setText("");
        numero_3.setText("");
        numero_4.setText("");
        numero_5.setText("");
        numero_6.setText("");
        numero_7.setText("");
        numero_8.setText("");
        numero_9.setText("");
        numero_10.setText("");
        time_escolhido.setText("");
    }
}
