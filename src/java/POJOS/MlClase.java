package POJOS;
// Generated 5/12/2014 10:43:46 AM by Hibernate Tools 4.3.1



/**
 * MlClase generated by hbm2java
 */
public class MlClase  implements java.io.Serializable {


     private String codClase;
     private String nomClase;

    public MlClase() {
    }

    public MlClase(String codClase, String nomClase) {
       this.codClase = codClase;
       this.nomClase = nomClase;
    }
   
    public String getCodClase() {
        return this.codClase;
    }
    
    public void setCodClase(String codClase) {
        this.codClase = codClase;
    }
    public String getNomClase() {
        return this.nomClase;
    }
    
    public void setNomClase(String nomClase) {
        this.nomClase = nomClase;
    }




}


