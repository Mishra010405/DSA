// public class OOPS {
//     public static void main(String args[]) {

//         pen p1 = new pen(); // created a pen object called p1
//         p1.setColor("Yellow");
//         p1.setTip(5);

//         System.out.println("Pen Color: " + p1.color);
//         System.out.println("Pen Tip: " + p1.tip);

//         Student s1 = new Student();
//         s1.name = "Shivam";
//         s1.age = 20;
//         s1.calculatePercentage(80, 85, 90);

//         System.out.println("Student Name: " + s1.name);
//         System.out.println("Percentage: " + s1.percentage);


//     }
// }


// class pen {

//     String color;
//     int tip;

//     void setColor(String newColor) {
//         color = newColor;
//     }

//     void setTip(int newTip) {
//         tip = newTip;
//     }
// }

// class Student {

//     String name;
//     int age;
//     float percentage; // cgpa

//     void calculatePercentage(int phy, int chem, int math) {
//         percentage = (phy + chem + math) / 3.0f;
//     }
// }


// Access Moidifiers.....

// public class OOPS {
//     public static void main(String ars[]) {

//         bankAccount myAcc = new bankAccount();

//         // Assign value
//         myAcc.username = "Shivam Mishra";
//         myAcc.setPassword("Mishra@sada");

//         System.out.println("The User name will be " + myAcc.username);
//         System.out.println("The User name's Password will be " + myAcc.getPassword());
//     }
// }

// class bankAccount {

//     public String username;
//     private String password;

//     // Setter
//     public void setPassword(String pwd) {
//         password = pwd;
//     }

//     // Getter
//     public String getPassword() {
//         return password;
//     }
// }



// Constructors ... 

// public class JavaBasics {
//     public static void main(String args[]) {

//         Student s1 = new Student();

//         s1.name = "Shivam";   
//         s1.roll = 23;        

//         System.out.println(s1.name);
//     }
// }

// class Student {

//     String name;
//     int roll;
// }


// Parametrisecd COnstrucotorsss...

// public class OOPS {
//     public static void main(String args[]) {

//         Student s1 = new Student("Shivam", 23);

//         System.out.println(s1.name);
//         System.out.println(s1.roll);
//     }
// }

// class Student {

//     String name;
//     int roll;

//     // Parameterized Constructor
//     Student(String m, int r) {
//         name = m;
//         roll = r;
//     }
// }



// Non Parameterized COnstructors...

// public class OOPS {
//     public static void main(String args[]) {
//         Student s1 = new Student();
//         Student s2 = new Student("Shivam MISrha");
//         Student s3 = new Student(34);

//         System.out.println(s2.name);
//         System.out.println(s3.roll);


//     }
// }

// class Student {
//     String name;
//     int roll;

//     Student() {
//         System.out.println("Constructor is called....");
//     }   
//     Student(String name) {
//         this.name = name;
//     }

//     Student(int roll) {
//         this.roll= roll;
//     }
// }


// Copy COnstructor...

// public class OOPS {
//     public static void main(String args[]) {

//         Student s1 = new Student();

//         s1.name = "Shivam Mishra";
//         s1.roll = 34;
//         s1.password = "dsfgdfbd";

//         s1.marks[0] = 100;
//         s1.marks[1] = 98;
//         s1.marks[2] = 99;

//         System.out.println(s1.name);
//         System.out.println(s1.roll);
//         System.out.println(s1.password);

//         // Copy constructor (Deep Copy)
//         Student s2 = new Student(s1);

//         s2.password = "xvfgghh";

//         System.out.println(s2.password);

//         // Print marks of s2
//         for(int i = 0; i < 3; i++) {
//             System.out.println(s2.marks[i]);
//         }
//     }
// }

// class Student {

//     String name;
//     int roll;
//     String password;
//     int marks[];

//     // Default Constructor
//     Student() {
//         marks = new int[3]; // ✔ Create array
//     }

    

//     // Copy Constructor (Deep Copy)
//     Student(Student s1) {

//         this.name = s1.name;
//         this.roll = s1.roll;
//         this.password = s1.password;

//         // Create new array
//         this.marks = new int[3];

//         // Copy values one by one
//         for(int i = 0; i < 3; i++) {
//             this.marks[i] = s1.marks[i];
//         }
//     }

//     // Parameterized Constructor (Name)
//     Student(String name) {
//         this.name = name;
//         marks = new int[3];
//     }

//     // Parameterized Constructor (Roll)
//     Student(int roll) {
//         this.roll = roll;
//         marks = new int[3];
//     }
// }


// Inheritance ...

// public class OOPS {
//     public static void main(String args[]) {

//         // Fish object
//         Fish shark = new Fish();
//         shark.eat();
//         shark.breathes();
//         shark.swims();

