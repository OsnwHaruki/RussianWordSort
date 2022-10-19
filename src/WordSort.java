import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;


public class WordSort {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public HashMap<Integer, Character> getOptions() throws IOException {
        HashMap<Integer,Character> map = new HashMap<>();
        System.out.println("Добро пожаловать! " +  "\n" + "Чтобы завершить ввод данных напишите 'Конец'");
        while(!reader.readLine().equals("Конец")){
            System.out.println("Введите положение буквы в слове: ");
            int c = Integer.parseInt(reader.readLine())-1;
            System.out.println("Введите букву:");
            String cs = reader.readLine();
            if(cs.length() == 1){
                map.put(c, cs.charAt(0));
            }
            else{
                System.out.println("Ошибка! Нужно ввести одну букву, попробуйте еще раз ");
            }

        }
        return map;
    }
    public ArrayList<String> sortGoodWords(ArrayList<String> words) throws IOException {
        ArrayList<String> mainArray = new ArrayList<>();
        HashMap<Integer,Character> op = getOptions();
        System.out.println("Наконец введите длину нужного слова: ");
        int len = Integer.parseInt(reader.readLine())+1;
        int checker = op.size();
        for (String RuWord : words) {
            int chek = 0;
            if (RuWord.length() == len) {
                for (int ind : op.keySet()) {
                    if (String.valueOf(RuWord.charAt(ind)).equalsIgnoreCase(String.valueOf(op.get(ind)))) {
                        chek++;
                    }
                }
            }
            if(chek == checker){
                mainArray.add(RuWord);
            }
        }
        return mainArray;
    }

}
