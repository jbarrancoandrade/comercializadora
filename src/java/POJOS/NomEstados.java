package POJOS;
// Generated 5/12/2014 10:43:46 AM by Hibernate Tools 4.3.1



/**
 * NomEstados generated by hbm2java
 */
public class NomEstados  implements java.io.Serializable {


     private String codEstado;
     private String nomEstado;

    public NomEstados() {
    }

    public NomEstados(String codEstado, String nomEstado) {
       this.codEstado = codEstado;
       this.nomEstado = nomEstado;
    }
   
    public String getCodEstado() {
        return this.codEstado;
    }
    
    public void setCodEstado(String codEstado) {
        this.codEstado = codEstado;
    }
    public String getNomEstado() {
        return this.nomEstado;
    }
    
    public void setNomEstado(String nomEstado) {
        this.nomEstado = nomEstado;
    }




}


