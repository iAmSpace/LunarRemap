package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public abstract class class_1382 {
    public float lllIIIllIIIIlllIlIIllIIll;
    public boolean lllIlIIlIIIlIlIIIllIlllIl;
    public List IlIllllllIIlIIllllIIlIIIl = new ArrayList();
    public boolean lIlllIlllIIIIlIIlllIllIII = true;
    private Map IIIllIIlIIIIIIlIlIIllIIlI = new HashMap();
    public int IlIIIIIllllllIIlllIllllll = 64;
    public int lIllllIIlIIIlIllllllIIIll = 32;

    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, float f, float f2, float f3, float f4, float f5, float f6) {
    }

    public void lllIIIllIIIIlllIlIIllIIll(float f, float f2, float f3, float f4, float f5, float f6, class_1521 class_15212) {
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652, float f, float f2, float f3) {
    }

    public class_0744 lllIIIllIIIIlllIlIIllIIll(Random random) {
        return (class_0744)this.IlIllllllIIlIIllllIIlIIIl.get(random.nextInt(this.IlIllllllIIlIIllllIIlIIIl.size()));
    }

    protected void lllIIIllIIIIlllIlIIllIIll(String string, int n, int n2) {
        this.IIIllIIlIIIIIIlIlIIllIIlI.put(string, new class_0190(n, n2));
    }

    public class_0190 lllIIIllIIIIlllIlIIllIIll(String string) {
        return (class_0190)this.IIIllIIlIIIIIIlIlIIllIIlI.get(string);
    }
}

