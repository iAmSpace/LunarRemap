package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.awt.Color;

public class class_0730
extends class_1088 {
    private int IllIIlllllllIIlIIlIIIIlIl;
    private int IIIllIllIIlIlIlIlIllllIIl;
    private boolean IllIIIllIIIIlIlIlIllIIlll;
    private Color lIIIIlIlIIlllllIIllIIlIII;
    private Color llIIlllIllIllllIIIlIIIIII;

    public class_0730(long l, int n, int n2) {
        super(l);
        this.IllIIlllllllIIlIIlIIIIlIl = n;
        this.IIIllIllIIlIlIlIlIllllIIl = n2;
    }

    public class_0730(int n, int n2) {
        this(175L, n, n2);
    }

    public Color lllIlIIlIIIlIlIIIllIlllIl(boolean bl) {
        Color color = new Color(bl ? this.IIIllIllIIlIlIlIlIllllIIl : this.IllIIlllllllIIlIIlIIIIlIl, true);
        if (bl && !this.IllIIIllIIIIlIlIlIllIIlll) {
            this.IllIIIllIIIIlIlIlIllIIlll = true;
            this.lIIIIlIlIIlllllIIllIIlIII = new Color(this.IllIIlllllllIIlIIlIIIIlIl, true);
            this.llIIlllIllIllllIIIlIIIIII = new Color(this.IIIllIllIIlIlIlIlIllllIIl, true);
            this.lllIlIIlIIIlIlIIIllIlllIl();
        } else if (this.IllIIIllIIIIlIlIlIllIIlll && !bl) {
            this.IllIIIllIIIIlIlIlIllIIlll = false;
            this.lIIIIlIlIIlllllIIllIIlIII = new Color(this.IIIllIllIIlIlIlIlIllllIIl, true);
            this.llIIlllIllIllllIIIlIIIIII = new Color(this.IllIIlllllllIIlIIlIIIIlIl, true);
            this.lllIlIIlIIIlIlIIIllIlllIl();
        }
        if (this.IIIllIIlIIIIIIlIlIIllIIlI()) {
            float f = super.IllIIlllllllIIlIIlIIIIlIl();
            int n = (int)Math.abs(f * (float)this.llIIlllIllIllllIIIlIIIIII.getRed() + (1.0f - f) * (float)this.lIIIIlIlIIlllllIIllIIlIII.getRed());
            int n2 = (int)Math.abs(f * (float)this.llIIlllIllIllllIIIlIIIIII.getGreen() + (1.0f - f) * (float)this.lIIIIlIlIIlllllIIllIIlIII.getGreen());
            int n3 = (int)Math.abs(f * (float)this.llIIlllIllIllllIIIlIIIIII.getBlue() + (1.0f - f) * (float)this.lIIIIlIlIIlllllIIllIIlIII.getBlue());
            int n4 = (int)Math.abs(f * (float)this.llIIlllIllIllllIIIlIIIIII.getAlpha() + (1.0f - f) * (float)this.lIIIIlIlIIlllllIIllIIlIII.getAlpha());
            color = new Color(n, n2, n3, n4);
        }
        return color;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(int n) {
        this.IllIIlllllllIIlIIlIIIIlIl = n;
    }

    public void IlIllllllIIlIIllllIIlIIIl(int n) {
        this.IIIllIllIIlIlIlIlIllllIIl = n;
    }
}

