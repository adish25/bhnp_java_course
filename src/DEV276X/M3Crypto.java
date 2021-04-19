package DEV276X;

public class M3Crypto {
    public static void main(String[] args) {
        //System.out.println(normalizeText("This is some \"really\" great. (Text)!?"));

        //System.out.println("shiftAlphabet test:" + shiftAlphabet(1));

        //System.out.println(caesarify(normalizeText("This is some \"really\" great. (Text)!?"), 2));

        //System.out.println(groupify("THISISSOMEREALLYGREATTEXT", 2));
        //System.out.println(groupify("ADI", 5));
        System.out.println("OUT=" + encryptString("This is some \"really\" great. (Text)!?", 2, 5));

    }

    public static String normalizeText(String text) {
        return text.replaceAll("[. , : ; ’ ” ! ? ( )\"]", "").toUpperCase();
    }

    public static String caesarify(String text, int key) {
        String alphabet = shiftAlphabet(0);
        String shiftedAlphabet = shiftAlphabet(key);
        String result = "";
        int pos;

        for (int i = 0; i < text.length(); i++) {
            pos = alphabet.indexOf(text.charAt(i));
            result = result + shiftedAlphabet.charAt(pos);
        }

        return result;
    }

    public static String groupify(String text, int groupLen) {
        String result = "";
        int pos = 0;
        while ((pos + groupLen) < text.length()) {
            result = result + text.substring(pos, pos + groupLen) + " ";
            //System.out.println(result + " pos=" + pos + " len=" + (pos + groupLen));
            pos += groupLen;
        }

        if (pos < text.length()) {
            result = result + text.substring(pos, text.length());
            int lastPos = pos + groupLen;
            pos++;
            while (pos < lastPos) {
                result = result + "X";
                pos++;
            }
        }

        return result;
    }

    public static String shiftAlphabet(int shift) {
        int start = 0;
        if (shift < 0) {
            start = (int) 'Z' + shift + 1;
        } else {
            start = 'A' + shift;
        }
        String result = "";
        char currChar = (char) start;
        for (; currChar <= 'Z'; ++currChar) {
            result = result + currChar;
        }
        if (result.length() < 26) {
            for (currChar = 'A'; result.length() < 26; ++currChar) {
                result = result + currChar;
            }
        }
        return result;
    }

    public static String encryptString(String text, int shift, int groupLen) {

        System.out.println("in =" + text);
        return groupify(caesarify(normalizeText(text), shift), groupLen);

    }
}
