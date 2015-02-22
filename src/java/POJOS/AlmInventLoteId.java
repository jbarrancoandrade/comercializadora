package POJOS;
// Generated 5/12/2014 10:43:46 AM by Hibernate Tools 4.3.1



/**
 * AlmInventLoteId generated by hbm2java
 */
public class AlmInventLoteId  implements java.io.Serializable {


     private String codAlm;
     private String codIns;
     private String lote;

    public AlmInventLoteId() {
    }

    public AlmInventLoteId(String codAlm, String codIns, String lote) {
       this.codAlm = codAlm;
       this.codIns = codIns;
       this.lote = lote;
    }
   
    public String getCodAlm() {
        return this.codAlm;
    }
    
    public void setCodAlm(String codAlm) {
        this.codAlm = codAlm;
    }
    public String getCodIns() {
        return this.codIns;
    }
    
    public void setCodIns(String codIns) {
        this.codIns = codIns;
    }
    public String getLote() {
        return this.lote;
    }
    
    public void setLote(String lote) {
        this.lote = lote;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AlmInventLoteId) ) return false;
		 AlmInventLoteId castOther = ( AlmInventLoteId ) other; 
         
		 return ( (this.getCodAlm()==castOther.getCodAlm()) || ( this.getCodAlm()!=null && castOther.getCodAlm()!=null && this.getCodAlm().equals(castOther.getCodAlm()) ) )
 && ( (this.getCodIns()==castOther.getCodIns()) || ( this.getCodIns()!=null && castOther.getCodIns()!=null && this.getCodIns().equals(castOther.getCodIns()) ) )
 && ( (this.getLote()==castOther.getLote()) || ( this.getLote()!=null && castOther.getLote()!=null && this.getLote().equals(castOther.getLote()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getCodAlm() == null ? 0 : this.getCodAlm().hashCode() );
         result = 37 * result + ( getCodIns() == null ? 0 : this.getCodIns().hashCode() );
         result = 37 * result + ( getLote() == null ? 0 : this.getLote().hashCode() );
         return result;
   }   


}


