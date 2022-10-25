package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.Collections;
import java.util.List;

public class class_1561
implements class_1574 {
    private final boolean lllIIIllIIIIlllIlIIllIIll;
    private final boolean lllIlIIlIIIlIlIIIllIlllIl;
    private final List IlIllllllIIlIIllllIIlIIIl;

    public class_1561(boolean bl, boolean bl2, List list) {
        this.lllIIIllIIIIlllIlIIllIIll = bl;
        this.lllIlIIlIIIlIlIIIllIlllIl = bl2;
        this.IlIllllllIIlIIllllIIlIIIl = list;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public boolean lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public List IlIllllllIIlIIllllIIlIIIl() {
        return Collections.unmodifiableList(this.IlIllllllIIlIIllllIIlIIIl);
    }
}

