void main() {

    // How to work with DATES & TIMES using Java
    // (LocalDate, LocalTime, LocalDateTime & UTC timestamp)

    // declaring date & time variable
    LocalDate date = LocalDate.now();
    LocalTime time = LocalTime.now();
    LocalDateTime datetime = LocalDateTime.now();

    LocalDate localDate = LocalDate.of(2025, 9, 27);
    LocalTime localTime = LocalTime.of(6, 44, 19);
    // LocalDateTime localdatetime = LocalDateTime.of(localDate, localDateTime);
    LocalDateTime localdatetime = LocalDateTime.of(2025, 9, 27, 8, 15, 50);

    LocalDateTime date1 = LocalDateTime.of(2025, 9, 27, 12, 0, 0);
    LocalDateTime date2 = LocalDateTime.of(2025, 7, 7, 12, 0, 0);

    if (date1.isBefore(date2)) {
        System.out.println(date1 + " is before " + date2);
    } else if (date1.isAfter(date2)) {
        System.out.println(date1 + " is after " + date2);
    } else if (date1.isEqual(date2)) {
        System.out.println(date1 + " is equal to " + date2);
    }


    // formatted date & time
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    String newDateTime = datetime.format(formatter);


    System.out.println("\ncustom formatted date & time");
    System.out.println(newDateTime);
    System.out.println(localTime);
    System.out.println(localDate);
    System.out.println(localdatetime);

    System.out.println("\nready made date & time");
    System.out.println(date);
    System.out.println(time);
    System.out.println(datetime);

}
