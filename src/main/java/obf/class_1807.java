package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
import io.netty.buffer.ByteBuf;
import java.beans.ConstructorProperties;

public class class_1807
extends class_0688 {
    private byte[] lllIIIllIIIIlllIlIIllIIll;

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0181 class_01812) {
        this.lllIIIllIIIIlllIlIIllIIll(class_01812, this.lllIIIllIIIIlllIlIIllIIll);
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0181 class_01812) {
        this.lllIIIllIIIIlllIlIIllIIll = this.lllIIIllIIIIlllIlIIllIIll((ByteBuf)class_01812);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1982 class_19822) {
    }

    public byte[] lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    @ConstructorProperties(value={"data"})
    public class_1807(byte[] arrby) {
        this.lllIIIllIIIIlllIlIIllIIll = arrby;
    }

    public class_1807() {
    }
}
