/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alumno
 */
public class CuentaCTS extends CuentaBancaria{
    private double tasaInteresAnual=0.07;
    private double puntos;
    
    //Constructor

    public CuentaCTS(double puntos, String numeroCuenta, String descripcionCuenta, String cuentaCCI) {
        super(numeroCuenta, descripcionCuenta, cuentaCCI);
        this.puntos = puntos;
    }

    
    

    public double getPuntos() {
        return puntos;
    }

    public void setPuntos(double puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return "CuentaCTS{" + "tasaInteresAnual=" + tasaInteresAnual + ", puntos=" + puntos + '}';
    }
    
    
}
