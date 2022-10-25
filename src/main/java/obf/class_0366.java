package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public class class_0366
extends class_0551 {
    boolean lllIIIllIIIIlllIlIIllIIll;
    private int lllIlIIlIIIlIlIIIllIlllIl;

    public class_0366(class_1252 class_12522, boolean bl) {
        super(class_12522, false);
        this.lllIIIllIIIIlllIlIIllIIll = bl;
        this.lllIIIllIIIIlllIlIIllIIll(1);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll() {
        int n = this.IlIllllllIIlIIllllIIlIIIl.lIIlllIIIlIIlIllIIIIIlIlI();
        return n != this.lllIlIIlIIIlIlIIIllIlllIl && this.lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl.llIlIIIlllIIIllIllllIIIll(), false);
    }

    @Override
    public void IlIIIIIllllllIIlllIllllll() {
        this.IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl(this.IlIllllllIIlIIllllIIlIIIl.llIlIIIlllIIIllIllllIIIll());
        this.lllIlIIlIIIlIlIIIllIlllIl = this.IlIllllllIIlIIllllIIlIIIl.lIIlllIIIlIIlIllIIIIIlIlI();
        if (this.lllIIIllIIIIlllIlIIllIIll) {
            double d = this.IllIIlllllllIIlIIlIIIIlIl();
            List list = this.IlIllllllIIlIIllllIIlIIIl.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl.getClass(), class_1974.lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl.IlIIlllllIIlIlIlllllIllll, this.IlIllllllIIlIIllllIIlIIIl.llIIlIlIlllIIllIlIlllIllI, this.IlIllllllIIlIIllllIIlIIIl.IllIIIIllIIllIllIlllIlIIl, this.IlIllllllIIlIIllllIIlIIIl.IlIIlllllIIlIlIlllllIllll + 1.0, this.IlIllllllIIlIIllllIIlIIIl.llIIlIlIlllIIllIlIlllIllI + 1.0, this.IlIllllllIIlIIllllIIlIIIl.IllIIIIllIIllIllIlllIlIIl + 1.0).lllIlIIlIIIlIlIIIllIlllIl(d, 10.0, d));
            for (class_1252 class_12522 : list) {
                if (this.IlIllllllIIlIIllllIIlIIIl == class_12522 || class_12522.IIIIlIllIlIIlIIlIllIlIlll() != null || class_12522.lIlllIlllIIIIlIIlllIllIII(this.IlIllllllIIlIIllllIIlIIIl.llIlIIIlllIIIllIllllIIIll())) continue;
                class_12522.lllIlIIlIIIlIlIIIllIlllIl(this.IlIllllllIIlIIllllIIlIIIl.llIlIIIlllIIIllIllllIIIll());
            }
        }
        super.IlIIIIIllllllIIlllIllllll();
    }
}

