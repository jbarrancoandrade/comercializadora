package POJOS;
// Generated 5/12/2014 10:43:46 AM by Hibernate Tools 4.3.1



/**
 * CfgConfigReportsTer generated by hbm2java
 */
public class CfgConfigReportsTer  implements java.io.Serializable {


     private CfgConfigReportsTerId id;
     private String reportname;
     private boolean modificado;
     private boolean qtyColSerial;

    public CfgConfigReportsTer() {
    }

    public CfgConfigReportsTer(CfgConfigReportsTerId id, String reportname, boolean modificado, boolean qtyColSerial) {
       this.id = id;
       this.reportname = reportname;
       this.modificado = modificado;
       this.qtyColSerial = qtyColSerial;
    }
   
    public CfgConfigReportsTerId getId() {
        return this.id;
    }
    
    public void setId(CfgConfigReportsTerId id) {
        this.id = id;
    }
    public String getReportname() {
        return this.reportname;
    }
    
    public void setReportname(String reportname) {
        this.reportname = reportname;
    }
    public boolean isModificado() {
        return this.modificado;
    }
    
    public void setModificado(boolean modificado) {
        this.modificado = modificado;
    }
    public boolean isQtyColSerial() {
        return this.qtyColSerial;
    }
    
    public void setQtyColSerial(boolean qtyColSerial) {
        this.qtyColSerial = qtyColSerial;
    }




}


