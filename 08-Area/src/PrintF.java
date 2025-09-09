public class PrintF {
    public static void main(String[] args) {

//        %[flags][width][.precision][specifier-character]

        String name = "Peter";
        int age = 21;
        char firstLetter = 'p';
        double height = 5.10;
        boolean isEmployed = true;

        System.out.printf("Hello %s\n", name);
        System.out.printf("firstLetter %c\n", firstLetter);
        System.out.printf("height %f\n", height);
        System.out.printf("age %d\n", age);
        System.out.printf("isEmployed %b\n", isEmployed);
        System.out.printf("isEmployed %.2b\n", isEmployed);

        System.out.printf("%s is %d years old", name, age);

//        s = string, d = int, f = double, b = boolean, c = char

    }
}
