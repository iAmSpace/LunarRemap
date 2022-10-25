package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.ibm.icu.text.ArabicShaping
 *  com.ibm.icu.text.ArabicShapingException
 *  com.ibm.icu.text.Bidi
 *  org.lwjgl.opengl.GL11
 */
import com.ibm.icu.text.ArabicShaping;
import com.ibm.icu.text.ArabicShapingException;
import com.ibm.icu.text.Bidi;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import javax.imageio.ImageIO;

import net.minecraft.util.ResourceLocation;
import net.minecraft.client.Minecraft;
import optifine.Config;
import net.minecraft.client.settings.GameSettings;
import org.lwjgl.opengl.GL11;

public class class_1854
implements class_0334 {
    private static final ResourceLocation[] IllIIlllllllIIlIIlIIIIlIl = new ResourceLocation[256];
    private float[] IIIllIllIIlIlIlIlIllllIIl = new float[256];
    public int lllIIIllIIIIlllIlIIllIIll = 9;
    public Random lllIlIIlIIIlIlIIIllIlllIl = new Random();
    private byte[] IllIIIllIIIIlIlIlIllIIlll = new byte[65536];
    public int[] IlIllllllIIlIIllllIIlIIIl = new int[32];
    private ResourceLocation lIIIIlIlIIlllllIIllIIlIII;
    private final class_1682 llIIlllIllIllllIIIlIIIIII;
    private float llIIllIllIlIIlIIllIllllll;
    private float lllIIlIIIllllllIIIIlIlIlI;
    private boolean IlIlllIIIIIIlIIllIIllIlll;
    private boolean IlIlIIlIlIllIIlIlIIllIIIl;
    private float lllllIlllIIllIlIIlIIIllII;
    private float IlIlIIlllIIlIllIIIlllllIl;
    private float lIIlIIIIIlIlllIlIIlIlIlll;
    private float lIlIlIIlIIIIlIIIIIlllIIII;
    private int IlIIIlIIIIllIIIllIIIIIIll;
    private boolean IIlllIlIlllIllIIIlllIIlIl;
    private boolean lIlIllIIlIIlIIlIIlIIlIIll;
    private boolean llIIlIllIllllIlIIIIlIIlll;
    private boolean llIllllIlIllIIIlIllIIlIlI;
    private boolean lIlllIlllIlIIIIlllIlIlIIl;
    public GameSettings lIlllIlllIIIIlIIlllIllIII;
    public ResourceLocation IlIIIIIllllllIIlllIllllll;
    public boolean lIllllIIlIIIlIllllllIIIll = true;
    public float IIIllIIlIIIIIIlIlIIllIIlI = 1.0f;
    private ResourceLocation IlIIlllllIIlIlIlllllIllll;
    private int llIIlIlIlllIIllIlIlllIllI;
    private int IllIIIIllIIllIllIlllIlIIl;
    private boolean[] IIIIIIIIlIllIIllIIlllIllI;
    private final class_0905 IIlIIlIlIlIllIIlIlIIIIlll = new class_0905();
    private List llIIIlllIlllIlIllIIIIllIl;
    private long IIIIlIllIlIIlIIlIllIlIlll;

    public class_1854(GameSettings class_17512, ResourceLocation class_17732, class_1682 class_16822, boolean bl) {
        this.lIlllIlllIIIIlIIlllIllIII = class_17512;
        this.IlIIIIIllllllIIlllIllllll = class_17732;
        this.lIIIIlIlIIlllllIIllIIlIII = class_17732;
        this.llIIlllIllIllllIIIlIIIIII = class_16822;
        this.IlIlllIIIIIIlIIllIIllIlll = bl;
        this.lIIIIlIlIIlllllIIllIIlIII = class_0627.lllIlIIlIIIlIlIIIllIlllIl(this.IlIIIIIllllllIIlllIllllll);
        for (int i = 0; i < 32; ++i) {
            int n = (i >> 3 & 1) * 85;
            int n2 = (i >> 2 & 1) * 170 + n;
            int n3 = (i >> 1 & 1) * 170 + n;
            int n4 = (i >> 0 & 1) * 170 + n;
            if (i == 6) {
                n2 += 85;
            }
            if (class_17512.IlIIIIIllllllIIlllIllllll) {
                int n5 = (n2 * 30 + n3 * 59 + n4 * 11) / 100;
                int n6 = (n2 * 30 + n3 * 70) / 100;
                int n7 = (n2 * 30 + n4 * 70) / 100;
                n2 = n5;
                n3 = n6;
                n4 = n7;
            }
            if (i >= 16) {
                n2 /= 4;
                n3 /= 4;
                n4 /= 4;
            }
            this.IlIllllllIIlIIllllIIlIIIl[i] = (n2 & 0xFF) << 16 | (n3 & 0xFF) << 8 | n4 & 0xFF;
        }
        this.lIllllIIlIIIlIllllllIIIll();
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0947 class_09472) {
        this.IIlIIlIlIlIllIIlIlIIIIlll.clear();
        this.lIIIIlIlIIlllllIIllIIlIII = class_0627.lllIlIIlIIIlIlIIIllIlllIl(this.IlIIIIIllllllIIlllIllllll);
        for (int i = 0; i < IllIIlllllllIIlIIlIIIIlIl.length; ++i) {
            class_1854.IllIIlllllllIIlIIlIIIIlIl[i] = null;
        }
        this.IlIIIIIllllllIIlllIllllll();
        this.lIllllIIlIIIlIllllllIIIll();
    }

    private void IlIIIIIllllllIIlllIllllll() {
        BufferedImage bufferedImage;
        try {
            bufferedImage = ImageIO.read(this.lllIIIllIIIIlllIlIIllIIll(this.lIIIIlIlIIlllllIIllIIlIII));
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
        Properties properties = class_0627.lllIIIllIIIIlllIlIIllIIll(this.lIIIIlIlIIlllllIIllIIlIII);
        int n = bufferedImage.getWidth();
        int n2 = bufferedImage.getHeight();
        int n3 = n / 16;
        int n4 = n2 / 16;
        float f = (float)n / 128.0f;
        float f2 = Config.lllIIIllIIIIlllIlIIllIIll(f, 1.0f, 2.0f);
        this.IIIllIIlIIIIIIlIlIIllIIlI = 1.0f / f2;
        float f3 = class_0627.lllIIIllIIIIlllIlIIllIIll(properties, "offsetBold", -1.0f);
        if (f3 >= 0.0f) {
            this.IIIllIIlIIIIIIlIlIIllIIlI = f3;
        }
        int[] arrn = new int[n * n2];
        bufferedImage.getRGB(0, 0, n, n2, arrn, 0, n);
        for (int i = 0; i < 256; ++i) {
            int n5;
            int n6 = i % 16;
            int n7 = i / 16;
            boolean bl = false;
            for (n5 = n3 - 1; n5 >= 0; --n5) {
                int n8 = n6 * n3 + n5;
                boolean bl2 = true;
                for (int j = 0; j < n4 && bl2; ++j) {
                    int n9 = (n7 * n4 + j) * n;
                    int n10 = arrn[n8 + n9];
                    int n11 = n10 >> 24 & 0xFF;
                    if (n11 <= 16) continue;
                    bl2 = false;
                }
                if (!bl2) break;
            }
            if (i == 65) {
                // empty if block
            }
            if (i == 32) {
                n5 = n3 <= 8 ? (int)(2.0f * f) : (int)(1.5f * f);
            }
            this.IIIllIllIIlIlIlIlIllllIIl[i] = (float)(n5 + 1) / f + 1.0f;
        }
        class_0627.lllIIIllIIIIlllIlIIllIIll(properties, this.IIIllIllIIlIlIlIlIllllIIl);
    }

    private void lIllllIIlIIIlIllllllIIIll() {
        try {
            InputStream inputStream = this.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("font/glyph_sizes.bin"));
            inputStream.read(this.IllIIIllIIIIlIlIlIllIIlll);
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
    }

    private float lllIIIllIIIIlllIlIIllIIll(int n, char c, boolean bl) {
        if (c == ' ') {
            this.IllIIlllllllIIlIIlIIIIlIl();
            return !this.IlIlllIIIIIIlIIllIIllIlll ? this.IIIllIllIIlIlIlIlIllllIIl[c] : 4.0f;
        }
        return "\u00c0\u00c1\u00c2\u00c8\u00ca\u00cb\u00cd\u00d3\u00d4\u00d5\u00da\u00df\u00e3\u00f5\u011f\u0130\u0131\u0152\u0153\u015e\u015f\u0174\u0175\u017e\u0207\u0000\u0000\u0000\u0000\u0000\u0000\u0000 !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u0000\u00c7\u00fc\u00e9\u00e2\u00e4\u00e0\u00e5\u00e7\u00ea\u00eb\u00e8\u00ef\u00ee\u00ec\u00c4\u00c5\u00c9\u00e6\u00c6\u00f4\u00f6\u00f2\u00fb\u00f9\u00ff\u00d6\u00dc\u00f8\u00a3\u00d8\u00d7\u0192\u00e1\u00ed\u00f3\u00fa\u00f1\u00d1\u00aa\u00ba\u00bf\u00ae\u00ac\u00bd\u00bc\u00a1\u00ab\u00bb\u2591\u2592\u2593\u2502\u2524\u2561\u2562\u2556\u2555\u2563\u2551\u2557\u255d\u255c\u255b\u2510\u2514\u2534\u252c\u251c\u2500\u253c\u255e\u255f\u255a\u2554\u2569\u2566\u2560\u2550\u256c\u2567\u2568\u2564\u2565\u2559\u2558\u2552\u2553\u256b\u256a\u2518\u250c\u2588\u2584\u258c\u2590\u2580\u03b1\u03b2\u0393\u03c0\u03a3\u03c3\u03bc\u03c4\u03a6\u0398\u03a9\u03b4\u221e\u2205\u2208\u2229\u2261\u00b1\u2265\u2264\u2320\u2321\u00f7\u2248\u00b0\u2219\u00b7\u221a\u207f\u00b2\u25a0\u0000".indexOf(c) != -1 && !this.IlIlllIIIIIIlIIllIIllIlll ? this.lllIIIllIIIIlllIlIIllIIll(n, bl) : this.lllIIIllIIIIlllIlIIllIIll(c, bl);
    }

    private float lllIIIllIIIIlllIlIIllIIll(int n, boolean bl) {
        if (this.IlIIlllllIIlIlIlllllIllll == null && !this.IIIIIIIIlIllIIllIIlllIllI[this.llIIlIlIlllIIllIlIlllIllI]) {
            this.IlIIlllllIIlIlIlllllIllll = this.lIIIIlIlIIlllllIIllIIlIII;
            if (!class_0868.IlIIIIIllllllIIlllIllllll.lIllllIIlIIIlIllllllIIIll) {
                int n2 = GL11.glGenLists((int)1);
                this.llIIIlllIlllIlIllIIIIllIl.add(new class_2207(n2, this.IlIIlllllIIlIlIlllllIllll));
                GL11.glNewList((int)n2, (int)4864);
                class_0868.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl();
            }
        }
        if (this.IlIIlllllIIlIlIlllllIllll == this.lIIIIlIlIIlllllIIllIIlIII) {
            float f = n % 16 * 8;
            float f2 = n / 16 * 8;
            float f3 = bl ? 1.0f : 0.0f;
            float f4 = 7.99f;
            this.IIIllIllIIlIlIlIlIllllIIl();
            class_0868.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(f / 128.0f, f2 / 128.0f);
            class_0868.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll((double)(this.llIIllIllIlIIlIIllIllllll + f3), (double)this.lllIIlIIIllllllIIIIlIlIlI, 0.0);
            class_0868.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(f / 128.0f, (f2 + 7.99f) / 128.0f);
            class_0868.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll((double)(this.llIIllIllIlIIlIIllIllllll - f3), (double)(this.lllIIlIIIllllllIIIIlIlIlI + 7.99f), 0.0);
            class_0868.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll((f + f4 - 1.0f) / 128.0f, (f2 + 7.99f) / 128.0f);
            class_0868.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll((double)(this.llIIllIllIlIIlIIllIllllll + f4 - 1.0f - f3), (double)(this.lllIIlIIIllllllIIIIlIlIlI + 7.99f), 0.0);
            class_0868.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll((f + f4 - 1.0f) / 128.0f, f2 / 128.0f);
            class_0868.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll((double)(this.llIIllIllIlIIlIIllIllllll + f4 - 1.0f + f3), (double)this.lllIIlIIIllllllIIIIlIlIlI, 0.0);
            this.IllIIlllllllIIlIIlIIIIlIl();
        }
        return this.IIIllIllIIlIlIlIlIllllIIl[n];
    }

    private ResourceLocation lllIIIllIIIIlllIlIIllIIll(int n) {
        if (IllIIlllllllIIlIIlIIIIlIl[n] == null) {
            class_1854.IllIIlllllllIIlIIlIIIIlIl[n] = new ResourceLocation(String.format("textures/font/unicode_page_%02x.png", n));
            class_1854.IllIIlllllllIIlIIlIIIIlIl[n] = class_0627.lllIlIIlIIIlIlIIIllIlllIl(IllIIlllllllIIlIIlIIIIlIl[n]);
        }
        return IllIIlllllllIIlIIlIIIIlIl[n];
    }

    private float lllIIIllIIIIlllIlIIllIIll(char c, boolean bl) {
        if (this.IllIIIllIIIIlIlIlIllIIlll[c] == 0) {
            this.IllIIlllllllIIlIIlIIIIlIl();
            return 0.0f;
        }
        ResourceLocation class_17732 = this.lllIIIllIIIIlllIlIIllIIll(c / 256);
        int n = this.IllIIIllIIIIlIlIlIllIIlll[c] >>> 4;
        int n2 = this.IllIIIllIIIIlIlIlIllIIlll[c] & 0xF;
        float f = n &= 0xF;
        float f2 = n2 + 1;
        if (this.IlIIlllllIIlIlIlllllIllll == null && !this.IIIIIIIIlIllIIllIIlllIllI[this.llIIlIlIlllIIllIlIlllIllI]) {
            this.IlIIlllllIIlIlIlllllIllll = class_17732;
            if (!class_0868.IlIIIIIllllllIIlllIllllll.lIllllIIlIIIlIllllllIIIll) {
                int n3 = GL11.glGenLists((int)1);
                this.llIIIlllIlllIlIllIIIIllIl.add(new class_2207(n3, this.IlIIlllllIIlIlIlllllIllll));
                GL11.glNewList((int)n3, (int)4864);
                class_0868.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl();
            }
        }
        if (this.IlIIlllllIIlIlIlllllIllll == class_17732) {
            float f3 = (float)(c % 16 * 16) + f;
            float f4 = (c & 0xFF) / 16 * 16;
            float f5 = f2 - f - 0.02f;
            float f6 = bl ? 1.0f : 0.0f;
            this.IIIllIllIIlIlIlIlIllllIIl();
            class_0868.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(f3 / 256.0f, f4 / 256.0f);
            class_0868.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll((double)(this.llIIllIllIlIIlIIllIllllll + f6), (double)this.lllIIlIIIllllllIIIIlIlIlI, 0.0);
            class_0868.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(f3 / 256.0f, (f4 + 15.98f) / 256.0f);
            class_0868.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll((double)(this.llIIllIllIlIIlIIllIllllll - f6), (double)(this.lllIIlIIIllllllIIIIlIlIlI + 7.99f), 0.0);
            class_0868.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll((f3 + f5) / 256.0f, (f4 + 15.98f) / 256.0f);
            class_0868.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll((double)(this.llIIllIllIlIIlIIllIllllll + f5 / 2.0f - f6), (double)(this.lllIIlIIIllllllIIIIlIlIlI + 7.99f), 0.0);
            class_0868.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll((f3 + f5) / 256.0f, f4 / 256.0f);
            class_0868.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll((double)(this.llIIllIllIlIIlIIllIllllll + f5 / 2.0f + f6), (double)this.lllIIlIIIllllllIIIIlIlIlI, 0.0);
            this.IllIIlllllllIIlIIlIIIIlIl();
        }
        return (f2 - f) / 2.0f + 1.0f;
    }

    public int lllIIIllIIIIlllIlIIllIIll(String string, float f, float f2, int n) {
        return this.lllIIIllIIIIlllIlIIllIIll(string, f, f2, n, true);
    }

    public int lllIIIllIIIIlllIlIIllIIll(String string, int n, int n2, int n3) {
        int n4 = this.lllIIIllIIIIlllIlIIllIIll(string);
        return this.lllIIIllIIIIlllIlIIllIIll(string, (float)(n - n4 / 2), (float)n2, n3, true);
    }

    public int lllIlIIlIIIlIlIIIllIlllIl(String string, float f, float f2, int n) {
        int n2 = this.lllIIIllIIIIlllIlIIllIIll(string);
        return this.lllIIIllIIIIlllIlIIllIIll(string, f - (float)(n2 / 2), f2, n, false);
    }

    public int lllIlIIlIIIlIlIIIllIlllIl(String string, int n, int n2, int n3) {
        return !this.lIllllIIlIIIlIllllllIIIll ? 0 : this.lllIIIllIIIIlllIlIIllIIll(string, (float)n, (float)n2, n3, false);
    }

    public int lllIIIllIIIIlllIlIIllIIll(String string, float f, float f2, int n, boolean bl) {
        int n2;
        this.IlIllllllIIlIIllllIIlIIIl();
        this.IIIllIIlIIIIIIlIlIIllIIlI();
        if (bl) {
            n2 = this.lllIlIIlIIIlIlIIIllIlllIl(string, f + 1.0f, f2 + 1.0f, n, true);
            n2 = Math.max(n2, this.lllIlIIlIIIlIlIIIllIlllIl(string, f, f2, n, false));
        } else {
            n2 = this.lllIlIIlIIIlIlIIIllIlllIl(string, f, f2, n, false);
        }
        return n2;
    }

    private String lllIlIIlIIIlIlIIIllIlllIl(String string) {
        try {
            Bidi bidi = new Bidi(new ArabicShaping(8).shape(string), 127);
            bidi.setReorderingMode(0);
            return bidi.writeReordered(2);
        }
        catch (ArabicShapingException arabicShapingException) {
            return string;
        }
    }

    private void IIIllIIlIIIIIIlIlIIllIIlI() {
        this.IIlllIlIlllIllIIIlllIIlIl = false;
        this.lIlIllIIlIIlIIlIIlIIlIIll = false;
        this.llIIlIllIllllIlIIIIlIIlll = false;
        this.llIllllIlIllIIIlIllIIlIlI = false;
        this.lIlllIlllIlIIIIlllIlIlIIl = false;
    }

    private void lllIIIllIIIIlllIlIIllIIll(String string, boolean bl, int n) {
        class_1064 class_10642 = this.IIlIIlIlIlIllIIlIlIIIIlll.lllIIIllIIIIlllIlIIllIIll(string, n, bl);
        if (class_10642 != null) {
            class_10642.lllIIIllIIIIlllIlIIllIIll(this.IIIIlIllIlIIlIIlIllIlIlll);
            GL11.glPushMatrix();
            GL11.glTranslatef((float)this.llIIllIllIlIIlIIllIllllll, (float)this.lllIIlIIIllllllIIIIlIlIlI, (float)0.0f);
            class_10642.lllIIIllIIIIlllIlIIllIIll();
            GL11.glPopMatrix();
            this.llIIllIllIlIIlIIllIllllll += class_10642.IlIllllllIIlIIllllIIlIIIl();
            return;
        }
        float f = this.llIIllIllIlIIlIIllIllllll;
        float f2 = this.lllIIlIIIllllllIIIIlIlIlI;
        this.llIIllIllIlIIlIIllIllllll = 0.0f;
        this.lllIIlIIIllllllIIIIlIlIlI = 0.0f;
        this.llIIIlllIlllIlIllIIIIllIl = new ArrayList();
        this.IIIIIIIIlIllIIllIIlllIllI = new boolean[string.length()];
        this.IllIIIIllIIllIllIlllIlIIl = string.length();
        boolean bl2 = false;
        while (this.IllIIIIllIIllIllIlllIlIIl >= 0) {
            if (this.IllIIIIllIIllIllIlllIlIIl == 0) {
                this.IllIIIIllIIllIllIlllIlIIl = -1;
            }
            this.llIIllIllIlIIlIIllIllllll = 0.0f;
            this.IlIIlllllIIlIlIlllllIllll = null;
            this.IlIIIlIIIIllIIIllIIIIIIll = -1;
            this.IIIllIIlIIIIIIlIlIIllIIlI();
            this.llIIlIlIlllIIllIlIlllIllI = 0;
            while (this.llIIlIlIlllIIllIlIlllIllI < string.length()) {
                int n2;
                int n3;
                char c = string.charAt(this.llIIlIlIlllIIllIlIlllIllI);
                if (c == '\u00a7' && this.llIIlIlIlllIIllIlIlllIllI + 1 < string.length()) {
                    n3 = "0123456789abcdefklmnor".indexOf(Character.toLowerCase(string.charAt(this.llIIlIlIlllIIllIlIlllIllI + 1)));
                    if (n3 < 16) {
                        this.IIlllIlIlllIllIIIlllIIlIl = false;
                        this.lIlIllIIlIIlIIlIIlIIlIIll = false;
                        this.lIlllIlllIlIIIIlllIlIlIIl = false;
                        this.llIllllIlIllIIIlIllIIlIlI = false;
                        this.llIIlIllIllllIlIIIIlIIlll = false;
                        if (n3 < 0 || n3 > 15) {
                            n3 = 15;
                        }
                        if (bl) {
                            n3 += 16;
                        }
                        n2 = this.IlIllllllIIlIIllllIIlIIIl[n3];
                        if (Config.IlIIlIIlllllIlIIlIlIlIlIl()) {
                            n2 = class_1689.lllIIIllIIIIlllIlIIllIIll(n3, n2);
                        }
                        this.IlIIIlIIIIllIIIllIIIIIIll = n2;
                    } else if (n3 == 16) {
                        this.IIlllIlIlllIllIIIlllIIlIl = true;
                        bl2 = true;
                    } else if (n3 == 17) {
                        this.lIlIllIIlIIlIIlIIlIIlIIll = true;
                    } else if (n3 == 18) {
                        this.lIlllIlllIlIIIIlllIlIlIIl = true;
                    } else if (n3 == 19) {
                        this.llIllllIlIllIIIlIllIIlIlI = true;
                    } else if (n3 == 20) {
                        this.llIIlIllIllllIlIIIIlIIlll = true;
                    } else if (n3 == 21) {
                        this.IIlllIlIlllIllIIIlllIIlIl = false;
                        this.lIlIllIIlIIlIIlIIlIIlIIll = false;
                        this.lIlllIlllIlIIIIlllIlIlIIl = false;
                        this.llIllllIlIllIIIlIllIIlIlI = false;
                        this.llIIlIllIllllIlIIIIlIIlll = false;
                        this.IlIIIlIIIIllIIIllIIIIIIll = -1;
                    }
                    this.IllIIlllllllIIlIIlIIIIlIl();
                    ++this.llIIlIlIlllIIllIlIlllIllI;
                    this.IllIIlllllllIIlIIlIIIIlIl();
                } else {
                    boolean bl3;
                    n3 = "\u00c0\u00c1\u00c2\u00c8\u00ca\u00cb\u00cd\u00d3\u00d4\u00d5\u00da\u00df\u00e3\u00f5\u011f\u0130\u0131\u0152\u0153\u015e\u015f\u0174\u0175\u017e\u0207\u0000\u0000\u0000\u0000\u0000\u0000\u0000 !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u0000\u00c7\u00fc\u00e9\u00e2\u00e4\u00e0\u00e5\u00e7\u00ea\u00eb\u00e8\u00ef\u00ee\u00ec\u00c4\u00c5\u00c9\u00e6\u00c6\u00f4\u00f6\u00f2\u00fb\u00f9\u00ff\u00d6\u00dc\u00f8\u00a3\u00d8\u00d7\u0192\u00e1\u00ed\u00f3\u00fa\u00f1\u00d1\u00aa\u00ba\u00bf\u00ae\u00ac\u00bd\u00bc\u00a1\u00ab\u00bb\u2591\u2592\u2593\u2502\u2524\u2561\u2562\u2556\u2555\u2563\u2551\u2557\u255d\u255c\u255b\u2510\u2514\u2534\u252c\u251c\u2500\u253c\u255e\u255f\u255a\u2554\u2569\u2566\u2560\u2550\u256c\u2567\u2568\u2564\u2565\u2559\u2558\u2552\u2553\u256b\u256a\u2518\u250c\u2588\u2584\u258c\u2590\u2580\u03b1\u03b2\u0393\u03c0\u03a3\u03c3\u03bc\u03c4\u03a6\u0398\u03a9\u03b4\u221e\u2205\u2208\u2229\u2261\u00b1\u2265\u2264\u2320\u2321\u00f7\u2248\u00b0\u2219\u00b7\u221a\u207f\u00b2\u25a0\u0000".indexOf(c);
                    if (this.IIlllIlIlllIllIIIlllIIlIl && n3 != -1) {
                        while ((int)this.IIIllIllIIlIlIlIlIllllIIl[n3] != (int)this.IIIllIllIIlIlIlIlIllllIIl[n2 = this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(this.IIIllIllIIlIlIlIlIllllIIl.length)]) {
                        }
                        n3 = n2;
                    }
                    float f3 = n3 != -1 && !this.IlIlllIIIIIIlIIllIIllIlll ? this.IIIllIIlIIIIIIlIlIIllIIlI : 0.5f;
                    boolean bl4 = bl3 = (c == '\u0000' || n3 == -1 || this.IlIlllIIIIIIlIIllIIllIlll) && bl;
                    if (bl3) {
                        this.llIIllIllIlIIlIIllIllllll -= f3;
                        this.lllIIlIIIllllllIIIIlIlIlI -= f3;
                    }
                    float f4 = this.lllIIIllIIIIlllIlIIllIIll(n3, c, this.llIIlIllIllllIlIIIIlIIlll);
                    if (bl3) {
                        this.llIIllIllIlIIlIIllIllllll += f3;
                        this.lllIIlIIIllllllIIIIlIlIlI += f3;
                    }
                    if (this.lIlIllIIlIIlIIlIIlIIlIIll) {
                        this.llIIllIllIlIIlIIllIllllll += f3;
                        if (bl3) {
                            this.llIIllIllIlIIlIIllIllllll -= f3;
                            this.lllIIlIIIllllllIIIIlIlIlI -= f3;
                        }
                        this.lllIIIllIIIIlllIlIIllIIll(n3, c, this.llIIlIllIllllIlIIIIlIIlll);
                        this.llIIllIllIlIIlIIllIllllll -= f3;
                        if (bl3) {
                            this.llIIllIllIlIIlIIllIllllll += f3;
                            this.lllIIlIIIllllllIIIIlIlIlI += f3;
                        }
                        f4 += f3;
                    }
                    if (this.IllIIIIllIIllIllIlllIlIIl == -1 && (this.lIlllIlllIlIIIIlllIlIlIIl || this.llIllllIlIllIIIlIllIIlIlI)) {
                        if (!class_0868.IlIIIIIllllllIIlllIllllll.lIllllIIlIIIlIllllllIIIll) {
                            int n4 = GL11.glGenLists((int)1);
                            this.llIIIlllIlllIlIllIIIIllIl.add(new class_2207(n4, null));
                            GL11.glNewList((int)n4, (int)4864);
                            class_0868.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl();
                        }
                        this.IIIllIllIIlIlIlIlIllllIIl();
                        if (this.lIlllIlllIlIIIIlllIlIlIIl) {
                            class_0868.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll((double)this.llIIllIllIlIIlIIllIllllll, (double)(this.lllIIlIIIllllllIIIIlIlIlI + (float)(this.lllIIIllIIIIlllIlIIllIIll / 2)), 0.0);
                            class_0868.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll((double)(this.llIIllIllIlIIlIIllIllllll + f4), (double)(this.lllIIlIIIllllllIIIIlIlIlI + (float)(this.lllIIIllIIIIlllIlIIllIIll / 2)), 0.0);
                            class_0868.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll((double)(this.llIIllIllIlIIlIIllIllllll + f4), (double)(this.lllIIlIIIllllllIIIIlIlIlI + (float)(this.lllIIIllIIIIlllIlIIllIIll / 2) - 1.0f), 0.0);
                            class_0868.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll((double)this.llIIllIllIlIIlIIllIllllll, (double)(this.lllIIlIIIllllllIIIIlIlIlI + (float)(this.lllIIIllIIIIlllIlIIllIIll / 2) - 1.0f), 0.0);
                        }
                        if (this.llIllllIlIllIIIlIllIIlIlI) {
                            class_0868.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll((double)(this.llIIllIllIlIIlIIllIllllll - 1.0f), (double)(this.lllIIlIIIllllllIIIIlIlIlI + (float)this.lllIIIllIIIIlllIlIIllIIll), 0.0);
                            class_0868.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll((double)(this.llIIllIllIlIIlIIllIllllll + f4), (double)(this.lllIIlIIIllllllIIIIlIlIlI + (float)this.lllIIIllIIIIlllIlIIllIIll), 0.0);
                            class_0868.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll((double)(this.llIIllIllIlIIlIIllIllllll + f4), (double)(this.lllIIlIIIllllllIIIIlIlIlI + (float)this.lllIIIllIIIIlllIlIIllIIll - 1.0f), 0.0);
                            class_0868.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll((double)(this.llIIllIllIlIIlIIllIllllll - 1.0f), (double)(this.lllIIlIIIllllllIIIIlIlIlI + (float)this.lllIIIllIIIIlllIlIIllIIll - 1.0f), 0.0);
                        }
                    }
                    this.llIIllIllIlIIlIIllIllllll += f4;
                }
                ++this.llIIlIlIlllIIllIlIlllIllI;
            }
            if (!class_0868.IlIIIIIllllllIIlllIllllll.lIllllIIlIIIlIllllllIIIll) continue;
            class_0868.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll();
            GL11.glEndList();
        }
        class_10642 = new class_1064(this.llIIIlllIlllIlIllIIIIllIl, this.llIIllIllIlIIlIIllIllllll, this.IIIIlIllIlIIlIIlIllIlIlll, bl2);
        this.IIlIIlIlIlIllIIlIlIIIIlll.put(new class_1513(string, n, bl), class_10642);
        GL11.glPushMatrix();
        GL11.glTranslatef((float)f, (float)f2, (float)0.0f);
        class_10642.lllIIIllIIIIlllIlIIllIIll();
        GL11.glPopMatrix();
        this.llIIIlllIlllIlIllIIIIllIl = null;
        this.llIIllIllIlIIlIIllIllllll += f;
    }

    private void IllIIlllllllIIlIIlIIIIlIl() {
        if (!this.IIIIIIIIlIllIIllIIlllIllI[this.llIIlIlIlllIIllIlIlllIllI]) {
            this.IIIIIIIIlIllIIllIIlllIllI[this.llIIlIlIlllIIllIlIlllIllI] = true;
            --this.IllIIIIllIIllIllIlllIlIIl;
        }
    }

    private void IIIllIllIIlIlIlIlIllllIIl() {
        if (this.IlIIIlIIIIllIIIllIIIIIIll == -1) {
            class_0868.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(this.lllllIlllIIllIlIIlIIIllII, this.IlIlIIlllIIlIllIIIlllllIl, this.lIIlIIIIIlIlllIlIIlIlIlll, this.lIlIlIIlIIIIlIIIIIlllIIII);
        } else {
            class_0868.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll((float)(this.IlIIIlIIIIllIIIllIIIIIIll >> 16) / 255.0f, (float)(this.IlIIIlIIIIllIIIllIIIIIIll >> 8 & 0xFF) / 255.0f, (float)(this.IlIIIlIIIIllIIIllIIIIIIll & 0xFF) / 255.0f, this.lIlIlIIlIIIIlIIIIIlllIIII);
        }
    }

    private int lllIIIllIIIIlllIlIIllIIll(String string, int n, int n2, int n3, int n4, boolean bl) {
        if (this.IlIlIIlIlIllIIlIlIIllIIIl) {
            int n5 = this.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl(string));
            n = n + n3 - n5;
        }
        return this.lllIlIIlIIIlIlIIIllIlllIl(string, n, n2, n4, bl);
    }

    private int lllIlIIlIIIlIlIIIllIlllIl(String string, float f, float f2, int n, boolean bl) {
        if (string == null) {
            return 0;
        }
        if (this.IlIlIIlIlIllIIlIlIIllIIIl) {
            string = this.lllIlIIlIIIlIlIIIllIlllIl(string);
        }
        if ((n & 0xFC000000) == 0) {
            n |= 0xFF000000;
        }
        if (bl) {
            n = (n & 0xFCFCFC) >> 2 | n & 0xFF000000;
        }
        this.lllllIlllIIllIlIIlIIIllII = (float)(n >> 16 & 0xFF) / 255.0f;
        this.IlIlIIlllIIlIllIIIlllllIl = (float)(n >> 8 & 0xFF) / 255.0f;
        this.lIIlIIIIIlIlllIlIIlIlIlll = (float)(n & 0xFF) / 255.0f;
        this.lIlIlIIlIIIIlIIIIIlllIIII = (float)(n >> 24 & 0xFF) / 255.0f;
        this.llIIllIllIlIIlIIllIllllll = f;
        this.lllIIlIIIllllllIIIIlIlIlI = f2;
        this.lllIIIllIIIIlllIlIIllIIll(string, bl, n);
        return (int)this.llIIllIllIlIIlIIllIllllll;
    }

    public int lllIIIllIIIIlllIlIIllIIll(String string) {
        if (string == null) {
            return 0;
        }
        float f = 0.0f;
        boolean bl = false;
        for (int i = 0; i < string.length(); ++i) {
            char c = string.charAt(i);
            float f2 = this.lllIlIIlIIIlIlIIIllIlllIl(c);
            if (f2 < 0.0f && i < string.length() - 1) {
                if ((c = string.charAt(++i)) != 'l' && c != 'L') {
                    if (c == 'r' || c == 'R') {
                        bl = false;
                    }
                } else {
                    bl = true;
                }
                f2 = 0.0f;
            }
            f += f2;
            if (!bl || !(f2 > 0.0f)) continue;
            f += this.IlIlllIIIIIIlIIllIIllIlll ? 1.0f : this.IIIllIIlIIIIIIlIlIIllIIlI;
        }
        return (int)f;
    }

    public int lllIIIllIIIIlllIlIIllIIll(char c) {
        return Math.round(this.lllIlIIlIIIlIlIIIllIlllIl(c));
    }

    private float lllIlIIlIIIlIlIIIllIlllIl(char c) {
        if (c == '\u00a7') {
            return -1.0f;
        }
        if (c == ' ') {
            return this.IIIllIllIIlIlIlIlIllllIIl[32];
        }
        int n = "\u00c0\u00c1\u00c2\u00c8\u00ca\u00cb\u00cd\u00d3\u00d4\u00d5\u00da\u00df\u00e3\u00f5\u011f\u0130\u0131\u0152\u0153\u015e\u015f\u0174\u0175\u017e\u0207\u0000\u0000\u0000\u0000\u0000\u0000\u0000 !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u0000\u00c7\u00fc\u00e9\u00e2\u00e4\u00e0\u00e5\u00e7\u00ea\u00eb\u00e8\u00ef\u00ee\u00ec\u00c4\u00c5\u00c9\u00e6\u00c6\u00f4\u00f6\u00f2\u00fb\u00f9\u00ff\u00d6\u00dc\u00f8\u00a3\u00d8\u00d7\u0192\u00e1\u00ed\u00f3\u00fa\u00f1\u00d1\u00aa\u00ba\u00bf\u00ae\u00ac\u00bd\u00bc\u00a1\u00ab\u00bb\u2591\u2592\u2593\u2502\u2524\u2561\u2562\u2556\u2555\u2563\u2551\u2557\u255d\u255c\u255b\u2510\u2514\u2534\u252c\u251c\u2500\u253c\u255e\u255f\u255a\u2554\u2569\u2566\u2560\u2550\u256c\u2567\u2568\u2564\u2565\u2559\u2558\u2552\u2553\u256b\u256a\u2518\u250c\u2588\u2584\u258c\u2590\u2580\u03b1\u03b2\u0393\u03c0\u03a3\u03c3\u03bc\u03c4\u03a6\u0398\u03a9\u03b4\u221e\u2205\u2208\u2229\u2261\u00b1\u2265\u2264\u2320\u2321\u00f7\u2248\u00b0\u2219\u00b7\u221a\u207f\u00b2\u25a0\u0000".indexOf(c);
        if (c > '\u0000' && n != -1 && !this.IlIlllIIIIIIlIIllIIllIlll) {
            return this.IIIllIllIIlIlIlIlIllllIIl[n];
        }
        if (this.IllIIIllIIIIlIlIlIllIIlll[c] != 0) {
            int n2 = this.IllIIIllIIIIlIlIlIllIIlll[c] >>> 4;
            int n3 = this.IllIIIllIIIIlIlIlIllIIlll[c] & 0xF;
            return (++n3 - (n2 &= 0xF)) / 2 + 1;
        }
        return 0.0f;
    }

    public String lllIIIllIIIIlllIlIIllIIll(String string, int n) {
        return this.lllIIIllIIIIlllIlIIllIIll(string, n, false);
    }

    public String lllIIIllIIIIlllIlIIllIIll(String string, int n, boolean bl) {
        StringBuilder stringBuilder = new StringBuilder();
        float f = 0.0f;
        int n2 = bl ? string.length() - 1 : 0;
        int n3 = bl ? -1 : 1;
        boolean bl2 = false;
        boolean bl3 = false;
        for (int i = n2; i >= 0 && i < string.length() && f < (float)n; i += n3) {
            char c = string.charAt(i);
            float f2 = this.lllIlIIlIIIlIlIIIllIlllIl(c);
            if (bl2) {
                bl2 = false;
                if (c != 'l' && c != 'L') {
                    if (c == 'r' || c == 'R') {
                        bl3 = false;
                    }
                } else {
                    bl3 = true;
                }
            } else if (f2 < 0.0f) {
                bl2 = true;
            } else {
                f += f2;
                if (bl3) {
                    f += 1.0f;
                }
            }
            if (f > (float)n) break;
            if (bl) {
                stringBuilder.insert(0, c);
                continue;
            }
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }

    private String IlIllllllIIlIIllllIIlIIIl(String string) {
        while (string != null && string.endsWith("\n")) {
            string = string.substring(0, string.length() - 1);
        }
        return string;
    }

    public void lllIIIllIIIIlllIlIIllIIll(String string, int n, int n2, int n3, int n4) {
        this.IIIllIIlIIIIIIlIlIIllIIlI();
        this.IlIIIlIIIIllIIIllIIIIIIll = n4;
        string = this.IlIllllllIIlIIllllIIlIIIl(string);
        this.lllIIIllIIIIlllIlIIllIIll(string, n, n2, n3, false);
    }

    private void lllIIIllIIIIlllIlIIllIIll(String string, int n, int n2, int n3, boolean bl) {
        List list = this.IlIllllllIIlIIllllIIlIIIl(string, n3);
        for (String string2 : list) {
            this.lllIIIllIIIIlllIlIIllIIll(string2, n, n2, n3, this.IlIIIlIIIIllIIIllIIIIIIll, bl);
            n2 += this.lllIIIllIIIIlllIlIIllIIll;
        }
    }

    public int lllIlIIlIIIlIlIIIllIlllIl(String string, int n) {
        return this.lllIIIllIIIIlllIlIIllIIll * this.IlIllllllIIlIIllllIIlIIIl(string, n).size();
    }

    public void lllIIIllIIIIlllIlIIllIIll(boolean bl) {
        this.IlIlllIIIIIIlIIllIIllIlll = bl;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll() {
        return this.IlIlllIIIIIIlIIllIIllIlll;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(boolean bl) {
        this.IlIlIIlIlIllIIlIlIIllIIIl = bl;
    }

    public List IlIllllllIIlIIllllIIlIIIl(String string, int n) {
        return Arrays.asList(this.lIlllIlllIIIIlIIlllIllIII(string, n).split("\n"));
    }

    String lIlllIlllIIIIlIIlllIllIII(String string, int n) {
        int n2 = this.IlIIIIIllllllIIlllIllllll(string, n);
        if (string.length() <= n2) {
            return string;
        }
        String string2 = string.substring(0, n2);
        char c = string.charAt(n2);
        boolean bl = c == ' ' || c == '\n';
        String string3 = class_1854.lIlllIlllIIIIlIIlllIllIII(string2) + string.substring(n2 + (bl ? 1 : 0));
        return string2 + "\n" + this.lIlllIlllIIIIlIIlllIllIII(string3, n);
    }

    private int IlIIIIIllllllIIlllIllllll(String string, int n) {
        int n2;
        int n3 = string.length();
        float f = 0.0f;
        int n4 = -1;
        boolean bl = false;
        for (n2 = 0; n2 < n3; ++n2) {
            char c = string.charAt(n2);
            switch (c) {
                case '\n': {
                    --n2;
                    break;
                }
                case '\u00a7': {
                    char c2;
                    if (n2 >= n3 - 1) break;
                    if ((c2 = string.charAt(++n2)) != 'l' && c2 != 'L') {
                        if (c2 != 'r' && c2 != 'R' && !class_1854.IlIllllllIIlIIllllIIlIIIl(c2)) break;
                        bl = false;
                        break;
                    }
                    bl = true;
                    break;
                }
                case ' ': {
                    n4 = n2;
                }
                default: {
                    f += this.lllIlIIlIIIlIlIIIllIlllIl(c);
                    if (!bl) break;
                    f += 1.0f;
                }
            }
            if (c == '\n') {
                n4 = ++n2;
                break;
            }
            if (f > (float)n) break;
        }
        return n2 != n3 && n4 != -1 && n4 < n2 ? n4 : n2;
    }

    private static boolean IlIllllllIIlIIllllIIlIIIl(char c) {
        return c >= '0' && c <= '9' || c >= 'a' && c <= 'f' || c >= 'A' && c <= 'F';
    }

    private static boolean lIlllIlllIIIIlIIlllIllIII(char c) {
        return c >= 'k' && c <= 'o' || c >= 'K' && c <= 'O' || c == 'r' || c == 'R';
    }

    private static String lIlllIlllIIIIlIIlllIllIII(String string) {
        String string2 = "";
        int n = -1;
        int n2 = string.length();
        while ((n = string.indexOf(167, n + 1)) != -1) {
            if (n >= n2 - 1) continue;
            char c = string.charAt(n + 1);
            if (class_1854.IlIllllllIIlIIllllIIlIIIl(c)) {
                string2 = "\u00a7" + c;
                continue;
            }
            if (!class_1854.lIlllIlllIIIIlIIlllIllIII(c)) continue;
            string2 = string2 + "\u00a7" + c;
        }
        return string2;
    }

    public boolean lllIlIIlIIIlIlIIIllIlllIl() {
        return this.IlIlIIlIlIllIIlIlIIllIIIl;
    }

    protected void IlIllllllIIlIIllllIIlIIIl() {
        GL11.glEnable((int)3008);
    }

    protected InputStream lllIIIllIIIIlllIlIIllIIll(ResourceLocation class_17732) {
        return Minecraft.getMinecraft().getResourceManager().getResource(class_17732).getInputStream();
    }

    public void lIlllIlllIIIIlIIlllIllIII() {
        int n = 10;
        long l = this.IIIIlIllIlIIlIIlIllIlIlll - (long)(20 * n);
        class_0353 class_03532 = this.IIlIIlIlIlIllIIlIlIIIIlll.IlIllllllIIlIIllllIIlIIIl().lllIIIllIIIIlllIlIIllIIll();
        while (class_03532.hasNext()) {
            class_1064 class_10642 = (class_1064)class_03532.next();
            if (!class_10642.IlIIIIIllllllIIlllIllllll() && class_10642.lIlllIlllIIIIlIIlllIllIII() >= l) continue;
            class_10642.lllIlIIlIIIlIlIIIllIlllIl();
            class_03532.remove();
        }
        if (this.IIIIlIllIlIIlIIlIllIlIlll % 50L == 0L) {
            this.IIlIIlIlIlIllIIlIlIIIIlll.IIIllIllIIlIlIlIlIllllIIl();
        }
        ++this.IIIIlIllIlIIlIIlIllIlIlll;
    }
}

