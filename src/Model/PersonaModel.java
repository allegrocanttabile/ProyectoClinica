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
public class PersonaModel {
    private String nombres;
    private String apellidos;
    private int docIdentidad;
    private int numContacto;

    public PersonaModel(String nombres, String apellidos, int docIdentidad, int numContacto) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.docIdentidad = docIdentidad;
        this.numContacto = numContacto;
    }

    public int getNumContacto() {
        return numContacto;
    }

    public void setNumContacto(int numContacto) {
        this.numContacto = numContacto;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getDocIdentidad() {
        return docIdentidad;
    }

    public void setDocIdentidad(int docIdentidad) {
        this.docIdentidad = docIdentidad;
    }
    
    
    
}
