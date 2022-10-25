package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.moonsworth.lunar.client.LunarClient;
import net.minecraft.client.Minecraft;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class class_1130 {
    private Minecraft lllIIIllIIIIlllIlIIllIIll = Minecraft.getMinecraft();
    private LunarClient lllIlIIlIIIlIlIIIllIlllIl = LunarClient.getInstance();
    private static final ResourceLocation IlIllllllIIlIIllllIIlIIIl = new ResourceLocation("textures/misc/forcefield.png");
    private final List lIlllIlllIIIIlIIlllIllIII = new ArrayList();

    public class_1130() {
        LunarClient.getInstance().getEventBus().addEvent(class_0312.class, this::lllIIIllIIIIlllIlIIllIIll);
        LunarClient.getInstance().getEventBus().addEvent(class_0281.class, this::lllIIIllIIIIlllIlIIllIIll);
        LunarClient.getInstance().getEventBus().addEvent(class_0540.class, this::lllIIIllIIIIlllIlIIllIIll);
    }

    private void lllIIIllIIIIlllIlIIllIIll(class_0540 class_05402) {
        for (class_1026 class_10262 : this.lIlllIlllIIIIlIIlllIllIII) {
            if (!class_10262.lllIlIIlIIIlIlIIIllIlllIl(class_05402.IlIllllllIIlIIllllIIlIIIl(), class_05402.IlIIIIIllllllIIlllIllllll())) continue;
            class_05402.lllIlIIlIIIlIlIIIllIlllIl().add(new class_1974(class_05402.IlIllllllIIlIIllllIIlIIIl(), class_05402.lIlllIlllIIIIlIIlllIllIII(), class_05402.IlIIIIIllllllIIlllIllllll(), class_05402.IlIllllllIIlIIllllIIlIIIl() + 1.0, class_05402.lIlllIlllIIIIlIIlllIllIII() + 1.0, class_05402.IlIIIIIllllllIIlllIllllll() + 1.0));
        }
    }

    private void lllIIIllIIIIlllIlIIllIIll(class_0312 class_03122) {
        this.lIlllIlllIIIIlIIlllIllIII.forEach(class_1026::IlIllllllIIlIIllllIIlIIIl);
    }

    private void lllIIIllIIIIlllIlIIllIIll(class_0814 class_08142, class_1974 class_19742, Color color, float f) {
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        double d = this.lllIIIllIIIIlllIlIIllIIll.gameSettings.IlIllllllIIlIIllllIIlIIIl * 16;
        if (class_08142.IlIIlllllIIlIlIlllllIllll >= class_19742.lIlllIlllIIIIlIIlllIllIII - d || class_08142.IlIIlllllIIlIlIlllllIllll <= class_19742.lllIIIllIIIIlllIlIIllIIll + d || class_08142.IllIIIIllIIllIllIlllIlIIl >= class_19742.lIllllIIlIIIlIllllllIIIll - d || class_08142.IllIIIIllIIllIllIlllIlIIl <= class_19742.IlIllllllIIlIIllllIIlIIIl + d) {
            float f2;
            double d2;
            double d3;
            float f3;
            double d4 = 1.0 - this.lllIIIllIIIIlllIlIIllIIll(class_19742, class_08142) / d;
            d4 = Math.pow(d4, 4.0);
            double d5 = class_08142.lIIIlIIIlIlllIllIIIlIIIlI + (class_08142.IlIIlllllIIlIlIlllllIllll - class_08142.lIIIlIIIlIlllIllIIIlIIIlI) * (double)f;
            double d6 = class_08142.lIIlIlllIllIlIlllIIIIIIII + (class_08142.llIIlIlIlllIIllIlIlllIllI - class_08142.lIIlIlllIllIlIlllIIIIIIII) * (double)f;
            double d7 = class_08142.IIlIllIIlllllIIlIIllllIIl + (class_08142.IllIIIIllIIllIllIlllIlIIl - class_08142.IIlIllIIlllllIIlIIllllIIl) * (double)f;
            GL11.glEnable((int)3042);
            GL11.glBlendFunc((int)770, (int)1);
            this.lllIIIllIIIIlllIlIIllIIll.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(IlIllllllIIlIIllllIIlIIIl);
            GL11.glDepthMask((boolean)false);
            GL11.glPushMatrix();
            boolean bl = true;
            float f4 = (float)(color.getRed() & 0xFF) / 255.0f;
            float f5 = (float)(color.getGreen() & 0xFF) / 255.0f;
            float f6 = (float)(color.getBlue() & 0xFF) / 255.0f;
            GL11.glPolygonOffset((float)-3.0f, (float)-3.0f);
            GL11.glEnable((int)32823);
            GL11.glAlphaFunc((int)516, (float)0.1f);
            GL11.glEnable((int)3008);
            GL11.glDisable((int)2884);
            float f7 = (float)(Minecraft.llllllIlIllllIlIlIlIIIIlI() % 3000L) / 3000.0f;
            class_08682.lllIlIIlIIIlIlIIIllIlllIl();
            GL11.glTranslated((double)(-d5), (double)(-d6), (double)(-d7));
            class_08682.lllIIIllIIIIlllIlIIllIIll(f4, f5, f6, 1.0f);
            double d8 = Math.max((double) MathHelper.IlIllllllIIlIIllllIIlIIIl(d7 - d), class_19742.IlIllllllIIlIIllllIIlIIIl);
            double d9 = Math.min((double) MathHelper.lIllllIIlIIIlIllllllIIIll(d7 + d), class_19742.lIllllIIlIIIlIllllllIIIll);
            if (d5 > class_19742.lIlllIlllIIIIlIIlllIllIII - d) {
                f3 = 0.0f;
                d3 = d8;
                while (d3 < d9) {
                    d2 = Math.min(1.0, d9 - d3);
                    f2 = (float)d2 * 0.5f;
                    class_08682.lllIIIllIIIIlllIlIIllIIll(class_19742.lIlllIlllIIIIlIIlllIllIII, 256.0, d3, f7 + f3, f7 + 0.0f);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(class_19742.lIlllIlllIIIIlIIlllIllIII, 256.0, d3 + d2, f7 + f2 + f3, f7 + 0.0f);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(class_19742.lIlllIlllIIIIlIIlllIllIII, 0.0, d3 + d2, f7 + f2 + f3, f7 + 128.0f);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(class_19742.lIlllIlllIIIIlIIlllIllIII, 0.0, d3, f7 + f3, f7 + 128.0f);
                    d3 += 1.0;
                    f3 += 0.5f;
                }
            }
            if (d5 < class_19742.lllIIIllIIIIlllIlIIllIIll + d) {
                f3 = 0.0f;
                d3 = d8;
                while (d3 < d9) {
                    d2 = Math.min(1.0, d9 - d3);
                    f2 = (float)d2 * 0.5f;
                    class_08682.lllIIIllIIIIlllIlIIllIIll(class_19742.lllIIIllIIIIlllIlIIllIIll, 256.0, d3, f7 + f3, f7 + 0.0f);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(class_19742.lllIIIllIIIIlllIlIIllIIll, 256.0, d3 + d2, f7 + f2 + f3, f7 + 0.0f);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(class_19742.lllIIIllIIIIlllIlIIllIIll, 0.0, d3 + d2, f7 + f2 + f3, f7 + 128.0f);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(class_19742.lllIIIllIIIIlllIlIIllIIll, 0.0, d3, f7 + f3, f7 + 128.0f);
                    d3 += 1.0;
                    f3 += 0.5f;
                }
            }
            d8 = Math.max((double) MathHelper.IlIllllllIIlIIllllIIlIIIl(d5 - d), class_19742.lllIIIllIIIIlllIlIIllIIll);
            d9 = Math.min((double) MathHelper.lIllllIIlIIIlIllllllIIIll(d5 + d), class_19742.lIlllIlllIIIIlIIlllIllIII);
            if (d7 > class_19742.lIllllIIlIIIlIllllllIIIll - d) {
                f3 = 0.0f;
                d3 = d8;
                while (d3 < d9) {
                    d2 = Math.min(1.0, d9 - d3);
                    f2 = (float)d2 * 0.5f;
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d3, 256.0, class_19742.lIllllIIlIIIlIllllllIIIll, f7 + f3, f7 + 0.0f);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d3 + d2, 256.0, class_19742.lIllllIIlIIIlIllllllIIIll, f7 + f2 + f3, f7 + 0.0f);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d3 + d2, 0.0, class_19742.lIllllIIlIIIlIllllllIIIll, f7 + f2 + f3, f7 + 128.0f);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d3, 0.0, class_19742.lIllllIIlIIIlIllllllIIIll, f7 + f3, f7 + 128.0f);
                    d3 += 1.0;
                    f3 += 0.5f;
                }
            }
            if (d7 < class_19742.IlIllllllIIlIIllllIIlIIIl + d) {
                f3 = 0.0f;
                d3 = d8;
                while (d3 < d9) {
                    d2 = Math.min(1.0, d9 - d3);
                    f2 = (float)d2 * 0.5f;
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d3, 256.0, class_19742.IlIllllllIIlIIllllIIlIIIl, f7 + f3, f7 + 0.0f);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d3 + d2, 256.0, class_19742.IlIllllllIIlIIllllIIlIIIl, f7 + f2 + f3, f7 + 0.0f);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d3 + d2, 0.0, class_19742.IlIllllllIIlIIllllIIlIIIl, f7 + f2 + f3, f7 + 128.0f);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d3, 0.0, class_19742.IlIllllllIIlIIllllIIlIIIl, f7 + f3, f7 + 128.0f);
                    d3 += 1.0;
                    f3 += 0.5f;
                }
            }
            class_08682.lllIIIllIIIIlllIlIIllIIll();
            GL11.glTranslated((double)0.0, (double)0.0, (double)0.0);
            GL11.glEnable((int)2884);
            GL11.glDisable((int)3008);
            GL11.glPolygonOffset((float)0.0f, (float)0.0f);
            GL11.glDisable((int)32823);
            GL11.glEnable((int)3008);
            GL11.glDisable((int)3042);
            GL11.glPopMatrix();
            GL11.glDepthMask((boolean)true);
        }
    }

    double lllIIIllIIIIlllIlIIllIIll(class_1974 class_19742, class_1521 class_15212) {
        return this.lllIIIllIIIIlllIlIIllIIll(class_19742, class_15212.IlIIlllllIIlIlIlllllIllll, class_15212.IllIIIIllIIllIllIlllIlIIl);
    }

    double lllIIIllIIIIlllIlIIllIIll(class_1974 class_19742, double d, double d2) {
        double d3 = d2 - class_19742.IlIllllllIIlIIllllIIlIIIl;
        double d4 = class_19742.lIllllIIlIIIlIllllllIIIll - d2;
        double d5 = d - class_19742.lllIIIllIIIIlllIlIIllIIll;
        double d6 = class_19742.lIlllIlllIIIIlIIlllIllIII - d;
        double d7 = Math.min(d5, d6);
        d7 = Math.min(d7, d3);
        return Math.min(d7, d4);
    }

    private void lllIIIllIIIIlllIlIIllIIll(class_0281 class_02812) {
        if (!this.lIlllIlllIIIIlIIlllIllIII.isEmpty()) {
            class_1389 class_13892 = this.lllIIIllIIIIlllIlIIllIIll.lIIIIlIlIIlllllIIllIIlIII;
            float f = class_02812.lllIIIllIIIIlllIlIIllIIll();
            this.lIlllIlllIIIIlIIlllIllIII.stream().filter(class_1026::lIlllIlllIIIIlIIlllIllIII).forEach(class_10262 -> this.lllIIIllIIIIlllIlIIllIIll(class_13892, class_10262.lllIIIllIIIIlllIlIIllIIll, class_1026.lIlllIlllIIIIlIIlllIllIII(class_10262), f));
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(String string, String string2, int n, double d, double d2, double d3, double d4, boolean bl, boolean bl2) {
        class_1026 class_10262 = null;
        for (class_1026 class_10263 : this.lIlllIlllIIIIlIIlllIllIII) {
            if (!class_1026.lllIIIllIIIIlllIlIIllIIll(class_10263).equals(string2)) continue;
            class_10262 = class_10263;
        }
        if (class_10262 != null) {
            class_1026.lllIIIllIIIIlllIlIIllIIll(class_10262, class_1026.lllIlIIlIIIlIlIIIllIlllIl(class_10262, new class_1515(d, d2)));
            class_1026.IlIllllllIIlIIllllIIlIIIl(class_10262, class_1026.lIlllIlllIIIIlIIlllIllIII(class_10262, new class_1515(d3, d4)));
            class_1026.lllIIIllIIIIlllIlIIllIIll(class_10262, 0);
            class_1026.lllIlIIlIIIlIlIIIllIlllIl(class_10262, 0);
            class_10262.lllIIIllIIIIlllIlIIllIIll();
        } else {
            class_1026 class_10264 = new class_1026(this, string, string2, n, d, d2, d3, d4, bl, bl2);
            this.lIlllIlllIIIIlIIlllIllIII.add(class_10264);
            class_10264.lllIIIllIIIIlllIlIIllIIll();
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(String string, double d, double d2, double d3, double d4, int n) {
        this.lIlllIlllIIIIlIIlllIllIII.stream().filter(class_10262 -> Objects.equals(class_1026.lllIlIIlIIIlIlIIIllIlllIl(class_10262), string) && class_1026.IlIllllllIIlIIllllIIlIIIl(class_10262)).findFirst().ifPresent(class_10262 -> {
            class_1026.lllIIIllIIIIlllIlIIllIIll(class_10262, new class_1515(d, d2));
            class_1026.IlIllllllIIlIIllllIIlIIIl(class_10262, new class_1515(d3, d4));
            class_1026.lllIIIllIIIIlllIlIIllIIll(class_10262, 0);
            class_1026.lllIlIIlIIIlIlIIIllIlllIl(class_10262, n);
            class_10262.lllIIIllIIIIlllIlIIllIIll();
        });
    }

    public void lllIIIllIIIIlllIlIIllIIll(String string) {
        this.lIlllIlllIIIIlIIlllIllIII.removeIf(class_10262 -> Objects.equals(class_1026.lllIlIIlIIIlIlIIIllIlllIl(class_10262), string));
    }

    public void lllIIIllIIIIlllIlIIllIIll() {
        this.lIlllIlllIIIIlIIlllIllIII.clear();
    }

    public List lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    static /* synthetic */ Minecraft lllIIIllIIIIlllIlIIllIIll(class_1130 class_11302) {
        return class_11302.lllIIIllIIIIlllIlIIllIIll;
    }

    static /* synthetic */ LunarClient lllIlIIlIIIlIlIIIllIlllIl(class_1130 class_11302) {
        return class_11302.lllIlIIlIIIlIlIIIllIlllIl;
    }
}

