package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.imageio.ImageIO;

import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class class_0450 {
    public static BufferedImage lllIIIllIIIIlllIlIIllIIll(int n) {
        GL11.glBindTexture((int)3553, (int)n);
        return class_0450.lllIIIllIIIIlllIlIIllIIll();
    }

    public static BufferedImage lllIIIllIIIIlllIlIIllIIll() {
        int n = GL11.glGetTexLevelParameteri((int)3553, (int)0, (int)4096);
        int n2 = GL11.glGetTexLevelParameteri((int)3553, (int)0, (int)4097);
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(n * n2 * 4).order(ByteOrder.nativeOrder());
        GL11.glGetTexImage((int)3553, (int)0, (int)6408, (int)5121, (ByteBuffer)byteBuffer);
        BufferedImage bufferedImage = new BufferedImage(n, n2, 6);
        byteBuffer.position(0);
        byte[] arrby = new byte[byteBuffer.remaining()];
        byteBuffer.get(arrby);
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n2; ++j) {
                int n3 = j * n * 4 + i * 4;
                int n4 = 0;
                int n5 = n4 | (arrby[n3 + 2] & 0xFF) << 0;
                n5 |= (arrby[n3 + 1] & 0xFF) << 8;
                n5 |= (arrby[n3 + 0] & 0xFF) << 16;
                bufferedImage.setRGB(i, j, n5 |= (arrby[n3 + 3] & 0xFF) << 24);
            }
        }
        return bufferedImage;
    }

    public static BufferedImage lllIIIllIIIIlllIlIIllIIll(String string, int n, int n2) {
        return class_0450.lllIIIllIIIIlllIlIIllIIll(string, n, n2, 64, 32);
    }

    public static BufferedImage lllIIIllIIIIlllIlIIllIIll(String string, int n, int n2, int n3, int n4) {
        return class_0450.lllIIIllIIIIlllIlIIllIIll(string, n, n2, n3, n4, 0, 0, 0, 0);
    }

    public static BufferedImage lllIIIllIIIIlllIlIIllIIll(String string, int n, int n2, int n3, int n4, int n5, int n6) {
        return class_0450.lllIIIllIIIIlllIlIIllIIll(string, n, n2, 64, 32, n3, n4, n5, n6);
    }

    public static BufferedImage lllIIIllIIIIlllIlIIllIIll(String string, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        try {
            InputStream inputStream = Minecraft.getMinecraft().getResourceManager().getResource(new ResourceLocation(string)).getInputStream();
            BufferedImage bufferedImage = ImageIO.read(inputStream);
            inputStream.close();
            BufferedImage bufferedImage2 = new BufferedImage(n * bufferedImage.getWidth() / n3, n2 * bufferedImage.getWidth() / n3, 6);
            Graphics2D graphics2D = bufferedImage2.createGraphics();
            graphics2D.setColor(new Color(n5, n6, n7, n8));
            graphics2D.fillRect(0, 0, bufferedImage2.getWidth(), bufferedImage2.getHeight());
            graphics2D.dispose();
            return bufferedImage2;
        }
        catch (Exception exception) {
            System.err.println("Failed getting mob: " + string + " - " + exception.getLocalizedMessage());
            exception.printStackTrace();
            return null;
        }
    }

    public static BufferedImage lllIIIllIIIIlllIlIIllIIll(BufferedImage bufferedImage, int n, int n2) {
        return class_0450.lllIIIllIIIIlllIlIIllIIll(bufferedImage, n, n2, 64, 32);
    }

    public static BufferedImage lllIIIllIIIIlllIlIIllIIll(BufferedImage bufferedImage, int n, int n2, int n3, int n4) {
        return class_0450.lllIIIllIIIIlllIlIIllIIll(bufferedImage, n, n2, n3, n4, 0, 0, 0, 0);
    }

    public static BufferedImage lllIIIllIIIIlllIlIIllIIll(BufferedImage bufferedImage, int n, int n2, int n3, int n4, int n5, int n6) {
        return class_0450.lllIIIllIIIIlllIlIIllIIll(bufferedImage, n, n2, 64, 32, n3, n4, n5, n6);
    }

    public static BufferedImage lllIIIllIIIIlllIlIIllIIll(BufferedImage bufferedImage, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        BufferedImage bufferedImage2 = new BufferedImage(n * bufferedImage.getWidth() / n3, n2 * bufferedImage.getWidth() / n3, 6);
        Graphics2D graphics2D = bufferedImage2.createGraphics();
        graphics2D.setColor(new Color(n5, n6, n7, n8));
        graphics2D.fillRect(0, 0, bufferedImage2.getWidth(), bufferedImage2.getHeight());
        graphics2D.dispose();
        return bufferedImage2;
    }

    public static BufferedImage lllIIIllIIIIlllIlIIllIIll(BufferedImage bufferedImage, String string) {
        Graphics2D graphics2D = bufferedImage.createGraphics();
        graphics2D.setColor(new Color(0, 0, 0, 255));
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics2D.setFont(new Font("Arial", 0, bufferedImage.getHeight()));
        FontMetrics fontMetrics = graphics2D.getFontMetrics();
        int n = (bufferedImage.getWidth() - fontMetrics.stringWidth("?")) / 2;
        int n2 = fontMetrics.getAscent() + (bufferedImage.getHeight() - (fontMetrics.getAscent() + fontMetrics.getDescent())) / 2;
        graphics2D.drawString("?", n, n2);
        graphics2D.dispose();
        return bufferedImage;
    }

    public static BufferedImage lllIIIllIIIIlllIlIIllIIll(ResourceLocation class_17732, int n, int n2, int n3, int n4) {
        return class_0450.lllIIIllIIIIlllIlIIllIIll(class_17732, n, n2, n3, n4, 64, 32);
    }

    public static BufferedImage lllIIIllIIIIlllIlIIllIIll(ResourceLocation class_17732, int n, int n2, int n3, int n4, int n5, int n6) {
        try {
            InputStream inputStream = Minecraft.getMinecraft().getResourceManager().getResource(class_17732).getInputStream();
            BufferedImage bufferedImage = ImageIO.read(inputStream);
            inputStream.close();
            return class_0450.lllIlIIlIIIlIlIIIllIlllIl(bufferedImage, n, n2, n3, n4, n5, n6);
        }
        catch (Exception exception) {
            System.err.println("Failed getting mob: " + class_17732.toString() + " - " + exception.getLocalizedMessage());
            return null;
        }
    }

    public static BufferedImage lllIlIIlIIIlIlIIIllIlllIl(BufferedImage bufferedImage, int n, int n2, int n3, int n4) {
        return class_0450.lllIlIIlIIIlIlIIIllIlllIl(bufferedImage, n, n2, n3, n4, 64, 32);
    }

    public static BufferedImage lllIlIIlIIIlIlIIIllIlllIl(BufferedImage bufferedImage, int n, int n2, int n3, int n4, int n5, int n6) {
        Object object;
        if (bufferedImage.getType() != 6) {
            BufferedImage bufferedImage2 = new BufferedImage(bufferedImage.getWidth(), bufferedImage.getHeight(), 6);
            object = bufferedImage2.createGraphics();
            ((Graphics)object).drawImage(bufferedImage, 0, 0, bufferedImage.getWidth(), bufferedImage.getHeight(), null);
            ((Graphics)object).dispose();
            bufferedImage = bufferedImage2;
        }
        float f = bufferedImage.getWidth(null) / n5;
        object = bufferedImage.getSubimage((int)((float)n * f), (int)((float)n2 * f), (int)((float)n3 * f), (int)((float)n4 * f));
        return object;
    }

    public static BufferedImage lllIIIllIIIIlllIlIIllIIll(BufferedImage bufferedImage, BufferedImage bufferedImage2, float f, int n, int n2, int n3) {
        int n4 = bufferedImage.getWidth() / n2;
        Graphics graphics = bufferedImage.getGraphics();
        graphics.drawImage(bufferedImage2, (int)(f * (float)n4), n * n4, null);
        graphics.dispose();
        return bufferedImage;
    }

    public static BufferedImage lllIIIllIIIIlllIlIIllIIll(BufferedImage bufferedImage, float f) {
        BufferedImage bufferedImage2 = new BufferedImage((int)((float)bufferedImage.getWidth() * f), (int)((float)bufferedImage.getHeight() * f), bufferedImage.getType());
        Graphics2D graphics2D = bufferedImage2.createGraphics();
        graphics2D.drawImage(bufferedImage, 0, 0, (int)((float)bufferedImage.getWidth() * f), (int)((float)bufferedImage.getHeight() * f), null);
        graphics2D.dispose();
        bufferedImage = bufferedImage2;
        return bufferedImage;
    }

    public static BufferedImage lllIIIllIIIIlllIlIIllIIll(BufferedImage bufferedImage) {
        AffineTransform affineTransform = AffineTransform.getScaleInstance(-1.0, 1.0);
        affineTransform.translate(-bufferedImage.getWidth(null), 0.0);
        AffineTransformOp affineTransformOp = new AffineTransformOp(affineTransform, 1);
        return affineTransformOp.filter(bufferedImage, null);
    }

    public static BufferedImage lllIlIIlIIIlIlIIIllIlllIl(BufferedImage bufferedImage) {
        BufferedImage bufferedImage2 = new BufferedImage(128, 128, bufferedImage.getType());
        Graphics graphics = bufferedImage2.getGraphics();
        graphics.drawImage(bufferedImage, 64 - bufferedImage.getWidth() / 2, 64 - bufferedImage.getHeight() / 2, bufferedImage.getWidth(), bufferedImage.getHeight(), null);
        graphics.dispose();
        return bufferedImage2;
    }

    public static BufferedImage IlIllllllIIlIIllllIIlIIIl(BufferedImage bufferedImage) {
        int n = Math.max(bufferedImage.getWidth(), bufferedImage.getHeight());
        int n2 = 1;
        while (Math.pow(2.0, n2 - 1) < (double)n) {
            ++n2;
        }
        int n3 = (int)Math.pow(2.0, n2);
        BufferedImage bufferedImage2 = new BufferedImage(n3, n3, bufferedImage.getType());
        Graphics graphics = bufferedImage2.getGraphics();
        graphics.drawImage(bufferedImage, (n3 - bufferedImage.getWidth()) / 2, (n3 - bufferedImage.getHeight()) / 2, bufferedImage.getWidth(), bufferedImage.getHeight(), null);
        graphics.dispose();
        return bufferedImage2;
    }

    public static BufferedImage lllIIIllIIIIlllIlIIllIIll(BufferedImage bufferedImage, boolean bl) {
        return class_0450.lllIIIllIIIIlllIlIIllIIll(bufferedImage, bl, false, false, 0);
    }

    public static BufferedImage lllIIIllIIIIlllIlIIllIIll(BufferedImage bufferedImage, boolean bl, boolean bl2, boolean bl3, int n) {
        if (bl && n != 2 && n != 3 && n != -1) {
            bufferedImage = class_0450.lllIIIllIIIIlllIlIIllIIll(bufferedImage, true, bl2, bl3);
        }
        bufferedImage = class_0450.lllIIIllIIIIlllIlIIllIIll(bufferedImage, false, bl2, bl3);
        return bufferedImage;
    }

    public static BufferedImage lllIIIllIIIIlllIlIIllIIll(BufferedImage bufferedImage, boolean bl, boolean bl2, boolean bl3) {
        float f = bl3 ? 2.29f : 4.0f;
        BufferedImage bufferedImage2 = new BufferedImage(bufferedImage.getWidth(), bufferedImage.getHeight(), bufferedImage.getType());
        Graphics graphics = bufferedImage2.getGraphics();
        graphics.drawImage(bufferedImage, 0, 0, null);
        graphics.dispose();
        int n = bufferedImage.getWidth();
        int n2 = bufferedImage.getHeight();
        for (int i = 0; i < bufferedImage.getWidth(); ++i) {
            for (int j = 0; j < bufferedImage.getHeight(); ++j) {
                int n3;
                int n4 = bufferedImage.getRGB(j, i);
                if ((n4 >> 24 & 0xFF) != 0 || (n3 = class_0450.lllIIIllIIIIlllIlIIllIIll(j, i, bufferedImage)) == 65116) continue;
                if (bl) {
                    n3 = !bl2 || (float)i <= (float)n / f || (float)i >= (float)(n - 1) - (float)n / f || (float)j <= (float)n2 / f || (float)j >= (float)(n2 - 1) - (float)n2 / f ? -16777216 : 0;
                } else {
                    int n5 = n3 >> 16 & 0xFF;
                    int n6 = n3 >> 8 & 0xFF;
                    int n7 = n3 >> 0 & 0xFF;
                    n3 = 0 | (n5 & 0xFF) << 16 | (n6 & 0xFF) << 8 | n7 & 0xFF;
                }
                bufferedImage2.setRGB(j, i, n3);
            }
        }
        return bufferedImage2;
    }

    public static int lllIIIllIIIIlllIlIIllIIll(int n, int n2, BufferedImage bufferedImage) {
        int n3;
        if (n > 0 && ((n3 = bufferedImage.getRGB(n - 1, n2)) >> 24 & 0xFF) > 50) {
            return n3;
        }
        if (n < bufferedImage.getWidth() - 1 && ((n3 = bufferedImage.getRGB(n + 1, n2)) >> 24 & 0xFF) > 50) {
            return n3;
        }
        if (n2 > 0 && ((n3 = bufferedImage.getRGB(n, n2 - 1)) >> 24 & 0xFF) > 50) {
            return n3;
        }
        if (n2 < bufferedImage.getHeight() - 1 && ((n3 = bufferedImage.getRGB(n, n2 + 1)) >> 24 & 0xFF) > 50) {
            return n3;
        }
        if (n > 0 && n2 > 0 && ((n3 = bufferedImage.getRGB(n - 1, n2 - 1)) >> 24 & 0xFF) > 50) {
            return n3;
        }
        if (n > 0 && n2 < bufferedImage.getHeight() - 1 && ((n3 = bufferedImage.getRGB(n - 1, n2 + 1)) >> 24 & 0xFF) > 50) {
            return n3;
        }
        if (n < bufferedImage.getWidth() - 1 && n2 > 0 && ((n3 = bufferedImage.getRGB(n + 1, n2 - 1)) >> 24 & 0xFF) > 50) {
            return n3;
        }
        if (n < bufferedImage.getWidth() - 1 && n2 < bufferedImage.getHeight() - 1 && ((n3 = bufferedImage.getRGB(n + 1, n2 + 1)) >> 24 & 0xFF) > 50) {
            return n3;
        }
        return 65116;
    }

    public static BufferedImage lIlllIlllIIIIlIIlllIllIII(BufferedImage bufferedImage) {
        int n;
        int n2 = -1;
        int n3 = bufferedImage.getWidth();
        int n4 = -1;
        int n5 = bufferedImage.getHeight();
        boolean bl = false;
        int n6 = 0;
        while (!bl) {
            ++n2;
            for (n = 0; n < bufferedImage.getHeight(); ++n) {
                n6 = bufferedImage.getRGB(n2, n);
                if (n6 >> 24 == 0) continue;
                bl = true;
            }
        }
        bl = false;
        while (!bl) {
            --n3;
            for (n = 0; n < bufferedImage.getHeight(); ++n) {
                n6 = bufferedImage.getRGB(n3, n);
                if (n6 >> 24 == 0) continue;
                bl = true;
            }
        }
        bl = false;
        while (!bl) {
            ++n4;
            for (n = 0; n < bufferedImage.getWidth(); ++n) {
                n6 = bufferedImage.getRGB(n, n4);
                if (n6 >> 24 == 0) continue;
                bl = true;
            }
        }
        bl = false;
        while (!bl) {
            --n5;
            for (n = 0; n < bufferedImage.getWidth(); ++n) {
                n6 = bufferedImage.getRGB(n, n5);
                if (n6 >> 24 == 0) continue;
                bl = true;
            }
        }
        bufferedImage = bufferedImage.getSubimage(n2, n4, n3 - n2 + 1, n5 - n4 + 1);
        return bufferedImage;
    }

    public static float IlIIIIIllllllIIlllIllllll(BufferedImage bufferedImage) {
        int n;
        int n2 = bufferedImage.getWidth() * 2 + bufferedImage.getHeight() * 2 - 2;
        int n3 = 0;
        int n4 = 0;
        for (n = 0; n < bufferedImage.getHeight(); ++n) {
            n4 = bufferedImage.getRGB(0, n);
            if (n4 >> 24 != 0) {
                ++n3;
            }
            if ((n4 = bufferedImage.getRGB(bufferedImage.getWidth() - 1, n)) >> 24 == 0) continue;
            ++n3;
        }
        for (n = 1; n < bufferedImage.getWidth() - 1; ++n) {
            n4 = bufferedImage.getRGB(n, 0);
            if (n4 >> 24 != 0) {
                ++n3;
            }
            if ((n4 = bufferedImage.getRGB(n, bufferedImage.getHeight() - 1)) >> 24 == 0) continue;
            ++n3;
        }
        return n3 / n2;
    }
}

