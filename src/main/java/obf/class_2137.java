package obf;

import net.minecraft.util.MathHelper;

/*
 * Decompiled with CFR 0.150.
 */
public class class_2137 {
    public final int lllIIIllIIIIlllIlIIllIIll;
    public final int lllIlIIlIIIlIlIIIllIlllIl;
    public final int IlIllllllIIlIIllllIIlIIIl;

    public class_2137(int n, int n2, int n3) {
        this.lllIIIllIIIIlllIlIIllIIll = n;
        this.lllIlIIlIIIlIlIIIllIlllIl = n2;
        this.IlIllllllIIlIIllllIIlIIIl = n3;
    }

    public class_2137(class_0864 class_08642) {
        this(MathHelper.IlIllllllIIlIIllllIIlIIIl(class_08642.lllIIIllIIIIlllIlIIllIIll), MathHelper.IlIllllllIIlIIllllIIlIIIl(class_08642.lllIlIIlIIIlIlIIIllIlllIl), MathHelper.IlIllllllIIlIIllllIIlIIIl(class_08642.IlIllllllIIlIIllllIIlIIIl));
    }

    public boolean equals(Object object) {
        if (!(object instanceof class_2137)) {
            return false;
        }
        class_2137 class_21372 = (class_2137)object;
        return class_21372.lllIIIllIIIIlllIlIIllIIll == this.lllIIIllIIIIlllIlIIllIIll && class_21372.lllIlIIlIIIlIlIIIllIlllIl == this.lllIlIIlIIIlIlIIIllIlllIl && class_21372.IlIllllllIIlIIllllIIlIIIl == this.IlIllllllIIlIIllllIIlIIIl;
    }

    public int hashCode() {
        return this.lllIIIllIIIIlllIlIIllIIll * 8976890 + this.lllIlIIlIIIlIlIIIllIlllIl * 981131 + this.IlIllllllIIlIIllllIIlIIIl;
    }
}

