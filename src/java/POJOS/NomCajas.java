package POJOS;
// Generated 5/12/2014 10:43:46 AM by Hibernate Tools 4.3.1



/**
 * NomCajas generated by hbm2java
 */
public class NomCajas  implements java.io.Serializable {


     private String codCaja;
     private String codTer;

    public NomCajas() {
    }

    public NomCajas(String codCaja, String codTer) {
       this.codCaja = codCaja;
       this.codTer = codTer;
    }
   
    public String getCodCaja() {
        return this.codCaja;
    }
    
    public void setCodCaja(String codCaja) {
        this.codCaja = codCaja;
    }
    public String getCodTer() {
        return this.codTer;
    }
    
    public void setCodTer(String codTer) {
        this.codTer = codTer;
    }




}

