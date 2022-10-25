package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.nio.ByteBuffer;
import java.util.Properties;

import optifine.Config;
import org.lwjgl.opengl.GL11;

public class class_0225 {
    private String lllIIIllIIIIlllIlIIllIIll = null;
    private String lllIlIIlIIIlIlIIIllIlllIl = null;
    private int IlIllllllIIlIIllllIIlIIIl = -1;
    private int lIlllIlllIIIIlIIlllIllIII = 0;
    private int IlIIIIIllllllIIlllIllllll = 0;
    private int lIllllIIlIIIlIllllllIIIll = 0;
    private int IIIllIIlIIIIIIlIlIIllIIlI = 0;
    private class_0508[] IllIIlllllllIIlIIlIIIIlIl = null;
    private int IIIllIllIIlIlIlIlIllllIIl = 0;
    private ByteBuffer IllIIIllIIIIlIlIlIllIIlll = null;

    public class_0225(String string, byte[] arrby, String string2, int n, int n2, int n3, int n4, int n5, Properties properties, int n6) {
        this.lllIIIllIIIIlllIlIIllIIll = string;
        this.lllIlIIlIIIlIlIIIllIlllIl = string2;
        this.IlIllllllIIlIIllllIIlIIIl = n;
        this.lIlllIlllIIIIlIIlllIllIII = n2;
        this.IlIIIIIllllllIIlllIllllll = n3;
        this.lIllllIIlIIIlIllllllIIIll = n4;
        this.IIIllIIlIIIIIIlIlIIllIIlI = n5;
        int n7 = n4 * n5 * 4;
        if (arrby.length % n7 != 0) {
            Config.lllIlIIlIIIlIlIIIllIlllIl("Invalid animated texture length: " + arrby.length + ", frameWidth: " + n5 + ", frameHeight: " + n5);
        }
        this.IllIIIllIIIIlIlIlIllIIlll = class_0994.IlIllllllIIlIIllllIIlIIIl(arrby.length);
        this.IllIIIllIIIIlIlIlIllIIlll.put(arrby);
        int n8 = arrby.length / n7;
        if (properties.get("tile.0") != null) {
            int n9 = 0;
            while (properties.get("tile." + n9) != null) {
                n8 = n9 + 1;
                ++n9;
            }
        }
        String string3 = (String)properties.get("duration");
        int n10 = Config.lllIIIllIIIIlllIlIIllIIll(string3, n6);
        this.IllIIlllllllIIlIIlIIIIlIl = new class_0508[n8];
        for (int i = 0; i < this.IllIIlllllllIIlIIlIIIIlIl.length; ++i) {
            class_0508 class_05082;
            String string4 = (String)properties.get("tile." + i);
            int n11 = Config.lllIIIllIIIIlllIlIIllIIll(string4, i);
            String string5 = (String)properties.get("duration." + i);
            int n12 = Config.lllIIIllIIIIlllIlIIllIIll(string5, n10);
            this.IllIIlllllllIIlIIlIIIIlIl[i] = class_05082 = new class_0508(n11, n12);
        }
    }

    public boolean lllIIIllIIIIlllIlIIllIIll() {
        if (this.IllIIlllllllIIlIIlIIIIlIl.length <= 0) {
            return false;
        }
        if (this.IIIllIllIIlIlIlIlIllllIIl >= this.IllIIlllllllIIlIIlIIIIlIl.length) {
            this.IIIllIllIIlIlIlIlIllllIIl = 0;
        }
        class_0508 class_05082 = this.IllIIlllllllIIlIIlIIIIlIl[this.IIIllIllIIlIlIlIlIllllIIl];
        ++class_05082.IlIllllllIIlIIllllIIlIIIl;
        if (class_05082.IlIllllllIIlIIllllIIlIIIl < class_05082.lllIlIIlIIIlIlIIIllIlllIl) {
            return false;
        }
        class_05082.IlIllllllIIlIIllllIIlIIIl = 0;
        ++this.IIIllIllIIlIlIlIlIllllIIl;
        if (this.IIIllIllIIlIlIlIlIllllIIl >= this.IllIIlllllllIIlIIlIIIIlIl.length) {
            this.IIIllIllIIlIlIlIlIllllIIl = 0;
        }
        return true;
    }

    public int lllIlIIlIIIlIlIIIllIlllIl() {
        if (this.IllIIlllllllIIlIIlIIIIlIl.length <= 0) {
            return 0;
        }
        if (this.IIIllIllIIlIlIlIlIllllIIl >= this.IllIIlllllllIIlIIlIIIIlIl.length) {
            this.IIIllIllIIlIlIlIlIllllIIl = 0;
        }
        class_0508 class_05082 = this.IllIIlllllllIIlIIlIIIIlIl[this.IIIllIllIIlIlIlIlIllllIIl];
        return class_05082.lllIIIllIIIIlllIlIIllIIll;
    }

    public int IlIllllllIIlIIllllIIlIIIl() {
        return this.IllIIlllllllIIlIIlIIIIlIl.length;
    }

    public boolean lIlllIlllIIIIlIIlllIllIII() {
        if (!this.lllIIIllIIIIlllIlIIllIIll()) {
            return false;
        }
        int n = this.lIllllIIlIIIlIllllllIIIll * this.IIIllIIlIIIIIIlIlIIllIIlI * 4;
        int n2 = this.lllIlIIlIIIlIlIIIllIlllIl();
        int n3 = n * n2;
        if (n3 + n > this.IllIIIllIIIIlIlIlIllIIlll.capacity()) {
            return false;
        }
        this.IllIIIllIIIIlIlIlIllIIlll.position(n3);
        GL11.glBindTexture((int)3553, (int)this.IlIllllllIIlIIllllIIlIIIl);
        GL11.glTexSubImage2D((int)3553, (int)0, (int)this.lIlllIlllIIIIlIIlllIllIII, (int)this.IlIIIIIllllllIIlllIllllll, (int)this.lIllllIIlIIIlIllllllIIIll, (int)this.IIIllIIlIIIIIIlIlIIllIIlI, (int)6408, (int)5121, (ByteBuffer)this.IllIIIllIIIIlIlIlIllIIlll);
        return true;
    }

    public String IlIIIIIllllllIIlllIllllll() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public String lIllllIIlIIIlIllllllIIIll() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public int IIIllIIlIIIIIIlIlIIllIIlI() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }
}

