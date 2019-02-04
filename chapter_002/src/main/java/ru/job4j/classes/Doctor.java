package ru.job4j.classes;

public class Doctor extends Profession {
    Diagnose diagnose = new Diagnose();
    public Diagnose heal(Pacient pacient) {
        return this.diagnose;
    }
}
