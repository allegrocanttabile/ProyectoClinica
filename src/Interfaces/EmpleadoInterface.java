/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Model.EmpleadoModel;
import java.util.ArrayList;

/**
 *
 * @author luisalfredo.romero
 */
public interface EmpleadoInterface {
    
    public boolean loginEmpleado(String username, String password);
    public boolean agregarEmpleado( EmpleadoModel e);
    public boolean eliminarEmpleado(int codEmpleado);
    public boolean editarEmpleado(EmpleadoModel e);
    public ArrayList<EmpleadoModel> listarEmpleados();
    public EmpleadoModel buscarEmpleado(int codEmpleado);
    
    
}
