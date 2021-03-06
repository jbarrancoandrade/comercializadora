package POJOS;
// Generated 5/12/2014 10:43:46 AM by Hibernate Tools 4.3.1



/**
 * AlmSubLineasId generated by hbm2java
 */
public class AlmSubLineasId  implements java.io.Serializable {


     private String codLinea;
     private String codSub;
     private char clase;

    public AlmSubLineasId() {
    }

    public AlmSubLineasId(String codLinea, String codSub, char clase) {
       this.codLinea = codLinea;
       this.codSub = codSub;
       this.clase = clase;
    }
   
    public String getCodLinea() {
        return this.codLinea;
    }
    
    public void setCodLinea(String codLinea) {
        this.codLinea = codLinea;
    }
    public String getCodSub() {
        return this.codSub;
    }
    
    public void setCodSub(String codSub) {
        this.codSub = codSub;
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
		 if ( !(other instanceof AlmSubLineasId) ) return false;
		 AlmSubLineasId castOther = ( AlmSubLineasId ) other; 
         
		 return ( (this.getCodLinea()==castOther.getCodLinea()) || ( this.getCodLinea()!=null && castOther.getCodLinea()!=null && this.getCodLinea().equals(castOther.getCodLinea()) ) )
 && ( (this.getCodSub()==castOther.getCodSub()) || ( this.getCodSub()!=null && castOther.getCodSub()!=null && this.getCodSub().equals(castOther.getCodSub()) ) )
 && (this.getClase()==castOther.getClase());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getCodLinea() == null ? 0 : this.getCodLinea().hashCode() );
         result = 37 * result + ( getCodSub() == null ? 0 : this.getCodSub().hashCode() );
         result = 37 * result + this.getClase();
         return result;
   }   


}


