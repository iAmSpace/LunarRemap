package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.util.HashMap;
import java.util.Map;

import com.moonsworth.lunar.client.LunarClient;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.crash.CrashReport;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.util.MathHelper;
import net.minecraft.client.renderer.OpenGlHelper;
import org.lwjgl.opengl.GL11;

public class class_2114 {
    private Map lllllIlllIIllIlIIlIIIllII = new HashMap();
    public static class_2114 lllIIIllIIIIlllIlIIllIIll = new class_2114();
    private class_1854 IlIlIIlllIIlIllIIIlllllIl;
    public static double lllIlIIlIIIlIlIIIllIlllIl;
    public static double IlIllllllIIlIIllllIIlIIIl;
    public static double lIlllIlllIIIIlIIlllIllIII;
    public class_1682 IlIIIIIllllllIIlllIllllll;
    public class_2059 lIllllIIlIIIlIllllllIIIll;
    public class_1334 IIIllIIlIIIIIIlIlIIllIIlI;
    public class_1965 IllIIlllllllIIlIIlIIIIlIl;
    public class_1521 IIIllIllIIlIlIlIlIllllIIl;
    public float IllIIIllIIIIlIlIlIllIIlll;
    public float lIIIIlIlIIlllllIIllIIlIII;
    public GameSettings llIIlllIllIllllIIIlIIIIII;
    public double llIIllIllIlIIlIIllIllllll;
    public double lllIIlIIIllllllIIIIlIlIlI;
    public double IlIlllIIIIIIlIIllIIllIlll;
    public static boolean IlIlIIlIlIllIIlIlIIllIIIl;

