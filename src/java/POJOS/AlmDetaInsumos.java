package POJOS;
// Generated 5/12/2014 10:43:46 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * AlmDetaInsumos generated by hbm2java
 */
public class AlmDetaInsumos  implements java.io.Serializable {


     private AlmDetaInsumosId id;
     private BigDecimal qty;

    public AlmDetaInsumos() {
    }

    public AlmDetaInsumos(AlmDetaInsumosId id, BigDecimal qty) {
       this.id = id;
       this.qty = qty;
    }
   
    public AlmDetaInsumosId getId() {
        return this.id;
    }
    
    public void setId(AlmDetaInsumosId id) {
        this.id = id;
    }
    public BigDecimal getQty() {
        return this.qty;
    }
    
    public void setQty(BigDecimal qty) {
        this.qty = qty;
    }




}

