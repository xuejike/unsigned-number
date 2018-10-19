import com.github.xuejike.unsigned.number.EncodeType;
import com.github.xuejike.unsigned.number.UByte;
import com.github.xuejike.unsigned.number.UInt;
import com.github.xuejike.unsigned.number.UShort;

/**
 * @author xuejike
 */
public class Test {
    @org.junit.Test
    public void test(){
        System.out.println(new UByte(0xff));  // 255
        System.out.println(new UShort(0xffff));  // 65535
        System.out.println(new UInt(0xffffffff));  // 4294967295

        System.out.println(new UByte(0xf0).toHexString());  // F0
        System.out.println(new UShort(0xf123).toHexString());  // F123
        System.out.println(new UInt(0xf1234567).toHexString());  // F1234567

        System.out.println(new UByte(0xf0).toHexString(EncodeType.LittleEndian));  // F0
        System.out.println(new UShort(0xf123).toHexString(EncodeType.LittleEndian));  // 23F1
        System.out.println(new UInt(0xf1234567).toHexString(EncodeType.LittleEndian));  // 674523F1

        System.out.println(new UByte((byte) 0xff));  // 255
        System.out.println(new UShort(new byte[]{(byte) 0xff, (byte) 0xff}));  // 65535
        System.out.println(new UInt(new byte[]{(byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff}));  // 4294967295

    }
}
