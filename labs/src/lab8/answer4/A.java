/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 08/03/2024
 * Time : 17:24
 * Project Name : lab8
 */
package lab8.answer4;

import java.util.ArrayList;
import java.util.List;

class A{
    public static void main(String args[]){
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("melon");
        System.out.println(countWords(list,'e','d',5));
    }
    static public int countWords(List<String> words, char c, char d, int len){

        return words.stream()
                .filter(word -> word.length() == len)
                .filter(word -> word.contains(STR."\{c}"))
                .filter(word -> !word.contains(STR."\{d}"))
                .toList().size();
    }
}
