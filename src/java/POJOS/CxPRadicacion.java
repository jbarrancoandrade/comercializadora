package POJOS;
// Generated 5/12/2014 10:43:46 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * CxPRadicacion generated by hbm2java
 */
public class CxPRadicacion  implements java.io.Serializable {


     private CxPRadicacionId id;
     private BigDecimal valCom;
     private BigDecimal desCom;
     private BigDecimal ivaCom;
     private BigDecimal netCom;
     private String facCom;
     private boolean ok;
     private String numRad;
     private String estrad;
     private BigDecimal valfletes;
     private String codmon;
     private BigDecimal trm;
     private BigDecimal icoCom;

    public CxPRadicacion() {
    }

    public CxPRadicacion(CxPRadicacionId id, BigDecimal valCom, BigDecimal desCom, BigDecimal ivaCom, BigDecimal netCom, String facCom, boolean ok, String numRad, String estrad, BigDecimal valfletes, String codmon, BigDecimal trm, BigDecimal icoCom) {
       this.id = id;
       this.valCom = valCom;
       this.desCom = desCom;
       this.ivaCom = ivaCom;
       this.netCom = netCom;
       this.facCom = facCom;
       this.ok = ok;
       this.numRad = numRad;
       this.estrad = estrad;
       this.valfletes = valfletes;
       this.codmon = codmon;
       this.trm = trm;
       this.icoCom = icoCom;
    }
   
    public CxPRadicacionId getId() {
        return this.id;
    }
    
    public void setId(CxPRadicacionId id) {
        this.id = id;
    }
    public BigDecimal getValCom() {
        return this.valCom;
    }
    
    public void setValCom(BigDecimal valCom) {
        this.valCom = valCom;
    }
    public BigDecimal getDesCom() {
        return this.desCom;
    }
    
    public void setDesCom(BigDecimal desCom) {
        this.desCom = desCom;
    }
    public BigDecimal getIvaCom() {
        return this.ivaCom;
    }
    
    public void setIvaCom(BigDecimal ivaCom) {
        this.ivaCom = ivaCom;
    }
    public BigDecimal getNetCom() {
        return this.netCom;
    }
    
    public void setNetCom(BigDecimal netCom) {
        this.netCom = netCom;
    }
    public String getFacCom() {
        return this.facCom;
    }
    
    public void setFacCom(String facCom) {
        this.facCom = facCom;
    }
    public boolean isOk() {
        return this.ok;
    }
    
    public void setOk(boolean ok) {
        this.ok = ok;
    }
    public String getNumRad() {
        return this.numRad;
    }
    
    public void setNumRad(String numRad) {
        this.numRad = numRad;
    }
    public String getEstrad() {
        return this.estrad;
    }
    
    public void setEstrad(String estrad) {
        this.estrad = estrad;
    }
    public BigDecimal getValfletes() {
        return this.valfletes;
    }
    
    public void setValfletes(BigDecimal valfletes) {
        this.valfletes = valfletes;
    }
    public String getCodmon() {
        return this.codmon;
    }
    
    public void setCodmon(String codmon) {
        this.codmon = codmon;
    }
    public BigDecimal getTrm() {
        return this.trm;
    }
    
    public void setTrm(BigDecimal trm) {
        this.trm = trm;
    }
    public BigDecimal getIcoCom() {
        return this.icoCom;
    }
    
    public void setIcoCom(BigDecimal icoCom) {
        this.icoCom = icoCom;
    }




}


