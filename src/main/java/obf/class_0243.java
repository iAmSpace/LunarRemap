package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.lwjgl.opengl.GL11;

public class class_0243
extends BufferedImage {
    private ByteBuffer IlIllllllIIlIIllllIIlIIIl;
    public byte[] lllIIIllIIIIlllIlIIllIIll;
    public int lllIlIIlIIIlIlIIIllIlllIl = 0;
    private Object lIlllIlllIIIIlIIlllIllIII = new Object();

    public class_0243(int n, int n2, int n3) {
        super(n, n2, n3);
        this.lllIIIllIIIIlllIlIIllIIll = ((DataBufferByte)this.getRaster().getDataBuffer()).getData();
        this.IlIllllllIIlIIllllIIlIIIl = ByteBuffer.allocateDirect(this.lllIIIllIIIIlllIlIIllIIll.length).order(ByteOrder.nativeOrder());
    }

    public void lllIIIllIIIIlllIlIIllIIll() {
        if (this.lllIlIIlIIIlIlIIIllIlllIl != 0) {
            GL11.glDeleteTextures((int)this.lllIlIIlIIIlIlIIIllIlllIl);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void lllIlIIlIIIlIlIIIllIlllIl() {
        if (this.lllIlIIlIIIlIlIIIllIlllIl != 0) {
            GL11.glDeleteTextures((int)this.lllIlIIlIIIlIlIIIllIlllIl);
        } else {
            this.lllIlIIlIIIlIlIIIllIlllIl = GL11.glGenTextures();
        }
        this.IlIllllllIIlIIllllIIlIIIl.clear();
        Object object = this.lIlllIlllIIIIlIIlllIllIII;
        synchronized (object) {
            this.IlIllllllIIlIIllllIIlIIIl.put(this.lllIIIllIIIIlllIlIIllIIll);
        }
        this.IlIllllllIIlIIllllIIlIIIl.position(0).limit(this.lllIIIllIIIIlllIlIIllIIll.length);
        if (!class_2210.IlIIIIIllllllIIlllIllllll && !class_2210.IlIllllllIIlIIllllIIlIIIl) {
            if (class_1835.lIlIlIIIIIIlIIllllIlIIllI.IlIlIIlIlIllIIlIlIIllIIIl) {
                for (int i = 0; i < this.getWidth(); ++i) {
                    this.IlIllllllIIlIIllllIIlIIIl.put(i * 4 + 3, (byte)0);
                    this.IlIllllllIIlIIllllIIlIIIl.put(i * this.getWidth() * 4 + 3, (byte)0);
                }
            }
            if (class_1835.lIlIlIIIIIIlIIllllIlIIllI.IlIlIIlIlIllIIlIlIIllIIIl && (class_1835.lIlIlIIIIIIlIIllllIlIIllI.lIlIllIIlIIlIIlIIlIIlIIll > 0 || class_0184.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII().lllIIIllIIIIlllIlIIllIIll() > 1.0f)) {
                for (int i = 0; i < this.getWidth(); ++i) {
                    this.IlIllllllIIlIIllllIIlIIIl.put(i * this.getWidth() * 4 + 7, (byte)0);
                }
            }
            if (class_1835.lIlIlIIIIIIlIIllllIlIIllI.IlIlIIlIlIllIIlIlIIllIIIl && (class_1835.lIlIlIIIIIIlIIllllIlIIllI.lIlIllIIlIIlIIlIIlIIlIIll > 0 || class_0184.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII().lllIlIIlIIIlIlIIIllIlllIl() > 1.0f)) {
                for (int i = 0; i < this.getWidth(); ++i) {
                    this.IlIllllllIIlIIllllIIlIIIl.put(i * 4 + 3 + this.getWidth() * 4, (byte)0);
                }
            }
        }
        GL11.glBindTexture((int)3553, (int)this.lllIlIIlIIIlIlIIIllIlllIl);
        GL11.glTexParameteri((int)3553, (int)10241, (int)9728);
        GL11.glTexParameteri((int)3553, (int)10240, (int)9728);
        GL11.glTexParameteri((int)3553, (int)10242, (int)33071);
        GL11.glTexParameteri((int)3553, (int)10243, (int)33071);
        GL11.glTexImage2D((int)3553, (int)0, (int)6408, (int)this.getWidth(), (int)this.getHeight(), (int)0, (int)32993, (int)5121, (ByteBuffer)this.IlIllllllIIlIIllllIIlIIIl);
    }

    public void IlIllllllIIlIIllllIIlIIIl() {
        for (int i = 0; i < this.lllIIIllIIIIlllIlIIllIIll.length; ++i) {
            this.lllIIIllIIIIlllIlIIllIIll[i] = 0;
        }
        this.lllIlIIlIIIlIlIIIllIlllIl();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void setRGB(int n, int n2, int n3) {
        int n4 = (n + n2 * this.getWidth()) * 4;
        Object object = this.lIlllIlllIIIIlIIlllIllIII;
        synchronized (object) {
            int n5 = n3 >> 24 & 0xFF;
            this.lllIIIllIIIIlllIlIIllIIll[n4] = (byte)((n3 >> 0 & 0xFF) * n5 / 255);
            this.lllIIIllIIIIlllIlIIllIIll[n4 + 1] = (byte)((n3 >> 8 & 0xFF) * n5 / 255);
            this.lllIIIllIIIIlllIlIIllIIll[n4 + 2] = (byte)((n3 >> 16 & 0xFF) * n5 / 255);
            this.lllIIIllIIIIlllIlIIllIIll[n4 + 3] = -1;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void lllIIIllIIIIlllIlIIllIIll(int n) {
        Object object = this.lIlllIlllIIIIlIIlllIllIII;
        synchronized (object) {
            if (n > 0) {
                System.arraycopy(this.lllIIIllIIIIlllIlIIllIIll, n * 4, this.lllIIIllIIIIlllIlIIllIIll, 0, this.lllIIIllIIIIlllIlIIllIIll.length - n * 4);
            } else if (n < 0) {
                System.arraycopy(this.lllIIIllIIIIlllIlIIllIIll, 0, this.lllIIIllIIIIlllIlIIllIIll, -n * 4, this.lllIIIllIIIIlllIlIIllIIll.length + n * 4);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void lllIlIIlIIIlIlIIIllIlllIl(int n) {
        Object object = this.lIlllIlllIIIIlIIlllIllIII;
        synchronized (object) {
            if (n > 0) {
                System.arraycopy(this.lllIIIllIIIIlllIlIIllIIll, n * this.getWidth() * 4, this.lllIIIllIIIIlllIlIIllIIll, 0, this.lllIIIllIIIIlllIlIIllIIll.length - n * this.getWidth() * 4);
            } else if (n < 0) {
                System.arraycopy(this.lllIIIllIIIIlllIlIIllIIll, 0, this.lllIIIllIIIIlllIlIIllIIll, -n * this.getWidth() * 4, this.lllIIIllIIIIlllIlIIllIIll.length + n * this.getWidth() * 4);
            }
        }
    }
}

