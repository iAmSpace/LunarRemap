package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.GL11
 */
import java.util.Random;

import net.minecraft.client.Minecraft;
import net.minecraft.init.Blocks;
import net.minecraft.stats.Achievement;
import net.minecraft.stats.AchievementList;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ChatComponentTranslation;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public class class_0699
extends class_0229
implements class_1216 {
    private static final int llIIlIlIlllIIllIlIlllIllI = AchievementList.minDisplayColumn * 24 - 112;
    private static final int IllIIIIllIIllIllIlllIlIIl = AchievementList.minDisplayRow * 24 - 112;
    private static final int IIIIIIIIlIllIIllIIlllIllI = AchievementList.maxDisplayColumn * 24 - 77;
    private static final int IIlIIlIlIlIllIIlIlIIIIlll = AchievementList.maxDisplayRow * 24 - 77;
    private static final ResourceLocation llIIIlllIlllIlIllIIIIllIl = new ResourceLocation("textures/gui/achievement/achievement_background.png");
    protected class_0229 lllIlIIlIIIlIlIIIllIlllIl;
    protected int IlIllllllIIlIIllllIIlIIIl = 256;
    protected int lIlllIlllIIIIlIIlllIllIII = 202;
    protected int IlIIIIIllllllIIlllIllllll;
    protected int lIllllIIlIIIlIllllllIIIll;
    protected float IIIllIIlIIIIIIlIlIIllIIlI = 1.0f;
    protected double IllIIlllllllIIlIIlIIIIlIl;
    protected double IIIllIllIIlIlIlIlIllllIIl;
    protected double IllIIIllIIIIlIlIlIllIIlll;
    protected double lIIIIlIlIIlllllIIllIIlIII;
    protected double lIlllIlllIlIIIIlllIlIlIIl;
    protected double IlIIlllllIIlIlIlllllIllll;
    private int IIIIlIllIlIIlIIlIllIlIlll;
    private class_1707 IlIlIIlllIllllllllIIIlIlI;
    private boolean llllIIIIlIIIlIIIIIIlIllll = true;

    public class_0699(class_0229 class_02292, class_1707 class_17072) {
        this.lllIlIIlIIIlIlIIIllIlllIl = class_02292;
        this.IlIlIIlllIllllllllIIIlIlI = class_17072;
        int n = 141;
        int n2 = 141;
        this.IllIIIllIIIIlIlIlIllIIlll = this.lIlllIlllIlIIIIlllIlIlIIl = (double)(AchievementList.openInventory.displayColumn * 24 - n / 2 - 12);
        this.IllIIlllllllIIlIIlIIIIlIl = this.lIlllIlllIlIIIIlllIlIlIIl;
        this.lIIIIlIlIIlllllIIllIIlIII = this.IlIIlllllIIlIlIlllllIllll = (double)(AchievementList.openInventory.displayRow * 24 - n2 / 2);
        this.IIIllIllIIlIlIlIlIllllIIl = this.IlIIlllllIIlIlIlllllIllll;
    }

    @Override
    public void n_() {
        this.lllllIlllIIllIlIIlIIIllII.llIIlIllIllllIlIIIIlIIlll().lllIIIllIIIIlllIlIIllIIll(new class_0499(class_1297.lllIlIIlIIIlIlIIIllIlllIl));
        this.lIlIlIIlIIIIlIIIIIlllIIII.clear();
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1249(1, this.IlIlIIlllIIlIllIIIlllllIl / 2 + 24, this.lIIlIIIIIlIlllIlIIlIlIlll / 2 + 74, 80, 20, class_0616.lllIIIllIIIIlllIlIIllIIll("gui.done", new Object[0])));
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1197 class_11972) {
        if (!this.llllIIIIlIIIlIIIIIIlIllll && class_11972.IIIllIllIIlIlIlIlIllllIIl == 1) {
            this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl);
        }
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(char c, int n) {
        if (n == this.lllllIlllIIllIlIIlIIIllII.gameSettings.IIllllIIlIlIlIlllIIIllIIl.IIIllIllIIlIlIlIlIllllIIl()) {
            this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll((class_0229)null);
            this.lllllIlllIIllIlIIlIIIllII.lllIIlIIIllllllIIIIlIlIlI();
        } else {
            super.lllIIIllIIIIlllIlIIllIIll(c, n);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
        if (this.llllIIIIlIIIlIIIIIIlIllll) {
            this.llIIlIllIllllIlIIIIlIIlll();
            this.lllIIIllIIIIlllIlIIllIIll(this.lIlIllIIlIIlIIlIIlIIlIIll, class_0616.lllIIIllIIIIlllIlIIllIIll("multiplayer.downloadingStats", new Object[0]), this.IlIlIIlllIIlIllIIIlllllIl / 2, this.lIIlIIIIIlIlllIlIIlIlIlll / 2, 0xFFFFFF);
            this.lllIIIllIIIIlllIlIIllIIll(this.lIlIllIIlIIlIIlIIlIIlIIll, lllIIIllIIIIlllIlIIllIIll[(int)(Minecraft.llllllIlIllllIlIlIlIIIIlI() / 150L % (long)lllIIIllIIIIlllIlIIllIIll.length)], this.IlIlIIlllIIlIllIIIlllllIl / 2, this.lIIlIIIIIlIlllIlIIlIlIlll / 2 + this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll * 2, 0xFFFFFF);
        } else {
            int n3;
            if (Mouse.isButtonDown((int)0)) {
                n3 = (this.IlIlIIlllIIlIllIIIlllllIl - this.IlIllllllIIlIIllllIIlIIIl) / 2;
                int n4 = (this.lIIlIIIIIlIlllIlIIlIlIlll - this.lIlllIlllIIIIlIIlllIllIII) / 2;
                int n5 = n3 + 8;
                int n6 = n4 + 17;
                if ((this.IIIIlIllIlIIlIIlIllIlIlll == 0 || this.IIIIlIllIlIIlIIlIllIlIlll == 1) && n >= n5 && n < n5 + 224 && n2 >= n6 && n2 < n6 + 155) {
                    if (this.IIIIlIllIlIIlIIlIllIlIlll == 0) {
                        this.IIIIlIllIlIIlIIlIllIlIlll = 1;
                    } else {
                        this.IllIIIllIIIIlIlIlIllIIlll -= (double)((float)(n - this.IlIIIIIllllllIIlllIllllll) * this.IIIllIIlIIIIIIlIlIIllIIlI);
                        this.lIIIIlIlIIlllllIIllIIlIII -= (double)((float)(n2 - this.lIllllIIlIIIlIllllllIIIll) * this.IIIllIIlIIIIIIlIlIIllIIlI);
                        this.lIlllIlllIlIIIIlllIlIlIIl = this.IllIIlllllllIIlIIlIIIIlIl = this.IllIIIllIIIIlIlIlIllIIlll;
                        this.IlIIlllllIIlIlIlllllIllll = this.IIIllIllIIlIlIlIlIllllIIl = this.lIIIIlIlIIlllllIIllIIlIII;
                    }
                    this.IlIIIIIllllllIIlllIllllll = n;
                    this.lIllllIIlIIIlIllllllIIIll = n2;
                }
            } else {
                this.IIIIlIllIlIIlIIlIllIlIlll = 0;
            }
            n3 = Mouse.getDWheel();
            float f2 = this.IIIllIIlIIIIIIlIlIIllIIlI;
            if (n3 < 0) {
                this.IIIllIIlIIIIIIlIlIIllIIlI += 0.25f;
            } else if (n3 > 0) {
                this.IIIllIIlIIIIIIlIlIIllIIlI -= 0.25f;
            }
            this.IIIllIIlIIIIIIlIlIIllIIlI = MathHelper.clamp_float(this.IIIllIIlIIIIIIlIlIIllIIlI, 1.0f, 2.0f);
            if (this.IIIllIIlIIIIIIlIlIIllIIlI != f2) {
                float f3 = f2 - this.IIIllIIlIIIIIIlIlIIllIIlI;
                float f4 = f2 * (float)this.IlIllllllIIlIIllllIIlIIIl;
                float f5 = f2 * (float)this.lIlllIlllIIIIlIIlllIllIII;
                float f6 = this.IIIllIIlIIIIIIlIlIIllIIlI * (float)this.IlIllllllIIlIIllllIIlIIIl;
                float f7 = this.IIIllIIlIIIIIIlIlIIllIIlI * (float)this.lIlllIlllIIIIlIIlllIllIII;
                this.IllIIIllIIIIlIlIlIllIIlll -= (double)((f6 - f4) * 0.5f);
                this.lIIIIlIlIIlllllIIllIIlIII -= (double)((f7 - f5) * 0.5f);
                this.lIlllIlllIlIIIIlllIlIlIIl = this.IllIIlllllllIIlIIlIIIIlIl = this.IllIIIllIIIIlIlIlIllIIlll;
                this.IlIIlllllIIlIlIlllllIllll = this.IIIllIllIIlIlIlIlIllllIIl = this.lIIIIlIlIIlllllIIllIIlIII;
            }
            if (this.lIlllIlllIlIIIIlllIlIlIIl < (double)llIIlIlIlllIIllIlIlllIllI) {
                this.lIlllIlllIlIIIIlllIlIlIIl = llIIlIlIlllIIllIlIlllIllI;
            }
            if (this.IlIIlllllIIlIlIlllllIllll < (double)IllIIIIllIIllIllIlllIlIIl) {
                this.IlIIlllllIIlIlIlllllIllll = IllIIIIllIIllIllIlllIlIIl;
            }
            if (this.lIlllIlllIlIIIIlllIlIlIIl >= (double)IIIIIIIIlIllIIllIIlllIllI) {
                this.lIlllIlllIlIIIIlllIlIlIIl = IIIIIIIIlIllIIllIIlllIllI - 1;
            }
            if (this.IlIIlllllIIlIlIlllllIllll >= (double)IIlIIlIlIlIllIIlIlIIIIlll) {
                this.IlIIlllllIIlIlIlllllIllll = IIlIIlIlIlIllIIlIlIIIIlll - 1;
            }
            this.llIIlIllIllllIlIIIIlIIlll();
            this.lllIlIIlIIIlIlIIIllIlllIl(n, n2, f);
            GL11.glDisable((int)2896);
            GL11.glDisable((int)2929);
            this.lIllllIIlIIIlIllllllIIIll();
            GL11.glEnable((int)2896);
            GL11.glEnable((int)2929);
        }
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl() {
        if (this.llllIIIIlIIIlIIIIIIlIllll) {
            this.llllIIIIlIIIlIIIIIIlIllll = false;
        }
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
        if (!this.llllIIIIlIIIlIIIIIIlIllll) {
            this.IllIIlllllllIIlIIlIIIIlIl = this.IllIIIllIIIIlIlIlIllIIlll;
            this.IIIllIllIIlIlIlIlIllllIIl = this.lIIIIlIlIIlllllIIllIIlIII;
            double d = this.lIlllIlllIlIIIIlllIlIlIIl - this.IllIIIllIIIIlIlIlIllIIlll;
            double d2 = this.IlIIlllllIIlIlIlllllIllll - this.lIIIIlIlIIlllllIIllIIlIII;
            if (d * d + d2 * d2 < 4.0) {
                this.IllIIIllIIIIlIlIlIllIIlll += d;
                this.lIIIIlIlIIlllllIIllIIlIII += d2;
            } else {
                this.IllIIIllIIIIlIlIlIllIIlll += d * 0.85;
                this.lIIIIlIlIIlllllIIllIIlIII += d2 * 0.85;
            }
        }
    }

    protected void lIllllIIlIIIlIllllllIIIll() {
        int n = (this.IlIlIIlllIIlIllIIIlllllIl - this.IlIllllllIIlIIllllIIlIIIl) / 2;
        int n2 = (this.lIIlIIIIIlIlllIlIIlIlIlll - this.lIlllIlllIIIIlIIlllIllIII) / 2;
        this.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl(class_0616.lllIIIllIIIIlllIlIIllIIll("gui.achievements", new Object[0]), n + 15, n2 + 5, 0x404040);
    }

    protected void lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, float f) {
        int n3;
        int n4;
        Object object;
        int n5;
        Object object2;
        int n6;
        int n7;
        int n8 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IllIIlllllllIIlIIlIIIIlIl + (this.IllIIIllIIIIlIlIlIllIIlll - this.IllIIlllllllIIlIIlIIIIlIl) * (double)f);
        int n9 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IIIllIllIIlIlIlIlIllllIIl + (this.lIIIIlIlIIlllllIIllIIlIII - this.IIIllIllIIlIlIlIlIllllIIl) * (double)f);
        if (n8 < llIIlIlIlllIIllIlIlllIllI) {
            n8 = llIIlIlIlllIIllIlIlllIllI;
        }
        if (n9 < IllIIIIllIIllIllIlllIlIIl) {
            n9 = IllIIIIllIIllIllIlllIlIIl;
        }
        if (n8 >= IIIIIIIIlIllIIllIIlllIllI) {
            n8 = IIIIIIIIlIllIIllIIlllIllI - 1;
        }
        if (n9 >= IIlIIlIlIlIllIIlIlIIIIlll) {
            n9 = IIlIIlIlIlIllIIlIlIIIIlll - 1;
        }
        int n10 = (this.IlIlIIlllIIlIllIIIlllllIl - this.IlIllllllIIlIIllllIIlIIIl) / 2;
        int n11 = (this.lIIlIIIIIlIlllIlIIlIlIlll - this.lIlllIlllIIIIlIIlllIllIII) / 2;
        int n12 = n10 + 16;
        int n13 = n11 + 17;
        IlIlllIIIIIIlIIllIIllIlll = 0.0f;
        GL11.glDepthFunc((int)518);
        GL11.glPushMatrix();
        GL11.glTranslatef((float)n12, (float)n13, (float)-200.0f);
        GL11.glScalef((float)(1.0f / this.IIIllIIlIIIIIIlIlIIllIIlI), (float)(1.0f / this.IIIllIIlIIIIIIlIlIIllIIlI), (float)0.0f);
        GL11.glEnable((int)3553);
        GL11.glDisable((int)2896);
        GL11.glEnable((int)32826);
        GL11.glEnable((int)2903);
        int n14 = n8 + 288 >> 4;
        int n15 = n9 + 288 >> 4;
        int n16 = (n8 + 288) % 16;
        int n17 = (n9 + 288) % 16;
        boolean bl = true;
        boolean bl2 = true;
        boolean bl3 = true;
        boolean bl4 = true;
        boolean bl5 = true;
        Random random = new Random();
        float f2 = 16.0f / this.IIIllIIlIIIIIIlIlIIllIIlI;
        float f3 = 16.0f / this.IIIllIIlIIIIIIlIlIIllIIlI;
        int n18 = 0;
        while ((float)n18 * f2 - (float)n17 < 155.0f) {
            float f4 = 0.6f - (float)(n15 + n18) / 25.0f * 0.3f;
            GL11.glColor4f((float)f4, (float)f4, (float)f4, (float)1.0f);
            n7 = 0;
            while ((float)n7 * f3 - (float)n16 < 224.0f) {
                random.setSeed(this.lllllIlllIIllIlIIlIIIllII.getSession().getPlayerID().hashCode() + n14 + n7 + (n15 + n18) * 16);
                n6 = random.nextInt(1 + n15 + n18) + (n15 + n18) / 2;
                class_2102 class_21022 = Blocks.llIIllIllIlIIlIIllIllllll.lllIIIllIIIIlllIlIIllIIll(0, 0);
                if (n6 <= 37 && n15 + n18 != 35) {
                    if (n6 == 22) {
                        class_21022 = random.nextInt(2) == 0 ? Blocks.diamond_ore.lllIIIllIIIIlllIlIIllIIll(0, 0) : Blocks.lIIIlIIllIllIIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(0, 0);
                    } else if (n6 == 10) {
                        class_21022 = Blocks.IlIlIIlIlIllIIlIlIIllIIIl.lllIIIllIIIIlllIlIIllIIll(0, 0);
                    } else if (n6 == 8) {
                        class_21022 = Blocks.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(0, 0);
                    } else if (n6 > 4) {
                        class_21022 = Blocks.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(0, 0);
                    } else if (n6 > 0) {
                        class_21022 = Blocks.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(0, 0);
                    }
                } else {
                    class_21022 = Blocks.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(0, 0);
                }
                this.lllllIlllIIllIlIIlIIIllII.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(class_1511.lllIIIllIIIIlllIlIIllIIll);
                this.lllIIIllIIIIlllIlIIllIIll(n7 * 16 - n16, n18 * 16 - n17, class_21022, 16, 16);
                ++n7;
            }
            ++n18;
        }
        GL11.glEnable((int)2929);
        GL11.glDepthFunc((int)515);
        this.lllllIlllIIllIlIIlIIIllII.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(llIIIlllIlllIlIllIIIIllIl);
        for (n18 = 0; n18 < AchievementList.achievementList.size(); ++n18) {
            object2 = (Achievement) AchievementList.achievementList.get(n18);
            if (((Achievement)object2).parentAchievement == null) continue;
            n7 = ((Achievement)object2).displayColumn * 24 - n8 + 11;
            n6 = ((Achievement)object2).displayRow * 24 - n9 + 11;
            n5 = object2.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll * 24 - n8 + 11;
            int n19 = object2.IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl * 24 - n9 + 11;
            boolean bl6 = this.IlIlIIlllIllllllllIIIlIlI.lllIIIllIIIIlllIlIIllIIll((Achievement)object2);
            boolean bl7 = this.IlIlIIlllIllllllllIIIlIlI.lllIlIIlIIIlIlIIIllIlllIl((Achievement)object2);
            int n20 = this.IlIlIIlllIllllllllIIIlIlI.IlIllllllIIlIIllllIIlIIIl((Achievement)object2);
            if (n20 > 4) continue;
            int n21 = -16777216;
            if (bl6) {
                n21 = -6250336;
            } else if (bl7) {
                n21 = -16711936;
            }
            this.lllIIIllIIIIlllIlIIllIIll(n7, n5, n6, n21);
            this.lllIlIIlIIIlIlIIIllIlllIl(n5, n6, n19, n21);
            if (n7 > n5) {
                class_0699.lllIIIllIIIIlllIlIIllIIll(n7 - 11 - 7, n6 - 5, 114, 234, 7, 11);
                continue;
            }
            if (n7 < n5) {
                class_0699.lllIIIllIIIIlllIlIIllIIll(n7 + 11, n6 - 5, 107, 234, 7, 11);
                continue;
            }
            if (n6 > n19) {
                class_0699.lllIIIllIIIIlllIlIIllIIll(n7 - 5, n6 - 11 - 7, 96, 234, 11, 7);
                continue;
            }
            if (n6 >= n19) continue;
            class_0699.lllIIIllIIIIlllIlIIllIIll(n7 - 5, n6 + 11, 96, 241, 11, 7);
        }
        object2 = null;
        class_1785 class_17852 = new class_1785();
        float f5 = (float)(n - n12) * this.IIIllIIlIIIIIIlIlIIllIIlI;
        float f6 = (float)(n2 - n13) * this.IIIllIIlIIIIIIlIlIIllIIlI;
        class_0624.IlIllllllIIlIIllllIIlIIIl();
        GL11.glDisable((int)2896);
        GL11.glEnable((int)32826);
        GL11.glEnable((int)2903);
        for (n5 = 0; n5 < AchievementList.achievementList.size(); ++n5) {
            float f7;
            object = (Achievement) AchievementList.achievementList.get(n5);
            n4 = ((Achievement)object).displayColumn * 24 - n8;
            n3 = ((Achievement)object).displayRow * 24 - n9;
            if (n4 < -24 || n3 < -24 || !((float)n4 <= 224.0f * this.IIIllIIlIIIIIIlIlIIllIIlI) || !((float)n3 <= 155.0f * this.IIIllIIlIIIIIIlIlIIllIIlI)) continue;
            int n22 = this.IlIlIIlllIllllllllIIIlIlI.IlIllllllIIlIIllllIIlIIIl((Achievement)object);
            if (this.IlIlIIlllIllllllllIIIlIlI.lllIIIllIIIIlllIlIIllIIll((Achievement)object)) {
                f7 = 0.75f;
                GL11.glColor4f((float)f7, (float)f7, (float)f7, (float)1.0f);
            } else if (this.IlIlIIlllIllllllllIIIlIlI.lllIlIIlIIIlIlIIIllIlllIl((Achievement)object)) {
                f7 = 1.0f;
                GL11.glColor4f((float)f7, (float)f7, (float)f7, (float)1.0f);
            } else if (n22 < 3) {
                f7 = 0.3f;
                GL11.glColor4f((float)f7, (float)f7, (float)f7, (float)1.0f);
            } else if (n22 == 3) {
                f7 = 0.2f;
                GL11.glColor4f((float)f7, (float)f7, (float)f7, (float)1.0f);
            } else {
                if (n22 != 4) continue;
                f7 = 0.1f;
                GL11.glColor4f((float)f7, (float)f7, (float)f7, (float)1.0f);
            }
            this.lllllIlllIIllIlIIlIIIllII.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(llIIIlllIlllIlIllIIIIllIl);
            if (((Achievement)object).IIIllIIlIIIIIIlIlIIllIIlI()) {
                class_0699.lllIIIllIIIIlllIlIIllIIll(n4 - 2, n3 - 2, 26, 202, 26, 26);
            } else {
                class_0699.lllIIIllIIIIlllIlIIllIIll(n4 - 2, n3 - 2, 0, 202, 26, 26);
            }
            if (!this.IlIlIIlllIllllllllIIIlIlI.lllIlIIlIIIlIlIIIllIlllIl((Achievement)object)) {
                f7 = 0.1f;
                GL11.glColor4f((float)f7, (float)f7, (float)f7, (float)1.0f);
                class_17852.lllIIIllIIIIlllIlIIllIIll = false;
            }
            GL11.glEnable((int)2896);
            GL11.glEnable((int)2884);
            class_17852.lllIlIIlIIIlIlIIIllIlllIl(this.lllllIlllIIllIlIIlIIIllII.IlIlllIIIIIIlIIllIIllIlll, this.lllllIlllIIllIlIIlIIIllII.llIIlIIllIIllIlIIllIIllII(), ((Achievement)object).theItemStack, n4 + 3, n3 + 3);
            GL11.glBlendFunc((int)770, (int)771);
            GL11.glDisable((int)2896);
            if (!this.IlIlIIlllIllllllllIIIlIlI.lllIlIIlIIIlIlIIIllIlllIl((Achievement)object)) {
                class_17852.lllIIIllIIIIlllIlIIllIIll = true;
            }
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            if (!(f5 >= (float)n4) || !(f5 <= (float)(n4 + 22)) || !(f6 >= (float)n3) || !(f6 <= (float)(n3 + 22))) continue;
            object2 = object;
        }
        GL11.glDisable((int)2929);
        GL11.glEnable((int)3042);
        GL11.glPopMatrix();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        this.lllllIlllIIllIlIIlIIIllII.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(llIIIlllIlllIlIllIIIIllIl);
        class_0699.lllIIIllIIIIlllIlIIllIIll(n10, n11, 0, 0, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII);
        IlIlllIIIIIIlIIllIIllIlll = 0.0f;
        GL11.glDepthFunc((int)515);
        GL11.glDisable((int)2929);
        GL11.glEnable((int)3553);
        super.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
        if (object2 != null) {
            object = ((Achievement)object2).IlIIIIIllllllIIlllIllllll().IlIllllllIIlIIllllIIlIIIl();
            String string = ((Achievement)object2).lIllllIIlIIIlIllllllIIIll();
            n4 = n + 12;
            n3 = n2 - 4;
            int n23 = this.IlIlIIlllIllllllllIIIlIlI.IlIllllllIIlIIllllIIlIIIl((Achievement)object2);
            if (!this.IlIlIIlllIllllllllIIIlIlI.lllIlIIlIIIlIlIIIllIlllIl((Achievement)object2)) {
                if (n23 == 3) {
                    object = class_0616.lllIIIllIIIIlllIlIIllIIll("achievement.unknown", new Object[0]);
                    int n24 = Math.max(this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll((String)object), 120);
                    String string2 = new ChatComponentTranslation("achievement.requires", ((Achievement)object2).parentAchievement.IlIIIIIllllllIIlllIllllll()).IlIllllllIIlIIllllIIlIIIl();
                    int n25 = this.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl(string2, n24);
                    class_0699.lllIIIllIIIIlllIlIIllIIll((float)(n4 - 3), (float)(n3 - 3), (float)(n4 + n24 + 3), (float)(n3 + n25 + 12 + 3), -1073741824, -1073741824);
                    this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(string2, n4, n3 + 12, n24, -9416624);
                } else if (n23 < 3) {
                    int n26 = Math.max(this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll((String)object), 120);
                    String string3 = new ChatComponentTranslation("achievement.requires", ((Achievement)object2).parentAchievement.IlIIIIIllllllIIlllIllllll()).IlIllllllIIlIIllllIIlIIIl();
                    int n27 = this.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl(string3, n26);
                    class_0699.lllIIIllIIIIlllIlIIllIIll((float)(n4 - 3), (float)(n3 - 3), (float)(n4 + n26 + 3), (float)(n3 + n27 + 12 + 3), -1073741824, -1073741824);
                    this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(string3, n4, n3 + 12, n26, -9416624);
                } else {
                    object = null;
                }
            } else {
                int n28 = Math.max(this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll((String)object), 120);
                int n29 = this.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl(string, n28);
                if (this.IlIlIIlllIllllllllIIIlIlI.lllIIIllIIIIlllIlIIllIIll((Achievement)object2)) {
                    n29 += 12;
                }
                class_0699.lllIIIllIIIIlllIlIIllIIll((float)(n4 - 3), (float)(n3 - 3), (float)(n4 + n28 + 3), (float)(n3 + n29 + 3 + 12), -1073741824, -1073741824);
                this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(string, n4, n3 + 12, n28, -6250336);
                if (this.IlIlIIlllIllllllllIIIlIlI.lllIIIllIIIIlllIlIIllIIll((Achievement)object2)) {
                    this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(class_0616.lllIIIllIIIIlllIlIIllIIll("achievement.taken", new Object[0]), (float)n4, (float)(n3 + n29 + 4), -7302913);
                }
            }
            if (object != null) {
                this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll((String)object, (float)n4, (float)n3, this.IlIlIIlllIllllllllIIIlIlI.lllIlIIlIIIlIlIIIllIlllIl((Achievement)object2) ? (((Achievement)object2).IIIllIIlIIIIIIlIlIIllIIlI() ? -128 : -1) : (((Achievement)object2).IIIllIIlIIIIIIlIlIIllIIlI() ? -8355776 : -8355712));
            }
        }
        GL11.glEnable((int)2929);
        GL11.glEnable((int)2896);
        class_0624.lllIIIllIIIIlllIlIIllIIll();
    }

    @Override
    public boolean lIlllIlllIIIIlIIlllIllIII() {
        return !this.llllIIIIlIIIlIIIIIIlIllll;
    }
}

