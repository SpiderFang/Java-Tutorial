//https://stackoverflow.com/questions/9872002/keep-only-alphabet-characters
//keep only alphabet characters

public class Main {
public static void main(String[] args) {
    String input = "Word#$#$% Word 1234!";
    String extract = input.replaceAll("[^a-zA-Z]+", "");
    System.out.println(extract);
}
}