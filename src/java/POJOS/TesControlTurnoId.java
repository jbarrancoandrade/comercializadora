package POJOS;
// Generated 5/12/2014 10:43:46 AM by Hibernate Tools 4.3.1



/**
 * TesControlTurnoId generated by hbm2java
 */
public class TesControlTurnoId  implements java.io.Serializable {


     private String codalm;
     private String numTurno;

    public TesControlTurnoId() {
    }

    public TesControlTurnoId(String codalm, String numTurno) {
       this.codalm = codalm;
       this.numTurno = numTurno;
    }
   
    public String getCodalm() {
        return this.codalm;
    }
    
    public void setCodalm(String codalm) {
        this.codalm = codalm;
    }
    public String getNumTurno() {
        return this.numTurno;
    }
    
    public void setNumTurno(String numTurno) {
        this.numTurno = numTurno;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof TesControlTurnoId) ) return false;
		 TesControlTurnoId castOther = ( TesControlTurnoId ) other; 
         
		 return ( (this.getCodalm()==castOther.getCodalm()) || ( this.getCodalm()!=null && castOther.getCodalm()!=null && this.getCodalm().equals(castOther.getCodalm()) ) )
 && ( (this.getNumTurno()==castOther.getNumTurno()) || ( this.getNumTurno()!=null && castOther.getNumTurno()!=null && this.getNumTurno().equals(castOther.getNumTurno()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getCodalm() == null ? 0 : this.getCodalm().hashCode() );
         result = 37 * result + ( getNumTurno() == null ? 0 : this.getNumTurno().hashCode() );
         return result;
   }   


}

