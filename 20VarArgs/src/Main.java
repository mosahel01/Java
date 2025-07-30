public class Main {
    public static void main(String[] args) {


        // Varargs = allows a method to accept a varying # of arguments
        // makes methods more flexible with no need of overloaded methods
        // java packs those arguments into arrays
        // static void methodName(dataType... arguments) {}


        //add(1, 2, 3, 4);
        average(1, 2, 3, 4, 5);


    }

    static void add(int... numbers) {
        int sum = 0;
        // for (int i = 0; i < numbers.length; i++) {    // for loop
        for (int i : numbers) {                          // Enhanced for loop
            System.out.println(numbers[i]);
            sum = sum + numbers[i];
        }
        System.out.printf("sum : %d", sum);
    }

    static double average(int... numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        System.out.println("Average : " + sum / numbers.length);
        return sum / numbers.length;
    }


}