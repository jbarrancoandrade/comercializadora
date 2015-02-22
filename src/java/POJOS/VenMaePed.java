package POJOS;
// Generated 5/12/2014 10:43:46 AM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * VenMaePed generated by hbm2java
 */
public class VenMaePed  implements java.io.Serializable {


     private VenMaePedId id;
     private Date fecFac;
     private Date fecVen;
     private String codter;
     private String codVen;
     private String codList;
     private String codCaja;
     private boolean vbConta;

    public VenMaePed() {
    }

	
    public VenMaePed(VenMaePedId id, String codter, String codVen, String codList, String codCaja, boolean vbConta) {
        this.id = id;
        this.codter = codter;
        this.codVen = codVen;
        this.codList = codList;
        this.codCaja = codCaja;
        this.vbConta = vbConta;
    }
    public VenMaePed(VenMaePedId id, Date fecFac, Date fecVen, String codter, String codVen, String codList, String codCaja, boolean vbConta) {
       this.id = id;
       this.fecFac = fecFac;
       this.fecVen = fecVen;
       this.codter = codter;
       this.codVen = codVen;
       this.codList = codList;
       this.codCaja = codCaja;
       this.vbConta = vbConta;
    }
   
    public VenMaePedId getId() {
        return this.id;
    }
    
    public void setId(VenMaePedId id) {
        this.id = id;
    }
    public Date getFecFac() {
        return this.fecFac;
    }
    
    public void setFecFac(Date fecFac) {
        this.fecFac = fecFac;
    }
    public Date getFecVen() {
        return this.fecVen;
    }
    
    public void setFecVen(Date fecVen) {
        this.fecVen = fecVen;
    }
    public String getCodter() {
        return this.codter;
    }
    
    public void setCodter(String codter) {
        this.codter = codter;
    }
    public String getCodVen() {
        return this.codVen;
    }
    
    public void setCodVen(String codVen) {
        this.codVen = codVen;
    }
    public String getCodList() {
        return this.codList;
    }
    
    public void setCodList(String codList) {
        this.codList = codList;
    }
    public String getCodCaja() {
        return this.codCaja;
    }
    
    public void setCodCaja(String codCaja) {
        this.codCaja = codCaja;
    }
    public boolean isVbConta() {
        return this.vbConta;
    }
    
    public void setVbConta(boolean vbConta) {
        this.vbConta = vbConta;
    }




}


