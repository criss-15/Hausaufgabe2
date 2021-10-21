package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Basketball basket1 = new Basketball();
        Fussball fussball1 = new Fussball();
        Hindernislauf hindernislauf1 = new Hindernislauf();
        Hochsprung hochsprung1 = new Hochsprung();

        Basketball basket2 = new Basketball();
        Basketball basket3 = new Basketball();
        Fussball fussball2 = new Fussball();

        List<Sport> sport = new ArrayList<>();
        sport.add(basket1);
        sport.add(basket2);
        sport.add(basket3);
        sport.add(fussball1);
        sport.add(fussball2);
        sport.add(hindernislauf1);
        sport.add(hochsprung1);


        Benutzer b1 = new Benutzer("Andrei", "Lastun", sport);
        System.out.println(b1.toString());
        System.out.println(b1.kalkuliereZeit());
        System.out.println(b1.kalkuliereZeit(new Basketball()));
        System.out.println(b1.kalkuliereDurschnittszeit());

    }
}
