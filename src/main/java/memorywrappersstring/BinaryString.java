package memorywrappersstring;

public class BinaryString {

    /**
     * In this task, we need to implement the method
     * toBinaryString(), which takes the integer value
     * and returns a String representing that number binary form.
     * */

    public String toBinaryString(int value) {
        if (value == 0) {
            return "" + 0;
        }
        StringBuilder binary = new StringBuilder();
        for (int i = value; i > 0; i /= 2) {
            binary.append(i % 2);
        }
        return binary.reverse().toString();
    }
}
