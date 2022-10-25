package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class class_2014
extends class_1774 {
    public int IllIIlllllllIIlIIlIIIIlIl;
    public float IIIllIllIIlIlIlIlIllllIIl;
    public float IllIIIllIIIIlIlIlIllIIlll;
    public float lIIIIlIlIIlllllIIllIIlIII;
    public float llIIlllIllIllllIIIlIIIIII;
    public float llIIllIllIlIIlIIllIllllll;
    public float lllIIlIIIllllllIIIIlIlIlI;
    public float IlIlllIIIIIIlIIllIIllIlll;
    public float IlIlIIlIlIllIIlIlIIllIIIl;
    public float lllllIlllIIllIlIIlIIIllII;
    private static Random IlIlIIlllIIlIllIIIlllllIl = new Random();
    private String lIIlIIIIIlIlllIlIIlIlIlll;

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        super.lllIlIIlIIIlIlIIIllIlllIl(class_07752);
        if (this.IlIIIIIllllllIIlllIllllll()) {
            class_07752.lllIIIllIIIIlllIlIIllIIll("CustomName", this.lIIlIIIIIlIlllIlIIlIlIlll);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        super.lllIIIllIIIIlllIlIIllIIll(class_07752);
        if (class_07752.lllIlIIlIIIlIlIIIllIlllIl("CustomName", 8)) {
            this.lIIlIIIIIlIlllIlIIlIlIlll = class_07752.IllIIIllIIIIlIlIlIllIIlll("CustomName");
        }
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
        float f;
        super.IlIllllllIIlIIllllIIlIIIl();
        this.lllIIlIIIllllllIIIIlIlIlI = this.llIIllIllIlIIlIIllIllllll;
        this.IlIlIIlIlIllIIlIlIIllIIIl = this.IlIlllIIIIIIlIIllIIllIlll;
        class_0814 class_08142 = this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll((float)this.lllIlIIlIIIlIlIIIllIlllIl + 0.5f, (float)this.IlIllllllIIlIIllllIIlIIIl + 0.5f, (double)((float)this.lIlllIlllIIIIlIIlllIllIII + 0.5f), 3.0);
        if (class_08142 != null) {
            double d = class_08142.IlIIlllllIIlIlIlllllIllll - (double)((float)this.lllIlIIlIIIlIlIIIllIlllIl + 0.5f);
            double d2 = class_08142.IllIIIIllIIllIllIlllIlIIl - (double)((float)this.lIlllIlllIIIIlIIlllIllIII + 0.5f);
            this.lllllIlllIIllIlIIlIIIllII = (float)Math.atan2(d2, d);
            this.llIIllIllIlIIlIIllIllllll += 0.1f;
            if (this.llIIllIllIlIIlIIllIllllll < 0.5f || IlIlIIlllIIlIllIIIlllllIl.nextInt(40) == 0) {
                float f2 = this.lIIIIlIlIIlllllIIllIIlIII;
                do {
                    this.lIIIIlIlIIlllllIIllIIlIII += (float)(IlIlIIlllIIlIllIIIlllllIl.nextInt(4) - IlIlIIlllIIlIllIIIlllllIl.nextInt(4));
                } while (f2 == this.lIIIIlIlIIlllllIIllIIlIII);
            }
        } else {
            this.lllllIlllIIllIlIIlIIIllII += 0.02f;
            this.llIIllIllIlIIlIIllIllllll -= 0.1f;
        }
        while (this.IlIlllIIIIIIlIIllIIllIlll >= (float)Math.PI) {
            this.IlIlllIIIIIIlIIllIIllIlll -= (float)Math.PI * 2;
        }
        while (this.IlIlllIIIIIIlIIllIIllIlll < (float)(-Math.PI)) {
            this.IlIlllIIIIIIlIIllIIllIlll += (float)Math.PI * 2;
        }
        while (this.lllllIlllIIllIlIIlIIIllII >= (float)Math.PI) {
            this.lllllIlllIIllIlIIlIIIllII -= (float)Math.PI * 2;
        }
        while (this.lllllIlllIIllIlIIlIIIllII < (float)(-Math.PI)) {
            this.lllllIlllIIllIlIIlIIIllII += (float)Math.PI * 2;
        }
        for (f = this.lllllIlllIIllIlIIlIIIllII - this.IlIlllIIIIIIlIIllIIllIlll; f >= (float)Math.PI; f -= (float)Math.PI * 2) {
        }
        while (f < (float)(-Math.PI)) {
            f += (float)Math.PI * 2;
        }
        this.IlIlllIIIIIIlIIllIIllIlll += f * 0.4f;
        if (this.llIIllIllIlIIlIIllIllllll < 0.0f) {
            this.llIIllIllIlIIlIIllIllllll = 0.0f;
        }
        if (this.llIIllIllIlIIlIIllIllllll > 1.0f) {
            this.llIIllIllIlIIlIIllIllllll = 1.0f;
        }
        ++this.IllIIlllllllIIlIIlIIIIlIl;
        this.IllIIIllIIIIlIlIlIllIIlll = this.IIIllIllIIlIlIlIlIllllIIl;
        float f3 = (this.lIIIIlIlIIlllllIIllIIlIII - this.IIIllIllIIlIlIlIlIllllIIl) * 0.4f;
        float f4 = 0.2f;
        if (f3 < -f4) {
            f3 = -f4;
        }
        if (f3 > f4) {
            f3 = f4;
        }
        this.llIIlllIllIllllIIIlIIIIII += (f3 - this.llIIlllIllIllllIIIlIIIIII) * 0.9f;
        this.IIIllIllIIlIlIlIlIllllIIl += this.llIIlllIllIllllIIIlIIIIII;
    }

    public String lllIIIllIIIIlllIlIIllIIll() {
        return this.IlIIIIIllllllIIlllIllllll() ? this.lIIlIIIIIlIlllIlIIlIlIlll : "container.enchant";
    }

    public boolean IlIIIIIllllllIIlllIllllll() {
        return this.lIIlIIIIIlIlllIlIIlIlIlll != null && this.lIIlIIIIIlIlllIlIIlIlIlll.length() > 0;
    }

    public void lllIIIllIIIIlllIlIIllIIll(String string) {
        this.lIIlIIIIIlIlllIlIIlIlIlll = string;
    }
}

