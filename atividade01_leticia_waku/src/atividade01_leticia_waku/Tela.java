/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade01_leticia_waku;

import java.awt.Color;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author frawn
 */
public class Tela extends javax.swing.JFrame {
    
    Barra barraCPU = new Barra();
    Barra barraDisco = new Barra();
    Barra barraMemoria = new Barra();
    

    /**
     * Creates new form Tela
     */
    public Tela() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pbCPU = new javax.swing.JProgressBar();
        pbDisco = new javax.swing.JProgressBar();
        pbMemoria = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        lblMax1 = new javax.swing.JLabel();
        lblMin1 = new javax.swing.JLabel();
        lblMedia1 = new javax.swing.JLabel();
        lblMax2 = new javax.swing.JLabel();
        lblMin2 = new javax.swing.JLabel();
        lblMedia2 = new javax.swing.JLabel();
        lblMax3 = new javax.swing.JLabel();
        lblMin3 = new javax.swing.JLabel();
        lblMedia3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        btnLeitura = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("CPU");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("DISCO");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("MEMÓRIA");

        lblMax1.setText("   ");

        lblMin1.setText("   ");

        lblMedia1.setText("   ");

        lblMax2.setText("   ");

        lblMin2.setText("   ");

        lblMedia2.setText("   ");

        lblMax3.setText("   ");

        lblMin3.setText("   ");

        lblMedia3.setText("   ");

        btnLeitura.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLeitura.setText("Fazer leitura dos dados");
        btnLeitura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeituraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(btnLeitura)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(lblMax1)
                                .addGap(88, 88, 88)
                                .addComponent(lblMin1)
                                .addGap(83, 83, 83)
                                .addComponent(lblMedia1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pbDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblMax2)
                                        .addGap(88, 88, 88)
                                        .addComponent(lblMin2)
                                        .addGap(83, 83, 83)
                                        .addComponent(lblMedia2))
                                    .addComponent(jLabel2)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(pbCPU, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pbMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblMax3)
                                        .addGap(88, 88, 88)
                                        .addComponent(lblMin3)
                                        .addGap(83, 83, 83)
                                        .addComponent(lblMedia3))
                                    .addComponent(jLabel3))))
                        .addGap(0, 91, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pbCPU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMax1)
                    .addComponent(lblMin1)
                    .addComponent(lblMedia1))
                .addGap(35, 35, 35)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pbDisco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMax2)
                    .addComponent(lblMin2)
                    .addComponent(lblMedia2))
                .addGap(36, 36, 36)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pbMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMax3)
                    .addComponent(lblMin3)
                    .addComponent(lblMedia3))
                .addGap(30, 30, 30)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnLeitura)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLeituraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeituraActionPerformed
        // TODO add your handling code here:
        Double leituraCPU = ThreadLocalRandom.current().nextDouble(0,100);
        pbCPU.setStringPainted(true);
        pbCPU.setForeground(Color.BLACK);
        pbCPU.setString(leituraCPU.toString());
        pbCPU.setValue(leituraCPU.intValue());
        
        if(barraCPU.nLei==0.0){
            barraCPU.leiMin=leituraCPU;
        }
        if(leituraCPU>barraCPU.leiMax){
            barraCPU.leiMax=leituraCPU;
        }
        if(leituraCPU<barraCPU.leiMin){
            barraCPU.leiMin=leituraCPU;
        }
        barraCPU.leiTotal+=leituraCPU;
        barraCPU.nLei++;
        Double leiMedia1= barraCPU.leiTotal/barraCPU.nLei;
        
        lblMax1.setText(String.format("Máximo: %.2f", barraCPU.leiMax));
        lblMin1.setText(String.format("Mínimo: %.2f", barraCPU.leiMin));
        lblMedia1.setText(String.format("Média: %.2f", leiMedia1));
        
        Double leituraDisco = ThreadLocalRandom.current().nextDouble(0,100);
        pbDisco.setStringPainted(true);
        pbDisco.setForeground(Color.BLACK);
        pbDisco.setString(leituraDisco.toString());
        pbDisco.setValue(leituraDisco.intValue());
        
        if(barraDisco.nLei==0.0){
            barraDisco.leiMin=leituraDisco;
        }
        if(leituraDisco>barraDisco.leiMax){
            barraDisco.leiMax=leituraDisco;
        }
        if(leituraDisco<barraDisco.leiMin){
            barraDisco.leiMin=leituraDisco;
        }
        barraDisco.leiTotal+=leituraDisco;
        barraDisco.nLei++;
        Double leiMedia2= barraDisco.leiTotal/barraDisco.nLei;
        
        lblMax2.setText(String.format("Máximo: %.2f", barraDisco.leiMax));
        lblMin2.setText(String.format("Mínimo: %.2f", barraDisco.leiMin));
        lblMedia2.setText(String.format("Média: %.2f", leiMedia2));

        Double leituraMemoria = ThreadLocalRandom.current().nextDouble(0,100);
        pbMemoria.setStringPainted(true);
        pbMemoria.setForeground(Color.BLACK);
        pbMemoria.setString(leituraMemoria.toString());
        pbMemoria.setValue(leituraMemoria.intValue());
        
        if(barraMemoria.nLei==0.0){
            barraMemoria.leiMin=leituraMemoria;
        }
        if(leituraMemoria>barraMemoria.leiMax){
            barraMemoria.leiMax=leituraMemoria;
        }
        if(leituraMemoria<barraMemoria.leiMin){
           barraMemoria.leiMin=leituraMemoria;
        }
        barraMemoria.leiTotal+=leituraMemoria;
        barraMemoria.nLei++;
        Double leiMedia3= barraMemoria.leiTotal/barraMemoria.nLei;
        
        lblMax3.setText(String.format("Máximo: %.2f", barraMemoria.leiMax));
        lblMin3.setText(String.format("Mínimo: %.2f", barraMemoria.leiMin));
        lblMedia3.setText(String.format("Média: %.2f", leiMedia3));
        
    }//GEN-LAST:event_btnLeituraActionPerformed

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
    private javax.swing.JButton btnLeitura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblMax1;
    private javax.swing.JLabel lblMax2;
    private javax.swing.JLabel lblMax3;
    private javax.swing.JLabel lblMedia1;
    private javax.swing.JLabel lblMedia2;
    private javax.swing.JLabel lblMedia3;
    private javax.swing.JLabel lblMin1;
    private javax.swing.JLabel lblMin2;
    private javax.swing.JLabel lblMin3;
    private javax.swing.JProgressBar pbCPU;
    private javax.swing.JProgressBar pbDisco;
    private javax.swing.JProgressBar pbMemoria;
    // End of variables declaration//GEN-END:variables
}
