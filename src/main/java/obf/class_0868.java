package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import java.util.PriorityQueue;

import com.moonsworth.lunar.client.LunarClient;
import optifine.Config;
import net.minecraft.client.renderer.OpenGlHelper;
import org.lwjgl.opengl.GL11;

public class class_0868 {
    private ByteBuffer lIIIIlIlIIlllllIIllIIlIII;
    private IntBuffer llIIlllIllIllllIIIlIIIIII;
    private FloatBuffer llIIllIllIlIIlIIllIllllll;
    private ShortBuffer lllIIlIIIllllllIIIIlIlIlI;
    private int[] IlIlllIIIIIIlIIllIIllIlll;
    private int IlIlIIlIlIllIIlIlIIllIIIl;
    private double lllllIlllIIllIlIIlIIIllII;
    private double IlIlIIlllIIlIllIIIlllllIl;
    private int lIIlIIIIIlIlllIlIIlIlIlll;
    private int lIlIlIIlIIIIlIIIIIlllIIII;
    private boolean IlIIIlIIIIllIIIllIIIIIIll;
    private boolean IIlllIlIlllIllIIIlllIIlIl;
    private boolean lIlIllIIlIIlIIlIIlIIlIIll;
    private boolean llIIlIllIllllIlIIIIlIIlll;
    private int llIllllIlIllIIIlIllIIlIlI;
    private int lIlllIlllIlIIIIlllIlIlIIl;
    private boolean IlIIlllllIIlIlIlllllIllll;
    public int lllIIIllIIIIlllIlIIllIIll;
    public double lllIlIIlIIIlIlIIIllIlllIl;
    public double IlIllllllIIlIIllllIIlIIIl;
    public double lIlllIlllIIIIlIIlllIllIII;
    private int llIIlIlIlllIIllIlIlllIllI;
    public static class_0868 IlIIIIIllllllIIlllIllllll = new class_0868(524288);
    public boolean lIllllIIlIIIlIllllllIIIll;
    private int IllIIIIllIIllIllIlllIlIIl;
    private boolean IIIIIIIIlIllIIllIIlllIllI = false;
    private static boolean IIlIIlIlIlIllIIlIlIIIIlll = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN;
    public static boolean IIIllIIlIIIIIIlIlIIllIIlI = false;
    public boolean IllIIlllllllIIlIIlIIIIlIl = true;
    public int IIIllIllIIlIlIlIlIllllIIl = 0;
    public boolean IllIIIllIIIIlIlIlIllIIlll = true;
    private class_0268[] llIIIlllIlllIlIllIIIIllIl = null;
    private boolean[] IIIIlIllIlIIlIIlIllIlIlll = new boolean[256];
    private class_1585[] IlIlIIlllIllllllllIIIlIlI = null;

    public class_0868() {
        this(65536);
        this.IllIIlllllllIIlIIlIIIIlIl = false;
    }

    public class_0868(int n) {
        this.IllIIIIllIIllIllIlllIlIIl = n;
        this.lIIIIlIlIIlllllIIllIIlIII = class_0994.IlIllllllIIlIIllllIIlIIIl(n * 4);
        this.llIIlllIllIllllIIIlIIIIII = this.lIIIIlIlIIlllllIIllIIlIII.asIntBuffer();
        this.llIIllIllIlIIlIIllIllllll = this.lIIIIlIlIIlllllIIllIIlIII.asFloatBuffer();
        this.lllIIlIIIllllllIIIIlIlIlI = this.lIIIIlIlIIlllllIIllIIlIII.asShortBuffer();
        this.IlIlllIIIIIIlIIllIIllIlll = new int[n];
        this.llIIIlllIlllIlIllIIIIllIl = new class_0268[4];
        for (int i = 0; i < this.llIIIlllIlllIlIllIIIIllIl.length; ++i) {
            this.llIIIlllIlllIlIllIIIIllIl[i] = new class_0268();
        }
    }

