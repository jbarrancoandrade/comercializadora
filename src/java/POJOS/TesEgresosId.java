package POJOS;
// Generated 5/12/2014 10:43:46 AM by Hibernate Tools 4.3.1



/**
 * TesEgresosId generated by hbm2java
 */
public class TesEgresosId  implements java.io.Serializable {


     private String codalm;
     private String numEgr;

    public TesEgresosId() {
    }

    public TesEgresosId(String codalm, String numEgr) {
       this.codalm = codalm;
       this.numEgr = numEgr;
    }
   
    public String getCodalm() {
        return this.codalm;
    }
    
    public void setCodalm(String codalm) {
        this.codalm = codalm;
    }
    public String getNumEgr() {
        return this.numEgr;
    }
    
    public void setNumEgr(String numEgr) {
        this.numEgr = numEgr;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof TesEgresosId) ) return false;
		 TesEgresosId castOther = ( TesEgresosId ) other; 
         
		 return ( (this.getCodalm()==castOther.getCodalm()) || ( this.getCodalm()!=null && castOther.getCodalm()!=null && this.getCodalm().equals(castOther.getCodalm()) ) )
 && ( (this.getNumEgr()==castOther.getNumEgr()) || ( this.getNumEgr()!=null && castOther.getNumEgr()!=null && this.getNumEgr().equals(castOther.getNumEgr()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getCodalm() == null ? 0 : this.getCodalm().hashCode() );
         result = 37 * result + ( getNumEgr() == null ? 0 : this.getNumEgr().hashCode() );
         return result;
   }   


}

