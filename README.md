# 无符号数字类型[![](https://jitpack.io/v/xuejike/unsigned-number.svg)](https://jitpack.io/#xuejike/unsigned-number)

java 无符号数字类型处理
支持 无符号数字类型转byte数组(Big Endian  和 Little Endian)
默认采用 Big Endian 模式,可以通过参数设置采用的编码模式
```xml
	<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
	
	
	<dependency>
    	    <groupId>com.github.xuejike</groupId>
    	    <artifactId>unsigned-number</artifactId>
    	    <version>0.1</version>
    	</dependency>
```


```java
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
```