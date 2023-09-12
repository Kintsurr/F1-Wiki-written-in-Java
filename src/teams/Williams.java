package teams;

import classes.BudgetCheck;
import classes.Team;
import enums.Engines;
import classes.BudgetCheck;
public class Williams extends Team {
    public Williams() {
        super(Engines.MERCEDES, "Williams", "Nicholas Latifi", "Alexander Albon", 132000000, 8);
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

    public void pointsEarned() {
        System.out.println("Total points earned: "+ this.points);
    }
}