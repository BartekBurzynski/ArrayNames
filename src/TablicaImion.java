import java.util.Arrays;

public class TablicaImion {
    public static void main(String[] args) {
        String[] names = new String[3];
        names [0] = "Bartek";
        names [1] = "Tomek";
        names [2] = "Maciej";

       String arrayNames = Arrays.toString(names);
        System.out.println(arrayNames);

    }
}
