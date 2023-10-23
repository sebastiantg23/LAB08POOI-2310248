/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author JESSICA
 */
public class CuentaSueldo extends CuentaAhorro{
    
    private String nombreEmpresa;
    
    //constructor

    public CuentaSueldo(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }
    

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    @Override
    public String toString() {
        return "CuentaSueldo{" + "nombreEmpresa=" + nombreEmpresa + '}';
    }

    
    
    
    
    
}