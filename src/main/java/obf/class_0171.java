package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.util.HashSet;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import optifine.Config;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class class_0171
extends class_0734 {
    private class_0646 llIlllIlIIllIlIIIIllIIlIl = new class_0646();
    public int llllIlIIIIIIIIIlllIIlIIIl = 0;
    public int[] IIIIlIlIIlIIIIlIlllIlIIII = new int[]{0, 0};
    public int[][][] lllIIIIlIlIIlIIlllIIIIIIl = new int[2][2][16];
    public boolean[] llIlIIlllIIIIIllIIlIlIIII = new boolean[2];
    public class_1565 IllIIIlllllIlIlllIlllllII;

    public class_0171(class_1334 class_13342, List list, int n, int n2, int n3, int n4) {
        super(class_13342, list, n, n2, n3, n4);
    }

    private void IllIIIllIIIIlIlIlIllIIlll() {
        if (this.lllIIIIlIlIIlIIlllIIIIIIl[0][0][0] <= 0) {
            int n = this.llIIlIIllIIllIlIIllIIllII.llIIlIllIllllIlIIIIlIIlll.lllIIIllIIIIlllIlIIllIIll(64);
            for (int i = 0; i < 2; ++i) {
                int n2 = n + i * 2 * 16;
                for (int j = 0; j < 2; ++j) {
                    int n3 = n2 + j * 16;
                    for (int k = 0; k < 16; ++k) {
                        this.lllIIIIlIlIIlIIlllIIIIIIl[i][j][k] = n3 + k;
                    }
                }
            }
        }
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
            this.lllIIIllIIIIlllIlIIllIIll(0L);
            this.IIIllIllIIlIlIlIlIllllIIl();
        }
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(long l) {
        int n;
        if (this.lllIlIIlIIIlIlIIIllIlllIl == null) {
            return true;
        }
        this.lIlIlIIlIIIIlIIIIIlllIIII = false;
        if (!this.IIllIllIIllIIlllIIIlIlllI) {
            if (this.llIIIIllIIIIIIIlIIIlIIIIl) {
                GL11.glNewList((int)(this.IlIllllllIIlIIllllIIlIIIl + 2), (int)4864);
                class_1785.lllIIIllIIIIlllIlIIllIIll(class_1974.lllIIIllIIIIlllIlIIllIIll(this.llIIlllIllIllllIIIlIIIIII, this.llIIllIllIlIIlIIllIllllll, this.lllIIlIIIllllllIIIIlIlIlI, this.llIIlllIllIllllIIIlIIIIII + 16, this.llIIllIllIlIIlIIllIllllll + 16, this.lllIIlIIIllllllIIIIlIlIlI + 16));
                GL11.glEndList();
                this.llIIIIllIIIIIIIlIIIlIIIIl = false;
            }
            class_0723.lllIIIllIIIIlllIlIIllIIll = false;
        }
        int n2 = this.lIllllIIlIIIlIllllllIIIll;
        int n3 = this.IIIllIIlIIIIIIlIlIIllIIlI;
        int n4 = this.IllIIlllllllIIlIIlIIIIlIl;
        int n5 = this.lIllllIIlIIIlIllllllIIIll + 16;
        int n6 = this.IIIllIIlIIIIIIlIlIIllIIlI + 16;
        int n7 = this.IllIIlllllllIIlIIlIIIIlIl + 16;
        class_1496 class_14962 = null;
        class_1333 class_13332 = null;
        HashSet hashSet = null;
        int n8 = 0;
        int n9 = 0;
        int n10 = 0;
        if (!this.IIllIllIIllIIlllIIIlIlllI) {
            for (int i = 0; i < 2; ++i) {
                this.llIlIIlllIIIIIllIIlIlIIII[i] = true;
            }
            this.IllIIIlllllIlIlllIlllllII = null;
            Minecraft class_06672 = Minecraft.getMinecraft();
            class_1965 class_19652 = class_06672.llIIlllIllIllllIIIlIIIIII;
            n8 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19652.IlIIlllllIIlIlIlllllIllll);
            n9 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19652.llIIlIlIlllIIllIlIlllIllI);
            n10 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19652.IllIIIIllIIllIllIlllIlIIl);
            n = 1;
            class_14962 = new class_0563(this.lllIlIIlIIIlIlIIIllIlllIl, n2 - n, n3 - n, n4 - n, n5 + n, n6 + n, n7 + n, n);
            class_13332 = new class_1333(class_14962);
            hashSet = new HashSet();
            hashSet.addAll(this.llIIlIlIlllIIllIlIlllIllI);
            this.llIIlIlIlllIIllIlIlllIllI.clear();
        }
        if (this.IIllIllIIllIIlllIIIlIlllI || !class_14962.IlIllllllIIlIIllllIIlIIIl()) {
            this.IIIIIIIIlIllIIllIIlllIllI = 0;
            if (!this.IIllIllIIllIIlllIIIlIlllI) {
                ((class_0563)class_14962).lllIIIllIIIIlllIlIIllIIll();
            }
            this.lIlllIlllIIIIlIIlllIllIII = class_0868.IlIIIIIllllllIIlllIllllll;
            this.IllIIIllIIIIlIlIlIllIIlll();
            for (int i = 0; i < 2; ++i) {
                boolean bl = false;
                n = 0;
                boolean bl2 = false;
                for (int j = n3; j < n6; ++j) {
                    if (this.IIllIllIIllIIlllIIIlIlllI) {
                        this.IIllIllIIllIIlllIIIlIlllI = false;
                        class_14962 = this.llIlllIlIIllIlIIIIllIIlIl.lllIIIllIIIIlllIlIIllIIll;
                        class_13332 = this.llIlllIlIIllIlIIIIllIIlIl.lllIlIIlIIIlIlIIIllIlllIl;
                        hashSet = this.llIlllIlIIllIlIIIIllIIlIl.IlIllllllIIlIIllllIIlIIIl;
                        n8 = this.llIlllIlIIllIlIIIIllIIlIl.lIlllIlllIIIIlIIlllIllIII;
                        n9 = this.llIlllIlIIllIlIIIIllIIlIl.IlIIIIIllllllIIlllIllllll;
                        n10 = this.llIlllIlIIllIlIIIIllIIlIl.lIllllIIlIIIlIllllllIIIll;
                        i = this.llIlllIlIIllIlIIIIllIIlIl.IIIllIIlIIIIIIlIlIIllIIlI;
                        j = this.llIlllIlIIllIlIIIIllIIlIl.IllIIlllllllIIlIIlIIIIlIl;
                        bl = this.llIlllIlIIllIlIIIIllIIlIl.IIIllIllIIlIlIlIlIllllIIl;
                        n = this.llIlllIlIIllIlIIIIllIIlIl.IllIIIllIIIIlIlIlIllIIlll ? 1 : 0;
                        bl2 = this.llIlllIlIIllIlIIIIllIIlIl.lIIIIlIlIIlllllIIllIIlIII;
                        if (bl2) {
                            this.IlIllllllIIlIIllllIIlIIIl(i);
                        }
                    } else if (bl2 && l != 0L && System.nanoTime() - l > 0L && this.IIIIlIlIIlIIIIlIlllIlIIII[i] < 15) {
                        if (n != 0) {
                            this.llIlIIlllIIIIIllIIlIlIIII[i] = false;
                        }
                        this.lllIIIllIIIIlllIlIIllIIll(i, this.llIIlIIllIIllIlIIllIIllII.llIllllIlIllIIIlIllIIlIlI, false);
                        int n11 = i;
                        this.IIIIlIlIIlIIIIlIlllIlIIII[n11] = this.IIIIlIlIIlIIIIlIlllIlIIII[n11] + 1;
                        this.llIlllIlIIllIlIIIIllIIlIl.lllIIIllIIIIlllIlIIllIIll = class_14962;
                        this.llIlllIlIIllIlIIIIllIIlIl.lllIlIIlIIIlIlIIIllIlllIl = class_13332;
                        this.llIlllIlIIllIlIIIIllIIlIl.IlIllllllIIlIIllllIIlIIIl = hashSet;
                        this.llIlllIlIIllIlIIIIllIIlIl.lIlllIlllIIIIlIIlllIllIII = n8;
                        this.llIlllIlIIllIlIIIIllIIlIl.IlIIIIIllllllIIlllIllllll = n9;
                        this.llIlllIlIIllIlIIIIllIIlIl.lIllllIIlIIIlIllllllIIIll = n10;
                        this.llIlllIlIIllIlIIIIllIIlIl.IIIllIIlIIIIIIlIlIIllIIlI = i;
                        this.llIlllIlIIllIlIIIIllIIlIl.IllIIlllllllIIlIIlIIIIlIl = j;
                        this.llIlllIlIIllIlIIIIllIIlIl.IIIllIllIIlIlIlIlIllllIIl = bl;
                        this.llIlllIlIIllIlIIIIllIIlIl.IllIIIllIIIIlIlIlIllIIlll = n;
                        this.llIlllIlIIllIlIIIIllIIlIl.lIIIIlIlIIlllllIIllIIlIII = bl2;
                        this.IIllIllIIllIIlllIIIlIlllI = true;
                        return false;
                    }
                    for (int k = n4; k < n7; ++k) {
                        for (int i2 = n2; i2 < n5; ++i2) {
                            boolean bl3;
                            int n12;
                            class_1774 class_17742;
                            Block class_05492 = ((class_0563)class_14962).a_(i2, j, k);
                            if (class_05492.lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll) continue;
                            if (!bl2) {
                                bl2 = true;
                                this.IlIllllllIIlIIllllIIlIIIl(i);
                            }
                            boolean bl4 = class_05492.lllIIlIIIllllllIIIIlIlIlI();
                            if (i == 0 && bl4 && class_1683.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(class_17742 = class_14962.lllIlIIlIIIlIlIIIllIlllIl(i2, j, k))) {
                                this.llIIlIlIlllIIllIlIlllIllI.add(class_17742);
                            }
                            if ((n12 = class_05492.lllllIlllIIllIlIIlIIIllII()) > i) {
                                bl = true;
                            }
                            boolean bl5 = bl3 = n12 == i;
                            if (!bl3) continue;
                            n |= class_13332.lllIlIIlIIIlIlIIIllIlllIl(class_05492, i2, j, k);
                            if (class_05492.lIIIIlIlIIlllllIIllIIlIII() != 0 || i2 != n8 || j != n9 || k != n10) continue;
                            class_13332.lllIIIllIIIIlllIlIIllIIll(true);
                            class_13332.lllIlIIlIIIlIlIIIllIlllIl(true);
                            class_13332.lllIlIIlIIIlIlIIIllIlllIl(class_05492, i2, j, k);
                            class_13332.lllIIIllIIIIlllIlIIllIIll(false);
                            class_13332.lllIlIIlIIIlIlIIIllIlllIl(false);
                        }
                    }
                }
                if (n != 0) {
                    this.llIlIIlllIIIIIllIIlIlIIII[i] = false;
                }
                if (bl2) {
                    this.lllIIIllIIIIlllIlIIllIIll(i, this.llIIlIIllIIllIlIIllIIllII.llIllllIlIllIIIlIllIIlIlI, true);
                } else {
                    n = 0;
                }
                if (!bl) break;
            }
            ((class_0563)class_14962).lllIlIIlIIIlIlIIIllIlllIl();
        }
        HashSet hashSet2 = new HashSet();
        hashSet2.addAll(this.llIIlIlIlllIIllIlIlllIllI);
        hashSet2.removeAll(hashSet);
        this.IllIIIIllIIllIllIlllIlIIl.addAll(hashSet2);
        hashSet.removeAll(this.llIIlIlIlllIIllIlIlllIllI);
        this.IllIIIIllIIllIllIlllIlIIl.removeAll(hashSet);
        this.lIlllIlllIlIIIIlllIlIlIIl = class_0723.lllIIIllIIIIlllIlIIllIIll;
        this.IlIIlllllIIlIlIlllllIllll = true;
        ++IlIIIIIllllllIIlllIllllll;
        this.lIlIllIIlIIlIIlIIlIIlIIll = true;
        this.IIlIIlIlIlIllIIlIlIIIIlll = false;
        this.IlIlIIlIlIllIIlIlIIllIIIl[0] = this.llIlIIlllIIIIIllIIlIlIIII[0];
        this.IlIlIIlIlIllIIlIlIIllIIIl[1] = this.llIlIIlllIIIIIllIIlIlIIII[1];
        this.llIlllIIllIlllIlIlIlIIIll = this.IlIlIIlIlIllIIlIlIIllIIIl[0] && this.IlIlIIlIlIllIIlIlIIllIIIl[1];
        this.lllIIIllIIIIlllIlIIllIIll = this.IllIIIlllllIlIlllIlllllII;
        this.IIllIllIIllIIlllIIIlIlllI = false;
        this.IIIllIIlIIIIIIlIlIIllIIlI();
        return true;
    }

    protected void IlIllllllIIlIIllllIIlIIIl(int n) {
        GL11.glNewList((int)this.lllIIIIlIlIIlIIlllIIIIIIl[this.llllIlIIIIIIIIIlllIIlIIIl][n][this.IIIIlIlIIlIIIIlIlllIlIIII[n]], (int)4864);
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

    protected void lllIIIllIIIIlllIlIIllIIll(int n, class_1965 class_19652, boolean bl) {
        if (Config.IllIIIIlIIlllllllllIlIlII() && n == 1 && !this.llIlIIlllIIIIIllIIlIlIIII[n]) {
            class_1565 class_15652 = this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll((float)class_19652.IlIIlllllIIlIlIlllllIllll, (float)class_19652.llIIlIlIlllIIllIlIlllIllI, (float)class_19652.IllIIIIllIIllIllIlllIlIIl);
            if (this.IllIIIlllllIlIlllIlllllII == null) {
                this.IllIIIlllllIlIlllIlllllII = class_15652;
            } else {
                this.IllIIIlllllIlIlllIlllllII.lllIIIllIIIIlllIlIIllIIll(class_15652);
            }
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
        int n2;
        int n3;
        for (n3 = 0; n3 < 2; ++n3) {
            if (this.IlIlIIlIlIllIIlIlIIllIIIl[n3]) continue;
            GL11.glNewList((int)(this.IlIllllllIIlIIllllIIlIIIl + n3), (int)4864);
            for (n2 = 0; n2 <= this.IIIIlIlIIlIIIIlIlllIlIIII[n3]; ++n2) {
                n = this.lllIIIIlIlIIlIIlllIIIIIIl[this.llllIlIIIIIIIIIlllIIlIIIl][n3][n2];
                GL11.glCallList((int)n);
            }
            GL11.glEndList();
        }
        this.llllIlIIIIIIIIIlllIIlIIIl = this.llllIlIIIIIIIIIlllIIlIIIl == 0 ? 1 : 0;
        for (n3 = 0; n3 < 2; ++n3) {
            if (this.IlIlIIlIlIllIIlIlIIllIIIl[n3]) continue;
            for (n2 = 0; n2 <= this.IIIIlIlIIlIIIIlIlllIlIIII[n3]; ++n2) {
                n = this.lllIIIIlIlIIlIIlllIIIIIIl[this.llllIlIIIIIIIIIlllIIlIIIl][n3][n2];
                GL11.glNewList((int)n, (int)4864);
                GL11.glEndList();
            }
        }
        for (n3 = 0; n3 < 2; ++n3) {
            this.IIIIlIlIIlIIIIlIlllIlIIII[n3] = 0;
        }
    }
}

