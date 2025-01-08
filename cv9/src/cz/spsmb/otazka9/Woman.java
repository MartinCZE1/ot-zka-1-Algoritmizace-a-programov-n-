package cz.spsmb.otazka9;

public class Woman extends Human {
    public Woman(String name, int age, String colorOfEyes) {
        super(name, age, colorOfEyes);
    }

    public static void startMorningRoutine() {
        System.out.println("1. Vstát z postele");
        System.out.println("2. Umýt se");
        System.out.println("3. Nalíèit se");
        System.out.println("4. Zmìnit 457x obleèení");
        System.out.println("5. Dalších 1597 vìcí");
        System.out.println("6. Odejít z domu");
    }
}
