package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.StringUtils
 */
import net.minecraft.util.MathHelper;
import org.apache.commons.lang3.StringUtils;

public abstract class class_0551
extends class_1327 {
    protected class_1252 IlIllllllIIlIIllllIIlIIIl;
    protected boolean lIlllIlllIIIIlIIlllIllIII;
    private boolean lllIIIllIIIIlllIlIIllIIll;
    private int lllIlIIlIIIlIlIIIllIlllIl;
    private int IlIIIIIllllllIIlllIllllll;
    private int lIllllIIlIIIlIllllllIIIll;

    public class_0551(class_1252 class_12522, boolean bl) {
        this(class_12522, bl, false);
    }

    public class_0551(class_1252 class_12522, boolean bl, boolean bl2) {
        this.IlIllllllIIlIIllllIIlIIIl = class_12522;
        this.lIlllIlllIIIIlIIlllIllIII = bl;
        this.lllIIIllIIIIlllIlIIllIIll = bl2;
    }

    @Override
    public boolean lllIlIIlIIIlIlIIIllIlllIl() {
        class_1965 class_19652 = this.IlIllllllIIlIIllllIIlIIIl.IIIIlIllIlIIlIIlIllIlIlll();
        if (class_19652 == null) {
            return false;
        }
        if (!class_19652.IlllIIlllllllIIllIlIllllI()) {
            return false;
        }
        double d = this.IllIIlllllllIIlIIlIIIIlIl();
        if (this.IlIllllllIIlIIllllIIlIIIl.IlIIIIIllllllIIlllIllllll(class_19652) > d * d) {
            return false;
        }
        if (this.lIlllIlllIIIIlIIlllIllIII) {
            if (this.IlIllllllIIlIIllllIIlIIIl.IIIIIIIIlIllIIllIIlllIllI().lllIIIllIIIIlllIlIIllIIll(class_19652)) {
                this.lIllllIIlIIIlIllllllIIIll = 0;
            } else if (++this.lIllllIIlIIIlIllllllIIIll > 60) {
                return false;
            }
        }
        return !(class_19652 instanceof class_1822) || !((class_1822)class_19652).IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl();
    }

    protected double IllIIlllllllIIlIIlIIIIlIl() {
        class_1685 class_16852 = this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(class_1152.lllIlIIlIIIlIlIIIllIlllIl);
        return class_16852 == null ? 16.0 : class_16852.IlIIIIIllllllIIlllIllllll();
    }

    @Override
    public void IlIIIIIllllllIIlllIllllll() {
        this.lllIlIIlIIIlIlIIIllIlllIl = 0;
        this.IlIIIIIllllllIIlllIllllll = 0;
        this.lIllllIIlIIIlIllllllIIIll = 0;
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
        this.IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl((class_1965)null);
    }

    protected boolean lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652, boolean bl) {
        if (class_19652 == null) {
            return false;
        }
        if (class_19652 == this.IlIllllllIIlIIllllIIlIIIl) {
            return false;
        }
        if (!class_19652.IlllIIlllllllIIllIlIllllI()) {
            return false;
        }
        if (!this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(class_19652.getClass())) {
            return false;
        }
        if (this.IlIllllllIIlIIllllIIlIIIl instanceof class_0683 && StringUtils.isNotEmpty((CharSequence)((class_0683)((Object)this.IlIllllllIIlIIllllIIlIIIl)).IlIllllllIIlIIllllIIlIIIl())) {
            if (class_19652 instanceof class_0683 && ((class_0683)((Object)this.IlIllllllIIlIIllllIIlIIIl)).IlIllllllIIlIIllllIIlIIIl().equals(((class_0683)((Object)class_19652)).IlIllllllIIlIIllllIIlIIIl())) {
                return false;
            }
            if (class_19652 == ((class_0683)((Object)this.IlIllllllIIlIIllllIIlIIIl)).lIlllIlllIIIIlIIlllIllIII()) {
                return false;
            }
        } else if (class_19652 instanceof class_0814 && !bl && ((class_0814)class_19652).lIIlIlIlIlIllIIlIIllllIll.lllIIIllIIIIlllIlIIllIIll) {
            return false;
        }
        if (!this.IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl(MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19652.IlIIlllllIIlIlIlllllIllll), MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19652.llIIlIlIlllIIllIlIlllIllI), MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19652.IllIIIIllIIllIllIlllIlIIl))) {
            return false;
        }
        if (this.lIlllIlllIIIIlIIlllIllIII && !this.IlIllllllIIlIIllllIIlIIIl.IIIIIIIIlIllIIllIIlllIllI().lllIIIllIIIIlllIlIIllIIll(class_19652)) {
            return false;
        }
        if (this.lllIIIllIIIIlllIlIIllIIll) {
            if (--this.IlIIIIIllllllIIlllIllllll <= 0) {
                this.lllIlIIlIIIlIlIIIllIlllIl = 0;
            }
            if (this.lllIlIIlIIIlIlIIIllIlllIl == 0) {
                int n = this.lllIlIIlIIIlIlIIIllIlllIl = this.lllIIIllIIIIlllIlIIllIIll(class_19652) ? 1 : 2;
            }
            if (this.lllIlIIlIIIlIlIIIllIlllIl == 2) {
                return false;
            }
        }
        return true;
    }

    private boolean lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652) {
        int n;
        this.IlIIIIIllllllIIlllIllllll = 10 + this.IlIllllllIIlIIllllIIlIIIl.IlllIIIlIIlIIIIllllIllllI().nextInt(5);
        class_2086 class_20862 = this.IlIllllllIIlIIllllIIlIIIl.IllIIIIllIIllIllIlllIlIIl().lllIIIllIIIIlllIlIIllIIll(class_19652);
        if (class_20862 == null) {
            return false;
        }
        class_2120 class_21202 = class_20862.IlIllllllIIlIIllllIIlIIIl();
        if (class_21202 == null) {
            return false;
        }
        int n2 = class_21202.lllIIIllIIIIlllIlIIllIIll - MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19652.IlIIlllllIIlIlIlllllIllll);
        return (double)(n2 * n2 + (n = class_21202.IlIllllllIIlIIllllIIlIIIl - MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19652.IllIIIIllIIllIllIlllIlIIl)) * n) <= 2.25;
    }
}

