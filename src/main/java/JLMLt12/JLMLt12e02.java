/*Realizar una nueva versión del programa anterior, pero con unos botones de opción para que sea
bidireccional, de Celsius a Fahrenheit y también de Fahrenheit a Celsius. Cada vez que cambiemos la selección
de los botones de opción cambiarán los textos de las etiquetas y se vaciarán las cajas de texto. El programa
informará mediante sendas ventanas emergentes tanto si no se ha seleccionado ningún botón de opción, como si la
caja de texto de entrada está vacía.
autor: jose luis mosquera losada
fecha: 29-03-2022 */
package JLMLt12;


public class JLMLt12e02 extends javax.swing.JFrame {

   
    public JLMLt12e02() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        lbEntrada = new javax.swing.JLabel();
        tfEntrada = new javax.swing.JTextField();
        lbSalida = new javax.swing.JLabel();
        tfSalida = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        rbCelsiusAFahrenheit = new javax.swing.JRadioButton();
        rbFahrenheitACelsius = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conversor de temperatura");

        lbEntrada.setText("Temperatura Celsius");

        lbSalida.setText("Temperatura Fahrenheit");

        jButton1.setText("Convertir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbCelsiusAFahrenheit);
        rbCelsiusAFahrenheit.setSelected(true);
        rbCelsiusAFahrenheit.setText("Celsius a Fahrenheit");
        rbCelsiusAFahrenheit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCelsiusAFahrenheitActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbFahrenheitACelsius);
        rbFahrenheitACelsius.setText("Fahrenheit a Celsius");
        rbFahrenheitACelsius.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFahrenheitACelsiusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lbEntrada)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbSalida)
                                .addGap(18, 18, 18)
                                .addComponent(tfSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rbFahrenheitACelsius)
                            .addComponent(rbCelsiusAFahrenheit))))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(rbCelsiusAFahrenheit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbFahrenheitACelsius)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbEntrada, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfEntrada, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSalida)
                    .addComponent(tfSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (rbCelsiusAFahrenheit.isSelected()) {
            double celsius = Double.parseDouble(tfEntrada.getText());
            double fahrenheit = Conversor.celsiusAFahrenheit(celsius);
            tfSalida.setText(String.format("%.2f", fahrenheit));
        } else {
            double fahrenheit = Double.parseDouble(tfEntrada.getText());
            double celsius = Conversor.fahrenheitACelsius(fahrenheit);
            tfSalida.setText(String.format("%.2f", celsius));

        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void rbCelsiusAFahrenheitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCelsiusAFahrenheitActionPerformed
        lbEntrada.setText("Celsius");
        lbSalida.setText("Fahrenheit");
       
    }//GEN-LAST:event_rbCelsiusAFahrenheitActionPerformed

    private void rbFahrenheitACelsiusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFahrenheitACelsiusActionPerformed
        lbEntrada.setText("Fahrenheit");
        lbSalida.setText("Celsius");

    }//GEN-LAST:event_rbFahrenheitACelsiusActionPerformed

    
    public static void main(String args[]) {
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JLMLt12e02().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lbEntrada;
    private javax.swing.JLabel lbSalida;
    private javax.swing.JRadioButton rbCelsiusAFahrenheit;
    private javax.swing.JRadioButton rbFahrenheitACelsius;
    private javax.swing.JTextField tfEntrada;
    private javax.swing.JTextField tfSalida;
    // End of variables declaration//GEN-END:variables
}
