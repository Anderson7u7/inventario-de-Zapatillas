/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Categoria;
import modelo.cliente;
import modelo.conexion;
import vista.Clientes;

/**
 *
 * @author LENOVO
 */
public class DaoClientes {

    Connection con;
    conexion cn = new conexion();
    PreparedStatement ps;
    ResultSet rs;

    public boolean insertar(cliente c) {
        String SQL = "INSERT INTO cliente(nombre,apellido,documento,direccion,telefono,correo) VALUES(?,?,?,?,?,?)";
        try {
            con = (Connection) cn.conectar();
            ps = (PreparedStatement) con.prepareStatement(SQL);

            ps.setString(1, c.getNombre());
            ps.setString(2, c.getApellido());
            ps.setString(3, c.getDocumento());
            ps.setString(4, c.getDireccion());
            ps.setString(5, c.getTelefono());
            ps.setString(6, c.getCorreo());

            int n = ps.executeUpdate();
            if (n != 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }

    }

    public List listar() {
        List<cliente> lista = new ArrayList<>();
        String SQL = "select * from cliente";
        try {
            con = (Connection) cn.conectar();
            ps = (PreparedStatement) con.prepareStatement(SQL);

            rs = ps.executeQuery();

            while (rs.next()) {
                cliente c = new cliente();
                c.setIdCliente(rs.getInt(1));
                c.setNombre(rs.getString(2));
                c.setApellido(rs.getString(3));
                c.setDocumento(rs.getString(4));
                c.setDireccion(rs.getString(5));
                c.setTelefono(rs.getString(6));
                c.setCorreo(rs.getString(7));
                lista.add(c);

            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);

        }
        return lista;
    }

    public boolean editar(cliente c) {
        String SQL = "UPDATE cliente set nombre=?, apellido=?, documento=?, direccion=?, telefono=?, correo=? where idCliente=?";
        try {
            con = (Connection) cn.conectar();
            ps = (PreparedStatement) con.prepareStatement(SQL);
            ps.setString(1, c.getNombre());
            ps.setString(2, c.getApellido());
            ps.setString(3, c.getDocumento());
            ps.setString(4, c.getDireccion());
            ps.setString(5, c.getTelefono());
            ps.setString(6, c.getCorreo());

            ps.setInt(7, c.getIdCliente());
            int n = ps.executeUpdate();
            if (n != 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    public boolean eliminar(cliente c) {
        String SQL = "DELETE FROM cliente where idCliente=?";
        try {
            con = (Connection) cn.conectar();
            ps = (PreparedStatement) con.prepareStatement(SQL);
            ps.setInt(1, c.getIdCliente());
            int n = ps.executeUpdate();
            if (n != 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    public boolean buscar(cliente c) {
        String SQL = "select * from cliente where documento=?";
        try {
            con = (Connection) cn.conectar();
            ps = (PreparedStatement) con.prepareStatement(SQL);
            ps.setString(1, c.getDocumento());
            rs = ps.executeQuery();
            if (rs.next()) {
                c.setIdCliente(rs.getInt(1));
                c.setNombre(rs.getString(2));
                c.setApellido(rs.getString(3));
                c.setDocumento(rs.getString(4));
                c.setDireccion(rs.getString(5));
                c.setTelefono(rs.getString(6));
                c.setCorreo (rs.getString(7));
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    public List<cliente> Listar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
