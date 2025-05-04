package Ejercicios;

import java.util.List;

public class Ejercicio1 {
    public static <T> boolean buscarElemento(List<T> lista, T valor) {
        return lista.contains(valor);
    }
}
