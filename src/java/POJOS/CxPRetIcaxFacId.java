package POJOS;
// Generated 5/12/2014 10:43:46 AM by Hibernate Tools 4.3.1



/**
 * CxPRetIcaxFacId generated by hbm2java
 */
public class CxPRetIcaxFacId  implements java.io.Serializable {


     private String codAlm;
     private String numFac;
     private String tipFac;
     private String numRad;
     private String codAct;

    public CxPRetIcaxFacId() {
    }

    public CxPRetIcaxFacId(String codAlm, String numFac, String tipFac, String numRad, String codAct) {
       this.codAlm = codAlm;
       this.numFac = numFac;
       this.tipFac = tipFac;
       this.numRad = numRad;
       this.codAct = codAct;
    }
   
    public String getCodAlm() {
        return this.codAlm;
    }
    
    public void setCodAlm(String codAlm) {
        this.codAlm = codAlm;
    }
    public String getNumFac() {
        return this.numFac;
    }
    
    public void setNumFac(String numFac) {
        this.numFac = numFac;
    }
    public String getTipFac() {
        return this.tipFac;
    }
    
    public void setTipFac(String tipFac) {
        this.tipFac = tipFac;
    }
    public String getNumRad() {
        return this.numRad;
    }
    
    public void setNumRad(String numRad) {
        this.numRad = numRad;
    }
    public String getCodAct() {
        return this.codAct;
    }
    
    public void setCodAct(String codAct) {
        this.codAct = codAct;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof CxPRetIcaxFacId) ) return false;
		 CxPRetIcaxFacId castOther = ( CxPRetIcaxFacId ) other; 
         
		 return ( (this.getCodAlm()==castOther.getCodAlm()) || ( this.getCodAlm()!=null && castOther.getCodAlm()!=null && this.getCodAlm().equals(castOther.getCodAlm()) ) )
 && ( (this.getNumFac()==castOther.getNumFac()) || ( this.getNumFac()!=null && castOther.getNumFac()!=null && this.getNumFac().equals(castOther.getNumFac()) ) )
 && ( (this.getTipFac()==castOther.getTipFac()) || ( this.getTipFac()!=null && castOther.getTipFac()!=null && this.getTipFac().equals(castOther.getTipFac()) ) )
 && ( (this.getNumRad()==castOther.getNumRad()) || ( this.getNumRad()!=null && castOther.getNumRad()!=null && this.getNumRad().equals(castOther.getNumRad()) ) )
 && ( (this.getCodAct()==castOther.getCodAct()) || ( this.getCodAct()!=null && castOther.getCodAct()!=null && this.getCodAct().equals(castOther.getCodAct()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getCodAlm() == null ? 0 : this.getCodAlm().hashCode() );
         result = 37 * result + ( getNumFac() == null ? 0 : this.getNumFac().hashCode() );
         result = 37 * result + ( getTipFac() == null ? 0 : this.getTipFac().hashCode() );
         result = 37 * result + ( getNumRad() == null ? 0 : this.getNumRad().hashCode() );
         result = 37 * result + ( getCodAct() == null ? 0 : this.getCodAct().hashCode() );
         return result;
   }   


}


