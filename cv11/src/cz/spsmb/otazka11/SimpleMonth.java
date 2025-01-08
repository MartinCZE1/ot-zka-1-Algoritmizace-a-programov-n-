package cz.spsmb.otazka11;

public enum SimpleMonth implements Month {
    LEDEN(31), �NOR(28), B�EZEN(31),
    DUBEN(30), KV�TEN(31), �ERVEN(30),
    �ERVENEC(31), SRPEN(31), ZA��(30),
    ��JEN(31), LISTOPAD(30), PROSINEC(31);
    int numberOfDays;

    SimpleMonth(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    @Override
    public int getDays() {
        return numberOfDays;
    }
}
