package libreria.vista;

import libreria.constructor.Usuario;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

  Usuario u;

  public Login() {
    initComponents();
    u = new Usuario(0, "Juan", "Juan");
    CentrarVentana();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    labelUsuario = new javax.swing.JLabel();
    textUsuario = new javax.swing.JTextField();
    textContrasena = new javax.swing.JTextField();
    labelContrasena = new javax.swing.JLabel();
    bottonEntrar = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("Inicio de sesión");
    setAutoRequestFocus(false);
    setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    setResizable(false);

    labelUsuario.setText("Usuario");

    textUsuario.setText("Juan");

    textContrasena.setText("Juan");

    labelContrasena.setText("Contraseña");

    bottonEntrar.setText("Entrar");
    bottonEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    bottonEntrar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        bottonEntrarActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(24, 24, 24)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(bottonEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
            .addComponent(textContrasena)
            .addComponent(labelContrasena, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE))
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
            .addComponent(textUsuario)
            .addComponent(labelUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)))
        .addGap(24, 24, 24))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(32, 32, 32)
        .addComponent(labelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(textUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(labelContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(textContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(bottonEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(32, 32, 32))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void bottonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bottonEntrarActionPerformed
    String nombre = textUsuario.getText().trim(), clave = textContrasena.getText().trim();
    if ( !u.getUsuario().equals(nombre) || !u.getClave().equals(clave) ) {
      JOptionPane.showMessageDialog(rootPane, "Credenciales incorrectas", "Notificación", JOptionPane.WARNING_MESSAGE);
      return;
    }
    new Principal( nombre ).setVisible(true);
    this.dispose();
  }//GEN-LAST:event_bottonEntrarActionPerformed
  
  private void CentrarVentana (){
    int altoVentana = this.getHeight();
    int altoPantalla = Toolkit.getDefaultToolkit().getScreenSize().height;
    int alto = (altoPantalla/2) - (altoVentana/2);
    
    int anchoVentana = this.getWidth();
    int anchoPantalla = Toolkit.getDefaultToolkit().getScreenSize().width;
    int ancho = (anchoPantalla/2) - (anchoVentana/2);
    
    this.setLocation(ancho, alto);
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
      java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new Login().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton bottonEntrar;
  private javax.swing.JLabel labelContrasena;
  private javax.swing.JLabel labelUsuario;
  private javax.swing.JTextField textContrasena;
  private javax.swing.JTextField textUsuario;
  // End of variables declaration//GEN-END:variables
}