    private class_2114() {
        this.lllllIlllIIllIlIIlIIIllII.put(class_0249.class, new class_0053());
        this.lllllIlllIIllIlIIlIIIllII.put(class_1051.class, new class_1708());
        this.lllllIlllIIllIlIIlIIIllII.put(class_0161.class, new class_1402(new class_0652(), new class_0652(0.5f), 0.7f));
        this.lllllIlllIIllIlIIlIIIllII.put(class_1317.class, new class_1270(new class_0016(), new class_0174(), 0.7f));
        this.lllllIlllIIllIlIIlIIIllII.put(class_1802.class, new class_0299(new class_0687(), 0.7f));
        this.lllllIlllIIllIlIIlIIIllII.put(class_1584.class, new class_1199(new class_0687(), 0.7f));
        this.lllllIlllIIllIlIIlIIIllII.put(class_1305.class, new class_0239(new class_1541(), new class_1541(), 0.5f));
        this.lllllIlllIIllIlIIlIIIllII.put(class_1554.class, new class_1378(new class_0399(), 0.3f));
        this.lllllIlllIIllIlIIlIIIllII.put(class_0673.class, new class_1508(new class_1478(), 0.4f));
        this.lllllIlllIIllIlIIlIIIllII.put(class_0085.class, new class_1698());
        this.lllllIlllIIllIlIIlIIIllII.put(class_1234.class, new class_1464());
        this.lllllIlllIIllIlIIlIIIllII.put(class_0793.class, new class_0386());
        this.lllllIlllIIllIlIIlIIIllII.put(class_1405.class, new class_0163());
        this.lllllIlllIIllIlIIlIIIllII.put(class_0630.class, new class_0008());
        this.lllllIlllIIllIlIIlIIIllII.put(class_0066.class, new class_0428());
        this.lllllIlllIIllIlIIlIIIllII.put(class_1819.class, new class_1995());
        this.lllllIlllIIllIlIIlIIIllII.put(class_0724.class, new class_0282());
        this.lllllIlllIIllIlIIlIIIllII.put(class_2105.class, new class_0104(new class_1493(16), new class_1493(0), 0.25f));
        this.lllllIlllIIllIlIIlIIIllII.put(class_0882.class, new class_1697());
        this.lllllIlllIIllIlIIlIIIllII.put(class_0814.class, new class_0831());
        this.lllllIlllIIllIlIIlIIIllII.put(class_0405.class, new class_1658(new class_0274(), 0.5f, 6.0f));
        this.lllllIlllIIllIlIIlIIIllII.put(class_1413.class, new class_1758());
        this.lllllIlllIIllIlIIlIIIllII.put(class_0002.class, new class_1961(new class_1861(), 0.7f));
        this.lllllIlllIIllIlIIlIIIllII.put(class_1817.class, new class_1637());
        this.lllllIlllIIllIlIIlIIIllII.put(class_0991.class, new class_0331());
        this.lllllIlllIIllIlIIlIIIllII.put(class_0453.class, new class_2237());
        this.lllllIlllIIllIlIIlIIIllII.put(class_1221.class, new class_1906());
        this.lllllIlllIIllIlIIlIIIllII.put(class_0355.class, new class_0458());
        this.lllllIlllIIllIlIIlIIIllII.put(class_0590.class, new class_0840());
        this.lllllIlllIIllIlIIlIIIllII.put(class_1521.class, new class_0643());
        this.lllllIlllIIllIlIIlIIIllII.put(class_0146.class, new class_1793());
        this.lllllIlllIIllIlIIlIIIllII.put(class_1094.class, new class_1350());
        this.lllllIlllIIllIlIIlIIIllII.put(class_1215.class, new class_0439());
        this.lllllIlllIIllIlIIlIIIllII.put(class_0369.class, new class_0891());
        this.lllllIlllIIllIlIIlIIIllII.put(class_0333.class, new class_1779(Items.snowball));
        this.lllllIlllIIllIlIIlIIIllII.put(class_1918.class, new class_1779(Items.IlIIIIIIIIIIlIIlllIIIlIlI));
        this.lllllIlllIIllIlIIlIIIllII.put(class_0093.class, new class_1779(Items.ender_eye));
        this.lllllIlllIIllIlIIlIIIllII.put(class_0525.class, new class_1779(Items.egg));
        this.lllllIlllIIllIlIIlIIIllII.put(class_0426.class, new class_1779(Items.potionitem, 16384));
        this.lllllIlllIIllIlIIlIIIllII.put(class_1617.class, new class_1779(Items.experience_bottle));
        this.lllllIlllIIllIlIIlIIIllII.put(class_1800.class, new class_1779(Items.fireworks));
        this.lllllIlllIIllIlIIlIIIllII.put(class_1902.class, new class_1255(2.0f));
        this.lllllIlllIIllIlIIlIIIllII.put(class_1332.class, new class_1255(0.5f));
        this.lllllIlllIIllIlIIlIIIllII.put(class_2166.class, new class_1846());
        this.lllllIlllIIllIlIIlIIIllII.put(class_1781.class, new class_1785());
        this.lllllIlllIIllIlIIlIIIllII.put(class_1138.class, new class_0675());
        this.lllllIlllIIllIlIIlIIIllII.put(class_0034.class, new class_1107());
        this.lllllIlllIIllIlIIlIIIllII.put(class_0543.class, new class_1418());
        this.lllllIlllIIllIlIIlIIIllII.put(class_0858.class, new class_1491());
        this.lllllIlllIIllIlIIlIIIllII.put(class_1989.class, new class_1182());
        this.lllllIlllIIllIlIIlIIIllII.put(class_1860.class, new class_2154());
        this.lllllIlllIIllIlIIlIIIllII.put(class_2263.class, new class_0861());
        this.lllllIlllIIllIlIIlIIIllII.put(class_2050.class, new class_2184());
        this.lllllIlllIIllIlIIlIIIllII.put(class_1627.class, new class_1913(new class_1458(), 0.75f));
        this.lllllIlllIIllIlIIlIIIllII.put(class_0411.class, new class_0142());
        for (class_1603 class_16032 : this.lllllIlllIIllIlIIlIIIllII.values()) {
            class_16032.lllIIIllIIIIlllIlIIllIIll(this);
        }
    }

    public class_1603 lllIIIllIIIIlllIlIIllIIll(Class class_) {
        class_1603 class_16032 = (class_1603)this.lllllIlllIIllIlIIlIIIllII.get(class_);
        if (class_16032 == null && class_ != class_1521.class) {
            class_16032 = this.lllIIIllIIIIlllIlIIllIIll(class_.getSuperclass());
            this.lllllIlllIIllIlIIlIIIllII.put(class_, class_16032);
        }
        return class_16032;
    }

