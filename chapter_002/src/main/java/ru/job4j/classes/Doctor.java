package ru.job4j.classes;

public class Doctor extends Profession {
    private Diagnose diagnose = new Diagnose();
    public Diagnose heal(Patient pacient) {
        return this.diagnose;
    }
}
