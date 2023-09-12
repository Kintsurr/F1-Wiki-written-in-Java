package teams;
import classes.BudgetCheck;
import enums.Engines;
import  classes.Team;
import interfaces.topTeams;
public class Mercedes extends Team implements topTeams{
    public Mercedes(){
        super( Engines.MERCEDES, "Mercedes", "Lewis Hamilton", "George Russell", 143000000, 515);
        displayInfo();
        pointsEarned();
    }

    protected void displayInfo() {
        System.out.println("Team name: "+this.teamName);
        System.out.println(this.type.label);
        System.out.println("First Driver name:" +this.driver1);
        System.out.println("second Driver name:" +this.driver2);
        BudgetCheck check = new BudgetCheck(this.moneySpent);
        check.overspendCheck();
    }

    @Override
    public void top3(){
        System.out.println("Team ended season on second place");
    }

    public void pointsEarned() {
        System.out.println("Total points earned: "+ this.points);
    }
}
