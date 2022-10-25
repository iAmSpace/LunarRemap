package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.awt.image.BufferedImage;

public class class_2134 {
    public static boolean lllIIIllIIIIlllIlIIllIIll(BufferedImage bufferedImage) {
        int n = bufferedImage.getWidth();
        int n2 = bufferedImage.getHeight();
        int[] arrn = bufferedImage.getRGB(0, 0, n, n2, null, 0, n);
        for (int i = arrn.length - 1; i >= 0; --i) {
            if ((arrn[i] & 0xFF000000) == -16777216) continue;
            return true;
        }
        return false;
    }

    public static boolean lllIIIllIIIIlllIlIIllIIll(BufferedImage bufferedImage, int n) {
        int n2 = bufferedImage.getWidth();
        int n3 = bufferedImage.getHeight();
        int[] arrn = bufferedImage.getRGB(0, 0, n2, n3, null, 0, n2);
        for (int i = arrn.length - 1; i >= 0; --i) {
            int n4 = arrn[i] >> 24 & 0xFF;
            if (n4 >= n) continue;
            return true;
        }
        return false;
    }

    public static void lllIlIIlIIIlIlIIIllIlllIl(BufferedImage bufferedImage) {
        int n = bufferedImage.getWidth();
        int n2 = bufferedImage.getHeight();
        int[] arrn = bufferedImage.getRGB(0, 0, n, n2, null, 0, n);
        int n3 = arrn.length - 1;
        while (n3 >= 0) {
            int n4 = n3--;
            arrn[n4] = arrn[n4] | 0xFF000000;
        }
        bufferedImage.setRGB(0, 0, n, n2, arrn, 0, n);
    }
}

