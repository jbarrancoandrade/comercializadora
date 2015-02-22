package POJOS;
// Generated 5/12/2014 10:43:46 AM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * VenVendedor generated by hbm2java
 */
public class VenVendedor  implements java.io.Serializable {


     private String codven;
     private String cedula;
     private String nombre1;
     private String nombre2;
     private String apellido1;
     private String apellido2;
     private String telefono1;
     private String telefono2;
     private String direccion;
     private Boolean activo;
     private String celular1;
     private String celular2;
     private String codalm;
     private boolean registraFecNac;
     private Date fecNac;
     private String nombreCom;
     private boolean modificado;
     private String tels;
     private String codzona;
     private String codCaja;

    public VenVendedor() {
    }

	
    public VenVendedor(String codven, boolean registraFecNac, Date fecNac, String nombreCom, boolean modificado, String tels, String codzona, String codCaja) {
        this.codven = codven;
        this.registraFecNac = registraFecNac;
        this.fecNac = fecNac;
        this.nombreCom = nombreCom;
        this.modificado = modificado;
        this.tels = tels;
        this.codzona = codzona;
        this.codCaja = codCaja;
    }
    public VenVendedor(String codven, String cedula, String nombre1, String nombre2, String apellido1, String apellido2, String telefono1, String telefono2, String direccion, Boolean activo, String celular1, String celular2, String codalm, boolean registraFecNac, Date fecNac, String nombreCom, boolean modificado, String tels, String codzona, String codCaja) {
       this.codven = codven;
       this.cedula = cedula;
       this.nombre1 = nombre1;
       this.nombre2 = nombre2;
       this.apellido1 = apellido1;
       this.apellido2 = apellido2;
       this.telefono1 = telefono1;
       this.telefono2 = telefono2;
       this.direccion = direccion;
       this.activo = activo;
       this.celular1 = celular1;
       this.celular2 = celular2;
       this.codalm = codalm;
       this.registraFecNac = registraFecNac;
       this.fecNac = fecNac;
       this.nombreCom = nombreCom;
       this.modificado = modificado;
       this.tels = tels;
       this.codzona = codzona;
       this.codCaja = codCaja;
    }
   
    public String getCodven() {
        return this.codven;
    }
    
    public void setCodven(String codven) {
        this.codven = codven;
    }
    public String getCedula() {
        return this.cedula;
    }
    
    public void setCedula(String cedula) {
        this.cedula = cedula;
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
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public Boolean getActivo() {
        return this.activo;
    }
    
    public void setActivo(Boolean activo) {
        this.activo = activo;
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
    public String getCodalm() {
        return this.codalm;
    }
    
    public void setCodalm(String codalm) {
        this.codalm = codalm;
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
    public String getCodzona() {
        return this.codzona;
    }
    
    public void setCodzona(String codzona) {
        this.codzona = codzona;
    }
    public String getCodCaja() {
        return this.codCaja;
    }
    
    public void setCodCaja(String codCaja) {
        this.codCaja = codCaja;
    }




}

