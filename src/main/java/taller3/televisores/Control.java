package taller3.televisores;

public class Control {

    static TV tv;

    public void enlazar(TV tv) {
        tv.setControl(this);
        this.tv = tv;
    }

    public void setTv(TV tv) {
        this.enlazar(tv);
    }

    public TV getTv() {
        return tv;
    }

    public void volumenUp() {
        tv.volumenUp();
    }

    public void volumenDown() {
        tv.volumenDown();
    }

    public void canalUp() {
        tv.canalUp();
    }

    public void canalDown() {
        tv.canalDown();
    }

    public void setCanal(int num) {
        tv.setCanal(num);
    }

    public void turnOn() {
        tv.turnOn();
    }

    public void turnOff() {
        tv.turnOff();
    }
}