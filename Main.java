import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        WordChecker w = new WordChecker();
        ArrayList<String> words = new ArrayList<String>();
        words.add("an");
        words.add("band");
        words.add("band");
        words.add("abandon");
        System.out.println(words);
        WordChecker x = new WordChecker(words);
        System.out.println(x.isWordChain());

        WordChecker y = new WordChecker();
        ArrayList<String> word3 = new ArrayList<String>();
        word3.add("to");
        word3.add("too");
        word3.add("stool");
        word3.add("tools");
        System.out.println(word3);
        WordChecker word4 = new WordChecker(word3);
        System.out.println(word4.isWordChain());

        WordChecker d = new WordChecker();
        ArrayList c = new ArrayList<String>();
        c.add("catch");
        c.add("bobcat");
        c.add("catchacat");
        c.add("cat");
        c.add("at");
        System.out.println(c);

    }
}