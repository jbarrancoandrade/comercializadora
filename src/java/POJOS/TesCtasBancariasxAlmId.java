package POJOS;
// Generated 5/12/2014 10:43:46 AM by Hibernate Tools 4.3.1



/**
 * TesCtasBancariasxAlmId generated by hbm2java
 */
public class TesCtasBancariasxAlmId  implements java.io.Serializable {


     private String codAlm;
     private String codCta;

    public TesCtasBancariasxAlmId() {
    }

    public TesCtasBancariasxAlmId(String codAlm, String codCta) {
       this.codAlm = codAlm;
       this.codCta = codCta;
    }
   
    public String getCodAlm() {
        return this.codAlm;
    }
    
    public void setCodAlm(String codAlm) {
        this.codAlm = codAlm;
    }
    public String getCodCta() {
        return this.codCta;
    }
    
    public void setCodCta(String codCta) {
        this.codCta = codCta;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof TesCtasBancariasxAlmId) ) return false;
		 TesCtasBancariasxAlmId castOther = ( TesCtasBancariasxAlmId ) other; 
         
		 return ( (this.getCodAlm()==castOther.getCodAlm()) || ( this.getCodAlm()!=null && castOther.getCodAlm()!=null && this.getCodAlm().equals(castOther.getCodAlm()) ) )
 && ( (this.getCodCta()==castOther.getCodCta()) || ( this.getCodCta()!=null && castOther.getCodCta()!=null && this.getCodCta().equals(castOther.getCodCta()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getCodAlm() == null ? 0 : this.getCodAlm().hashCode() );
         result = 37 * result + ( getCodCta() == null ? 0 : this.getCodCta().hashCode() );
         return result;
   }   


}


