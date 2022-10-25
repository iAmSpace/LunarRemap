package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
import io.netty.buffer.ByteBuf;

public class class_0917
extends class_0703 {
    private String lllIIIllIIIIlllIlIIllIIll;
    private int lllIlIIlIIIlIlIIIllIlllIl;
    private byte[] IlIllllllIIlIIllllIIlIIIl;

    public class_0917() {
    }

    public class_0917(String string, ByteBuf byteBuf) {
        this(string, byteBuf.array());
    }

    public class_0917(String string, byte[] arrby) {
        this.lllIIIllIIIIlllIlIIllIIll = string;
        this.IlIllllllIIlIIllllIIlIIIl = arrby;
        if (arrby != null) {
            this.lllIlIIlIIIlIlIIIllIlllIl = arrby.length;
            if (this.lllIlIIlIIIlIlIIIllIlllIl >= 32767) {
                throw new IllegalArgumentException("Payload may not be larger than 32k");
            }
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0181 class_01812) {
        this.lllIIIllIIIIlllIlIIllIIll = class_01812.IlIllllllIIlIIllllIIlIIIl(20);
        this.lllIlIIlIIIlIlIIIllIlllIl = class_01812.readShort();
        if (this.lllIlIIlIIIlIlIIIllIlllIl > 0 && this.lllIlIIlIIIlIlIIIllIlllIl < 32767) {
            this.IlIllllllIIlIIllllIIlIIIl = new byte[this.lllIlIIlIIIlIlIIIllIlllIl];
            class_01812.readBytes(this.IlIllllllIIlIIllllIIlIIIl);
        }
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0181 class_01812) {
        class_01812.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll);
        class_01812.writeShort((short)this.lllIlIIlIIIlIlIIIllIlllIl);
        if (this.IlIllllllIIlIIllllIIlIIIl != null) {
            class_01812.writeBytes(this.IlIllllllIIlIIllllIIlIIIl);
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1829 class_18292) {
        class_18292.lllIIIllIIIIlllIlIIllIIll(this);
    }

    public String IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public byte[] lIlllIlllIIIIlIIlllIllIII() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_2075 class_20752) {
        this.lllIIIllIIIIlllIlIIllIIll((class_1829)class_20752);
    }
}

