package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1200
extends class_1246 {
    @Override
    public String lllIIIllIIIIlllIlIIllIIll() {
        return "save-on";
    }

    @Override
    public String lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692) {
        return "commands.save-on.usage";
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692, String[] arrstring) {
        class_0220 class_02202 = class_0220.IlIIlllllIIlIlIlllllIllll();
        boolean bl = false;
        for (int i = 0; i < class_02202.IlIllllllIIlIIllllIIlIIIl.length; ++i) {
            if (class_02202.IlIllllllIIlIIllllIIlIIIl[i] == null) continue;
            class_0976 class_09762 = class_02202.IlIllllllIIlIIllllIIlIIIl[i];
            if (!class_09762.llllIIIIlIIIlIIIIIIlIllll) continue;
            class_09762.llllIIIIlIIIlIIIIIIlIllll = false;
            bl = true;
        }
        if (!bl) {
            throw new class_1953("commands.save-on.alreadyOn", new Object[0]);
        }
        class_1200.lllIIIllIIIIlllIlIIllIIll(class_19692, (class_0291)this, "commands.save.enabled", new Object[0]);
    }
}
