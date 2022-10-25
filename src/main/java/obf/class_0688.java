package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.BiMap
 *  com.google.common.collect.HashBiMap
 *  io.netty.buffer.ByteBuf
 */
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import io.netty.buffer.ByteBuf;

public abstract class class_0688 {
    public static BiMap lllIlIIlIIIlIlIIIllIlllIl = HashBiMap.create();

    public abstract void lllIIIllIIIIlllIlIIllIIll(PacketBuffer var1);

    public abstract void lllIlIIlIIIlIlIIIllIlllIl(PacketBuffer var1);

    public abstract void lllIIIllIIIIlllIlIIllIIll(class_1982 var1);

    protected void lllIIIllIIIIlllIlIIllIIll(ByteBuf byteBuf, byte[] arrby) {
        byteBuf.writeShort(arrby.length);
        byteBuf.writeBytes(arrby);
    }

    protected byte[] lllIIIllIIIIlllIlIIllIIll(ByteBuf byteBuf) {
        short s = byteBuf.readShort();
        if (s >= 0) {
            byte[] arrby = new byte[s];
            byteBuf.readBytes(arrby);
            return arrby;
        }
        System.out.println("[WS] Key was smaller than nothing!  Weird key!");
        return new byte[0];
    }

    static {
        lllIlIIlIIIlIlIIIllIlllIl.put(class_0653.class, (Object)0);
        lllIlIIlIIIlIlIIIllIlllIl.put(class_0205.class, (Object)1);
        lllIlIIlIIIlIlIIIllIlllIl.put(class_0375.class, (Object)2);
        lllIlIIlIIIlIlIIIllIlllIl.put(class_1048.class, (Object)3);
        lllIlIIlIIIlIlIIIllIlllIl.put(class_0158.class, (Object)4);
        lllIlIIlIIIlIlIIIllIlllIl.put(class_0222.class, (Object)5);
        lllIlIIlIIIlIlIIIllIlllIl.put(class_1577.class, (Object)6);
        lllIlIIlIIIlIlIIIllIlllIl.put(class_1077.class, (Object)7);
        lllIlIIlIIIlIlIIIllIlllIl.put(class_0694.class, (Object)8);
        lllIlIIlIIIlIlIIIllIlllIl.put(class_0022.class, (Object)9);
        lllIlIIlIIIlIlIIIllIlllIl.put(class_1021.class, (Object)16);
        lllIlIIlIIIlIlIIIllIlllIl.put(class_1375.class, (Object)17);
        lllIlIIlIIIlIlIIIllIlllIl.put(class_0251.class, (Object)18);
        lllIlIIlIIIlIlIIIllIlllIl.put(class_1162.class, (Object)19);
        lllIlIIlIIIlIlIIIllIlllIl.put(class_2232.class, (Object)20);
        lllIlIIlIIIlIlIIIllIlllIl.put(class_0383.class, (Object)21);
        lllIlIIlIIIlIlIIIllIlllIl.put(class_0103.class, (Object)22);
        lllIlIIlIIIlIlIIIllIlllIl.put(class_2215.class, (Object)23);
        lllIlIIlIIIlIlIIIllIlllIl.put(class_1763.class, (Object)24);
        lllIlIIlIIIlIlIIIllIlllIl.put(class_1807.class, (Object)25);
        lllIlIIlIIIlIlIIIllIlllIl.put(class_1082.class, (Object)32);
        lllIlIIlIIIlIlIIIllIlllIl.put(class_1029.class, (Object)33);
        lllIlIIlIIIlIlIIIllIlllIl.put(class_2074.class, (Object)34);
        lllIlIIlIIIlIlIIIllIlllIl.put(class_1106.class, (Object)35);
        lllIlIIlIIIlIlIIIllIlllIl.put(class_0263.class, (Object)36);
        lllIlIIlIIIlIlIIIllIlllIl.put(class_1257.class, (Object)37);
        lllIlIIlIIIlIlIIIllIlllIl.put(class_2143.class, (Object)38);
    }
}

