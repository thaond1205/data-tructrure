
public class ReverseInteger {

    // đảo ngược số
    // input -342784729
    // output -927487243

    public static void main(String[] args) {
        int x = -342784729;
        StringBuilder beforRevert = new StringBuilder();
        StringBuilder affterRevert = new StringBuilder();
        beforRevert.append(String.valueOf(x));

        for (int i = beforRevert.length() - 1; i >= 0; i--) {
            if (i == beforRevert.length() - 1) {
                affterRevert.append(beforRevert.charAt(0));
            }
            if (i > 0) {
                affterRevert.append(beforRevert.charAt(i));
            }
        }
        System.out.println(Integer.parseInt(String.valueOf(affterRevert)));
    }
}
