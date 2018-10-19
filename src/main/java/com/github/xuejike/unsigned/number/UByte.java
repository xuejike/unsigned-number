package com.github.xuejike.unsigned.number;

/**
 * @author xuejike
 */
public class UByte extends UNumber {
    public static final short MAX_VALUE=0xff;
    public static final short MIN_VALUE=0x00;
    private final byte signed;

    public UByte(byte signed) {
        this.signed = signed;
    }

    @Override
    public int intValue(){
        return signed & MAX_VALUE;
    }

    @Override
    public long longValue() {
        return intValue();
    }

    public short getShortValue(){
        return (short) (signed & MAX_VALUE);
    }



    @Override
    public boolean equals(Object obj) {
        return obj instanceof UByte && signed == ((UByte) obj).signed;
    }

    @Override
    public byte[] getBytes() {
        return new byte[]{signed};
    }


}
