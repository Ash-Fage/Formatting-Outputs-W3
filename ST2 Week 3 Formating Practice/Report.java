
/**
 * Write a description of class Report here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Report
{
    double income = 13800.62;
    double salary = 4101.42;
    double rent = 2970.01;
    double taxRate = 0.30;
    
    public Report()
    {
        double gross = income - (salary + rent);
        double tax = gross * taxRate;
        double net = gross - tax;
        
        System.out.printf("Income          :%,9.2f\n", income);
        System.out.printf("Expense Salary  :%,9.2f\n", salary);
        System.out.printf("Expense Rent    :%,9.2f\n", rent);
        
        System.out.println("                :---------");
        
        System.out.printf("Gross Profit    :%,9.2f\n", gross);
        System.out.printf("Tax Rate        :%,8.1f%%\n", (taxRate*100));
        System.out.printf("Tax             :%,9.2f\n", tax);
        
        System.out.println("                :=========");
        
        System.out.printf("Nett Profit     :%,9.2f\n", net);
    }
}
