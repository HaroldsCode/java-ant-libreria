package libreria.vista;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import libreria.constructor.Autor;
import libreria.persistencia.Conexion;

public class GestionarAutor extends javax.swing.JPanel {

  Conexion con;
  
  DefaultTableModel modeloTabla;
  Autor autor;
  
  public GestionarAutor() {
    con = new Conexion();
    autor = null;
    
    initComponents();
    
    modeloTabla = (DefaultTableModel) tablaAutores.getModel();
    cargarTabla();
    botonDinamico();
  }

  private void cargarTabla (){
    for (int i = 0; i < tablaAutores.getRowCount(); i++) {
      modeloTabla.removeRow(i);
      i-=1;
    }
    for ( Autor autor : con.autor.listadoAutores() ) {
      modeloTabla.addRow( new Object[] { autor.getId(), autor.getNombre() } );
    }
  }
  
  private void botonDinamico () {
    if ( autor == null ) {
      botonAccion.setText("Guardar");
      botonEliminar.setVisible(false);
      botonCancelar.setVisible(false);
    } else {
      botonAccion.setText("Actualizar");
      botonEliminar.setVisible(true);
      botonCancelar.setVisible(true);
    }
  }
  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    jScrollPane1 = new javax.swing.JScrollPane();
    tablaAutores = new javax.swing.JTable();
    jPanel1 = new javax.swing.JPanel();
    jLabel2 = new javax.swing.JLabel();
    textoNombre = new javax.swing.JTextField();
    botonAccion = new javax.swing.JButton();
    botonEliminar = new javax.swing.JButton();
    botonCancelar = new javax.swing.JButton();

    setBackground(new java.awt.Color(246, 246, 246));
    setMaximumSize(new java.awt.Dimension(827, 520));
    setMinimumSize(new java.awt.Dimension(827, 520));
    setPreferredSize(new java.awt.Dimension(827, 520));

    jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel1.setText("Autores");

    tablaAutores.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {
        "Id", "Nombre del autor"
      }
    ) {
      Class[] types = new Class [] {
        java.lang.String.class, java.lang.String.class
      };
      boolean[] canEdit = new boolean [] {
        false, false
      };

      public Class getColumnClass(int columnIndex) {
        return types [columnIndex];
      }

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    tablaAutores.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        tablaAutoresMouseClicked(evt);
      }
    });
    jScrollPane1.setViewportView(tablaAutores);
    if (tablaAutores.getColumnModel().getColumnCount() > 0) {
      tablaAutores.getColumnModel().getColumn(0).setResizable(false);
      tablaAutores.getColumnModel().getColumn(0).setPreferredWidth(10);
      tablaAutores.getColumnModel().getColumn(1).setResizable(false);
      tablaAutores.getColumnModel().getColumn(1).setPreferredWidth(600);
    }

    jPanel1.setBackground(new java.awt.Color(246, 246, 246));
    jPanel1.setMaximumSize(new java.awt.Dimension(465, 142));
    jPanel1.setMinimumSize(new java.awt.Dimension(465, 142));

    jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jLabel2.setText("Nombre del autor");

    botonAccion.setText("Guardar/ Editar");
    botonAccion.setMaximumSize(new java.awt.Dimension(73, 20));
    botonAccion.setMinimumSize(new java.awt.Dimension(73, 20));
    botonAccion.setPreferredSize(new java.awt.Dimension(73, 20));
    botonAccion.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        botonAccionActionPerformed(evt);
      }
    });

    botonEliminar.setText("Eliminar");
    botonEliminar.setMaximumSize(new java.awt.Dimension(73, 20));
    botonEliminar.setMinimumSize(new java.awt.Dimension(73, 20));
    botonEliminar.setPreferredSize(new java.awt.Dimension(73, 20));
    botonEliminar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        botonEliminarActionPerformed(evt);
      }
    });

    botonCancelar.setText("Cancelar");
    botonCancelar.setMaximumSize(new java.awt.Dimension(73, 20));
    botonCancelar.setMinimumSize(new java.awt.Dimension(73, 20));
    botonCancelar.setPreferredSize(new java.awt.Dimension(73, 20));
    botonCancelar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        botonCancelarActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(textoNombre, javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jLabel2)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 278, Short.MAX_VALUE)
            .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(botonAccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(botonEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
            .addComponent(botonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
          .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGap(11, 11, 11)
        .addComponent(textoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(botonAccion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(21, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jScrollPane1)
          .addGroup(layout.createSequentialGroup()
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
            .addGap(6, 6, 6)))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addGroup(layout.createSequentialGroup()
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
            .addGap(7, 7, 7)))
        .addGap(0, 0, 0)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
        .addContainerGap())
    );
  }// </editor-fold>//GEN-END:initComponents

  private void botonAccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAccionActionPerformed
    if ( textoNombre.getText().trim().length() > 0 ) {
      if ( autor == null ) {
        con.autor.guardarAutor( new Autor( 0, textoNombre.getText().trim() ) );    
      } else {
        con.autor.actualizarAutor(new Autor( autor.getId(), textoNombre.getText().trim() ) );  
        tablaAutores.clearSelection();
        autor = null;
      }
      textoNombre.setText("");
      cargarTabla();
    } else {
      JOptionPane.showMessageDialog(this, "Campo vacío!");
    }
    botonDinamico();
  }//GEN-LAST:event_botonAccionActionPerformed

  private void tablaAutoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaAutoresMouseClicked
    int id = (int) modeloTabla.getValueAt(tablaAutores.getSelectedRow(), 0);
    Autor temporal = con.autor.consultarAutorPorId(id);
    autor = new Autor( temporal.getId(), temporal.getNombre() );
    textoNombre.setText(autor.getNombre());
    botonDinamico();
  }//GEN-LAST:event_tablaAutoresMouseClicked

  private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
    autor = null;
    textoNombre.setText("");
    tablaAutores.clearSelection();
    botonDinamico();
  }//GEN-LAST:event_botonCancelarActionPerformed

  private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
    if ( JOptionPane.showConfirmDialog(this, "Desea eliminar al autor "+autor.getNombre(), "",JOptionPane.YES_NO_OPTION ) == 0 ) {
      con.autor.eliminarAutor( autor.getId() );
      autor = null;
      textoNombre.setText("");
      cargarTabla();
      botonDinamico();
    }
  }//GEN-LAST:event_botonEliminarActionPerformed

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton botonAccion;
  private javax.swing.JButton botonCancelar;
  private javax.swing.JButton botonEliminar;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTable tablaAutores;
  private javax.swing.JTextField textoNombre;
  // End of variables declaration//GEN-END:variables
}
