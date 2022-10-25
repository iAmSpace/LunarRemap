package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.crash.CrashReport;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class class_1462 {
    private static final ResourceLocation lllIlIIlIIIlIlIIIllIlllIl = new ResourceLocation("textures/particle/particles.png");
    protected class_1334 lllIIIllIIIIlllIlIIllIIll;
    private List[] IlIllllllIIlIIllllIIlIIIl = new List[4];
    private class_1682 lIlllIlllIIIIlIIlllIllIII;
    private Random IlIIIIIllllllIIlllIllllll = new Random();

    public class_1462(class_1334 class_13342, class_1682 class_16822) {
        if (class_13342 != null) {
            this.lllIIIllIIIIlllIlIIllIIll = class_13342;
        }
        this.lIlllIlllIIIIlIIlllIllIII = class_16822;
        for (int i = 0; i < 4; ++i) {
            this.IlIllllllIIlIIllllIIlIIIl[i] = new ArrayList();
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0323 class_03232) {
        int n = class_03232.IlIllllllIIlIIllllIIlIIIl();
        if (this.IlIllllllIIlIIllllIIlIIIl[n].size() >= 4000) {
            this.IlIllllllIIlIIllllIIlIIIl[n].remove(0);
        }
        this.IlIllllllIIlIIllllIIlIIIl[n].add(class_03232);
    }

    public void lllIIIllIIIIlllIlIIllIIll() {
        for (int i = 0; i < 4; ++i) {
            int n = i;
            for (int j = 0; j < this.IlIllllllIIlIIllllIIlIIIl[n].size(); ++j) {
                class_0323 class_03232 = (class_0323)this.IlIllllllIIlIIllllIIlIIIl[n].get(j);
                try {
                    class_03232.s_();
                }
                catch (Throwable throwable) {
                    CrashReport class_02232 = CrashReport.lllIIIllIIIIlllIlIIllIIll(throwable, "Ticking Particle");
                    class_0799 class_07992 = class_02232.lllIIIllIIIIlllIlIIllIIll("Particle being ticked");
                    class_07992.addCrashSectionCallable("Particle", new class_0213(this, class_03232));
                    class_07992.addCrashSectionCallable("Particle Type", new class_1581(this, n));
                    throw new class_0892(class_02232);
                }
                if (!class_03232.IllllIIIIlIIlIIIIlllIIIIl) continue;
                this.IlIllllllIIlIIllllIIlIIIl[n].remove(j--);
            }
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, float f) {
        float f2 = class_1490.lIlllIlllIIIIlIIlllIllIII;
        float f3 = class_1490.lIllllIIlIIIlIllllllIIIll;
        float f4 = class_1490.IIIllIIlIIIIIIlIlIIllIIlI;
        float f5 = class_1490.IllIIlllllllIIlIIlIIIIlIl;
        float f6 = class_1490.IlIIIIIllllllIIlllIllllll;
        class_0323.IlIlllIIIIIIlIIllIIllIlll = class_15212.lIIIlIIIlIlllIllIIIlIIIlI + (class_15212.IlIIlllllIIlIlIlllllIllll - class_15212.lIIIlIIIlIlllIllIIIlIIIlI) * (double)f;
        class_0323.IlIlIIlIlIllIIlIlIIllIIIl = class_15212.lIIlIlllIllIlIlllIIIIIIII + (class_15212.llIIlIlIlllIIllIlIlllIllI - class_15212.lIIlIlllIllIlIlllIIIIIIII) * (double)f;
        class_0323.lllllIlllIIllIlIIlIIIllII = class_15212.IIlIllIIlllllIIlIIllllIIl + (class_15212.IllIIIIllIIllIllIlllIlIIl - class_15212.IIlIllIIlllllIIlIIllllIIl) * (double)f;
        for (int i = 0; i < 3; ++i) {
            int n = i;
            if (this.IlIllllllIIlIIllllIIlIIIl[n].isEmpty()) continue;
            switch (n) {
                default: {
                    this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(lllIlIIlIIIlIlIIIllIlllIl);
                    break;
                }
                case 1: {
                    this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(class_1511.lllIIIllIIIIlllIlIIllIIll);
                    break;
                }
                case 2: {
                    this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(class_1511.lllIlIIlIIIlIlIIIllIlllIl);
                }
            }
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glDepthMask((boolean)false);
            GL11.glEnable((int)3042);
            GL11.glBlendFunc((int)770, (int)771);
            GL11.glAlphaFunc((int)516, (float)0.003921569f);
            class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
            class_08682.lllIlIIlIIIlIlIIIllIlllIl();
            for (int j = 0; j < this.IlIllllllIIlIIllllIIlIIIl[n].size(); ++j) {
                class_0323 class_03232 = (class_0323)this.IlIllllllIIlIIllllIIlIIIl[n].get(j);
                class_08682.lllIlIIlIIIlIlIIIllIlllIl(class_03232.lllIIIllIIIIlllIlIIllIIll(f));
                try {
                    class_03232.lllIIIllIIIIlllIlIIllIIll(class_08682, f, f2, f6, f3, f4, f5);
                    continue;
                }
                catch (Throwable throwable) {
                    CrashReport class_02232 = CrashReport.lllIIIllIIIIlllIlIIllIIll(throwable, "Rendering Particle");
                    class_0799 class_07992 = class_02232.lllIIIllIIIIlllIlIIllIIll("Particle being rendered");
                    class_07992.addCrashSectionCallable("Particle", new class_2199(this, class_03232));
                    class_07992.addCrashSectionCallable("Particle Type", new class_0011(this, n));
                    throw new class_0892(class_02232);
                }
            }
            class_08682.lllIIIllIIIIlllIlIIllIIll();
            GL11.glDisable((int)3042);
            GL11.glDepthMask((boolean)true);
            GL11.glAlphaFunc((int)516, (float)0.1f);
        }
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(class_1521 class_15212, float f) {
        float f2 = (float)Math.PI / 180;
        float f3 = MathHelper.lllIlIIlIIIlIlIIIllIlllIl(class_15212.IIIIlIllIlIIlIIlIllIlIlll * ((float)Math.PI / 180));
        float f4 = MathHelper.lllIIIllIIIIlllIlIIllIIll(class_15212.IIIIlIllIlIIlIIlIllIlIlll * ((float)Math.PI / 180));
        float f5 = -f4 * MathHelper.lllIIIllIIIIlllIlIIllIIll(class_15212.IlIlIIlllIllllllllIIIlIlI * ((float)Math.PI / 180));
        float f6 = f3 * MathHelper.lllIIIllIIIIlllIlIIllIIll(class_15212.IlIlIIlllIllllllllIIIlIlI * ((float)Math.PI / 180));
        float f7 = MathHelper.lllIlIIlIIIlIlIIIllIlllIl(class_15212.IlIlIIlllIllllllllIIIlIlI * ((float)Math.PI / 180));
        int n = 3;
        List list = this.IlIllllllIIlIIllllIIlIIIl[n];
        if (!list.isEmpty()) {
            class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
            for (int i = 0; i < list.size(); ++i) {
                class_0323 class_03232 = (class_0323)list.get(i);
                class_08682.lllIlIIlIIIlIlIIIllIlllIl(class_03232.lllIIIllIIIIlllIlIIllIIll(f));
                class_03232.lllIIIllIIIIlllIlIIllIIll(class_08682, f, f3, f7, f4, f5, f6);
            }
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342) {
        this.lllIIIllIIIIlllIlIIllIIll = class_13342;
        for (int i = 0; i < 4; ++i) {
            this.IlIllllllIIlIIllllIIlIIIl[i].clear();
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, Block class_05492, int n4) {
        if (class_05492.lIllllIIlIIIlIllllllIIIll() != class_1855.lllIIIllIIIIlllIlIIllIIll) {
            int n5 = 4;
            for (int i = 0; i < n5; ++i) {
                for (int j = 0; j < n5; ++j) {
                    for (int k = 0; k < n5; ++k) {
                        double d = (double)n + ((double)i + 0.5) / (double)n5;
                        double d2 = (double)n2 + ((double)j + 0.5) / (double)n5;
                        double d3 = (double)n3 + ((double)k + 0.5) / (double)n5;
                        this.lllIIIllIIIIlllIlIIllIIll(new class_1331(this.lllIIIllIIIIlllIlIIllIIll, d, d2, d3, d - (double)n - 0.5, d2 - (double)n2 - 0.5, d3 - (double)n3 - 0.5, class_05492, n4).lllIIIllIIIIlllIlIIllIIll(n, n2, n3));
                    }
                }
            }
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4) {
        Block class_05492 = this.lllIIIllIIIIlllIlIIllIIll.a_(n, n2, n3);
        if (class_05492.lIllllIIlIIIlIllllllIIIll() != class_1855.lllIIIllIIIIlllIlIIllIIll) {
            float f = 0.1f;
            double d = (double)n + this.IlIIIIIllllllIIlllIllllll.nextDouble() * (class_05492.lIIlIIIIIlIlllIlIIlIlIlll() - class_05492.IlIlIIlllIIlIllIIIlllllIl() - (double)(f * 2.0f)) + (double)f + class_05492.IlIlIIlllIIlIllIIIlllllIl();
            double d2 = (double)n2 + this.IlIIIIIllllllIIlllIllllll.nextDouble() * (class_05492.IlIIIlIIIIllIIIllIIIIIIll() - class_05492.lIlIlIIlIIIIlIIIIIlllIIII() - (double)(f * 2.0f)) + (double)f + class_05492.lIlIlIIlIIIIlIIIIIlllIIII();
            double d3 = (double)n3 + this.IlIIIIIllllllIIlllIllllll.nextDouble() * (class_05492.lIlIllIIlIIlIIlIIlIIlIIll() - class_05492.IIlllIlIlllIllIIIlllIIlIl() - (double)(f * 2.0f)) + (double)f + class_05492.IIlllIlIlllIllIIIlllIIlIl();
            if (n4 == 0) {
                d2 = (double)n2 + class_05492.lIlIlIIlIIIIlIIIIIlllIIII() - (double)f;
            }
            if (n4 == 1) {
                d2 = (double)n2 + class_05492.IlIIIlIIIIllIIIllIIIIIIll() + (double)f;
            }
            if (n4 == 2) {
                d3 = (double)n3 + class_05492.IIlllIlIlllIllIIIlllIIlIl() - (double)f;
            }
            if (n4 == 3) {
                d3 = (double)n3 + class_05492.lIlIllIIlIIlIIlIIlIIlIIll() + (double)f;
            }
            if (n4 == 4) {
                d = (double)n + class_05492.IlIlIIlllIIlIllIIIlllllIl() - (double)f;
            }
            if (n4 == 5) {
                d = (double)n + class_05492.lIIlIIIIIlIlllIlIIlIlIlll() + (double)f;
            }
            this.lllIIIllIIIIlllIlIIllIIll(new class_1331(this.lllIIIllIIIIlllIlIIllIIll, d, d2, d3, 0.0, 0.0, 0.0, class_05492, this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl(n, n2, n3)).lllIIIllIIIIlllIlIIllIIll(n, n2, n3).IlIllllllIIlIIllllIIlIIIl(0.2f).lIlllIlllIIIIlIIlllIllIII(0.6f));
        }
    }

    public String lllIlIIlIIIlIlIIIllIlllIl() {
        return "" + (this.IlIllllllIIlIIllllIIlIIIl[0].size() + this.IlIllllllIIlIIllllIIlIIIl[1].size() + this.IlIllllllIIlIIllllIIlIIIl[2].size());
    }
}

