/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

import controlador.DaoClientes;
import controlador.DaoDetalleSalida;
import controlador.DaoEntradas;
import controlador.DaoSalidas;
import java.util.Calendar;
import java.sql.Date;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.cliente;
import modelo.entradas;
import modelo.salidas;

/**
 *
 * @author LENOVO
 */
public class Salidas extends javax.swing.JPanel {
    salidas s=new salidas();
    DaoSalidas daoS=new DaoSalidas();
    DaoDetalleSalida daoDS=new DaoDetalleSalida();
    
    cliente c=new cliente();
    DaoClientes daoC=new DaoClientes();
    DefaultTableModel modelo=new DefaultTableModel();
    
    entradas e=new entradas();
    DaoEntradas daoE=new DaoEntradas();
    
    int filaSeleccionada;

    /**
     * Creates new form salidas
     */
    public Salidas() {
        initComponents();
        numSalida();
    }

    void numSalida(){
        String numero=daoS.numSalida();
        if(numero==null){
            txtnsalida.setText("001");
            
        }else{
            int i=Integer.parseInt(numero);
            i=i+1;
            txtnsalida.setText("00"+i);
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

        btnIcono = new RSMaterialComponent.RSButtonMaterialIconDos();
        jLabel4 = new javax.swing.JLabel();
        jpanelRound1 = new modelo.JpanelRound();
        jLabel1 = new javax.swing.JLabel();
        txtdocumento = new javax.swing.JTextField();
        txtnombreapellido = new javax.swing.JTextField();
        txtidcliente = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        txtcorreo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnbuscarclientes = new RSMaterialComponent.RSButtonMaterialIconDos();
        jpanelRound2 = new modelo.JpanelRound();
        jLabel9 = new javax.swing.JLabel();
        txtidentrada = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtnombreentrada = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtstock = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtcantidad = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtprecio = new javax.swing.JTextField();
        btnbuscarentrada = new RSMaterialComponent.RSButtonMaterialIconDos();
        jcfecha = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaSalidas = new javax.swing.JTable();
        jpanelRound3 = new modelo.JpanelRound();
        jLabel15 = new javax.swing.JLabel();
        txtsubtotal = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtigv = new javax.swing.JTextField();
        btngenerar = new RSMaterialComponent.RSButtonMaterialIconDos();
        jLabel17 = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        btnagregar = new RSMaterialComponent.RSButtonMaterialIconDos();
        txtnsalida = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        btnnuevasalida = new RSMaterialComponent.RSButtonMaterialIconDos();

        setBackground(new java.awt.Color(238, 238, 238));

        btnIcono.setBackground(new java.awt.Color(14, 76, 117));
        btnIcono.setBackgroundHover(new java.awt.Color(50, 130, 181));
        btnIcono.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.KEYBOARD_ARROW_UP);
        btnIcono.setRound(25);
        btnIcono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIconoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Registro de Salidas");

        jpanelRound1.setBackground(new java.awt.Color(255, 255, 255));
        jpanelRound1.setRoundBottomLeft(25);
        jpanelRound1.setRoundBottomRight(25);
        jpanelRound1.setRoundTopLeft(25);
        jpanelRound1.setRoundTopRight(25);

        jLabel1.setText("Datos de Clientes");

        jLabel2.setText("ID");

        jLabel3.setText("Documento");

        jLabel5.setText("Nombre y Apellido");

        jLabel6.setText("Telefono");

        jLabel7.setText("Correo");

        btnbuscarclientes.setBackground(new java.awt.Color(153, 204, 255));
        btnbuscarclientes.setBackgroundHover(new java.awt.Color(153, 204, 255));
        btnbuscarclientes.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        btnbuscarclientes.setRound(25);
        btnbuscarclientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarclientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanelRound1Layout = new javax.swing.GroupLayout(jpanelRound1);
        jpanelRound1.setLayout(jpanelRound1Layout);
        jpanelRound1Layout.setHorizontalGroup(
            jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelRound1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpanelRound1Layout.createSequentialGroup()
                        .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtcorreo)
                            .addComponent(txtnombreapellido, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpanelRound1Layout.createSequentialGroup()
                                .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtdocumento, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                                        .addComponent(txtidcliente)
                                        .addComponent(jLabel1))
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpanelRound1Layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jpanelRound1Layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(txttelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)))
                                    .addGroup(jpanelRound1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnbuscarclientes, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(24, 24, 24))))
        );
        jpanelRound1Layout.setVerticalGroup(
            jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpanelRound1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(2, 2, 2)
                        .addComponent(txtdocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnbuscarclientes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtidcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtnombreapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        jpanelRound2.setBackground(new java.awt.Color(255, 255, 255));
        jpanelRound2.setRoundBottomLeft(25);
        jpanelRound2.setRoundBottomRight(25);
        jpanelRound2.setRoundTopLeft(25);
        jpanelRound2.setRoundTopRight(25);

        jLabel9.setText("Datos de Entrada");

        jLabel10.setText("ID");

        jLabel11.setText("Nombre");

        jLabel12.setText("Stock");

        jLabel13.setText("Cantidad");

        jLabel14.setText("Precio");

        btnbuscarentrada.setBackground(new java.awt.Color(153, 204, 255));
        btnbuscarentrada.setBackgroundHover(new java.awt.Color(153, 204, 255));
        btnbuscarentrada.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        btnbuscarentrada.setRound(25);
        btnbuscarentrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarentradaActionPerformed(evt);
            }
        });

        jLabel8.setText("Fecha de salida");

        javax.swing.GroupLayout jpanelRound2Layout = new javax.swing.GroupLayout(jpanelRound2);
        jpanelRound2.setLayout(jpanelRound2Layout);
        jpanelRound2Layout.setHorizontalGroup(
            jpanelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpanelRound2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnbuscarentrada, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpanelRound2Layout.createSequentialGroup()
                        .addGroup(jpanelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10)
                            .addComponent(txtidentrada, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(txtnombreentrada, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                            .addComponent(txtstock))
                        .addGap(18, 18, 18)
                        .addGroup(jpanelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel14)
                            .addComponent(txtprecio, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(txtcantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(jLabel13)
                            .addComponent(jcfecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jpanelRound2Layout.setVerticalGroup(
            jpanelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelRound2Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpanelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8)))
                    .addComponent(btnbuscarentrada, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtidentrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnombreentrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtstock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tablaSalidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IDsalida", "IDentrada", "Producto", "PrecioU", "Cant.", "importe"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablaSalidas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaSalidasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaSalidas);

        jpanelRound3.setBackground(new java.awt.Color(255, 255, 255));
        jpanelRound3.setRoundBottomLeft(25);
        jpanelRound3.setRoundBottomRight(25);
        jpanelRound3.setRoundTopLeft(25);
        jpanelRound3.setRoundTopRight(25);

        jLabel15.setText("Sub Total");

        jLabel16.setText("IGV");

        btngenerar.setBackground(new java.awt.Color(14, 76, 117));
        btngenerar.setText("Generar");
        btngenerar.setBackgroundHover(new java.awt.Color(50, 130, 181));
        btngenerar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SAVE);
        btngenerar.setRound(25);
        btngenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngenerarActionPerformed(evt);
            }
        });

        jLabel17.setText("Total");

        btnagregar.setBackground(new java.awt.Color(14, 76, 117));
        btnagregar.setText("Agregar");
        btnagregar.setBackgroundHover(new java.awt.Color(50, 130, 181));
        btnagregar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SAVE);
        btnagregar.setRound(25);
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanelRound3Layout = new javax.swing.GroupLayout(jpanelRound3);
        jpanelRound3.setLayout(jpanelRound3Layout);
        jpanelRound3Layout.setHorizontalGroup(
            jpanelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addGroup(jpanelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelRound3Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(btngenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpanelRound3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpanelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtsubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtigv, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jpanelRound3Layout.setVerticalGroup(
            jpanelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound3Layout.createSequentialGroup()
                .addComponent(btnagregar, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtsubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpanelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtigv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpanelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btngenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        txtnsalida.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtnsalida.setText("sadsadsa");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setText("Número salida:");

        btnnuevasalida.setBackground(new java.awt.Color(255, 204, 204));
        btnnuevasalida.setText("Nueva salida");
        btnnuevasalida.setBackgroundHover(new java.awt.Color(153, 204, 255));
        btnnuevasalida.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.UPDATE);
        btnnuevasalida.setRound(25);
        btnnuevasalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevasalidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jpanelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jpanelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnIcono, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnnuevasalida, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addComponent(txtnsalida)
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpanelRound3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnIcono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnsalida)
                            .addComponent(jLabel18)
                            .addComponent(btnnuevasalida, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpanelRound2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpanelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jpanelRound3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnIconoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIconoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIconoActionPerformed

    private void btngenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngenerarActionPerformed

        s.setNumSalida(txtnsalida.getText());
        s.setIdCliente(Integer.parseInt(txtidcliente.getText()));
        s.setSubtotal(Double.parseDouble(txtsubtotal.getText()));
        s.setIgv(Double.parseDouble(txtigv.getText()));
        s.setTotal(Double.parseDouble(txttotal.getText()));
        Calendar cal;
        int d,m,a;
        cal =jcfecha.getCalendar();
        d=cal.get(Calendar.DAY_OF_MONTH);
        m=cal.get(Calendar.MONTH);
        a=cal.get(Calendar.YEAR)-1900;
        s.setFecha(new Date(a,m,d));
        
        if(daoS.insertar(s)){
            guardarDetalle();
            MenuPrincipal m1= new MenuPrincipal();
            m1.exito("salida registrada con exito");
            restaStock();
        }
        else{
            //JOptionPane.showConfirmDialog(null, "No se pudo registrar al cliente");           
            MenuPrincipal m2= new MenuPrincipal();
            m2.mistake("No se pudo registrar la salida");
            
            
        }

    }//GEN-LAST:event_btngenerarActionPerformed

    private void btnbuscarclientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarclientesActionPerformed

        
        c.setDocumento(txtdocumento.getText());
        if(daoC.buscar(c)){

            txtidcliente.setText(c.getIdCliente() + "");
            txtnombreapellido.setText(c.getNombre()+" "+ c.getApellido());
            
            txtdocumento.setText(c.getDocumento());
            txttelefono.setText(c.getTelefono());
            txtcorreo.setText(c.getCorreo());   
        }else{
            MenuPrincipal mp=new MenuPrincipal();
            mp.mistake("El cliente no existe");
            
            //limpiarCampos();
        }

    }//GEN-LAST:event_btnbuscarclientesActionPerformed

    private void btnbuscarentradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarentradaActionPerformed

        BuscaEntradas m = new BuscaEntradas();
        m.setVisible(true);

    }//GEN-LAST:event_btnbuscarentradaActionPerformed

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        // TODO add your handling code here:
        
        agregaEntrada();
        limpiarDatosProd();
        sumarTotal();
    }//GEN-LAST:event_btnagregarActionPerformed

    private void btnnuevasalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevasalidaActionPerformed
        
        numSalida();
        limpiarDatosProd();
        limpiarDatosCli();
        txttotal.setText(String.format(""));
        txtsubtotal.setText(String.format(""));
        txtigv.setText(String.format(""));
        limpiarTablaSalida();
        
        
    }//GEN-LAST:event_btnnuevasalidaActionPerformed

    private void tablaSalidasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaSalidasMouseClicked
        
        filaSeleccionada=tablaSalidas.getSelectedRow();
        txtidentrada.setText(tablaSalidas.getValueAt(filaSeleccionada, 1).toString());
        txtcantidad.setText(tablaSalidas.getValueAt(filaSeleccionada, 4).toString());
        txtnombreentrada.setText(tablaSalidas.getValueAt(filaSeleccionada, 2).toString());
        txtprecio.setText(tablaSalidas.getValueAt(filaSeleccionada, 5).toString());
        
        e.setIdEntrada(Integer.parseInt(txtidentrada.getText()));
        
        if(daoE.buscar(e)){
            txtstock.setText(e.getStock()+"");
            
            
        }
        
    }//GEN-LAST:event_tablaSalidasMouseClicked


    private void agregaEntrada(){
        double precio,total, importe;
        modelo=(DefaultTableModel) tablaSalidas.getModel();
        int idSalidas=Integer.parseInt(txtnsalida.getText());
        int idEntrada=Integer.parseInt(txtidentrada.getText());     
        int cantidad=Integer.parseInt(txtcantidad.getText());
        precio=Double.parseDouble(txtprecio.getText());
        String prod=txtnombreentrada.getText();
        
        
        importe=cantidad*precio;
        int stock=Integer.parseInt(txtstock.getText());
        ArrayList lista=new ArrayList();
        
        if(stock>0 && cantidad<=stock){
            lista.add(idSalidas);
            lista.add(idEntrada);
            lista.add(prod);
            lista.add(precio);
            lista.add(cantidad);
            lista.add(importe);
            
            Object[] ob=new Object[6];
            ob[0]=lista.get(0);
            ob[1]=lista.get(1);
            ob[2]=lista.get(2);
            ob[3]=lista.get(3);
            ob[4]=lista.get(4);
            ob[5]=lista.get(5);
            modelo.addRow(ob);
            tablaSalidas.setModel(modelo);
        }else{
            MenuPrincipal mp=new MenuPrincipal();
            mp.mistake("Stock insuficiente");
        }
    }
    
    void guardarDetalle(){
        for(int i=0;i<tablaSalidas.getRowCount();i++){
            int idSalida=Integer.parseInt(tablaSalidas.getValueAt(i, 0).toString());
            int idEntrada=Integer.parseInt(tablaSalidas.getValueAt(i, 1).toString());
            int cant=Integer.parseInt(tablaSalidas.getValueAt(i, 4).toString());
            Double importe=Double.parseDouble(tablaSalidas.getValueAt(i, 5).toString());
            
            daoDS.insertar(idSalida, idEntrada, cant, importe);
        }
    }
    
    void restaStock(){
        for(int i=0;i<tablaSalidas.getRowCount();i++){
            int idEntrada=Integer.parseInt(tablaSalidas.getValueAt(i, 1).toString());
            int cant=Integer.parseInt(tablaSalidas.getValueAt(i, 4).toString());
            
            daoS.restarStock(idEntrada, cant);
        }
    }   
    
    void sumarTotal(){
        double fila, igv, subtotal, total=0;
        for(int i=0;i<tablaSalidas.getRowCount();i++){
            fila=Double.parseDouble(tablaSalidas.getValueAt(i, 5).toString());
            total+=fila;
            
            igv=total*0.18;
            subtotal=total-igv;
            txttotal.setText(String.format("%.2f", total).replace(",","."));
            txtsubtotal.setText(String.format("%.2f", subtotal).replace(",","."));
            txtigv.setText(String.format("%.2f", igv).replace(",","."));
        }
        
    }
    
    void limpiarDatosProd(){
        txtidentrada.setText("");
        txtcantidad.setText("");
        txtnombreentrada.setText("");
        txtstock.setText("");
        txtprecio.setText("");
        
    }
    
    void limpiarDatosCli(){
        txttelefono.setText("");
        txtidcliente.setText("");
        txtcorreo.setText("");
        txtdocumento.setText("");
        txtnombreapellido.setText("");
    }
    void limpiarTablaSalida(){
        for(int i=0;i<modelo.getRowCount();i++){
            modelo.removeRow(i);
            i=0-1;
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonMaterialIconDos btnIcono;
    private RSMaterialComponent.RSButtonMaterialIconDos btnagregar;
    private RSMaterialComponent.RSButtonMaterialIconDos btnbuscarclientes;
    private RSMaterialComponent.RSButtonMaterialIconDos btnbuscarentrada;
    private RSMaterialComponent.RSButtonMaterialIconDos btngenerar;
    private RSMaterialComponent.RSButtonMaterialIconDos btnnuevasalida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    public static com.toedter.calendar.JDateChooser jcfecha;
    private modelo.JpanelRound jpanelRound1;
    private modelo.JpanelRound jpanelRound2;
    private modelo.JpanelRound jpanelRound3;
    private javax.swing.JTable tablaSalidas;
    public static javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtdocumento;
    private javax.swing.JTextField txtidcliente;
    public static javax.swing.JTextField txtidentrada;
    private javax.swing.JTextField txtigv;
    private javax.swing.JTextField txtnombreapellido;
    public static javax.swing.JTextField txtnombreentrada;
    private javax.swing.JLabel txtnsalida;
    public static javax.swing.JTextField txtprecio;
    public static javax.swing.JTextField txtstock;
    private javax.swing.JTextField txtsubtotal;
    private javax.swing.JTextField txttelefono;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables
}