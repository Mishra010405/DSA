// public class JavaBasics {
//     public static void main(String args[]) {

//         Pen p1 = new Pen();

//         p1.setColor("Blue");
//         System.out.println(p1.getColor());

//         p1.setTips(24);
//         System.out.println(p1.getTip());


//         BankAccount p2 = new BankAccount();

//         p2.setUsername("Shivam");
//         System.out.println(p2.getUsername());
//     }
// }


// // BankAccount Class
// class BankAccount {
//     private String username;
//     private String password;

//     // Setter
//     void setUsername(String name) {
//         this.username = name;
//     }

//     // Getter
//     String getUsername() {
//         return this.username;
//     }
// }


// // Pen Class
// class Pen {
//     private String color;
//     private int tip;

//     String getColor() {
//         return this.color;
//     }

//     int getTip() {
//         return this.tip;
//     }

//     void setColor(String newColor) {
//         this.color = newColor;
//     }

//     void setTips(int newTip) {
//         this.tip = newTip;
//     }
// }


// Constructor.....

public class OOPS {

    public static void main(String args[]) {

        Student s1 = new Student("Shivam");
        System.out.println(s1.name);

    }
}

class Student {

    String name;
    int roll;

    Student(String name) {
        this.name = name;
    }
}
