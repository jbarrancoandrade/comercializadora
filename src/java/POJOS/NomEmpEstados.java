package POJOS;
// Generated 5/12/2014 10:43:46 AM by Hibernate Tools 4.3.1



/**
 * NomEmpEstados generated by hbm2java
 */
public class NomEmpEstados  implements java.io.Serializable {


     private String codEst;
     private String nomEst;
     private boolean activo;
     private boolean sistema;

    public NomEmpEstados() {
    }

    public NomEmpEstados(String codEst, String nomEst, boolean activo, boolean sistema) {
       this.codEst = codEst;
       this.nomEst = nomEst;
       this.activo = activo;
       this.sistema = sistema;
    }
   
    public String getCodEst() {
        return this.codEst;
    }
    
    public void setCodEst(String codEst) {
        this.codEst = codEst;
    }
    public String getNomEst() {
        return this.nomEst;
    }
    
    public void setNomEst(String nomEst) {
        this.nomEst = nomEst;
    }
    public boolean isActivo() {
        return this.activo;
    }
    
    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    public boolean isSistema() {
        return this.sistema;
    }
    
    public void setSistema(boolean sistema) {
        this.sistema = sistema;
    }




}

