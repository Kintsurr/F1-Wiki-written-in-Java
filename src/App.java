import designPatterns.displayEveryTeam;
import enums.TeamNames;

public class App {
    public static void main(String[] args){
        System.out.println("Al 10 teams over there");
        for(TeamNames i: TeamNames.values()){
            displayEveryTeam.displayTeamLists(i);
            System.out.println(" ");
        }
    }
}
