package com.github.xuejike.unsigned.number;

/**
 * @author xuejike
 */
public class UInt extends UNumber{
    public static final long MIN_VALUE = 0x00000000;
    public static final long MAX_VALUE = 0xFFFFFFFF;
    private  int signed;

    public UInt(int signed) {
        this.signed = signed;
    }
    public UInt(long data) {
        this.signed = (int) data;
    }
    public UInt(byte[] data){
        if (data == null ){
            throw new NullPointerException("data is null");
        }
        if (data.length == 4){
            this.signed = data[0]<<24 | data[1] << 16 | data[2] <<8 | data[3];
        }else{
            throw new RuntimeException("data size <> 4");
        }
    }

    @Override
    public byte[] getBytes() {
        return new byte[] { (byte) (signed >>> 24), (byte) (signed >>> 16),
                (byte) (signed >>> 8), (byte) (signed )};
    }

    @Override
    public int intValue() {
        return signed;
    }

    @Override
    public long longValue() {
        return signed & MAX_VALUE;
    }
}
