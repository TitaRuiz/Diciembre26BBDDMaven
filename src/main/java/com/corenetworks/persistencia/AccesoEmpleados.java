package com.corenetworks.persistencia;

import com.corenetworks.modelo.Empleado;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AccesoEmpleados extends Conexion{
    public boolean alta(Empleado e) throws SQLException, ClassNotFoundException {
        //1. Declarar variables
        PreparedStatement sentencia;
        int resultado=0;
        String sql = "insert into employees (employee_id, last_name,first_name, reports_to ) values (?,?,?,?);";
        //2. Abrir la conexion
        abrirConexion();
        //3. Crear el statement
        sentencia = miConexion.prepareStatement(sql);
        //3a dar valor a los parámetros
        sentencia.setInt(1,e.getIdEmpleado());
        sentencia.setString(2,e.getApellidos());
        sentencia.setString(3,e.getNombre());
        sentencia.setInt(4,e.getJefe());
        //4. Actualizar
        resultado = sentencia.executeUpdate();
        //5. Devolver el resultado
        return resultado>0;

    }

}
