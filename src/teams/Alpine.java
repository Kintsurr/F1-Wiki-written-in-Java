package teams;

import classes.BudgetCheck;
import classes.Team;
import enums.Engines;

public class Alpine extends Team {
    public Alpine(){
        super( Engines.RENAULT, "Alpine", "Fernando Alonso", "Esteban Ocon", 141000000, 173);
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
