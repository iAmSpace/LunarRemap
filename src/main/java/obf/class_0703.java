package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.BiMap
 *  io.netty.buffer.ByteBuf
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.collect.BiMap;
import io.netty.buffer.ByteBuf;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class class_0703 {
    private static final Logger lllIIIllIIIIlllIlIIllIIll = LogManager.getLogger();

    public static class_0703 lllIIIllIIIIlllIlIIllIIll(BiMap biMap, int n) {
        try {
            Class class_ = (Class)biMap.get((Object)n);
            return class_ == null ? null : (class_0703)class_.newInstance();
        }
        catch (Exception exception) {
            lllIIIllIIIIlllIlIIllIIll.error("Couldn't create packet " + n, (Throwable)exception);
            return null;
        }
    }

    public static void lllIIIllIIIIlllIlIIllIIll(ByteBuf byteBuf, byte[] arrby) {
        byteBuf.writeShort(arrby.length);
        byteBuf.writeBytes(arrby);
    }

    public static byte[] lllIIIllIIIIlllIlIIllIIll(ByteBuf byteBuf) {
        short s = byteBuf.readShort();
        if (s < 0) {
            throw new IOException("Key was smaller than nothing!  Weird key!");
        }
        byte[] arrby = new byte[s];
        byteBuf.readBytes(arrby);
        return arrby;
    }

    public abstract void lllIIIllIIIIlllIlIIllIIll(class_0181 var1);

    public abstract void lllIlIIlIIIlIlIIIllIlllIl(class_0181 var1);

    public abstract void lllIIIllIIIIlllIlIIllIIll(class_2075 var1);

    public boolean lllIIIllIIIIlllIlIIllIIll() {
        return false;
    }

    public String toString() {
        return this.getClass().getSimpleName();
    }

    public String lllIlIIlIIIlIlIIIllIlllIl() {
        return "";
    }
}

