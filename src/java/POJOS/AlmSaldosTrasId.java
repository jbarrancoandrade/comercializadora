package POJOS;
// Generated 5/12/2014 10:43:46 AM by Hibernate Tools 4.3.1



/**
 * AlmSaldosTrasId generated by hbm2java
 */
public class AlmSaldosTrasId  implements java.io.Serializable {


     private String codAlmOri;
     private String codAlmDes;
     private String docKarOri;
     private String docKarDes;
     private String tipkarDes;

    public AlmSaldosTrasId() {
    }

    public AlmSaldosTrasId(String codAlmOri, String codAlmDes, String docKarOri, String docKarDes, String tipkarDes) {
       this.codAlmOri = codAlmOri;
       this.codAlmDes = codAlmDes;
       this.docKarOri = docKarOri;
       this.docKarDes = docKarDes;
       this.tipkarDes = tipkarDes;
    }
   
    public String getCodAlmOri() {
        return this.codAlmOri;
    }
    
    public void setCodAlmOri(String codAlmOri) {
        this.codAlmOri = codAlmOri;
    }
    public String getCodAlmDes() {
        return this.codAlmDes;
    }
    
    public void setCodAlmDes(String codAlmDes) {
        this.codAlmDes = codAlmDes;
    }
    public String getDocKarOri() {
        return this.docKarOri;
    }
    
    public void setDocKarOri(String docKarOri) {
        this.docKarOri = docKarOri;
    }
    public String getDocKarDes() {
        return this.docKarDes;
    }
    
    public void setDocKarDes(String docKarDes) {
        this.docKarDes = docKarDes;
    }
    public String getTipkarDes() {
        return this.tipkarDes;
    }
    
    public void setTipkarDes(String tipkarDes) {
        this.tipkarDes = tipkarDes;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AlmSaldosTrasId) ) return false;
		 AlmSaldosTrasId castOther = ( AlmSaldosTrasId ) other; 
         
		 return ( (this.getCodAlmOri()==castOther.getCodAlmOri()) || ( this.getCodAlmOri()!=null && castOther.getCodAlmOri()!=null && this.getCodAlmOri().equals(castOther.getCodAlmOri()) ) )
 && ( (this.getCodAlmDes()==castOther.getCodAlmDes()) || ( this.getCodAlmDes()!=null && castOther.getCodAlmDes()!=null && this.getCodAlmDes().equals(castOther.getCodAlmDes()) ) )
 && ( (this.getDocKarOri()==castOther.getDocKarOri()) || ( this.getDocKarOri()!=null && castOther.getDocKarOri()!=null && this.getDocKarOri().equals(castOther.getDocKarOri()) ) )
 && ( (this.getDocKarDes()==castOther.getDocKarDes()) || ( this.getDocKarDes()!=null && castOther.getDocKarDes()!=null && this.getDocKarDes().equals(castOther.getDocKarDes()) ) )
 && ( (this.getTipkarDes()==castOther.getTipkarDes()) || ( this.getTipkarDes()!=null && castOther.getTipkarDes()!=null && this.getTipkarDes().equals(castOther.getTipkarDes()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getCodAlmOri() == null ? 0 : this.getCodAlmOri().hashCode() );
         result = 37 * result + ( getCodAlmDes() == null ? 0 : this.getCodAlmDes().hashCode() );
         result = 37 * result + ( getDocKarOri() == null ? 0 : this.getDocKarOri().hashCode() );
         result = 37 * result + ( getDocKarDes() == null ? 0 : this.getDocKarDes().hashCode() );
         result = 37 * result + ( getTipkarDes() == null ? 0 : this.getTipkarDes().hashCode() );
         return result;
   }   


}


