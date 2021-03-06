/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni.edui.ni.frames;


import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import ni.edu.ni.Articulo.Articulo;

/**
 *
 * @author JADPA01
 */
public class FrmFactura extends javax.swing.JFrame {
    Articulo a;
    float subtotal =0;
    /**
     * Creates new form FrmFactura
     */
    public FrmFactura() {
        initComponents();
    }

    public JButton getBtnAdd() {
        return btnAdd;
    }

    public JButton getBtnDelete() {
        return btnDelete;
    }

    public JFormattedTextField getFtxtPrecio() {
        return ftxtPrecio;
    }

    public JSpinner getSpnCantidad() {
        return spnCantidad;
    }

    public JTextField getTxtName() {
        return txtName;
    }

    public JTable getTableArticulos() {
        return tableArticulos;
    }

    public JTextField getTxtCode() {
        return txtCode;
    }

    public JLabel getLblIVA() {
        return lblIVA;
    }

    public JLabel getLblSub() {
        return lblSub;
    }

    public JLabel getLblTotal() {
        return lblTotal;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        pnlContentAdd = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        ftxtPrecio = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        spnCantidad = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableArticulos = new javax.swing.JTable();
        pnlTotal = new javax.swing.JPanel();
        lblSub = new javax.swing.JLabel();
        lblIVA = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        pnlContentAdd.setLayout(new java.awt.BorderLayout());

        jPanel3.setLayout(new java.awt.GridBagLayout());

        ftxtPrecio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        ftxtPrecio.setPreferredSize(new java.awt.Dimension(150, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel3.add(ftxtPrecio, gridBagConstraints);

        jLabel4.setText("Precio");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel3.add(jLabel4, gridBagConstraints);

        spnCantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        spnCantidad.setPreferredSize(new java.awt.Dimension(150, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel3.add(spnCantidad, gridBagConstraints);

        jLabel3.setText("Cantidad");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel3.add(jLabel3, gridBagConstraints);

        txtName.setPreferredSize(new java.awt.Dimension(150, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel3.add(txtName, gridBagConstraints);

        jLabel2.setText("Nombre");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel3.add(jLabel2, gridBagConstraints);

        txtCode.setPreferredSize(new java.awt.Dimension(150, 30));
        txtCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodeActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel3.add(txtCode, gridBagConstraints);

        jLabel1.setText("Codigo Producto");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 6, 5, 5);
        jPanel3.add(jLabel1, gridBagConstraints);

        pnlContentAdd.add(jPanel3, java.awt.BorderLayout.CENTER);

        btnAdd.setText("Agregar");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdd);

        btnDelete.setText("Eliminar");
        jPanel1.add(btnDelete);

        pnlContentAdd.add(jPanel1, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(pnlContentAdd);

        jPanel2.setPreferredSize(new java.awt.Dimension(450, 240));
        jPanel2.setLayout(new java.awt.BorderLayout());

        tableArticulos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Cantidad", "Precio", "Subtotal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableArticulos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tableArticulos);
        if (tableArticulos.getColumnModel().getColumnCount() > 0) {
            tableArticulos.getColumnModel().getColumn(0).setResizable(false);
            tableArticulos.getColumnModel().getColumn(1).setResizable(false);
            tableArticulos.getColumnModel().getColumn(2).setResizable(false);
            tableArticulos.getColumnModel().getColumn(3).setResizable(false);
            tableArticulos.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel2.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        lblSub.setText("Subtotal: ");
        lblSub.setToolTipText("");
        lblSub.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        lblIVA.setText("IVA: ");
        lblIVA.setToolTipText("");
        lblIVA.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        lblTotal.setText("Total: ");
        lblTotal.setToolTipText("");
        lblTotal.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        javax.swing.GroupLayout pnlTotalLayout = new javax.swing.GroupLayout(pnlTotal);
        pnlTotal.setLayout(pnlTotalLayout);
        pnlTotalLayout.setHorizontalGroup(
            pnlTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTotalLayout.createSequentialGroup()
                .addGap(347, 347, 347)
                .addGroup(pnlTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIVA, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSub))
                .addGap(97, 97, 97))
        );
        pnlTotalLayout.setVerticalGroup(
            pnlTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTotalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSub)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblIVA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTotal)
                .addContainerGap())
        );

        jPanel2.add(pnlTotal, java.awt.BorderLayout.PAGE_END);
        pnlTotal.getAccessibleContext().setAccessibleDescription("");

        getContentPane().add(jPanel2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodeActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String code = getTxtCode().getText();
        String nombre = getTxtName().getText();
        
        float precio =  Float.parseFloat(getFtxtPrecio().getText());
        if(getFtxtPrecio().getText().contains("[0-9]*")){
            JOptionPane.showMessageDialog(null, "El precio es err??neo");
            return;
        }
        int cantidad = (int) getSpnCantidad().getValue();
        
        a = new Articulo(code, nombre, cantidad, precio);
        a??adirElemento(getTableArticulos(), a);
        System.out.println("hice algo");
        JOptionPane.showMessageDialog(null, "Articulo agregado");
    }//GEN-LAST:event_btnAddActionPerformed
    private void a??adirElemento(JTable tabla, Articulo a) {
        System.out.println("yo tambien hice algo");
        DefaultTableModel dtm;
        dtm = new DefaultTableModel();
        dtm = (DefaultTableModel) tabla.getModel();
        dtm.addRow(new Object[]{});
        
            tabla.setValueAt(a.getCode(), tabla.getRowCount()-1, 0);
            tabla.setValueAt(a.getNombre(), tabla.getRowCount()-1,1);
            tabla.setValueAt(a.getCantidad(), tabla.getRowCount()-1, 2);
            tabla.setValueAt(a.getPrecio(), tabla.getRowCount()-1, 3);
            tabla.setValueAt(a.getPrecio()*a.getCantidad(), tabla.getRowCount()-1, 4);
        this.subtotal += a.getPrecio()*a.getCantidad();
        getLblSub().setText("Subtotal: "+ String.valueOf(this.subtotal));
        float IVA =(float) (this.subtotal*0.15); 
        getLblIVA().setText("IVA: "+ String.valueOf(IVA));
        getLblTotal().setText("Total: "+String.valueOf(this.subtotal+IVA));
    }
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
            java.util.logging.Logger.getLogger(FrmFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmFactura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JFormattedTextField ftxtPrecio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblIVA;
    private javax.swing.JLabel lblSub;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JPanel pnlContentAdd;
    private javax.swing.JPanel pnlTotal;
    private javax.swing.JSpinner spnCantidad;
    private javax.swing.JTable tableArticulos;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
