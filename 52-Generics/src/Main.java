void main() {


    // Generics -> a concept where you can write a class, interface, or method that is compatible with different data types.
    //             <T> Type Parameter (placeholder that gets replaced with real data types)
    //             <String> Type Argument (specifies the type)

    // <T> in Box.java allows us to use any wrapper class for the object

    Box<String> box1 = new Box<>();
    box1.setItem("banana");

    Box<Boolean> box2 = new Box<>();
    box2.setItem(true);

    Box<Double> box3 = new Box<>();
    box3.setItem(2.23);

    Box<Integer> box4 = new Box<>();
    box4.setItem(200);


    System.out.println(box1.getItem());
    System.out.println(box2.getItem());
    System.out.println(box3.getItem());
    System.out.println(box4.getItem());

}
