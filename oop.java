public class JavaBasics {
    public static void main(String args[]) {
        Pen p1 = new Pen();

        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTips(24);
        System.out.println(p1.tip);

    }
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
