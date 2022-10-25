package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;

public class class_1193
implements class_0702 {
    private int[] lllIIIllIIIIlllIlIIllIIll;
    private int lllIlIIlIIIlIlIIIllIlllIl;
    private int IlIllllllIIlIIllllIIlIIIl;

    @Override
    public BufferedImage lllIIIllIIIIlllIlIIllIIll(BufferedImage bufferedImage) {
        if (bufferedImage == null) {
            return null;
        }
        this.lllIlIIlIIIlIlIIIllIlllIl = 64;
        this.IlIllllllIIlIIllllIIlIIIl = 32;
        int n = bufferedImage.getWidth();
        int n2 = bufferedImage.getHeight();
        if (n != 64 || n2 != 32 && n2 != 64) {
            while (this.lllIlIIlIIIlIlIIIllIlllIl < n || this.IlIllllllIIlIIllllIIlIIIl < n2) {
                this.lllIlIIlIIIlIlIIIllIlllIl *= 2;
                this.IlIllllllIIlIIllllIIlIIIl *= 2;
            }
        }
        BufferedImage bufferedImage2 = new BufferedImage(this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, 2);
        Graphics graphics = bufferedImage2.getGraphics();
        graphics.drawImage(bufferedImage, 0, 0, null);
        graphics.dispose();
        this.lllIIIllIIIIlllIlIIllIIll = ((DataBufferInt)bufferedImage2.getRaster().getDataBuffer()).getData();
        int n3 = this.lllIlIIlIIIlIlIIIllIlllIl;
        int n4 = this.IlIllllllIIlIIllllIIlIIIl;
        this.lllIlIIlIIIlIlIIIllIlllIl(0, 0, n3 / 2, n4 / 2);
        this.lllIIIllIIIIlllIlIIllIIll(n3 / 2, 0, n3, n4);
        this.lllIlIIlIIIlIlIIIllIlllIl(0, n4 / 2, n3, n4);
        return bufferedImage2;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll() {
    }

    private void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4) {
        if (!this.IlIllllllIIlIIllllIIlIIIl(n, n2, n3, n4)) {
            for (int i = n; i < n3; ++i) {
                for (int j = n2; j < n4; ++j) {
                    int n5 = i + j * this.lllIlIIlIIIlIlIIIllIlllIl;
                    this.lllIIIllIIIIlllIlIIllIIll[n5] = this.lllIIIllIIIIlllIlIIllIIll[n5] & 0xFFFFFF;
                }
            }
        }
    }

    private void lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, int n3, int n4) {
        for (int i = n; i < n3; ++i) {
            for (int j = n2; j < n4; ++j) {
                int n5 = i + j * this.lllIlIIlIIIlIlIIIllIlllIl;
                this.lllIIIllIIIIlllIlIIllIIll[n5] = this.lllIIIllIIIIlllIlIIllIIll[n5] | 0xFF000000;
            }
        }
    }

    private boolean IlIllllllIIlIIllllIIlIIIl(int n, int n2, int n3, int n4) {
        for (int i = n; i < n3; ++i) {
            for (int j = n2; j < n4; ++j) {
                int n5 = this.lllIIIllIIIIlllIlIIllIIll[i + j * this.lllIlIIlIIIlIlIIIllIlllIl];
                if ((n5 >> 24 & 0xFF) >= 128) continue;
                return true;
            }
        }
        return false;
    }
}

