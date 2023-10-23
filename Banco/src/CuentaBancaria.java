/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nayeli
 */
public class CuentaBancaria {
    private String numeroCuenta;
    private String descripcionCuenta;
    private String cuentaCCI;
    private Double saldoDisponible;
    private MovimientoCuenta movimientos[];
    private String estado;
    
    //constructor

    public CuentaBancaria(String numeroCuenta, String descripcionCuenta, String cuentaCCI) {
        this.numeroCuenta = numeroCuenta;
        this.descripcionCuenta = descripcionCuenta;
        this.cuentaCCI = cuentaCCI;
    }
    
    
    
    
    public void calcularInteresMensual(){
    
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getDescripcionCuenta() {
        return descripcionCuenta;
    }

    public void setDescripcionCuenta(String descripcionCuenta) {
        this.descripcionCuenta = descripcionCuenta;
    }

    public String getCuentaCCI() {
        return cuentaCCI;
    }

    public void setCuentaCCI(String cuentaCCI) {
        this.cuentaCCI = cuentaCCI;
    }

    public Double getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(Double saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }

    public MovimientoCuenta[] getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(MovimientoCuenta[] movimientos) {
        this.movimientos = movimientos;
    }


    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "numeroCuenta=" + numeroCuenta + ", descripcionCuenta=" + descripcionCuenta + ", cuentaCCI=" + cuentaCCI + ", saldoDisponible=" + saldoDisponible + ", movimientos=" + movimientos + ", estado=" + estado + '}';
    }
    
}
