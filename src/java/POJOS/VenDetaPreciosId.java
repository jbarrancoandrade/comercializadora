package POJOS;
// Generated 5/12/2014 10:43:46 AM by Hibernate Tools 4.3.1



/**
 * VenDetaPreciosId generated by hbm2java
 */
public class VenDetaPreciosId  implements java.io.Serializable {


     private String codList;
     private String codalm;
     private String codins;

    public VenDetaPreciosId() {
    }

    public VenDetaPreciosId(String codList, String codalm, String codins) {
       this.codList = codList;
       this.codalm = codalm;
       this.codins = codins;
    }
   
    public String getCodList() {
        return this.codList;
    }
    
    public void setCodList(String codList) {
        this.codList = codList;
    }
    public String getCodalm() {
        return this.codalm;
    }
    
    public void setCodalm(String codalm) {
        this.codalm = codalm;
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
		 if ( !(other instanceof VenDetaPreciosId) ) return false;
		 VenDetaPreciosId castOther = ( VenDetaPreciosId ) other; 
         
		 return ( (this.getCodList()==castOther.getCodList()) || ( this.getCodList()!=null && castOther.getCodList()!=null && this.getCodList().equals(castOther.getCodList()) ) )
 && ( (this.getCodalm()==castOther.getCodalm()) || ( this.getCodalm()!=null && castOther.getCodalm()!=null && this.getCodalm().equals(castOther.getCodalm()) ) )
 && ( (this.getCodins()==castOther.getCodins()) || ( this.getCodins()!=null && castOther.getCodins()!=null && this.getCodins().equals(castOther.getCodins()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getCodList() == null ? 0 : this.getCodList().hashCode() );
         result = 37 * result + ( getCodalm() == null ? 0 : this.getCodalm().hashCode() );
         result = 37 * result + ( getCodins() == null ? 0 : this.getCodins().hashCode() );
         return result;
   }   


}


