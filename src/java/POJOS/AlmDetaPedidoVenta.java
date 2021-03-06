package POJOS;
// Generated 5/12/2014 10:43:46 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * AlmDetaPedidoVenta generated by hbm2java
 */
public class AlmDetaPedidoVenta  implements java.io.Serializable {


     private AlmDetaPedidoVentaId id;
     private BigDecimal qtyPed;
     private BigDecimal qtyRem;
     private BigDecimal valVta;
     private String estado;
     private BigDecimal qtyfac;
     private String numRem;
     private BigDecimal dscto;
     private BigDecimal valIva;
     private BigDecimal valDcto;
     private String codTalla;
     private BigDecimal margenDcto;
     private BigDecimal margenIva;
     private BigDecimal valUnitario;

    public AlmDetaPedidoVenta() {
    }

    public AlmDetaPedidoVenta(AlmDetaPedidoVentaId id, BigDecimal qtyPed, BigDecimal qtyRem, BigDecimal valVta, String estado, BigDecimal qtyfac, String numRem, BigDecimal dscto, BigDecimal valIva, BigDecimal valDcto, String codTalla, BigDecimal margenDcto, BigDecimal margenIva, BigDecimal valUnitario) {
       this.id = id;
       this.qtyPed = qtyPed;
       this.qtyRem = qtyRem;
       this.valVta = valVta;
       this.estado = estado;
       this.qtyfac = qtyfac;
       this.numRem = numRem;
       this.dscto = dscto;
       this.valIva = valIva;
       this.valDcto = valDcto;
       this.codTalla = codTalla;
       this.margenDcto = margenDcto;
       this.margenIva = margenIva;
       this.valUnitario = valUnitario;
    }
   
    public AlmDetaPedidoVentaId getId() {
        return this.id;
    }
    
    public void setId(AlmDetaPedidoVentaId id) {
        this.id = id;
    }
    public BigDecimal getQtyPed() {
        return this.qtyPed;
    }
    
    public void setQtyPed(BigDecimal qtyPed) {
        this.qtyPed = qtyPed;
    }
    public BigDecimal getQtyRem() {
        return this.qtyRem;
    }
    
    public void setQtyRem(BigDecimal qtyRem) {
        this.qtyRem = qtyRem;
    }
    public BigDecimal getValVta() {
        return this.valVta;
    }
    
    public void setValVta(BigDecimal valVta) {
        this.valVta = valVta;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public BigDecimal getQtyfac() {
        return this.qtyfac;
    }
    
    public void setQtyfac(BigDecimal qtyfac) {
        this.qtyfac = qtyfac;
    }
    public String getNumRem() {
        return this.numRem;
    }
    
    public void setNumRem(String numRem) {
        this.numRem = numRem;
    }
    public BigDecimal getDscto() {
        return this.dscto;
    }
    
    public void setDscto(BigDecimal dscto) {
        this.dscto = dscto;
    }
    public BigDecimal getValIva() {
        return this.valIva;
    }
    
    public void setValIva(BigDecimal valIva) {
        this.valIva = valIva;
    }
    public BigDecimal getValDcto() {
        return this.valDcto;
    }
    
    public void setValDcto(BigDecimal valDcto) {
        this.valDcto = valDcto;
    }
    public String getCodTalla() {
        return this.codTalla;
    }
    
    public void setCodTalla(String codTalla) {
        this.codTalla = codTalla;
    }
    public BigDecimal getMargenDcto() {
        return this.margenDcto;
    }
    
    public void setMargenDcto(BigDecimal margenDcto) {
        this.margenDcto = margenDcto;
    }
    public BigDecimal getMargenIva() {
        return this.margenIva;
    }
    
    public void setMargenIva(BigDecimal margenIva) {
        this.margenIva = margenIva;
    }
    public BigDecimal getValUnitario() {
        return this.valUnitario;
    }
    
    public void setValUnitario(BigDecimal valUnitario) {
        this.valUnitario = valUnitario;
    }




}


