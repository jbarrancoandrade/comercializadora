package POJOS;
// Generated 5/12/2014 10:43:46 AM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * AlmTomaInv generated by hbm2java
 */
public class AlmTomaInv  implements java.io.Serializable {


     private AlmTomaInvId id;
     private Date fecToma;
     private String observa;
     private Boolean aplicada;
     private String docEntrada;
     private String docSalida;
     private String codusuAplica;
     private String pcaplica;
     private Date fecSysAplica;
     private boolean sinStock;
     private int modoConteo;
     private boolean tomaFull;

    public AlmTomaInv() {
    }

	
    public AlmTomaInv(AlmTomaInvId id, String codusuAplica, String pcaplica, boolean sinStock, int modoConteo, boolean tomaFull) {
        this.id = id;
        this.codusuAplica = codusuAplica;
        this.pcaplica = pcaplica;
        this.sinStock = sinStock;
        this.modoConteo = modoConteo;
        this.tomaFull = tomaFull;
    }
    public AlmTomaInv(AlmTomaInvId id, Date fecToma, String observa, Boolean aplicada, String docEntrada, String docSalida, String codusuAplica, String pcaplica, Date fecSysAplica, boolean sinStock, int modoConteo, boolean tomaFull) {
       this.id = id;
       this.fecToma = fecToma;
       this.observa = observa;
       this.aplicada = aplicada;
       this.docEntrada = docEntrada;
       this.docSalida = docSalida;
       this.codusuAplica = codusuAplica;
       this.pcaplica = pcaplica;
       this.fecSysAplica = fecSysAplica;
       this.sinStock = sinStock;
       this.modoConteo = modoConteo;
       this.tomaFull = tomaFull;
    }
   
    public AlmTomaInvId getId() {
        return this.id;
    }
    
    public void setId(AlmTomaInvId id) {
        this.id = id;
    }
    public Date getFecToma() {
        return this.fecToma;
    }
    
    public void setFecToma(Date fecToma) {
        this.fecToma = fecToma;
    }
    public String getObserva() {
        return this.observa;
    }
    
    public void setObserva(String observa) {
        this.observa = observa;
    }
    public Boolean getAplicada() {
        return this.aplicada;
    }
    
    public void setAplicada(Boolean aplicada) {
        this.aplicada = aplicada;
    }
    public String getDocEntrada() {
        return this.docEntrada;
    }
    
    public void setDocEntrada(String docEntrada) {
        this.docEntrada = docEntrada;
    }
    public String getDocSalida() {
        return this.docSalida;
    }
    
    public void setDocSalida(String docSalida) {
        this.docSalida = docSalida;
    }
    public String getCodusuAplica() {
        return this.codusuAplica;
    }
    
    public void setCodusuAplica(String codusuAplica) {
        this.codusuAplica = codusuAplica;
    }
    public String getPcaplica() {
        return this.pcaplica;
    }
    
    public void setPcaplica(String pcaplica) {
        this.pcaplica = pcaplica;
    }
    public Date getFecSysAplica() {
        return this.fecSysAplica;
    }
    
    public void setFecSysAplica(Date fecSysAplica) {
        this.fecSysAplica = fecSysAplica;
    }
    public boolean isSinStock() {
        return this.sinStock;
    }
    
    public void setSinStock(boolean sinStock) {
        this.sinStock = sinStock;
    }
    public int getModoConteo() {
        return this.modoConteo;
    }
    
    public void setModoConteo(int modoConteo) {
        this.modoConteo = modoConteo;
    }
    public boolean isTomaFull() {
        return this.tomaFull;
    }
    
    public void setTomaFull(boolean tomaFull) {
        this.tomaFull = tomaFull;
    }




}


