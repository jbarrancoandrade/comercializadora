package POJOS;
// Generated 5/12/2014 10:43:46 AM by Hibernate Tools 4.3.1



/**
 * AlmMarcas generated by hbm2java
 */
public class AlmMarcas  implements java.io.Serializable {


     private String codmar;
     private String nommar;

    public AlmMarcas() {
    }

    public AlmMarcas(String codmar, String nommar) {
       this.codmar = codmar;
       this.nommar = nommar;
    }
   
    public String getCodmar() {
        return this.codmar;
    }
    
    public void setCodmar(String codmar) {
        this.codmar = codmar;
    }
    public String getNommar() {
        return this.nommar;
    }
    
    public void setNommar(String nommar) {
        this.nommar = nommar;
    }




}


