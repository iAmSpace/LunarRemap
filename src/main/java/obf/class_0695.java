package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_0695
implements class_1848 {
    private static final Logger lllIIIllIIIIlllIlIIllIIll = LogManager.getLogger();
    private class_0723 lllIlIIlIIIlIlIIIllIlllIl;
    private class_1562 IlIllllllIIlIIllllIIlIIIl = new class_1562();
    private List lIlllIlllIIIIlIIlllIllIII = new ArrayList();
    private class_1334 IlIIIIIllllllIIlllIllllll;

    public class_0695(class_1334 class_13342) {
        this.lllIlIIlIIIlIlIIIllIlllIl = new class_1279(class_13342, 0, 0);
        this.IlIIIIIllllllIIlllIllllll = class_13342;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        return true;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(int n, int n2) {
        class_0723 class_07232 = this.lIlllIlllIIIIlIIlllIllIII(n, n2);
        if (!class_07232.IllIIlllllllIIlIIlIIIIlIl()) {
            class_07232.lIllllIIlIIIlIllllllIIIll();
        }
        this.IlIllllllIIlIIllllIIlIIIl.lIlllIlllIIIIlIIlllIllIII(class_1108.lllIIIllIIIIlllIlIIllIIll(n, n2));
        this.lIlllIlllIIIIlIIlllIllIII.remove(class_07232);
    }

    @Override
    public class_0723 IlIllllllIIlIIllllIIlIIIl(int n, int n2) {
        class_0723 class_07232 = new class_0723(this.IlIIIIIllllllIIlllIllllll, n, n2);
        this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(class_1108.lllIIIllIIIIlllIlIIllIIll(n, n2), class_07232);
        this.lIlllIlllIIIIlIIlllIllIII.add(class_07232);
        class_07232.lIlllIlllIIIIlIIlllIllIII = true;
        return class_07232;
    }

    @Override
    public class_0723 lIlllIlllIIIIlIIlllIllIII(int n, int n2) {
        class_0723 class_07232 = (class_0723)this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(class_1108.lllIIIllIIIIlllIlIIllIIll(n, n2));
        return class_07232 == null ? this.lllIlIIlIIIlIlIIIllIlllIl : class_07232;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(boolean bl, class_1832 class_18322) {
        return true;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll() {
    }

    @Override
    public boolean lllIlIIlIIIlIlIIIllIlllIl() {
        long l = System.currentTimeMillis();
        for (class_0723 class_07232 : this.lIlllIlllIIIIlIIlllIllIII) {
            class_07232.lllIlIIlIIIlIlIIIllIlllIl(System.currentTimeMillis() - l > 5L);
        }
        if (System.currentTimeMillis() - l > 100L) {
            lllIIIllIIIIlllIlIIllIIll.info("Warning: Clientside chunk ticking took {} ms", new Object[]{System.currentTimeMillis() - l});
        }
        return false;
    }

    @Override
    public boolean IlIllllllIIlIIllllIIlIIIl() {
        return false;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1848 class_18482, int n, int n2) {
    }

    @Override
    public String lIlllIlllIIIIlIIlllIllIII() {
        return "MultiplayerChunkCache: " + this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll() + ", " + this.lIlllIlllIIIIlIIlllIllIII.size();
    }

    @Override
    public List lllIIIllIIIIlllIlIIllIIll(class_1012 class_10122, int n, int n2, int n3) {
        return null;
    }

    @Override
    public class_2137 lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, String string, int n, int n2, int n3) {
        return null;
    }

    @Override
    public int IlIIIIIllllllIIlllIllllll() {
        return this.lIlllIlllIIIIlIIlllIllIII.size();
    }

    @Override
    public void IlIIIIIllllllIIlllIllllll(int n, int n2) {
    }
}

