package POJOS;
// Generated 5/12/2014 10:43:46 AM by Hibernate Tools 4.3.1



/**
 * GenConsecutivos generated by hbm2java
 */
public class GenConsecutivos  implements java.io.Serializable {


     private String codcon;
     private String nomcon;
     private char tipcon;
     private String modulo;
     private boolean sistema;
     private boolean modificado;

    public GenConsecutivos() {
    }

    public GenConsecutivos(String codcon, String nomcon, char tipcon, String modulo, boolean sistema, boolean modificado) {
       this.codcon = codcon;
       this.nomcon = nomcon;
       this.tipcon = tipcon;
       this.modulo = modulo;
       this.sistema = sistema;
       this.modificado = modificado;
    }
   
    public String getCodcon() {
        return this.codcon;
    }
    
    public void setCodcon(String codcon) {
        this.codcon = codcon;
    }
    public String getNomcon() {
        return this.nomcon;
    }
    
    public void setNomcon(String nomcon) {
        this.nomcon = nomcon;
    }
    public char getTipcon() {
        return this.tipcon;
    }
    
    public void setTipcon(char tipcon) {
        this.tipcon = tipcon;
    }
    public String getModulo() {
        return this.modulo;
    }
    
    public void setModulo(String modulo) {
        this.modulo = modulo;
    }
    public boolean isSistema() {
        return this.sistema;
    }
    
    public void setSistema(boolean sistema) {
        this.sistema = sistema;
    }
    public boolean isModificado() {
        return this.modificado;
    }
    
    public void setModificado(boolean modificado) {
        this.modificado = modificado;
    }




}

