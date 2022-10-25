package obf;

import net.minecraft.util.IChatComponent;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1549
implements class_1969 {
    public static final class_1549 lllIIIllIIIIlllIlIIllIIll = new class_1549();
    private StringBuffer lllIlIIlIIIlIlIIIllIlllIl = new StringBuffer();

    @Override
    public String llllIIIIlIIIlIIIIIIlIllll() {
        return "Rcon";
    }

    @Override
    public IChatComponent llIIIIllIIIIIIIlIIIlIIIIl() {
        return new class_0722(this.llllIIIIlIIIlIIIIIIlIllll());
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(IChatComponent class_22552) {
        this.lllIlIIlIIIlIlIIIllIlllIl.append(class_22552.IlIllllllIIlIIllllIIlIIIl());
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(int n, String string) {
        return true;
    }

    @Override
    public class_2208 lllIIlIIIllllllIIIIlIlIlI() {
        return new class_2208(0, 0, 0);
    }

    @Override
    public class_1334 IIllIllIIllIIlllIIIlIlllI() {
        return class_0220.IlIIlllllIIlIlIlllllIllll().IIllIllIIllIIlllIIIlIlllI();
    }
}

