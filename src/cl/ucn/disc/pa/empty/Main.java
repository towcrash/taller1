package cl.ucn.disc.pa.empty;

import edu.princeton.cs.stdlib.StdDraw;

import java.awt.*;

/**
 * Programa de una version simplificada del protector de pantalla mystify.
 *
 * @author Fernando Javier Qutzal Vega Flores.
 */
public class Main {

    /**
     * Define el tamanio de la ventana, valores al azar para la posicion de las lineas y la velocidad a la cual se mueven.
     * Compara la posicion de las lineas para que no salgan de la pantalla y reboten dentro de esta, aparte de graficarlas en pantalla.
     *
     */
    public static void main(String[] args) {
        // definir variables del tamanio de la ventana
        double minX = -20.0;
        double maxX = 20.0;
        double minY = -10.0;
        double maxY = 10.0;
        // variables aleatorias de cada punto
        double posicionInicialX = Math.random()*20+1;
        double posicionInicialY = Math.random()*10+1;
        double velocidad = Math.random()*0.05;
        //variables de posicion de cada punto
        double puntoA1X = posicionInicialX;
        double puntoA1Y = posicionInicialY;
        double puntoA2X = posicionInicialX - 5.0;
        double puntoA2Y = posicionInicialY - 5.0;
        double puntoB1X = puntoA1X - 0.5;
        double puntoB1Y = puntoA1Y;
        double puntoB2X = puntoA2X - 0.5;
        double puntoB2Y = puntoA2Y;
        double puntoC1X = puntoB1X - 0.5;
        double puntoC1Y = puntoA1Y;
        double puntoC2X = puntoB2X - 0.5;
        double puntoC2Y = puntoA2Y;
        double puntoD1X = puntoC1X - 0.5;
        double puntoD1Y = puntoA1Y;
        double puntoD2X = puntoC2X - 0.5;
        double puntoD2Y = puntoA2Y;
        double puntoE1X = puntoD1X - 0.5;
        double puntoE1Y = puntoA1Y;
        double puntoE2X = puntoD2X - 0.5;
        double puntoE2Y = puntoA2Y;
        double puntoF1X = puntoE1X - 0.5;
        double puntoF1Y = puntoA1Y;
        double puntoF2X = puntoE2X - 0.5;
        double puntoF2Y = puntoA2Y;
        // variable para diferenciar la funcion de suma o resta
        String sumaA1X = "suma";
        String sumaA1Y = "suma";
        String sumaA2X = "suma";
        String sumaA2Y = "suma";
        String sumaB1X = "suma";
        String sumaB1Y = "suma";
        String sumaB2X = "suma";
        String sumaB2Y = "suma";
        String sumaC1X = "suma";
        String sumaC1Y = "suma";
        String sumaC2X = "suma";
        String sumaC2Y = "suma";
        String sumaD1X = "suma";
        String sumaD1Y = "suma";
        String sumaD2X = "suma";
        String sumaD2Y = "suma";
        String sumaE1X = "suma";
        String sumaE1Y = "suma";
        String sumaE2X = "suma";
        String sumaE2Y = "suma";
        String sumaF1X = "suma";
        String sumaF1Y = "suma";
        String sumaF2X = "suma";
        String sumaF2Y = "suma";
        // se define la escala de la ventana
        StdDraw.setXscale(minX, maxX);
        StdDraw.setYscale(minY, maxY);
        StdDraw.enableDoubleBuffering();
        while (true) {
            if (sumaA1X.equals("suma")) { // revisa si a la variable en X tiene que aumentar
                puntoA1X = MaxXSuma(puntoA1X, velocidad);
                if (puntoA1X >= maxX) {
                    sumaA1X = "resta";
                }
            }else if (sumaA1X.equals("resta")) { // revisa si a la variable en X tiene que disminuir
                puntoA1X = Resta(puntoA1X, velocidad);
                if (puntoA1X <= minX) {
                    sumaA1X = "suma";
                }
            }
            if (sumaA1Y.equals("suma")) { // revisa si a la variable en Y tiene que aumentar
                puntoA1Y = MaxYSuma(puntoA1Y, velocidad);
                if (puntoA1Y >= maxY) {
                    sumaA1Y = "resta";
                }
            }else if (sumaA1Y.equals("resta")) { // revisa si a la variable en Y tiene que disminuir
                puntoA1Y = Resta(puntoA1Y, velocidad);
                if (puntoA1Y <= minY) {
                    sumaA1Y = "suma";
                }
            }
            if (sumaA2X.equals("suma")) {
                puntoA2X = MaxXSuma(puntoA2X, velocidad);
                if (puntoA2X >= maxX) {
                    sumaA2X = "resta";
                }
            }else if (sumaA2X.equals("resta")) {
                puntoA2X = Resta(puntoA2X, velocidad);
                if (puntoA2X <= minX) {
                    sumaA2X = "suma";
                }
            }
            if (sumaA2Y.equals("suma")) {
                puntoA2Y = MaxYSuma(puntoA2Y, velocidad);
                if (puntoA2Y >= maxY) {
                    sumaA2Y = "resta";
                }
            }else if (sumaA2Y.equals("resta")) {
                puntoA2Y = Resta(puntoA2Y, velocidad);
                if (puntoA2Y <= minY) {
                    sumaA2Y = "suma";
                }
            }
            StdDraw.filledCircle(puntoA1X, puntoA1Y, 0.1);
            StdDraw.filledCircle(puntoA2X, puntoA2Y, 0.1);
            StdDraw.line(puntoA1X, puntoA1Y, puntoA2X, puntoA2Y); // grafica los dos puntos y los une con una linea
            StdDraw.setPenColor(Color.RED); // cambia el color de la linea creada a rojo
            // se repite para cada linea
            if (sumaB1X.equals("suma")) {
                puntoB1X = MaxXSuma(puntoB1X, velocidad);
                if (puntoB1X >= maxX) {
                    sumaB1X = "resta";
                }
            }else if (sumaB1X.equals("resta")) {
                puntoB1X = Resta(puntoB1X, velocidad);
                if (puntoB1X <= minX) {
                    sumaB1X = "suma";
                }
            }
            if (sumaB1Y.equals("suma")) {
                puntoB1Y = MaxYSuma(puntoB1Y, velocidad);
                if (puntoB1Y >= maxY) {
                    sumaB1Y = "resta";
                }
            }else if (sumaB1Y.equals("resta")) {
                puntoB1Y = Resta(puntoB1Y, velocidad);
                if (puntoB1Y <= minY) {
                    sumaB1Y = "suma";
                }
            }
            if (sumaB2X.equals("suma")) {
                puntoB2X = MaxXSuma(puntoB2X, velocidad);
                if (puntoB2X >= maxX) {
                    sumaB2X = "resta";
                }
            }else if (sumaB2X.equals("resta")) {
                puntoB2X = Resta(puntoB2X, velocidad);
                if (puntoB2X <= minX) {
                    sumaB2X = "suma";
                }
            }
            if (sumaB2Y.equals("suma")) {
                puntoB2Y = MaxYSuma(puntoB2Y, velocidad);
                if (puntoB2Y >= maxY) {
                    sumaB2Y = "resta";
                }
            }else if (sumaB2Y.equals("resta")) {
                puntoB2Y = Resta(puntoB2Y, velocidad);
                if (puntoB2Y <= minY) {
                    sumaB2Y = "suma";
                }
            }
            StdDraw.filledCircle(puntoB1X, puntoB1Y, 0.1);
            StdDraw.filledCircle(puntoB2X, puntoB2Y, 0.1);
            StdDraw.line(puntoB1X, puntoB1Y, puntoB2X, puntoB2Y);
            StdDraw.setPenColor(Color.BLUE);
            if (sumaC1X.equals("suma")) {
                puntoC1X = MaxXSuma(puntoC1X, velocidad);
                if (puntoC1X >= maxX) {
                    sumaC1X = "resta";
                }
            }else if (sumaC1X.equals("resta")) {
                puntoC1X = Resta(puntoC1X, velocidad);
                if (puntoC1X <= minX) {
                    sumaC1X = "suma";
                }
            }
            if (sumaC1Y.equals("suma")) {
                puntoC1Y = MaxYSuma(puntoC1Y, velocidad);
                if (puntoC1Y >= maxY) {
                    sumaC1Y = "resta";
                }
            }else if (sumaC1Y.equals("resta")) {
                puntoC1Y = Resta(puntoC1Y, velocidad);
                if (puntoC1Y <= minY) {
                    sumaC1Y = "suma";
                }
            }
            if (sumaC2X.equals("suma")) {
                puntoC2X = MaxXSuma(puntoC2X, velocidad);
                if (puntoC2X >= maxX) {
                    sumaC2X = "resta";
                }
            }else if (sumaC2X.equals("resta")) {
                puntoC2X = Resta(puntoC2X, velocidad);
                if (puntoC2X <= minX) {
                    sumaC2X = "suma";
                }
            }
            if (sumaC2Y.equals("suma")) {
                puntoC2Y = MaxYSuma(puntoC2Y, velocidad);
                if (puntoC2Y >= maxY) {
                    sumaC2Y= "resta";
                }
            }else if (sumaC2Y.equals("resta")) {
                puntoC2Y = Resta(puntoC2Y, velocidad);
                if (puntoC2Y <= minY) {
                    sumaC2Y = "suma";
                }
            }
            StdDraw.filledCircle(puntoC1X, puntoC1Y, 0.1);
            StdDraw.filledCircle(puntoC2X, puntoC2Y, 0.1);
            StdDraw.line(puntoC1X, puntoC1Y, puntoC2X, puntoC2Y);
            StdDraw.setPenColor(Color.PINK);
            if (sumaD1X.equals("suma")) {
                puntoD1X = MaxXSuma(puntoD1X, velocidad);
                if (puntoD1X >= maxX) {
                    sumaD1X = "resta";
                }
            }else if (sumaD1X.equals("resta")) {
                puntoD1X = Resta(puntoD1X, velocidad);
                if (puntoD1X <= minX) {
                    sumaD1X = "suma";
                }
            }
            if (sumaD1Y.equals("suma")) {
                puntoD1Y = MaxYSuma(puntoD1Y, velocidad);
                if (puntoD1Y >= maxY) {
                    sumaD1Y = "resta";
                }
            }else if (sumaD1Y.equals("resta")) {
                puntoD1Y = Resta(puntoD1Y, velocidad);
                if (puntoD1Y <= minY) {
                    sumaD1Y = "suma";
                }
            }
            if (sumaD2X.equals("suma")) {
                puntoD2X = MaxXSuma(puntoD2X, velocidad);
                if (puntoD2X >= maxX) {
                    sumaD2X = "resta";
                }
            }else if (sumaD2X.equals("resta")) {
                puntoD2X = Resta(puntoD2X, velocidad);
                if (puntoD2X <= minX) {
                    sumaD2X = "suma";
                }
            }
            if (sumaD2Y.equals("suma")) {
                puntoD2Y = MaxYSuma(puntoD2Y, velocidad);
                if (puntoD2Y >= maxY) {
                    sumaD2Y= "resta";
                }
            }else if (sumaD2Y.equals("resta")) {
                puntoD2Y = Resta(puntoD2Y, velocidad);
                if (puntoD2Y <= minY) {
                    sumaD2Y = "suma";
                }
            }
            StdDraw.filledCircle(puntoD1X, puntoD1Y, 0.1);
            StdDraw.filledCircle(puntoD2X, puntoD2Y, 0.1);
            StdDraw.line(puntoD1X, puntoD1Y, puntoD2X, puntoD2Y);
            StdDraw.setPenColor(Color.ORANGE);
            if (sumaE1X.equals("suma")) {
                puntoE1X = MaxXSuma(puntoE1X, velocidad);
                if (puntoE1X >= maxX) {
                    sumaE1X = "resta";
                }
            }else if (sumaE1X.equals("resta")) {
                puntoE1X = Resta(puntoE1X, velocidad);
                if (puntoE1X <= minX) {
                    sumaE1X = "suma";
                }
            }
            if (sumaE1Y.equals("suma")) {
                puntoE1Y = MaxYSuma(puntoE1Y, velocidad);
                if (puntoE1Y >= maxY) {
                    sumaE1Y = "resta";
                }
            }else if (sumaE1Y.equals("resta")) {
                puntoE1Y = Resta(puntoE1Y, velocidad);
                if (puntoE1Y <= minY) {
                    sumaE1Y = "suma";
                }
            }
            if (sumaE2X.equals("suma")) {
                puntoE2X = MaxXSuma(puntoE2X, velocidad);
                if (puntoE2X >= maxX) {
                    sumaE2X = "resta";
                }
            }else if (sumaE2X.equals("resta")) {
                puntoE2X = Resta(puntoE2X, velocidad);
                if (puntoE2X <= minX) {
                    sumaE2X = "suma";
                }
            }
            if (sumaE2Y.equals("suma")) {
                puntoE2Y = MaxYSuma(puntoE2Y, velocidad);
                if (puntoE2Y >= maxY) {
                    sumaE2Y= "resta";
                }
            }else if (sumaE2Y.equals("resta")) {
                puntoE2Y = Resta(puntoE2Y, velocidad);
                if (puntoE2Y <= minY) {
                    sumaE2Y = "suma";
                }
            }
            StdDraw.filledCircle(puntoE1X, puntoE1Y, 0.1);
            StdDraw.filledCircle(puntoE2X, puntoE2Y, 0.1);
            StdDraw.line(puntoE1X, puntoE1Y, puntoE2X, puntoE2Y);
            StdDraw.setPenColor(Color.BLACK);
            if (sumaF1X.equals("suma")) {
                puntoF1X = MaxXSuma(puntoF1X, velocidad);
                if (puntoF1X >= maxX) {
                    sumaF1X = "resta";
                }
            }else if (sumaF1X.equals("resta")) {
                puntoF1X = Resta(puntoF1X, velocidad);
                if (puntoF1X <= minX) {
                    sumaF1X = "suma";
                }
            }
            if (sumaF1Y.equals("suma")) {
                puntoF1Y = MaxYSuma(puntoF1Y, velocidad);
                if (puntoF1Y >= maxY) {
                    sumaF1Y = "resta";
                }
            }else if (sumaF1Y.equals("resta")) {
                puntoF1Y = Resta(puntoF1Y, velocidad);
                if (puntoF1Y <= minY) {
                    sumaF1Y = "suma";
                }
            }
            if (sumaF2X.equals("suma")) {
                puntoF2X = MaxXSuma(puntoF2X, velocidad);
                if (puntoF2X >= maxX) {
                    sumaF2X = "resta";
                }
            }else if (sumaF2X.equals("resta")) {
                puntoF2X = Resta(puntoF2X, velocidad);
                if (puntoF2X <= minX) {
                    sumaF2X = "suma";
                }
            }
            if (sumaF2Y.equals("suma")) {
                puntoF2Y = MaxYSuma(puntoF2Y, velocidad);
                if (puntoF2Y >= maxY) {
                    sumaF2Y= "resta";
                }
            }else if (sumaF2Y.equals("resta")) {
                puntoF2Y = Resta(puntoF2Y, velocidad);
                if (puntoF2Y <= minY) {
                    sumaF2Y = "suma";
                }
            }
            StdDraw.filledCircle(puntoF1X, puntoF1Y, 0.1);
            StdDraw.filledCircle(puntoF2X, puntoF2Y, 0.1);
            StdDraw.line(puntoF1X, puntoF1Y, puntoF2X, puntoF2Y);
            StdDraw.setPenColor(Color.GREEN);
            StdDraw.show(); // mostrar en pantalla
            StdDraw.clear(); // borra lo que hay en pantalla
        }
    }

    private static double MaxXSuma(double v, double v1) { //metodo para aumentar el valor de X
        double maxX = 20.0;
        if (v < maxX) {
            v = v + v1;
        }
        return v;
    }
    private static double Resta(double v, double v1) { // metodo para disminuir el valor de la variable
        v = v - v1;
        return v;
    }

    private static double MaxYSuma(double v, double v1) { // metodo para aumentar el valor de Y
        double maxY = 10.0;
        if (v < maxY) {
            v = v + v1;
        }
        return v;
    }
}
