package POJOS;
// Generated 5/12/2014 10:43:46 AM by Hibernate Tools 4.3.1



/**
 * VenDetaNotasId generated by hbm2java
 */
public class VenDetaNotasId  implements java.io.Serializable {


     private String codalm;
     private String numNota;
     private String tipNota;
     private String tipFac;
     private String numFac;
     private String codres;
     private String codsec;

    public VenDetaNotasId() {
    }

    public VenDetaNotasId(String codalm, String numNota, String tipNota, String tipFac, String numFac, String codres, String codsec) {
       this.codalm = codalm;
       this.numNota = numNota;
       this.tipNota = tipNota;
       this.tipFac = tipFac;
       this.numFac = numFac;
       this.codres = codres;
       this.codsec = codsec;
    }
   
    public String getCodalm() {
        return this.codalm;
    }
    
    public void setCodalm(String codalm) {
        this.codalm = codalm;
    }
    public String getNumNota() {
        return this.numNota;
    }
    
    public void setNumNota(String numNota) {
        this.numNota = numNota;
    }
    public String getTipNota() {
        return this.tipNota;
    }
    
    public void setTipNota(String tipNota) {
        this.tipNota = tipNota;
    }
    public String getTipFac() {
        return this.tipFac;
    }
    
    public void setTipFac(String tipFac) {
        this.tipFac = tipFac;
    }
    public String getNumFac() {
        return this.numFac;
    }
    
    public void setNumFac(String numFac) {
        this.numFac = numFac;
    }
    public String getCodres() {
        return this.codres;
    }
    
    public void setCodres(String codres) {
        this.codres = codres;
    }
    public String getCodsec() {
        return this.codsec;
    }
    
    public void setCodsec(String codsec) {
        this.codsec = codsec;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof VenDetaNotasId) ) return false;
		 VenDetaNotasId castOther = ( VenDetaNotasId ) other; 
         
		 return ( (this.getCodalm()==castOther.getCodalm()) || ( this.getCodalm()!=null && castOther.getCodalm()!=null && this.getCodalm().equals(castOther.getCodalm()) ) )
 && ( (this.getNumNota()==castOther.getNumNota()) || ( this.getNumNota()!=null && castOther.getNumNota()!=null && this.getNumNota().equals(castOther.getNumNota()) ) )
 && ( (this.getTipNota()==castOther.getTipNota()) || ( this.getTipNota()!=null && castOther.getTipNota()!=null && this.getTipNota().equals(castOther.getTipNota()) ) )
 && ( (this.getTipFac()==castOther.getTipFac()) || ( this.getTipFac()!=null && castOther.getTipFac()!=null && this.getTipFac().equals(castOther.getTipFac()) ) )
 && ( (this.getNumFac()==castOther.getNumFac()) || ( this.getNumFac()!=null && castOther.getNumFac()!=null && this.getNumFac().equals(castOther.getNumFac()) ) )
 && ( (this.getCodres()==castOther.getCodres()) || ( this.getCodres()!=null && castOther.getCodres()!=null && this.getCodres().equals(castOther.getCodres()) ) )
 && ( (this.getCodsec()==castOther.getCodsec()) || ( this.getCodsec()!=null && castOther.getCodsec()!=null && this.getCodsec().equals(castOther.getCodsec()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getCodalm() == null ? 0 : this.getCodalm().hashCode() );
         result = 37 * result + ( getNumNota() == null ? 0 : this.getNumNota().hashCode() );
         result = 37 * result + ( getTipNota() == null ? 0 : this.getTipNota().hashCode() );
         result = 37 * result + ( getTipFac() == null ? 0 : this.getTipFac().hashCode() );
         result = 37 * result + ( getNumFac() == null ? 0 : this.getNumFac().hashCode() );
         result = 37 * result + ( getCodres() == null ? 0 : this.getCodres().hashCode() );
         result = 37 * result + ( getCodsec() == null ? 0 : this.getCodsec().hashCode() );
         return result;
   }   


}


