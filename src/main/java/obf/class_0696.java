package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.item.Item;
import net.minecraft.stats.StatList;

import java.util.ArrayList;

class class_0696
extends class_0318 {
    final /* synthetic */ class_0342 lllllIlllIIllIlIIlIIIllII;

    public class_0696(class_0342 class_03422) {
        this.lllllIlllIIllIlIIlIIIllII = class_03422;
        super(class_03422);
        this.lllIlIIlIIIlIlIIIllIlllIl = new ArrayList();
        for (class_1536 class_15362 : StatList.lIlllIlllIIIIlIIlllIllIII) {
            boolean bl = false;
            int n = Item.lllIIIllIIIIlllIlIIllIIll(class_15362.lllIIIllIIIIlllIlIIllIIll());
            if (class_0342.IlIllllllIIlIIllllIIlIIIl(class_03422).lllIIIllIIIIlllIlIIllIIll(class_15362) > 0) {
                bl = true;
            } else if (StatList.llIIIlllIlllIlIllIIIIllIl[n] != null && class_0342.IlIllllllIIlIIllllIIlIIIl(class_03422).lllIIIllIIIIlllIlIIllIIll(StatList.llIIIlllIlllIlIllIIIIllIl[n]) > 0) {
                bl = true;
            } else if (StatList.IIIIIIIIlIllIIllIIlllIllI[n] != null && class_0342.IlIllllllIIlIIllllIIlIIIl(class_03422).lllIIIllIIIIlllIlIIllIIll(StatList.IIIIIIIIlIllIIllIIlllIllI[n]) > 0) {
                bl = true;
            }
            if (!bl) continue;
            this.lllIlIIlIIIlIlIIIllIlllIl.add(class_15362);
        }
        this.llIIllIllIlIIlIIllIllllll = new class_0272(this, class_03422);
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(int n, int n2, class_0868 class_08682) {
        super.lllIIIllIIIIlllIlIIllIIll(n, n2, class_08682);
        if (this.lllIIIllIIIIlllIlIIllIIll == 0) {
            class_0342.lllIIIllIIIIlllIlIIllIIll(this.lllllIlllIIllIlIIlIIIllII, n + 115 - 18 + 1, n2 + 1 + 1, 72, 18);
        } else {
            class_0342.lllIIIllIIIIlllIlIIllIIll(this.lllllIlllIIllIlIIlIIIllII, n + 115 - 18, n2 + 1, 72, 18);
        }
        if (this.lllIIIllIIIIlllIlIIllIIll == 1) {
            class_0342.lllIIIllIIIIlllIlIIllIIll(this.lllllIlllIIllIlIIlIIIllII, n + 165 - 18 + 1, n2 + 1 + 1, 18, 18);
        } else {
            class_0342.lllIIIllIIIIlllIlIIllIIll(this.lllllIlllIIllIlIIlIIIllII, n + 165 - 18, n2 + 1, 18, 18);
        }
        if (this.lllIIIllIIIIlllIlIIllIIll == 2) {
            class_0342.lllIIIllIIIIlllIlIIllIIll(this.lllllIlllIIllIlIIlIIIllII, n + 215 - 18 + 1, n2 + 1 + 1, 36, 18);
        } else {
            class_0342.lllIIIllIIIIlllIlIIllIIll(this.lllllIlllIIllIlIIlIIIllII, n + 215 - 18, n2 + 1, 36, 18);
        }
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4, class_0868 class_08682, int n5, int n6) {
        class_1536 class_15362 = this.lllIlIIlIIIlIlIIIllIlllIl(n);
        Item class_06112 = class_15362.lllIIIllIIIIlllIlIIllIIll();
        class_0342.lllIIIllIIIIlllIlIIllIIll(this.lllllIlllIIllIlIIlIIIllII, n2 + 40, n3, class_06112);
        int n7 = Item.lllIIIllIIIIlllIlIIllIIll(class_06112);
        this.lllIIIllIIIIlllIlIIllIIll(StatList.llIIIlllIlllIlIllIIIIllIl[n7], n2 + 115, n3, n % 2 == 0);
        this.lllIIIllIIIIlllIlIIllIIll(StatList.IIIIIIIIlIllIIllIIlllIllI[n7], n2 + 165, n3, n % 2 == 0);
        this.lllIIIllIIIIlllIlIIllIIll(class_15362, n2 + 215, n3, n % 2 == 0);
    }

    @Override
    protected String IlIllllllIIlIIllllIIlIIIl(int n) {
        return n == 1 ? "stat.crafted" : (n == 2 ? "stat.used" : "stat.depleted");
    }
}

