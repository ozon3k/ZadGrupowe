package com.pawelozga;

public class Pracownik implements Wyplata {

    Double pensja;
    String imie;
    String nazwisko;

    public Double getPensja() {
        return pensja;
    }

    public void setPensja(Double pensja) {
        this.pensja = pensja;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public Pracownik(Double pensja, String imie, String nazwisko) {
        this.pensja = pensja;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }




    @Override
    public void wyplac() {

    }

    @Override
    public void potrac() {

    }
}
