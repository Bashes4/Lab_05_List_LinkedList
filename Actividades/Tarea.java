package Actividades;

public class Tarea implements Comparable<Tarea> {
    String descripcion;
    int prioridad;

    public Tarea(String descripcion, int prioridad) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
    }

    @Override
    public String toString() {
        return "Tarea: " + descripcion + " | Prioridad: " + prioridad;
    }

    @Override
    public int compareTo(Tarea otra) {
        return Integer.compare(this.prioridad, otra.prioridad);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Tarea)) return false;
        Tarea otra = (Tarea) obj;
        return descripcion.equals(otra.descripcion) && prioridad == otra.prioridad;
    }
}