    public class_1603 lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212) {
        return this.lllIIIllIIIIlllIlIIllIIll(class_15212.getClass());
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, class_1682 class_16822, class_1854 class_18542, class_1965 class_19652, class_1521 class_15212, GameSettings class_17512, float f) {
        this.IIIllIIlIIIIIIlIlIIllIIlI = class_13342;
        this.IlIIIIIllllllIIlllIllllll = class_16822;
        this.llIIlllIllIllllIIIlIIIIII = class_17512;
        this.IllIIlllllllIIlIIlIIIIlIl = class_19652;
        this.IIIllIllIIlIlIlIlIllllIIl = class_15212;
        this.IlIlIIlllIIlIllIIIlllllIl = class_18542;
        if (class_19652.IIIIIllIIlIlIlIIlIlIlIllI()) {
            Block class_05492 = class_13342.a_(MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19652.IlIIlllllIIlIlIlllllIllll), MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19652.llIIlIlIlllIIllIlIlllIllI), MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19652.IllIIIIllIIllIllIlllIlIIl));
            if (class_05492 == Blocks.IllIIIIllIIllIllIlllIlIIl) {
                int n = class_13342.IlIllllllIIlIIllllIIlIIIl(MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19652.IlIIlllllIIlIlIlllllIllll), MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19652.llIIlIlIlllIIllIlIlllIllI), MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19652.IllIIIIllIIllIllIlllIlIIl));
                int n2 = n & 3;
                this.IllIIIllIIIIlIlIlIllIIlll = n2 * 90 + 180;
                this.lIIIIlIlIIlllllIIllIIlIII = 0.0f;
            }
        } else {
            class_1488 class_14882 = LunarClient.getInstance().getModuleManager().IlIIIlIIIIllIIIllIIIIIIll;
            if (class_14882.lllIIIllIIIIlllIlIIllIIll) {
                this.IllIIIllIIIIlIlIlIllIIlll = class_14882.IlIllllllIIlIIllllIIlIIIl + (class_14882.lllIlIIlIIIlIlIIIllIlllIl - class_14882.IlIllllllIIlIIllllIIlIIIl) * f;
                this.lIIIIlIlIIlllllIIllIIlIII = class_14882.IlIIIIIllllllIIlllIllllll + (class_14882.lIlllIlllIIIIlIIlllIllIII - class_14882.IlIIIIIllllllIIlllIllllll) * f;
            } else {
                this.IllIIIllIIIIlIlIlIllIIlll = class_19652.llllIIIIlIIIlIIIIIIlIllll + (class_19652.IIIIlIllIlIIlIIlIllIlIlll - class_19652.llllIIIIlIIIlIIIIIIlIllll) * f;
                this.lIIIIlIlIIlllllIIllIIlIII = class_19652.llIIIIllIIIIIIIlIIIlIIIIl + (class_19652.IlIlIIlllIllllllllIIIlIlI - class_19652.llIIIIllIIIIIIIlIIIlIIIIl) * f;
            }
        }
        if (class_17512.IIlIlIlIIlllIIIlIIIIlIIIl == 2) {
            this.IllIIIllIIIIlIlIlIllIIlll += 180.0f;
        }
        this.llIIllIllIlIIlIIllIllllll = class_19652.lIIIlIIIlIlllIllIIIlIIIlI + (class_19652.IlIIlllllIIlIlIlllllIllll - class_19652.lIIIlIIIlIlllIllIIIlIIIlI) * (double)f;
        this.lllIIlIIIllllllIIIIlIlIlI = class_19652.lIIlIlllIllIlIlllIIIIIIII + (class_19652.llIIlIlIlllIIllIlIlllIllI - class_19652.lIIlIlllIllIlIlllIIIIIIII) * (double)f;
        this.IlIlllIIIIIIlIIllIIllIlll = class_19652.IIlIllIIlllllIIlIIllllIIl + (class_19652.IllIIIIllIIllIllIlllIlIIl - class_19652.IIlIllIIlllllIIlIIllllIIl) * (double)f;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, float f) {
        return this.lllIIIllIIIIlllIlIIllIIll(class_15212, f, false);
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, float f, boolean bl) {
        if (class_15212.IlllIIIllllIIllIllIlIIlIl == 0) {
            class_15212.lIIIlIIIlIlllIllIIIlIIIlI = class_15212.IlIIlllllIIlIlIlllllIllll;
            class_15212.lIIlIlllIllIlIlllIIIIIIII = class_15212.llIIlIlIlllIIllIlIlllIllI;
            class_15212.IIlIllIIlllllIIlIIllllIIl = class_15212.IllIIIIllIIllIllIlllIlIIl;
        }
        double d = class_15212.lIIIlIIIlIlllIllIIIlIIIlI + (class_15212.IlIIlllllIIlIlIlllllIllll - class_15212.lIIIlIIIlIlllIllIIIlIIIlI) * (double)f;
        double d2 = class_15212.lIIlIlllIllIlIlllIIIIIIII + (class_15212.llIIlIlIlllIIllIlIlllIllI - class_15212.lIIlIlllIllIlIlllIIIIIIII) * (double)f;
        double d3 = class_15212.IIlIllIIlllllIIlIIllllIIl + (class_15212.IllIIIIllIIllIllIlllIlIIl - class_15212.IIlIllIIlllllIIlIIllllIIl) * (double)f;
        float f2 = class_15212.llllIIIIlIIIlIIIIIIlIllll + (class_15212.IIIIlIllIlIIlIIlIllIlIlll - class_15212.llllIIIIlIIIlIIIIIIlIllll) * f;
        int n = class_15212.lllIIIllIIIIlllIlIIllIIll(f);
        if (class_15212.llIIIIIlIIlIIIIllIIIlIIII()) {
            n = 0xF000F0;
        }
        int n2 = n % 65536;
        int n3 = n / 65536;
        OpenGlHelper.lllIIIllIIIIlllIlIIllIIll(OpenGlHelper.IlIllllllIIlIIllllIIlIIIl, (float)n2 / 1.0f, (float)n3 / 1.0f);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        return this.lllIIIllIIIIlllIlIIllIIll(class_15212, d - lllIlIIlIIIlIlIIIllIlllIl, d2 - IlIllllllIIlIIllllIIlIIIl, d3 - lIlllIlllIIIIlIIlllIllIII, f2, f, bl);
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, double d, double d2, double d3, float f, float f2) {
        return this.lllIIIllIIIIlllIlIIllIIll(class_15212, d, d2, d3, f, f2, false);
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, double d, double d2, double d3, float f, float f2, boolean bl) {
        class_1603 class_16032 = null;
        try {
            class_16032 = this.lllIIIllIIIIlllIlIIllIIll(class_15212);
            if (class_16032 != null && this.IlIIIIIllllllIIlllIllllll != null) {
                if (!class_16032.lllIIIllIIIIlllIlIIllIIll() || bl) {
                    try {
                        class_16032.lllIIIllIIIIlllIlIIllIIll(class_15212, d, d2, d3, f, f2);
                    }
                    catch (Throwable throwable) {
                        throw new class_0892(CrashReport.lllIIIllIIIIlllIlIIllIIll(throwable, "Rendering entity in world"));
                    }
                    try {
                        class_16032.lllIlIIlIIIlIlIIIllIlllIl(class_15212, d, d2, d3, f, f2);
                    }
                    catch (Throwable throwable) {
                        throw new class_0892(CrashReport.lllIIIllIIIIlllIlIIllIIll(throwable, "Post-rendering entity in world"));
                    }
                    if (IlIlIIlIlIllIIlIlIIllIIIl && !class_15212.lIIlIlIIllIIIlIIlIlIIIlII() && !bl) {
                        try {
                            this.lllIlIIlIIIlIlIIIllIlllIl(class_15212, d, d2, d3, f, f2);
                        }
                        catch (Throwable throwable) {
                            throw new class_0892(CrashReport.lllIIIllIIIIlllIlIIllIIll(throwable, "Rendering entity hitbox in world"));
                        }
                    }
                }
            } else if (this.IlIIIIIllllllIIlllIllllll != null) {
                return false;
            }
            return true;
        }
        catch (Throwable throwable) {
            CrashReport class_02232 = CrashReport.lllIIIllIIIIlllIlIIllIIll(throwable, "Rendering entity in world");
            class_0799 class_07992 = class_02232.lllIIIllIIIIlllIlIIllIIll("Entity being rendered");
            class_15212.lllIIIllIIIIlllIlIIllIIll(class_07992);
            throw new class_0892(class_02232);
        }
    }

    private void lllIlIIlIIIlIlIIIllIlllIl(class_1521 class_15212, double d, double d2, double d3, float f, float f2) {
        GL11.glDepthMask((boolean)false);
        GL11.glDisable((int)3553);
        GL11.glDisable((int)2896);
        GL11.glDisable((int)2884);
        GL11.glDisable((int)3042);
        float f3 = class_15212.IIIIlIlIIlIIIIlIlllIlIIII / 2.0f;
        class_1974 class_19742 = class_1974.lllIIIllIIIIlllIlIIllIIll(d - (double)f3, d2, d3 - (double)f3, d + (double)f3, d2 + (double)class_15212.lllIIIIlIlIIlIIlllIIIIIIl, d3 + (double)f3);
        class_1114.lllIIIllIIIIlllIlIIllIIll(class_19742, 0xFFFFFF);
        GL11.glEnable((int)3553);
        GL11.glEnable((int)2896);
        GL11.glEnable((int)2884);
        GL11.glDisable((int)3042);
        GL11.glDepthMask((boolean)true);
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342) {
        this.IIIllIIlIIIIIIlIlIIllIIlI = class_13342;
    }

    public double lllIIIllIIIIlllIlIIllIIll(double d, double d2, double d3) {
        double d4 = d - this.llIIllIllIlIIlIIllIllllll;
        double d5 = d2 - this.lllIIlIIIllllllIIIIlIlIlI;
        double d6 = d3 - this.IlIlllIIIIIIlIIllIIllIlll;
        return d4 * d4 + d5 * d5 + d6 * d6;
    }

    public class_1854 lllIIIllIIIIlllIlIIllIIll() {
        return this.IlIlIIlllIIlIllIIIlllllIl;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
        for (class_1603 class_16032 : this.lllllIlllIIllIlIIlIIIllII.values()) {
            class_16032.lllIIIllIIIIlllIlIIllIIll(class_08872);
        }
    }
}

