/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import modelo.conexion;


/**
 *
 * @author LENOVO
 */
public class DaoDetalleSalida {
    Connection con;
    conexion cn = new conexion();
    PreparedStatement ps;
    ResultSet rs;
    public boolean insertar(int idSalida,int idEntrada, int cant, double importe) {
        String SQL = "INSERT INTO detallesalida(idSalida,idProducto,cantidad,importe) VALUES(" +idSalida + "," + idEntrada + "," + cant + "," + importe + ")";
        try {
            con = (Connection) cn.conectar();
            ps = (PreparedStatement) con.prepareStatement(SQL);



            int n = ps.executeUpdate();
            if (n!= 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }

    }
}
