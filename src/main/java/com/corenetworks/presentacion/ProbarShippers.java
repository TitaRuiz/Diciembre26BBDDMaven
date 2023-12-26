package com.corenetworks.presentacion;

import com.corenetworks.modelo.Shipper;
import com.corenetworks.persistencia.AccesoShippers;

import java.sql.SQLException;

public class ProbarShippers {
    public static void main(String[] args) {
        Shipper s = new Shipper(200,"Ups","9999999");
        AccesoShippers aS = new AccesoShippers();
        try {
           // System.out.println("Se ha podido añadir el shipper ? " + aS.alta(s));
//            System.out.println("Se ha podiddo modificar el shipper ? " + aS.modificar(s));
//            System.out.println("Se ha podidio eliminar ? " + aS.eliminar(200));
            System.out.println(aS.consultarUnShipper(1));
        } catch (SQLException e) {
            System.out.println(e.toString());
        } catch (ClassNotFoundException e) {
            System.out.println(e.toString());
        }

    }
}
