package cl.ucn.disc.pa.empty;

import edu.princeton.cs.stdlib.StdDraw;

import java.awt.*;
import java.util.Random;

public class SalvaPantallasMystify {

    /**
     * Clase que genera 6 lineas que rebotaran en el lienzo con distintos colores
     *
     * @author Bruce Munizaga.
     */
    public static void main(String[] args) {

        // Rango del dibujo
        double min = -1.0;
        double max = 1.0;


        // definicion de la escala del lienzo del dibujo
        StdDraw.setXscale(min, max);
        StdDraw.setYscale(min, max);
        // evitar el parpadeo de la pantalla
        StdDraw.enableDoubleBuffering();

        // arreglo que contiene los colores que se cambiaran en las lineas
        Color[] colores = {Color.RED,Color.BLUE,Color.PINK,Color.GREEN,Color.ORANGE,Color.YELLOW};

        // generacion de un par ordenado (x, y) de la primera linea
        double x0 = min + (max - min) * definirPosicionInicial();
        double y0 = min + (max - min) * definirPosicionInicial();
        double x1 = min + (max - min) * definirPosicionInicial();
        double y1 = min + (max - min) * definirPosicionInicial();

        // generacion de la segunda linea con base a la primera
        double x2 = x0 - 0.01;
        double y2 = y0 + 0.02;
        double x3 = x1 + 0.01;
        double y3 = y1 - 0.02;

        // generacion de la tercera linea con base a la primera
        double x4 = x0 - 0.03;
        double y4 = y0 + 0.04;
        double x5 = x1 + 0.03;
        double y5 = y1 - 0.04;

        // generacion de la cuarta linea con base a la primera
        double x6 = x0 - 0.05;
        double y6 = y0 + 0.06;
        double x7 = x1 + 0.05;
        double y7 = y1 - 0.06;

        // generacion de la quinta linea con base a la primera
        double x8 = x0 - 0.07;
        double y8 = y0 + 0.08;
        double x9 = x1 + 0.07;
        double y9 = y1 - 0.08;

        // generacion de la sexta linea con base a la primera
        double x10 = x0 - 0.09;
        double y10 = y0 + 0.1;
        double x11 = x1 + 0.09;
        double y11 = y1 - 0.1;

        // parametros de la primera linea
        double vx = definirVelocidad();
        double vx1 = definirVelocidad();
        double vy = definirVelocidad();
        double vy1 = definirVelocidad();

        // parametros de la segunda linea con base a la primera
        double vx2 = vx;
        double vx3 = vx1;
        double vy2 = vy;
        double vy3 = vy1;

        // parametros de la tercera linea con base a la primera
        double vx4 = vx;
        double vx5 = vx1;
        double vy4 = vy;
        double vy5 = vy1;

        // parametros de la cuarta linea con base a la primera
        double vx6 = vx;
        double vx7 = vx1;
        double vy6 = vy;
        double vy7 = vy1;

        // parametros de la quinta linea con base a la primera
        double vx8 = vx;
        double vx9 = vx1;
        double vy8 = vy;
        double vy9 = vy1;

        // parametros de la sexta linea con base a la primera
        double vx10 = vx;
        double vx11 = vx1;
        double vy10 = vy;
        double vy11 = vy1;

        // ciclo infinito para modificar las velocidades con base a las colisiones de la pantalla
        while (true){
            if (Math.abs(y0 + vy) > 1.0){ // parte del ciclo que afectara a los extremos de la primera linea
                vy = -vy;
            }
            if (Math.abs(y0 + vy) < 1.0){
                vy = +vy;
            }
            if (Math.abs(x0 + vx) > 1.0){
                vx = -vx;
            }
            if (Math.abs(x0 + vx) < 1.0){
                vx = +vx;
            }
            if (Math.abs(y1 + vy1) > 1.0){
                vy1 = -vy1;
            }
            if (Math.abs(y1 + vy1) < 1.0){
                vy1 = +vy1;
            }
            if (Math.abs(x1 + vx1) > 1.0){
                vx1 = -vx1;
            }
            if (Math.abs(x1 + vx1) < 1.0){
                vx1 = +vx1;
            }
            if (Math.abs(y2 + vy2) > 1.0){ // parte del ciclo que afectara a los extremos de la segunda linea
                vy2 = -vy2;
            }
            if (Math.abs(y2 + vy2) < 1.0){
                vy2 = +vy2;
            }
            if (Math.abs(x2 + vx2) > 1.0){
                vx2 = -vx2;
            }
            if (Math.abs(x2 + vx2) < 1.0){
                vx2 = +vx2;
            }
            if (Math.abs(y3 + vy3) > 1.0){
                vy3 = -vy3;
            }
            if (Math.abs(y3 + vy3) < 1.0){
                vy3 = +vy3;
            }
            if (Math.abs(x3 + vx3) > 1.0){
                vx3 = -vx3;
            }
            if (Math.abs(x3 + vx3) < 1.0){
                vx3 = +vx3;
            }
            if (Math.abs(y4 + vy4) > 1.0){ // parte del ciclo que afectara a los extremos de la tercera linea
                vy4 = -vy4;
            }
            if (Math.abs(y4 + vy4) < 1.0){
                vy4 = +vy4;
            }
            if (Math.abs(x4 + vx4) > 1.0){
                vx4 = -vx4;
            }
            if (Math.abs(x4 + vx4) < 1.0){
                vx4 = +vx4;
            }
            if (Math.abs(y5 + vy5) > 1.0){
                vy5 = -vy5;
            }
            if (Math.abs(y5 + vy5) < 1.0){
                vy5 = +vy5;
            }
            if (Math.abs(x5 + vx5) > 1.0){
                vx5 = -vx5;
            }
            if (Math.abs(x5 + vx5) < 1.0){
                vx5 = +vx5;
            }
            if (Math.abs(y6 + vy6) > 1.0){ // parte del ciclo que afectara a los extremos de la cuarta linea
                vy6 = -vy6;
            }
            if (Math.abs(y6 + vy6) < 1.0){
                vy6 = +vy6;
            }
            if (Math.abs(x6 + vx6) > 1.0){
                vx6 = -vx6;
            }
            if (Math.abs(x6 + vx6) < 1.0){
                vx6 = +vx6;
            }
            if (Math.abs(y7 + vy7) > 1.0){
                vy7 = -vy7;
            }
            if (Math.abs(y7 + vy7) < 1.0){
                vy7 = +vy7;
            }
            if (Math.abs(x7 + vx7) > 1.0){
                vx7 = -vx7;
            }
            if (Math.abs(x7 + vx7) < 1.0){
                vx7 = +vx7;
            }
            if (Math.abs(y8 + vy8) > 1.0){ // parte del ciclo que afectara a los extremos de la quinta linea
                vy8 = -vy8;
            }
            if (Math.abs(y8 + vy8) < 1.0){
                vy8 = +vy8;
            }
            if (Math.abs(x8 + vx8) > 1.0){
                vx8 = -vx8;
            }
            if (Math.abs(x8 + vx8) < 1.0){
                vx8 = +vx8;
            }
            if (Math.abs(y9 + vy9) > 1.0){
                vy9 = -vy9;
            }
            if (Math.abs(y9 + vy9) < 1.0){
                vy9 = +vy9;
            }
            if (Math.abs(x9 + vx9) > 1.0){
                vx9 = -vx9;
            }
            if (Math.abs(x9 + vx9) < 1.0){
                vx9 = +vx9;
            }
            if (Math.abs(y10 + vy10) > 1.0){ // parte del ciclo que afectara a los extremos de la sexta linea
                vy10 = -vy10;
            }
            if (Math.abs(y10 + vy10) < 1.0){
                vy10 = +vy10;
            }
            if (Math.abs(x10 + vx10) > 1.0){
                vx10 = -vx10;
            }
            if (Math.abs(x10 + vx10) < 1.0){
                vx10 = +vx10;
            }
            if (Math.abs(y11 + vy11) > 1.0){
                vy11 = -vy11;
            }
            if (Math.abs(y11 + vy11) < 1.0){
                vy11 = +vy11;
            }
            if (Math.abs(x11 + vx11) > 1.0){
                vx11 = -vx11;
            }
            if (Math.abs(x11 + vx11) < 1.0){
                vx11 = +vx11;
            }

            // actualizacion de las posiciones de las lineas mediante las colisiones en el lienzo
            x0 += vx; // actualizacion de los cuatro puntos de la primera linea
            x1 += vx1;
            y0 += vy;
            y1 += vy1;

            x2 += vx2; // actualizacion de los cuatro puntos de la seegunda linea
            x3 += vx3;
            y2 += vy2;
            y3 += vy3;

            x4 += vx4; // actualizacion de los cuatro puntos de la tercera linea
            x5 += vx5;
            y4 += vy4;
            y5 += vy5;

            x6 += vx6; // actualizacion de los cuatro puntos de la cuarta linea
            x7 += vx7;
            y6 += vy6;
            y7 += vy7;

            x8 += vx8; // actualizacion de los cuatro puntos de la quinta linea
            x9 += vx9;
            y8 += vy8;
            y9 += vy9;

            x10 += vx10; // actualizacion de los cuatro puntos de la sexta linea
            x11 += vx11;
            y10 += vy10;
            y11 += vy11;


            // limpiar el fondo del lienzo
            StdDraw.clear();


            // impresion de las lineas en el lienzo
            StdDraw.setPenColor(colores[(int)(Math.random() * colores.length)]);
            StdDraw.line(x0,y0,x1,y1); // impresion de la primera linea
            StdDraw.setPenColor(colores[(int)(Math.random() * colores.length)]);
            StdDraw.line(x2,y2,x3,y3); // impresion de la segunda linea
            StdDraw.setPenColor(colores[(int)(Math.random() * colores.length)]);
            StdDraw.line(x4,y4,x5,y5); // impresion de la tercera linea
            StdDraw.setPenColor(colores[(int)(Math.random() * colores.length)]);
            StdDraw.line(x6,y6,x7,y7); // impresion de la cuarta linea
            StdDraw.setPenColor(colores[(int)(Math.random() * colores.length)]);
            StdDraw.line(x8,y8,x9,y9); // impresion de la quinta linea
            StdDraw.setPenColor(colores[(int)(Math.random() * colores.length)]);
            StdDraw.line(x10,y10,x11,y11); // impresion de la sexta linea

            // Mostrar la pantalla y espera
            StdDraw.show();
        }
    }

    /**
     *
     * funcion que definira la velocidad con que iniciaran los puntos de las lineas
     */
    private static double definirVelocidad() {

        // llama a la libreria random
        Random random = new Random();

        // generará un numero aleatorio entre 0.001 y 0.002 y devolvera el valor
        return 0.001 + (0.002 - 0.001) * random.nextDouble();
    }

    /**
     *
     * funcion que definira la posicion inicial con que iniciaran los puntos de las lineas
     */
    private static double definirPosicionInicial() {
        // llama a la libreria random
        Random random = new Random();

        // generara un numero aleatorio entre 0.2 y 0.8 y devolvera el valor
        return 0.2 + (0.8 - 0.2) * random.nextDouble();
    }
}

