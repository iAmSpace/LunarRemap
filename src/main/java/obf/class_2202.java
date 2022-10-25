package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.awt.image.BufferedImage;

public class class_2202
extends class_1380 {
    private final int[] lllIIIllIIIIlllIlIIllIIll;
    private final int lllIlIIlIIIlIlIIIllIlllIl;
    private final int IlIllllllIIlIIllllIIlIIIl;

    public class_2202(BufferedImage bufferedImage) {
        this(bufferedImage.getWidth(), bufferedImage.getHeight());
        bufferedImage.getRGB(0, 0, bufferedImage.getWidth(), bufferedImage.getHeight(), this.lllIIIllIIIIlllIlIIllIIll, 0, bufferedImage.getWidth());
        this.lllIlIIlIIIlIlIIIllIlllIl();
    }

    public class_2202(int n, int n2) {
        this.lllIlIIlIIIlIlIIIllIlllIl = n;
        this.IlIllllllIIlIIllllIIlIIIl = n2;
        this.lllIIIllIIIIlllIlIIllIIll = new int[n * n2];
        class_0231.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll(), n, n2);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0947 class_09472) {
    }

    public void lllIlIIlIIIlIlIIIllIlllIl() {
        class_0231.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll(), this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl);
    }

    public int[] lIlllIlllIIIIlIIlllIllIII() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }
}

