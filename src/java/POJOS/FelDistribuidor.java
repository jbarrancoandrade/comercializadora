package POJOS;
// Generated 5/12/2014 10:43:46 AM by Hibernate Tools 4.3.1



/**
 * FelDistribuidor generated by hbm2java
 */
public class FelDistribuidor  implements java.io.Serializable {


     private int id;
     private String refDis;

    public FelDistribuidor() {
    }

    public FelDistribuidor(int id, String refDis) {
       this.id = id;
       this.refDis = refDis;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getRefDis() {
        return this.refDis;
    }
    
    public void setRefDis(String refDis) {
        this.refDis = refDis;
    }




}