    public int lllIIIllIIIIlllIlIIllIIll() {
        if (!this.lIllllIIlIIIlIllllllIIIll) {
            throw new IllegalStateException("Not tesselating!");
        }
        this.lIllllIIlIIIlIllllllIIIll = false;
        if (!(this.IlIlIIlIlIllIIlIlIIllIIIl <= 0 || this.IIIIIIIIlIllIIllIIlllIllI && Config.lIlIlIIllIIIlllIllIIlIllI())) {
            this.llIIlllIllIllllIIIlIIIIII.clear();
            this.llIIlllIllIllllIIIlIIIIII.put(this.IlIlllIIIIIIlIIllIIllIlll, 0, this.llIllllIlIllIIIlIllIIlIlI);
            this.lIIIIlIlIIlllllIIllIIlIII.position(0);
            this.lIIIIlIlIIlllllIIllIIlIII.limit(this.llIllllIlIllIIIlIllIIlIlI * 4);
            if (this.IIlllIlIlllIllIIIlllIIlIl) {
                this.llIIllIllIlIIlIIllIllllll.position(3);
                GL11.glTexCoordPointer((int)2, (int)32, (FloatBuffer)this.llIIllIllIlIIlIIllIllllll);
                GL11.glEnableClientState((int)32888);
            }
            if (this.lIlIllIIlIIlIIlIIlIIlIIll) {
                OpenGlHelper.lIIIIlIlIIlllllIIllIIlIII(OpenGlHelper.IlIllllllIIlIIllllIIlIIIl);
                this.lllIIlIIIllllllIIIIlIlIlI.position(14);
                GL11.glTexCoordPointer((int)2, (int)32, (ShortBuffer)this.lllIIlIIIllllllIIIIlIlIlI);
                GL11.glEnableClientState((int)32888);
                OpenGlHelper.lIIIIlIlIIlllllIIllIIlIII(OpenGlHelper.lllIlIIlIIIlIlIIIllIlllIl);
            }
            if (this.IlIIIlIIIIllIIIllIIIIIIll) {
                this.lIIIIlIlIIlllllIIllIIlIII.position(20);
                GL11.glColorPointer((int)4, (boolean)true, (int)32, (ByteBuffer)this.lIIIIlIlIIlllllIIllIIlIII);
                GL11.glEnableClientState((int)32886);
            }
            if (this.llIIlIllIllllIlIIIIlIIlll) {
                this.lIIIIlIlIIlllllIIllIIlIII.position(24);
                GL11.glNormalPointer((int)32, (ByteBuffer)this.lIIIIlIlIIlllllIIllIIlIII);
                GL11.glEnableClientState((int)32885);
            }
            this.llIIllIllIlIIlIIllIllllll.position(0);
            GL11.glVertexPointer((int)3, (int)32, (FloatBuffer)this.llIIllIllIlIIlIIllIllllll);
            GL11.glEnableClientState((int)32884);
            GL11.glDrawArrays((int)this.lllIIIllIIIIlllIlIIllIIll, (int)0, (int)this.IlIlIIlIlIllIIlIlIIllIIIl);
            GL11.glDisableClientState((int)32884);
            if (this.IIlllIlIlllIllIIIlllIIlIl) {
                GL11.glDisableClientState((int)32888);
            }
            if (this.lIlIllIIlIIlIIlIIlIIlIIll) {
                OpenGlHelper.lIIIIlIlIIlllllIIllIIlIII(OpenGlHelper.IlIllllllIIlIIllllIIlIIIl);
                GL11.glDisableClientState((int)32888);
                OpenGlHelper.lIIIIlIlIIlllllIIllIIlIII(OpenGlHelper.lllIlIIlIIIlIlIIIllIlllIl);
            }
            if (this.IlIIIlIIIIllIIIllIIIIIIll) {
                GL11.glDisableClientState((int)32886);
            }
            if (this.llIIlIllIllllIlIIIIlIIlll) {
                GL11.glDisableClientState((int)32885);
            }
        }
        int n = this.llIllllIlIllIIIlIllIIlIlI * 4;
        this.IlIIIIIllllllIIlllIllllll();
        return n;
    }

