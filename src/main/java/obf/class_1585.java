package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.lwjgl.opengl.GL11
 */
import com.google.common.collect.Lists;
import java.awt.image.BufferedImage;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import net.minecraft.crash.CrashReport;
import org.lwjgl.opengl.GL11;

public class class_1585
implements class_2102 {
    private final String IlIlIIlIlIllIIlIlIIllIIIl;
    protected List lllIIIllIIIIlllIlIIllIIll = Lists.newArrayList();
    private class_0762 lllllIlllIIllIlIIlIIIllII;
    protected boolean lllIlIIlIIIlIlIIIllIlllIl;
    private boolean IlIlIIlllIIlIllIIIlllllIl;
    protected int IlIllllllIIlIIllllIIlIIIl;
    protected int lIlllIlllIIIIlIIlllIllIII;
    protected int IlIIIIIllllllIIlllIllllll;
    protected int lIllllIIlIIIlIllllllIIIll;
    private float lIIlIIIIIlIlllIlIIlIlIlll;
    private float lIlIlIIlIIIIlIIIIIlllIIII;
    private float IlIIIlIIIIllIIIllIIIIIIll;
    private float IIlllIlIlllIllIIIlllIIlIl;
    protected int IIIllIIlIIIIIIlIlIIllIIlI;
    protected int IllIIlllllllIIlIIlIIIIlIl;
    private int lIlIllIIlIIlIIlIIlIIlIIll = -1;
    public float IIIllIllIIlIlIlIlIllllIIl;
    public float IllIIIllIIIIlIlIlIllIIlll;
    public int lIIIIlIlIIlllllIIllIIlIII;
    public int llIIlllIllIllllIIIlIIIIII;
    private boolean llIIlIllIllllIlIIIIlIIlll = false;
    public int llIIllIllIlIIlIIllIllllll = -1;
    private int llIllllIlIllIIIlIllIIlIlI = -1;
    private int lIlllIlllIlIIIIlllIlIlIIl = -1;
    public IntBuffer[] lllIIlIIIllllllIIIIlIlIlI;
    public class_1348[] IlIlllIIIIIIlIIllIIllIlll;
    private boolean IlIIlllllIIlIlIlllllIllll = false;

    protected class_1585(String string) {
        this.IlIlIIlIlIllIIlIlIIllIIIl = string;
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4, boolean bl) {
        this.IlIllllllIIlIIllllIIlIIIl = n3;
        this.lIlllIlllIIIIlIIlllIllIII = n4;
        this.lllIlIIlIIIlIlIIIllIlllIl = bl;
        float f = (float)((double)0.01f / (double)n);
        float f2 = (float)((double)0.01f / (double)n2);
        this.lIIlIIIIIlIlllIlIIlIlIlll = (float)n3 / (float)((double)n) + f;
        this.lIlIlIIlIIIIlIIIIIlllIIII = (float)(n3 + this.IlIIIIIllllllIIlllIllllll) / (float)((double)n) - f;
        this.IlIIIlIIIIllIIIllIIIIIIll = (float)n4 / (float)n2 + f2;
        this.IIlllIlIlllIllIIIlllIIlIl = (float)(n4 + this.lIllllIIlIIIlIllllllIIIll) / (float)n2 - f2;
        if (this.IlIlIIlllIIlIllIIIlllllIl) {
            float f3 = 8.0f / (float)n;
            float f4 = 8.0f / (float)n2;
            this.lIIlIIIIIlIlllIlIIlIlIlll += f3;
            this.lIlIlIIlIIIIlIIIIIlllIIII -= f3;
            this.IlIIIlIIIIllIIIllIIIIIIll += f4;
            this.IIlllIlIlllIllIIIlllIIlIl -= f4;
        }
        this.IIIllIllIIlIlIlIlIllllIIl = Math.min(this.lIIlIIIIIlIlllIlIIlIlIlll, this.lIlIlIIlIIIIlIIIIIlllIIII);
        this.IllIIIllIIIIlIlIlIllIIlll = Math.min(this.IlIIIlIIIIllIIIllIIIIIIll, this.IIlllIlIlllIllIIIlllIIlIl);
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1585 class_15852) {
        this.IlIllllllIIlIIllllIIlIIIl = class_15852.IlIllllllIIlIIllllIIlIIIl;
        this.lIlllIlllIIIIlIIlllIllIII = class_15852.lIlllIlllIIIIlIIlllIllIII;
        this.IlIIIIIllllllIIlllIllllll = class_15852.IlIIIIIllllllIIlllIllllll;
        this.lIllllIIlIIIlIllllllIIIll = class_15852.lIllllIIlIIIlIllllllIIIll;
        this.lllIlIIlIIIlIlIIIllIlllIl = class_15852.lllIlIIlIIIlIlIIIllIlllIl;
        this.lIIlIIIIIlIlllIlIIlIlIlll = class_15852.lIIlIIIIIlIlllIlIIlIlIlll;
        this.lIlIlIIlIIIIlIIIIIlllIIII = class_15852.lIlIlIIlIIIIlIIIIIlllIIII;
        this.IlIIIlIIIIllIIIllIIIIIIll = class_15852.IlIIIlIIIIllIIIllIIIIIIll;
        this.IIlllIlIlllIllIIIlllIIlIl = class_15852.IIlllIlIlllIllIIIlllIIlIl;
        this.IIIllIllIIlIlIlIlIllllIIl = Math.min(this.lIIlIIIIIlIlllIlIIlIlIlll, this.lIlIlIIlIIIIlIIIIIlllIIII);
        this.IllIIIllIIIIlIlIlIllIIlll = Math.min(this.IlIIIlIIIIllIIIllIIIIIIll, this.IIlllIlIlllIllIIIlllIIlIl);
    }

    public int IllIIlllllllIIlIIlIIIIlIl() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public int IIIllIllIIlIlIlIlIllllIIl() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll() {
        return this.IlIIIIIllllllIIlllIllllll;
    }

    @Override
    public int lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lIllllIIlIIIlIllllllIIIll;
    }

    @Override
    public float IlIllllllIIlIIllllIIlIIIl() {
        return this.lIIlIIIIIlIlllIlIIlIlIlll;
    }

    @Override
    public float lIlllIlllIIIIlIIlllIllIII() {
        return this.lIlIlIIlIIIIlIIIIIlllIIII;
    }

    @Override
    public float lllIIIllIIIIlllIlIIllIIll(double d) {
        float f = this.lIlIlIIlIIIIlIIIIIlllIIII - this.lIIlIIIIIlIlllIlIIlIlIlll;
        return this.lIIlIIIIIlIlllIlIIlIlIlll + f * (float)d / 16.0f;
    }

    @Override
    public float IlIIIIIllllllIIlllIllllll() {
        return this.IlIIIlIIIIllIIIllIIIIIIll;
    }

    @Override
    public float lIllllIIlIIIlIllllllIIIll() {
        return this.IIlllIlIlllIllIIIlllIIlIl;
    }

    @Override
    public float lllIlIIlIIIlIlIIIllIlllIl(double d) {
        float f = this.IIlllIlIlllIllIIIlllIIlIl - this.IlIIIlIIIIllIIIllIIIIIIll;
        return this.IlIIIlIIIIllIIIllIIIIIIll + f * ((float)d / 16.0f);
    }

    @Override
    public String IIIllIIlIIIIIIlIlIIllIIlI() {
        return this.IlIlIIlIlIllIIlIlIIllIIIl;
    }

    public void IllIIIllIIIIlIlIlIllIIlll() {
        ++this.IllIIlllllllIIlIIlIIIIlIl;
        if (this.IllIIlllllllIIlIIlIIIIlIl >= this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(this.IIIllIIlIIIIIIlIlIIllIIlI)) {
            int n = this.lllllIlllIIllIlIIlIIIllII.IlIllllllIIlIIllllIIlIIIl(this.IIIllIIlIIIIIIlIlIIllIIlI);
            int n2 = this.lllllIlllIIllIlIIlIIIllII.IlIllllllIIlIIllllIIlIIIl() == 0 ? this.lllIIIllIIIIlllIlIIllIIll.size() : this.lllllIlllIIllIlIIlIIIllII.IlIllllllIIlIIllllIIlIIIl();
            this.IIIllIIlIIIIIIlIlIIllIIlI = (this.IIIllIIlIIIIIIlIlIIllIIlI + 1) % n2;
            this.IllIIlllllllIIlIIlIIIIlIl = 0;
            int n3 = this.lllllIlllIIllIlIIlIIIllII.IlIllllllIIlIIllllIIlIIIl(this.IIIllIIlIIIIIIlIlIIllIIlI);
            if (n != n3 && n3 >= 0 && n3 < this.lllIIIllIIIIlllIlIIllIIll.size()) {
                class_0231.lllIIIllIIIIlllIlIIllIIll((int[][])this.lllIIIllIIIIlllIlIIllIIll.get(n3), this.IlIIIIIllllllIIlllIllllll, this.lIllllIIlIIIlIllllllIIIll, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, false, false);
                this.llIllllIlIllIIIlIllIIlIlI = n3;
            }
        }
    }

    public int[][] lllIIIllIIIIlllIlIIllIIll(int n) {
        return (int[][])this.lllIIIllIIIIlllIlIIllIIll.get(n);
    }

    public int lIIIIlIlIIlllllIIllIIlIII() {
        return this.lllIIIllIIIIlllIlIIllIIll.size();
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(int n) {
        this.IlIIIIIllllllIIlllIllllll = n;
    }

    public void IlIllllllIIlIIllllIIlIIIl(int n) {
        this.lIllllIIlIIIlIllllllIIIll = n;
    }

    public void lllIIIllIIIIlllIlIIllIIll(BufferedImage[] arrbufferedImage, class_0762 class_07622, boolean bl) {
        int n;
        this.lIlIllIIlIIlIIlIIlIIlIIll();
        this.IlIlIIlllIIlIllIIIlllllIl = bl;
        int n2 = arrbufferedImage[0].getWidth();
        int n3 = arrbufferedImage[0].getHeight();
        this.IlIIIIIllllllIIlllIllllll = n2;
        this.lIllllIIlIIIlIllllllIIIll = n3;
        if (bl) {
            this.IlIIIIIllllllIIlllIllllll += 16;
            this.lIllllIIlIIIlIllllllIIIll += 16;
        }
        int[][] arrarrn = new int[arrbufferedImage.length][];
        for (n = 0; n < arrbufferedImage.length; ++n) {
            BufferedImage bufferedImage = arrbufferedImage[n];
            if (bufferedImage == null) continue;
            if (n > 0 && (bufferedImage.getWidth() != n2 >> n || bufferedImage.getHeight() != n3 >> n)) {
                throw new RuntimeException(String.format("Unable to load miplevel: %d, image is size: %dx%d, expected %dx%d", n, bufferedImage.getWidth(), bufferedImage.getHeight(), n2 >> n, n3 >> n));
            }
            arrarrn[n] = new int[bufferedImage.getWidth() * bufferedImage.getHeight()];
            bufferedImage.getRGB(0, 0, bufferedImage.getWidth(), bufferedImage.getHeight(), arrarrn[n], 0, bufferedImage.getWidth());
        }
        if (class_07622 == null) {
            if (n3 != n2) {
                throw new RuntimeException("broken aspect ratio and not an animation");
            }
            this.lllIIIllIIIIlllIlIIllIIll(arrarrn);
            this.lllIIIllIIIIlllIlIIllIIll.add(this.lllIIIllIIIIlllIlIIllIIll(arrarrn, n2, n3));
        } else {
            n = n3 / n2;
            int n4 = n2;
            int n5 = n2;
            this.lIllllIIlIIIlIllllllIIIll = this.IlIIIIIllllllIIlllIllllll;
            if (class_07622.IlIllllllIIlIIllllIIlIIIl() > 0) {
                Iterator iterator = class_07622.IlIIIIIllllllIIlllIllllll().iterator();
                while (iterator.hasNext()) {
                    int n6 = (Integer)iterator.next();
                    if (n6 >= n) {
                        throw new RuntimeException("invalid frameindex " + n6);
                    }
                    this.lIllllIIlIIIlIllllllIIIll(n6);
                    this.lllIIIllIIIIlllIlIIllIIll.set(n6, this.lllIIIllIIIIlllIlIIllIIll(class_1585.lllIIIllIIIIlllIlIIllIIll(arrarrn, n4, n5, n6), n4, n5));
                }
                this.lllllIlllIIllIlIIlIIIllII = class_07622;
            } else {
                ArrayList arrayList = Lists.newArrayList();
                for (int i = 0; i < n; ++i) {
                    this.lllIIIllIIIIlllIlIIllIIll.add(this.lllIIIllIIIIlllIlIIllIIll(class_1585.lllIIIllIIIIlllIlIIllIIll(arrarrn, n4, n5, i), n4, n5));
                    arrayList.add(new class_1451(i, -1));
                }
                this.lllllIlllIIllIlIIlIIIllII = new class_0762(arrayList, this.IlIIIIIllllllIIlllIllllll, this.lIllllIIlIIIlIllllllIIIll, class_07622.lIlllIlllIIIIlIIlllIllIII());
            }
        }
    }

    public void lIlllIlllIIIIlIIlllIllIII(int n) {
        ArrayList arrayList = Lists.newArrayList();
        for (int i = 0; i < this.lllIIIllIIIIlllIlIIllIIll.size(); ++i) {
            int[][] arrn = (int[][])this.lllIIIllIIIIlllIlIIllIIll.get(i);
            if (arrn == null) continue;
            try {
                arrayList.add(class_0231.lllIIIllIIIIlllIlIIllIIll(n, this.IlIIIIIllllllIIlllIllllll, arrn));
                continue;
            }
            catch (Throwable throwable) {
                CrashReport class_02232 = CrashReport.lllIIIllIIIIlllIlIIllIIll(throwable, "Generating mipmaps for frame");
                class_0799 class_07992 = class_02232.lllIIIllIIIIlllIlIIllIIll("Frame being iterated");
                class_07992.lllIIIllIIIIlllIlIIllIIll("Frame index", i);
                class_07992.addCrashSectionCallable("Frame sizes", new class_0259(this, arrn));
                throw new class_0892(class_02232);
            }
        }
        this.lllIIIllIIIIlllIlIIllIIll(arrayList);
    }

    private void lllIIIllIIIIlllIlIIllIIll(int[][] arrn) {
        int n;
        int[] arrn2 = arrn[0];
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        for (n = 0; n < arrn2.length; ++n) {
            if ((arrn2[n] & 0xFF000000) == 0) continue;
            n3 += arrn2[n] >> 16 & 0xFF;
            n4 += arrn2[n] >> 8 & 0xFF;
            n5 += arrn2[n] >> 0 & 0xFF;
            ++n2;
        }
        if (n2 != 0) {
            n3 /= n2;
            n4 /= n2;
            n5 /= n2;
            for (n = 0; n < arrn2.length; ++n) {
                if ((arrn2[n] & 0xFF000000) != 0) continue;
                arrn2[n] = n3 << 16 | n4 << 8 | n5;
            }
        }
    }

    private int[][] lllIIIllIIIIlllIlIIllIIll(int[][] arrn, int n, int n2) {
        if (!this.IlIlIIlllIIlIllIIIlllllIl) {
            return arrn;
        }
        int[][] arrarrn = new int[arrn.length][];
        for (int i = 0; i < arrn.length; ++i) {
            int[] arrn2 = arrn[i];
            if (arrn2 == null) continue;
            int[] arrn3 = new int[(n + 16 >> i) * (n2 + 16 >> i)];
            System.arraycopy(arrn2, 0, arrn3, 0, arrn2.length);
            arrarrn[i] = class_0231.lllIIIllIIIIlllIlIIllIIll(arrn3, n >> i, n2 >> i, 8 >> i);
        }
        return arrarrn;
    }

    private void lIllllIIlIIIlIllllllIIIll(int n) {
        if (this.lllIIIllIIIIlllIlIIllIIll.size() <= n) {
            for (int i = this.lllIIIllIIIIlllIlIIllIIll.size(); i <= n; ++i) {
                this.lllIIIllIIIIlllIlIIllIIll.add(null);
            }
        }
    }

    private static int[][] lllIIIllIIIIlllIlIIllIIll(int[][] arrn, int n, int n2, int n3) {
        int[][] arrarrn = new int[arrn.length][];
        for (int i = 0; i < arrn.length; ++i) {
            int[] arrn2 = arrn[i];
            if (arrn2 == null) continue;
            arrarrn[i] = new int[(n >> i) * (n2 >> i)];
            System.arraycopy(arrn2, n3 * arrarrn[i].length, arrarrn[i], 0, arrarrn[i].length);
        }
        return arrarrn;
    }

    public void llIIlllIllIllllIIIlIIIIII() {
        this.lllIIIllIIIIlllIlIIllIIll.clear();
    }

    public boolean llIIllIllIlIIlIIllIllllll() {
        return this.lllllIlllIIllIlIIlIIIllII != null;
    }

    public void lllIIIllIIIIlllIlIIllIIll(List list) {
        this.lllIIIllIIIIlllIlIIllIIll = list;
        for (int i = 0; i < this.lllIIIllIIIIlllIlIIllIIll.size(); ++i) {
            int[][] arrn = (int[][])this.lllIIIllIIIIlllIlIIllIIll.get(i);
            if (arrn == null || this.IlIlIIlIlIllIIlIlIIllIIIl.startsWith("leaves_")) continue;
            for (int j = 0; j < arrn.length; ++j) {
                int[] arrn2 = arrn[j];
                if (arrn2 == null) continue;
                this.lllIIIllIIIIlllIlIIllIIll(arrn2);
            }
        }
    }

    private void lIlIllIIlIIlIIlIIlIIlIIll() {
        this.lllllIlllIIllIlIIlIIIllII = null;
        this.lllIIIllIIIIlllIlIIllIIll(Lists.newArrayList());
        this.IIIllIIlIIIIIIlIlIIllIIlI = 0;
        this.IllIIlllllllIIlIIlIIIIlIl = 0;
        this.IlIIIlIIIIllIIIllIIIIIIll();
        this.llIllllIlIllIIIlIllIIlIlI = -1;
        this.lIlllIlllIlIIIIlllIlIlIIl = -1;
        this.lllIIlIIIllllllIIIIlIlIlI = null;
        this.IlIlllIIIIIIlIIllIIllIlll = null;
    }

    public String toString() {
        return "TextureAtlasSprite{name='" + this.IlIlIIlIlIllIIlIlIIllIIIl + '\'' + ", frameCount=" + this.lllIIIllIIIIlllIlIIllIIll.size() + ", rotated=" + this.lllIlIIlIIIlIlIIIllIlllIl + ", x=" + this.IlIllllllIIlIIllllIIlIIIl + ", y=" + this.lIlllIlllIIIIlIIlllIllIII + ", height=" + this.lIllllIIlIIIlIllllllIIIll + ", width=" + this.IlIIIIIllllllIIlllIllllll + ", u0=" + this.lIIlIIIIIlIlllIlIIlIlIlll + ", u1=" + this.lIlIlIIlIIIIlIIIIIlllIIII + ", v0=" + this.IlIIIlIIIIllIIIllIIIIIIll + ", v1=" + this.IIlllIlIlllIllIIIlllIIlIl + '}';
    }

    public int lllIIlIIIllllllIIIIlIlIlI() {
        return this.IlIIIIIllllllIIlllIllllll;
    }

    public int IlIlllIIIIIIlIIllIIllIlll() {
        return this.lIllllIIlIIIlIllllllIIIll;
    }

    public int IlIlIIlIlIllIIlIlIIllIIIl() {
        return this.lIlIllIIlIIlIIlIIlIIlIIll;
    }

    public void IlIIIIIllllllIIlllIllllll(int n) {
        this.lIlIllIIlIIlIIlIIlIIlIIll = n;
    }

    public void lllIIIllIIIIlllIlIIllIIll(boolean bl) {
        this.llIIlIllIllllIlIIIIlIIlll = bl;
        this.IlIlllIIIIIIlIIllIIllIlll = null;
    }

    public void lllllIlllIIllIlIIlIIIllII() {
        this.lllIIIllIIIIlllIlIIllIIll(this.IIIllIIlIIIIIIlIlIIllIIlI, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII);
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
    }

    private void lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, int n3) {
    }

    public void IlIlIIlllIIlIllIIIlllllIl() {
    }

    public void lIIlIIIIIlIlllIlIIlIlIlll() {
        this.IlIlIIlllIIlIllIIIlllllIl();
        this.lllIIIllIIIIlllIlIIllIIll(this.IIIllIIlIIIIIIlIlIIllIIlI, 0, 0);
    }

    public void lIlIlIIlIIIIlIIIIIlllIIII() {
        if (this.llIllllIlIllIIIlIllIIlIlI != this.lIlllIlllIlIIIIlllIlIlIIl) {
            class_0231.lllIlIIlIIIlIlIIIllIlllIl(this.llIIllIllIlIIlIIllIllllll);
            this.lllIIIllIIIIlllIlIIllIIll(this.llIllllIlIllIIIlIllIIlIlI, 0, 0);
            this.lIlllIlllIlIIIIlllIlIlIIl = this.llIllllIlIllIIIlIllIIlIlI;
        }
    }

    public void IlIIIlIIIIllIIIllIIIIIIll() {
        if (this.llIIllIllIlIIlIIllIllllll >= 0) {
            GL11.glDeleteTextures((int)this.llIIllIllIlIIlIIllIllllll);
            this.llIIllIllIlIIlIIllIllllll = -1;
        }
    }

    private void lllIIIllIIIIlllIlIIllIIll(int[] arrn) {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        long l = 0L;
        long l2 = 0L;
        long l3 = 0L;
        long l4 = 0L;
        for (n6 = 0; n6 < arrn.length; ++n6) {
            n5 = arrn[n6];
            n4 = n5 >> 24 & 0xFF;
            if (n4 < 16) continue;
            n3 = n5 >> 16 & 0xFF;
            n2 = n5 >> 8 & 0xFF;
            n = n5 & 0xFF;
            l += (long)n3;
            l2 += (long)n2;
            l3 += (long)n;
            ++l4;
        }
        if (l4 > 0L) {
            n6 = (int)(l / l4);
            n5 = (int)(l2 / l4);
            n4 = (int)(l3 / l4);
            n3 = n6 << 16 | n5 << 8 | n4;
            for (n2 = 0; n2 < arrn.length; ++n2) {
                n = arrn[n2];
                int n7 = n >> 24 & 0xFF;
                if (n7 > 16) continue;
                arrn[n2] = n3;
            }
        }
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_0947 class_09472, ResourceLocation class_17732) {
        return false;
    }

    public boolean lllIlIIlIIIlIlIIIllIlllIl(class_0947 class_09472, ResourceLocation class_17732) {
        return true;
    }

    public boolean IIlllIlIlllIllIIIlllIIlIl() {
        return this.IlIIlllllIIlIlIlllllIllll;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(boolean bl) {
        this.IlIIlllllIIlIlIlllllIllll = bl;
    }
}

