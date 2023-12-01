import java.util.*;
class Marks{
    String name;
    int m1, m2, m3, m4, m5, max;
    float avg;

    Marks(){
        name = "";
        m1 = m2 = m3 = m4 = m5 = 0;
        avg = 0;
    }

    void accept(){
        Scanner as = new Scanner(System.in);
        System.out.println("Enter name:");
        name = as.nextLine();

        System.out.println("Enter marks in 5 subject:");
        m1 = as.nextInt();
        m2 = as.nextInt();
        m3 = as.nextInt();
        m4 = as.nextInt();
        m5 = as.nextInt();
    }

    void compute(){
        max = Math.max(m1,m2);
        max = Math.max(max,m3);
        max = Math.max(max,m3);
        max = Math.max(max,m4);
        max = Math.max(max,m5);

        avg = (m1+m2+m3+m4+m5)/5;
    }

    void display(){
        System.out.println("Name: " + name);
        System.out.println("Subject 1: " + m1 + "\nSubject 2: " + m2 + "\nSubject 3: " + m3 + "\nSubject 4: " + m4 + "\nSubject 5: " + m5);
        System.out.println("Average marks: " + avg);
        System.out.println("Maximum marks: " + max);
    }

    void main(){
        Marks obj = new Marks();
        obj.accept();
        obj.compute();
        obj.display();
    }
}