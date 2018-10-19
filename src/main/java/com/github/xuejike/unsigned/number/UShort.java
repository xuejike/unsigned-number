package com.github.xuejike.unsigned.number;

/**
 * @author xuejike
 */
public class UShort extends UNumber {
    public static final int MIN_VALUE = 0x0000;
    public static final int MAX_VALUE = 0xFFFF;
    private  short signed;
    public UShort(short signed) {
        this.signed = signed;
    }

    public UShort(byte[] data){
        this(data,EncodeType.BigEndian);
    }
    public UShort(byte[] data,EncodeType encodeType){
        if (encodeType == EncodeType.LittleEndian){
            data = reversalBytes(data);
        }
        if (data == null){
            throw new NullPointerException("data is null");
        }
        if (data.length == 2 ){
            signed = (short) (( (data[0]<<8)) | (data[1]&0xff));
        }else{
            throw new RuntimeException("data size != 2");
        }
    }
    public UShort(int data){
        signed = (short) (data);
    }



    @Override
    public byte[] getBytes() {

        byte[] data = new byte[2];
        data[0]= (byte) (signed >>> 8);
        data[1]= (byte) signed;
        return data;
    }

    @Override
    public int intValue() {
        return signed & MAX_VALUE;
    }

    @Override
    public long longValue() {
        return intValue();
    }



    @Override
    public boolean equals(Object obj) {
        if (obj instanceof UShort){
            return ((UShort) obj).signed == signed;
        }
        return false;
    }
}
