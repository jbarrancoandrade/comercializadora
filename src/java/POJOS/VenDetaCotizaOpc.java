package POJOS;
// Generated 5/12/2014 10:43:46 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * VenDetaCotizaOpc generated by hbm2java
 */
public class VenDetaCotizaOpc  implements java.io.Serializable {


     private VenDetaCotizaOpcId id;
     private long qtyIns;
     private BigDecimal valIns;
     private BigDecimal ivaIns;
     private BigDecimal dcto;

    public VenDetaCotizaOpc() {
    }

    public VenDetaCotizaOpc(VenDetaCotizaOpcId id, long qtyIns, BigDecimal valIns, BigDecimal ivaIns, BigDecimal dcto) {
       this.id = id;
       this.qtyIns = qtyIns;
       this.valIns = valIns;
       this.ivaIns = ivaIns;
       this.dcto = dcto;
    }
   
    public VenDetaCotizaOpcId getId() {
        return this.id;
    }
    
    public void setId(VenDetaCotizaOpcId id) {
        this.id = id;
    }
    public long getQtyIns() {
        return this.qtyIns;
    }
    
    public void setQtyIns(long qtyIns) {
        this.qtyIns = qtyIns;
    }
    public BigDecimal getValIns() {
        return this.valIns;
    }
    
    public void setValIns(BigDecimal valIns) {
        this.valIns = valIns;
    }
    public BigDecimal getIvaIns() {
        return this.ivaIns;
    }
    
    public void setIvaIns(BigDecimal ivaIns) {
        this.ivaIns = ivaIns;
    }
    public BigDecimal getDcto() {
        return this.dcto;
    }
    
    public void setDcto(BigDecimal dcto) {
        this.dcto = dcto;
    }




}


