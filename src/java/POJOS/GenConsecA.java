package POJOS;
// Generated 5/12/2014 10:43:46 AM by Hibernate Tools 4.3.1



/**
 * GenConsecA generated by hbm2java
 */
public class GenConsecA  implements java.io.Serializable {


     private GenConsecAId id;
     private Integer consecutivo;

    public GenConsecA() {
    }

	
    public GenConsecA(GenConsecAId id) {
        this.id = id;
    }
    public GenConsecA(GenConsecAId id, Integer consecutivo) {
       this.id = id;
       this.consecutivo = consecutivo;
    }
   
    public GenConsecAId getId() {
        return this.id;
    }
    
    public void setId(GenConsecAId id) {
        this.id = id;
    }
    public Integer getConsecutivo() {
        return this.consecutivo;
    }
    
    public void setConsecutivo(Integer consecutivo) {
        this.consecutivo = consecutivo;
    }




}


