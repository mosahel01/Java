public class DupChars {
    public static void main(String[] args) {
        String sentence = "How many duplicates are there ?";
        System.out.println(sentence + "(" + sentence.length() + ")");

        String duplicates = "";
        String characters = "";
        int count = 0;

        for (int i = 0; i < sentence.length(); i++) {
            String current = String.valueOf(sentence.charAt(i));
            if(characters.contains(current)) {
                if (!duplicates.contains(current)) {
                    duplicates = duplicates + sentence.charAt(i) + ",";
                    count++; 
                }
            }
            characters += current;
        }

        System.out.printf("Duplicate characters are : " + duplicates + "(" + count + ")");

    }
}




























