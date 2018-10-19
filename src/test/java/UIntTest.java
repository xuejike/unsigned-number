import com.github.xuejike.unsigned.number.UInt;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author xuejike
 */
public class UIntTest {
    @Test
    public void testGt0(){
        Assert.assertEquals(new UInt((long)0x00f1f2f3).toHexString(),"00F1F2F3");
        Assert.assertEquals(new UInt((long)0x00f100f3).toHexString(),"00F100F3");
        Assert.assertEquals(new UInt(158588).toHexString(),"00026B7C");
    }
    @Test
    public void testLt0(){
        Assert.assertEquals(new UInt((long)0xF0f1f2f3).toHexString(),"F0F1F2F3");
        Assert.assertEquals(new UInt((long)0xF0f100f3).toHexString(),"F0F100F3");
        Assert.assertEquals(new UInt(0xF0f100f3).toHexString(),"F0F100F3");
    }
}
