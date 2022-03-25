public class TypesOfCakes
{
    private String name;
    private double cost;
    public TypesOfCakes()
    {
        name = "Pound Cake";
        cost = 5.99;

    }
    public TypesOfCakes(String n,double c)
    {
        name = n;
        cost = c;
    }
    public double getCost()
    {
        return cost;
    }
    public String getName()
    {
        return name;
    }
    public void changeName(String newName)
    {
        name = newName;
    }
    public void changeName(double newCost)
    {
        cost = newCost;
    }
    public boolean equals(TypesOfCakes ck)
    {
        if()

    }
    public String toString()
    {
        return "Cake name: " + name + "\n Cost of cake: " + cost;
    }
    public static void main(String [] args) 
    {
        ArrayList<TypesOfCakes> cakeList = new ArrayList<TypesOfCakes>();
    }
}
class TaxCalc extends TypesOfCakes
{
    double taxCalc;
    double taxPercent; // Sales tax
    double totalCost;
    public TaxCalc()
    {
        super("No Cake",5.99);
        taxPercent = 0.0625;

    }
    public TaxCalc(String n2, double price, double percentage)
    {
        super(n2,price);
        taxPercent = percentage;
    }
    public double getTotalCost()
    {
        taxCalc = super.getCost() * (taxPercent / 100);
        totalCost =  super.getCost() + taxCalc;
        return totalCost;
    }
    public String toString()
    {
        return super.toString() + "\n Sales tax: " + taxCalc + "\n Total cost: " + totalCost;
    }

}
