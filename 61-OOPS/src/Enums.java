enum levels {
    Low,
    Medium,
    High,
}

public class Enums {
    static String[] levelStr = {"Low", "Medium", "High"};

    public static void main (String[] args) {
        System.out.println("--String arrays--");
        System.out.println(levelStr[0]);
        System.out.println(levelStr[1]);
        System.out.println(levelStr[2]);

        System.out.println("--Enum--");
        System.out.println(levels.Low);
        System.out.println(levels.Medium);
        levels high = levels.High;
        System.out.println(high);

    }
}