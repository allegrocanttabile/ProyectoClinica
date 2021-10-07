/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Conexion.Conexion;
import Interfaces.EmpleadoInterface;
import Model.EmpleadoModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luisalfredo.romero
 */
public class EmpleadoDao implements EmpleadoInterface {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    EmpleadoModel e;
    ArrayList<EmpleadoModel> lista = new ArrayList<>();

    @Override
    public boolean loginEmpleado(String username, String password) {

        try {
            String sql = "select * from empleado where username = ? and password = ?";
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            rs = ps.executeQuery();

            if (rs.absolute(1)) {
                return true;
            }

        } catch (Exception e) {
            System.err.println("Error" + e);
            System.out.println("**Error en Login***");
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (Exception e) {
                System.err.println("Error" + e);
            }

        }
        return false;

    }

    @Override
    public boolean agregarEmpleado(EmpleadoModel e) {
        try {
            String sql = "insert into empleado(codEmpleado, username, password, tipoEmpleado, turno) values(?,?,?,?,?)";
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, e.getCodEmpleado());
            ps.setString(2, e.getUsername());
            ps.setString(3, e.getPassword());
            ps.setInt(4, e.getTipoEmpleado());
            ps.setInt(5, e.getTurno());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }

    @Override
    public boolean eliminarEmpleado(int codEmpleado) {
        try {
            String sql = "delete from empleado where codEmpleado=" + codEmpleado;
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }

    @Override
    public boolean editarEmpleado(EmpleadoModel e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<EmpleadoModel> listarEmpleados() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EmpleadoModel buscarEmpleado(int codEmpleado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
