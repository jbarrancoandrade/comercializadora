/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BeanView;

import Dao.Dao_GenAlmacen;
import Dao.Dao_inventario;
import POJOS.GenAlmacenes;
import Util.HibernateUtil;
import java.awt.event.ActionEvent;
import java.io.Serializable;
import java.sql.Connection;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import org.hibernate.Session;
import org.hibernate.Transaction;
import temporales.inventario;

/**
 *
 * @author Quality
 */
@ManagedBean
@ViewScoped
public class Inventarios implements Serializable {

    private temporales.inventario inv;
    private List<temporales.inventario> listInventario;
    private Dao_inventario dao_inven;
    
    private Dao_GenAlmacen dao_GenAlmacen;
    private List<GenAlmacenes> listAlmacen;
    private String almE;
    private Session session;
    private Transaction transaccion;
    
    private Connection conexion;

    /**
     * Creates a new instance of Inventarios
     */
    public Inventarios() {
        inv = new inventario();
        dao_inven = new Dao_inventario();
        dao_GenAlmacen = new Dao_GenAlmacen();
        getAll();
        
    }

    public List<temporales.inventario> listarProductos(String Codalm) {
        boolean valorRetorno;
        try {
            conexion = temporales.BD.GetConnection();
            listInventario= dao_inven.consultainventario(conexion, Codalm);
            
            conexion.close();
            for (inventario item: listInventario) {
                System.out.println("item "+ item.getNomins());
            }
            valorRetorno = true;
        } catch (Exception ex) {
            valorRetorno = false;
        }
        return listInventario;
    }
    
    
     public List<GenAlmacenes> getAll() {
        
        this.session = null;
        this.transaccion = null;

        try {
            this.session = HibernateUtil.getSessionFactory().openSession();
            this.transaccion = this.session.beginTransaction();
              
            this.listAlmacen = dao_GenAlmacen.getAll(this.session);
            
            this.transaccion.commit();

            return this.listAlmacen;
        } catch (Exception ex) {

            if (this.transaccion != null) {
                this.transaccion.rollback();
            }

            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Error fatal:", "Por favor contacte con su administrador " + ex.getMessage()));

            return null;
        } finally {
            if (this.session != null) {
                this.session.close();
            }
        }
    }
    
        public void onChange(ActionEvent event) {
       
            listInventario = listarProductos(almE);
          
    }
    
    
    

    public inventario getInv() {
        return inv;
    }

    public void setInv(inventario inv) {
        this.inv = inv;
    }

    public List<inventario> getListInventario() {
        return listInventario;
    }

    public void setListInventario(List<inventario> listInventario) {
        this.listInventario = listInventario;
    }

    public Dao_inventario getDao_inven() {
        return dao_inven;
    }

    public void setDao_inven(Dao_inventario dao_inven) {
        this.dao_inven = dao_inven;
    }

    public Dao_GenAlmacen getDao_GenAlmacen() {
        return dao_GenAlmacen;
    }

    public void setDao_GenAlmacen(Dao_GenAlmacen dao_GenAlmacen) {
        this.dao_GenAlmacen = dao_GenAlmacen;
    }

    public List<GenAlmacenes> getListAlmacen() {
        return listAlmacen;
    }

    public void setListAlmacen(List<GenAlmacenes> listAlmacen) {
        this.listAlmacen = listAlmacen;
    }

    public String getAlmE() {
        return almE;
    }

    public void setAlmE(String almE) {
        this.almE = almE;
    }


   

    public Connection getConexion() {
        return conexion;
    }

    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }
    

}
