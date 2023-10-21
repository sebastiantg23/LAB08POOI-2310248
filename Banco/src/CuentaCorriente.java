/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alumno
 */
public class CuentaCorriente {
    private double tasaInteresAnual=0.02;
    private double COMISION_FIJA=2.0;
    private int maxRetiro;
    
    //Constructor

    public CuentaCorriente(int maxRetiro) {
        this.maxRetiro = maxRetiro;
    }
    


    public int getMaxRetiro() {
        return maxRetiro;
    }

    public void setMaxRetiro(int maxRetiro) {
        this.maxRetiro = maxRetiro;
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" + "tasaInteresAnual=" + tasaInteresAnual + ", COMISION_FIJA=" + COMISION_FIJA + ", maxRetiro=" + maxRetiro + '}';
    }
    
    
    
}
