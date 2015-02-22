package POJOS;
// Generated 5/12/2014 10:43:46 AM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * VenMaeCotiza generated by hbm2java
 */
public class VenMaeCotiza  implements java.io.Serializable {


     private VenMaeCotizaId id;
     private String codter;
     private Date fecCot;
     private int vigencia;
     private boolean detallaPrecios;
     private Date fecSys;
     private String codUsu;
     private String pc;
     private char estCot;

    public VenMaeCotiza() {
    }

	
    public VenMaeCotiza(VenMaeCotizaId id, String codter, int vigencia, boolean detallaPrecios, String codUsu, String pc, char estCot) {
        this.id = id;
        this.codter = codter;
        this.vigencia = vigencia;
        this.detallaPrecios = detallaPrecios;
        this.codUsu = codUsu;
        this.pc = pc;
        this.estCot = estCot;
    }
    public VenMaeCotiza(VenMaeCotizaId id, String codter, Date fecCot, int vigencia, boolean detallaPrecios, Date fecSys, String codUsu, String pc, char estCot) {
       this.id = id;
       this.codter = codter;
       this.fecCot = fecCot;
       this.vigencia = vigencia;
       this.detallaPrecios = detallaPrecios;
       this.fecSys = fecSys;
       this.codUsu = codUsu;
       this.pc = pc;
       this.estCot = estCot;
    }
   
    public VenMaeCotizaId getId() {
        return this.id;
    }
    
    public void setId(VenMaeCotizaId id) {
        this.id = id;
    }
    public String getCodter() {
        return this.codter;
    }
    
    public void setCodter(String codter) {
        this.codter = codter;
    }
    public Date getFecCot() {
        return this.fecCot;
    }
    
    public void setFecCot(Date fecCot) {
        this.fecCot = fecCot;
    }
    public int getVigencia() {
        return this.vigencia;
    }
    
    public void setVigencia(int vigencia) {
        this.vigencia = vigencia;
    }
    public boolean isDetallaPrecios() {
        return this.detallaPrecios;
    }
    
    public void setDetallaPrecios(boolean detallaPrecios) {
        this.detallaPrecios = detallaPrecios;
    }
    public Date getFecSys() {
        return this.fecSys;
    }
    
    public void setFecSys(Date fecSys) {
        this.fecSys = fecSys;
    }
    public String getCodUsu() {
        return this.codUsu;
    }
    
    public void setCodUsu(String codUsu) {
        this.codUsu = codUsu;
    }
    public String getPc() {
        return this.pc;
    }
    
    public void setPc(String pc) {
        this.pc = pc;
    }
    public char getEstCot() {
        return this.estCot;
    }
    
    public void setEstCot(char estCot) {
        this.estCot = estCot;
    }




}


