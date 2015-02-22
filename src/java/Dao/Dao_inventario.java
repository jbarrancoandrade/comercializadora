/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import temporales.inventario;

/**
 *
 * @author Quality
 */
public class Dao_inventario implements Interface.Inventario {

    @Override
    public List<inventario> consultainventario(Connection conexion, String codalm) throws Exception {
        List<inventario> listaTProducto = new ArrayList<inventario>();
        Statement statement;
        ResultSet resultSet;

        String query = "select Alm_Insumos.Codins,nomins,refins,Ven_IVAS.MargenIva,Alm_Invent.Caninv,undIns,Alm_Invent.valInv\n"
                + "from Alm_Insumos \n"
                + "left join Ven_IVAS\n"
                + "on Ven_IVAS.CodIva=Alm_Insumos.CodIva\n"
                + "left join Alm_Invent \n"
                + "on Alm_Invent.Codins=Alm_Insumos.Codins\n"
                + "where Alm_Insumos.Activo='1' and Alm_Invent.codalm='"+codalm+"' and Alm_Invent.Caninv > 0";

        statement = (Statement) conexion.createStatement();
        resultSet = statement.executeQuery(query);

        inventario tProducto;
        while (resultSet.next()) {
            tProducto = new inventario();

            tProducto.setCodins(resultSet.getString("Codins"));
            tProducto.setNomins(resultSet.getString("nomins"));
            tProducto.setRefins(resultSet.getString("refins"));
            tProducto.setUndIns(resultSet.getString("undIns"));
            tProducto.setMargenIva(resultSet.getBigDecimal("MargenIva"));
            tProducto.setCaninv(resultSet.getBigDecimal("Caninv"));
            tProducto.setValInv(resultSet.getBigDecimal("valInv"));

            listaTProducto.add(tProducto);
        }

        resultSet.close();
        statement.close();

        return listaTProducto;

    }

}
