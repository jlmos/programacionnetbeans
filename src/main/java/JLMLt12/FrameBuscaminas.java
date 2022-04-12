/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JLMLt12;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author ESTUDIOS
 */
public class FrameBuscaminas extends javax.swing.JFrame {

    private BuscaMinas juego;
    private JButton tablero[][];

    public FrameBuscaminas() {
        initComponents();
        tablero = new JButton[8][8];
        for (int f = 0; f < 8; f++) {
            for (int c = 0; c < 8; c++) {
                tablero[f][c] = new JButton();
                tablero[f][c].setFont(new java.awt.Font("Tahoma", 0, 36));
                tablero[f][c].addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        FActionPerformed(evt);
                    }
                });
                tablero[f][c].setName(Integer.toString(f) + Integer.toString(c));
                tablero[f][c].setBackground(Color.white);
                tablero[f][c].setText("");
                PanelCasillas.add(tablero[f][c]);
            }
        }
        this.juego = new BuscaMinas(8, 8, 8);
        for (int f = 0; f < 8; f++) {
            for (int c = 0; c < 8; c++) {
                tablero[f][c].setBackground(Color.white);
                tablero[f][c].setText("");
            }
        }
        
    }

    private void FActionPerformed(java.awt.event.MouseEvent evt) {
        
        if (((java.awt.event.MouseEvent) evt).getButton() == java.awt.event.MouseEvent.BUTTON3 &&
            ((JButton)evt.getSource()).getBackground()!= Color.yellow
        ){
        if (((JButton)evt.getSource()).getBackground()!=Color.blue)
            ((JButton)evt.getSource()).setBackground(Color.blue);
        else
            ((JButton)evt.getSource()).setBackground(Color.white);
        return;
        }
        
        String nn = ((JButton) evt.getSource()).getName();
        int fila = Integer.parseInt(nn.substring(0, 1));
        int col = Integer.parseInt(nn.substring(1, 2));
        int x = juego.elegir(fila, col);
        if (x == -1) { //perdiste
            revelarTablero();
            ((JButton) evt.getSource()).setBackground(Color.red);
            finPartida(false);

        } else {
            for (int f = 0; f < 8; f++) {
                for (int c = 0; c < 8; c++) {
                    if (juego.casillas[f][c].descubierta) {
                        tablero[f][c].setText(Integer.toString(juego.casillas[f][c].valor));
                        tablero[f][c].setBackground(Color.yellow);

                    }
                }

            }
            if (juego.ganaste()) {
                revelarTablero();
                finPartida(true);
            }
        }}
            /**
             * This method is called from within the constructor to initialize
             * the form. WARNING: Do NOT modify this code. The content of this
             * method is always regenerated by the Form Editor.
             */
            @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelInferior = new javax.swing.JPanel();
        PanelCasillas = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelInferior.setMinimumSize(new java.awt.Dimension(500, 100));
        PanelInferior.setPreferredSize(new java.awt.Dimension(500, 100));
        getContentPane().add(PanelInferior, java.awt.BorderLayout.PAGE_END);

        PanelCasillas.setMinimumSize(new java.awt.Dimension(500, 500));
        PanelCasillas.setPreferredSize(new java.awt.Dimension(500, 500));
        PanelCasillas.setLayout(new java.awt.GridLayout(8, 8));
        getContentPane().add(PanelCasillas, java.awt.BorderLayout.CENTER);

        jMenu1.setText("Bombas");

        jMenuItem1.setText("5 Bombas");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("8 Bombas");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("15 Bombas");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.juego = new BuscaMinas (8,8,5);
        for (int f=0;f<8;f++){
            for (int c = 0; c < 8; c++) {
                tablero [f][c].setBackground(Color.white);
                tablero [f][c].setText("");
            }
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        this.juego = new BuscaMinas (8,8,8);
        for (int f=0;f<8;f++){
            for (int c = 0; c < 8; c++) {
                tablero [f][c].setBackground(Color.white);
                tablero [f][c].setText("");
            }
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        this.juego = new BuscaMinas (8,8,15);
        for (int f=0;f<8;f++){
            for (int c = 0; c < 8; c++) {
                tablero [f][c].setBackground(Color.white);
                tablero [f][c].setText("");
            }
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

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
            java.util.logging.Logger.getLogger(FrameBuscaminas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameBuscaminas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameBuscaminas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameBuscaminas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameBuscaminas().setVisible(true);
            }
        });
    }
    
    /**
     * Mostrar el contenido de cada casilla.
     */
    private void revelarTablero() {
        for (int f=0;f<8;f++){
            for (int c = 0; c < 8; c++) {
                if (juego.casillas[f][c].valor!=-1) {
                    tablero [f][c].setText(Integer.toString(juego.casillas[f][c].valor));
                    tablero [f][c].setBackground(Color.yellow);
                }
                else {
                    tablero [f][c].setBackground(Color.red);
                }
            }
        }
    }
    
    /**
     * Reinicia el juego y limpia el tablero.
     */
    private void finPartida(boolean ganado) {
        String mensaje;
        if (ganado) {
            mensaje = "Has ganado!";
        } else {
            mensaje = "Has perdido!";
        }
        mensaje += " Quieres jugar otra partida?";
        
        int respuesta = JOptionPane.showConfirmDialog(rootPane, mensaje, "Fin de partida", JOptionPane.YES_NO_OPTION);
        System.out.println("Respuesta: " + respuesta);
        
        if (respuesta == 0) {
            this.juego = new BuscaMinas (8,8,8);
            for (int f=0;f<8;f++){
                for (int c = 0; c < 8; c++) {
                    tablero [f][c].setBackground(Color.white);
                    tablero [f][c].setText("");
                }
            }
        } else {
            System.exit(0);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelCasillas;
    private javax.swing.JPanel PanelInferior;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    // End of variables declaration//GEN-END:variables
}