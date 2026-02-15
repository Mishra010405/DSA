public class JavaBasics {
    public static void main(String args[]) {
        Pen p1 = new Pen();

        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTips(24);
        System.out.println(p1.tip);

        bankAccount p2 = new bankAccount();
        p2.username = "Shivam";
        System.out.println(p2.username);


    }
}

class bankAccount {
    public String username;
    private String password;
    

}

class Pen {
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTips(int newTip) {
        tip = newTip;
    }
}


