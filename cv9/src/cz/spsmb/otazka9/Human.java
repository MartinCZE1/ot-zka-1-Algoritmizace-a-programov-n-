package cz.spsmb.otazka9;

public class Human {
    public String name;
    public int age;
    public String colorOfEyes;

    public Human() {
    }

    public Human(String name, int age, String colorOfEyes) {
        this.name = name;
        this.age = age;
        this.colorOfEyes = colorOfEyes;
    }

    public static void startMorningRoutine() {

    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", colorOfEyes='" + colorOfEyes + '\'' +
                '}';
    }
}
