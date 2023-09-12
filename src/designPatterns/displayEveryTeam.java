package designPatterns;

import classes.Team;
import enums.TeamNames;
import teams.*;

public class displayEveryTeam {
    public displayEveryTeam(){}
    static public Team displayTeamLists(TeamNames tm){
        if(tm == TeamNames.ALFAROMEO){
            return new AlfaRomeo();

        }
        if(tm == TeamNames.ALPHATAURI){
            return new AlphaTauri();
        }
        if(tm == TeamNames.ALPINE){
            return new Alpine();
        }
        if(tm == TeamNames.ASTONMARTIN){
            return new AstonMartin();
        }
        if(tm == TeamNames.FERRARI){
            Ferrari obj = new Ferrari();
            obj.top3();
        }
        if(tm == TeamNames.HAAS){
            return new Haas();
        }
        if(tm == TeamNames.MCLAREN){
            return new McLaren();
        }
        if(tm == TeamNames.MERCEDES){
            Mercedes obj = new Mercedes();
            obj.top3();
        }
        if(tm == TeamNames.REDBULL){
            RedBull obj = new RedBull();
            obj.top3();


        }
        if(tm == TeamNames.WILLIAMS){
            return new Williams();
        }else{
            return null;
        }
    }
}