    public class_1565 lllIIIllIIIIlllIlIIllIIll(float f, float f2, float f3) {
        int n;
        if (this.llIllllIlIllIIIlIllIIlIlI < 1) {
            return null;
        }
        int[] arrn = new int[this.llIllllIlIllIIIlIllIIlIlI];
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>(this.llIllllIlIllIIIlIllIIlIlI, new class_0536(this.IlIlllIIIIIIlIIllIIllIlll, f + (float)this.lllIlIIlIIIlIlIIIllIlllIl, f2 + (float)this.IlIllllllIIlIIllllIIlIIIl, f3 + (float)this.lIlllIlllIIIIlIIlllIllIII));
        int n2 = 32;
        for (n = 0; n < this.llIllllIlIllIIIlIllIIlIlI; n += n2) {
            priorityQueue.add(n);
        }
        n = 0;
        while (!priorityQueue.isEmpty()) {
            int n3 = (Integer)priorityQueue.remove();
            for (int i = 0; i < n2; ++i) {
                arrn[n + i] = this.IlIlllIIIIIIlIIllIIllIlll[n3 + i];
            }
            n += n2;
        }
        System.arraycopy(arrn, 0, this.IlIlllIIIIIIlIIllIIllIlll, 0, arrn.length);
        return new class_1565(arrn, this.llIllllIlIllIIIlIllIIlIlI, this.IlIlIIlIlIllIIlIlIIllIIIl, this.IIlllIlIlllIllIIIlllIIlIl, this.lIlIllIIlIIlIIlIIlIIlIIll, this.llIIlIllIllllIlIIIIlIIlll, this.IlIIIlIIIIllIIIllIIIIIIll);
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1565 class_15652) {
        System.arraycopy(class_15652.lllIIIllIIIIlllIlIIllIIll(), 0, this.IlIlllIIIIIIlIIllIIllIlll, 0, class_15652.lllIIIllIIIIlllIlIIllIIll().length);
        this.llIllllIlIllIIIlIllIIlIlI = class_15652.lllIlIIlIIIlIlIIIllIlllIl();
        this.IlIlIIlIlIllIIlIlIIllIIIl = class_15652.IlIllllllIIlIIllllIIlIIIl();
        this.IIlllIlIlllIllIIIlllIIlIl = class_15652.lIlllIlllIIIIlIIlllIllIII();
        this.lIlIllIIlIIlIIlIIlIIlIIll = class_15652.IlIIIIIllllllIIlllIllllll();
        this.IlIIIlIIIIllIIIllIIIIIIll = class_15652.IIIllIIlIIIIIIlIlIIllIIlI();
        this.llIIlIllIllllIlIIIIlIIlll = class_15652.lIllllIIlIIIlIllllllIIIll();
    }

