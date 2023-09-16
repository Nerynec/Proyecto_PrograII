
package parcial.ii;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class laboratorioBD2 extends javax.swing.JFrame {

   private static final long serialVersionUID = 1L;
    
    Conexion conx = new Conexion();
    Connection conet;
    DefaultTableModel modelo;
    Statement st;
    ResultSet rs;
    
    int idc;
    
    
    public laboratorioBD2() {
        initComponents();
        setLocationRelativeTo(null);
        consultar();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        codigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        precio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cantidad = new javax.swing.JTextField();
        fecha = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        agregar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        actualizar = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        Busqueda = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        fecha1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        reportes = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(51, 255, 153));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Codigo");

        jLabel2.setBackground(new java.awt.Color(51, 255, 153));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Nombre");

        precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precioActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(51, 255, 153));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Insertar Fecha");

        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(51, 255, 153));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Precio");

        cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadActionPerformed(evt);
            }
        });

        fecha.setDateFormatString("yyyy-MM-d");

        jLabel5.setBackground(new java.awt.Color(51, 255, 153));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Cantidad");

        agregar.setBackground(new java.awt.Color(51, 255, 102));
        agregar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        agregar.setIcon(new javax.swing.ImageIcon("C:\\Users\\GAMECYBER\\Desktop\\add_icon.png")); // NOI18N
        agregar.setText("Agregar");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        eliminar.setBackground(new java.awt.Color(255, 51, 51));
        eliminar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        eliminar.setIcon(new javax.swing.ImageIcon("C:\\Users\\GAMECYBER\\Desktop\\delete_icon.png")); // NOI18N
        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        actualizar.setBackground(new java.awt.Color(51, 102, 255));
        actualizar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        actualizar.setIcon(new javax.swing.ImageIcon("C:\\Users\\GAMECYBER\\Desktop\\edit_icon.png")); // NOI18N
        actualizar.setText("Actualizar");
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });

        limpiar.setBackground(new java.awt.Color(255, 255, 0));
        limpiar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        limpiar.setIcon(new javax.swing.ImageIcon("C:\\Users\\GAMECYBER\\Desktop\\limpiar.png")); // NOI18N
        limpiar.setText("Limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        Busqueda.setBackground(new java.awt.Color(102, 255, 255));
        Busqueda.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Busqueda.setIcon(new javax.swing.ImageIcon("C:\\Users\\GAMECYBER\\Desktop\\busqueda.png")); // NOI18N
        Busqueda.setText("Busqueda");
        Busqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BusquedaActionPerformed(evt);
            }
        });

        Tabla.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Precio", "Cantidad", "Fecha de Vencimiento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Tabla);

        jLabel8.setBackground(new java.awt.Color(51, 255, 153));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Fecha del Producto");

        reportes.setBackground(new java.awt.Color(153, 0, 153));
        reportes.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        reportes.setIcon(new javax.swing.ImageIcon("C:\\Users\\GAMECYBER\\Desktop\\reporte.png")); // NOI18N
        reportes.setText("Reporte");
        reportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportesMouseClicked(evt);
            }
        });
        reportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(actualizar)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(reportes, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Busqueda)
                            .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 824, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reportes, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\GAMECYBER\\Desktop\\logo.jpg")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 866, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BusquedaActionPerformed
        String codigoBusqueda = codigo.getText();
        if (!codigoBusqueda.isEmpty()) {
            FindId();

        } else {
            JOptionPane.showMessageDialog(null, "Ingrese un código para realizar la búsqueda.");}
    }//GEN-LAST:event_BusquedaActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        codigo.setText("");
        nombre.setText("");
        precio.setText("");
        cantidad.setText("");
        fecha1.setText("");
        fecha.setDate(null);
    }//GEN-LAST:event_limpiarActionPerformed

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed
        modificar();
        consultar();
    }//GEN-LAST:event_actualizarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        eliminar();
    consultar();
    }//GEN-LAST:event_eliminarActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        agregar();
        consultar();
    }//GEN-LAST:event_agregarActionPerformed

    private void cantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void precioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioActionPerformed

    }//GEN-LAST:event_precioActionPerformed

    private void codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoActionPerformed

    private void reportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportesActionPerformed


    
    }//GEN-LAST:event_reportesActionPerformed

    private void reportesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportesMouseClicked
     try {
        Conexion con = new Conexion();
        conet = con.gertConnection(); 
        JasperReport reporte = null;
        String path = "C:\\Users\\GAMECYBER\\Desktop\\Programacion II\\PPIIA\\src\\Reportes\\Game.jasper";
        reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
        JasperPrint jprint = JasperFillManager.fillReport(reporte, null, conet);
        JasperViewer view = new JasperViewer(jprint, false);
        view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        view.setVisible(true);
    } catch (JRException ex) {
        Logger.getLogger(laboratorioBD2.class.getName()).log(Level.SEVERE, null, ex);
    }
        
        
    }//GEN-LAST:event_reportesMouseClicked

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(() -> {
            new laboratorioBD2().setVisible(true);
        });
    }
  

   
