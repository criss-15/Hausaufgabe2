package com.company;

import java.util.List;


/**
 * The type Benutzer.
 */
public class Benutzer {
    private String vorName;
    private String nachName;
    private List<Sport> sportList;

    public Benutzer(String vorName, String nachName, List<Sport> sportList) {
        this.vorName = vorName;
        this.nachName = nachName;
        this.sportList = sportList;
    }



    public String getVorName() {
        return vorName;
    }


    public String getNachName() {
        return nachName;
    }


    public List<Sport> getSport() {
        return sportList;
    }


    public void setVorName(String vorName) {
        this.vorName = vorName;
    }


    public void setNachName(String nachName) {
        this.nachName = nachName;
    }


    public void setSport(List<Sport> sport) {
        this.sportList = sportList;
    }




    /**
     * Die Methode kalkuliert die Zeit verbraucht fur alle Sportarten
     *
     * @return das gesamte Zeit verbraucht
     */
    public double kalkuliereZeit(){
        int sum=0;
        for (Sport spt:
             sportList) {
            sum += spt.kalkuliereZeit(); //addieren der Zeit von allen Sportarten
        }
        return sum;
    }

    /**
     * Die Methode kalkuliert die Zeit verbraucht fur eine bestimmte Sportart
     *
     * @param eine Sportart
     * @return das verbrauchte Zeit fur diese Sportart
     */
    public double kalkuliereZeit(Sport sport){
        double sum=0;
        for(int i=0; i< this.sportList.size(); i++) //durchlaufen der Liste
        {
            if(this.sportList.get(i).getClass() == sport.getClass()) //wenn wir das gesuchte Sportart finden
                sum+=sport.kalkuliereZeit();
        }
        return sum;
    }


    /**
     * Die Methode kalkuliert der Durchschnittszeit fur alle Sportarten
     *
     * @return wie viel Zeit man in Durchschnitt fur Sport verbraucht
     */
    public double kalkuliereDurschnittszeit(){
        double sum;
        sum = kalkuliereZeit();
        return sum/sportList.size(); //teilen durch Anzahl der Sporte in der Liste


    }
}

