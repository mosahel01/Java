void main() {

    // Enums -> (Enumerations) is a special class
    //          represents a fixed set of consonants
    //          improve code readability & easy to maintain
    //          more efficient with switch rather comparing strings

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a day of the week : ");
    String response = scanner.nextLine().toUpperCase();

    try {
        Day day = Day.valueOf(response);

        switch (day) {
            case MONDAY,
                 TUESDAY,
                 WEDNESDAY,
                 THURSDAY,
                 FRIDAY -> IO.println("weekday");
            case SATURDAY,
                 SUNDAY -> IO.println("weekend");
        }
    } catch (IllegalArgumentException e) {
        IO.println("Illegal Argument Exception");
        IO.println("please provide a valid day");
    }

    IO.println("hello world");

    scanner.close();
}