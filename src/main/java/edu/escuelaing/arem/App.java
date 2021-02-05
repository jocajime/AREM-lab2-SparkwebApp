package edu.escuelaing.arem;
import static spark.Spark.*;
import edu.escuelaing.arem.util.*;
import spark.Request;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        port(getPort());
        get("/Calc", (request, response) -> basePage());
        get("/Results",(request, response) -> resultado(request));
    }

    private static String basePage(){
        return "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Calculadora Stat</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<center>\n" +
                "<h1 style=\"color: red\">BIENVENIDOS</h1>\n" +
                "<h4>Escriba los datos divididos por \";\" luego oprima calcular para obetener los resultados</h4>\n" +
                "<form action=\"/Results\"><input type=\"text\" name=\"datos\"></br><input type=\"submit\" name=\"inputDatos\" value=\"Calcular\"></form>\n" +
                "</center>\n" +
                "</body>\n" +
                "\n" +
                "</html>";
    }

    private static String resultado(Request request) {
        List<String> datosS = new ArrayList<String>(Arrays.asList(request.queryParams("datos").split(";")));
        LinkedList<Double> datosD = new LinkedList<Double>();
        for(String dato:datosS){ datosD.add(Double.parseDouble(dato));}
        return basePage() + "<center><h3>Para los datos: "+ request.queryParams("datos")+ "</br> La media es: " + StatCalc.mean(datosD) +"</br> la desviacion estandar es: "+StatCalc.stddev(datosD)+"<h3/></center>";
    }


    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; //returns default port if heroku-port isn't set (i.e. on localhost)
    }
}
