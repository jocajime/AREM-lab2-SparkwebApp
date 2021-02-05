package edu.escuelaing.arem.util;

import edu.escuelaing.arem.util.LinkedList;
import java.lang.Math;


/**
 * Esta clase efrece algunas funciones de calculo estadistico
 * @author joelc
 */
public class StatCalc {

    /**
     * Funcion para calcular la media de unos valores dados.
     * @param valores
     * @return
     */
    public static Double mean(LinkedList<Double> valores){
        Double suma = 0.0;
        for(Double i: valores){
            suma += i;
        }
        Double resultado = suma/valores.size();
        resultado = Math.round(resultado*100.0)/100.0;
        return resultado;

    }

    /**
     * Funcion para calcular la desviacion estandar de unos valores dados.
     * @param valores
     * @return
     */
    public static Double stddev(LinkedList<Double> valores){
        Double suma = 0.0;
        Double mean = mean(valores);
        for(Double i: valores){
            suma += Math.pow((i - mean),2);
        }
        Double resultado = Math.sqrt(suma / (valores.size() - 1));
        resultado = Math.round(resultado*100.0)/100.0;
        return resultado;
    }

}
