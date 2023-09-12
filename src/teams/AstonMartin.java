package teams;

import classes.BudgetCheck;
import classes.Team;
import enums.Engines;

public class AstonMartin extends Team {
    public AstonMartin(){
        super( Engines.MERCEDES, "Aston Martin", "Sebastian Vettel", "Lance Stroll", 139000000, 55);
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
