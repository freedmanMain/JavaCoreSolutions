package memorywrappersstring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryStringTest {
    BinaryString obj = new BinaryString();

    @Test
    public void to_binary_string_test(){
        assertEquals("101",obj.toBinaryString(5));
        assertEquals("111001", obj.toBinaryString(57));
        assertEquals("0",obj.toBinaryString(0));
    }
}