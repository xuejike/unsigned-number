import com.github.xuejike.unsigned.number.UByte;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author xuejike
 */
public class UByteTest {
    @Test
    public void testGt0(){
        UByte uByte = new UByte((byte) 0xF);
        Assert.assertEquals(uByte.intValue(),15);
    }
    @Test
    public void testEq0(){
        UByte uByte = new UByte((byte) 0x0);
        Assert.assertEquals(uByte.intValue(),0);
    }
    @Test
    public void testLt0(){
        UByte uByte = new UByte((byte) 0x90);
        Assert.assertEquals(uByte.intValue(),144);

    }
}
