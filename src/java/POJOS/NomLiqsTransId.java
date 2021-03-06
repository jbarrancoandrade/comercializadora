package POJOS;
// Generated 5/12/2014 10:43:46 AM by Hibernate Tools 4.3.1



/**
 * NomLiqsTransId generated by hbm2java
 */
public class NomLiqsTransId  implements java.io.Serializable {


     private String keyLiq;
     private String codTran;

    public NomLiqsTransId() {
    }

    public NomLiqsTransId(String keyLiq, String codTran) {
       this.keyLiq = keyLiq;
       this.codTran = codTran;
    }
   
    public String getKeyLiq() {
        return this.keyLiq;
    }
    
    public void setKeyLiq(String keyLiq) {
        this.keyLiq = keyLiq;
    }
    public String getCodTran() {
        return this.codTran;
    }
    
    public void setCodTran(String codTran) {
        this.codTran = codTran;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof NomLiqsTransId) ) return false;
		 NomLiqsTransId castOther = ( NomLiqsTransId ) other; 
         
		 return ( (this.getKeyLiq()==castOther.getKeyLiq()) || ( this.getKeyLiq()!=null && castOther.getKeyLiq()!=null && this.getKeyLiq().equals(castOther.getKeyLiq()) ) )
 && ( (this.getCodTran()==castOther.getCodTran()) || ( this.getCodTran()!=null && castOther.getCodTran()!=null && this.getCodTran().equals(castOther.getCodTran()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getKeyLiq() == null ? 0 : this.getKeyLiq().hashCode() );
         result = 37 * result + ( getCodTran() == null ? 0 : this.getCodTran().hashCode() );
         return result;
   }   


}


