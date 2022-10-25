package obf;

import net.minecraft.stats.StatBase;
import net.minecraft.stats.StatList;

/*
 * Decompiled with CFR 0.150.
 */
class class_1087
extends class_0579 {
    final /* synthetic */ class_0342 lllIIIllIIIIlllIlIIllIIll;

    public class_1087(class_0342 class_03422) {
        this.lllIIIllIIIIlllIlIIllIIll = class_03422;
        super(class_0342.llIIlllIllIllllIIIlIIIIII(class_03422), class_03422.IlIlIIlllIIlIllIIIlllllIl, class_03422.lIIlIIIIIlIlllIlIIlIlIlll, 32, class_03422.lIIlIIIIIlIlllIlIIlIlIlll - 64, 10);
        this.lllIIIllIIIIlllIlIIllIIll(false);
    }

    @Override
    protected int lllIIIllIIIIlllIlIIllIIll() {
        return StatList.IlIllllllIIlIIllllIIlIIIl.size();
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(int n, boolean bl, int n2, int n3) {
    }

    @Override
    protected boolean lllIIIllIIIIlllIlIIllIIll(int n) {
        return false;
    }

    @Override
    protected int lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lllIIIllIIIIlllIlIIllIIll() * 10;
    }

    @Override
    protected void IlIllllllIIlIIllllIIlIIIl() {
        this.lllIIIllIIIIlllIlIIllIIll.llIIlIllIllllIlIIIIlIIlll();
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4, class_0868 class_08682, int n5, int n6) {
        StatBase class_03192 = (StatBase) StatList.IlIllllllIIlIIllllIIlIIIl.get(n);
        this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl(class_0342.llIIllIllIlIIlIIllIllllll(this.lllIIIllIIIIlllIlIIllIIll), class_03192.IlIIIIIllllllIIlllIllllll().IlIllllllIIlIIllllIIlIIIl(), n2 + 2, n3 + 1, n % 2 == 0 ? 0xFFFFFF : 0x909090);
        String string = class_03192.lllIIIllIIIIlllIlIIllIIll(class_0342.IlIllllllIIlIIllllIIlIIIl(this.lllIIIllIIIIlllIlIIllIIll).lllIIIllIIIIlllIlIIllIIll(class_03192));
        this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl(class_0342.lllIIlIIIllllllIIIIlIlIlI(this.lllIIIllIIIIlllIlIIllIIll), string, n2 + 2 + 213 - class_0342.IlIlllIIIIIIlIIllIIllIlll(this.lllIIIllIIIIlllIlIIllIIll).lllIIIllIIIIlllIlIIllIIll(string), n3 + 1, n % 2 == 0 ? 0xFFFFFF : 0x909090);
    }
}

