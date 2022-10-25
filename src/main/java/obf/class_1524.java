package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.Collections;
import java.util.List;

public class class_1524
extends class_0551 {
    private final Class lllIIIllIIIIlllIlIIllIIll;
    private final int lllIlIIlIIIlIlIIIllIlllIl;
    private final class_1776 IlIIIIIllllllIIlllIllllll;
    private final class_0830 lIllllIIlIIIlIllllllIIIll;
    private class_1965 IIIllIIlIIIIIIlIlIIllIIlI;

    public class_1524(class_1252 class_12522, Class class_, int n, boolean bl) {
        this(class_12522, class_, n, bl, false);
    }

    public class_1524(class_1252 class_12522, Class class_, int n, boolean bl, boolean bl2) {
        this(class_12522, class_, n, bl, bl2, null);
    }

    public class_1524(class_1252 class_12522, Class class_, int n, boolean bl, boolean bl2, class_0830 class_08302) {
        super(class_12522, bl, bl2);
        this.lllIIIllIIIIlllIlIIllIIll = class_;
        this.lllIlIIlIIIlIlIIIllIlllIl = n;
        this.IlIIIIIllllllIIlllIllllll = new class_1776(class_12522);
        this.lllIIIllIIIIlllIlIIllIIll(1);
        this.lIllllIIlIIIlIllllllIIIll = new class_1259(this, class_08302);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll() {
        if (this.lllIlIIlIIIlIlIIIllIlllIl > 0 && this.IlIllllllIIlIIllllIIlIIIl.IlllIIIlIIlIIIIllllIllllI().nextInt(this.lllIlIIlIIIlIlIIIllIlllIl) != 0) {
            return false;
        }
        double d = this.IllIIlllllllIIlIIlIIIIlIl();
        List list = this.IlIllllllIIlIIllllIIlIIIl.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, this.IlIllllllIIlIIllllIIlIIIl.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl(d, 4.0, d), this.lIllllIIlIIIlIllllllIIIll);
        Collections.sort(list, this.IlIIIIIllllllIIlllIllllll);
        if (list.isEmpty()) {
            return false;
        }
        this.IIIllIIlIIIIIIlIlIIllIIlI = (class_1965)list.get(0);
        return true;
    }

    @Override
    public void IlIIIIIllllllIIlllIllllll() {
        this.IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl(this.IIIllIIlIIIIIIlIlIIllIIlI);
        super.IlIIIIIllllllIIlllIllllll();
    }
}

