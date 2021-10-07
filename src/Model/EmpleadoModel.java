/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author luisalfredo.romero
 */
public class EmpleadoModel {
    private String codEmpleado;
    private String username;
    private String password;
    private int tipoEmpleado;
    private int turno;

    public EmpleadoModel(String codEmpleado, String username, String password, int tipoEmpleado, int turno) {
        this.codEmpleado = codEmpleado;
        this.username = username;
        this.password = password;
        this.tipoEmpleado = tipoEmpleado;
        this.turno = turno;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public String getCodEmpleado() {
        return codEmpleado;
    }

    public void setCodEmpleado(String codEmpleado) {
        this.codEmpleado = codEmpleado;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(int tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }
    
    
    
}
