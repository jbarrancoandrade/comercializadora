package POJOS;
// Generated 5/12/2014 10:43:46 AM by Hibernate Tools 4.3.1



/**
 * GenMunicipios generated by hbm2java
 */
public class GenMunicipios  implements java.io.Serializable {


     private GenMunicipiosId id;
     private String nomMcpio;

    public GenMunicipios() {
    }

    public GenMunicipios(GenMunicipiosId id, String nomMcpio) {
       this.id = id;
       this.nomMcpio = nomMcpio;
    }
   
    public GenMunicipiosId getId() {
        return this.id;
    }
    
    public void setId(GenMunicipiosId id) {
        this.id = id;
    }
    public String getNomMcpio() {
        return this.nomMcpio;
    }
    
    public void setNomMcpio(String nomMcpio) {
        this.nomMcpio = nomMcpio;
    }




}

