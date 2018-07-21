package com.pawelozga;


import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Pracownik rysiek = new Ochroniarz(1500.0, "Rysiek", "Kowalski", 3);
        Pracownik zofia = new Pielegniarka(1500.0, "Zofia", "Nowak", 10);

        List<Pracownik> listaPracownikow = new LinkedList<>();
        listaPracownikow.add(rysiek);
        listaPracownikow.add(zofia);

        Scanner skaner = new Scanner(System.in);

        while (true) {
            System.out.println("1-Dodaj pielęgniarkę 2-Dodaj ochroniarza 3-Usuń pracownika 4-Lista pracowników 5-Modyfikuj 6-wypłać 7-potrąć 8-Wyjście");
            int znak = skaner.nextInt();
            switch (znak) {
                case 1: {
                    System.out.println("Podaj pensję (double)");
                    Double pensja = skaner.nextDouble();
                    System.out.println("Podaj imie");
                    String imie = skaner.next();
                    skaner.nextLine();
                    System.out.println("Podaj nazwisko");
                    String nazwisko = skaner.nextLine();
                    System.out.println("Podaj liczbe nadgodzin");
                    int nadgodziny = skaner.nextInt();


                    listaPracownikow.add(new Pielegniarka(pensja, imie, nazwisko, nadgodziny));
//to jest BARDZO przydatny stream do wypisywania elementów listy
// listaPracownikow.stream().forEach(p-> System.out.println(p.pensja + p.imie + p.nazwisko));

                }
                break;
                case 2: {
                    System.out.println("Podaj pensję (double)");
                    Double pensja = skaner.nextDouble();
                    System.out.println("Podaj imie");
                    String imie = skaner.next();
                    skaner.nextLine();
                    System.out.println("Podaj nazwisko");
                    String nazwisko = skaner.nextLine();
                    System.out.println("Podaj liczbe uchybień");
                    int uchybienia = skaner.nextInt();

                    listaPracownikow.add(new Ochroniarz(pensja, imie, nazwisko, uchybienia));
                }
                break;
                case 3: {
                    System.out.println("wpisz kogo chcesz usunąć z listy (index)");
                    //pętla do wyświetlania kolekcji z indexami
                    int k = 0;
                    for (Pracownik p : listaPracownikow) {
                        System.out.println(k + "   " + p.imie + " " + p.nazwisko);
                        k++;
                    }
                    int index = skaner.nextInt();
                    listaPracownikow.remove(index);


                }
                break;
                case 4: {
                    listaPracownikow.stream()
                            .forEach(p -> System.out.println(p.pensja + " " + p.imie + " " + p.nazwisko));
                }
                break;
                case 5: {
                    System.out.println("Którą pozycje chcesz modyfikować? (podaj index)");
                    int k = 0;
                    Pracownik pr = null;
                    for (Pracownik p : listaPracownikow) {
                        System.out.println(k + "   " + p.imie + " " + p.nazwisko);
                        k++;
                    }
                    pr = listaPracownikow.get(skaner.nextInt());
                    System.out.println(pr.imie + " " + pr.nazwisko);
                    for (Pracownik p : listaPracownikow) {
                        if (pr.getClass().getSimpleName().equals("Pielegniarka")) {
                            System.out.println("co chcesz zmienić 1-imie 2-nazwisko 3-nadgodziny 4-pensja");
                            znak = skaner.nextInt();
                            switch (znak) {
                                case 1: {
                                    System.out.println("podaj imię");
                                    String imie = skaner.nextLine();
                                    pr.setImie(imie);
                                }
                                break;
                                case 2: {
                                    System.out.println("podaj nazwisko");
                                    String nazwisko = skaner.next();
                                    pr.setNazwisko(nazwisko);
                                }
                                break;
                                case 3: {
                                    System.out.println("podaj nadgodziny");
                                    int nadgodziny = skaner.nextInt();
                                    ((Pielegniarka) pr).setNadGodziny(nadgodziny);
                                }
                                break;
                                case 4: {
                                    System.out.println("podaj pensję");
                                    double pensja = skaner.nextDouble();
                                    pr.setPensja(pensja);
                                }
                                break;
                            }
                            break;
                        } else {
                            System.out.println("co chcesz zmienić 1-imie 2-nazwisko 3-uchybienia 4-pensja");
                            znak = skaner.nextInt();
                            switch (znak) {
                                case 1: {
                                    System.out.println("podaj imię");
                                    String imie = skaner.nextLine();
                                    pr.setImie(imie);
                                }
                                break;
                                case 2: {
                                    System.out.println("podaj nazwisko");
                                    String nazwisko = skaner.next();
                                    pr.setNazwisko(nazwisko);
                                }
                                break;
                                case 3: {
                                    System.out.println("podaj uchybienia");
                                    int uchybienia = skaner.nextInt();
                                    ((Ochroniarz) pr).setUchybienia(uchybienia);
                                }
                                break;
                                case 4: {
                                    System.out.println("podaj pensję");
                                    double pensja = skaner.nextDouble();
                                    pr.setPensja(pensja);
                                }
                                break;
                            }
                            break;
                        }
                    }

                }
                break;
                case 6: {
                    System.out.println("wybierz pracownika");
                    int k = 0;
                    Pracownik pr = null;
                    for (Pracownik p : listaPracownikow) {
                        System.out.println(k + "   " + p.imie + " " + p.nazwisko);
                        k++;
                    }
                    pr = listaPracownikow.get(skaner.nextInt());
                    pr.wyplac();


                }
                break;
                case 7: {
                    Pracownik pr = null;
                    System.out.println("wybierz pracownika (Ochroniarza)");
                    int k = 0;
                    for (Pracownik p : listaPracownikow) {
                        System.out.println(k + "   " + p.imie + " " + p.nazwisko);
                        k++;
                    }
                    pr = listaPracownikow.get(skaner.nextInt());


                    if (pr.getClass().getSimpleName().equals("Ochroniarz")) {
                        ((Ochroniarz) pr).potrac();
                    } else {
                        System.out.println("podany pracownik nie jest ochroniarzem");
                    }
                }
                break;

                case 8: {
                }
                break;

                default: {
                    System.out.println("Podałeś nieprawidłową liczbę");
                }
            }
            if (znak == 8) {
                break;
            }

        }
    }
}



