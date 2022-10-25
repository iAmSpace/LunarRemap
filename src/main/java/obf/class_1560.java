package obf;

import net.minecraft.init.Blocks;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1560
extends class_0964 {
    protected class_1067 llIIIIllIIIIIIIlIIIlIIIIl = new class_1619(Blocks.IlIIIIIIllIIlIllIIllIllIl);

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_0672 class_06722) {
        this.lllIIIllIIIIlllIlIIllIIll();
        if (this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(5) == 0) {
            int n = this.IlIllllllIIlIIllllIIlIIIl + this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(16) + 8;
            int n2 = this.lIlllIlllIIIIlIIlllIllIII + this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(16) + 8;
            int n3 = this.lllIIIllIIIIlllIlIIllIIll.IIIllIllIIlIlIlIlIllllIIl(n, n2);
            this.llIIIIllIIIIIIIlIIIlIIIIl.a_(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl, n, n3, n2);
        }
        if (this.IlIllllllIIlIIllllIIlIIIl == 0 && this.lIlllIlllIIIIlIIlllIllIII == 0) {
            class_1221 class_12212 = new class_1221(this.lllIIIllIIIIlllIlIIllIIll);
            class_12212.lllIlIIlIIIlIlIIIllIlllIl(0.0, 128.0, 0.0, this.lllIlIIlIIIlIlIIIllIlllIl.nextFloat() * 360.0f, 0.0f);
            this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(class_12212);
        }
    }
}

