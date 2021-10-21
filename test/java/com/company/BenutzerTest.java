package com.company;

import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The type Benutzer test.
 */
class BenutzerTest {

    /**
     * Gets vor name.
     */
    @Test
    void getVorName() {
        List<Sport> sportList = new ArrayList<>();
        Benutzer benutzer = new Benutzer("Gavriliu", "Iulia", sportList);
        assertEquals(benutzer.getVorName(), "Gavriliu");
    }

    /**
     * Gets nach name.
     */
    @Test
    void getNachName() {
        List<Sport> sportList = new ArrayList<>();
        Benutzer benutzer2 = new Benutzer("Oros", "Bogdan",sportList);
        assertEquals(benutzer2.getNachName(), "Bogdan");
    }

    /**
     * Gets sport.
     */
    @Test
    void getSport() {
        Sport fussbal1 = new Fussball();
        Sport fussball2= new Fussball();
        Sport basket1 = new Basketball();
        Sport basket2 = new Basketball();
        Sport basket3 = new Basketball();
        Sport hindernislauf1 = new Hindernislauf();
        Sport hochsprung = new Hochsprung();

        List<Sport> sportList = new ArrayList<>();
        sportList.add(fussbal1);
        sportList.add(fussball2);
        sportList.add(basket1);
        sportList.add(basket2);
        sportList.add(basket3);
        sportList.add(hindernislauf1);
        sportList.add(hochsprung);

        Benutzer benutzer = new Benutzer("Gavriliu", "Iulia",sportList);
        assertEquals(benutzer.getSport(), sportList);
    }

    /**
     * Kalkuliere zeit.
     */
    @Test
    void kalkuliereZeit() {
        Sport basket1 = new Basketball();
        Sport basket2 = new Basketball();
        Sport fussball1 = new Fussball();
        Sport fussball2 = new Fussball();
        Sport fussball3 = new Fussball();
        Sport hindernisl = new Hindernislauf();
        Sport hindernisl2 = new Hindernislauf();
        Sport hochsprung = new Hochsprung();

        List<Sport> sportList = new ArrayList<>();
        sportList.add(basket1);
        sportList.add(basket2);
        sportList.add(fussball1);
        sportList.add(fussball2);
        sportList.add(fussball3);
        sportList.add(hindernisl);
        sportList.add(hindernisl2);
        sportList.add(hochsprung);

        Benutzer benutzer = new Benutzer("Gavriliu", "Iulia", sportList);
        assertEquals(benutzer.kalkuliereZeit(), 385);
    }

    /**
     * Test kalkuliere zeit.
     */
    @Test
    void testKalkuliereZeit() {
        Sport basket1 = new Basketball();
        Sport basket2 = new Basketball();
        Sport fussball1 = new Fussball();
        Sport fussball2 = new Fussball();
        Sport fussball3 = new Fussball();
        Sport hindernisl = new Hindernislauf();
        Sport hindernisl2 = new Hindernislauf();
        Sport hochsprung = new Hochsprung();

        List<Sport> sportList = new ArrayList<>();
        sportList.add(basket1);
        sportList.add(basket2);
        sportList.add(fussball1);
        sportList.add(fussball2);
        sportList.add(fussball3);
        sportList.add(hindernisl);
        sportList.add(hindernisl2);
        sportList.add(hochsprung);

        Benutzer benutzer = new Benutzer("Gavriliu", "Iulia", sportList);

        assertEquals(benutzer.kalkuliereZeit(new Basketball()), 110);
        assertEquals(benutzer.kalkuliereZeit(new Fussball()), 195);
        assertEquals(benutzer.kalkuliereZeit(new Hindernislauf()), 60);
        assertEquals(benutzer.kalkuliereZeit(new Hochsprung()), 20);
    }


    /**
     * Kalkuliere durschnittszeit.
     */
    @Test
    void kalkuliereDurschnittszeit() {
        Sport basket1 = new Basketball();
        Sport basket2 = new Basketball();
        Sport fussball1 = new Fussball();
        Sport fussball2 = new Fussball();
        Sport fussball3 = new Fussball();
        Sport hindernisl = new Hindernislauf();
        Sport hindernisl2 = new Hindernislauf();
        Sport hochsprung = new Hochsprung();

        List<Sport> sportList = new ArrayList<>();
        sportList.add(basket1);
        sportList.add(basket2);
        sportList.add(fussball1);
        sportList.add(fussball2);
        sportList.add(fussball3);
        sportList.add(hindernisl);
        sportList.add(hindernisl2);
        sportList.add(hochsprung);

        Benutzer benutzer = new Benutzer("Gavriliu", "Iulia", sportList);

        assertEquals(benutzer.kalkuliereDurschnittszeit(),48.125);
    }
}