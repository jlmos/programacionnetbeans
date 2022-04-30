/*Realizar un programa con una lista con los nombres de
los alumnos de una clase (inicialmente vacía). El programa
dispondrá de un botón para añadir a la lista (mediante un
diálogo pedirá el nombre a usuario), un botón para eliminar el
elemento seleccionado de la lista (si no hay ninguno muestra un
mensaje en un diálogo), un botón para modificar un elemento
seleccionado (solicitará el nuevo nombre con un dialogo para
introducirlo) y finalmente un botón para vaciar la lista (este
botón pedirá confirmación mediante un diálogo).
autor: jose luis mosquera losada
fecha: 01-04-2022 */

package JLMLt12;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;


public class JLMLt12e04 extends javax.swing.JFrame {

    
    public JLMLt12e04() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listaInterfaz = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(listaInterfaz);

        jButton1.setText("Borrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Modificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Añadir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Vaciar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(166, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(6, 6, 6)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String nombre = JOptionPane.showInputDialog("Introduce un nombre");
        DefaultListModel defaultListModel = new DefaultListModel();
        ListModel listModel = listaInterfaz.getModel();
        for (int i=0; i<listModel.getSize(); i++) {
            defaultListModel.add(i, listModel.getElementAt(i));
        }
        defaultListModel.addElement(nombre);
        listaInterfaz.setModel(defaultListModel);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            int selectedIndex = listaInterfaz.getSelectedIndex();
            DefaultListModel defaultListModel = new DefaultListModel();
            ListModel listModel = listaInterfaz.getModel();
            for (int i=0; i<listModel.getSize(); i++) {
                defaultListModel.add(i, listModel.getElementAt(i));
            }
            defaultListModel.remove(selectedIndex);
            listaInterfaz.setModel(defaultListModel);
        }catch(Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Debes seleccionar un elemento");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            int selectedIndex = listaInterfaz.getSelectedIndex();
            if(selectedIndex == -1) throw new Exception();
            System.out.println("Indice: " + selectedIndex);
            DefaultListModel defaultListModel = new DefaultListModel();
            ListModel listModel = listaInterfaz.getModel();
            for (int i=0; i<listModel.getSize(); i++) {
                defaultListModel.add(i, listModel.getElementAt(i));
            }
            String nuevoNombre = JOptionPane.showInputDialog("Introduce el nuevo nombre");
            defaultListModel.set(selectedIndex, nuevoNombre);
            listaInterfaz.setModel(defaultListModel);
        }catch(Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Debes seleccionar un elemento");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        listaInterfaz.setModel(new DefaultListModel<>());
    }//GEN-LAST:event_jButton4ActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JLMLt12e04().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listaInterfaz;
    // End of variables declaration//GEN-END:variables
}
