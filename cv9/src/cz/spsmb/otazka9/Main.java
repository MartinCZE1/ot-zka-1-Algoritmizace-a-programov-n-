package cz.spsmb.otazka9;

public class Main {
    public static void main(String[] args) {
        Woman woman = new Woman("Justýna", 79, "Modrá");
        Man man = new Man("Pepa", 48, "Hnìdá");

        System.out.println("Ranní rutina muže " + man + ": ");
        man.startMorningRoutine();

        System.out.println();

        System.out.println("Ranní rutina ženy " + woman + ": ");
        woman.startMorningRoutine();
    }
}
