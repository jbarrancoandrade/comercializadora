package POJOS;
// Generated 5/12/2014 10:43:46 AM by Hibernate Tools 4.3.1



/**
 * CntLibros generated by hbm2java
 */
public class CntLibros  implements java.io.Serializable {


     private String codLib;
     private String nomLib;
     private int iniciaEn;
     private int lastPrint;

    public CntLibros() {
    }

    public CntLibros(String codLib, String nomLib, int iniciaEn, int lastPrint) {
       this.codLib = codLib;
       this.nomLib = nomLib;
       this.iniciaEn = iniciaEn;
       this.lastPrint = lastPrint;
    }
   
    public String getCodLib() {
        return this.codLib;
    }
    
    public void setCodLib(String codLib) {
        this.codLib = codLib;
    }
    public String getNomLib() {
        return this.nomLib;
    }
    
    public void setNomLib(String nomLib) {
        this.nomLib = nomLib;
    }
    public int getIniciaEn() {
        return this.iniciaEn;
    }
    
    public void setIniciaEn(int iniciaEn) {
        this.iniciaEn = iniciaEn;
    }
    public int getLastPrint() {
        return this.lastPrint;
    }
    
    public void setLastPrint(int lastPrint) {
        this.lastPrint = lastPrint;
    }




}

