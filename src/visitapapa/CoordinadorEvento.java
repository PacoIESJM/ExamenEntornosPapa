/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package visitapapa;

/**
 *
 * @author Pacoep
 */


public class CoordinadorEvento {

    private String nombre;
    private int id;
    private Especialidad especialidad;

    public CoordinadorEvento(String nombre, int id, Especialidad especialidad) {
        this.nombre = nombre;
        this.id = id;
        this.especialidad = especialidad;
    }

    public int getId() {
        return id;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public String getNombre() {
        return nombre;
    }
}

