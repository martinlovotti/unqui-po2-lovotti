package ar.unq.po2.CompositeEjercito;

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class Mapa {
    private String nombre;
    private List<Integer> puntos;

    public Mapa(String n) {
        this.nombre = n;
        this.puntos = new ArrayList<>(Collections.nCopies(10, 0));
    }

    // Permite consultar el valor en una posición
    public int getPunto(int x) {
        return puntos.get(x);
    }

    // Permite modificar el valor en una posición
    public void setPunto(int x, int valor) {
        puntos.set(x, valor);
    }

    // (Opcional) Para imprimir el mapa
    public void mostrarMapa() {
        System.out.println(puntos);
    }
}