package obf;

import net.minecraft.util.IChatComponent;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0015 {
    private final class_0248 lllIIIllIIIIlllIlIIllIIll;
    private final IChatComponent lllIlIIlIIIlIlIIIllIlllIl;

    public class_0015(class_0248 class_02482, IChatComponent class_22552) {
        this.lllIIIllIIIIlllIlIIllIIll = class_02482;
        this.lllIlIIlIIIlIlIIIllIlllIl = class_22552;
    }

    public class_0248 lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public IChatComponent lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            class_0015 class_00152 = (class_0015)object;
            if (this.lllIIIllIIIIlllIlIIllIIll != class_00152.lllIIIllIIIIlllIlIIllIIll) {
                return false;
            }
            return !(this.lllIlIIlIIIlIlIIIllIlllIl != null ? !this.lllIlIIlIIIlIlIIIllIlllIl.equals(class_00152.lllIlIIlIIIlIlIIIllIlllIl) : class_00152.lllIlIIlIIIlIlIIIllIlllIl != null);
        }
        return false;
    }

    public String toString() {
        return "HoverEvent{action=" + (Object)((Object)this.lllIIIllIIIIlllIlIIllIIll) + ", value='" + this.lllIlIIlIIIlIlIIIllIlllIl + '\'' + '}';
    }

    public int hashCode() {
        int n = this.lllIIIllIIIIlllIlIIllIIll.hashCode();
        n = 31 * n + (this.lllIlIIlIIIlIlIIIllIlllIl != null ? this.lllIlIIlIIIlIlIIIllIlllIl.hashCode() : 0);
        return n;
    }
}

