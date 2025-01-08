package cz.spsmb.otazka11;

public enum SimpleMonth implements Month {
    LEDEN(31), ÚNOR(28), BØEZEN(31),
    DUBEN(30), KVÌTEN(31), ÈERVEN(30),
    ÈERVENEC(31), SRPEN(31), ZAØÍ(30),
    ØÍJEN(31), LISTOPAD(30), PROSINEC(31);
    int numberOfDays;

    SimpleMonth(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    @Override
    public int getDays() {
        return numberOfDays;
    }
}
