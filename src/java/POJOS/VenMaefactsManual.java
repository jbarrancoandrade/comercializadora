package POJOS;
// Generated 5/12/2014 10:43:46 AM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * VenMaefactsManual generated by hbm2java
 */
public class VenMaefactsManual  implements java.io.Serializable {


     private VenMaefactsManualId id;
     private String codRes;
     private Date fecha;
     private String codUsu;
     private int qtyMan;
     private int qtyReg;
     private int qtyCan;

    public VenMaefactsManual() {
    }

	
    public VenMaefactsManual(VenMaefactsManualId id, String codRes, String codUsu, int qtyMan, int qtyReg, int qtyCan) {
        this.id = id;
        this.codRes = codRes;
        this.codUsu = codUsu;
        this.qtyMan = qtyMan;
        this.qtyReg = qtyReg;
        this.qtyCan = qtyCan;
    }
    public VenMaefactsManual(VenMaefactsManualId id, String codRes, Date fecha, String codUsu, int qtyMan, int qtyReg, int qtyCan) {
       this.id = id;
       this.codRes = codRes;
       this.fecha = fecha;
       this.codUsu = codUsu;
       this.qtyMan = qtyMan;
       this.qtyReg = qtyReg;
       this.qtyCan = qtyCan;
    }
   
    public VenMaefactsManualId getId() {
        return this.id;
    }
    
    public void setId(VenMaefactsManualId id) {
        this.id = id;
    }
    public String getCodRes() {
        return this.codRes;
    }
    
    public void setCodRes(String codRes) {
        this.codRes = codRes;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public String getCodUsu() {
        return this.codUsu;
    }
    
    public void setCodUsu(String codUsu) {
        this.codUsu = codUsu;
    }
    public int getQtyMan() {
        return this.qtyMan;
    }
    
    public void setQtyMan(int qtyMan) {
        this.qtyMan = qtyMan;
    }
    public int getQtyReg() {
        return this.qtyReg;
    }
    
    public void setQtyReg(int qtyReg) {
        this.qtyReg = qtyReg;
    }
    public int getQtyCan() {
        return this.qtyCan;
    }
    
    public void setQtyCan(int qtyCan) {
        this.qtyCan = qtyCan;
    }




}


