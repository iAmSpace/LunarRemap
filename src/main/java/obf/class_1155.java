package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1155
extends class_1246 {
    @Override
    public String lllIIIllIIIIlllIlIIllIIll() {
        return "testfor";
    }

    @Override
    public int lllIlIIlIIIlIlIIIllIlllIl() {
        return 2;
    }

    @Override
    public String lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692) {
        return "commands.testfor.usage";
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692, String[] arrstring) {
        if (arrstring.length != 1) {
            throw new class_0932("commands.testfor.usage", new Object[0]);
        }
        if (!(class_19692 instanceof class_0484)) {
            throw new class_1953("commands.testfor.failed", new Object[0]);
        }
        class_1155.lIlllIlllIIIIlIIlllIllIII(class_19692, arrstring[0]);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(String[] arrstring, int n) {
        return n == 0;
    }
}

