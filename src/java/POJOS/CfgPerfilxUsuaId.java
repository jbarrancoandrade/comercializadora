package POJOS;
// Generated 5/12/2014 10:43:46 AM by Hibernate Tools 4.3.1



/**
 * CfgPerfilxUsuaId generated by hbm2java
 */
public class CfgPerfilxUsuaId  implements java.io.Serializable {


     private String codusu;
     private String codper;

    public CfgPerfilxUsuaId() {
    }

    public CfgPerfilxUsuaId(String codusu, String codper) {
       this.codusu = codusu;
       this.codper = codper;
    }
   
    public String getCodusu() {
        return this.codusu;
    }
    
    public void setCodusu(String codusu) {
        this.codusu = codusu;
    }
    public String getCodper() {
        return this.codper;
    }
    
    public void setCodper(String codper) {
        this.codper = codper;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof CfgPerfilxUsuaId) ) return false;
		 CfgPerfilxUsuaId castOther = ( CfgPerfilxUsuaId ) other; 
         
		 return ( (this.getCodusu()==castOther.getCodusu()) || ( this.getCodusu()!=null && castOther.getCodusu()!=null && this.getCodusu().equals(castOther.getCodusu()) ) )
 && ( (this.getCodper()==castOther.getCodper()) || ( this.getCodper()!=null && castOther.getCodper()!=null && this.getCodper().equals(castOther.getCodper()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getCodusu() == null ? 0 : this.getCodusu().hashCode() );
         result = 37 * result + ( getCodper() == null ? 0 : this.getCodper().hashCode() );
         return result;
   }   


}


