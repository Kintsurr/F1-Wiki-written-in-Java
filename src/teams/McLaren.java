package teams;
import classes.BudgetCheck;
import enums.Engines;
import  classes.Team;
public class McLaren extends Team{
    public McLaren(){
        super( Engines.MERCEDES, "McLaren", "Daniel Ricciardo", "Lando Norris", 135000000, 159);
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