//         // Dog object (Multilevel Inheritance)
//         Dog dobby = new Dog();
//         dobby.legs = 4;

//         dobby.eat();
//         dobby.breathes();
//         dobby.walk();

//         System.out.println("Dog Legs: " + dobby.legs);
//     }
// }

// // Base Class
// class Animal {

//     String color;

//     void eat() {
//         System.out.println("Eats");
//     }

//     void breathes() {
//         System.out.println("Breathes");
//     }
// }

// // Derived Class (Single Inheritance)
// class Fish extends Animal {

//     int fins;

//     void swims() {
//         System.out.println("Swims in water");
//     }
// }

// // Multilevel Inheritance
// class Mammals extends Animal {

//     int legs;

//     void walk() {
//         System.out.println("Walks on land");
//     }
// }

// // Child of Mammals
// class Dog extends Mammals {

//     void bark() {
//         System.out.println("Barks");
//     }
// }



// Hybrid inhertances..

// public class OOPS {
//     public static void main(String args []) {
//         tuna t1 = new tuna();
//         t1.eat();
//         t1.braeths();
//         t1.swims();
//         t1.type();

//         System.out.println();

//          Shark s1 = new Shark();
//         s1.eat();
//         s1.breathe();
//         s1.swim();
//         s1.type();

//         System.out.println();

//         // Bird
//         Peacock p1 = new Peacock();
//         p1.eat();
//         p1.breathe();
//         p1.fly();
//         p1.dance();

//         System.out.println();

//         // Mammal
//         Dog d1 = new Dog();
//         d1.eat();
//         d1.breathe();
//         d1.walk();
//         d1.bark();

//         System.out.println();

//         Cat c1 = new Cat();
//         c1.eat();
//         c1.walk();
//         c1.meow();

//         System.out.println();

//         Human h1 = new Human();
//         h1.eat();
//         h1.walk();
//         h1.speak();
//     }
// }


// class Animal {
//     String color ;

//     void eat(){
//         System.out.println("Animal eats..");
//     }

//     void breathes() {
//         System.out.println("Animal braeths");
//     }

// }

// // ----------FISH-----------------
// class fish extends Animal {
//     void swims() {
//         System.out.println("Fish can swims..");
//     }
// }

// class tuna extends fish {
//     void type() {
//         System.out.println("I am Tune fish");
//     }
// }

// class Shark extends fins {
//     void type() {
//         System.out.println("I am Shark Type");
//     }
// }


// // -----------BIRDS---------------

// class Birds extends Animal {
//     void fly() {
//         System.out.println("Birds can fly in the sky..")
//     }
// }


// class Peacock extends Bird {

//     void dance() {
//         System.out.println("Peacock dances");
//     }
// }

// // ---------------- MAMMAL ---------------
// class Mammal extends Animal {

//     void walk() {
//         System.out.println("Mammal walks");
//     }
// }

// class Dog extends Mammal {

//     void bark() {
//         System.out.println("Dog barks");
//     }
// }

// class Cat extends Mammal {

//     void meow() {
//         System.out.println("Cat meows");
//     }
// }

// class Human extends Mammal {

//     void speak() {
//         System.out.println("Human speaks");
//     }
// }

// Calculator By Method Overloading......

// public class OOPS {
//     public static void main(String args[]) {
//         Calculator clc = new Calculator();

//         System.out.println(clc.sum(1, 2));          
//         System.out.println(clc.sum(1.4, 2.5));     
//         System.out.println(clc.sum(1, 2, 4));       
//     }
// }

// class Calculator {

//     int sum(int a, int b) {
//         return a + b;
//     }

//     double sum(double a, double b) {
//         return a + b
//     }

//     int sum(int a, int b, int c) {
//         return a + b + c;
//     }
// }


// Another Example...

// public class OOPS {
//     public static void main(String args []) {
//         Deer d = new Deer();
//         d.eat();

//     }
// }

// class Animal {
//     void eat() {
//         System.out.println("It's Eats Grass...");
//     }
// }

// class Deer extends Animal {
//     void eat() {
//         System.out.println("Eats Grass ....");
//     }
// }


// Abstract Classss

// public class OOPS {
//     public static void main(String args[]) {

//         Horse h = new Horse();
//         h.walk();
//         h.eat();

//         Chicken c = new Chicken();
//         c.walk();
//         c.eat();
//     }
// }

// abstract class Animal {

//     void eat() {
//         System.out.println("Animal Eats");
//     }

//     abstract void walk();   // no body
// }

// class Horse extends Animal {

//     void walk() {
//         System.out.println("Walks on 4 legs...");
//     }
// }

// class Chicken extends Animal {

//     void walk() {
//         System.out.println("Walks on 2 legs...");
//     }
// }


