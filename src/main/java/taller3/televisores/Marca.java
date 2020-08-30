package taller3.televisores;

public class Marca {
    String name;

    Marca(String arg) {
        this.name = arg;
    }

    public String getNombre() {
        return this.name;
    }

    public void setNombre(String arg) {
        this.name = arg;
    }
}