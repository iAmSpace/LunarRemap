package obf;

import net.minecraft.util.IChatComponent;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0710
extends class_0703 {
    private IChatComponent lllIIIllIIIIlllIlIIllIIll;
    private boolean lllIlIIlIIIlIlIIIllIlllIl = true;

    public class_0710() {
    }

    public class_0710(IChatComponent class_22552) {
        this(class_22552, true);
    }

    public class_0710(IChatComponent class_22552, boolean bl) {
        this.lllIIIllIIIIlllIlIIllIIll = class_22552;
        this.lllIlIIlIIIlIlIIIllIlllIl = bl;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0181 class_01812) {
        this.lllIIIllIIIIlllIlIIllIIll = class_2095.lllIIIllIIIIlllIlIIllIIll(class_01812.IlIllllllIIlIIllllIIlIIIl(32767));
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0181 class_01812) {
        class_01812.lllIIIllIIIIlllIlIIllIIll(class_2095.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll));
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0596 class_05962) {
        class_05962.lllIIIllIIIIlllIlIIllIIll(this);
    }

    @Override
    public String lllIlIIlIIIlIlIIIllIlllIl() {
        return String.format("message='%s'", this.lllIIIllIIIIlllIlIIllIIll);
    }

    public IChatComponent IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public boolean lIlllIlllIIIIlIIlllIllIII() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_2075 class_20752) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0596)class_20752);
    }
}

