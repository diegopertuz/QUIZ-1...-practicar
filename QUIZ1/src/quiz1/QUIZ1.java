/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JTextField;

/**
 *
 * @author CBN
 */
public class QUIZ1 {
    double tiempotrabajado, cesantias, prima, vacaciones, intcesantias;
    
    public QUIZ1() {
    }
    
    public String getCesantias(double sueldo){
         cesantias = (sueldo*tiempotrabajado)/365;
         return Double.toString(Math.round(cesantias));
    }
    
    public String getPrima(double sueldo){
        prima =  (sueldo*(tiempotrabajado-180))/180;
        if (prima<0) {
            prima = 0;
            }
        return Double.toString(Math.round(prima));
    }
    public String getVacaciones(double sueldo){
        vacaciones =  ((sueldo/2)*tiempotrabajado)/365;
        return Double.toString(Math.round(vacaciones));
    }
    public String getIntCesantias(double sueldo){
        intcesantias = sueldo*(tiempotrabajado/30)*0.01;
        return Double.toString(Math.round(intcesantias));
    }
    public String getTotal(double sueldo){
        return Double.toString(Math.round(sueldo+cesantias+prima+vacaciones+intcesantias));
    }
    public String mensaje(String nombre, String documento){
        return("<html> El suscrito "+nombre+" identificado con el documento de identidad "+ 
                documento+" se liquida por el valor descrito, quedando a paz y salvo</html>");
    }
    
     public String tiempoTrabajado(String fechaInicio, String fechaFin) throws ParseException{
        //SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
         SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date fechaInicial=dateFormat.parse(fechaInicio);
		Date fechaFinal=dateFormat.parse(fechaFin);
 
		tiempotrabajado=(double) ((fechaFinal.getTime()-fechaInicial.getTime())/86400000);
                return Double.toString(tiempotrabajado);
    }
    
    
   
    
   
}

