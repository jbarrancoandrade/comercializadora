package POJOS;
// Generated 5/12/2014 10:43:46 AM by Hibernate Tools 4.3.1



/**
 * VenResxAlm generated by hbm2java
 */
public class VenResxAlm  implements java.io.Serializable {


     private VenResxAlmId id;
     private String codCaja;

    public VenResxAlm() {
    }

	
    public VenResxAlm(VenResxAlmId id) {
        this.id = id;
    }
    public VenResxAlm(VenResxAlmId id, String codCaja) {
       this.id = id;
       this.codCaja = codCaja;
    }
   
    public VenResxAlmId getId() {
        return this.id;
    }
    
    public void setId(VenResxAlmId id) {
        this.id = id;
    }
    public String getCodCaja() {
        return this.codCaja;
    }
    
    public void setCodCaja(String codCaja) {
        this.codCaja = codCaja;
    }




}


