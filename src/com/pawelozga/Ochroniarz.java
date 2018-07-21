package com.pawelozga;

public class Ochroniarz extends Pracownik {
    public Ochroniarz(Double pensja, String imie, String nazwisko, int uchybienia) {
        super(pensja, imie, nazwisko);
        this.uchybienia = uchybienia;
    }

    public int getUchybienia() {
        return uchybienia;
    }

    public void setUchybienia(int uchybienia) {
        this.uchybienia = uchybienia;
    }

    public double getWYPLATA() {
        return WYPLATA;
    }

    @Override
    public void wyplac() {
        this.pensja= pensja + WYPLATA;
    }

    @Override
    public void potrac() {
        this.pensja= pensja - uchybienia*5;

    }

    int uchybienia;
final double WYPLATA= 1500;


}

