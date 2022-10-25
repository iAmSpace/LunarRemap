package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;
import java.util.List;

public class class_0162 {
    class_0339 lllIIIllIIIIlllIlIIllIIll;
    List lllIlIIlIIIlIlIIIllIlllIl = new ArrayList();
    List IlIllllllIIlIIllllIIlIIIl = new ArrayList();

    public class_0162(class_0339 class_03392) {
        this.lllIIIllIIIIlllIlIIllIIll = class_03392;
    }

    public void lllIIIllIIIIlllIlIIllIIll() {
        this.lllIlIIlIIIlIlIIIllIlllIl.clear();
        this.IlIllllllIIlIIllllIIlIIIl.clear();
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212) {
        if (this.lllIlIIlIIIlIlIIIllIlllIl.contains(class_15212)) {
            return true;
        }
        if (this.IlIllllllIIlIIllllIIlIIIl.contains(class_15212)) {
            return false;
        }
        this.lllIIIllIIIIlllIlIIllIIll.lIlIllIIlIIlIIlIIlIIlIIll.IlIIlllllIIlIlIlllllIllll.startSection("canSee");
        boolean bl = this.lllIIIllIIIIlllIlIIllIIll.IlIlllIIIIIIlIIllIIllIlll(class_15212);
        this.lllIIIllIIIIlllIlIIllIIll.lIlIllIIlIIlIIlIIlIIlIIll.IlIIlllllIIlIlIlllllIllll.endSection();
        if (bl) {
            this.lllIlIIlIIIlIlIIIllIlllIl.add(class_15212);
        } else {
            this.IlIllllllIIlIIllllIIlIIIl.add(class_15212);
        }
        return bl;
    }
}

