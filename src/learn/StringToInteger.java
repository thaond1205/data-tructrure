package learn;

public class StringToInteger {

    static String inputString = "eeee123 ádasdad 3243";

    public static void main(String[] args) {
        StringBuilder strB = new StringBuilder();
        Integer convertFormString = null;
        for (char str : inputString.toCharArray()) {
            if (Character.isDigit(str)) {
                strB.append(str);
            }
        }
        convertFormString = Integer.valueOf(strB.toString());
        System.out.println(convertFormString);

    }
}