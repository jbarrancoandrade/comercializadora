package POJOS;
// Generated 5/12/2014 10:43:46 AM by Hibernate Tools 4.3.1



/**
 * CntInvParComprasId generated by hbm2java
 */
public class CntInvParComprasId  implements java.io.Serializable {


     private String codLinea;
     private char clase;

    public CntInvParComprasId() {
    }

    public CntInvParComprasId(String codLinea, char clase) {
       this.codLinea = codLinea;
       this.clase = clase;
    }
   
    public String getCodLinea() {
        return this.codLinea;
    }
    
    public void setCodLinea(String codLinea) {
        this.codLinea = codLinea;
    }
    public char getClase() {
        return this.clase;
    }
    
    public void setClase(char clase) {
        this.clase = clase;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof CntInvParComprasId) ) return false;
		 CntInvParComprasId castOther = ( CntInvParComprasId ) other; 
         
		 return ( (this.getCodLinea()==castOther.getCodLinea()) || ( this.getCodLinea()!=null && castOther.getCodLinea()!=null && this.getCodLinea().equals(castOther.getCodLinea()) ) )
 && (this.getClase()==castOther.getClase());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getCodLinea() == null ? 0 : this.getCodLinea().hashCode() );
         result = 37 * result + this.getClase();
         return result;
   }   


}


