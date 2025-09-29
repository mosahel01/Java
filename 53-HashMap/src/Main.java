void main() {


    // HashMap -> A data structure that stores key-value pairs
    //            keys are unique but values can be duplicated
    //            does not maintain any order, but is memory efficient
    //            HashMap<key, value>

    HashMap<String, Double> map = new HashMap<>();

    map.put("orange", 3.50);
    map.put("banana", 6.50);
    map.put("apple", 4.00);

    // map.put("orange", 3.50); key can't be unique, it'll overwrite first occurrence
    map.put("coconut", 1.00);
    map.remove("coconut");

    // IO.println(map.get("coconut"));
    // IO.println(map.containsKey("apple"));
    // IO.println(map.containsValue(6.50));
    // IO.println(map.size());

    for (String key : map.keySet()) {
        IO.println(key + " : $" + map.get(key));
    }

    // IO.println(map);

}
