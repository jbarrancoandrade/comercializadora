package POJOS;
// Generated 5/12/2014 10:43:46 AM by Hibernate Tools 4.3.1



/**
 * NomArp generated by hbm2java
 */
public class NomArp  implements java.io.Serializable {


     private String codArp;
     private String codTer;

    public NomArp() {
    }

    public NomArp(String codArp, String codTer) {
       this.codArp = codArp;
       this.codTer = codTer;
    }
   
    public String getCodArp() {
        return this.codArp;
    }
    
    public void setCodArp(String codArp) {
        this.codArp = codArp;
    }
    public String getCodTer() {
        return this.codTer;
    }
    
    public void setCodTer(String codTer) {
        this.codTer = codTer;
    }




}


