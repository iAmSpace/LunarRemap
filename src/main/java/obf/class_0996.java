package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;
import java.util.List;

class class_0996
extends class_0579 {
    private final List lllIlIIlIIIlIlIIIllIlllIl;
    final /* synthetic */ class_0342 lllIIIllIIIIlllIlIIllIIll;

    public class_0996(class_0342 class_03422) {
        this.lllIIIllIIIIlllIlIIllIIll = class_03422;
        super(class_0342.IlIlIIlIlIllIIlIlIIllIIIl(class_03422), class_03422.IlIlIIlllIIlIllIIIlllllIl, class_03422.lIIlIIIIIlIlllIlIIlIlIlll, 32, class_03422.lIIlIIIIIlIlllIlIIlIlIlll - 64, class_0342.lllllIlllIIllIlIIlIIIllII((class_0342)class_03422).lllIIIllIIIIlllIlIIllIIll * 4);
        this.lllIlIIlIIIlIlIIIllIlllIl = new ArrayList();
        this.lllIIIllIIIIlllIlIIllIIll(false);
        for (class_1128 class_11282 : class_0054.lllIIIllIIIIlllIlIIllIIll.values()) {
            if (class_0342.IlIllllllIIlIIllllIIlIIIl(class_03422).lllIIIllIIIIlllIlIIllIIll(class_11282.lIlllIlllIIIIlIIlllIllIII) <= 0 && class_0342.IlIllllllIIlIIllllIIlIIIl(class_03422).lllIIIllIIIIlllIlIIllIIll(class_11282.IlIIIIIllllllIIlllIllllll) <= 0) continue;
            this.lllIlIIlIIIlIlIIIllIlllIl.add(class_11282);
        }
    }

    @Override
    protected int lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIlIIlIIIlIlIIIllIlllIl.size();
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
        return this.lllIIIllIIIIlllIlIIllIIll() * class_0342.IlIlIIlllIIlIllIIIlllllIl((class_0342)this.lllIIIllIIIIlllIlIIllIIll).lllIIIllIIIIlllIlIIllIIll * 4;
    }

    @Override
    protected void IlIllllllIIlIIllllIIlIIIl() {
        this.lllIIIllIIIIlllIlIIllIIll.llIIlIllIllllIlIIIIlIIlll();
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4, class_0868 class_08682, int n5, int n6) {
        class_1128 class_11282 = (class_1128)this.lllIlIIlIIIlIlIIIllIlllIl.get(n);
        String string = class_0616.lllIIIllIIIIlllIlIIllIIll("entity." + class_0054.lllIlIIlIIIlIlIIIllIlllIl(class_11282.lllIIIllIIIIlllIlIIllIIll) + ".name", new Object[0]);
        int n7 = class_0342.IlIllllllIIlIIllllIIlIIIl(this.lllIIIllIIIIlllIlIIllIIll).lllIIIllIIIIlllIlIIllIIll(class_11282.lIlllIlllIIIIlIIlllIllIII);
        int n8 = class_0342.IlIllllllIIlIIllllIIlIIIl(this.lllIIIllIIIIlllIlIIllIIll).lllIIIllIIIIlllIlIIllIIll(class_11282.IlIIIIIllllllIIlllIllllll);
        String string2 = class_0616.lllIIIllIIIIlllIlIIllIIll("stat.entityKills", n7, string);
        String string3 = class_0616.lllIIIllIIIIlllIlIIllIIll("stat.entityKilledBy", string, n8);
        if (n7 == 0) {
            string2 = class_0616.lllIIIllIIIIlllIlIIllIIll("stat.entityKills.none", string);
        }
        if (n8 == 0) {
            string3 = class_0616.lllIIIllIIIIlllIlIIllIIll("stat.entityKilledBy.none", string);
        }
        this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl(class_0342.lIIlIIIIIlIlllIlIIlIlIlll(this.lllIIIllIIIIlllIlIIllIIll), string, n2 + 2 - 10, n3 + 1, 0xFFFFFF);
        this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl(class_0342.lIlIlIIlIIIIlIIIIIlllIIII(this.lllIIIllIIIIlllIlIIllIIll), string2, n2 + 2, n3 + 1 + class_0342.IlIIIlIIIIllIIIllIIIIIIll((class_0342)this.lllIIIllIIIIlllIlIIllIIll).lllIIIllIIIIlllIlIIllIIll, n7 == 0 ? 0x606060 : 0x909090);
        this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl(class_0342.IIlllIlIlllIllIIIlllIIlIl(this.lllIIIllIIIIlllIlIIllIIll), string3, n2 + 2, n3 + 1 + class_0342.lIlIllIIlIIlIIlIIlIIlIIll((class_0342)this.lllIIIllIIIIlllIlIIllIIll).lllIIIllIIIIlllIlIIllIIll * 2, n8 == 0 ? 0x606060 : 0x909090);
    }
}

