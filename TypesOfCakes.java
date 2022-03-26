import java.util.*;
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
    public void changeCost(double newCost)
    {
        cost = newCost;
    }
    public boolean equals(TypesOfCakes ck)
    {
        if(ck instanceof TypesOfCakes)
        {
            return true;
        }
        return false;

    }
    public String changeFlavor(String f)
    {
        return "Flavor is " + f;
    }
    public String toString()
    {
        return " Cake name: " + name + "\n Cost of cake: " + cost;
    }
    public static void main(String [] args) 
    {
        ArrayList<TypesOfCakes> cakeList = new ArrayList<TypesOfCakes>();
        TypesOfCakes c1 = new TypesOfCakes();
        TypesOfCakes c2 = new TypesOfCakes("Sponge cake", 7.99);
        TypesOfCakes c3 = new TypesOfCakes("Ice cream cake", 20.99);
        TypesOfCakes c4 = new TaxCalc();
        TypesOfCakes c5 = new TaxCalc("Biscuit Cake", 8.99, 7.03);
        TypesOfCakes c6 = new TaxCalc("Cookie Cake", 12.99, 7.5);
        TypesOfCakes c7 = new AmountOfCakes();
        TypesOfCakes c8 = new AmountOfCakes("Chiffon Cake", 25.50, 8.08,2);
        TypesOfCakes c9 = new AmountOfCakes("Angel Food Cake",15.99, 4.25,4);
        TypesOfCakes c10 = c9;
        
        cakeList.add(c1);
        cakeList.add(c2);
        cakeList.add(c3);
        cakeList.add(c4);
        cakeList.add(c5);
        cakeList.add(c6);
        cakeList.add(c7);
        cakeList.add(c8);
        cakeList.add(c9);
        cakeList.add(c10);
        
        System.out.println(c9.toString());
        System.out.println(c9.equals(c10));

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
    public double getTotal()
    {
        totalCost =  super.getCost() + taxCalc;
        return totalCost;
    }
    public double salesTax()
    {
        taxCalc = super.getCost() * (taxPercent / 100);
        return taxCalc;
    }
    public boolean equals(TaxCalc cak)
    {
        if(cak instanceof TaxCalc)
        {
            return true;
        }
        return false;

    }
    public String toString()
    {
        return super.toString() + "\n Sales tax: " + salesTax() + "\n Total cost for one: " + getTotal();
    }

}
class AmountOfCakes extends TaxCalc
{
    int quantity;
    public AmountOfCakes()
    {
        super("No Cake",5.99,0.0625);

    }
    public AmountOfCakes(String n3, double price, double percentage, int q)
    {
        super(n3,price,percentage);
        quantity = q;
    }
    public boolean equals(AmountOfCakes quan)
    {
        if(quan instanceof AmountOfCakes)
        {
            return true;
        }
        return false;

    }
    public double getTotal()
    {
        double total = super.getTotal() * quantity ;
        return total;
    }
    
    public String toString()
    {
        return super.toString() + "\n Total cost for " + quantity + " is: " + getTotal();
    }
}
