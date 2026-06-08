/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visitapapa;

/**
 *
 * @author Pacoep
 */
public class ActoPapal {

    private String nombreActo;

    public ActoPapal(String nombreActo) {
        this.nombreActo = nombreActo;
    }

    public void publicarActo() {
        System.out.println("Publicando acto en la web oficial...");
        System.out.println("Enviando información a medios acreditados...");
        System.out.println("Acto publicado correctamente.");
    }
}
