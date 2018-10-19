package com.github.xuejike.unsigned.number;

import java.util.Collections;

/**
 * @author xuejike
 */
public abstract class UNumber {
    private static final char[] HEX_CHAR = {'0', '1', '2', '3', '4', '5',
            '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public abstract byte[] getBytes();
    public byte[] getBytes(EncodeType encodeType){
        byte[] bytes = getBytes();
        if (encodeType == EncodeType.BigEndian){
            return bytes;
        }else{
            return  reversalBytes(bytes);
        }
    }


    public byte[] reversalBytes(byte[] bytes){

        if (bytes.length < 2){
            return bytes;
        }
        byte tmp;
        for (int i = 0; i < bytes.length/2; i++) {
            tmp = bytes[i];
            bytes[i] = bytes[bytes.length-1-i];
            bytes[bytes.length-1-i]=tmp;
        }
        return  bytes;
    }
    public String toHexString(EncodeType encodeType){
        byte[] bytes = getBytes(encodeType);
        char[] buf = new char[bytes.length * 2];
        int index = 0;
        for(byte b : bytes) {
            buf[index++] = HEX_CHAR[b >>> 4 & 0xf];
            buf[index++] = HEX_CHAR[b & 0xf];
        }

        return new String(buf);

    }
    public String toHexString(){
        return toHexString(EncodeType.BigEndian);
    }

    public abstract int intValue();
    public abstract long longValue();

    @Override
    public int hashCode() {
        return intValue();
    }

    @Override
    public String toString() {
        return String.valueOf(longValue());
    }
}
