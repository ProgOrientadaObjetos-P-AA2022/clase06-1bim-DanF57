/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteuno;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        // objeto que permite ingresar datos por teclado
        Scanner entrada = new Scanner(System.in);

        // varibles para almacenar valores ingresados por teclado
        String nombreHospital;
        String ciudadDeHospital;
        int numeroDeCamas;
        int numeroDeDoctores;
        double presupuestoAnio;
        int opcion;

        // Proceso de discriminación en función de la opción que 
        // selecciona el usuario
        System.out.println("Que tipo de hospital desea ingesar\nOpción 1"
                + "\nOpción 2\nOpción 3");
        opcion = entrada.nextInt();

        entrada.nextLine(); // limpiar el buffer 

        // Uso de condicionales compuestos
        if (opcion == 1) {
            // Ingreso de datos para el tipo seleccionado
            System.out.println("Ingrese nombre del hospital");
            nombreHospital = entrada.nextLine();
            System.out.println("Ingrese número de camas del hospital");
            numeroDeCamas = entrada.nextInt();
            System.out.println("Ingrese número de doctores del hospital");
            numeroDeDoctores = entrada.nextInt();
            System.out.println("Ingrese presupuesto anual del hospital");
            presupuestoAnio = entrada.nextDouble();

            // se procede a crear el objeto, haciendo uso del constructor
            // que corresponda.
            Hospital hosp1 = new Hospital(nombreHospital, numeroDeCamas, 
                    numeroDeDoctores,
                    presupuestoAnio);
                   System.out.printf("%s", hosp1);
            
        } else {
            if (opcion == 2) {
                // Ingreso de datos para el tipo seleccionado
                System.out.println("Ingrese nombre del hospital");
                nombreHospital = entrada.nextLine();
                System.out.println("Ingrese número de camas del hospital");
                numeroDeCamas = entrada.nextInt();
                System.out.println("Ingrese número de doctores del hospital");
                numeroDeDoctores = entrada.nextInt();
                // se procede a crear el objeto, haciendo uso del constructor
                // que corresponda.
                Hospital hosp2 = new Hospital(nombreHospital, numeroDeCamas, 
                        numeroDeDoctores);

                System.out.printf("%s", hosp2);
            } else {
                if (opcion == 3) {
                    // Ingreso de datos para el tipo seleccionado
                    System.out.println("Ingrese nombre del hospital");
                    nombreHospital = entrada.nextLine();
                    System.out.println("Ingrese ciudad del hospital");
                    ciudadDeHospital = entrada.nextLine();
                    System.out.println("Ingrese número de camas del hospital");
                    numeroDeCamas = entrada.nextInt();
                    System.out.println("Ingrese número de doctores del hospital");
                    numeroDeDoctores = entrada.nextInt();
                    System.out.println("Ingrese presupuesto anual del hospital");
                    presupuestoAnio = entrada.nextDouble();
                    // se procede a crear el objeto, haciendo uso del constructor
                    // que corresponda.
                    Hospital hosp3 = new Hospital(nombreHospital, 
                            ciudadDeHospital, numeroDeCamas, 
                            numeroDeDoctores,
                            presupuestoAnio);

                    System.out.printf("%s", hosp3);
                } else {
                    System.out.println("Opción fuera de rango");
                }
            }
        }
    }

}
