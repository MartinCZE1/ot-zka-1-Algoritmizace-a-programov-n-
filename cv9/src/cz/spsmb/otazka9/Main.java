package cz.spsmb.otazka9;

public class Main {
    public static void main(String[] args) {
        Woman woman = new Woman("Just�na", 79, "Modr�");
        Man man = new Man("Pepa", 48, "Hn�d�");

        System.out.println("Rann� rutina mu�e " + man + ": ");
        man.startMorningRoutine();

        System.out.println();

        System.out.println("Rann� rutina �eny " + woman + ": ");
        woman.startMorningRoutine();
    }
}
