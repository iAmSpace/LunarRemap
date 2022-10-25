package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.util.MathHelper;

import java.util.Date;

class class_0421
extends class_0579 {
    final /* synthetic */ class_2083 lllIIIllIIIIlllIlIIllIIll;

    public class_0421(class_2083 class_20832) {
        this.lllIIIllIIIIlllIlIIllIIll = class_20832;
        super(class_20832.lllllIlllIIllIlIIlIIIllII, class_20832.IlIlIIlllIIlIllIIIlllllIl, class_20832.lIIlIIIIIlIlllIlIIlIlIlll, 32, class_20832.lIIlIIIIIlIlllIlIIlIlIlll - 64, 36);
    }

    @Override
    protected int lllIIIllIIIIlllIlIIllIIll() {
        return class_2083.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll).size();
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(int n, boolean bl, int n2, int n3) {
        boolean bl2;
        class_2083.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, n);
        class_2083.IlIllllllIIlIIllllIIlIIIl((class_2083)this.lllIIIllIIIIlllIlIIllIIll).IllIIIllIIIIlIlIlIllIIlll = bl2 = class_2083.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll) >= 0 && class_2083.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll) < this.lllIIIllIIIIlllIlIIllIIll();
        class_2083.lIlllIlllIIIIlIIlllIllIII((class_2083)this.lllIIIllIIIIlllIlIIllIIll).IllIIIllIIIIlIlIlIllIIlll = bl2;
        class_2083.IlIIIIIllllllIIlllIllllll((class_2083)this.lllIIIllIIIIlllIlIIllIIll).IllIIIllIIIIlIlIlIllIIlll = bl2;
        class_2083.lIllllIIlIIIlIllllllIIIll((class_2083)this.lllIIIllIIIIlllIlIIllIIll).IllIIIllIIIIlIlIlIllIIlll = bl2;
        if (bl && bl2) {
            this.lllIIIllIIIIlllIlIIllIIll.IlIIIIIllllllIIlllIllllll(n);
        }
    }

    @Override
    protected boolean lllIIIllIIIIlllIlIIllIIll(int n) {
        return n == class_2083.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll);
    }

    @Override
    protected int lllIlIIlIIIlIlIIIllIlllIl() {
        return class_2083.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll).size() * 36;
    }

    @Override
    protected void IlIllllllIIlIIllllIIlIIIl() {
        this.lllIIIllIIIIlllIlIIllIIll.llIIlIllIllllIlIIIIlIIlll();
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4, class_0868 class_08682, int n5, int n6) {
        class_0748 class_07482 = (class_0748)class_2083.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll).get(n);
        String string = class_07482.lllIlIIlIIIlIlIIIllIlllIl();
        if (string == null || MathHelper.lllIIIllIIIIlllIlIIllIIll(string)) {
            string = class_2083.IIIllIIlIIIIIIlIlIIllIIlI(this.lllIIIllIIIIlllIlIIllIIll) + " " + (n + 1);
        }
        String string2 = class_07482.lllIIIllIIIIlllIlIIllIIll();
        string2 = string2 + " (" + class_2083.IllIIlllllllIIlIIlIIIIlIl(this.lllIIIllIIIIlllIlIIllIIll).format(new Date(class_07482.IlIIIIIllllllIIlllIllllll()));
        string2 = string2 + ")";
        String string3 = "";
        if (class_07482.lIlllIlllIIIIlIIlllIllIII()) {
            string3 = class_2083.IIIllIllIIlIlIlIlIllllIIl(this.lllIIIllIIIIlllIlIIllIIll) + " " + string3;
        } else {
            string3 = class_2083.IllIIIllIIIIlIlIlIllIIlll(this.lllIIIllIIIIlllIlIIllIIll)[class_07482.lIllllIIlIIIlIllllllIIIll().lllIIIllIIIIlllIlIIllIIll()];
            if (class_07482.IIIllIIlIIIIIIlIlIIllIIlI()) {
                string3 = (Object)((Object) EnumChatFormatting.DARK_RED) + class_0616.lllIIIllIIIIlllIlIIllIIll("gameMode.hardcore", new Object[0]) + (Object)((Object) EnumChatFormatting.RESET);
            }
            if (class_07482.IllIIlllllllIIlIIlIIIIlIl()) {
                string3 = string3 + ", " + class_0616.lllIIIllIIIIlllIlIIllIIll("selectWorld.cheats", new Object[0]);
            }
        }
        this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll.lIlIllIIlIIlIIlIIlIIlIIll, string, n2 + 2, n3 + 1, 0xFFFFFF);
        this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll.lIlIllIIlIIlIIlIIlIIlIIll, string2, n2 + 2, n3 + 12, 0x808080);
        this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll.lIlIllIIlIIlIIlIIlIIlIIll, string3, n2 + 2, n3 + 12 + 10, 0x808080);
    }
}

