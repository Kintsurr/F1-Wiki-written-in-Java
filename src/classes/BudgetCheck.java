package classes;

public class BudgetCheck {
    final int budgetLimit = 140000000;
    private int moneySpent;
    public BudgetCheck(int moneySpent){
        this.moneySpent=moneySpent;
    }
    public void overspendCheck(){
        if(this.budgetLimit > moneySpent){
            System.out.println("the team is penalized because of overspending "+(this.budgetLimit-this.moneySpent)+" dollars");
        }else{
            System.out.println("Overspending is not recorded");
        }
    }
}
