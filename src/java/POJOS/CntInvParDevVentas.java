package POJOS;
// Generated 5/12/2014 10:43:46 AM by Hibernate Tools 4.3.1



/**
 * CntInvParDevVentas generated by hbm2java
 */
public class CntInvParDevVentas  implements java.io.Serializable {


     private CntInvParDevVentasId id;
     private String ctaDevolucion;
     private String ctaIvadevolucion;
     private String ctaInventario;
     private String ctaCosto;

    public CntInvParDevVentas() {
    }

    public CntInvParDevVentas(CntInvParDevVentasId id, String ctaDevolucion, String ctaIvadevolucion, String ctaInventario, String ctaCosto) {
       this.id = id;
       this.ctaDevolucion = ctaDevolucion;
       this.ctaIvadevolucion = ctaIvadevolucion;
       this.ctaInventario = ctaInventario;
       this.ctaCosto = ctaCosto;
    }
   
    public CntInvParDevVentasId getId() {
        return this.id;
    }
    
    public void setId(CntInvParDevVentasId id) {
        this.id = id;
    }
    public String getCtaDevolucion() {
        return this.ctaDevolucion;
    }
    
    public void setCtaDevolucion(String ctaDevolucion) {
        this.ctaDevolucion = ctaDevolucion;
    }
    public String getCtaIvadevolucion() {
        return this.ctaIvadevolucion;
    }
    
    public void setCtaIvadevolucion(String ctaIvadevolucion) {
        this.ctaIvadevolucion = ctaIvadevolucion;
    }
    public String getCtaInventario() {
        return this.ctaInventario;
    }
    
    public void setCtaInventario(String ctaInventario) {
        this.ctaInventario = ctaInventario;
    }
    public String getCtaCosto() {
        return this.ctaCosto;
    }
    
    public void setCtaCosto(String ctaCosto) {
        this.ctaCosto = ctaCosto;
    }




}

