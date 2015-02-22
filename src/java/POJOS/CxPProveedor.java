package POJOS;
// Generated 5/12/2014 10:43:46 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;

/**
 * CxPProveedor generated by hbm2java
 */
public class CxPProveedor  implements java.io.Serializable {


     private String cedula;
     private String codpro;
     private String nombre1;
     private String nombre2;
     private String apellido1;
     private String apellido2;
     private String telefono1;
     private String telefono2;
     private String celular1;
     private String celular2;
     private String direccion;
     private Character regimen;
     private String email;
     private boolean registraFecNac;
     private Date fecNac;
     private String nombreCom;
     private String codAct;
     private boolean autoReteIca;
     private boolean autoReteIva;
     private boolean autoReteFuente;
     private boolean tipCap;
     private String codMcpio;
     private String tipId;
     private String codDpto;
     private boolean modificado;
     private String tels;
     private String nombreCal;
     private String nombreBus;
     private String codmon;
     private boolean retAnyBase;
     private char tipcom;
     private BigDecimal margenReteIca;

    public CxPProveedor() {
    }

	
    public CxPProveedor(String cedula, String email, boolean registraFecNac, Date fecNac, String nombreCom, String codAct, boolean autoReteIca, boolean autoReteIva, boolean autoReteFuente, boolean tipCap, String codMcpio, String tipId, String codDpto, boolean modificado, String tels, String nombreCal, String nombreBus, String codmon, boolean retAnyBase, char tipcom, BigDecimal margenReteIca) {
        this.cedula = cedula;
        this.email = email;
        this.registraFecNac = registraFecNac;
        this.fecNac = fecNac;
        this.nombreCom = nombreCom;
        this.codAct = codAct;
        this.autoReteIca = autoReteIca;
        this.autoReteIva = autoReteIva;
        this.autoReteFuente = autoReteFuente;
        this.tipCap = tipCap;
        this.codMcpio = codMcpio;
        this.tipId = tipId;
        this.codDpto = codDpto;
        this.modificado = modificado;
        this.tels = tels;
        this.nombreCal = nombreCal;
        this.nombreBus = nombreBus;
        this.codmon = codmon;
        this.retAnyBase = retAnyBase;
        this.tipcom = tipcom;
        this.margenReteIca = margenReteIca;
    }
    public CxPProveedor(String cedula, String codpro, String nombre1, String nombre2, String apellido1, String apellido2, String telefono1, String telefono2, String celular1, String celular2, String direccion, Character regimen, String email, boolean registraFecNac, Date fecNac, String nombreCom, String codAct, boolean autoReteIca, boolean autoReteIva, boolean autoReteFuente, boolean tipCap, String codMcpio, String tipId, String codDpto, boolean modificado, String tels, String nombreCal, String nombreBus, String codmon, boolean retAnyBase, char tipcom, BigDecimal margenReteIca) {
       this.cedula = cedula;
       this.codpro = codpro;
       this.nombre1 = nombre1;
       this.nombre2 = nombre2;
       this.apellido1 = apellido1;
       this.apellido2 = apellido2;
       this.telefono1 = telefono1;
       this.telefono2 = telefono2;
       this.celular1 = celular1;
       this.celular2 = celular2;
       this.direccion = direccion;
       this.regimen = regimen;
       this.email = email;
       this.registraFecNac = registraFecNac;
       this.fecNac = fecNac;
       this.nombreCom = nombreCom;
       this.codAct = codAct;
       this.autoReteIca = autoReteIca;
       this.autoReteIva = autoReteIva;
       this.autoReteFuente = autoReteFuente;
       this.tipCap = tipCap;
       this.codMcpio = codMcpio;
       this.tipId = tipId;
       this.codDpto = codDpto;
       this.modificado = modificado;
       this.tels = tels;
       this.nombreCal = nombreCal;
       this.nombreBus = nombreBus;
       this.codmon = codmon;
       this.retAnyBase = retAnyBase;
       this.tipcom = tipcom;
       this.margenReteIca = margenReteIca;
    }
   
    public String getCedula() {
        return this.cedula;
    }
    
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public String getCodpro() {
        return this.codpro;
    }
    
