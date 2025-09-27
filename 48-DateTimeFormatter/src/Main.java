void main() {

    // How to work with DATES & TIMES using Java
    // (LocalDate, LocalTime, LocalDateTime & UTC timestamp)

    // declaring date & time variable
    LocalDate date = LocalDate.now();
    LocalTime time = LocalTime.now();
    LocalDateTime datetime = LocalDateTime.now();

    LocalDate localDate = LocalDate.of(2025, 9, 27);
    LocalTime localDateTime = LocalTime.of(6,44,19);

    // formatted date & time
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    String newDateTime = datetime.format(formatter);

    System.out.println(localDateTime);
    System.out.println(localDate);

    System.out.println(newDateTime);
    System.out.println(date);
    System.out.println(time);
    System.out.println(datetime);

}
