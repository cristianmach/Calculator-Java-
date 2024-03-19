
import javax.swing.JOptionPane;


public class BotonesApplet extends javax.swing.JFrame {

float nm1, nm2, r;

    public BotonesApplet() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        add = new javax.swing.JButton();
        mult = new javax.swing.JButton();
        n1E = new javax.swing.JButton();
        nM = new javax.swing.JButton();
        subs = new javax.swing.JButton();
        div = new javax.swing.JButton();
        n2E = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        n1 = new javax.swing.JTextField();
        n2 = new javax.swing.JTextField();
        nR = new javax.swing.JTextField();
        num1 = new javax.swing.JLabel();
        numR = new javax.swing.JLabel();
        num2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));

        add.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        add.setText("+");
        add.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        mult.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mult.setText("x");
        mult.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mult.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multActionPerformed(evt);
            }
        });

        n1E.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        n1E.setText("√ N1");
        n1E.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        n1E.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        n1E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n1EActionPerformed(evt);
            }
        });

        nM.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nM.setText("N. MAYOR");
        nM.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nM.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nMActionPerformed(evt);
            }
        });

        subs.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        subs.setText("-");
        subs.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        subs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        subs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subsActionPerformed(evt);
            }
        });

        div.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        div.setText("÷");
        div.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        div.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divActionPerformed(evt);
            }
        });

        n2E.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        n2E.setText("√ N2");
        n2E.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        n2E.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        n2E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n2EActionPerformed(evt);
            }
        });

        clear.setBackground(new java.awt.Color(255, 0, 51));
        clear.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        clear.setForeground(new java.awt.Color(255, 255, 255));
        clear.setText("CLEAR");
        clear.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 0, 51));

        n1.setDocument(new javax.swing.text.PlainDocument() {
            @Override
            public void insertString(int offs, String str, javax.swing.text.AttributeSet a) throws javax.swing.text.BadLocationException {
                if (str.matches("\\d+")) {
                    super.insertString(offs, str, a);
                }
            }
        }
    );
    n1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
    n1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 51)));

    n2.setDocument(new javax.swing.text.PlainDocument() {
        @Override
        public void insertString(int offs, String str, javax.swing.text.AttributeSet a) throws javax.swing.text.BadLocationException {
            if (str.matches("\\d+")) {
                super.insertString(offs, str, a);
            }
        }
    }
    );
    n2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
    n2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 51)));

    nR.setEditable(false);
    nR.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
    nR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));

    num1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
    num1.setText("NUMERO 1 (N1):");

    numR.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
    numR.setText("RESULTADO:");

    num2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
    num2.setText("NUMERO 2 (N2):");

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(n2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(n1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(num1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(num2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(numR, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nR, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addContainerGap(20, Short.MAX_VALUE))
    );
    jPanel2Layout.setVerticalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
            .addGap(11, 11, 11)
            .addComponent(num1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(n1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(num2)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
            .addComponent(n2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(12, 12, 12)
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(numR)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(nR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(29, 29, 29))
    );

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(20, 20, 20)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(nM, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(n1E, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(mult, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(div, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(subs, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(n2E, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(33, 33, 33)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(subs)
                    .addGap(18, 18, 18)
                    .addComponent(div)
                    .addGap(18, 18, 18)
                    .addComponent(n2E))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(add)
                    .addGap(18, 18, 18)
                    .addComponent(mult)
                    .addGap(18, 18, 18)
                    .addComponent(n1E)
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nM)
                        .addComponent(clear))))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    );

    pack();
    setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void multActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multActionPerformed
        if (!n1.getText().isEmpty() || !n2.getText().isEmpty()) {
            nm1 = Float.parseFloat(n1.getText());
            nm2 = Float.parseFloat(n2.getText());

            r = nm1 * nm2;

            nR.setText(Float.toString(r));
        } else{
        JOptionPane.showMessageDialog(this, "Ingrese los valores de N1 y N2", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_multActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        if (!n1.getText().isEmpty() || !n2.getText().isEmpty()) {
            
            nm1 = Float.parseFloat(n1.getText());
            nm2 = Float.parseFloat(n2.getText());

            r = nm1 + nm2;

            nR.setText(Float.toString(r));
        } else{
        JOptionPane.showMessageDialog(this, "Ingrese los valores de N1 y N2", "Error", JOptionPane.ERROR_MESSAGE);
        }
    
    }//GEN-LAST:event_addActionPerformed

    private void subsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subsActionPerformed
        if (!n1.getText().isEmpty() || !n2.getText().isEmpty()) {
        nm1 = Float.parseFloat(n1.getText());
        nm2 = Float.parseFloat(n2.getText());

        r = nm1 - nm2;

        nR.setText(Float.toString(r)); 
        } else{
        JOptionPane.showMessageDialog(this, "Ingrese los valores de N1 y N2", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_subsActionPerformed

    private void divActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divActionPerformed
        if (!n1.getText().isEmpty() || !n2.getText().isEmpty()) {
            nm1 = Float.parseFloat(n1.getText());
            nm2 = Float.parseFloat(n2.getText());

            r = nm1 / nm2;

            nR.setText(Float.toString(r));
        } else{
        JOptionPane.showMessageDialog(this, "Ingrese los valores de N1 y N2", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_divActionPerformed

    private void n1EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n1EActionPerformed
        if (!n1.getText().isEmpty() || !n2.getText().isEmpty()) {
            nm1 = Float.parseFloat(n1.getText());
            nm2 = Float.parseFloat(n2.getText());

            double x = Math.pow(nm1, nm2);

            nR.setText(String.valueOf(x));  
        } else{
        JOptionPane.showMessageDialog(this, "Ingrese los valores de N1 y N2", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_n1EActionPerformed

    private void n2EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n2EActionPerformed
        if (!n1.getText().isEmpty() || !n2.getText().isEmpty()) {
            nm1 = Float.parseFloat(n1.getText());
            nm2 = Float.parseFloat(n2.getText());

            double x = Math.pow(nm2, nm1);

            nR.setText(String.valueOf(x));
        } else{
        JOptionPane.showMessageDialog(this, "Ingrese los valores de N1 y N2", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_n2EActionPerformed

    private void nMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nMActionPerformed
        if (!n1.getText().isEmpty() || !n2.getText().isEmpty()) {
            nm1 = Float.parseFloat(n1.getText());
            nm2 = Float.parseFloat(n2.getText());

            r = Math.max(nm1, nm2);

            nR.setText(String.valueOf(r));
        } else{
        JOptionPane.showMessageDialog(this, "Ingrese los valores de N1 y N2", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_nMActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        n1.setText("");
        n2.setText("");
        nR.setText("");
    }//GEN-LAST:event_clearActionPerformed

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
            java.util.logging.Logger.getLogger(BotonesApplet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BotonesApplet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BotonesApplet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BotonesApplet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BotonesApplet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton clear;
    private javax.swing.JButton div;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton mult;
    private javax.swing.JTextField n1;
    private javax.swing.JButton n1E;
    private javax.swing.JTextField n2;
    private javax.swing.JButton n2E;
    private javax.swing.JButton nM;
    private javax.swing.JTextField nR;
    private javax.swing.JLabel num1;
    private javax.swing.JLabel num2;
    private javax.swing.JLabel numR;
    private javax.swing.JButton subs;
    // End of variables declaration//GEN-END:variables
}
