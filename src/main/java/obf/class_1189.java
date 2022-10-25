package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Mouse
 */
import org.lwjgl.input.Mouse;

public class class_1189
extends class_0759 {
    private final class_1609 IIIllIIlIIIIIIlIlIIllIIlI;
    private final class_0556 IllIIlllllllIIlIIlIIIIlIl;
    private Number IIIllIllIIlIlIlIlIllllIIl;

    public class_1189(class_1609 class_16092) {
        this.IIIllIIlIIIIIIlIlIIllIIlI = class_16092;
        this.IllIIlllllllIIlIIlIIIIlIl = new class_0847(300L);
        this.IIIllIllIIlIlIlIlIllllIIl = (Number)class_16092.lIlllIlllIIIIlIIlllIllIII();
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(float f, float f2, boolean bl) {
        class_0210.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl, this.lllIIIllIIIIlllIlIIllIIll + this.IlIllllllIIlIIllllIIlIIIl, this.lllIlIIlIIIlIlIIIllIlllIl + this.lIlllIlllIIIIlIIlllIllIII, -13158601);
        if (!this.IllIIlllllllIIlIIlIIIIlIl.lIlllIlllIIIIlIIlllIllIII()) {
            this.IIIllIllIIlIlIlIlIllllIIl = (Number)this.IIIllIIlIIIIIIlIlIIllIIlI.lIlllIlllIIIIlIIlllIllIII();
        }
        float f3 = ((Number)this.IIIllIIlIIIIIIlIlIIllIIlI.lIlllIlllIIIIlIIlllIllIII()).floatValue();
        float f4 = ((Number)this.IIIllIIlIIIIIIlIlIIllIIlI.lllIlIIlIIIlIlIIIllIlllIl()).floatValue();
        float f5 = ((Number)this.IIIllIIlIIIIIIlIlIIllIIlI.IlIllllllIIlIIllllIIlIIIl()).floatValue();
        float f6 = f3 - this.IIIllIllIIlIlIlIlIllllIIl.floatValue();
        float f7 = 100.0f * ((this.IIIllIllIIlIlIlIlIllllIIl.floatValue() + f6 * this.IllIIlllllllIIlIIlIIIIlIl.IllIIlllllllIIlIIlIIIIlIl() - f4) / (f5 - f4));
        class_0210.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl, this.lllIIIllIIIIlllIlIIllIIll + this.IlIllllllIIlIIllllIIlIIIl / 100.0f * f7, this.lllIlIIlIIIlIlIIIllIlllIl + this.lIlllIlllIIIIlIIlllIllIII, -52429);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(float f, float f2, int n, boolean bl) {
        if (!bl) {
            return false;
        }
        if (Mouse.isButtonDown((int)0) && this.lllIIIllIIIIlllIlIIllIIll(f, f2)) {
            this.IllIIlllllllIIlIIlIIIIlIl.lllIlIIlIIIlIlIIIllIlllIl();
            this.IIIllIllIIlIlIlIlIllllIIl = (Number)this.IIIllIIlIIIIIIlIlIIllIIlI.lIlllIlllIIIIlIIlllIllIII();
            float f3 = ((Number)this.IIIllIIlIIIIIIlIlIIllIIlI.lllIlIIlIIIlIlIIIllIlllIl()).floatValue();
            float f4 = ((Number)this.IIIllIIlIIIIIIlIlIIllIIlI.IlIllllllIIlIIllllIIlIIIl()).floatValue();
            if (f - this.lllIIIllIIIIlllIlIIllIIll > this.IlIllllllIIlIIllllIIlIIIl / 2.0f) {
                f += 2.0f;
            }
            float f5 = f3 + (f - this.lllIIIllIIIIlllIlIIllIIll) * ((f4 - f3) / this.IlIllllllIIlIIllllIIlIIIl);
            switch (this.IIIllIIlIIIIIIlIlIIllIIlI.IllIIIllIIIIlIlIlIllIIlll()) {
                case lIlllIlllIIIIlIIlllIllIII: {
                    this.IIIllIIlIIIIIIlIlIIllIIlI.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll((Object)Integer.parseInt((int)f5 + "")));
                    break;
                }
                case IlIllllllIIlIIllllIIlIIIl: {
                    this.IIIllIIlIIIIIIlIlIIllIIlI.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll(Float.valueOf(f5)));
                    break;
                }
                case IlIIIIIllllllIIlllIllllll: {
                    this.IIIllIIlIIIIIIlIlIIllIIlI.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll(Double.parseDouble((double)f5 + "")));
                }
            }
        }
        return super.lllIIIllIIIIlllIlIIllIIll(f, f2, n, bl);
    }

    private Object lllIIIllIIIIlllIlIIllIIll(Object object) {
        try {
            return object;
        }
        catch (ClassCastException classCastException) {
            return null;
        }
    }

    public class_1609 IllIIlllllllIIlIIlIIIIlIl() {
        return this.IIIllIIlIIIIIIlIlIIllIIlI;
    }
}

