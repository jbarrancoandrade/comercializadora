package POJOS;
// Generated 5/12/2014 10:43:46 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * NomTransxEmp generated by hbm2java
 */
public class NomTransxEmp  implements java.io.Serializable {


     private NomTransxEmpId id;
     private BigDecimal qty;

    public NomTransxEmp() {
    }

    public NomTransxEmp(NomTransxEmpId id, BigDecimal qty) {
       this.id = id;
       this.qty = qty;
    }
   
    public NomTransxEmpId getId() {
        return this.id;
    }
    
    public void setId(NomTransxEmpId id) {
        this.id = id;
    }
    public BigDecimal getQty() {
        return this.qty;
    }
    
    public void setQty(BigDecimal qty) {
        this.qty = qty;
    }




}

