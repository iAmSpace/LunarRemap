package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_2248
extends class_1246 {
    @Override
    public String lllIIIllIIIIlllIlIIllIIll() {
        return "publish";
    }

    @Override
    public String lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692) {
        return "commands.publish.usage";
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692, String[] arrstring) {
        String string = class_0220.IlIIlllllIIlIlIlllllIllll().lllIIIllIIIIlllIlIIllIIll(class_2243.lllIlIIlIIIlIlIIIllIlllIl, false);
        if (string != null) {
            class_2248.lllIIIllIIIIlllIlIIllIIll(class_19692, (class_0291)this, "commands.publish.started", string);
        } else {
            class_2248.lllIIIllIIIIlllIlIIllIIll(class_19692, (class_0291)this, "commands.publish.failed", new Object[0]);
        }
    }
}

