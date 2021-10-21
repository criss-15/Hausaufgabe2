package com.company;

import java.util.List;

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



    /* die Methode berechent das gebrauchte Zeit fur alle Sportarten
    Output: das gebrauchte Zeit
     */
    public double kalkuliereZeit(){
        int sum=0;
        for (Sport spt:
             sportList) {
            sum += spt.kalkuliereZeit();
        }
        return sum;
    }



    /* die Methode berechent die Zeit gebraucht fur eine Sportart
    Input: eine Sportart als Parameter
    Output: die gebrauchte Zeit fur diese Sport
     */
    public double kalkuliereZeit(Sport sport){
        double sum=0;
        for(int i=0; i< this.sportList.size(); i++)
        {
            if(this.sportList.get(i).getClass() == sport.getClass())
                sum+=sport.kalkuliereZeit();
        }
        return sum;
    }


    /* die Methode berechnet die Durchnittszeit fur alle Sportarten
    Output:das gebrauchte Durchnittszeit furs Sport
     */
    public double kalkuliereDurschnittszeit(){
        double durchnitts_zeit;
        double sum;
        sum = kalkuliereZeit();
        durchnitts_zeit = sum/sportList.size();
        return durchnitts_zeit;


    }
}

