package com.codigo.listadopersonasappsp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Persona {
    private int id;
    private String nombre;
    private String tel;
    private String email;
    private static int numeroPersonas=0;

    public Persona() {
        this.id = id = ++Persona.numeroPersonas;
    }

    public Persona(String nombre, String tel, String email) {
        this();
        this.nombre = nombre;
        this.tel = tel;
        this.email = email;
    }
    @Override
    public String toString() {
        return "Persona@" + Integer.toHexString(System.identityHashCode(this));
    }

    public static void main(String[] args) {
        Persona persona = new Persona("Juan Perez", "55555","Juan@hotmail.com");
        System.out.println(persona);
    }
}
