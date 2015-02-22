package POJOS;
// Generated 5/12/2014 10:43:46 AM by Hibernate Tools 4.3.1



/**
 * NomPeriodosxVarId generated by hbm2java
 */
public class NomPeriodosxVarId  implements java.io.Serializable {


     private String codVar;
     private byte PIni;
     private byte PFin;

    public NomPeriodosxVarId() {
    }

    public NomPeriodosxVarId(String codVar, byte PIni, byte PFin) {
       this.codVar = codVar;
       this.PIni = PIni;
       this.PFin = PFin;
    }
   
    public String getCodVar() {
        return this.codVar;
    }
    
    public void setCodVar(String codVar) {
        this.codVar = codVar;
    }
    public byte getPIni() {
        return this.PIni;
    }
    
    public void setPIni(byte PIni) {
        this.PIni = PIni;
    }
    public byte getPFin() {
        return this.PFin;
    }
    
    public void setPFin(byte PFin) {
        this.PFin = PFin;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof NomPeriodosxVarId) ) return false;
		 NomPeriodosxVarId castOther = ( NomPeriodosxVarId ) other; 
         
		 return ( (this.getCodVar()==castOther.getCodVar()) || ( this.getCodVar()!=null && castOther.getCodVar()!=null && this.getCodVar().equals(castOther.getCodVar()) ) )
 && (this.getPIni()==castOther.getPIni())
 && (this.getPFin()==castOther.getPFin());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getCodVar() == null ? 0 : this.getCodVar().hashCode() );
         result = 37 * result + this.getPIni();
         result = 37 * result + this.getPFin();
         return result;
   }   


}

