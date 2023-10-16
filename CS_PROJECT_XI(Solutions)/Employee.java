import java.util.*;
class Employee{
    String name;
    int pan;
    double taxIncome, tax;

    Employee(){
        name = "";
        pan = 0;
        taxIncome = tax = 0;
    }

    void input(){
        Scanner as = new Scanner(System.in);
        
        System.out.println("Enter PAN number");
        pan = as.nextInt();
        System.out.println("Enter name");
        name = as.next();
        System.out.println("Enter taxable income");
        taxIncome = as.nextDouble();

    }

    void cal(){
        if(taxIncome <= 250000)
            tax = 0.0;
        else if(taxIncome <= 500000)
            tax = (10/100.0)*(taxIncome - 250000);
        else if(taxIncome <= 1000000)
            tax = 10000 + (20/100.0)*(taxIncome - 500000);
        else
            tax = 25000 + (30/100.0)*(taxIncome - 1000000);
    }

    void display(){
        System.out.println("PAN number \tName \tTax-income \t Tax");
        System.out.println(pan + "\t" + name + "\t" + taxIncome + "\t" + tax);
    }

    void main(){
        Employee obj = new Employee();
        obj.input();
        obj.cal();
        obj.display();
    }
}