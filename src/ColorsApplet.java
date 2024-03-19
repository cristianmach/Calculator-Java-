
import java.awt.Color;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ColorsApplet extends javax.swing.JFrame {

    int nR, nG, nB;
 
    public ColorsApplet() {
        initComponents();
        addSliderListeners();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pColor = new javax.swing.JPanel();
        Red = new javax.swing.JSlider();
        Green = new javax.swing.JSlider();
        Blue = new javax.swing.JSlider();
        r = new javax.swing.JLabel();
        g = new javax.swing.JLabel();
        b = new javax.swing.JLabel();
        palt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pColor.setBackground(new java.awt.Color(255, 255, 255));

        Red.setBackground(new java.awt.Color(255, 0, 51));
        Red.setForeground(new java.awt.Color(255, 0, 51));
        Red.setMaximum(255);
        Red.setPaintLabels(true);
        Red.setValue(0);
        Red.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Red.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                RedAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        Green.setBackground(new java.awt.Color(0, 204, 0));
        Green.setForeground(new java.awt.Color(0, 204, 0));
        Green.setMaximum(255);
        Green.setPaintLabels(true);
        Green.setValue(0);
        Green.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Green.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                GreenAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        Blue.setBackground(new java.awt.Color(51, 102, 255));
        Blue.setForeground(new java.awt.Color(51, 102, 255));
        Blue.setMaximum(255);
        Blue.setPaintLabels(true);
        Blue.setValue(0);
        Blue.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Blue.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                BlueAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        r.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        r.setText("N° RED: ");

        g.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        g.setText("N° GREEN: ");

        b.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        b.setText("N° BLUE: ");

        palt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        palt.setText("PALETA RGB DE COLORES");

        javax.swing.GroupLayout pColorLayout = new javax.swing.GroupLayout(pColor);
        pColor.setLayout(pColorLayout);
        pColorLayout.setHorizontalGroup(
            pColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pColorLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(pColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pColorLayout.createSequentialGroup()
                        .addComponent(Blue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pColorLayout.createSequentialGroup()
                        .addComponent(Green, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(g, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pColorLayout.createSequentialGroup()
                        .addComponent(Red, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(r, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pColorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(palt)
                .addGap(114, 114, 114))
        );
        pColorLayout.setVerticalGroup(
            pColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pColorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(palt)
                .addGap(18, 18, 18)
                .addGroup(pColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Red, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r))
                .addGap(18, 18, 18)
                .addGroup(pColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Green, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g))
                .addGap(18, 18, 18)
                .addGroup(pColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Blue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addSliderListeners() {
        Red.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                nR = Red.getValue();
                r.setText("N° RED:  " + Integer.toString(nR));
                if (nR > 125) {
                    r.setForeground(Color.black);
                    palt.setForeground(Color.black);
                } else {
                    r.setForeground(Color.white);
                    palt.setForeground(Color.white);
                }
                updateBackgroundColor();
            }
        });

        Green.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                nG = Green.getValue();
                g.setText("N° GREEN:  " + Integer.toString(nG));
                 if (nG > 125) {
                    g.setForeground(Color.black);
                } else {
                    g.setForeground(Color.white);
                }
                updateBackgroundColor();
            }
        });

        Blue.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                nB = Blue.getValue();
                b.setText("N° BLUE:  " + Integer.toString(nB));
                 if (nB > 125) {
                    b.setForeground(Color.black);
                } else {
                    b.setForeground(Color.white);
                }
                updateBackgroundColor();
            }
        });
    }

    private void updateBackgroundColor() {
        pColor.setBackground(new Color(nR, nG, nB));
    }
    
    private void RedAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_RedAncestorAdded
        
    }//GEN-LAST:event_RedAncestorAdded

    private void GreenAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_GreenAncestorAdded
        
    }//GEN-LAST:event_GreenAncestorAdded

    private void BlueAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_BlueAncestorAdded
        
    }//GEN-LAST:event_BlueAncestorAdded

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
            java.util.logging.Logger.getLogger(ColorsApplet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ColorsApplet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ColorsApplet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ColorsApplet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ColorsApplet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSlider Blue;
    private javax.swing.JSlider Green;
    private javax.swing.JSlider Red;
    private javax.swing.JLabel b;
    private javax.swing.JLabel g;
    private javax.swing.JPanel pColor;
    private javax.swing.JLabel palt;
    private javax.swing.JLabel r;
    // End of variables declaration//GEN-END:variables
}
