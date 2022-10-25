package obf;

import net.minecraft.util.IChatComponent;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0480 {
    private final class_0058 lllIIIllIIIIlllIlIIllIIll;
    private final int lllIlIIlIIIlIlIIIllIlllIl;
    private final float IlIllllllIIlIIllllIIlIIIl;
    private final float lIlllIlllIIIIlIIlllIllIII;
    private final String IlIIIIIllllllIIlllIllllll;
    private final float lIllllIIlIIIlIllllllIIIll;

    public class_0480(class_0058 class_00582, int n, float f, float f2, String string, float f3) {
        this.lllIIIllIIIIlllIlIIllIIll = class_00582;
        this.lllIlIIlIIIlIlIIIllIlllIl = n;
        this.IlIllllllIIlIIllllIIlIIIl = f2;
        this.lIlllIlllIIIIlIIlllIllIII = f;
        this.IlIIIIIllllllIIlllIllllll = string;
        this.lIllllIIlIIIlIllllllIIIll = f3;
    }

    public class_0058 lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public float lllIlIIlIIIlIlIIIllIlllIl() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public boolean IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIIIllIIIIlllIlIIllIIll.IllIIIllIIIIlIlIlIllIIlll() instanceof class_1965;
    }

    public String lIlllIlllIIIIlIIlllIllIII() {
        return this.IlIIIIIllllllIIlllIllllll;
    }

    public IChatComponent IlIIIIIllllllIIlllIllllll() {
        return this.lllIIIllIIIIlllIlIIllIIll().IllIIIllIIIIlIlIlIllIIlll() == null ? null : this.lllIIIllIIIIlllIlIIllIIll().IllIIIllIIIIlIlIlIllIIlll().llIIIIllIIIIIIIlIIIlIIIIl();
    }

    public float lIllllIIlIIIlIllllllIIIll() {
        return this.lllIIIllIIIIlllIlIIllIIll == class_0058.IIIllIllIIlIlIlIlIllllIIl ? Float.MAX_VALUE : this.lIllllIIlIIIlIllllllIIIll;
    }
}

