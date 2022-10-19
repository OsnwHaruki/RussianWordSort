import java.io.IOException;
import java.util.ArrayList;

public class Finder {
    public static void main(String[] args) throws IOException {
        ImportBase repository = new ImportBase();
        ArrayList<String> words = new ArrayList<>(repository.ListGet("https://raw.githubusercontent.com/Harrix/Russian-Nouns/main/dist/russian_nouns.txt"));
        System.out.println(words.get(1));
        WordSort wordSort = new WordSort();
        ArrayList<String> goodWords = new ArrayList<>(wordSort.sortGoodWords(words));
        for(String s : goodWords){
            System.out.println(s);
        }



    }
}
