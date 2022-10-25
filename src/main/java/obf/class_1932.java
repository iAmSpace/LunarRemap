package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
import io.netty.buffer.ByteBuf;
import net.minecraft.util.MathHelper;

class class_1932
extends class_0484 {
    final /* synthetic */ class_2200 lllIIIllIIIIlllIlIIllIIll;

    class_1932(class_2200 class_22002) {
        this.lllIIIllIIIIlllIlIIllIIll = class_22002;
    }

    @Override
    public void lIlllIlllIIIIlIIlllIllIII() {
        this.lllIIIllIIIIlllIlIIllIIll.lIlIIllllIlIIIIllIIIIlIIl().lllIlIIlIIIlIlIIIllIlllIl(23, this.IlIllllllIIlIIllllIIlIIIl());
        this.lllIIIllIIIIlllIlIIllIIll.lIlIIllllIlIIIIllIIIIlIIl().lllIlIIlIIIlIlIIIllIlllIl(24, class_2095.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl()));
    }

    @Override
    public int IlIIIIIllllllIIlllIllllll() {
        return 1;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(ByteBuf byteBuf) {
        byteBuf.writeInt(this.lllIIIllIIIIlllIlIIllIIll.llllllIlIllllIlIlIlIIIIlI());
    }

    @Override
    public class_2208 lllIIlIIIllllllIIIIlIlIlI() {
        return new class_2208(MathHelper.IlIllllllIIlIIllllIIlIIIl(this.lllIIIllIIIIlllIlIIllIIll.IlIIlllllIIlIlIlllllIllll), MathHelper.IlIllllllIIlIIllllIIlIIIl(this.lllIIIllIIIIlllIlIIllIIll.llIIlIlIlllIIllIlIlllIllI + 0.5), MathHelper.IlIllllllIIlIIllllIIlIIIl(this.lllIIIllIIIIlllIlIIllIIll.IllIIIIllIIllIllIlllIlIIl));
    }

    @Override
    public class_1334 IIllIllIIllIIlllIIIlIlllI() {
        return this.lllIIIllIIIIlllIlIIllIIll.lIlIllIIlIIlIIlIIlIIlIIll;
    }
}

