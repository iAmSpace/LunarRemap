package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.ByteBufAllocator
 *  io.netty.buffer.ByteBufProcessor
 */
import com.google.common.base.Charsets;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.ByteBufProcessor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.nio.charset.Charset;

public class PacketBuffer
extends ByteBuf {
    private final ByteBuf lllIIIllIIIIlllIlIIllIIll;

    public PacketBuffer(ByteBuf byteBuf) {
        this.lllIIIllIIIIlllIlIIllIIll = byteBuf;
    }

    public static int lllIIIllIIIIlllIlIIllIIll(int n) {
        return (n & 0xFFFFFF80) == 0 ? 1 : ((n & 0xFFFFC000) == 0 ? 2 : ((n & 0xFFE00000) == 0 ? 3 : ((n & 0xF0000000) == 0 ? 4 : 5)));
    }

    public int readVarIntFromBuffer() {
        byte by;
        int n = 0;
        int n2 = 0;
        do {
            by = this.readByte();
            n |= (by & 0x7F) << n2++ * 7;
            if (n2 <= 5) continue;
            throw new RuntimeException("VarInt too big");
        } while ((by & 0x80) == 128);
        return n;
    }

    public void writeVarIntToBuffer(int n) {
        while ((n & 0xFFFFFF80) != 0) {
            this.writeByte(n & 0x7F | 0x80);
            n >>>= 7;
        }
        this.writeByte(n);
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        if (class_07752 == null) {
            this.writeShort(-1);
        } else {
            byte[] arrby = class_0893.lllIIIllIIIIlllIlIIllIIll(class_07752);
            this.writeShort((short)arrby.length);
            this.writeBytes(arrby);
        }
    }

    public class_0775 lllIlIIlIIIlIlIIIllIlllIl() {
        short s = this.readShort();
        if (s < 0) {
            return null;
        }
        byte[] arrby = new byte[s];
        this.readBytes(arrby);
        return class_0893.lllIIIllIIIIlllIlIIllIIll(arrby, new class_1633(0x200000L));
    }

    public void lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972) {
        if (class_08972 == null) {
            this.writeShort(-1);
        } else {
            this.writeShort(Item.lllIIIllIIIIlllIlIIllIIll(class_08972.lllIIIllIIIIlllIlIIllIIll()));
            this.writeByte(class_08972.lllIlIIlIIIlIlIIIllIlllIl);
            this.writeShort(class_08972.IllIIIllIIIIlIlIlIllIIlll());
            class_0775 class_07752 = null;
            if (class_08972.lllIIIllIIIIlllIlIIllIIll().lIllllIIlIIIlIllllllIIIll() || class_08972.lllIIIllIIIIlllIlIIllIIll().lIIIIlIlIIlllllIIllIIlIII()) {
                class_07752 = class_08972.lIlllIlllIIIIlIIlllIllIII;
            }
            this.lllIIIllIIIIlllIlIIllIIll(class_07752);
        }
    }

    public ItemStack IlIllllllIIlIIllllIIlIIIl() {
        ItemStack class_08972 = null;
        short s = this.readShort();
        if (s >= 0) {
            byte by = this.readByte();
            short s2 = this.readShort();
            class_08972 = new ItemStack(Item.lllIIIllIIIIlllIlIIllIIll(s), (int)by, (int)s2);
            class_08972.lIlllIlllIIIIlIIlllIllIII = this.lllIlIIlIIIlIlIIIllIlllIl();
        }
        return class_08972;
    }

    public String readStringFromBuffer(int n) {
        int n2 = this.readVarIntFromBuffer();
        if (n2 > n * 4) {
            throw new IOException("The received encoded string buffer length is longer than maximum allowed (" + n2 + " > " + n * 4 + ")");
        }
        if (n2 < 0) {
            throw new IOException("The received encoded string buffer length is less than zero! Weird string!");
        }
        String string = new String(this.readBytes(n2).array(), Charsets.UTF_8);
        if (string.length() > n) {
            throw new IOException("The received string length is longer than maximum allowed (" + n2 + " > " + n + ")");
        }
        return string;
    }

    public void writeStringToBuffer(String string) {
        byte[] arrby = string.getBytes(Charsets.UTF_8);
        if (arrby.length > 32767) {
            throw new IOException("String too big (was " + string.length() + " bytes encoded, max " + 32767 + ")");
        }
        this.writeVarIntToBuffer(arrby.length);
        this.writeBytes(arrby);
    }

    public int capacity() {
        return this.lllIIIllIIIIlllIlIIllIIll.capacity();
    }

    public ByteBuf capacity(int n) {
        return this.lllIIIllIIIIlllIlIIllIIll.capacity(n);
    }

    public int maxCapacity() {
        return this.lllIIIllIIIIlllIlIIllIIll.maxCapacity();
    }

    public ByteBufAllocator alloc() {
        return this.lllIIIllIIIIlllIlIIllIIll.alloc();
    }

    public ByteOrder order() {
        return this.lllIIIllIIIIlllIlIIllIIll.order();
    }

    public ByteBuf order(ByteOrder byteOrder) {
        return this.lllIIIllIIIIlllIlIIllIIll.order(byteOrder);
    }

    public ByteBuf unwrap() {
        return this.lllIIIllIIIIlllIlIIllIIll.unwrap();
    }

    public boolean isDirect() {
        return this.lllIIIllIIIIlllIlIIllIIll.isDirect();
    }

    public int readerIndex() {
        return this.lllIIIllIIIIlllIlIIllIIll.readerIndex();
    }

    public ByteBuf readerIndex(int n) {
        return this.lllIIIllIIIIlllIlIIllIIll.readerIndex(n);
    }

    public int writerIndex() {
        return this.lllIIIllIIIIlllIlIIllIIll.writerIndex();
    }

    public ByteBuf writerIndex(int n) {
        return this.lllIIIllIIIIlllIlIIllIIll.writerIndex(n);
    }

    public ByteBuf setIndex(int n, int n2) {
        return this.lllIIIllIIIIlllIlIIllIIll.setIndex(n, n2);
    }

    public int readableBytes() {
        return this.lllIIIllIIIIlllIlIIllIIll.readableBytes();
    }

    public int writableBytes() {
        return this.lllIIIllIIIIlllIlIIllIIll.writableBytes();
    }

    public int maxWritableBytes() {
        return this.lllIIIllIIIIlllIlIIllIIll.maxWritableBytes();
    }

    public boolean isReadable() {
        return this.lllIIIllIIIIlllIlIIllIIll.isReadable();
    }

    public boolean isReadable(int n) {
        return this.lllIIIllIIIIlllIlIIllIIll.isReadable(n);
    }

    public boolean isWritable() {
        return this.lllIIIllIIIIlllIlIIllIIll.isWritable();
    }

    public boolean isWritable(int n) {
        return this.lllIIIllIIIIlllIlIIllIIll.isWritable(n);
    }

    public ByteBuf clear() {
        return this.lllIIIllIIIIlllIlIIllIIll.clear();
    }

    public ByteBuf markReaderIndex() {
        return this.lllIIIllIIIIlllIlIIllIIll.markReaderIndex();
    }

    public ByteBuf resetReaderIndex() {
        return this.lllIIIllIIIIlllIlIIllIIll.resetReaderIndex();
    }

    public ByteBuf markWriterIndex() {
        return this.lllIIIllIIIIlllIlIIllIIll.markWriterIndex();
    }

    public ByteBuf resetWriterIndex() {
        return this.lllIIIllIIIIlllIlIIllIIll.resetWriterIndex();
    }

    public ByteBuf discardReadBytes() {
        return this.lllIIIllIIIIlllIlIIllIIll.discardReadBytes();
    }

    public ByteBuf discardSomeReadBytes() {
        return this.lllIIIllIIIIlllIlIIllIIll.discardSomeReadBytes();
    }

    public ByteBuf ensureWritable(int n) {
        return this.lllIIIllIIIIlllIlIIllIIll.ensureWritable(n);
    }

    public int ensureWritable(int n, boolean bl) {
        return this.lllIIIllIIIIlllIlIIllIIll.ensureWritable(n, bl);
    }

    public boolean getBoolean(int n) {
        return this.lllIIIllIIIIlllIlIIllIIll.getBoolean(n);
    }

    public byte getByte(int n) {
        return this.lllIIIllIIIIlllIlIIllIIll.getByte(n);
    }

    public short getUnsignedByte(int n) {
        return this.lllIIIllIIIIlllIlIIllIIll.getUnsignedByte(n);
    }

    public short getShort(int n) {
        return this.lllIIIllIIIIlllIlIIllIIll.getShort(n);
    }

    public int getUnsignedShort(int n) {
        return this.lllIIIllIIIIlllIlIIllIIll.getUnsignedShort(n);
    }

    public int getMedium(int n) {
        return this.lllIIIllIIIIlllIlIIllIIll.getMedium(n);
    }

    public int getUnsignedMedium(int n) {
        return this.lllIIIllIIIIlllIlIIllIIll.getUnsignedMedium(n);
    }

    public int getInt(int n) {
        return this.lllIIIllIIIIlllIlIIllIIll.getInt(n);
    }

    public long getUnsignedInt(int n) {
        return this.lllIIIllIIIIlllIlIIllIIll.getUnsignedInt(n);
    }

    public long getLong(int n) {
        return this.lllIIIllIIIIlllIlIIllIIll.getLong(n);
    }

    public char getChar(int n) {
        return this.lllIIIllIIIIlllIlIIllIIll.getChar(n);
    }

    public float getFloat(int n) {
        return this.lllIIIllIIIIlllIlIIllIIll.getFloat(n);
    }

    public double getDouble(int n) {
        return this.lllIIIllIIIIlllIlIIllIIll.getDouble(n);
    }

    public ByteBuf getBytes(int n, ByteBuf byteBuf) {
        return this.lllIIIllIIIIlllIlIIllIIll.getBytes(n, byteBuf);
    }

    public ByteBuf getBytes(int n, ByteBuf byteBuf, int n2) {
        return this.lllIIIllIIIIlllIlIIllIIll.getBytes(n, byteBuf, n2);
    }

    public ByteBuf getBytes(int n, ByteBuf byteBuf, int n2, int n3) {
        return this.lllIIIllIIIIlllIlIIllIIll.getBytes(n, byteBuf, n2, n3);
    }

    public ByteBuf getBytes(int n, byte[] arrby) {
        return this.lllIIIllIIIIlllIlIIllIIll.getBytes(n, arrby);
    }

    public ByteBuf getBytes(int n, byte[] arrby, int n2, int n3) {
        return this.lllIIIllIIIIlllIlIIllIIll.getBytes(n, arrby, n2, n3);
    }

    public ByteBuf getBytes(int n, ByteBuffer byteBuffer) {
        return this.lllIIIllIIIIlllIlIIllIIll.getBytes(n, byteBuffer);
    }

    public ByteBuf getBytes(int n, OutputStream outputStream, int n2) {
        return this.lllIIIllIIIIlllIlIIllIIll.getBytes(n, outputStream, n2);
    }

    public int getBytes(int n, GatheringByteChannel gatheringByteChannel, int n2) {
        return this.lllIIIllIIIIlllIlIIllIIll.getBytes(n, gatheringByteChannel, n2);
    }

    public ByteBuf setBoolean(int n, boolean bl) {
        return this.lllIIIllIIIIlllIlIIllIIll.setBoolean(n, bl);
    }

    public ByteBuf setByte(int n, int n2) {
        return this.lllIIIllIIIIlllIlIIllIIll.setByte(n, n2);
    }

    public ByteBuf setShort(int n, int n2) {
        return this.lllIIIllIIIIlllIlIIllIIll.setShort(n, n2);
    }

    public ByteBuf setMedium(int n, int n2) {
        return this.lllIIIllIIIIlllIlIIllIIll.setMedium(n, n2);
    }

    public ByteBuf setInt(int n, int n2) {
        return this.lllIIIllIIIIlllIlIIllIIll.setInt(n, n2);
    }

    public ByteBuf setLong(int n, long l) {
        return this.lllIIIllIIIIlllIlIIllIIll.setLong(n, l);
    }

    public ByteBuf setChar(int n, int n2) {
        return this.lllIIIllIIIIlllIlIIllIIll.setChar(n, n2);
    }

    public ByteBuf setFloat(int n, float f) {
        return this.lllIIIllIIIIlllIlIIllIIll.setFloat(n, f);
    }

    public ByteBuf setDouble(int n, double d) {
        return this.lllIIIllIIIIlllIlIIllIIll.setDouble(n, d);
    }

    public ByteBuf setBytes(int n, ByteBuf byteBuf) {
        return this.lllIIIllIIIIlllIlIIllIIll.setBytes(n, byteBuf);
    }

    public ByteBuf setBytes(int n, ByteBuf byteBuf, int n2) {
        return this.lllIIIllIIIIlllIlIIllIIll.setBytes(n, byteBuf, n2);
    }

    public ByteBuf setBytes(int n, ByteBuf byteBuf, int n2, int n3) {
        return this.lllIIIllIIIIlllIlIIllIIll.setBytes(n, byteBuf, n2, n3);
    }

    public ByteBuf setBytes(int n, byte[] arrby) {
        return this.lllIIIllIIIIlllIlIIllIIll.setBytes(n, arrby);
    }

    public ByteBuf setBytes(int n, byte[] arrby, int n2, int n3) {
        return this.lllIIIllIIIIlllIlIIllIIll.setBytes(n, arrby, n2, n3);
    }

    public ByteBuf setBytes(int n, ByteBuffer byteBuffer) {
        return this.lllIIIllIIIIlllIlIIllIIll.setBytes(n, byteBuffer);
    }

    public int setBytes(int n, InputStream inputStream, int n2) {
        return this.lllIIIllIIIIlllIlIIllIIll.setBytes(n, inputStream, n2);
    }

    public int setBytes(int n, ScatteringByteChannel scatteringByteChannel, int n2) {
        return this.lllIIIllIIIIlllIlIIllIIll.setBytes(n, scatteringByteChannel, n2);
    }

    public ByteBuf setZero(int n, int n2) {
        return this.lllIIIllIIIIlllIlIIllIIll.setZero(n, n2);
    }

    public boolean readBoolean() {
        return this.lllIIIllIIIIlllIlIIllIIll.readBoolean();
    }

    public byte readByte() {
        return this.lllIIIllIIIIlllIlIIllIIll.readByte();
    }

    public short readUnsignedByte() {
        return this.lllIIIllIIIIlllIlIIllIIll.readUnsignedByte();
    }

    public short readShort() {
        return this.lllIIIllIIIIlllIlIIllIIll.readShort();
    }

    public int readUnsignedShort() {
        return this.lllIIIllIIIIlllIlIIllIIll.readUnsignedShort();
    }

    public int readMedium() {
        return this.lllIIIllIIIIlllIlIIllIIll.readMedium();
    }

    public int readUnsignedMedium() {
        return this.lllIIIllIIIIlllIlIIllIIll.readUnsignedMedium();
    }

    public int readInt() {
        return this.lllIIIllIIIIlllIlIIllIIll.readInt();
    }

    public long readUnsignedInt() {
        return this.lllIIIllIIIIlllIlIIllIIll.readUnsignedInt();
    }

    public long readLong() {
        return this.lllIIIllIIIIlllIlIIllIIll.readLong();
    }

    public char readChar() {
        return this.lllIIIllIIIIlllIlIIllIIll.readChar();
    }

    public float readFloat() {
        return this.lllIIIllIIIIlllIlIIllIIll.readFloat();
    }

    public double readDouble() {
        return this.lllIIIllIIIIlllIlIIllIIll.readDouble();
    }

    public ByteBuf readBytes(int n) {
        return this.lllIIIllIIIIlllIlIIllIIll.readBytes(n);
    }

    public ByteBuf readSlice(int n) {
        return this.lllIIIllIIIIlllIlIIllIIll.readSlice(n);
    }

    public ByteBuf readBytes(ByteBuf byteBuf) {
        return this.lllIIIllIIIIlllIlIIllIIll.readBytes(byteBuf);
    }

    public ByteBuf readBytes(ByteBuf byteBuf, int n) {
        return this.lllIIIllIIIIlllIlIIllIIll.readBytes(byteBuf, n);
    }

    public ByteBuf readBytes(ByteBuf byteBuf, int n, int n2) {
        return this.lllIIIllIIIIlllIlIIllIIll.readBytes(byteBuf, n, n2);
    }

    public ByteBuf readBytes(byte[] arrby) {
        return this.lllIIIllIIIIlllIlIIllIIll.readBytes(arrby);
    }

    public ByteBuf readBytes(byte[] arrby, int n, int n2) {
        return this.lllIIIllIIIIlllIlIIllIIll.readBytes(arrby, n, n2);
    }

    public ByteBuf readBytes(ByteBuffer byteBuffer) {
        return this.lllIIIllIIIIlllIlIIllIIll.readBytes(byteBuffer);
    }

    public ByteBuf readBytes(OutputStream outputStream, int n) {
        return this.lllIIIllIIIIlllIlIIllIIll.readBytes(outputStream, n);
    }

    public int readBytes(GatheringByteChannel gatheringByteChannel, int n) {
        return this.lllIIIllIIIIlllIlIIllIIll.readBytes(gatheringByteChannel, n);
    }

    public ByteBuf skipBytes(int n) {
        return this.lllIIIllIIIIlllIlIIllIIll.skipBytes(n);
    }

    public ByteBuf writeBoolean(boolean bl) {
        return this.lllIIIllIIIIlllIlIIllIIll.writeBoolean(bl);
    }

    public ByteBuf writeByte(int n) {
        return this.lllIIIllIIIIlllIlIIllIIll.writeByte(n);
    }

    public ByteBuf writeShort(int n) {
        return this.lllIIIllIIIIlllIlIIllIIll.writeShort(n);
    }

    public ByteBuf writeMedium(int n) {
        return this.lllIIIllIIIIlllIlIIllIIll.writeMedium(n);
    }

    public ByteBuf writeInt(int n) {
        return this.lllIIIllIIIIlllIlIIllIIll.writeInt(n);
    }

    public ByteBuf writeLong(long l) {
        return this.lllIIIllIIIIlllIlIIllIIll.writeLong(l);
    }

    public ByteBuf writeChar(int n) {
        return this.lllIIIllIIIIlllIlIIllIIll.writeChar(n);
    }

    public ByteBuf writeFloat(float f) {
        return this.lllIIIllIIIIlllIlIIllIIll.writeFloat(f);
    }

    public ByteBuf writeDouble(double d) {
        return this.lllIIIllIIIIlllIlIIllIIll.writeDouble(d);
    }

    public ByteBuf writeBytes(ByteBuf byteBuf) {
        return this.lllIIIllIIIIlllIlIIllIIll.writeBytes(byteBuf);
    }

    public ByteBuf writeBytes(ByteBuf byteBuf, int n) {
        return this.lllIIIllIIIIlllIlIIllIIll.writeBytes(byteBuf, n);
    }

    public ByteBuf writeBytes(ByteBuf byteBuf, int n, int n2) {
        return this.lllIIIllIIIIlllIlIIllIIll.writeBytes(byteBuf, n, n2);
    }

    public ByteBuf writeBytes(byte[] arrby) {
        return this.lllIIIllIIIIlllIlIIllIIll.writeBytes(arrby);
    }

    public ByteBuf writeBytes(byte[] arrby, int n, int n2) {
        return this.lllIIIllIIIIlllIlIIllIIll.writeBytes(arrby, n, n2);
    }

    public ByteBuf writeBytes(ByteBuffer byteBuffer) {
        return this.lllIIIllIIIIlllIlIIllIIll.writeBytes(byteBuffer);
    }

    public int writeBytes(InputStream inputStream, int n) {
        return this.lllIIIllIIIIlllIlIIllIIll.writeBytes(inputStream, n);
    }

    public int writeBytes(ScatteringByteChannel scatteringByteChannel, int n) {
        return this.lllIIIllIIIIlllIlIIllIIll.writeBytes(scatteringByteChannel, n);
    }

    public ByteBuf writeZero(int n) {
        return this.lllIIIllIIIIlllIlIIllIIll.writeZero(n);
    }

    public int indexOf(int n, int n2, byte by) {
        return this.lllIIIllIIIIlllIlIIllIIll.indexOf(n, n2, by);
    }

    public int bytesBefore(byte by) {
        return this.lllIIIllIIIIlllIlIIllIIll.bytesBefore(by);
    }

    public int bytesBefore(int n, byte by) {
        return this.lllIIIllIIIIlllIlIIllIIll.bytesBefore(n, by);
    }

    public int bytesBefore(int n, int n2, byte by) {
        return this.lllIIIllIIIIlllIlIIllIIll.bytesBefore(n, n2, by);
    }

    public int forEachByte(ByteBufProcessor byteBufProcessor) {
        return this.lllIIIllIIIIlllIlIIllIIll.forEachByte(byteBufProcessor);
    }

    public int forEachByte(int n, int n2, ByteBufProcessor byteBufProcessor) {
        return this.lllIIIllIIIIlllIlIIllIIll.forEachByte(n, n2, byteBufProcessor);
    }

    public int forEachByteDesc(ByteBufProcessor byteBufProcessor) {
        return this.lllIIIllIIIIlllIlIIllIIll.forEachByteDesc(byteBufProcessor);
    }

    public int forEachByteDesc(int n, int n2, ByteBufProcessor byteBufProcessor) {
        return this.lllIIIllIIIIlllIlIIllIIll.forEachByteDesc(n, n2, byteBufProcessor);
    }

    public ByteBuf copy() {
        return this.lllIIIllIIIIlllIlIIllIIll.copy();
    }

    public ByteBuf copy(int n, int n2) {
        return this.lllIIIllIIIIlllIlIIllIIll.copy(n, n2);
    }

    public ByteBuf slice() {
        return this.lllIIIllIIIIlllIlIIllIIll.slice();
    }

    public ByteBuf slice(int n, int n2) {
        return this.lllIIIllIIIIlllIlIIllIIll.slice(n, n2);
    }

    public ByteBuf duplicate() {
        return this.lllIIIllIIIIlllIlIIllIIll.duplicate();
    }

    public int nioBufferCount() {
        return this.lllIIIllIIIIlllIlIIllIIll.nioBufferCount();
    }

    public ByteBuffer nioBuffer() {
        return this.lllIIIllIIIIlllIlIIllIIll.nioBuffer();
    }

    public ByteBuffer nioBuffer(int n, int n2) {
        return this.lllIIIllIIIIlllIlIIllIIll.nioBuffer(n, n2);
    }

    public ByteBuffer internalNioBuffer(int n, int n2) {
        return this.lllIIIllIIIIlllIlIIllIIll.internalNioBuffer(n, n2);
    }

    public ByteBuffer[] nioBuffers() {
        return this.lllIIIllIIIIlllIlIIllIIll.nioBuffers();
    }

    public ByteBuffer[] nioBuffers(int n, int n2) {
        return this.lllIIIllIIIIlllIlIIllIIll.nioBuffers(n, n2);
    }

    public boolean hasArray() {
        return this.lllIIIllIIIIlllIlIIllIIll.hasArray();
    }

    public byte[] array() {
        return this.lllIIIllIIIIlllIlIIllIIll.array();
    }

    public int arrayOffset() {
        return this.lllIIIllIIIIlllIlIIllIIll.arrayOffset();
    }

    public boolean hasMemoryAddress() {
        return this.lllIIIllIIIIlllIlIIllIIll.hasMemoryAddress();
    }

    public long memoryAddress() {
        return this.lllIIIllIIIIlllIlIIllIIll.memoryAddress();
    }

    public String toString(Charset charset) {
        return this.lllIIIllIIIIlllIlIIllIIll.toString(charset);
    }

    public String toString(int n, int n2, Charset charset) {
        return this.lllIIIllIIIIlllIlIIllIIll.toString(n, n2, charset);
    }

    public int hashCode() {
        return this.lllIIIllIIIIlllIlIIllIIll.hashCode();
    }

    public boolean equals(Object object) {
        return this.lllIIIllIIIIlllIlIIllIIll.equals(object);
    }

    public int compareTo(ByteBuf byteBuf) {
        return this.lllIIIllIIIIlllIlIIllIIll.compareTo(byteBuf);
    }

    public String toString() {
        return this.lllIIIllIIIIlllIlIIllIIll.toString();
    }

    public ByteBuf retain(int n) {
        return this.lllIIIllIIIIlllIlIIllIIll.retain(n);
    }

    public ByteBuf retain() {
        return this.lllIIIllIIIIlllIlIIllIIll.retain();
    }

    public int refCnt() {
        return this.lllIIIllIIIIlllIlIIllIIll.refCnt();
    }

    public boolean release() {
        return this.lllIIIllIIIIlllIlIIllIIll.release();
    }

    public boolean release(int n) {
        return this.lllIIIllIIIIlllIlIIllIIll.release(n);
    }
}

