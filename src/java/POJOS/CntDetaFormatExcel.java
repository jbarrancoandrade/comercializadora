package POJOS;
// Generated 5/12/2014 10:43:46 AM by Hibernate Tools 4.3.1



/**
 * CntDetaFormatExcel generated by hbm2java
 */
public class CntDetaFormatExcel  implements java.io.Serializable {


     private CntDetaFormatExcelId id;
     private String strConfig;

    public CntDetaFormatExcel() {
    }

    public CntDetaFormatExcel(CntDetaFormatExcelId id, String strConfig) {
       this.id = id;
       this.strConfig = strConfig;
    }
   
    public CntDetaFormatExcelId getId() {
        return this.id;
    }
    
    public void setId(CntDetaFormatExcelId id) {
        this.id = id;
    }
    public String getStrConfig() {
        return this.strConfig;
    }
    
    public void setStrConfig(String strConfig) {
        this.strConfig = strConfig;
    }




}


