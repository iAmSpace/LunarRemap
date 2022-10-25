package net.minecraft.util;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.Validate
 */
import org.apache.commons.lang3.Validate;

public class ResourceLocation {
    private final String lllIIIllIIIIlllIlIIllIIll;
    private final String lllIlIIlIIIlIlIIIllIlllIl;

    public ResourceLocation(String string, String string2) {
        Validate.notNull((Object)string2);
        this.lllIIIllIIIIlllIlIIllIIll = string != null && string.length() != 0 ? string : "minecraft";
        this.lllIlIIlIIIlIlIIIllIlllIl = string2;
    }

    public ResourceLocation(String string) {
        String string2 = "minecraft";
        String string3 = string;
        int n = string.indexOf(58);
        if (n >= 0) {
            string3 = string.substring(n + 1, string.length());
            if (n > 1) {
                string2 = string.substring(0, n);
            }
        }
        this.lllIIIllIIIIlllIlIIllIIll = string2.toLowerCase();
        this.lllIlIIlIIIlIlIIIllIlllIl = string3;
    }

    public String lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public String lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public String toString() {
        return this.lllIIIllIIIIlllIlIIllIIll + ":" + this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof ResourceLocation)) {
            return false;
        }
        ResourceLocation class_17732 = (ResourceLocation)object;
        return this.lllIIIllIIIIlllIlIIllIIll.equals(class_17732.lllIIIllIIIIlllIlIIllIIll) && this.lllIlIIlIIIlIlIIIllIlllIl.equals(class_17732.lllIlIIlIIIlIlIIIllIlllIl);
    }

    public int hashCode() {
        return 31 * this.lllIIIllIIIIlllIlIIllIIll.hashCode() + this.lllIlIIlIIIlIlIIIllIlllIl.hashCode();
    }
}

