package model;

public class Usuario {

    public String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public boolean seLlama(String nombre) {
        return this.nombre == nombre;
    }
}
