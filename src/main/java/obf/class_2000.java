package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.nio.IntBuffer;
import org.lwjgl.opengl.GL11;

public class class_2000 {
    public int lllIIIllIIIIlllIlIIllIIll;
    public int lllIlIIlIIIlIlIIIllIlllIl;
    public int IlIllllllIIlIIllllIIlIIIl;
    private double lIlllIlllIIIIlIIlllIllIII;
    private double IlIIIIIllllllIIlllIllllll;
    private double lIllllIIlIIIlIllllllIIIll;
    private IntBuffer IIIllIIlIIIIIIlIlIIllIIlI = class_0994.lIlllIlllIIIIlIIlllIllIII(65536);
    private boolean IllIIlllllllIIlIIlIIIIlIl;
    private boolean IIIllIllIIlIlIlIlIllllIIl;

    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, double d, double d2, double d3) {
        this.IllIIlllllllIIlIIlIIIIlIl = true;
        this.IIIllIIlIIIIIIlIlIIllIIlI.clear();
        this.lllIIIllIIIIlllIlIIllIIll = n;
        this.lllIlIIlIIIlIlIIIllIlllIl = n2;
        this.IlIllllllIIlIIllllIIlIIIl = n3;
        this.lIlllIlllIIIIlIIlllIllIII = d;
        this.IlIIIIIllllllIIlllIllllll = d2;
        this.lIllllIIlIIIlIllllllIIIll = d3;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        return !this.IllIIlllllllIIlIIlIIIIlIl ? false : n == this.lllIIIllIIIIlllIlIIllIIll && n2 == this.lllIlIIlIIIlIlIIIllIlllIl && n3 == this.IlIllllllIIlIIllllIIlIIIl;
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n) {
        this.IIIllIIlIIIIIIlIlIIllIIlI.put(n);
        if (this.IIIllIIlIIIIIIlIlIIllIIlI.remaining() == 0) {
            this.lllIIIllIIIIlllIlIIllIIll();
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll() {
        if (this.IllIIlllllllIIlIIlIIIIlIl) {
            if (!this.IIIllIllIIlIlIlIlIllllIIl) {
                this.IIIllIIlIIIIIIlIlIIllIIlI.flip();
                this.IIIllIllIIlIlIlIlIllllIIl = true;
            }
            if (this.IIIllIIlIIIIIIlIlIIllIIlI.remaining() > 0) {
                GL11.glPushMatrix();
                GL11.glTranslatef((float)((float)((double)this.lllIIIllIIIIlllIlIIllIIll - this.lIlllIlllIIIIlIIlllIllIII)), (float)((float)((double)this.lllIlIIlIIIlIlIIIllIlllIl - this.IlIIIIIllllllIIlllIllllll)), (float)((float)((double)this.IlIllllllIIlIIllllIIlIIIl - this.lIllllIIlIIIlIllllllIIIll)));
                GL11.glCallLists((IntBuffer)this.IIIllIIlIIIIIIlIlIIllIIlI);
                GL11.glPopMatrix();
            }
        }
    }

    public void lllIlIIlIIIlIlIIIllIlllIl() {
        this.IllIIlllllllIIlIIlIIIIlIl = false;
        this.IIIllIllIIlIlIlIlIllllIIl = false;
    }
}

