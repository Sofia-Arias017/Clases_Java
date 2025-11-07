package com.example;

// Crea un programa que diga si un numero es par o no 
public class Condicionales {
    int input = 11;
    public void esPar() {
        if (input % 2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero no es par");
        }
    }


    public static void diaSemana() {
            int dia = 3;
            switch (dia) {
                case 1:
                    System.out.println("Lunes");
                    break;
                case 2:
                    System.out.println("Martes");
                    break;
                case 3:
                    System.out.println("Miercoles");
                    break;
                case 4:
                    System.out.println("Jueves");
                    break;
                case 5:
                    System.out.println("Viernes");
                    break;
                case 6:
                    System.out.println("Sabado");
                    break;
                case 7:
                    System.out.println("Domingo");
                    break;
                default:
                    System.out.println("Dia no valido");
                    break;
        }
    }

    // COMPRUEBA SI UNA CADENA DE TEXTO CONTIENE UNA PALABRA 

    public boolean estaLaPalabra(String cadena, 
        String palabra) {
        return cadena.contains(palabra);
    }
    // CONTAINS ES UN METODO QUE DEVUELVE TRUE O FALSE

    // Muestra la LONGITUD de la cadena de texto
    public int longitudDeText(String cadena) {
        return cadena.length();
    }


} 