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

    public double kalkuliereZeit(){
        int sum=0;
        for (Sport spt:
             sportList) {
            sum += spt.kalkuliereZeit();
        }
        return sum;
    }



    public double kalkuliereZeit(Sport sport){
        double sum=0;
        for(int i=0; i< this.sportList.size(); i++)
        {
            if(this.sportList.get(i).getClass() == sport.getClass())
                sum+=sport.kalkuliereZeit();
        }
        return sum;
    }


    public double kalkuliereDurschnittszeit(){
        double durchnitts_zeit;
        double sum;
        sum = kalkuliereZeit();
        durchnitts_zeit = sum/sportList.size();
        return durchnitts_zeit;


    }
}

