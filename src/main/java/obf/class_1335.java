package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.GameSettings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class class_1335
implements Comparable {
    private static final List lllIlIIlIIIlIlIIIllIlllIl = new ArrayList();
    private static final class_1890 IlIllllllIIlIIllllIIlIIIl = new class_1890();
    private static final Set lIlllIlllIIIIlIIlllIllIII = new HashSet();
    private final String IlIIIIIllllllIIlllIllllll;
    private final int lIllllIIlIIIlIllllllIIIll;
    private final String IIIllIIlIIIIIIlIlIIllIIlI;
    private int IllIIlllllllIIlIIlIIIIlIl;
    private boolean IIIllIllIIlIlIlIlIllllIIl;
    private int IllIIIllIIIIlIlIlIllIIlll;
    public boolean lllIIIllIIIIlllIlIIllIIll = false;

    public static void lllIIIllIIIIlllIlIIllIIll(int n) {
        class_1335 class_13352;
        if (n != 0 && (class_13352 = (class_1335)IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(n)) != null) {
            ++class_13352.IllIIIllIIIIlIlIlIllIIlll;
        }
    }

    public static void lllIIIllIIIIlllIlIIllIIll(int n, boolean bl) {
        class_1335 class_13352;
        if (n != 0 && (class_13352 = (class_1335)IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(n)) != null) {
            class_13352.IIIllIllIIlIlIlIlIllllIIl = bl;
        }
    }

    public static void lllIIIllIIIIlllIlIIllIIll() {
        for (class_1335 class_13352 : lllIlIIlIIIlIlIIIllIlllIl) {
            class_13352.IllIIIllIIIIlIlIlIllIIlll();
        }
    }

    public static void lllIlIIlIIIlIlIIIllIlllIl() {
        IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll();
        for (class_1335 class_13352 : lllIlIIlIIIlIlIIIllIlllIl) {
            IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(class_13352.IllIIlllllllIIlIIlIIIIlIl, class_13352);
        }
    }

    public static Set IlIllllllIIlIIllllIIlIIIl() {
        return lIlllIlllIIIIlIIlllIllIII;
    }

    public class_1335(String string, int n, String string2) {
        this(string, n, string2, false);
    }

    public class_1335(String string, int n, String string2, boolean bl) {
        this.IlIIIIIllllllIIlllIllllll = string;
        this.IllIIlllllllIIlIIlIIIIlIl = n;
        this.lIllllIIlIIIlIllllllIIIll = n;
        this.IIIllIIlIIIIIIlIlIIllIIlI = string2;
        this.lllIIIllIIIIlllIlIIllIIll = bl;
        lllIlIIlIIIlIlIIIllIlllIl.add(this);
        IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(n, this);
        lIlllIlllIIIIlIIlllIllIII.add(string2);
    }

    public boolean lIlllIlllIIIIlIIlllIllIII() {
        return this.IIIllIllIIlIlIlIlIllllIIl;
    }

    public String IlIIIIIllllllIIlllIllllll() {
        return this.IIIllIIlIIIIIIlIlIIllIIlI;
    }

    public boolean lIllllIIlIIIlIllllllIIIll() {
        if (this.IllIIIllIIIIlIlIlIllIIlll == 0) {
            return false;
        }
        --this.IllIIIllIIIIlIlIlIllIIlll;
        return true;
    }

    private void IllIIIllIIIIlIlIlIllIIlll() {
        this.IllIIIllIIIIlIlIlIllIIlll = 0;
        this.IIIllIllIIlIlIlIlIllllIIl = false;
    }

    public String IIIllIIlIIIIIIlIlIIllIIlI() {
        return this.IlIIIIIllllllIIlllIllllll;
    }

    public int IllIIlllllllIIlIIlIIIIlIl() {
        return this.lIllllIIlIIIlIllllllIIIll;
    }

    public int IIIllIllIIlIlIlIlIllllIIl() {
        return this.IllIIlllllllIIlIIlIIIIlIl;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(int n) {
        GameSettings class_17512 = Minecraft.getMinecraft().gameSettings;
        if (class_17512 != null && this == class_17512.lIlIllllIlIIIIIllIIIIlIlI && n != -100 && n != -99) {
            return;
        }
        this.IllIIlllllllIIlIIlIIIIlIl = n;
    }

    public int lllIIIllIIIIlllIlIIllIIll(class_1335 class_13352) {
        int n = class_0616.lllIIIllIIIIlllIlIIllIIll(this.IIIllIIlIIIIIIlIlIIllIIlI, new Object[0]).compareTo(class_0616.lllIIIllIIIIlllIlIIllIIll(class_13352.IIIllIIlIIIIIIlIlIIllIIlI, new Object[0]));
        if (n == 0) {
            n = class_0616.lllIIIllIIIIlllIlIIllIIll(this.IlIIIIIllllllIIlllIllllll, new Object[0]).compareTo(class_0616.lllIIIllIIIIlllIlIIllIIll(class_13352.IlIIIIIllllllIIlllIllllll, new Object[0]));
        }
        return n;
    }

    public int compareTo(Object object) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_1335)object);
    }
}

