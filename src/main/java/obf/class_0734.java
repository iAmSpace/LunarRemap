package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import optifine.Config;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class class_0734 {
    protected class_1565 lllIIIllIIIIlllIlIIllIIll;
    public class_1334 lllIlIIlIIIlIlIIIllIlllIl;
    protected int IlIllllllIIlIIllllIIlIIIl;
    protected class_0868 lIlllIlllIIIIlIIlllIllIII = class_0868.IlIIIIIllllllIIlllIllllll;
    public static volatile int IlIIIIIllllllIIlllIllllll;
    public int lIllllIIlIIIlIllllllIIIll;
    public int IIIllIIlIIIIIIlIlIIllIIlI;
    public int IllIIlllllllIIlIIlIIIIlIl;
    public int IIIllIllIIlIlIlIlIllllIIl;
    public int IllIIIllIIIIlIlIlIllIIlll;
    public int lIIIIlIlIIlllllIIllIIlIII;
    public int llIIlllIllIllllIIIlIIIIII;
    public int llIIllIllIlIIlIIllIllllll;
    public int lllIIlIIIllllllIIIIlIlIlI;
    public boolean IlIlllIIIIIIlIIllIIllIlll;
    public boolean[] IlIlIIlIlIllIIlIlIIllIIIl = new boolean[]{true, true};
    public int lllllIlllIIllIlIIlIIIllII;
    public int IlIlIIlllIIlIllIIIlllllIl;
    public int lIIlIIIIIlIlllIlIIlIlIlll;
    public volatile boolean lIlIlIIlIIIIlIIIIIlllIIII;
    public class_1974 IlIIIlIIIIllIIIllIIIIIIll;
    public int IIlllIlIlllIllIIIlllIIlIl;
    public boolean lIlIllIIlIIlIIlIIlIIlIIll;
    public boolean llIIlIllIllllIlIIIIlIIlll;
    public int llIllllIlIllIIIlIllIIlIlI;
    public boolean lIlllIlllIlIIIIlllIlIlIIl;
    protected boolean IlIIlllllIIlIlIlllllIllll;
    public List llIIlIlIlllIIllIlIlllIllI = new ArrayList();
    protected List IllIIIIllIIllIllIlllIlIIl;
    protected int IIIIIIIIlIllIIllIIlllIllI;
    public boolean IIlIIlIlIlIllIIlIlIIIIlll = false;
    public double llIIIlllIlllIlIllIIIIllIl;
    public double IIIIlIllIlIIlIIlIllIlIlll;
    public double IlIlIIlllIllllllllIIIlIlI;
    public boolean llllIIIIlIIIlIIIIIIlIllll = false;
    protected boolean llIIIIllIIIIIIIlIIIlIIIIl = false;
    public volatile boolean IIllIllIIllIIlllIIIlIlllI = false;
    public float llllllIlIllllIlIlIlIIIIlI;
    public double lIlIIllllIlIIIIllIIIIlIIl;
    protected boolean llIlllIIllIlllIlIlIlIIIll = true;
    public boolean IIIIlIIlIIIllIIIIllIIIlII;
    public boolean lllIIIIIIlIlllIIlIlIIIllI;
    public class_1114 llIIlIIllIIllIlIIllIIllII;
    public static int lIlIlIIIIIIlIIllllIlIIllI;
    public static int IllllIIIIlIIlIIIIlllIIIIl;

    public class_0734(class_1334 class_13342, List list, int n, int n2, int n3, int n4) {
        this.llIIlIIllIIllIlIIllIIllII = Minecraft.getMinecraft().IllIIIllIIIIlIlIlIllIIlll;
        this.IlIllllllIIlIIllllIIlIIIl = -1;
        this.IlIlllIIIIIIlIIllIIllIlll = false;
        this.lIlIllIIlIIlIIlIIlIIlIIll = true;
        this.IlIIlllllIIlIlIlllllIllll = false;
        this.lllIlIIlIIIlIlIIIllIlllIl = class_13342;
        this.lllIIIllIIIIlllIlIIllIIll = null;
        this.IllIIIIllIIllIllIlllIlIIl = list;
        this.IlIllllllIIlIIllllIIlIIIl = n4;
        this.lIllllIIlIIIlIllllllIIIll = -999;
        this.lllIIIllIIIIlllIlIIllIIll(n, n2, n3);
        this.lIlIlIIlIIIIlIIIIIlllIIII = false;
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        if (n != this.lIllllIIlIIIlIllllllIIIll || n2 != this.IIIllIIlIIIIIIlIlIIllIIlI || n3 != this.IllIIlllllllIIlIIlIIIIlIl) {
            this.lllIlIIlIIIlIlIIIllIlllIl();
            this.lIllllIIlIIIlIllllllIIIll = n;
            this.IIIllIIlIIIIIIlIlIIllIIlI = n2;
            this.IllIIlllllllIIlIIlIIIIlIl = n3;
            this.lllllIlllIIllIlIIlIIIllII = n + 8;
            this.IlIlIIlllIIlIllIIIlllllIl = n2 + 8;
            this.lIIlIIIIIlIlllIlIIlIlIlll = n3 + 8;
            this.llIIlllIllIllllIIIlIIIIII = n & 0x3FF;
            this.llIIllIllIlIIlIIllIllllll = n2;
            this.lllIIlIIIllllllIIIIlIlIlI = n3 & 0x3FF;
            this.IIIllIllIIlIlIlIlIllllIIl = n - this.llIIlllIllIllllIIIlIIIIII;
            this.IllIIIllIIIIlIlIlIllIIlll = n2 - this.llIIllIllIlIIlIIllIllllll;
            this.lIIIIlIlIIlllllIIllIIlIII = n3 - this.lllIIlIIIllllllIIIIlIlIlI;
            this.IlIIIlIIIIllIIIllIIIIIIll = class_1974.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n + 16, n2 + 16, n3 + 16);
            this.llIIIIllIIIIIIIlIIIlIIIIl = true;
            this.lIllllIIlIIIlIllllllIIIll();
            this.IIlIIlIlIlIllIIlIlIIIIlll = false;
        }
    }

    protected void lllIIIllIIIIlllIlIIllIIll() {
        GL11.glTranslatef((float)this.llIIlllIllIllllIIIlIIIIII, (float)this.llIIllIllIlIIlIIllIllllll, (float)this.lllIIlIIIllllllIIIIlIlIlI);
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652) {
        if (this.lllIlIIlIIIlIlIIIllIlllIl != null) {
            if (this.llIIIIllIIIIIIIlIIIlIIIIl) {
                GL11.glNewList((int)(this.IlIllllllIIlIIllllIIlIIIl + 2), (int)4864);
                class_1785.lllIIIllIIIIlllIlIIllIIll(class_1974.lllIIIllIIIIlllIlIIllIIll(this.llIIlllIllIllllIIIlIIIIII, this.llIIllIllIlIIlIIllIllllll, this.lllIIlIIIllllllIIIIlIlIlI, this.llIIlllIllIllllIIIlIIIIII + 16, this.llIIllIllIlIIlIIllIllllll + 16, this.lllIIlIIIllllllIIIIlIlIlI + 16));
                GL11.glEndList();
                this.llIIIIllIIIIIIIlIIIlIIIIl = false;
            }
            this.lIlIllIIlIIlIIlIIlIIlIIll = true;
            this.IIlIIlIlIlIllIIlIlIIIIlll = false;
            if (this.lIlIlIIlIIIIlIIIIIlllIIII) {
                Object object;
                this.lIlIlIIlIIIIlIIIIIlllIIII = false;
                int n = this.lIllllIIlIIIlIllllllIIIll;
                int n2 = this.IIIllIIlIIIIIIlIlIIllIIlI;
                int n3 = this.IllIIlllllllIIlIIlIIIIlIl;
                int n4 = this.lIllllIIlIIIlIllllllIIIll + 16;
                int n5 = this.IIIllIIlIIIIIIlIlIIllIIlI + 16;
                int n6 = this.IllIIlllllllIIlIIlIIIIlIl + 16;
                for (int i = 0; i < 2; ++i) {
                    this.IlIlIIlIlIllIIlIlIIllIIIl[i] = true;
                }
                this.llIlllIIllIlllIlIlIlIIIll = true;
                class_0723.lllIIIllIIIIlllIlIIllIIll = false;
                HashSet hashSet = new HashSet();
                hashSet.addAll(this.llIIlIlIlllIIllIlIlllIllI);
                this.llIIlIlIlllIIllIlIlllIllI.clear();
                Minecraft class_06672 = Minecraft.getMinecraft();
                class_1965 class_19653 = class_06672.llIIlllIllIllllIIIlIIIIII;
                int n7 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19653.IlIIlllllIIlIlIlllllIllll);
                int n8 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19653.llIIlIlIlllIIllIlIlllIllI);
                int n9 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19653.IllIIIIllIIllIllIlllIlIIl);
                int n10 = 1;
                class_0563 class_05632 = new class_0563(this.lllIlIIlIIIlIlIIIllIlllIl, n - n10, n2 - n10, n3 - n10, n4 + n10, n5 + n10, n6 + n10, n10);
                if (!class_05632.IlIllllllIIlIIllllIIlIIIl()) {
                    ++IlIIIIIllllllIIlllIllllll;
                    class_05632.lllIIIllIIIIlllIlIIllIIll();
                    object = new class_1333(class_05632);
                    this.IIIIIIIIlIllIIllIIlllIllI = 0;
                    this.lllIIIllIIIIlllIlIIllIIll = null;
                    this.lIlllIlllIIIIlIIlllIllIII = class_0868.IlIIIIIllllllIIlllIllllll;
                    for (int i = 0; i < 2; ++i) {
                        boolean bl = false;
                        boolean bl2 = false;
                        boolean bl3 = false;
                        for (int j = n2; j < n5; ++j) {
                            for (int k = n3; k < n6; ++k) {
                                for (int i2 = n; i2 < n4; ++i2) {
                                    boolean bl4;
                                    int n11;
                                    class_1774 class_17742;
                                    Block class_05492 = class_05632.a_(i2, j, k);
                                    if (class_05492.lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll) continue;
                                    if (!bl3) {
                                        bl3 = true;
                                        this.lllIIIllIIIIlllIlIIllIIll(i);
                                    }
                                    boolean bl5 = false;
                                    bl5 = class_05492.lllIIlIIIllllllIIIIlIlIlI();
                                    if (i == 0 && bl5 && class_1683.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(class_17742 = class_05632.lllIlIIlIIIlIlIIIllIlllIl(i2, j, k))) {
                                        this.llIIlIlIlllIIllIlIlllIllI.add(class_17742);
                                    }
                                    if ((n11 = class_05492.lllllIlllIIllIlIIlIIIllII()) > i) {
                                        bl = true;
                                    }
                                    boolean bl6 = bl4 = n11 == i;
                                    if (!bl4) continue;
                                    bl2 |= ((class_1333)object).lllIlIIlIIIlIlIIIllIlllIl(class_05492, i2, j, k);
                                    if (class_05492.lIIIIlIlIIlllllIIllIIlIII() != 0 || i2 != n7 || j != n8 || k != n9) continue;
                                    ((class_1333)object).lllIIIllIIIIlllIlIIllIIll(true);
                                    ((class_1333)object).lllIlIIlIIIlIlIIIllIlllIl(true);
                                    ((class_1333)object).lllIlIIlIIIlIlIIIllIlllIl(class_05492, i2, j, k);
                                    ((class_1333)object).lllIIIllIIIIlllIlIIllIIll(false);
                                    ((class_1333)object).lllIlIIlIIIlIlIIIllIlllIl(false);
                                }
                            }
                        }
                        if (bl2) {
                            this.IlIlIIlIlIllIIlIlIIllIIIl[i] = false;
                        }
                        if (bl3) {
                            this.lllIIIllIIIIlllIlIIllIIll(i, class_19652);
                        } else {
                            bl2 = false;
                        }
                        if (!bl) break;
                    }
                    class_05632.lllIlIIlIIIlIlIIIllIlllIl();
                }
                object = new HashSet();
                ((AbstractCollection)object).addAll(this.llIIlIlIlllIIllIlIlllIllI);
                ((AbstractSet)object).removeAll(hashSet);
                this.IllIIIIllIIllIllIlllIlIIl.addAll(object);
                hashSet.removeAll(this.llIIlIlIlllIIllIlIlllIllI);
                this.IllIIIIllIIllIllIlllIlIIl.removeAll(hashSet);
                this.lIlllIlllIlIIIIlllIlIlIIl = class_0723.lllIIIllIIIIlllIlIIllIIll;
                this.IlIIlllllIIlIlIlllllIllll = true;
                this.llIlllIIllIlllIlIlIlIIIll = this.IlIlIIlIlIllIIlIlIIllIIIl[0] && this.IlIlIIlIlIllIIlIlIIllIIIl[1];
                this.IIIllIIlIIIIIIlIlIIllIIlI();
            }
        }
    }

    protected void lllIIIllIIIIlllIlIIllIIll(int n) {
        GL11.glNewList((int)(this.IlIllllllIIlIIllllIIlIIIl + n), (int)4864);
        this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(true);
        if (Config.IllIlllIIIlllllIllIIlIlIl()) {
            this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl();
            this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl((double)(-lIlIlIIIIIIlIIllllIlIIllI), 0.0, (double)(-IllllIIIIlIIlIIIIlllIIIIl));
        } else {
            GL11.glPushMatrix();
            this.lllIIIllIIIIlllIlIIllIIll();
            float f = 1.000001f;
            GL11.glTranslatef((float)-8.0f, (float)-8.0f, (float)-8.0f);
            GL11.glScalef((float)f, (float)f, (float)f);
            GL11.glTranslatef((float)8.0f, (float)8.0f, (float)8.0f);
            this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl();
            this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl((double)(-this.lIllllIIlIIIlIllllllIIIll), (double)(-this.IIIllIIlIIIIIIlIlIIllIIlI), (double)(-this.IllIIlllllllIIlIIlIIIIlIl));
        }
    }

    protected void lllIIIllIIIIlllIlIIllIIll(int n, class_1965 class_19652) {
        if (Config.IllIIIIlIIlllllllllIlIlII() && n == 1 && !this.IlIlIIlIlIllIIlIlIIllIIIl[n]) {
            this.lllIIIllIIIIlllIlIIllIIll = this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll((float)class_19652.IlIIlllllIIlIlIlllllIllll, (float)class_19652.llIIlIlIlllIIllIlIlllIllI, (float)class_19652.IllIIIIllIIllIllIlllIlIIl);
        }
        this.IIIIIIIIlIllIIllIIlllIllI += this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll();
        this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(false);
        if (!Config.IllIlllIIIlllllIllIIlIlIl()) {
            GL11.glPopMatrix();
        }
        GL11.glEndList();
        this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl(0.0, 0.0, 0.0);
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(class_1965 class_19652) {
        if (this.lllIIIllIIIIlllIlIIllIIll != null && !this.IlIlIIlIlIllIIlIlIIllIIIl[1]) {
            this.lIlllIlllIIIIlIIlllIllIII = class_0868.IlIIIIIllllllIIlllIllllll;
            this.lllIIIllIIIIlllIlIIllIIll(1);
            this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll);
            this.lllIIIllIIIIlllIlIIllIIll(1, class_19652);
        }
    }

    public float lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212) {
        float f = (float)(class_15212.IlIIlllllIIlIlIlllllIllll - (double)this.lllllIlllIIllIlIIlIIIllII);
        float f2 = (float)(class_15212.llIIlIlIlllIIllIlIlllIllI - (double)this.IlIlIIlllIIlIllIIIlllllIl);
        float f3 = (float)(class_15212.IllIIIIllIIllIllIlllIlIIl - (double)this.lIIlIIIIIlIlllIlIIlIlIlll);
        return f * f + f2 * f2 + f3 * f3;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl() {
        for (int i = 0; i < 2; ++i) {
            this.IlIlIIlIlIllIIlIlIIllIIIl[i] = true;
        }
        this.llIlllIIllIlllIlIlIlIIIll = true;
        this.IlIlllIIIIIIlIIllIIllIlll = false;
        this.IlIIlllllIIlIlIlllllIllll = false;
        this.lllIIIllIIIIlllIlIIllIIll = null;
    }

    public void IlIllllllIIlIIllllIIlIIIl() {
        this.lllIlIIlIIIlIlIIIllIlllIl();
        this.lllIlIIlIIIlIlIIIllIlllIl = null;
    }

    public int lllIlIIlIIIlIlIIIllIlllIl(int n) {
        return this.IlIllllllIIlIIllllIIlIIIl + n;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1821 class_18212) {
        this.IlIlllIIIIIIlIIllIIllIlll = class_18212.lllIIIllIIIIlllIlIIllIIll(this.IlIIIlIIIIllIIIllIIIIIIll);
        this.llllIIIIlIIIlIIIIIIlIllll = this.IlIlllIIIIIIlIIllIIllIlll && Config.lIlIlIIlIIIIlIIIIIlllIIII() ? class_18212.lllIlIIlIIIlIlIIIllIlllIl(this.IlIIIlIIIIllIIIllIIIIIIll) : false;
    }

    public void lIlllIlllIIIIlIIlllIllIII() {
        GL11.glCallList((int)(this.IlIllllllIIlIIllllIIlIIIl + 2));
    }

    public boolean IlIIIIIllllllIIlllIllllll() {
        return this.llIlllIIllIlllIlIlIlIIIll;
    }

    public void lIllllIIlIIIlIllllllIIIll() {
        this.lIlIlIIlIIIIlIIIIIlllIIII = true;
    }

    protected void IIIllIIlIIIIIIlIlIIllIIlI() {
        if (!this.llIlllIIllIlllIlIlIlIIIll && !this.IIIIlIIlIIIllIIIIllIIIlII) {
            Minecraft.getMinecraft().IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(this);
        }
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(class_1521 class_15212) {
        double d;
        double d2 = class_15212.IlIIlllllIIlIlIlllllIllll - (double)this.lllllIlllIIllIlIIlIIIllII;
        double d3 = class_15212.llIIlIlIlllIIllIlIlllIllI - (double)this.IlIlIIlllIIlIllIIIlllllIl;
        double d4 = class_15212.IllIIIIllIIllIllIlllIlIIl - (double)this.lIIlIIIIIlIlllIlIIlIlIlll;
        this.lIlIIllllIlIIIIllIIIIlIIl = d = d2 * d2 + d4 * d4;
        this.llllllIlIllllIlIlIlIIIIlI = (float)(d + d3 * d3);
    }

    static {
        lIlIlIIIIIIlIIllllIlIIllI = 0;
        IllllIIIIlIIlIIIIlllIIIIl = 0;
    }
}

