package POJOS;
// Generated 5/12/2014 10:43:46 AM by Hibernate Tools 4.3.1



/**
 * CxPMaeCausaId generated by hbm2java
 */
public class CxPMaeCausaId  implements java.io.Serializable {


     private String codAlm;
     private String numCau;
     private String tipCau;

    public CxPMaeCausaId() {
    }

    public CxPMaeCausaId(String codAlm, String numCau, String tipCau) {
       this.codAlm = codAlm;
       this.numCau = numCau;
       this.tipCau = tipCau;
    }
   
    public String getCodAlm() {
        return this.codAlm;
    }
    
    public void setCodAlm(String codAlm) {
        this.codAlm = codAlm;
    }
    public String getNumCau() {
        return this.numCau;
    }
    
    public void setNumCau(String numCau) {
        this.numCau = numCau;
    }
    public String getTipCau() {
        return this.tipCau;
    }
    
    public void setTipCau(String tipCau) {
        this.tipCau = tipCau;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof CxPMaeCausaId) ) return false;
		 CxPMaeCausaId castOther = ( CxPMaeCausaId ) other; 
         
		 return ( (this.getCodAlm()==castOther.getCodAlm()) || ( this.getCodAlm()!=null && castOther.getCodAlm()!=null && this.getCodAlm().equals(castOther.getCodAlm()) ) )
 && ( (this.getNumCau()==castOther.getNumCau()) || ( this.getNumCau()!=null && castOther.getNumCau()!=null && this.getNumCau().equals(castOther.getNumCau()) ) )
 && ( (this.getTipCau()==castOther.getTipCau()) || ( this.getTipCau()!=null && castOther.getTipCau()!=null && this.getTipCau().equals(castOther.getTipCau()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getCodAlm() == null ? 0 : this.getCodAlm().hashCode() );
         result = 37 * result + ( getNumCau() == null ? 0 : this.getNumCau().hashCode() );
         result = 37 * result + ( getTipCau() == null ? 0 : this.getTipCau().hashCode() );
         return result;
   }   


}


