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
import modelo.proveedores;
import modelo.conexion;

/**
 *
 * @author LENOVO
 */
public class daoProveedor {
    Connection con;
    conexion cn = new conexion();
    PreparedStatement ps;
    ResultSet rs;

    public boolean insertar(proveedores p) {
        String SQL = "INSERT INTO proveedor(nombre,apellido,documento,Rsocial,direccion,telefono,correo) VALUES(?,?,?,?,?,?,?)";
        try {
            con = (Connection) cn.conectar();
            ps = (PreparedStatement) con.prepareStatement(SQL);

            ps.setString(1, p.getNombre());
            ps.setString(2,p.getApellido());
            ps.setString(3, p.getDocumento());
            ps.setString(4, p.getRsocial());
            ps.setString(5, p.getDireccion());
            ps.setString(6, p.getTelefono());
            ps.setString(7, p.getCorreo());

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
        List<proveedores> lista = new ArrayList<>();
        String SQL = "select * from proveedor";
        try {
            con = (Connection) cn.conectar();
            ps = (PreparedStatement) con.prepareStatement(SQL);

            rs = ps.executeQuery();

            while (rs.next()) {
                proveedores c = new proveedores();
                c.setIdProveedores(rs.getInt(1));
                c.setNombre(rs.getString(2));
                c.setApellido(rs.getString(3));
                c.setDocumento(rs.getString(4));
                c.setRsocial(rs.getString(5));
                c.setDireccion(rs.getString(6));
                c.setTelefono(rs.getString(7));
                c.setCorreo(rs.getString(8));
                lista.add(c);

            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);

        }
        return lista;
    }

    public boolean buscar(proveedores c) {
        String SQL = "select * from proveedor where idproveedor=?";
        try {
            con = (Connection) cn.conectar();
            ps = (PreparedStatement) con.prepareStatement(SQL);
            ps.setInt(1, c.getIdProveedores());
            rs = ps.executeQuery();
            if (rs.next()) {
                c.setIdProveedores(rs.getInt(1));
                c.setNombre(rs.getString(2));
                c.setApellido(rs.getString(3));
                c.setDocumento(rs.getString(4));
                c.setRsocial(rs.getString(5));
                c.setDireccion(rs.getString(6));
                c.setTelefono(rs.getString(7));
                c.setCorreo (rs.getString(8));
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
    
    public boolean editar(proveedores c) {
        String SQL = "UPDATE proveedor set nombre=?, apellido=?, documento=?, Rsocial=?, direccion=?, telefono=?, correo=? where idproveedor=?";
        try {
            con = (Connection) cn.conectar();
            ps = (PreparedStatement) con.prepareStatement(SQL);
            ps.setString(1, c.getNombre());
            ps.setString(2, c.getApellido());
            ps.setString(3, c.getDocumento());
            ps.setString(4, c.getRsocial());
            ps.setString(5, c.getDireccion());
            ps.setString(6, c.getTelefono());
            ps.setString(7, c.getCorreo());
             
            ps.setInt(8, c.getIdProveedores());
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
    public boolean eliminar(proveedores c) {
        String SQL = "DELETE FROM proveedor where idproveedor=?";
        try {
            con = (Connection) cn.conectar();
            ps = (PreparedStatement) con.prepareStatement(SQL);
            ps.setInt(1, c.getIdProveedores());
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
    
    public boolean buscarDocumento(proveedores c) {
        String SQL = "select * from proveedor where documento=?";
        try {
            con = (Connection) cn.conectar();
            ps = (PreparedStatement) con.prepareStatement(SQL);
            ps.setString(1, c.getDocumento());
            rs = ps.executeQuery();
            if (rs.next()) {
                c.setIdProveedores(rs.getInt(1));
                c.setNombre(rs.getString(2));
                c.setApellido(rs.getString(3));
                c.setDocumento(rs.getString(4));
                c.setRsocial(rs.getString(5));
                c.setDireccion(rs.getString(6));
                c.setTelefono(rs.getString(7));
                c.setCorreo (rs.getString(8));
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
