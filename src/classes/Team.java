package classes;

import enums.Engines;

public abstract class Team {
    protected Engines type;
    protected String teamName;
    protected String driver1;
    protected String driver2;
    protected int moneySpent;
    protected int points;

    public Team(Engines type, String teamName, String driver1, String driver2,int moneySpent, int points){
        this.type = type;
        this.teamName = teamName;
        this.driver1 = driver1;
        this.driver2 = driver2;
        this.moneySpent = moneySpent;
        this.points = points;
    }
    public abstract void pointsEarned();
}

