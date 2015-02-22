/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import POJOS.AlmInsumos;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author Quality
 */
public interface Inventario {
    
    public List<temporales.inventario> consultainventario(Connection conexion,String codalm) throws Exception;
}
