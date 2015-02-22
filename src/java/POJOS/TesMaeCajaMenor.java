package POJOS;
// Generated 5/12/2014 10:43:46 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;

/**
 * TesMaeCajaMenor generated by hbm2java
 */
public class TesMaeCajaMenor  implements java.io.Serializable {


     private TesMaeCajaMenorId id;
     private BigDecimal cupoCm;
     private BigDecimal saldoAnt;
     private BigDecimal reembolso;
     private BigDecimal nuevoSaldo;
     private Date fecSys;
     private String codUsu;
     private String pc;
     private char estado;
     private String numEgr;
     private String tipEgr;

    public TesMaeCajaMenor() {
    }

    public TesMaeCajaMenor(TesMaeCajaMenorId id, BigDecimal cupoCm, BigDecimal saldoAnt, BigDecimal reembolso, BigDecimal nuevoSaldo, Date fecSys, String codUsu, String pc, char estado, String numEgr, String tipEgr) {
       this.id = id;
       this.cupoCm = cupoCm;
       this.saldoAnt = saldoAnt;
       this.reembolso = reembolso;
       this.nuevoSaldo = nuevoSaldo;
       this.fecSys = fecSys;
       this.codUsu = codUsu;
       this.pc = pc;
       this.estado = estado;
       this.numEgr = numEgr;
       this.tipEgr = tipEgr;
    }
   
    public TesMaeCajaMenorId getId() {
        return this.id;
    }
    
    public void setId(TesMaeCajaMenorId id) {
        this.id = id;
    }
    public BigDecimal getCupoCm() {
        return this.cupoCm;
    }
    
    public void setCupoCm(BigDecimal cupoCm) {
        this.cupoCm = cupoCm;
    }
    public BigDecimal getSaldoAnt() {
        return this.saldoAnt;
    }
    
    public void setSaldoAnt(BigDecimal saldoAnt) {
        this.saldoAnt = saldoAnt;
    }
    public BigDecimal getReembolso() {
        return this.reembolso;
    }
    
    public void setReembolso(BigDecimal reembolso) {
        this.reembolso = reembolso;
    }
    public BigDecimal getNuevoSaldo() {
        return this.nuevoSaldo;
    }
    
    public void setNuevoSaldo(BigDecimal nuevoSaldo) {
        this.nuevoSaldo = nuevoSaldo;
    }
    public Date getFecSys() {
        return this.fecSys;
    }
    
    public void setFecSys(Date fecSys) {
        this.fecSys = fecSys;
    }
    public String getCodUsu() {
        return this.codUsu;
    }
    
    public void setCodUsu(String codUsu) {
        this.codUsu = codUsu;
    }
    public String getPc() {
        return this.pc;
    }
    
    public void setPc(String pc) {
        this.pc = pc;
    }
    public char getEstado() {
        return this.estado;
    }
    
    public void setEstado(char estado) {
        this.estado = estado;
    }
    public String getNumEgr() {
        return this.numEgr;
    }
    
    public void setNumEgr(String numEgr) {
        this.numEgr = numEgr;
    }
    public String getTipEgr() {
        return this.tipEgr;
    }
    
    public void setTipEgr(String tipEgr) {
        this.tipEgr = tipEgr;
    }




}


