import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;

public class ImportBase {

    public ArrayList<String> ListGet(String urls) throws IOException {
        URL url = new URL(urls);
        ArrayList<String> arrayList =  new ArrayList<>();
        InputStream stream = url.openStream();
        String str = new String(stream.readAllBytes(), "UTF-8");
        StringBuilder localWord = new StringBuilder();
        for (int i = 0; i <str.length() ; i++) {
            localWord.append(str.charAt(i));
            if(str.charAt(i) == '\n'){
                arrayList.add(localWord.toString());
                localWord.delete(0,localWord.length());
            }
        }
        return arrayList;
    }
}
