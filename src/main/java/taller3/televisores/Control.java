package taller3.televisores;

public class Control {

    private TV tv;

    public void enlazar(TV arg) {
        this.tv = arg;
        this.tv.setControl(this);
    }

    public void setTv(TV arg) {
        this.enlazar(arg);
    }

    public TV getTv() {
        return this.tv;
    }

    public void volumenUp() {
        this.tv.volumenUp();
    }

    public void volumenDown() {
        this.tv.volumenDown();
    }

    public void canalUp() {
        this.tv.canalUp();
    }

    public void canalDown() {
        this.tv.canalDown();
    }

    public void setCanal(int num) {
        this.tv.setCanal(num);
    }

    public void turnOn() {
        this.tv.turnOn();
    }

    public void turnOff() {
        this.tv.turnOff();
    }
}