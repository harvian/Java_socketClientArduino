/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socketclient;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;
import javax.swing.JOptionPane;
/**
 *
 * @author Harvian
 */
public class Tela extends javax.swing.JFrame {

    String ipservidor;
    String estado1 = "desligado";
    String estado2 = "desligado";
    String estado3 = "desligado";

     /**
     * Creates new form Tela
     */
    public Tela() {
        initComponents();
        jLabel1.setText("Desligado");
        jLabel2.setText("Desligado");
        jLabel3.setText("Desligado");
        jLabel4.setText("Desligado");
        jLabel5.setText("Desligado");
        jLabel6.setText("Desligado");
        
        ipservidor = JOptionPane.showInputDialog("Digite o endereço ip do Servidor:");
        
       /* try {
 
            Socket client = new Socket(ipservidor, 40000);
            DataOutputStream outToServer = new DataOutputStream(client.getOutputStream());
            BufferedReader inFromServer = new BufferedReader(new InputStreamReader(client.getInputStream()));
            outToServer.writeBytes("atualiza1" + "\n");
            String recebidoSrv = inFromServer.readLine();
            client.close();
            jLabel1.setText(recebidoSrv);
       
       } catch (UnknownHostException e) {
           System.out.println("nao foi possivel conectar ao servidor!");

       } catch (IOException e) {
           System.out.println("Ocorreu um erro!");
       }
       
       try {
 
            Socket client = new Socket(ipservidor, 40000);
            DataOutputStream outToServer = new DataOutputStream(client.getOutputStream());
            BufferedReader inFromServer = new BufferedReader(new InputStreamReader(client.getInputStream()));
            outToServer.writeBytes("atualiza2" + "\n");
            String recebidoSrv = inFromServer.readLine();
            client.close();
            jLabel2.setText(recebidoSrv);
       
       } catch (UnknownHostException e) {
           System.out.println("nao foi possivel conectar ao servidor!");

       } catch (IOException e) {
           System.out.println("Ocorreu um erro!");
       }
       
       try {
 
            Socket client = new Socket(ipservidor, 40000);
            DataOutputStream outToServer = new DataOutputStream(client.getOutputStream());
            BufferedReader inFromServer = new BufferedReader(new InputStreamReader(client.getInputStream()));
            outToServer.writeBytes("atualiza3" + "\n");
            String recebidoSrv = inFromServer.readLine();
            client.close();
            jLabel3.setText(recebidoSrv);
       
       } catch (UnknownHostException e) {
           System.out.println("nao foi possivel conectar ao servidor!");

       } catch (IOException e) {
           System.out.println("Ocorreu um erro!");
       }
       
       try {
 
            Socket client = new Socket(ipservidor, 40000);
            DataOutputStream outToServer = new DataOutputStream(client.getOutputStream());
            BufferedReader inFromServer = new BufferedReader(new InputStreamReader(client.getInputStream()));
            outToServer.writeBytes("atualiza4" + "\n");
            String recebidoSrv = inFromServer.readLine();
            client.close();
            jLabel4.setText(recebidoSrv);
       
       } catch (UnknownHostException e) {
           System.out.println("nao foi possivel conectar ao servidor!");

       } catch (IOException e) {
           System.out.println("Ocorreu um erro!");
       }
       
       try {
 
            Socket client = new Socket(ipservidor, 40000);
            DataOutputStream outToServer = new DataOutputStream(client.getOutputStream());
            BufferedReader inFromServer = new BufferedReader(new InputStreamReader(client.getInputStream()));
            outToServer.writeBytes("atualiza5" + "\n");
            String recebidoSrv = inFromServer.readLine();
            client.close();
            jLabel5.setText(recebidoSrv);
       
       } catch (UnknownHostException e) {
           System.out.println("nao foi possivel conectar ao servidor!");

       } catch (IOException e) {
           System.out.println("Ocorreu um erro!");
       }
       
       try {
 
            Socket client = new Socket(ipservidor, 40000);
            DataOutputStream outToServer = new DataOutputStream(client.getOutputStream());
            BufferedReader inFromServer = new BufferedReader(new InputStreamReader(client.getInputStream()));
            outToServer.writeBytes("atualiza6" + "\n");
            String recebidoSrv = inFromServer.readLine();
            client.close();
            jLabel6.setText(recebidoSrv);
       
       } catch (UnknownHostException e) {
           System.out.println("nao foi possivel conectar ao servidor!");

       } catch (IOException e) {
           System.out.println("Ocorreu um erro!");
       }
       
       try {
 
            Socket client = new Socket(ipservidor, 40000);
            DataOutputStream outToServer = new DataOutputStream(client.getOutputStream());
            BufferedReader inFromServer = new BufferedReader(new InputStreamReader(client.getInputStream()));
            outToServer.writeBytes("atualizaPwm1" + "\n");
            String recebidoSrv = inFromServer.readLine();
            client.close();
            slider1.setValue(Integer.parseInt(recebidoSrv));
       
       } catch (UnknownHostException e) {
           System.out.println("nao foi possivel conectar ao servidor!");

       } catch (IOException e) {
           System.out.println("Ocorreu um erro!");
       }
       
       try {
 
            Socket client = new Socket(ipservidor, 40000);
            DataOutputStream outToServer = new DataOutputStream(client.getOutputStream());
            BufferedReader inFromServer = new BufferedReader(new InputStreamReader(client.getInputStream()));
            outToServer.writeBytes("atualizaPwm2" + "\n");
            String recebidoSrv = inFromServer.readLine();
            client.close();
            slider2.setValue(Integer.parseInt(recebidoSrv));
       
       } catch (UnknownHostException e) {
           System.out.println("nao foi possivel conectar ao servidor!");

       } catch (IOException e) {
           System.out.println("Ocorreu um erro!");
       }
       
       try {
 
            Socket client = new Socket(ipservidor, 40000);
            DataOutputStream outToServer = new DataOutputStream(client.getOutputStream());
            BufferedReader inFromServer = new BufferedReader(new InputStreamReader(client.getInputStream()));
            outToServer.writeBytes("atualizaPwm3" + "\n");
            String recebidoSrv = inFromServer.readLine();
            client.close();
            slider3.setValue(Integer.parseInt(recebidoSrv));
       
       } catch (UnknownHostException e) {
           System.out.println("nao foi possivel conectar ao servidor!");

       } catch (IOException e) {
           System.out.println("Ocorreu um erro!");
       }
       
       try {
 
            Socket client = new Socket(ipservidor, 40000);
            DataOutputStream outToServer = new DataOutputStream(client.getOutputStream());
            BufferedReader inFromServer = new BufferedReader(new InputStreamReader(client.getInputStream()));
            outToServer.writeBytes("atualizaPwm3" + "\n");
            String recebidoSrv = inFromServer.readLine();
            client.close();
            slider3.setValue(Integer.parseInt(recebidoSrv));
       
       } catch (UnknownHostException e) {
           System.out.println("nao foi possivel conectar ao servidor!");

       } catch (IOException e) {
           System.out.println("Ocorreu um erro!");
       }
       
       try {
 
            Socket client = new Socket(ipservidor, 40000);
            DataOutputStream outToServer = new DataOutputStream(client.getOutputStream());
            BufferedReader inFromServer = new BufferedReader(new InputStreamReader(client.getInputStream()));
            outToServer.writeBytes("atualizaPwm4" + "\n");
            String recebidoSrv = inFromServer.readLine();
            client.close();
            slider4.setValue(Integer.parseInt(recebidoSrv));
       
       } catch (UnknownHostException e) {
           System.out.println("nao foi possivel conectar ao servidor!");

       } catch (IOException e) {
           System.out.println("Ocorreu um erro!");
       }
       
       try {
 
            Socket client = new Socket(ipservidor, 40000);
            DataOutputStream outToServer = new DataOutputStream(client.getOutputStream());
            BufferedReader inFromServer = new BufferedReader(new InputStreamReader(client.getInputStream()));
            outToServer.writeBytes("atualizaPwm5" + "\n");
            String recebidoSrv = inFromServer.readLine();
            client.close();
            slider5.setValue(Integer.parseInt(recebidoSrv));
       
       } catch (UnknownHostException e) {
           System.out.println("nao foi possivel conectar ao servidor!");

       } catch (IOException e) {
           System.out.println("Ocorreu um erro!");
       }
       
       try {
 
            Socket client = new Socket(ipservidor, 40000);
            DataOutputStream outToServer = new DataOutputStream(client.getOutputStream());
            BufferedReader inFromServer = new BufferedReader(new InputStreamReader(client.getInputStream()));
            outToServer.writeBytes("atualizaPwm6" + "\n");
            String recebidoSrv = inFromServer.readLine();
            client.close();
            slider6.setValue(Integer.parseInt(recebidoSrv));
       
       } catch (UnknownHostException e) {
           System.out.println("nao foi possivel conectar ao servidor!");
           JOptionPane.showMessageDialog(null,"Comando não enviado, erro de comunicação!");

       } catch (IOException e) {
           System.out.println("Ocorreu um erro!");
           JOptionPane.showMessageDialog(null,"Comando não enviado, erro de comunicação!");
       }*/
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botao1 = new javax.swing.JButton();
        botao2 = new javax.swing.JButton();
        botao3 = new javax.swing.JButton();
        botaoSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        botaoAtualiza = new javax.swing.JButton();
        slider1 = new javax.swing.JSlider();
        botao4 = new javax.swing.JButton();
        botao5 = new javax.swing.JButton();
        botao6 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        slider2 = new javax.swing.JSlider();
        slider3 = new javax.swing.JSlider();
        slider4 = new javax.swing.JSlider();
        slider5 = new javax.swing.JSlider();
        slider6 = new javax.swing.JSlider();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botao1.setText("Pino 2");
        botao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao1ActionPerformed(evt);
            }
        });

        botao2.setText("Pino 4");
        botao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao2ActionPerformed(evt);
            }
        });

        botao3.setText("Pino 7");
        botao3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao3ActionPerformed(evt);
            }
        });

        botaoSair.setText("Sair");
        botaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairActionPerformed(evt);
            }
        });

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        jLabel3.setText("jLabel3");

        botaoAtualiza.setText("Atualizar");
        botaoAtualiza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAtualizaActionPerformed(evt);
            }
        });

        slider1.setMaximum(255);
        slider1.setPaintTicks(true);
        slider1.setValue(0);
        slider1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slider1MouseReleased(evt);
            }
        });
        slider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slider1StateChanged(evt);
            }
        });

        botao4.setText("Pino 8");
        botao4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao4ActionPerformed(evt);
            }
        });

        botao5.setText("Pino 12");
        botao5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao5ActionPerformed(evt);
            }
        });

        botao6.setText("Pino 13");
        botao6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao6ActionPerformed(evt);
            }
        });

        jLabel4.setText("jLabel4");

        jLabel5.setText("jLabel5");

        jLabel6.setText("jLabel6");

        slider2.setMaximum(255);
        slider2.setPaintTicks(true);
        slider2.setValue(0);
        slider2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slider2StateChanged(evt);
            }
        });

        slider3.setMaximum(255);
        slider3.setPaintTicks(true);
        slider3.setValue(0);
        slider3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slider3StateChanged(evt);
            }
        });

        slider4.setMaximum(255);
        slider4.setPaintTicks(true);
        slider4.setValue(0);
        slider4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slider4StateChanged(evt);
            }
        });

        slider5.setMaximum(255);
        slider5.setPaintTicks(true);
        slider5.setValue(0);
        slider5.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slider5StateChanged(evt);
            }
        });

        slider6.setMaximum(255);
        slider6.setPaintTicks(true);
        slider6.setValue(0);
        slider6.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slider6StateChanged(evt);
            }
        });

        jLabel7.setText("PWM 3");

        jLabel8.setText("PWM 5");

        jLabel9.setText("PWM 6");

        jLabel10.setText("PWM 9");

        jLabel11.setText("PWM 10");

        jLabel12.setText("PWM 11");

        jLabel13.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel13.setText("Controle de pinos do Arduino (Socket)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(332, 332, 332)
                        .addComponent(botaoAtualiza)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoSair))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(botao2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botao4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botao5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botao3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botao6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(botao1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel11)
                                .addComponent(jLabel12))
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(slider3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(slider4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(slider5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(slider6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(slider1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(slider2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(118, 118, 118))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botao1)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botao2)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botao3)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botao4)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botao5)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botao6)
                            .addComponent(jLabel6)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(slider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(slider2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(slider3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9)))
                                    .addComponent(jLabel8)))
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(slider4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(slider5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(slider6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoAtualiza)
                    .addComponent(botaoSair))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao1ActionPerformed
        System.out.println("Pressionado Botão 1");
              
            try {
            // Cria um Socket cliente passando como parâmetro o ip e a porta do servidor   
            Socket client = new Socket(ipservidor, 40000);
            // Cria um stream de saída 
            DataOutputStream outToServer = new DataOutputStream(client.getOutputStream());
            // Cria um buffer que armazenará as informações retornadas pelo servidor
            BufferedReader inFromServer = new BufferedReader(new InputStreamReader(client.getInputStream()));
            // Disponibiliza as informações contidas em "dadosaEnviar" para a stream de saída do cliente
            outToServer.writeBytes("pino2" + "\n");
            // Atribui as informações recebidas pelo servidor na variável "recebidoSrv"
            String recebidoSrv = inFromServer.readLine();
            // Imprime no console do cliente a informação retornada pelo servidor
            //System.out.println("Mensagem do servidor: "+"'" + recebidoSrv + "'");
            // Fecha o Socket
            client.close();   
            jLabel1.setText(recebidoSrv);
       } catch (UnknownHostException e) {
           System.out.println("nao foi possivel conectar ao servidor!");
           JOptionPane.showMessageDialog(null,"Comando não enviado, erro de comunicação!");

       } catch (IOException e) {
           System.out.println("Ocorreu um erro!");
           JOptionPane.showMessageDialog(null,"Comando não enviado, erro de comunicação!");
       }  
    }//GEN-LAST:event_botao1ActionPerformed

    private void botao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao2ActionPerformed
        System.out.println("Pressionado Botão 2");
        try {
            // Cria um Socket cliente passando como parâmetro o ip e a porta do servidor   
            Socket client = new Socket(ipservidor, 40000);
            // Cria um stream de saída 
            DataOutputStream outToServer = new DataOutputStream(client.getOutputStream());
            // Cria um buffer que armazenará as informações retornadas pelo servidor
            BufferedReader inFromServer = new BufferedReader(new InputStreamReader(client.getInputStream()));
            // Disponibiliza as informações contidas em "dadosaEnviar" para a stream de saída do cliente
            outToServer.writeBytes("pino4" + "\n");
            // Atribui as informações recebidas pelo servidor na variável "recebidoSrv"
            String recebidoSrv = inFromServer.readLine();
            // Imprime no console do cliente a informação retornada pelo servidor
            //System.out.println("Mensagem do servidor: "+"'" + recebidoSrv + "'");
            // Fecha o Socket
            client.close();   
            jLabel2.setText(recebidoSrv);
       } catch (UnknownHostException e) {
           System.out.println("nao foi possivel conectar ao servidor!");
           JOptionPane.showMessageDialog(null,"Comando não enviado, erro de comunicação!");

       } catch (IOException e) {
           System.out.println("Ocorreu um erro!");
           JOptionPane.showMessageDialog(null,"Comando não enviado, erro de comunicação!");

       }
    }//GEN-LAST:event_botao2ActionPerformed

    private void botao3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao3ActionPerformed
        System.out.println("Pressionado Botão 3");
        
        //jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/socketclient/cinza-glossy.jpg"))); // NOI18N
        
        try {
            // Cria um Socket cliente passando como parâmetro o ip e a porta do servidor   
            Socket client = new Socket(ipservidor, 40000);
            // Cria um stream de saída 
            DataOutputStream outToServer = new DataOutputStream(client.getOutputStream());
            // Cria um buffer que armazenará as informações retornadas pelo servidor
            BufferedReader inFromServer = new BufferedReader(new InputStreamReader(client.getInputStream()));
            // Disponibiliza as informações contidas em "dadosaEnviar" para a stream de saída do cliente
            outToServer.writeBytes("pino7" + "\n");
            // Atribui as informações recebidas pelo servidor na variável "recebidoSrv"
            String recebidoSrv = inFromServer.readLine();
            // Imprime no console do cliente a informação retornada pelo servidor
            //System.out.println("Mensagem do servidor: "+"'" + recebidoSrv + "'");
            // Fecha o Socket
            client.close();
            jLabel3.setText(recebidoSrv);

       } catch (UnknownHostException e) {
           System.out.println("nao foi possivel conectar ao servidor!");
           JOptionPane.showMessageDialog(null,"Comando não enviado, erro de comunicação!");

       } catch (IOException e) {
           System.out.println("Ocorreu um erro!");
           JOptionPane.showMessageDialog(null,"Comando não enviado, erro de comunicação!");
       }
    }//GEN-LAST:event_botao3ActionPerformed

    private void botaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botaoSairActionPerformed

    private void botaoAtualizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAtualizaActionPerformed

        try {
 
            Socket client = new Socket(ipservidor, 40000);
            DataOutputStream outToServer = new DataOutputStream(client.getOutputStream());
            BufferedReader inFromServer = new BufferedReader(new InputStreamReader(client.getInputStream()));
            outToServer.writeBytes("atualiza1" + "\n");
            String recebidoSrv = inFromServer.readLine();
            client.close();
            jLabel1.setText(recebidoSrv);
       
       } catch (UnknownHostException e) {
           System.out.println("nao foi possivel conectar ao servidor!");

       } catch (IOException e) {
           System.out.println("Ocorreu um erro!");
       }
       
       try {
 
            Socket client = new Socket(ipservidor, 40000);
            DataOutputStream outToServer = new DataOutputStream(client.getOutputStream());
            BufferedReader inFromServer = new BufferedReader(new InputStreamReader(client.getInputStream()));
            outToServer.writeBytes("atualiza2" + "\n");
            String recebidoSrv = inFromServer.readLine();
            client.close();
            jLabel2.setText(recebidoSrv);
       
       } catch (UnknownHostException e) {
           System.out.println("nao foi possivel conectar ao servidor!");

       } catch (IOException e) {
           System.out.println("Ocorreu um erro!");
       }
       
       try {
 
            Socket client = new Socket(ipservidor, 40000);
            DataOutputStream outToServer = new DataOutputStream(client.getOutputStream());
            BufferedReader inFromServer = new BufferedReader(new InputStreamReader(client.getInputStream()));
            outToServer.writeBytes("atualiza3" + "\n");
            String recebidoSrv = inFromServer.readLine();
            client.close();
            jLabel3.setText(recebidoSrv);
       
       } catch (UnknownHostException e) {
           System.out.println("nao foi possivel conectar ao servidor!");

       } catch (IOException e) {
           System.out.println("Ocorreu um erro!");
       }
       
       try {
 
            Socket client = new Socket(ipservidor, 40000);
            DataOutputStream outToServer = new DataOutputStream(client.getOutputStream());
            BufferedReader inFromServer = new BufferedReader(new InputStreamReader(client.getInputStream()));
            outToServer.writeBytes("atualiza4" + "\n");
            String recebidoSrv = inFromServer.readLine();
            client.close();
            jLabel4.setText(recebidoSrv);
       
       } catch (UnknownHostException e) {
           System.out.println("nao foi possivel conectar ao servidor!");

       } catch (IOException e) {
           System.out.println("Ocorreu um erro!");
       }
       
       try {
 
            Socket client = new Socket(ipservidor, 40000);
            DataOutputStream outToServer = new DataOutputStream(client.getOutputStream());
            BufferedReader inFromServer = new BufferedReader(new InputStreamReader(client.getInputStream()));
            outToServer.writeBytes("atualiza5" + "\n");
            String recebidoSrv = inFromServer.readLine();
            client.close();
            jLabel5.setText(recebidoSrv);
       
       } catch (UnknownHostException e) {
           System.out.println("nao foi possivel conectar ao servidor!");

       } catch (IOException e) {
           System.out.println("Ocorreu um erro!");
       }
       
       try {
 
            Socket client = new Socket(ipservidor, 40000);
            DataOutputStream outToServer = new DataOutputStream(client.getOutputStream());
            BufferedReader inFromServer = new BufferedReader(new InputStreamReader(client.getInputStream()));
            outToServer.writeBytes("atualiza6" + "\n");
            String recebidoSrv = inFromServer.readLine();
            client.close();
            jLabel6.setText(recebidoSrv);
       
       } catch (UnknownHostException e) {
           System.out.println("nao foi possivel conectar ao servidor!");

       } catch (IOException e) {
           System.out.println("Ocorreu um erro!");
       }
       
       try {
 
            Socket client = new Socket(ipservidor, 40000);
            DataOutputStream outToServer = new DataOutputStream(client.getOutputStream());
            BufferedReader inFromServer = new BufferedReader(new InputStreamReader(client.getInputStream()));
            outToServer.writeBytes("atualizaPwm1" + "\n");
            String recebidoSrv = inFromServer.readLine();
            client.close();
            slider1.setValue(Integer.parseInt(recebidoSrv));
       
       } catch (UnknownHostException e) {
           System.out.println("nao foi possivel conectar ao servidor!");

       } catch (IOException e) {
           System.out.println("Ocorreu um erro!");
       }
       
       try {
 
            Socket client = new Socket(ipservidor, 40000);
            DataOutputStream outToServer = new DataOutputStream(client.getOutputStream());
            BufferedReader inFromServer = new BufferedReader(new InputStreamReader(client.getInputStream()));
            outToServer.writeBytes("atualizaPwm2" + "\n");
            String recebidoSrv = inFromServer.readLine();
            client.close();
            slider2.setValue(Integer.parseInt(recebidoSrv));
       
       } catch (UnknownHostException e) {
           System.out.println("nao foi possivel conectar ao servidor!");

       } catch (IOException e) {
           System.out.println("Ocorreu um erro!");
       }
       
       try {
 
            Socket client = new Socket(ipservidor, 40000);
            DataOutputStream outToServer = new DataOutputStream(client.getOutputStream());
            BufferedReader inFromServer = new BufferedReader(new InputStreamReader(client.getInputStream()));
            outToServer.writeBytes("atualizaPwm3" + "\n");
            String recebidoSrv = inFromServer.readLine();
            client.close();
            slider3.setValue(Integer.parseInt(recebidoSrv));
       
       } catch (UnknownHostException e) {
           System.out.println("nao foi possivel conectar ao servidor!");

       } catch (IOException e) {
           System.out.println("Ocorreu um erro!");
       }
       
       try {
 
            Socket client = new Socket(ipservidor, 40000);
            DataOutputStream outToServer = new DataOutputStream(client.getOutputStream());
            BufferedReader inFromServer = new BufferedReader(new InputStreamReader(client.getInputStream()));
            outToServer.writeBytes("atualizaPwm3" + "\n");
            String recebidoSrv = inFromServer.readLine();
            client.close();
            slider3.setValue(Integer.parseInt(recebidoSrv));
       
       } catch (UnknownHostException e) {
           System.out.println("nao foi possivel conectar ao servidor!");

       } catch (IOException e) {
           System.out.println("Ocorreu um erro!");
       }
       
       try {
 
            Socket client = new Socket(ipservidor, 40000);
            DataOutputStream outToServer = new DataOutputStream(client.getOutputStream());
            BufferedReader inFromServer = new BufferedReader(new InputStreamReader(client.getInputStream()));
            outToServer.writeBytes("atualizaPwm4" + "\n");
            String recebidoSrv = inFromServer.readLine();
            client.close();
            slider4.setValue(Integer.parseInt(recebidoSrv));
       
       } catch (UnknownHostException e) {
           System.out.println("nao foi possivel conectar ao servidor!");

       } catch (IOException e) {
           System.out.println("Ocorreu um erro!");
       }
       
       try {
 
            Socket client = new Socket(ipservidor, 40000);
            DataOutputStream outToServer = new DataOutputStream(client.getOutputStream());
            BufferedReader inFromServer = new BufferedReader(new InputStreamReader(client.getInputStream()));
            outToServer.writeBytes("atualizaPwm5" + "\n");
            String recebidoSrv = inFromServer.readLine();
            client.close();
            slider5.setValue(Integer.parseInt(recebidoSrv));
       
       } catch (UnknownHostException e) {
           System.out.println("nao foi possivel conectar ao servidor!");

       } catch (IOException e) {
           System.out.println("Ocorreu um erro!");
       }
       
       try {
 
            Socket client = new Socket(ipservidor, 40000);
            DataOutputStream outToServer = new DataOutputStream(client.getOutputStream());
            BufferedReader inFromServer = new BufferedReader(new InputStreamReader(client.getInputStream()));
            outToServer.writeBytes("atualizaPwm6" + "\n");
            String recebidoSrv = inFromServer.readLine();
            client.close();
            slider6.setValue(Integer.parseInt(recebidoSrv));
       
       } catch (UnknownHostException e) {
           System.out.println("nao foi possivel conectar ao servidor!");
           JOptionPane.showMessageDialog(null,"Comando não enviado, erro de comunicação!");

       } catch (IOException e) {
           System.out.println("Ocorreu um erro!");
           JOptionPane.showMessageDialog(null,"Comando não enviado, erro de comunicação!");
       }
        
    }//GEN-LAST:event_botaoAtualizaActionPerformed

    private void slider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slider1StateChanged

        
    }//GEN-LAST:event_slider1StateChanged

    private void botao4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao4ActionPerformed

        try {
            // Cria um Socket cliente passando como parâmetro o ip e a porta do servidor   
            Socket client = new Socket(ipservidor, 40000);
            // Cria um stream de saída 
            DataOutputStream outToServer = new DataOutputStream(client.getOutputStream());
            // Cria um buffer que armazenará as informações retornadas pelo servidor
            BufferedReader inFromServer = new BufferedReader(new InputStreamReader(client.getInputStream()));
            // Disponibiliza as informações contidas em "dadosaEnviar" para a stream de saída do cliente
            outToServer.writeBytes("pino8" + "\n");
            // Atribui as informações recebidas pelo servidor na variável "recebidoSrv"
            String recebidoSrv = inFromServer.readLine();
            // Imprime no console do cliente a informação retornada pelo servidor
            //System.out.println("Mensagem do servidor: "+"'" + recebidoSrv + "'");
            // Fecha o Socket
            client.close();
            jLabel4.setText(recebidoSrv);

       } catch (UnknownHostException e) {
           System.out.println("nao foi possivel conectar ao servidor!");
           JOptionPane.showMessageDialog(null,"Comando não enviado, erro de comunicação!");

       } catch (IOException e) {
           System.out.println("Ocorreu um erro!");
           JOptionPane.showMessageDialog(null,"Comando não enviado, erro de comunicação!");
       }

    }//GEN-LAST:event_botao4ActionPerformed

    private void botao5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao5ActionPerformed

        try {
            // Cria um Socket cliente passando como parâmetro o ip e a porta do servidor   
            Socket client = new Socket(ipservidor, 40000);
            // Cria um stream de saída 
            DataOutputStream outToServer = new DataOutputStream(client.getOutputStream());
            // Cria um buffer que armazenará as informações retornadas pelo servidor
            BufferedReader inFromServer = new BufferedReader(new InputStreamReader(client.getInputStream()));
            // Disponibiliza as informações contidas em "dadosaEnviar" para a stream de saída do cliente
            outToServer.writeBytes("pino12" + "\n");
            // Atribui as informações recebidas pelo servidor na variável "recebidoSrv"
            String recebidoSrv = inFromServer.readLine();
            // Imprime no console do cliente a informação retornada pelo servidor
            //System.out.println("Mensagem do servidor: "+"'" + recebidoSrv + "'");
            // Fecha o Socket
            client.close();
            jLabel5.setText(recebidoSrv);

       } catch (UnknownHostException e) {
           System.out.println("nao foi possivel conectar ao servidor!");
           JOptionPane.showMessageDialog(null,"Comando não enviado, erro de comunicação!");

       } catch (IOException e) {
           System.out.println("Ocorreu um erro!");
           JOptionPane.showMessageDialog(null,"Comando não enviado, erro de comunicação!");
       }
        
    }//GEN-LAST:event_botao5ActionPerformed

    private void botao6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao6ActionPerformed

        try {
            // Cria um Socket cliente passando como parâmetro o ip e a porta do servidor   
            Socket client = new Socket(ipservidor, 40000);
            // Cria um stream de saída 
            DataOutputStream outToServer = new DataOutputStream(client.getOutputStream());
            // Cria um buffer que armazenará as informações retornadas pelo servidor
            BufferedReader inFromServer = new BufferedReader(new InputStreamReader(client.getInputStream()));
            // Disponibiliza as informações contidas em "dadosaEnviar" para a stream de saída do cliente
            outToServer.writeBytes("pino13" + "\n");
            // Atribui as informações recebidas pelo servidor na variável "recebidoSrv"
            String recebidoSrv = inFromServer.readLine();
            // Imprime no console do cliente a informação retornada pelo servidor
            //System.out.println("Mensagem do servidor: "+"'" + recebidoSrv + "'");
            // Fecha o Socket
            client.close();
            jLabel6.setText(recebidoSrv);

       } catch (UnknownHostException e) {
           System.out.println("nao foi possivel conectar ao servidor!");
           JOptionPane.showMessageDialog(null,"Comando não enviado, erro de comunicação!");

       } catch (IOException e) {
           System.out.println("Ocorreu um erro!");
           JOptionPane.showMessageDialog(null,"Comando não enviado, erro de comunicação!");
       }

    }//GEN-LAST:event_botao6ActionPerformed

    private void slider2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slider2StateChanged

        try {
            // Cria um Socket cliente passando como parâmetro o ip e a porta do servidor   
            Socket client = new Socket(ipservidor, 40000);
            // Cria um stream de saída 
            DataOutputStream outToServer = new DataOutputStream(client.getOutputStream());
            // Cria um buffer que armazenará as informações retornadas pelo servidor
            BufferedReader inFromServer = new BufferedReader(new InputStreamReader(client.getInputStream()));
            // Disponibiliza as informações contidas em "dadosaEnviar" para a stream de saída do cliente
            outToServer.writeBytes("H" + slider2.getValue() + "\n");
            // Atribui as informações recebidas pelo servidor na variável "recebidoSrv"
            String recebidoSrv = inFromServer.readLine();
            // Imprime no console do cliente a informação retornada pelo servidor
            //System.out.println("Mensagem do servidor: "+"'" + recebidoSrv + "'");
            // Fecha o Socket
            client.close();

       } catch (UnknownHostException e) {
           System.out.println("nao foi possivel conectar ao servidor!");
           JOptionPane.showMessageDialog(null,"Comando não enviado, erro de comunicação!");

       } catch (IOException e) {
           System.out.println("Ocorreu um erro!");
           JOptionPane.showMessageDialog(null,"Comando não enviado, erro de comunicação!");
       }
        
    }//GEN-LAST:event_slider2StateChanged

    private void slider3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slider3StateChanged

        try {
            // Cria um Socket cliente passando como parâmetro o ip e a porta do servidor   
            Socket client = new Socket(ipservidor, 40000);
            // Cria um stream de saída 
            DataOutputStream outToServer = new DataOutputStream(client.getOutputStream());
            // Cria um buffer que armazenará as informações retornadas pelo servidor
            BufferedReader inFromServer = new BufferedReader(new InputStreamReader(client.getInputStream()));
            // Disponibiliza as informações contidas em "dadosaEnviar" para a stream de saída do cliente
            outToServer.writeBytes("I" + slider3.getValue() + "\n");
            // Atribui as informações recebidas pelo servidor na variável "recebidoSrv"
            String recebidoSrv = inFromServer.readLine();
            // Imprime no console do cliente a informação retornada pelo servidor
            //System.out.println("Mensagem do servidor: "+"'" + recebidoSrv + "'");
            // Fecha o Socket
            client.close();

       } catch (UnknownHostException e) {
           System.out.println("nao foi possivel conectar ao servidor!");
           JOptionPane.showMessageDialog(null,"Comando não enviado, erro de comunicação!");

       } catch (IOException e) {
           System.out.println("Ocorreu um erro!");
           JOptionPane.showMessageDialog(null,"Comando não enviado, erro de comunicação!");
       }
    }//GEN-LAST:event_slider3StateChanged

    private void slider4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slider4StateChanged

        try {
            // Cria um Socket cliente passando como parâmetro o ip e a porta do servidor   
            Socket client = new Socket(ipservidor, 40000);
            // Cria um stream de saída 
            DataOutputStream outToServer = new DataOutputStream(client.getOutputStream());
            // Cria um buffer que armazenará as informações retornadas pelo servidor
            BufferedReader inFromServer = new BufferedReader(new InputStreamReader(client.getInputStream()));
            // Disponibiliza as informações contidas em "dadosaEnviar" para a stream de saída do cliente
            outToServer.writeBytes("J" + slider4.getValue() + "\n");
            // Atribui as informações recebidas pelo servidor na variável "recebidoSrv"
            String recebidoSrv = inFromServer.readLine();
            // Imprime no console do cliente a informação retornada pelo servidor
            //System.out.println("Mensagem do servidor: "+"'" + recebidoSrv + "'");
            // Fecha o Socket
            client.close();

       } catch (UnknownHostException e) {
           System.out.println("nao foi possivel conectar ao servidor!");
           JOptionPane.showMessageDialog(null,"Comando não enviado, erro de comunicação!");

       } catch (IOException e) {
           System.out.println("Ocorreu um erro!");
           JOptionPane.showMessageDialog(null,"Comando não enviado, erro de comunicação!");
       }
    }//GEN-LAST:event_slider4StateChanged

    private void slider5StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slider5StateChanged

        try {
            // Cria um Socket cliente passando como parâmetro o ip e a porta do servidor   
            Socket client = new Socket(ipservidor, 40000);
            // Cria um stream de saída 
            DataOutputStream outToServer = new DataOutputStream(client.getOutputStream());
            // Cria um buffer que armazenará as informações retornadas pelo servidor
            BufferedReader inFromServer = new BufferedReader(new InputStreamReader(client.getInputStream()));
            // Disponibiliza as informações contidas em "dadosaEnviar" para a stream de saída do cliente
            outToServer.writeBytes("K" + slider5.getValue() + "\n");
            // Atribui as informações recebidas pelo servidor na variável "recebidoSrv"
            String recebidoSrv = inFromServer.readLine();
            // Imprime no console do cliente a informação retornada pelo servidor
            //System.out.println("Mensagem do servidor: "+"'" + recebidoSrv + "'");
            // Fecha o Socket
            client.close();

       } catch (UnknownHostException e) {
           System.out.println("nao foi possivel conectar ao servidor!");
           JOptionPane.showMessageDialog(null,"Comando não enviado, erro de comunicação!");

       } catch (IOException e) {
           System.out.println("Ocorreu um erro!");
           JOptionPane.showMessageDialog(null,"Comando não enviado, erro de comunicação!");
       }
    }//GEN-LAST:event_slider5StateChanged

    private void slider6StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slider6StateChanged

        try {
            // Cria um Socket cliente passando como parâmetro o ip e a porta do servidor   
            Socket client = new Socket(ipservidor, 40000);
            // Cria um stream de saída 
            DataOutputStream outToServer = new DataOutputStream(client.getOutputStream());
            // Cria um buffer que armazenará as informações retornadas pelo servidor
            BufferedReader inFromServer = new BufferedReader(new InputStreamReader(client.getInputStream()));
            // Disponibiliza as informações contidas em "dadosaEnviar" para a stream de saída do cliente
            outToServer.writeBytes("L" + slider6.getValue() + "\n");
            // Atribui as informações recebidas pelo servidor na variável "recebidoSrv"
            String recebidoSrv = inFromServer.readLine();
            // Imprime no console do cliente a informação retornada pelo servidor
            //System.out.println("Mensagem do servidor: "+"'" + recebidoSrv + "'");
            // Fecha o Socket
            client.close();

       } catch (UnknownHostException e) {
           System.out.println("nao foi possivel conectar ao servidor!");
           JOptionPane.showMessageDialog(null,"Comando não enviado, erro de comunicação!");

       } catch (IOException e) {
           System.out.println("Ocorreu um erro!");
           JOptionPane.showMessageDialog(null,"Comando não enviado, erro de comunicação!");
       }
        
    }//GEN-LAST:event_slider6StateChanged

    private void slider1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slider1MouseReleased

        try {
            // Cria um Socket cliente passando como parâmetro o ip e a porta do servidor   
            Socket client = new Socket(ipservidor, 40000);
            // Cria um stream de saída 
            DataOutputStream outToServer = new DataOutputStream(client.getOutputStream());
            // Cria um buffer que armazenará as informações retornadas pelo servidor
            BufferedReader inFromServer = new BufferedReader(new InputStreamReader(client.getInputStream()));
            // Disponibiliza as informações contidas em "dadosaEnviar" para a stream de saída do cliente
            outToServer.writeBytes("G" + slider1.getValue() + "\n");
            // Atribui as informações recebidas pelo servidor na variável "recebidoSrv"
            String recebidoSrv = inFromServer.readLine();
            // Imprime no console do cliente a informação retornada pelo servidor
            //System.out.println("Mensagem do servidor: "+"'" + recebidoSrv + "'");
            // Fecha o Socket
            client.close();

       } catch (UnknownHostException e) {
           System.out.println("nao foi possivel conectar ao servidor!");
           JOptionPane.showMessageDialog(null,"Comando não enviado, erro de comunicação!");

       } catch (IOException e) {
           System.out.println("Ocorreu um erro!");
           JOptionPane.showMessageDialog(null,"Comando não enviado, erro de comunicação!");
       }
        
    }//GEN-LAST:event_slider1MouseReleased

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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new Tela().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao1;
    private javax.swing.JButton botao2;
    private javax.swing.JButton botao3;
    private javax.swing.JButton botao4;
    private javax.swing.JButton botao5;
    private javax.swing.JButton botao6;
    private javax.swing.JButton botaoAtualiza;
    private javax.swing.JButton botaoSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSlider slider1;
    private javax.swing.JSlider slider2;
    private javax.swing.JSlider slider3;
    private javax.swing.JSlider slider4;
    private javax.swing.JSlider slider5;
    private javax.swing.JSlider slider6;
    // End of variables declaration//GEN-END:variables
}
