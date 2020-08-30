package taller3.televisores;

public class Marca {
    static String name;

    Marca(String arg) {
        name = arg;
    }

    public String getNombre() {
        return name;
    }

    public void setNombre(String arg) {
        name = arg;
    }
}