    public void setCodpro(String codpro) {
        this.codpro = codpro;
    }
    public String getNombre1() {
        return this.nombre1;
    }
    
    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }
    public String getNombre2() {
        return this.nombre2;
    }
    
    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }
    public String getApellido1() {
        return this.apellido1;
    }
    
    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }
    public String getApellido2() {
        return this.apellido2;
    }
    
    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }
    public String getTelefono1() {
        return this.telefono1;
    }
    
    public void setTelefono1(String telefono1) {
        this.telefono1 = telefono1;
    }
    public String getTelefono2() {
        return this.telefono2;
    }
    
    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }
    public String getCelular1() {
        return this.celular1;
    }
    
    public void setCelular1(String celular1) {
        this.celular1 = celular1;
    }
    public String getCelular2() {
        return this.celular2;
    }
    
    public void setCelular2(String celular2) {
        this.celular2 = celular2;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public Character getRegimen() {
        return this.regimen;
    }
    
    public void setRegimen(Character regimen) {
        this.regimen = regimen;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public boolean isRegistraFecNac() {
        return this.registraFecNac;
    }
    
    public void setRegistraFecNac(boolean registraFecNac) {
        this.registraFecNac = registraFecNac;
    }
    public Date getFecNac() {
        return this.fecNac;
    }
    
    public void setFecNac(Date fecNac) {
        this.fecNac = fecNac;
    }
    public String getNombreCom() {
        return this.nombreCom;
    }
    
    public void setNombreCom(String nombreCom) {
        this.nombreCom = nombreCom;
    }
    public String getCodAct() {
        return this.codAct;
    }
    
    public void setCodAct(String codAct) {
        this.codAct = codAct;
    }
    public boolean isAutoReteIca() {
        return this.autoReteIca;
    }
    
    public void setAutoReteIca(boolean autoReteIca) {
        this.autoReteIca = autoReteIca;
    }
    public boolean isAutoReteIva() {
        return this.autoReteIva;
    }
    
    public void setAutoReteIva(boolean autoReteIva) {
        this.autoReteIva = autoReteIva;
    }
    public boolean isAutoReteFuente() {
        return this.autoReteFuente;
    }
    
    public void setAutoReteFuente(boolean autoReteFuente) {
        this.autoReteFuente = autoReteFuente;
    }
    public boolean isTipCap() {
        return this.tipCap;
    }
    
    public void setTipCap(boolean tipCap) {
        this.tipCap = tipCap;
    }
    public String getCodMcpio() {
        return this.codMcpio;
    }
    
    public void setCodMcpio(String codMcpio) {
        this.codMcpio = codMcpio;
    }
    public String getTipId() {
        return this.tipId;
    }
    
    public void setTipId(String tipId) {
        this.tipId = tipId;
    }
    public String getCodDpto() {
        return this.codDpto;
    }
    
    public void setCodDpto(String codDpto) {
        this.codDpto = codDpto;
    }
    public boolean isModificado() {
        return this.modificado;
    }
    
    public void setModificado(boolean modificado) {
        this.modificado = modificado;
    }
    public String getTels() {
        return this.tels;
    }
    
    public void setTels(String tels) {
        this.tels = tels;
    }
    public String getNombreCal() {
        return this.nombreCal;
    }
    
    public void setNombreCal(String nombreCal) {
        this.nombreCal = nombreCal;
    }
    public String getNombreBus() {
        return this.nombreBus;
    }
    
    public void setNombreBus(String nombreBus) {
        this.nombreBus = nombreBus;
    }
    public String getCodmon() {
        return this.codmon;
    }
    
    public void setCodmon(String codmon) {
        this.codmon = codmon;
    }
    public boolean isRetAnyBase() {
        return this.retAnyBase;
    }
    
    public void setRetAnyBase(boolean retAnyBase) {
        this.retAnyBase = retAnyBase;
    }
    public char getTipcom() {
        return this.tipcom;
    }
    
    public void setTipcom(char tipcom) {
        this.tipcom = tipcom;
    }
    public BigDecimal getMargenReteIca() {
        return this.margenReteIca;
    }
    
    public void setMargenReteIca(BigDecimal margenReteIca) {
        this.margenReteIca = margenReteIca;
    }




}


