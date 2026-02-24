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

// public class OOPS {

//     public static void main(String args[]) {

//         Student s1 = new Student("Shivam", 101, "abcd");

//         System.out.println(s1.name);
//         System.out.println(s1.roll);
//         System.out.println(s1.password);

//         // Copy Constructor
//         Student s2 = new Student(s1);

//         System.out.println("\nCopied Student:");
//         System.out.println(s2.name);
//         System.out.println(s2.roll);
//         System.out.println(s2.password);
//     }
// }


// class Student {

//     String name;
//     int roll;
//     String password;
//     int marks[];

//     // Default Constructor
//     Student() {
//         marks = new int[3];
//         System.out.println("Constructor is called...");
//     }

//     // Parameterized Constructor
//     Student(String name, int roll, String password) {
//         this.name = name;
//         this.roll = roll;
//         this.password = password;
//         this.marks = new int[3];
//     }

//     // Copy Constructor
//     Student(Student s) {
//         this.name = s.name;
//         this.roll = s.roll;
//         this.password = s.password;

//         this.marks = new int[3];
//         for (int i = 0; i < marks.length; i++) {
//             this.marks[i] = s.marks[i];
//         }
//     }
// }


// Inheritancs ....

public class OOPS {

    public static void main(String args[]) {

        Tuna t1 = new Tuna();
        t1.eat();
        t1.breathe();
        t1.swim();
        t1.type();

        System.out.println();

        Peacock p1 = new Peacock();
        p1.eat();
        p1.fly();
        p1.type();

        System.out.println();

        Human h1 = new Human();
        h1.eat();
        h1.walk();
        h1.type();
    }
}


// Base Class
class Animal {

    String color;

    void eat() {
        System.out.println("Eats");
    }

    void breathe() {
        System.out.println("Breathes");
    }
}


// Level 1
class Mammal extends Animal {

    void walk() {
        System.out.println("Walks on land");
    }
}

class Fish extends Animal {

    void swim() {
        System.out.println("Fish swims in water");
    }
}

class Bird extends Animal {

    void fly() {
        System.out.println("Bird flies in the sky");
    }
}


// Level 2
class Tuna extends Fish {
    void type() {
        System.out.println("I am Tuna fish");
    }
}

class Shark extends Fish {
    void type() {
        System.out.println("I am Shark fish");
    }
}

class Peacock extends Bird {
    void type() {
        System.out.println("I am Peacock");
    }
}

class Dog extends Mammal {
    void type() {
        System.out.println("I am Dog");
    }
}

class Cat extends Mammal {
    void type() {
        System.out.println("I am Cat");
    }
}

class Human extends Mammal {
    void type() {
        System.out.println("I am Human");
    }
}
