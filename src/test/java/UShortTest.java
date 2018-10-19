import com.github.xuejike.unsigned.number.UShort;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author xuejike
 */
public class UShortTest {
    /**
     * 大于0
     */
    @Test
    public void testGt0(){
        int i = 0x0f << 8;
        UShort uByte = new UShort((short) 0xF11);
        UShort aShort = new UShort(new byte[]{(byte) 0x0F, (byte) 0x11} );

        Assert.assertEquals(uByte,aShort);
        Assert.assertEquals(uByte.intValue(),3857);
        Assert.assertEquals(uByte.toHexString(),"0F11");
    }

    /**
     * 等于0
     */
    @Test
    public void testEq0(){
        UShort uByte = new UShort((short) 0x0);
        UShort aShort = new UShort(new byte[]{(byte) 0x00, (byte) 0x00} );

        Assert.assertEquals(uByte,aShort);
        Assert.assertEquals(uByte.intValue(),0);
        Assert.assertEquals(uByte.toHexString(),"0000");
    }

    /**
     * 小于0
     */
    @Test
    public void testLt0(){
        UShort uByte = new UShort((short) 0xF5F5);
        UShort aShort = new UShort(new byte[]{(byte) 0xF5, (byte) 0xF5} );

        Assert.assertEquals(uByte,aShort);
        Assert.assertEquals(uByte.intValue(),62965);
        Assert.assertEquals(uByte.toHexString(),"F5F5");
    }
    @Test

    public void test(){
        int i = 0xffff;
        short i1 = (short) i;
        int i2 = i1 & 0xffff;
    }
    /**
     * 数组测试
     */
    @Test
    public void testByteArray(){
        UShort uByte = new UShort(new byte[]{(byte) 0x01, (byte) 0x00} );
        Assert.assertEquals(uByte.toHexString(),"0100");
        Assert.assertEquals(new UShort(new byte[]{(byte) 0x00, (byte) 0xF5} ).toHexString(),"00F5");
        Assert.assertEquals(new UShort(0xf0ff).toHexString(),"F0FF");
        Assert.assertEquals(new UShort(0x00ff).toHexString(),"00FF");

    }
}
