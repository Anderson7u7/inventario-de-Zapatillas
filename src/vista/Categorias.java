/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

import controlador.DaoCategorias;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Categoria;


public class Categorias extends javax.swing.JPanel {

    Categoria  ct=new Categoria();
    DaoCategorias daoCt= new DaoCategorias();
    
    DefaultTableModel modeloCategoria = new DefaultTableModel();
    
    
    /**
     * Creates new form Categorias
     */
    public Categorias() {
        
        initComponents();
        listarCategorias();

    }

    private void listarCategorias(){
        List<Categoria> lista= daoCt.listar();
        modeloCategoria=(DefaultTableModel) tblcategorias.getModel();
        Object[] ob=new Object[2];
        for(int i=0;i<lista.size();i++){
            ob[0]=lista.get(i).getIdCategoria();
            ob[1]=lista.get(i).getNomCategoria();
            modeloCategoria.addRow(ob);
            
        }
        tblcategorias.setModel(modeloCategoria);
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanelRound1 = new modelo.JpanelRound();
        jLabel2 = new javax.swing.JLabel();
        txtidcategoria = new javax.swing.JTextField();
        txtnomCategoria = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jpanelRound2 = new modelo.JpanelRound();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblcategorias = new javax.swing.JTable();
        btnGuardar = new RSMaterialComponent.RSButtonMaterialIconDos();
        btnEditar = new RSMaterialComponent.RSButtonMaterialIconDos();
        btnEliminar = new RSMaterialComponent.RSButtonMaterialIconDos();
        btnBuscar = new RSMaterialComponent.RSButtonMaterialIconDos();
        jLabel1 = new javax.swing.JLabel();
        btnGuardar2 = new RSMaterialComponent.RSButtonMaterialIconDos();

        setBackground(new java.awt.Color(232, 232, 232));

        jpanelRound1.setBackground(new java.awt.Color(255, 255, 255));
        jpanelRound1.setRoundBottomLeft(25);
        jpanelRound1.setRoundBottomRight(25);
        jpanelRound1.setRoundTopLeft(25);
        jpanelRound1.setRoundTopRight(25);

        jLabel2.setText("ID");

        txtidcategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidcategoriaActionPerformed(evt);
            }
        });

        txtnomCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomCategoriaActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombre");

        javax.swing.GroupLayout jpanelRound1Layout = new javax.swing.GroupLayout(jpanelRound1);
        jpanelRound1.setLayout(jpanelRound1Layout);
        jpanelRound1Layout.setHorizontalGroup(
            jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtidcategoria, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(txtnomCategoria)
                    .addGroup(jpanelRound1Layout.createSequentialGroup()
                        .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpanelRound1Layout.setVerticalGroup(
            jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtidcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtnomCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jpanelRound2.setBackground(new java.awt.Color(255, 255, 255));
        jpanelRound2.setRoundBottomLeft(25);
        jpanelRound2.setRoundBottomRight(25);
        jpanelRound2.setRoundTopLeft(25);
        jpanelRound2.setRoundTopRight(25);

        tblcategorias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Categoria"
            }
        ));
        tblcategorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblcategoriasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblcategorias);

        javax.swing.GroupLayout jpanelRound2Layout = new javax.swing.GroupLayout(jpanelRound2);
        jpanelRound2.setLayout(jpanelRound2Layout);
        jpanelRound2Layout.setHorizontalGroup(
            jpanelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jpanelRound2Layout.setVerticalGroup(
            jpanelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        btnGuardar.setBackground(new java.awt.Color(14, 76, 117));
        btnGuardar.setText("Guardar");
        btnGuardar.setBackgroundHover(new java.awt.Color(50, 130, 181));
        btnGuardar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SAVE);
        btnGuardar.setRound(25);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(14, 76, 117));
        btnEditar.setText("Editar");
        btnEditar.setBackgroundHover(new java.awt.Color(50, 130, 181));
        btnEditar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.EDIT);
        btnEditar.setRound(25);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(14, 76, 117));
        btnEliminar.setText("Eliminar");
        btnEliminar.setBackgroundHover(new java.awt.Color(50, 130, 181));
        btnEliminar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.DELETE);
        btnEliminar.setRound(25);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(14, 76, 117));
        btnBuscar.setText("Buscar");
        btnBuscar.setBackgroundHover(new java.awt.Color(50, 130, 181));
        btnBuscar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        btnBuscar.setRound(25);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Registro de Categorias");

        btnGuardar2.setBackground(new java.awt.Color(14, 76, 117));
        btnGuardar2.setBackgroundHover(new java.awt.Color(50, 130, 181));
        btnGuardar2.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.DASHBOARD);
        btnGuardar2.setRound(25);
        btnGuardar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jpanelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnGuardar2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jpanelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jpanelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGuardar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(27, 27, 27)
                        .addComponent(jpanelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(7, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtidcategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidcategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidcategoriaActionPerformed

    private void txtnomCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomCategoriaActionPerformed

    
    
    
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        ct.setNomCategoria(txtnomCategoria.getText());
        if(daoCt.insertar(ct)){
            //JOptionPane.showConfirmDialog(null, "Categoría registrada con exito");
            MenuPrincipal m= new MenuPrincipal();
            m.exito("Categoría registrada con exito");
            
        }
        else{
            //JOptionPane.showConfirmDialog(null, "No se pudo registrar la categoría");           
            MenuPrincipal m= new MenuPrincipal();
            m.mistake("No se pudo registrar al cliente");
        }
        limpiarTablaCategorias();
        listarCategorias();
        limpiarCampos();
           
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        
       int fila = tblcategorias.getSelectedRow();
       if(fila==-1&&txtidcategoria.getText().isEmpty()){
           //JOptionPane.showMessageDialog(null,"Selecciona una categoria");
           MenuPrincipal m= new MenuPrincipal();
           m.mistake("Selecciona una categoria");
       }else{
           ct.setIdCategoria(Integer.parseInt(txtidcategoria.getText()));
           ct.setNomCategoria(txtnomCategoria.getText());
           if(daoCt.editar(ct)){
               //JOptionPane.showMessageDialog(null,"Se modifico con exito");
               MenuPrincipal m= new MenuPrincipal();
               m.exito("Se modifico con exito");
               limpiarTablaCategorias();
               listarCategorias();
               limpiarCampos();
           }
           
       }
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void tblcategoriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblcategoriasMouseClicked
        // TODO add your handling code here:
        int fila=tblcategorias.getSelectedRow();
        txtidcategoria.setText(tblcategorias.getValueAt(fila, 0).toString());
        txtnomCategoria.setText(tblcategorias.getValueAt(fila, 1).toString()); 
        
        
    }//GEN-LAST:event_tblcategoriasMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        
        if(!txtidcategoria.getText().isEmpty()){
            int confirmacion=JOptionPane.showConfirmDialog(null, "Estas seguro de eliminar la categoria?","Confirmar",2);
        
            if(confirmacion==0){
                ct.setIdCategoria(Integer.parseInt(txtidcategoria.getText()));
                daoCt.eliminar(ct);
                limpiarTablaCategorias();
                listarCategorias();
                limpiarCampos();
                JOptionPane.showMessageDialog(null,"Se elimino con exito");    
            }
        }else{
                JOptionPane.showMessageDialog(null,"Seleccione una categoria");
            }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        
        ct.setIdCategoria(Integer.parseInt(txtidcategoria.getText()));
        if(daoCt.buscar(ct)){   
            txtidcategoria.setText(ct.getIdCategoria()+"");
            txtnomCategoria.setText(ct.getNomCategoria());
        }else{
            JOptionPane.showMessageDialog(null,"La categoria no existe");
            limpiarCampos();
        }
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnGuardar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar2ActionPerformed
        // TODO add your handling code here:
        ct.setNomCategoria(txtnomCategoria.getText());
        if(daoCt.insertar(ct)){
            JOptionPane.showConfirmDialog(null, "Categoría registrada con exito");
        }
        else{
            JOptionPane.showConfirmDialog(null, "No se pudo registrar la categoría");
        }
        limpiarTablaCategorias();
        listarCategorias();
        limpiarCampos();
    }//GEN-LAST:event_btnGuardar2ActionPerformed


    void limpiarCampos(){
        txtidcategoria.setText("");
        txtnomCategoria.setText("");
    }
    
    void limpiarTablaCategorias(){
        for(int i=0;i<modeloCategoria.getRowCount();i++){
            modeloCategoria.removeRow(i);
            i=0-1;
        }
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonMaterialIconDos btnBuscar;
    private RSMaterialComponent.RSButtonMaterialIconDos btnEditar;
    private RSMaterialComponent.RSButtonMaterialIconDos btnEliminar;
    private RSMaterialComponent.RSButtonMaterialIconDos btnGuardar;
    private RSMaterialComponent.RSButtonMaterialIconDos btnGuardar2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private modelo.JpanelRound jpanelRound1;
    private modelo.JpanelRound jpanelRound2;
    private javax.swing.JTable tblcategorias;
    private javax.swing.JTextField txtidcategoria;
    private javax.swing.JTextField txtnomCategoria;
    // End of variables declaration//GEN-END:variables
}