    private void IlIIIIIllllllIIlllIllllll() {
        this.IlIlIIlIlIllIIlIlIIllIIIl = 0;
        this.lIIIIlIlIIlllllIIllIIlIII.clear();
        this.llIllllIlIllIIIlIllIIlIlI = 0;
        this.lIlllIlllIlIIIIlllIlIlIIl = 0;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl() {
        this.lllIIIllIIIIlllIlIIllIIll(7);
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n) {
        if (this.lIllllIIlIIIlIllllllIIIll) {
            throw new IllegalStateException("Already tesselating!");
        }
        this.lIllllIIlIIIlIllllllIIIll = true;
        this.IlIIIIIllllllIIlllIllllll();
        this.lllIIIllIIIIlllIlIIllIIll = n;
        this.llIIlIllIllllIlIIIIlIIlll = false;
        this.IlIIIlIIIIllIIIllIIIIIIll = false;
        this.IIlllIlIlllIllIIIlllIIlIl = false;
        this.lIlIllIIlIIlIIlIIlIIlIIll = false;
        this.IlIIlllllIIlIlIlllllIllll = false;
    }

    public void lllIIIllIIIIlllIlIIllIIll(double d, double d2) {
        this.IIlllIlIlllIllIIIlllIIlIl = true;
        this.lllllIlllIIllIlIIlIIIllII = d;
        this.IlIlIIlllIIlIllIIIlllllIl = d2;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(int n) {
        this.lIlIllIIlIIlIIlIIlIIlIIll = true;
        this.lIIlIIIIIlIlllIlIIlIlIlll = n;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(float f, float f2, float f3) {
        this.lllIIIllIIIIlllIlIIllIIll((int)(f * 255.0f), (int)(f2 * 255.0f), (int)(f3 * 255.0f));
    }

    public void lllIIIllIIIIlllIlIIllIIll(float f, float f2, float f3, float f4) {
        this.lllIIIllIIIIlllIlIIllIIll((int)(f * 255.0f), (int)(f2 * 255.0f), (int)(f3 * 255.0f), (int)(f4 * 255.0f));
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        this.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, LunarClient.getInstance() != null && LunarClient.getInstance().getModuleManager() != null && LunarClient.getInstance().getModuleManager().lllllIlllIIllIlIIlIIIllII.lIllllIIlIIIlIllllllIIIll() ? (Integer) LunarClient.getInstance().getModuleManager().lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII() : 255);
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4) {
        if (!this.IlIIlllllIIlIlIlllllIllll) {
            if (n > 255) {
                n = 255;
            }
            if (n2 > 255) {
                n2 = 255;
            }
            if (n3 > 255) {
                n3 = 255;
            }
            if (n4 > 255) {
                n4 = 255;
            }
            if (n < 0) {
                n = 0;
            }
            if (n2 < 0) {
                n2 = 0;
            }
            if (n3 < 0) {
                n3 = 0;
            }
            if (n4 < 0) {
                n4 = 0;
            }
            this.IlIIIlIIIIllIIIllIIIIIIll = true;
            this.lIlIlIIlIIIIlIIIIIlllIIII = IIlIIlIlIlIllIIlIlIIIIlll ? n4 << 24 | n3 << 16 | n2 << 8 | n : n << 24 | n2 << 16 | n3 << 8 | n4;
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(byte by, byte by2, byte by3) {
        this.lllIIIllIIIIlllIlIIllIIll(by & 0xFF, by2 & 0xFF, by3 & 0xFF);
    }

    public void lllIIIllIIIIlllIlIIllIIll(double d, double d2, double d3, double d4, double d5) {
        this.lllIIIllIIIIlllIlIIllIIll(d4, d5);
        this.lllIIIllIIIIlllIlIIllIIll(d, d2, d3);
    }

    public void lllIIIllIIIIlllIlIIllIIll(double d, double d2, double d3) {
        if (this.IllIIIllIIIIlIlIlIllIIlll && this.llIllllIlIllIIIlIllIIlIlI >= this.IllIIIIllIIllIllIlllIlIIl - 32) {
            Config.lllIIIllIIIIlllIlIIllIIll("Expand tessellator buffer, old: " + this.IllIIIIllIIllIllIlllIlIIl + ", new: " + this.IllIIIIllIIllIllIlllIlIIl * 2);
            this.IllIIIIllIIllIllIlllIlIIl *= 2;
            int[] arrn = new int[this.IllIIIIllIIllIllIlllIlIIl];
            System.arraycopy(this.IlIlllIIIIIIlIIllIIllIlll, 0, arrn, 0, this.IlIlllIIIIIIlIIllIIllIlll.length);
            this.IlIlllIIIIIIlIIllIIllIlll = arrn;
            this.lIIIIlIlIIlllllIIllIIlIII = class_0994.IlIllllllIIlIIllllIIlIIIl(this.IllIIIIllIIllIllIlllIlIIl * 4);
            this.llIIlllIllIllllIIIlIIIIII = this.lIIIIlIlIIlllllIIllIIlIII.asIntBuffer();
            this.llIIllIllIlIIlIIllIllllll = this.lIIIIlIlIIlllllIIllIIlIII.asFloatBuffer();
            this.lllIIlIIIllllllIIIIlIlIlI = this.lIIIIlIlIIlllllIIllIIlIII.asShortBuffer();
            if (this.IlIlIIlllIllllllllIIIlIlI != null) {
                class_1585[] arrclass_1585 = new class_1585[this.IllIIIIllIIllIllIlllIlIIl / 4];
                System.arraycopy(this.IlIlIIlllIllllllllIIIlIlI, 0, arrclass_1585, 0, this.IlIlIIlllIllllllllIIIlIlI.length);
                this.IlIlIIlllIllllllllIIIlIlI = arrclass_1585;
            }
        }
        ++this.lIlllIlllIlIIIIlllIlIlIIl;
        if (this.IIlllIlIlllIllIIIlllIIlIl) {
            this.IlIlllIIIIIIlIIllIIllIlll[this.llIllllIlIllIIIlIllIIlIlI + 3] = Float.floatToRawIntBits((float)this.lllllIlllIIllIlIIlIIIllII);
            this.IlIlllIIIIIIlIIllIIllIlll[this.llIllllIlIllIIIlIllIIlIlI + 4] = Float.floatToRawIntBits((float)this.IlIlIIlllIIlIllIIIlllllIl);
        }
        if (this.lIlIllIIlIIlIIlIIlIIlIIll) {
            this.IlIlllIIIIIIlIIllIIllIlll[this.llIllllIlIllIIIlIllIIlIlI + 7] = this.lIIlIIIIIlIlllIlIIlIlIlll;
        }
        if (this.IlIIIlIIIIllIIIllIIIIIIll) {
            this.IlIlllIIIIIIlIIllIIllIlll[this.llIllllIlIllIIIlIllIIlIlI + 5] = this.lIlIlIIlIIIIlIIIIIlllIIII;
        }
        if (this.llIIlIllIllllIlIIIIlIIlll) {
            this.IlIlllIIIIIIlIIllIIllIlll[this.llIllllIlIllIIIlIllIIlIlI + 6] = this.llIIlIlIlllIIllIlIlllIllI;
        }
        this.IlIlllIIIIIIlIIllIIllIlll[this.llIllllIlIllIIIlIllIIlIlI + 0] = Float.floatToRawIntBits((float)(d + this.lllIlIIlIIIlIlIIIllIlllIl));
        this.IlIlllIIIIIIlIIllIIllIlll[this.llIllllIlIllIIIlIllIIlIlI + 1] = Float.floatToRawIntBits((float)(d2 + this.IlIllllllIIlIIllllIIlIIIl));
        this.IlIlllIIIIIIlIIllIIllIlll[this.llIllllIlIllIIIlIllIIlIlI + 2] = Float.floatToRawIntBits((float)(d3 + this.lIlllIlllIIIIlIIlllIllIII));
        this.llIllllIlIllIIIlIllIIlIlI += 8;
        ++this.IlIlIIlIlIllIIlIlIIllIIIl;
        if (!this.IllIIIllIIIIlIlIlIllIIlll && this.lIlllIlllIlIIIIlllIlIlIIl % 4 == 0 && this.llIllllIlIllIIIlIllIIlIlI >= this.IllIIIIllIIllIllIlllIlIIl - 32) {
            this.lllIIIllIIIIlllIlIIllIIll();
            this.lIllllIIlIIIlIllllllIIIll = true;
        }
    }

    public void IlIllllllIIlIIllllIIlIIIl(int n) {
        int n2 = n >> 16 & 0xFF;
        int n3 = n >> 8 & 0xFF;
        int n4 = n & 0xFF;
        this.lllIIIllIIIIlllIlIIllIIll(n2, n3, n4);
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        int n3 = n >> 16 & 0xFF;
        int n4 = n >> 8 & 0xFF;
        int n5 = n & 0xFF;
        this.lllIIIllIIIIlllIlIIllIIll(n3, n4, n5, n2);
    }

    public void IlIllllllIIlIIllllIIlIIIl() {
        this.IlIIlllllIIlIlIlllllIllll = true;
    }

    public void IlIllllllIIlIIllllIIlIIIl(float f, float f2, float f3) {
        this.llIIlIllIllllIlIIIIlIIlll = true;
        byte by = (byte)(f * 127.0f);
        byte by2 = (byte)(f2 * 127.0f);
        byte by3 = (byte)(f3 * 127.0f);
        this.llIIlIlIlllIIllIlIlllIllI = by & 0xFF | (by2 & 0xFF) << 8 | (by3 & 0xFF) << 16;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(double d, double d2, double d3) {
        this.lllIlIIlIIIlIlIIIllIlllIl = d;
        this.IlIllllllIIlIIllllIIlIIIl = d2;
        this.lIlllIlllIIIIlIIlllIllIII = d3;
    }

    public void lIlllIlllIIIIlIIlllIllIII(float f, float f2, float f3) {
        this.lllIlIIlIIIlIlIIIllIlllIl += (double)f;
        this.IlIllllllIIlIIllllIIlIIIl += (double)f2;
        this.lIlllIlllIIIIlIIlllIllIII += (double)f3;
    }

    public boolean lIlllIlllIIIIlIIlllIllIII() {
        return this.IIIIIIIIlIllIIllIIlllIllI;
    }

    public void lllIIIllIIIIlllIlIIllIIll(boolean bl) {
        this.IIIIIIIIlIllIIllIIlllIllI = bl;
    }

    private void lllIlIIlIIIlIlIIIllIlllIl(int n, int n2) {
        int n3 = n2 - n;
        if (n3 > 0) {
            int n4 = n * 4;
            int n5 = n3 * 4;
            this.llIIllIllIlIIlIIllIllllll.position(3);
            GL11.glTexCoordPointer((int)2, (int)32, (FloatBuffer)this.llIIllIllIlIIlIIllIllllll);
            OpenGlHelper.lIIIIlIlIIlllllIIllIIlIII(OpenGlHelper.IlIllllllIIlIIllllIIlIIIl);
            this.lllIIlIIIllllllIIIIlIlIlI.position(14);
            GL11.glTexCoordPointer((int)2, (int)32, (ShortBuffer)this.lllIIlIIIllllllIIIIlIlIlI);
            GL11.glEnableClientState((int)32888);
            OpenGlHelper.lIIIIlIlIIlllllIIllIIlIII(OpenGlHelper.lllIlIIlIIIlIlIIIllIlllIl);
            this.lIIIIlIlIIlllllIIllIIlIII.position(20);
            GL11.glColorPointer((int)4, (boolean)true, (int)32, (ByteBuffer)this.lIIIIlIlIIlllllIIllIIlIII);
            this.llIIllIllIlIIlIIllIllllll.position(0);
            GL11.glVertexPointer((int)3, (int)32, (FloatBuffer)this.llIIllIllIlIIlIIllIllllll);
            GL11.glDrawArrays((int)this.lllIIIllIIIIlllIlIIllIIll, (int)n4, (int)n5);
        }
    }

    private int lllIIIllIIIIlllIlIIllIIll(class_1585 class_15852, int n) {
        class_15852.IlIlIIlllIIlIllIIIlllllIl();
        int n2 = -1;
        int n3 = -1;
        int n4 = this.lIlllIlllIlIIIIlllIlIlIIl / 4;
        for (int i = n; i < n4; ++i) {
            class_1585 class_15853 = this.IlIlIIlllIllllllllIIIlIlI[i];
            if (class_15853 == class_15852) {
                if (n3 >= 0) continue;
                n3 = i;
                continue;
            }
            if (n3 < 0) continue;
            this.lllIlIIlIIIlIlIIIllIlllIl(n3, i);
            n3 = -1;
            if (n2 >= 0) continue;
            n2 = i;
        }
        if (n3 >= 0) {
            this.lllIlIIlIIIlIlIIIllIlllIl(n3, n4);
        }
        if (n2 < 0) {
            n2 = n4;
        }
        return n2;
    }
}

