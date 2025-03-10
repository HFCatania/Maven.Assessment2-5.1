package rocks.zipcode.assessment2.fundamentals;


import com.sun.tools.javac.util.ArrayUtils;
import org.apache.commons.lang3.*;

public class BasicStringUtils {
    /**
     * @param string1 - Base string to be added to
     * @param string2 - String to add to `string1`
     * @return concatenation of `string1` and `string2`
     */
    public static String concatentate(String string1, String string2) {
        String result = string1 + string2;
        return result;
    }

    /**
     * @param string1 - String to be reversed
     * @return an identical string with characters in reverse order
     */
    public static String reverse(String string1) {

        return new StringBuilder(string1).reverse().toString();
    }

    /**
     * @param string1 - first string to be reversed
     * @param string2 - second string to be reversed
     * @return concatenation of the reverse of `string1` and reverse of `string2`
     */
    public static String reverseThenConcatenate(String string1, String string2) {
        String str = new StringBuilder(string1).reverse().toString();
        String str2 = new StringBuilder(string2).reverse().toString();
        String result = str + str2;
        return result;
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - Characters that should be removed from `string`
     * @return `string` with `charactersToRemove` removed
     */
    public static String removeCharacters(String string, String charactersToRemove) {

//
//        String str[] = string.split("");
//        String str2[] = charactersToRemove.split("");
//        ArrayList<String> =
//        for (int i = 0; i < charArray.length; i++) {
//            for (int j = 0; j < charArray2.length; j++) {
//                if(charArray[i] != charArray2[j]){
//
//                }
//            }
//        }
//        String newString = string.replaceAll(charactersToRemove, "");
//        String newString2 = newString.replaceAll(charactersToRemove, "");
//        String result = newString2.replaceAll(charactersToRemove, "");
        return null;
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - characters to be removed from the string
     * @return reverse of `string` with `charactersToRemove` removed
     */
    public static String removeCharactersThenReverse(String string, String charactersToRemove) {
        return null;
    }
}
