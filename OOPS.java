public class OOPS {
    public static void main(String args[]) {

        pen p1 = new pen(); // created a pen object called p1
        p1.setColor("Yellow");
        p1.setTip(5);

        System.out.println("Pen Color: " + p1.color);
        System.out.println("Pen Tip: " + p1.tip);

        Student s1 = new Student();
        s1.name = "Shivam";
        s1.age = 20;
        s1.calculatePercentage(80, 85, 90);

        System.out.println("Student Name: " + s1.name);
        System.out.println("Percentage: " + s1.percentage);
    }
}

class pen {

    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

class Student {

    String name;
    int age;
    float percentage; // cgpa

    void calculatePercentage(int phy, int chem, int math) {
        percentage = (phy + chem + math) / 3.0f;
    }
}
