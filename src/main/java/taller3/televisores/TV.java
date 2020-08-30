package taller3.televisores;

public class TV {
    Marca marca;
    int canal = 1;
    int precio = 500;
    boolean estado;
    int volumen = 1;
    Control control;
    private int numTV;

    TV(Marca marc, boolean status) {
        this.marca = marc;
        this.estado = status;
        numTV++;
    }

    public void turnOn() {
        if (estado == false) {
            estado = true;
        }
    }

    public void turnOff() {
        if (estado == true) {
            estado = false;
        }
    }

    public void canalUp() {
        if (estado == true && canal < 120) {
            canal++;
        }
    }

    public void canalDown() {
        if (estado == true && canal > 1) {
            canal--;
        }
    }

    public void volumenUp() {
        if (estado == true && volumen < 7) {
            volumen++;
        }
    }

    public void volumenDown() {
        if (estado == true && volumen > 0) {
            volumen--;
        }
    }

    public boolean getEstado() {
        return estado;
    }

    public Marca getMarca() {
        return marca;
    }

    public int getCanal() {
        return canal;
    }

    public int getVolumen() {
        return volumen;
    }

    public int getPrecio() {
        return precio;
    }

    public void setMarca(String arg) {
        marca.setNombre(arg);
    }

    public void setPrecio(int num) {
        precio = num;
    }

    public void setVolumen(int num) {
        if (estado == true) {
            volumen = num;
        }
    }

    public void setCanal(int num) {
        if (estado == true) {
            canal = num;
        }
    }

    public void setControl(Control ct) {
        // metodo para agregar control
        control = ct;
    }

}