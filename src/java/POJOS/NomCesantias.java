package POJOS;
// Generated 5/12/2014 10:43:46 AM by Hibernate Tools 4.3.1



/**
 * NomCesantias generated by hbm2java
 */
public class NomCesantias  implements java.io.Serializable {


     private String codCes;
     private String codTer;

    public NomCesantias() {
    }

    public NomCesantias(String codCes, String codTer) {
       this.codCes = codCes;
       this.codTer = codTer;
    }
   
    public String getCodCes() {
        return this.codCes;
    }
    
    public void setCodCes(String codCes) {
        this.codCes = codCes;
    }
    public String getCodTer() {
        return this.codTer;
    }
    
    public void setCodTer(String codTer) {
        this.codTer = codTer;
    }




}


