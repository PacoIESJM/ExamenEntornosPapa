/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package visitapapa;

/**
 *
 * @author Pacoep
 */
import java.util.Scanner;

public class VisitaPapa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaración de variables
        Scanner reader = new Scanner(System.in);
        CoordinadorEvento c1 = new CoordinadorEvento("Saturnino", 1, Especialidad.SEGURIDAD);
        CoordinadorEvento c2 = new CoordinadorEvento("Ruperta", 2, Especialidad.PROTOCOLO);
    }

}
