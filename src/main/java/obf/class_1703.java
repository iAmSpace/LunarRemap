package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.HashSet;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import optifine.Config;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class class_1703
extends class_0734 {
    private int lllIIIIlIlIIlIIlllIIIIIIl;
    private int llIlIIlllIIIIIllIIlIlIIII;
    public boolean[] llllIlIIIIIIIIIlllIIlIIIl = new boolean[2];
    public class_1565 IIIIlIlIIlIIIIlIlllIlIIII;
    private class_0868 IllIIIlllllIlIlllIlllllII = null;

    public class_1703(class_1334 class_13342, List list, int n, int n2, int n3, int n4) {
        super(class_13342, list, n, n2, n3, n4);
        class_1114 class_11142 = Minecraft.getMinecraft().IllIIIllIIIIlIlIlIllIIlll;
        this.lllIIIIlIlIIlIIlllIIIIIIl = class_11142.llIIlIllIllllIlIIIIlIIlll.lllIIIllIIIIlllIlIIllIIll(2);
        this.llIlIIlllIIIIIllIIlIlIIII = this.IlIllllllIIlIIllllIIlIIIl + 2;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        if (this.IIllIllIIllIIlllIIIlIlllI) {
            class_1379.IlIIIIIllllllIIlllIllllll();
        }
        super.lllIIIllIIIIlllIlIIllIIll(n, n2, n3);
    }

    public void IllIIlllllllIIlIIlIIIIlIl() {
        if (this.lllIlIIlIIIlIlIIIllIlllIl != null) {
            this.lllIIIllIIIIlllIlIIllIIll((class_0669)null);
            this.IIIllIllIIlIlIlIlIllllIIl();
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0669 class_06692) {
        if (this.lllIlIIlIIIlIlIIIllIlllIl != null) {
            Object object;
            this.lIlIlIIlIIIIlIIIIIlllIIII = false;
            int n = this.lIllllIIlIIIlIllllllIIIll;
            int n2 = this.IIIllIIlIIIIIIlIlIIllIIlI;
            int n3 = this.IllIIlllllllIIlIIlIIIIlIl;
            int n4 = this.lIllllIIlIIIlIllllllIIIll + 16;
            int n5 = this.IIIllIIlIIIIIIlIlIIllIIlI + 16;
            int n6 = this.IllIIlllllllIIlIIlIIIIlIl + 16;
            for (int i = 0; i < this.llllIlIIIIIIIIIlllIIlIIIl.length; ++i) {
                this.llllIlIIIIIIIIIlllIIlIIIl[i] = true;
            }
            class_0723.lllIIIllIIIIlllIlIIllIIll = false;
            HashSet hashSet = new HashSet();
            hashSet.addAll(this.llIIlIlIlllIIllIlIlllIllI);
            this.llIIlIlIlllIIllIlIlllIllI.clear();
            Minecraft class_06672 = Minecraft.getMinecraft();
            class_1965 class_19652 = class_06672.llIIlllIllIllllIIIlIIIIII;
            int n7 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19652.IlIIlllllIIlIlIlllllIllll);
            int n8 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19652.llIIlIlIlllIIllIlIlllIllI);
            int n9 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19652.IllIIIIllIIllIllIlllIlIIl);
            int n10 = 1;
            class_0563 class_05632 = new class_0563(this.lllIlIIlIIIlIlIIIllIlllIl, n - n10, n2 - n10, n3 - n10, n4 + n10, n5 + n10, n6 + n10, n10);
            if (!class_05632.IlIllllllIIlIIllllIIlIIIl()) {
                ++IlIIIIIllllllIIlllIllllll;
                class_05632.lllIIIllIIIIlllIlIIllIIll();
                object = new class_1333(class_05632);
                this.IIIIIIIIlIllIIllIIlllIllI = 0;
                this.IIIIlIlIIlIIIIlIlllIlIIII = null;
                this.lIlllIlllIIIIlIIlllIllIII = class_0868.IlIIIIIllllllIIlllIllllll;
                class_1268 class_12682 = new class_1268();
                for (int i = 0; i < 2; ++i) {
                    class_12682.lllIIIllIIIIlllIlIIllIIll(i);
                    boolean bl = false;
                    boolean bl2 = false;
                    boolean bl3 = false;
                    for (int j = n2; j < n5; ++j) {
                        if (bl2 && class_06692 != null) {
                            class_06692.lllIIIllIIIIlllIlIIllIIll(class_12682);
                            this.lIlllIlllIIIIlIIlllIllIII = class_0868.IlIIIIIllllllIIlllIllllll;
                        }
                        for (int k = n3; k < n6; ++k) {
                            for (int i2 = n; i2 < n4; ++i2) {
                                boolean bl4;
                                int n11;
                                class_1774 class_17742;
                                Block class_05492 = class_05632.a_(i2, j, k);
                                if (class_05492.lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll) continue;
                                if (!bl3) {
                                    bl3 = true;
                                    this.IlIllllllIIlIIllllIIlIIIl(i);
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
                        this.llllIlIIIIIIIIIlllIIlIIIl[i] = false;
                    }
                    if (bl3) {
                        if (class_06692 != null) {
                            class_06692.lllIIIllIIIIlllIlIIllIIll(class_12682);
                        }
                        this.lIlllIlllIIIIlIIlllIllIII = class_0868.IlIIIIIllllllIIlllIllllll;
                        this.lllIlIIlIIIlIlIIIllIlllIl(i, this.llIIlIIllIIllIlIIllIIllII.llIllllIlIllIIIlIllIIlIlI);
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
        }
    }

    protected void IlIllllllIIlIIllllIIlIIIl(int n) {
        GL11.glNewList((int)(this.lllIIIIlIlIIlIIlllIIIIIIl + n), (int)4864);
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

    protected void lllIlIIlIIIlIlIIIllIlllIl(int n, class_1965 class_19652) {
        if (Config.IllIIIIlIIlllllllllIlIlII() && n == 1 && !this.llllIlIIIIIIIIIlllIIlIIIl[n]) {
            this.IIIIlIlIIlIIIIlIlllIlIIII = this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll((float)class_19652.IlIIlllllIIlIlIlllllIllll, (float)class_19652.llIIlIlIlllIIllIlIlllIllI, (float)class_19652.IllIIIIllIIllIllIlllIlIIl);
        }
        this.IIIIIIIIlIllIIllIIlllIllI += this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll();
        this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(false);
        if (!Config.IllIlllIIIlllllIllIIlIlIl()) {
            GL11.glPopMatrix();
        }
        GL11.glEndList();
        this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl(0.0, 0.0, 0.0);
    }

    public void IIIllIllIIlIlIlIlIllllIIl() {
        int n;
        int n2 = this.IlIllllllIIlIIllllIIlIIIl;
        this.IlIllllllIIlIIllllIIlIIIl = this.lllIIIIlIlIIlIIlllIIIIIIl;
        this.lllIIIIlIlIIlIIlllIIIIIIl = n2;
        for (n = 0; n < 2; ++n) {
            if (this.IlIlIIlIlIllIIlIlIIllIIIl[n]) continue;
            GL11.glNewList((int)(this.lllIIIIlIlIIlIIlllIIIIIIl + n), (int)4864);
            GL11.glEndList();
        }
        for (n = 0; n < 2; ++n) {
            this.IlIlIIlIlIllIIlIlIIllIIIl[n] = this.llllIlIIIIIIIIIlllIIlIIIl[n];
        }
        boolean bl = this.llIlllIIllIlllIlIlIlIIIll = this.IlIlIIlIlIllIIlIlIIllIIIl[0] && this.IlIlIIlIlIllIIlIlIIllIIIl[1];
        if (this.llIIIIllIIIIIIIlIIIlIIIIl && !this.IlIIIIIllllllIIlllIllllll()) {
            GL11.glNewList((int)this.llIlIIlllIIIIIllIIlIlIIII, (int)4864);
            class_1785.lllIIIllIIIIlllIlIIllIIll(class_1974.lllIIIllIIIIlllIlIIllIIll(this.llIIlllIllIllllIIIlIIIIII, this.llIIllIllIlIIlIIllIllllll, this.lllIIlIIIllllllIIIIlIlIlI, this.llIIlllIllIllllIIIlIIIIII + 16, this.llIIllIllIlIIlIIllIllllll + 16, this.lllIIlIIIllllllIIIIlIlIlI + 16));
            GL11.glEndList();
            this.llIIIIllIIIIIIIlIIIlIIIIl = false;
        }
        this.lllIIIllIIIIlllIlIIllIIll = this.IIIIlIlIIlIIIIlIlllIlIIII;
        this.lIlIllIIlIIlIIlIIlIIlIIll = true;
        this.IIlIIlIlIlIllIIlIlIIIIlll = false;
        this.IIIllIIlIIIIIIlIlIIllIIlI();
    }

    @Override
    public void lIlllIlllIIIIlIIlllIllIII() {
        GL11.glCallList((int)this.llIlIIlllIIIIIllIIlIlIIII);
    }
}

