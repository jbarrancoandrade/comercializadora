package POJOS;
// Generated 5/12/2014 10:43:46 AM by Hibernate Tools 4.3.1



/**
 * TesBancos generated by hbm2java
 */
public class TesBancos  implements java.io.Serializable {


     private String codBanco;
     private String nomBanco;
     private String nitBanco;
     private boolean modificado;

    public TesBancos() {
    }

    public TesBancos(String codBanco, String nomBanco, String nitBanco, boolean modificado) {
       this.codBanco = codBanco;
       this.nomBanco = nomBanco;
       this.nitBanco = nitBanco;
       this.modificado = modificado;
    }
   
    public String getCodBanco() {
        return this.codBanco;
    }
    
    public void setCodBanco(String codBanco) {
        this.codBanco = codBanco;
    }
    public String getNomBanco() {
        return this.nomBanco;
    }
    
    public void setNomBanco(String nomBanco) {
        this.nomBanco = nomBanco;
    }
    public String getNitBanco() {
        return this.nitBanco;
    }
    
    public void setNitBanco(String nitBanco) {
        this.nitBanco = nitBanco;
    }
    public boolean isModificado() {
        return this.modificado;
    }
    
    public void setModificado(boolean modificado) {
        this.modificado = modificado;
    }




}


