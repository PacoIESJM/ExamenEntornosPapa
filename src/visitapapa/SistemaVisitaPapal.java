/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visitapapa;

import java.util.Scanner;

/**
 *
 * @author Pacoep
 */
public class SistemaVisitaPapal {

    public static CoordinadorEvento identificar(
            CoordinadorEvento coordinador,
            Scanner sc) {

        int intentos = 0;

        while (intentos < 5) {

            System.out.print("Introduzca ID para reconocimiento facial: ");
            int idIntroducido = sc.nextInt();

            if (idIntroducido == coordinador.getId()) {
                System.out.println("Identificación correcta.");
                return coordinador;
            }

            intentos++;
            System.out.println("Error de identificación.");
        }

        System.out.println("Máximo de intentos alcanzado.");
        return null;
    }

    public static void contactarCNC() {
        System.out.println("Conectando con el CNC...");
        System.out.println("Consulta enviada.");
        System.out.println("Respuesta recibida: Información actualizada.");
    }
}