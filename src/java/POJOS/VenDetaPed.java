package POJOS;
// Generated 5/12/2014 10:43:46 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * VenDetaPed generated by hbm2java
 */
public class VenDetaPed  implements java.io.Serializable {


     private VenDetaPedId id;
     private BigDecimal qty;
     private BigDecimal valIns;
     private BigDecimal dscto;
     private BigDecimal ivaIns;

    public VenDetaPed() {
    }

    public VenDetaPed(VenDetaPedId id, BigDecimal qty, BigDecimal valIns, BigDecimal dscto, BigDecimal ivaIns) {
       this.id = id;
       this.qty = qty;
       this.valIns = valIns;
       this.dscto = dscto;
       this.ivaIns = ivaIns;
    }
   
    public VenDetaPedId getId() {
        return this.id;
    }
    
    public void setId(VenDetaPedId id) {
        this.id = id;
    }
    public BigDecimal getQty() {
        return this.qty;
    }
    
    public void setQty(BigDecimal qty) {
        this.qty = qty;
    }
    public BigDecimal getValIns() {
        return this.valIns;
    }
    
    public void setValIns(BigDecimal valIns) {
        this.valIns = valIns;
    }
    public BigDecimal getDscto() {
        return this.dscto;
    }
    
    public void setDscto(BigDecimal dscto) {
        this.dscto = dscto;
    }
    public BigDecimal getIvaIns() {
        return this.ivaIns;
    }
    
    public void setIvaIns(BigDecimal ivaIns) {
        this.ivaIns = ivaIns;
    }




}


