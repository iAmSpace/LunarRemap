package obf;/*
 * Decompiled with CFR 0.150.
 */
import com.moonsworth.lunar.client.LunarClient;

import java.util.ArrayList;
import java.util.List;

public class class_1001
extends class_1194 {
    private List lllIIIllIIIIlllIlIIllIIll = new ArrayList();

    public class_1001(float f, int n, int n2, int n3, int n4) {
        super(f, n, n2, n3, n4);
        for (class_1665 class_16652 : LunarClient.getInstance().getModuleManager().lllIIIllIIIIlllIlIIllIIll) {
            if (class_16652 == LunarClient.getInstance().getModuleManager().lIIIIlIlIIlllllIIllIIlIII) continue;
            class_0036 class_00362 = new class_0036(this, class_16652, f);
            this.lllIIIllIIIIlllIlIIllIIll.add(class_00362);
        }
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1665 class_16652) {
        return false;
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_1665 class_16652) {
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
        super.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
        class_0857.lllIIIllIIIIlllIlIIllIIll((double)this.lIlllIlllIIIIlIIlllIllIII, (double)this.IlIIIIIllllllIIlllIllllll, (double)(this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll), (double)(this.IlIIIIIllllllIIlllIllllll + this.IIIllIIlIIIIIIlIlIIllIIlI + 2), 8.0, 0x40000000);
        this.lllIlIIlIIIlIlIIIllIlllIl(n, n2);
        int n3 = 0;
        int n4 = 0;
        for (class_0036 class_00362 : this.lllIIIllIIIIlllIlIIllIIll) {
            class_00362.IlIllllllIIlIIllllIIlIIIl = this.IIIllIllIIlIlIlIlIllllIIl;
            class_00362.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII + 4 + n3 * 120, this.IlIIIIIllllllIIlllIllllll + 4 + n4 * 112, 116, 108);
            class_00362.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
            if (++n3 != 3) continue;
            ++n4;
            n3 = 0;
        }
        this.IllIIIllIIIIlIlIlIllIIlll = 4 + n4 * 112 + 112;
        this.IlIllllllIIlIIllllIIlIIIl(n, n2);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        super.lllIIIllIIIIlllIlIIllIIll(n, n2, n3);
        for (class_0036 class_00362 : this.lllIIIllIIIIlllIlIIllIIll) {
            if (!class_00362.lllIIIllIIIIlllIlIIllIIll(n, n2)) continue;
            class_00362.lllIIIllIIIIlllIlIIllIIll(n, n2, n3);
        }
    }
}

