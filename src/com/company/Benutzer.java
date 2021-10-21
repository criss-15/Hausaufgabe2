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


    /**
     * Gets vor name.
     *
     * @return the vor name
     */
    public String getVorName() {
        return vorName;
    }


    /**
     * Gets nach name.
     *
     * @return the nach name
     */
    public String getNachName() {
        return nachName;
    }

    /**
     * Gets sport.
     *
     * @return the sport
     */
    public List<Sport> getSport() {
        return sportList;
    }

    /**
     * Sets vor name.
     *
     * @param vorName the vor name
     */
    public void setVorName(String vorName) {
        this.vorName = vorName;
    }

    /**
     * Sets nach name.
     *
     * @param nachName the nach name
     */
    public void setNachName(String nachName) {
        this.nachName = nachName;
    }


    /**
     * Sets sport.
     *
     * @param sport the sport
     */
    public void setSport(List<Sport> sport) {
        this.sportList = sportList;
    }




    /**
     * Kalkuliere zeit double.
     *
     * @return the double
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
     * Kalkuliere zeit double.
     *
     * @param sport the sport
     * @return the double
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
     * Kalkuliere durschnittszeit double.
     *
     * @return the double
     */
    public double kalkuliereDurschnittszeit(){
        double durchnitts_zeit;
        double sum;
        sum = kalkuliereZeit();
        durchnitts_zeit = sum/sportList.size(); //teilen durch Anzahl der Sporte in der Liste
        return durchnitts_zeit;


    }
}

