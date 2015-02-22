package POJOS;
// Generated 5/12/2014 10:43:46 AM by Hibernate Tools 4.3.1



/**
 * CxPDetaPedProvId generated by hbm2java
 */
public class CxPDetaPedProvId  implements java.io.Serializable {


     private String codter;
     private String codins;
     private String codAlm;

    public CxPDetaPedProvId() {
    }

    public CxPDetaPedProvId(String codter, String codins, String codAlm) {
       this.codter = codter;
       this.codins = codins;
       this.codAlm = codAlm;
    }
   
    public String getCodter() {
        return this.codter;
    }
    
    public void setCodter(String codter) {
        this.codter = codter;
    }
    public String getCodins() {
        return this.codins;
    }
    
    public void setCodins(String codins) {
        this.codins = codins;
    }
    public String getCodAlm() {
        return this.codAlm;
    }
    
    public void setCodAlm(String codAlm) {
        this.codAlm = codAlm;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof CxPDetaPedProvId) ) return false;
		 CxPDetaPedProvId castOther = ( CxPDetaPedProvId ) other; 
         
		 return ( (this.getCodter()==castOther.getCodter()) || ( this.getCodter()!=null && castOther.getCodter()!=null && this.getCodter().equals(castOther.getCodter()) ) )
 && ( (this.getCodins()==castOther.getCodins()) || ( this.getCodins()!=null && castOther.getCodins()!=null && this.getCodins().equals(castOther.getCodins()) ) )
 && ( (this.getCodAlm()==castOther.getCodAlm()) || ( this.getCodAlm()!=null && castOther.getCodAlm()!=null && this.getCodAlm().equals(castOther.getCodAlm()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getCodter() == null ? 0 : this.getCodter().hashCode() );
         result = 37 * result + ( getCodins() == null ? 0 : this.getCodins().hashCode() );
         result = 37 * result + ( getCodAlm() == null ? 0 : this.getCodAlm().hashCode() );
         return result;
   }   


}


