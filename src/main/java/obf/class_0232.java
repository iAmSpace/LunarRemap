package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;
import java.util.Collection;

public class class_0232
extends class_0703 {
    private String lllIIIllIIIIlllIlIIllIIll = "";
    private String lllIlIIlIIIlIlIIIllIlllIl = "";
    private String IlIllllllIIlIIllllIIlIIIl = "";
    private String lIlllIlllIIIIlIIlllIllIII = "";
    private Collection IlIIIIIllllllIIlllIllllll = new ArrayList();
    private int lIllllIIlIIIlIllllllIIIll;
    private int IIIllIIlIIIIIIlIlIIllIIlI;

    public class_0232() {
    }

    public class_0232(class_0531 class_05312, int n) {
        this.lllIIIllIIIIlllIlIIllIIll = class_05312.lllIIIllIIIIlllIlIIllIIll();
        this.lIllllIIlIIIlIllllllIIIll = n;
        if (n == 0 || n == 2) {
            this.lllIlIIlIIIlIlIIIllIlllIl = class_05312.lllIlIIlIIIlIlIIIllIlllIl();
            this.IlIllllllIIlIIllllIIlIIIl = class_05312.lIlllIlllIIIIlIIlllIllIII();
            this.lIlllIlllIIIIlIIlllIllIII = class_05312.IlIIIIIllllllIIlllIllllll();
            this.IIIllIIlIIIIIIlIlIIllIIlI = class_05312.IllIIlllllllIIlIIlIIIIlIl();
        }
        if (n == 0) {
            this.IlIIIIIllllllIIlllIllllll.addAll(class_05312.IlIllllllIIlIIllllIIlIIIl());
        }
    }

    public class_0232(class_0531 class_05312, Collection collection, int n) {
        if (n != 3 && n != 4) {
            throw new IllegalArgumentException("Method must be join or leave for player constructor");
        }
        if (collection == null || collection.isEmpty()) {
            throw new IllegalArgumentException("Players cannot be null/empty");
        }
        this.lIllllIIlIIIlIllllllIIIll = n;
        this.lllIIIllIIIIlllIlIIllIIll = class_05312.lllIIIllIIIIlllIlIIllIIll();
        this.IlIIIIIllllllIIlllIllllll.addAll(collection);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0181 class_01812) {
        this.lllIIIllIIIIlllIlIIllIIll = class_01812.IlIllllllIIlIIllllIIlIIIl(16);
        this.lIllllIIlIIIlIllllllIIIll = class_01812.readByte();
        if (this.lIllllIIlIIIlIllllllIIIll == 0 || this.lIllllIIlIIIlIllllllIIIll == 2) {
            this.lllIlIIlIIIlIlIIIllIlllIl = class_01812.IlIllllllIIlIIllllIIlIIIl(32);
            this.IlIllllllIIlIIllllIIlIIIl = class_01812.IlIllllllIIlIIllllIIlIIIl(16);
            this.lIlllIlllIIIIlIIlllIllIII = class_01812.IlIllllllIIlIIllllIIlIIIl(16);
            this.IIIllIIlIIIIIIlIlIIllIIlI = class_01812.readByte();
        }
        if (this.lIllllIIlIIIlIllllllIIIll == 0 || this.lIllllIIlIIIlIllllllIIIll == 3 || this.lIllllIIlIIIlIllllllIIIll == 4) {
            int n = class_01812.readShort();
            for (int i = 0; i < n; ++i) {
                this.IlIIIIIllllllIIlllIllllll.add(class_01812.IlIllllllIIlIIllllIIlIIIl(40));
            }
        }
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0181 class_01812) {
        class_01812.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll);
        class_01812.writeByte(this.lIllllIIlIIIlIllllllIIIll);
        if (this.lIllllIIlIIIlIllllllIIIll == 0 || this.lIllllIIlIIIlIllllllIIIll == 2) {
            class_01812.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl);
            class_01812.lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl);
            class_01812.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII);
            class_01812.writeByte(this.IIIllIIlIIIIIIlIlIIllIIlI);
        }
        if (this.lIllllIIlIIIlIllllllIIIll == 0 || this.lIllllIIlIIIlIllllllIIIll == 3 || this.lIllllIIlIIIlIllllllIIIll == 4) {
            class_01812.writeShort(this.IlIIIIIllllllIIlllIllllll.size());
            for (String string : this.IlIIIIIllllllIIlllIllllll) {
                class_01812.lllIIIllIIIIlllIlIIllIIll(string);
            }
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0596 class_05962) {
        class_05962.lllIIIllIIIIlllIlIIllIIll(this);
    }

    public String IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public String lIlllIlllIIIIlIIlllIllIII() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public String IlIIIIIllllllIIlllIllllll() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public String lIllllIIlIIIlIllllllIIIll() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    public Collection IIIllIIlIIIIIIlIlIIllIIlI() {
        return this.IlIIIIIllllllIIlllIllllll;
    }

    public int IllIIlllllllIIlIIlIIIIlIl() {
        return this.lIllllIIlIIIlIllllllIIIll;
    }

    public int IIIllIllIIlIlIlIlIllllIIl() {
        return this.IIIllIIlIIIIIIlIlIIllIIlI;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_2075 class_20752) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0596)class_20752);
    }
}

