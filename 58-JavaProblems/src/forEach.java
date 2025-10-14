public class forEach {
    public static void main(String[] args) {

        String[] cars = {"BMW M2", "Veloster N", "GTI"};

        // for Loop
        for (int i = 0; i < cars.length; i++ ) {
            System.out.println(cars[i]);
        }

        // **forEach**
        for(String car : cars) {
            System.out.println(car);
        }

    }
}
