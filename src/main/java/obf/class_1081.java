package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
import io.netty.buffer.ByteBuf;

class class_1081
extends class_0484 {
    final /* synthetic */ class_1345 lllIIIllIIIIlllIlIIllIIll;

    class_1081(class_1345 class_13452) {
        this.lllIIIllIIIIlllIlIIllIIll = class_13452;
    }

    @Override
    public class_2208 lllIIlIIIllllllIIIIlIlIlI() {
        return new class_2208(this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl, this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl, this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII);
    }

    @Override
    public class_1334 IIllIllIIllIIlllIIIlIlllI() {
        return this.lllIIIllIIIIlllIlIIllIIll.IIIIIIIIlIllIIllIIlllIllI();
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(String string) {
        super.lllIIIllIIIIlllIlIIllIIll(string);
        this.lllIIIllIIIIlllIlIIllIIll.llIIlIllIllllIlIIIIlIIlll();
    }

    @Override
    public void lIlllIlllIIIIlIIlllIllIII() {
        this.lllIIIllIIIIlllIlIIllIIll.IIIIIIIIlIllIIllIIlllIllI().IIIllIIlIIIIIIlIlIIllIIlI(this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl, this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl, this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII);
    }

    @Override
    public int IlIIIIIllllllIIlllIllllll() {
        return 0;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(ByteBuf byteBuf) {
        byteBuf.writeInt(this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl);
        byteBuf.writeInt(this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl);
        byteBuf.writeInt(this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII);
    }
}

