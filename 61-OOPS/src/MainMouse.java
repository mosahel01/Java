class Mouse1 extends Mouse {
    String color = "Matte";

    public void setColor (String color) {
        this.color = color;
    }
}

class Mouse2 extends Mouse {
    public void connect () {
        System.out.println("Connected");
    }
}

class Mouse3 extends Mouse {
    boolean ambidextrous = true;
}

class Mouse {
    public static void L_click () {
        System.out.println("Left click");
    }

    public static void R_click () {
        System.out.println("Right click");
    }

    public static void scrollUp () {
        System.out.println("Scroll Up");
    }

    public static void scrollDown () {
        System.out.println("Scroll Down");
    }
}


public class MainMouse {
    public static void main (String[] args) {
        // void main() {
        Mouse1 m1 = new Mouse1();
        Mouse2 m2 = new Mouse2();
        Mouse3 m3 = new Mouse3();

        // Properties specific to mouse{1,2,3}
        System.out.println(m1.color);
        m2.connect();
        System.out.println(m3.ambidextrous);

        // Properties from Mouse
        Mouse.L_click();
        m1.R_click();
        m2.scrollUp();
        m3.scrollDown();
        // }
    }
}
