package obf;

import net.minecraft.util.IChatComponent;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0722
extends class_1014 {
    private final String lllIlIIlIIIlIlIIIllIlllIl;
    private boolean IlIllllllIIlIIllllIIlIIIl;

    public class_0722(String string) {
        this.lllIlIIlIIIlIlIIIllIlllIl = string;
    }

    public String IlIIIIIllllllIIlllIllllll() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    @Override
    public String lIllllIIlIIIlIllllllIIIll() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public class_0722 IIIllIIlIIIIIIlIlIIllIIlI() {
        class_0722 class_07222 = new class_0722(this.lllIlIIlIIIlIlIIIllIlllIl);
        class_07222.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl().lIIIIlIlIIlllllIIllIIlIII());
        class_07222.lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl);
        for (IChatComponent class_22552 : this.lllIIIllIIIIlllIlIIllIIll()) {
            class_07222.lllIIIllIIIIlllIlIIllIIll(class_22552.IIIllIllIIlIlIlIlIllllIIl());
        }
        return class_07222;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof class_0722)) {
            return false;
        }
        class_0722 class_07222 = (class_0722)object;
        return this.lllIlIIlIIIlIlIIIllIlllIl.equals(class_07222.IlIIIIIllllllIIlllIllllll()) && super.equals(object);
    }

    @Override
    public String toString() {
        return "TextComponent{text='" + this.lllIlIIlIIIlIlIIIllIlllIl + '\'' + ", siblings=" + this.lllIIIllIIIIlllIlIIllIIll + ", style=" + this.lllIlIIlIIIlIlIIIllIlllIl() + '}';
    }

    public boolean IllIIlllllllIIlIIlIIIIlIl() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public void lllIIIllIIIIlllIlIIllIIll(boolean bl) {
        this.IlIllllllIIlIIllllIIlIIIl = bl;
    }

    @Override
    public /* synthetic */ IChatComponent IIIllIllIIlIlIlIlIllllIIl() {
        return this.IIIllIIlIIIIIIlIlIIllIIlI();
    }
}

