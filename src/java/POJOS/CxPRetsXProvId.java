package POJOS;
// Generated 5/12/2014 10:43:46 AM by Hibernate Tools 4.3.1



/**
 * CxPRetsXProvId generated by hbm2java
 */
public class CxPRetsXProvId  implements java.io.Serializable {


     private String cedula;
     private String codCon;

    public CxPRetsXProvId() {
    }

    public CxPRetsXProvId(String cedula, String codCon) {
       this.cedula = cedula;
       this.codCon = codCon;
    }
   
    public String getCedula() {
        return this.cedula;
    }
    
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public String getCodCon() {
        return this.codCon;
    }
    
    public void setCodCon(String codCon) {
        this.codCon = codCon;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof CxPRetsXProvId) ) return false;
		 CxPRetsXProvId castOther = ( CxPRetsXProvId ) other; 
         
		 return ( (this.getCedula()==castOther.getCedula()) || ( this.getCedula()!=null && castOther.getCedula()!=null && this.getCedula().equals(castOther.getCedula()) ) )
 && ( (this.getCodCon()==castOther.getCodCon()) || ( this.getCodCon()!=null && castOther.getCodCon()!=null && this.getCodCon().equals(castOther.getCodCon()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getCedula() == null ? 0 : this.getCedula().hashCode() );
         result = 37 * result + ( getCodCon() == null ? 0 : this.getCodCon().hashCode() );
         return result;
   }   


}


