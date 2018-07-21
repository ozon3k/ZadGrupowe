package com.pawelozga;

public class Pielegniarka extends Pracownik {
    int nadGodziny;

    public int getNadGodziny() {
        return nadGodziny;
    }

    public void setNadGodziny(int nadGodziny) {
        this.nadGodziny = nadGodziny;
    }

    public Pielegniarka(Double pensja, String imie, String nazwisko, int nadGodziny) {
        super(pensja, imie, nazwisko);
        this.nadGodziny = nadGodziny;

    }

    public void wyplac(){
        this.pensja= pensja+ Double.valueOf(1500 + 13*nadGodziny);
    }
}