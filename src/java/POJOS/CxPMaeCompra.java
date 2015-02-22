package POJOS;
// Generated 5/12/2014 10:43:46 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;

/**
 * CxPMaeCompra generated by hbm2java
 */
public class CxPMaeCompra  implements java.io.Serializable {


     private CxPMaeCompraId id;
     private String codpro;
     private String codter;
     private Date feccom;
     private BigDecimal valCom;
     private BigDecimal ivaCom;
     private BigDecimal desCom;
     private BigDecimal netCom;
     private char estCom;
     private String codUsu;
     private Date fecSys;
     private String tipCom;
     private BigDecimal valfletes;
     private int plazocxp;
     private BigDecimal valfletesApl;
     private String codmon;

    public CxPMaeCompra() {
    }

    public CxPMaeCompra(CxPMaeCompraId id, String codpro, String codter, Date feccom, BigDecimal valCom, BigDecimal ivaCom, BigDecimal desCom, BigDecimal netCom, char estCom, String codUsu, Date fecSys, String tipCom, BigDecimal valfletes, int plazocxp, BigDecimal valfletesApl, String codmon) {
       this.id = id;
       this.codpro = codpro;
       this.codter = codter;
       this.feccom = feccom;
       this.valCom = valCom;
       this.ivaCom = ivaCom;
       this.desCom = desCom;
       this.netCom = netCom;
       this.estCom = estCom;
       this.codUsu = codUsu;
       this.fecSys = fecSys;
       this.tipCom = tipCom;
       this.valfletes = valfletes;
       this.plazocxp = plazocxp;
       this.valfletesApl = valfletesApl;
       this.codmon = codmon;
    }
   
    public CxPMaeCompraId getId() {
        return this.id;
    }
    
    public void setId(CxPMaeCompraId id) {
        this.id = id;
    }
    public String getCodpro() {
        return this.codpro;
    }
    
    public void setCodpro(String codpro) {
        this.codpro = codpro;
    }
    public String getCodter() {
        return this.codter;
    }
    
    public void setCodter(String codter) {
        this.codter = codter;
    }
    public Date getFeccom() {
        return this.feccom;
    }
    
    public void setFeccom(Date feccom) {
        this.feccom = feccom;
    }
    public BigDecimal getValCom() {
        return this.valCom;
    }
    
    public void setValCom(BigDecimal valCom) {
        this.valCom = valCom;
    }
    public BigDecimal getIvaCom() {
        return this.ivaCom;
    }
    
    public void setIvaCom(BigDecimal ivaCom) {
        this.ivaCom = ivaCom;
    }
    public BigDecimal getDesCom() {
        return this.desCom;
    }
    
    public void setDesCom(BigDecimal desCom) {
        this.desCom = desCom;
    }
    public BigDecimal getNetCom() {
        return this.netCom;
    }
    
    public void setNetCom(BigDecimal netCom) {
        this.netCom = netCom;
    }
    public char getEstCom() {
        return this.estCom;
    }
    
    public void setEstCom(char estCom) {
        this.estCom = estCom;
    }
    public String getCodUsu() {
        return this.codUsu;
    }
    
    public void setCodUsu(String codUsu) {
        this.codUsu = codUsu;
    }
    public Date getFecSys() {
        return this.fecSys;
    }
    
    public void setFecSys(Date fecSys) {
        this.fecSys = fecSys;
    }
    public String getTipCom() {
        return this.tipCom;
    }
    
    public void setTipCom(String tipCom) {
        this.tipCom = tipCom;
    }
    public BigDecimal getValfletes() {
        return this.valfletes;
    }
    
    public void setValfletes(BigDecimal valfletes) {
        this.valfletes = valfletes;
    }
    public int getPlazocxp() {
        return this.plazocxp;
    }
    
    public void setPlazocxp(int plazocxp) {
        this.plazocxp = plazocxp;
    }
    public BigDecimal getValfletesApl() {
        return this.valfletesApl;
    }
    
    public void setValfletesApl(BigDecimal valfletesApl) {
        this.valfletesApl = valfletesApl;
    }
    public String getCodmon() {
        return this.codmon;
    }
    
    public void setCodmon(String codmon) {
        this.codmon = codmon;
    }




}


