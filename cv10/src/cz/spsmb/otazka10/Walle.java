package cz.spsmb.otazka10;

public class Walle implements Robot {
    @Override
    public void move() {
        System.out.println("Waffle is moving");
    }

    @Override
    public void work(int a) {
        System.out.println("Waffle is working " + a);
    }

    @Override
    public void turnOn() {
        System.out.println("Waffle is on");
    }

    @Override
    public void turnOff() {
        System.out.println("Waffle is off");
    }
}