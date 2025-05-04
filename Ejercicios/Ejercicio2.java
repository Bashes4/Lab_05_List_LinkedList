package Ejercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ejercicio2 {
    public static <T> List<T> invertirLista(List<T> lista) {
        List<T> invertida = new ArrayList<>(lista);
        Collections.reverse(invertida);
        return invertida;
    }
}
