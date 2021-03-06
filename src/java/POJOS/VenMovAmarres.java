package POJOS;
// Generated 5/12/2014 10:43:46 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;

/**
 * VenMovAmarres generated by hbm2java
 */
public class VenMovAmarres  implements java.io.Serializable {


     private VenMovAmarresId id;
     private BigDecimal qty;
     private BigDecimal cosIns;
     private String codter;
     private Date fecDoc;
     private String idreg;
     private BigDecimal qtyCon;
     private String numturno;

    public VenMovAmarres() {
    }

	
    public VenMovAmarres(VenMovAmarresId id, BigDecimal qty, BigDecimal cosIns, String codter, String idreg, BigDecimal qtyCon, String numturno) {
        this.id = id;
        this.qty = qty;
        this.cosIns = cosIns;
        this.codter = codter;
        this.idreg = idreg;
        this.qtyCon = qtyCon;
        this.numturno = numturno;
    }
    public VenMovAmarres(VenMovAmarresId id, BigDecimal qty, BigDecimal cosIns, String codter, Date fecDoc, String idreg, BigDecimal qtyCon, String numturno) {
       this.id = id;
       this.qty = qty;
       this.cosIns = cosIns;
       this.codter = codter;
       this.fecDoc = fecDoc;
       this.idreg = idreg;
       this.qtyCon = qtyCon;
       this.numturno = numturno;
    }
   
    public VenMovAmarresId getId() {
        return this.id;
    }
    
    public void setId(VenMovAmarresId id) {
        this.id = id;
    }
    public BigDecimal getQty() {
        return this.qty;
    }
    
    public void setQty(BigDecimal qty) {
        this.qty = qty;
    }
    public BigDecimal getCosIns() {
        return this.cosIns;
    }
    
    public void setCosIns(BigDecimal cosIns) {
        this.cosIns = cosIns;
    }
    public String getCodter() {
        return this.codter;
    }
    
    public void setCodter(String codter) {
        this.codter = codter;
    }
    public Date getFecDoc() {
        return this.fecDoc;
    }
    
    public void setFecDoc(Date fecDoc) {
        this.fecDoc = fecDoc;
    }
    public String getIdreg() {
        return this.idreg;
    }
    
    public void setIdreg(String idreg) {
        this.idreg = idreg;
    }
    public BigDecimal getQtyCon() {
        return this.qtyCon;
    }
    
    public void setQtyCon(BigDecimal qtyCon) {
        this.qtyCon = qtyCon;
    }
    public String getNumturno() {
        return this.numturno;
    }
    
    public void setNumturno(String numturno) {
        this.numturno = numturno;
    }




}


