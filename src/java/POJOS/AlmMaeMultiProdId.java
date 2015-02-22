package POJOS;
// Generated 5/12/2014 10:43:46 AM by Hibernate Tools 4.3.1



/**
 * AlmMaeMultiProdId generated by hbm2java
 */
public class AlmMaeMultiProdId  implements java.io.Serializable {


     private String codInsBase;
     private String idopc;

    public AlmMaeMultiProdId() {
    }

    public AlmMaeMultiProdId(String codInsBase, String idopc) {
       this.codInsBase = codInsBase;
       this.idopc = idopc;
    }
   
    public String getCodInsBase() {
        return this.codInsBase;
    }
    
    public void setCodInsBase(String codInsBase) {
        this.codInsBase = codInsBase;
    }
    public String getIdopc() {
        return this.idopc;
    }
    
    public void setIdopc(String idopc) {
        this.idopc = idopc;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AlmMaeMultiProdId) ) return false;
		 AlmMaeMultiProdId castOther = ( AlmMaeMultiProdId ) other; 
         
		 return ( (this.getCodInsBase()==castOther.getCodInsBase()) || ( this.getCodInsBase()!=null && castOther.getCodInsBase()!=null && this.getCodInsBase().equals(castOther.getCodInsBase()) ) )
 && ( (this.getIdopc()==castOther.getIdopc()) || ( this.getIdopc()!=null && castOther.getIdopc()!=null && this.getIdopc().equals(castOther.getIdopc()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getCodInsBase() == null ? 0 : this.getCodInsBase().hashCode() );
         result = 37 * result + ( getIdopc() == null ? 0 : this.getIdopc().hashCode() );
         return result;
   }   


}