public void FindId() {
    
    String codigoBusqueda = codigo.getText();
     
        String sql = "SELECT * FROM producto WHERE codigoProducto = '" + codigoBusqueda + "'";
        
        try {
            conet = conx.gertConnection();
            st = conet.createStatement();
            rs = st.executeQuery(sql);

            Object[] producto = new Object[5];
            
            while(rs.next()){
            producto[0] = rs.getString("codigoProducto");
            producto[1] = rs.getString("nombreProducto");
            producto[2] = rs.getFloat("precioUnitario");
            producto[3] = rs.getInt("cantidadProducto");
            producto[4] = rs.getDate("fechaVencimiento");
        } codigo.setText(producto[0].toString());
            nombre.setText(producto[1].toString());
            precio.setText(producto[2].toString());
            cantidad.setText(producto[3].toString());
            fecha1.setText(producto[4].toString());}
            
            catch(SQLException e) {
        }
   
    }



    
    

void agregar() {
    String cod = codigo.getText();
    String nom = nombre.getText();
    String prec = precio.getText();
    String cant = cantidad.getText();
    java.util.Date fechaDate = fecha.getDate();
    
    if (fechaDate != null) {
        java.sql.Date fechaSQL = new java.sql.Date(fechaDate.getTime());
        String fech = fechaSQL.toString();
        
        try {
            if (!cod.isEmpty() && !nom.isEmpty() && !prec.isEmpty() && !cant.isEmpty() && !fech.isEmpty()) {
                String sql = "INSERT INTO `producto` (`codigoProducto`, `nombreProducto`, `precioUnitario`, `cantidadProducto`, `fechaVencimiento`) VALUES ('" + cod + "', '" + nom + "', '" + prec + "', '" + cant + "', '" + fech + "');";
                conet = conx.gertConnection(); 
                st = conet.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Producto registrado exitosamente!");
                limpiarTabla();
            } else {
                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios.");
            }
        } catch (HeadlessException | SQLException e) {
        }
    } else {
        JOptionPane.showMessageDialog(null, "Debe seleccionar una fecha.");
    }
}

    
    
    
void modificar() {
    String cod = codigo.getText();
    String nom = nombre.getText();
    String prec = precio.getText();
    String cant = cantidad.getText();
    
    java.util.Date fechaDate = fecha.getDate();

    if (fechaDate != null) {
        java.sql.Date fechaSQL = new java.sql.Date(fechaDate.getTime());
        String fech = fechaSQL.toString();
        
        try {
            if (!cod.isEmpty() && !nom.isEmpty() && !prec.isEmpty() && !cant.isEmpty() && !fech.isEmpty()) {
                String sql = "UPDATE `producto` SET `nombreProducto` = '" + nom + "', `precioUnitario` = '" + prec + "', `cantidadProducto` = '" + cant + "', `fechaVencimiento` = '" + fech + "' WHERE `producto`.`codigoProducto` = '" + cod + "';";
                conet = conx.gertConnection();
                st = conet.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Producto modificado exitosamente!");
                limpiarTabla();
            } else {
                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios.");
            }
        } catch (HeadlessException | SQLException e) {
        }
    } else {
        JOptionPane.showMessageDialog(null, "Debe seleccionar una fecha.");
    }
}


void eliminar() {
    String cod = codigo.getText();
    try {
        if (!cod.isEmpty()) {
            String sql = "DELETE FROM producto WHERE codigoProducto ='" + cod + "';";
            conet = conx.gertConnection();
            st = conet.createStatement();
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Producto eliminado exitosamente!");
            limpiarTabla();
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese el código del producto a eliminar.");
        }
    } catch (HeadlessException | SQLException e) {
    }
}

void limpiarTabla() {
    while (modelo.getRowCount() > 0) {
        modelo.removeRow(0);
    }
}

void consultar() {
    String sql = "select * from producto";
    try {
        conet = conx.gertConnection();
        st = conet.createStatement();
        rs = st.executeQuery(sql);
        Object[] producto = new Object[5];
        modelo = (DefaultTableModel) Tabla.getModel();
        while (rs.next()) {
            producto[0] = rs.getString("codigoProducto");
            producto[1] = rs.getString("nombreProducto");
            producto[2] = rs.getFloat("precioUnitario");
            producto[3] = rs.getInt("cantidadProducto");
            producto[4] = rs.getDate("fechaVencimiento");

            modelo.addRow(producto);
        }
        Tabla.setModel(modelo);
    } catch (SQLException e) {
    }
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Busqueda;
    private javax.swing.JTable Tabla;
    private javax.swing.JButton actualizar;
    private javax.swing.JButton agregar;
    private javax.swing.JTextField cantidad;
    private javax.swing.JTextField codigo;
    private javax.swing.JButton eliminar;
    private com.toedter.calendar.JDateChooser fecha;
    private javax.swing.JTextField fecha1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limpiar;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField precio;
    private javax.swing.JButton reportes;
    // End of variables declaration//GEN-END:variables

    private void f(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    }

