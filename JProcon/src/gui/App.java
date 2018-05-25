package gui;

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.URL;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.Contacto;
import model.Data;
import model.listModels.LMContacto;

public class App extends javax.swing.JFrame {

    private Data d; // siempre acá

    private final boolean DEBUG = true;

    /**
     * Constructor de la aplicación
     */
    public App() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Procon v0.1");

        cambiarIcono();
        initVentanas();
        d = new Data(); // siempre acá
        
        txtDominioCorreo.getEditor().getEditorComponent().addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {
            }

            @Override
            public void keyPressed(KeyEvent ke) {
            }

            @Override
            public void keyReleased(KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                    txtNum1.requestFocus();
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        formContacto = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNum1 = new javax.swing.JFormattedTextField();
        txtNum2 = new javax.swing.JFormattedTextField();
        txtNomCorreo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDominioCorreo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaGrafica = new javax.swing.JList();
        txtBuscar = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        miCrearContacto = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        miSalir = new javax.swing.JMenuItem();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de contacto"));

        jLabel2.setText("Nombre:");

        jLabel3.setText("Correo:");

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
        });

        jLabel4.setText("Telefono 1:");

        jLabel5.setText("Telefono 2:");

        try {
            txtNum1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("+569-########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtNum1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNum1KeyReleased(evt);
            }
        });

        try {
            txtNum2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("+569-########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtNum2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNum2KeyReleased(evt);
            }
        });

        txtNomCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNomCorreoKeyReleased(evt);
            }
        });

        jLabel6.setText("@");

        txtDominioCorreo.setEditable(true);
        txtDominioCorreo.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtDominioCorreo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "gmail.com", "live.es", "live.com", "hotmail.com", "outlook.com" }));
        txtDominioCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDominioCorreoKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDominioCorreoKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtNomCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDominioCorreo, 0, 142, Short.MAX_VALUE))
                    .addComponent(txtNum1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNum2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(38, 38, 38))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNomCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtDominioCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(listaGrafica);

        txtBuscar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconos/delete.png"))); // NOI18N
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconos/actualizar.png"))); // NOI18N

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconos/crear.png"))); // NOI18N
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconos/limpiar.png"))); // NOI18N
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconos/volver.png"))); // NOI18N
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout formContactoLayout = new javax.swing.GroupLayout(formContacto.getContentPane());
        formContacto.getContentPane().setLayout(formContactoLayout);
        formContactoLayout.setHorizontalGroup(
            formContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formContactoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBuscar)
                    .addGroup(formContactoLayout.createSequentialGroup()
                        .addGroup(formContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(formContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(formContactoLayout.createSequentialGroup()
                                    .addComponent(btnLimpiar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnCancelar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnEditar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnGuardar))
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnVolver))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)))
                .addContainerGap())
        );
        formContactoLayout.setVerticalGroup(
            formContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formContactoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formContactoLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(formContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnGuardar)
                            .addComponent(btnLimpiar)
                            .addComponent(btnEditar)
                            .addComponent(btnCancelar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                        .addComponent(btnVolver))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconos/contacto_128.png"))); // NOI18N

        jMenu1.setMnemonic('a');
        jMenu1.setText("Archivo");

        miCrearContacto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        miCrearContacto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconos/contacto.png"))); // NOI18N
        miCrearContacto.setMnemonic('c');
        miCrearContacto.setText("Crear contacto");
        miCrearContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCrearContactoActionPerformed(evt);
            }
        });
        jMenu1.add(miCrearContacto);
        jMenu1.add(jSeparator1);

        miSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        miSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconos/salir.png"))); // NOI18N
        miSalir.setMnemonic('s');
        miSalir.setText("Salir");
        miSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSalirActionPerformed(evt);
            }
        });
        jMenu1.add(miSalir);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miCrearContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCrearContactoActionPerformed
        try {
            listarContactos();

            formContacto.setLocationRelativeTo(null);
            formContacto.setVisible(true);
            txtNombre.requestFocus();
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(formContacto, "Error: " + ex.getMessage());
        }
    }//GEN-LAST:event_miCrearContactoActionPerformed

    private void miSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSalirActionPerformed
        salir();
    }//GEN-LAST:event_miSalirActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        salir();
    }//GEN-LAST:event_formWindowClosing

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // quizas en algún futuro, limpiar el formulario
        formContacto.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        registrarContacto();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarFormulario();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

        Contacto c = (Contacto) listaGrafica.getSelectedValue();

        if (JOptionPane.showConfirmDialog(formContacto, "¿Desea eliminar a " + c.nombre + "?") == JOptionPane.YES_OPTION) {
            try {

                d.eliminarContacto(c.id);
                listarContactos();

                JOptionPane.showMessageDialog(formContacto, "Contacto eliminado!");
            } catch (ClassNotFoundException | SQLException ex) {
                JOptionPane.showMessageDialog(formContacto, "Error: " + ex.getMessage());
            }
        }


    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        try {
            String texto = txtBuscar.getText();

            LMContacto model = new LMContacto(d.getContactos(texto));
            listaGrafica.setModel(model);
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(formContacto, "Error: " + ex.getMessage());
        }
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed
//        System.out.println("KEYPRESS");
    }//GEN-LAST:event_txtBuscarKeyPressed

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
//        System.out.println("KEYTYPED");
    }//GEN-LAST:event_txtBuscarKeyTyped

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtNomCorreo.requestFocus();
        }
    }//GEN-LAST:event_txtNombreKeyReleased

    private void txtNomCorreoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomCorreoKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtDominioCorreo.requestFocus();
        }
    }//GEN-LAST:event_txtNomCorreoKeyReleased

    private void txtDominioCorreoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDominioCorreoKeyReleased
        
        
    }//GEN-LAST:event_txtDominioCorreoKeyReleased

    private void txtNum1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNum1KeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtNum2.requestFocus();
        }
    }//GEN-LAST:event_txtNum1KeyReleased

    private void txtNum2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNum2KeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            registrarContacto();
        }
    }//GEN-LAST:event_txtNum2KeyReleased

    private void txtDominioCorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDominioCorreoKeyTyped
        
    }//GEN-LAST:event_txtDominioCorreoKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreKeyPressed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JFrame formContacto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JList listaGrafica;
    private javax.swing.JMenuItem miCrearContacto;
    private javax.swing.JMenuItem miSalir;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JComboBox<String> txtDominioCorreo;
    private javax.swing.JTextField txtNomCorreo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JFormattedTextField txtNum1;
    private javax.swing.JFormattedTextField txtNum2;
    // End of variables declaration//GEN-END:variables

    private void cambiarIcono() {
        String ruta = "/gui/iconos/contacto_128.png";

        URL url = getClass().getResource(ruta);

        ImageIcon imageIcon = new ImageIcon(url);

        Image image = imageIcon.getImage();

        setIconImage(image);
        formContacto.setIconImage(image);
    }

    private void initVentanas() {
        formContacto.setTitle("Crear contacto");
        formContacto.setBounds(0, 0, 800, 600);
    }

    private void salir() {
        if (DEBUG) {
            System.exit(0);
        } else if (JOptionPane.showConfirmDialog(this, "¿Desea salir?") == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    private void listarContactos() throws ClassNotFoundException, SQLException {
        LMContacto model = new LMContacto(d.getContactos());
        listaGrafica.setModel(model);
    }

    private void limpiarFormulario() {
        /*Limpiamos el formulario*/
        txtNombre.setText("");
        txtNomCorreo.setText("");
        txtDominioCorreo.setSelectedIndex(0);
        txtNum1.setText("");
        txtNum2.setText("");

        txtNombre.requestFocus();
    }

    private void registrarContacto() {
         // Rescatar datos del formulario
        String nombre, correo, tel1, tel2;

        nombre = txtNombre.getText();
        correo = txtNomCorreo.getText() + "@" + txtDominioCorreo.getSelectedItem().toString().trim();
        tel1 = txtNum1.getText();
        tel2 = txtNum2.getText();

        try {
            d.crearContacto(nombre, correo, tel1, tel2);

            limpiarFormulario();
            listarContactos();

            JOptionPane.showMessageDialog(formContacto, "Contacto creado!");
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(formContacto, "Error: " + ex.getMessage());
        }
    }
}
