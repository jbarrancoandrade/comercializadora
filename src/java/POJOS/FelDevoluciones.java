package POJOS;
// Generated 5/12/2014 10:43:46 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;

/**
 * FelDevoluciones generated by hbm2java
 */
public class FelDevoluciones  implements java.io.Serializable {


     private FelDevolucionesId id;
     private Date fecFac;
     private BigDecimal qtyDev;

    public FelDevoluciones() {
    }

    public FelDevoluciones(FelDevolucionesId id, Date fecFac, BigDecimal qtyDev) {
       this.id = id;
       this.fecFac = fecFac;
       this.qtyDev = qtyDev;
    }
   
    public FelDevolucionesId getId() {
        return this.id;
    }
    
    public void setId(FelDevolucionesId id) {
        this.id = id;
    }
    public Date getFecFac() {
        return this.fecFac;
    }
    
    public void setFecFac(Date fecFac) {
        this.fecFac = fecFac;
    }
    public BigDecimal getQtyDev() {
        return this.qtyDev;
    }
    
    public void setQtyDev(BigDecimal qtyDev) {
        this.qtyDev = qtyDev;
    }




}

