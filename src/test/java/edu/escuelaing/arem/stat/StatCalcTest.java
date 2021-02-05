package edu.escuelaing.arem.stat;

import edu.escuelaing.arem.util.*;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatCalcTest {

    @Test
    public void testMean() {
        System.out.println("mean");
        LinkedList<Double> valores = new LinkedList<>();
        valores.add(160.0);valores.add(591.0);valores.add(114.0);valores.add(229.0);valores.add(230.0);
        valores.add(270.0);valores.add(128.0);valores.add(1657.0);valores.add(624.0);valores.add(1503.0);
        Double resultadoEsperado = 550.6;
        Double resultado = StatCalc.mean(valores);
        assertEquals(resultadoEsperado,resultado);
    }

    @Test
    public void testStddev() {
        System.out.println("stddev");
        LinkedList<Double> valores = new LinkedList<>();
        valores.add(160.0);valores.add(591.0);valores.add(114.0);valores.add(229.0);valores.add(230.0);
        valores.add(270.0);valores.add(128.0);valores.add(1657.0);valores.add(624.0);valores.add(1503.0);
        Double resultadoEsperado = 572.03;
        Double resultado = StatCalc.stddev(valores);;
        assertEquals(resultadoEsperado,resultado);
    }
}
