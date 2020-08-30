package taller3.televisores;

public class TV {
    private Marca marca;
    private int canal = 1;
    private int precio = 500;
    private boolean estado;
    private int volumen = 1;
    private Control control;
    static int numTV;

    public static void setnumTV(int num) {
        numTV = num + numTV;
    }

    public static int getnumTV() {
        return numTV;
    }

    public TV(Marca marc, boolean status) {
        this.marca = marc;
        this.estado = status;
        TV.setnumTV(1);
    }

    public void turnOn() {
        if (this.estado == false) {
            this.estado = true;
        }
    }

    public void turnOff() {
        if (this.estado == true) {
            this.estado = false;
        }
    }

    public void canalUp() {
        if (this.estado == true && this.canal < 120) {
            this.canal++;
        }
    }

    public void canalDown() {
        if (this.estado == true && this.canal > 1) {
            this.canal--;
        }
    }

    public void volumenUp() {
        if (this.estado == true && this.volumen < 7) {
            this.volumen++;
        }
    }

    public void volumenDown() {
        if (this.estado == true && this.volumen > 0) {
            this.volumen--;
        }
    }

    public boolean getEstado() {
        return this.estado;
    }

    public Marca getMarca() {
        return this.marca;
    }

    public int getCanal() {
        return this.canal;
    }

    public int getVolumen() {
        return this.volumen;
    }

    public int getPrecio() {
        return this.precio;
    }

    public void setMarca(String arg) {
        this.marca.setNombre(arg);
    }

    public void setPrecio(int num) {
        this.precio = num;
    }

    public void setVolumen(int num) {
        if (this.estado == true && num >= 0 && num <= 7) {
            this.volumen = num;
        }
    }

    public void setCanal(int num) {
        if (this.estado == true && num <= 120 && num >= 1) {
            this.canal = num;
        }
    }

    public void setControl(Control ct) {
        // metodo para agregar control
        this.control = ct;
    }

    public Control getControl() {
        return control;
    }

}