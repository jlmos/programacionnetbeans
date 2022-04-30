/*A partir de la clase Cronometro que te proporciona el profesor, realiza un programa como el
de la figura, con un contador de minutos, segundo y décimas de segundo que se puede arrancar
(inicialmente a cero, esto es 00:00,0)
• Emplea la clase swing.Timer.
• Añade un método toString a la clase Cronómetro, que prepare el texto formateado a mostrar en el campo de texto (MM:SS,D)
autor: jose luis mosquera losada
fecha: 02-04-2022 */
package JLMLt12;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;


public class JLMLt12e07 extends javax.swing.JFrame {
    
    private Cronometro cronometro;
    private Timer timer;

    
    
    public JLMLt12e07() {
        initComponents();
        this.setTitle("Cronómetro");
        jLabelcronometro.setText("00:00,0");
        cronometro = new Cronometro();
        timer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cronometro.incrementar();
                jLabelcronometro.setText(cronometro.toString());
            }
        });
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelcronometro = new javax.swing.JLabel();
        jButton1Arrancar = new javax.swing.JButton();
        jButton2Parar = new javax.swing.JButton();
        jButton3Resetear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelcronometro.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        jButton1Arrancar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1Arrancar.setText("Arrancar");
        jButton1Arrancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ArrancarActionPerformed(evt);
            }
        });

        jButton2Parar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2Parar.setText("Parar");
        jButton2Parar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2PararActionPerformed(evt);
            }
        });

        jButton3Resetear.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton3Resetear.setText("Resetear");
        jButton3Resetear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ResetearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelcronometro, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton3Resetear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1Arrancar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2Parar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabelcronometro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1Arrancar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2Parar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jButton3Resetear, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ArrancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ArrancarActionPerformed
        cronometro.arrancar();
        timer.start();
    }//GEN-LAST:event_jButton1ArrancarActionPerformed

    private void jButton2PararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2PararActionPerformed
        cronometro.parar();
    }//GEN-LAST:event_jButton2PararActionPerformed

    private void jButton3ResetearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ResetearActionPerformed
        cronometro.resetear();
    }//GEN-LAST:event_jButton3ResetearActionPerformed

    
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
            java.util.logging.Logger.getLogger(JLMLt12e07.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JLMLt12e07.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JLMLt12e07.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JLMLt12e07.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JLMLt12e07().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1Arrancar;
    private javax.swing.JButton jButton2Parar;
    private javax.swing.JButton jButton3Resetear;
    private javax.swing.JLabel jLabelcronometro;
    // End of variables declaration//GEN-END:variables
}
