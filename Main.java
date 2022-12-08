import java.util.HashMap;
public class Main {

    static void get_number_of_letters(String text) {
        // take away all special caracters
        text = text.replaceAll("\\W", "");
        text = text.toLowerCase();
        System.out.println(text);
        char[] ch = new char[text.length()];
        HashMap<String, Integer> numberof = new HashMap<>();
        // make an array and a hash map and put every caracter in the array
        for (int i = 0; i < text.length(); i++) {
            ch[i] = text.charAt(i);
            System.out.println(ch[i]);


        }
        //counting part
        for (int i = 0; i < text.length(); i++) {
            if (numberof.containsKey(String.valueOf(ch[i]))) {
                int val = numberof.get(String.valueOf(ch[i]));
                numberof.put(String.valueOf(ch[i]), val + 1);

            } else {
                numberof.put(String.valueOf(ch[i]), 1);

            }
            System.out.println(numberof);

        }
    }

    public static void main(String[] Agrs) {
        get_number_of_letters("");
    }

}