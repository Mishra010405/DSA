public class OOPS {
    public static void main(String args []) {
        pen p1 = new pen(); // created a pen object called p1..
        p1.setColor("Yellow");
        System.out.println(p1.color); 
    }

}

class pen {
    String color,
    int tip,

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

    void percentage(int phy , int chem , int math) {
        percentage = (phy+chem+math)/3;
    }
}