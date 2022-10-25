package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.util.HashMap;
import java.util.Map;

import net.minecraft.crash.CrashReport;
import net.minecraft.client.renderer.OpenGlHelper;
import org.lwjgl.opengl.GL11;

public class class_1683 {
    private Map llIIllIllIlIIlIIllIllllll = new HashMap();
    public static class_1683 lllIIIllIIIIlllIlIIllIIll = new class_1683();
    private class_1854 lllIIlIIIllllllIIIIlIlIlI;
    public static double lllIlIIlIIIlIlIIIllIlllIl;
    public static double IlIllllllIIlIIllllIIlIIIl;
    public static double lIlllIlllIIIIlIIlllIllIII;
    public class_1682 IlIIIIIllllllIIlllIllllll;
    public class_1334 lIllllIIlIIIlIllllllIIIll;
    public class_1965 IIIllIIlIIIIIIlIlIIllIIlI;
    public float IllIIlllllllIIlIIlIIIIlIl;
    public float IIIllIllIIlIlIlIlIllllIIl;
    public double IllIIIllIIIIlIlIlIllIIlll;
    public double lIIIIlIlIIlllllIIllIIlIII;
    public double llIIlllIllIllllIIIlIIIIII;

    private class_1683() {
        this.llIIllIllIlIIlIIllIllllll.put(class_2219.class, new class_0599());
        this.llIIllIllIlIIlIIllIllllll.put(class_0933.class, new class_0535());
        this.llIIllIllIlIIlIIllIllllll.put(class_0919.class, new class_0648());
        this.llIIllIllIlIIlIIllIllllll.put(class_0071.class, new class_0451());
        this.llIIllIllIlIIlIIllIllllll.put(class_1314.class, new class_1359());
        this.llIIllIllIlIIlIIllIllllll.put(class_2014.class, new class_1198());
        this.llIIllIllIlIIlIIllIllllll.put(class_1525.class, new class_2182());
        this.llIIllIllIlIIlIIllIllllll.put(class_0396.class, new class_0381());
        this.llIIllIllIlIIlIIllIllllll.put(class_0090.class, new class_0619());
        for (class_2052 class_20522 : this.llIIllIllIlIIlIIllIllllll.values()) {
            class_20522.lllIIIllIIIIlllIlIIllIIll(this);
        }
    }

    public class_2052 lllIIIllIIIIlllIlIIllIIll(Class class_) {
        class_2052 class_20522 = (class_2052)this.llIIllIllIlIIlIIllIllllll.get(class_);
        if (class_20522 == null && class_ != class_1774.class) {
            class_20522 = this.lllIIIllIIIIlllIlIIllIIll(class_.getSuperclass());
            this.llIIllIllIlIIlIIllIllllll.put(class_, class_20522);
        }
        return class_20522;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_1774 class_17742) {
        return this.lllIlIIlIIIlIlIIIllIlllIl(class_17742) != null;
    }

    public class_2052 lllIlIIlIIIlIlIIIllIlllIl(class_1774 class_17742) {
        return class_17742 == null ? null : this.lllIIIllIIIIlllIlIIllIIll(class_17742.getClass());
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, class_1682 class_16822, class_1854 class_18542, class_1965 class_19652, float f) {
        if (this.lIllllIIlIIIlIllllllIIIll != class_13342) {
            this.lllIIIllIIIIlllIlIIllIIll(class_13342);
        }
        this.IlIIIIIllllllIIlllIllllll = class_16822;
        this.IIIllIIlIIIIIIlIlIIllIIlI = class_19652;
        this.lllIIlIIIllllllIIIIlIlIlI = class_18542;
        this.IllIIlllllllIIlIIlIIIIlIl = class_19652.llllIIIIlIIIlIIIIIIlIllll + (class_19652.IIIIlIllIlIIlIIlIllIlIlll - class_19652.llllIIIIlIIIlIIIIIIlIllll) * f;
        this.IIIllIllIIlIlIlIlIllllIIl = class_19652.llIIIIllIIIIIIIlIIIlIIIIl + (class_19652.IlIlIIlllIllllllllIIIlIlI - class_19652.llIIIIllIIIIIIIlIIIlIIIIl) * f;
        this.IllIIIllIIIIlIlIlIllIIlll = class_19652.lIIIlIIIlIlllIllIIIlIIIlI + (class_19652.IlIIlllllIIlIlIlllllIllll - class_19652.lIIIlIIIlIlllIllIIIlIIIlI) * (double)f;
        this.lIIIIlIlIIlllllIIllIIlIII = class_19652.lIIlIlllIllIlIlllIIIIIIII + (class_19652.llIIlIlIlllIIllIlIlllIllI - class_19652.lIIlIlllIllIlIlllIIIIIIII) * (double)f;
        this.llIIlllIllIllllIIIlIIIIII = class_19652.IIlIllIIlllllIIlIIllllIIl + (class_19652.IllIIIIllIIllIllIlllIlIIl - class_19652.IIlIllIIlllllIIlIIllllIIl) * (double)f;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1774 class_17742, float f) {
        if (class_17742.lllIIIllIIIIlllIlIIllIIll(this.IllIIIllIIIIlIlIlIllIIlll, this.lIIIIlIlIIlllllIIllIIlIII, this.llIIlllIllIllllIIIlIIIIII) < class_17742.lIllllIIlIIIlIllllllIIIll()) {
            int n = this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(class_17742.lllIlIIlIIIlIlIIIllIlllIl, class_17742.IlIllllllIIlIIllllIIlIIIl, class_17742.lIlllIlllIIIIlIIlllIllIII, 0);
            int n2 = n % 65536;
            int n3 = n / 65536;
            OpenGlHelper.lllIIIllIIIIlllIlIIllIIll(OpenGlHelper.IlIllllllIIlIIllllIIlIIIl, (float)n2 / 1.0f, (float)n3 / 1.0f);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            this.lllIIIllIIIIlllIlIIllIIll(class_17742, (double)class_17742.lllIlIIlIIIlIlIIIllIlllIl - lllIlIIlIIIlIlIIIllIlllIl, (double)class_17742.IlIllllllIIlIIllllIIlIIIl - IlIllllllIIlIIllllIIlIIIl, (double)class_17742.lIlllIlllIIIIlIIlllIllIII - lIlllIlllIIIIlIIlllIllIII, f);
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1774 class_17742, double d, double d2, double d3, float f) {
        class_2052 class_20522 = this.lllIlIIlIIIlIlIIIllIlllIl(class_17742);
        if (class_20522 != null) {
            try {
                class_20522.lllIIIllIIIIlllIlIIllIIll(class_17742, d, d2, d3, f);
            }
            catch (Throwable throwable) {
                CrashReport class_02232 = CrashReport.lllIIIllIIIIlllIlIIllIIll(throwable, "Rendering net.minecraft.block.Block Entity");
                class_0799 class_07992 = class_02232.lllIIIllIIIIlllIlIIllIIll("net.minecraft.block.Block Entity Details");
                class_17742.lllIIIllIIIIlllIlIIllIIll(class_07992);
                throw new class_0892(class_02232);
            }
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342) {
        this.lIllllIIlIIIlIllllllIIIll = class_13342;
        for (class_2052 class_20522 : this.llIIllIllIlIIlIIllIllllll.values()) {
            if (class_20522 == null) continue;
            class_20522.lllIIIllIIIIlllIlIIllIIll(class_13342);
        }
    }

    public class_1854 lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIIlIIIllllllIIIIlIlIlI;
    }
}

