package POJOS;
// Generated 5/12/2014 10:43:46 AM by Hibernate Tools 4.3.1



/**
 * VenDetaCotizaOpcId generated by hbm2java
 */
public class VenDetaCotizaOpcId  implements java.io.Serializable {


     private String codalm;
     private String numcot;
     private String codopc;
     private String codins;

    public VenDetaCotizaOpcId() {
    }

    public VenDetaCotizaOpcId(String codalm, String numcot, String codopc, String codins) {
       this.codalm = codalm;
       this.numcot = numcot;
       this.codopc = codopc;
       this.codins = codins;
    }
   
    public String getCodalm() {
        return this.codalm;
    }
    
    public void setCodalm(String codalm) {
        this.codalm = codalm;
    }
    public String getNumcot() {
        return this.numcot;
    }
    
    public void setNumcot(String numcot) {
        this.numcot = numcot;
    }
    public String getCodopc() {
        return this.codopc;
    }
    
    public void setCodopc(String codopc) {
        this.codopc = codopc;
    }
    public String getCodins() {
        return this.codins;
    }
    
    public void setCodins(String codins) {
        this.codins = codins;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof VenDetaCotizaOpcId) ) return false;
		 VenDetaCotizaOpcId castOther = ( VenDetaCotizaOpcId ) other; 
         
		 return ( (this.getCodalm()==castOther.getCodalm()) || ( this.getCodalm()!=null && castOther.getCodalm()!=null && this.getCodalm().equals(castOther.getCodalm()) ) )
 && ( (this.getNumcot()==castOther.getNumcot()) || ( this.getNumcot()!=null && castOther.getNumcot()!=null && this.getNumcot().equals(castOther.getNumcot()) ) )
 && ( (this.getCodopc()==castOther.getCodopc()) || ( this.getCodopc()!=null && castOther.getCodopc()!=null && this.getCodopc().equals(castOther.getCodopc()) ) )
 && ( (this.getCodins()==castOther.getCodins()) || ( this.getCodins()!=null && castOther.getCodins()!=null && this.getCodins().equals(castOther.getCodins()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getCodalm() == null ? 0 : this.getCodalm().hashCode() );
         result = 37 * result + ( getNumcot() == null ? 0 : this.getNumcot().hashCode() );
         result = 37 * result + ( getCodopc() == null ? 0 : this.getCodopc().hashCode() );
         result = 37 * result + ( getCodins() == null ? 0 : this.getCodins().hashCode() );
         return result;
   }   


}


