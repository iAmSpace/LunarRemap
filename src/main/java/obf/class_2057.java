package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.util.ResourceLocation;
import optifine.Config;
import net.minecraft.client.settings.GameSettings;

import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Properties;
import javax.imageio.ImageIO;

public class class_2057 {
    private static class_0225[] lllIIIllIIIIlllIlIIllIIll = null;

    public static void lllIIIllIIIIlllIlIIllIIll() {
        lllIIIllIIIIlllIlIIllIIll = null;
    }

    public static void lllIlIIlIIIlIlIIIllIlllIl() {
        lllIIIllIIIIlllIlIIllIIll = null;
        class_0449[] arrclass_0449 = Config.lIIlIlllIllIlIlllIIIIIIII();
        lllIIIllIIIIlllIlIIllIIll = class_2057.lllIIIllIIIIlllIlIIllIIll(arrclass_0449);
        if (Config.IIIlIllllIIIlllllIllIlIII()) {
            class_2057.lIlllIlllIIIIlIIlllIllIII();
        }
    }

    public static void IlIllllllIIlIIllllIIlIIIl() {
        if (lllIIIllIIIIlllIlIIllIIll != null && Config.IIIlIllllIIIlllllIllIlIII()) {
            class_2057.lIlllIlllIIIIlIIlllIllIII();
        }
    }

    public static void lIlllIlllIIIIlIIlllIllIII() {
        if (lllIIIllIIIIlllIlIIllIIll != null) {
            for (int i = 0; i < lllIIIllIIIIlllIlIIllIIll.length; ++i) {
                class_0225 class_02252 = lllIIIllIIIIlllIlIIllIIll[i];
                class_02252.lIlllIlllIIIIlIIlllIllIII();
            }
        }
    }

    public static class_0225[] lllIIIllIIIIlllIlIIllIIll(class_0449[] arrclass_0449) {
        ArrayList<class_0225> arrayList = new ArrayList<class_0225>();
        for (int i = 0; i < arrclass_0449.length; ++i) {
            class_0449 class_04492 = arrclass_0449[i];
            class_0225[] arrclass_0225 = class_2057.lllIIIllIIIIlllIlIIllIIll(class_04492);
            if (arrclass_0225 == null) continue;
            arrayList.addAll(Arrays.asList(arrclass_0225));
        }
        class_0225[] arrclass_0225 = arrayList.toArray(new class_0225[arrayList.size()]);
        return arrclass_0225;
    }

    public static class_0225[] lllIIIllIIIIlllIlIIllIIll(class_0449 class_04492) {
        String[] arrstring = class_1207.lllIIIllIIIIlllIlIIllIIll(class_04492, "mcpatcher/anim", ".properties", (String[])null);
        if (arrstring.length <= 0) {
            return null;
        }
        ArrayList<class_0225> arrayList = new ArrayList<class_0225>();
        for (int i = 0; i < arrstring.length; ++i) {
            String string = arrstring[i];
            Config.lllIIIllIIIIlllIlIIllIIll("Texture animation: " + string);
            try {
                ResourceLocation class_17732 = new ResourceLocation(string);
                InputStream inputStream = class_04492.lllIIIllIIIIlllIlIIllIIll(class_17732);
                Properties properties = new Properties();
                properties.load(inputStream);
                class_0225 class_02252 = class_2057.lllIIIllIIIIlllIlIIllIIll(properties, class_17732);
                if (class_02252 == null) continue;
                ResourceLocation class_17733 = new ResourceLocation(class_02252.lIllllIIlIIIlIllllllIIIll());
                if (Config.IlIIIIIllllllIIlllIllllll(class_17733) != class_04492) {
                    Config.lllIIIllIIIIlllIlIIllIIll("Skipped: " + string + ", target texture not loaded from same resource pack");
                    continue;
                }
                arrayList.add(class_02252);
                continue;
            }
            catch (FileNotFoundException fileNotFoundException) {
                Config.lllIlIIlIIIlIlIIIllIlllIl("File not found: " + fileNotFoundException.getMessage());
                continue;
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
        class_0225[] arrclass_0225 = arrayList.toArray(new class_0225[arrayList.size()]);
        return arrclass_0225;
    }

    public static class_0225 lllIIIllIIIIlllIlIIllIIll(Properties properties, ResourceLocation class_17732) {
        String string = properties.getProperty("from");
        String string2 = properties.getProperty("to");
        int n = Config.lllIIIllIIIIlllIlIIllIIll(properties.getProperty("x"), -1);
        int n2 = Config.lllIIIllIIIIlllIlIIllIIll(properties.getProperty("y"), -1);
        int n3 = Config.lllIIIllIIIIlllIlIIllIIll(properties.getProperty("w"), -1);
        int n4 = Config.lllIIIllIIIIlllIlIIllIIll(properties.getProperty("h"), -1);
        if (string != null && string2 != null) {
            if (n >= 0 && n2 >= 0 && n3 >= 0 && n4 >= 0) {
                string = string.trim();
                string2 = string2.trim();
                String string3 = class_1384.lllIlIIlIIIlIlIIIllIlllIl(class_17732.lllIIIllIIIIlllIlIIllIIll());
                string = class_1384.lllIIIllIIIIlllIlIIllIIll(string, string3);
                string2 = class_1384.lllIIIllIIIIlllIlIIllIIll(string2, string3);
                byte[] arrby = class_2057.lllIIIllIIIIlllIlIIllIIll(string, n3);
                if (arrby == null) {
                    Config.lllIlIIlIIIlIlIIIllIlllIl("TextureAnimation: Source texture not found: " + string2);
                    return null;
                }
                ResourceLocation class_17733 = new ResourceLocation(string2);
                if (!Config.IlIllllllIIlIIllllIIlIIIl(class_17733)) {
                    Config.lllIlIIlIIIlIlIIIllIlllIl("TextureAnimation: Target texture not found: " + string2);
                    return null;
                }
                class_0211 class_02112 = class_1384.lllIIIllIIIIlllIlIIllIIll(class_17733);
                if (class_02112 == null) {
                    Config.lllIlIIlIIIlIlIIIllIlllIl("TextureAnimation: Target texture not found: " + class_17733);
                    return null;
                }
                int n5 = class_02112.lllIIIllIIIIlllIlIIllIIll();
                class_0225 class_02252 = new class_0225(string, arrby, string2, n5, n, n2, n3, n4, properties, 1);
                return class_02252;
            }
            Config.lllIlIIlIIIlIlIIIllIlllIl("TextureAnimation: Invalid coordinates");
            return null;
        }
        Config.lllIlIIlIIIlIlIIIllIlllIl("TextureAnimation: Source or target texture not specified");
        return null;
    }

    public static byte[] lllIIIllIIIIlllIlIIllIIll(String string, int n) {
        byte[] arrby = class_2057.lllIlIIlIIIlIlIIIllIlllIl(string, n);
        if (arrby == null) {
            arrby = class_2057.lllIlIIlIIIlIlIIIllIlllIl("/anim" + string, n);
        }
        return arrby;
    }

    private static byte[] lllIlIIlIIIlIlIIIllIlllIl(String string, int n) {
        GameSettings class_17512 = Config.getGameSettings();
        try {
            ResourceLocation class_17732 = new ResourceLocation(string);
            InputStream inputStream = Config.lllIIIllIIIIlllIlIIllIIll(class_17732);
            if (inputStream == null) {
                return null;
            }
            BufferedImage bufferedImage = class_2057.lllIIIllIIIIlllIlIIllIIll(inputStream);
            inputStream.close();
            if (bufferedImage == null) {
                return null;
            }
            if (n > 0 && bufferedImage.getWidth() != n) {
                double d = bufferedImage.getHeight() / bufferedImage.getWidth();
                int n2 = (int)((double)n * d);
                bufferedImage = class_2057.lllIIIllIIIIlllIlIIllIIll(bufferedImage, n, n2);
            }
            int n3 = bufferedImage.getWidth();
            int n4 = bufferedImage.getHeight();
            int[] arrn = new int[n3 * n4];
            byte[] arrby = new byte[n3 * n4 * 4];
            bufferedImage.getRGB(0, 0, n3, n4, arrn, 0, n3);
            for (int i = 0; i < arrn.length; ++i) {
                int n5 = arrn[i] >> 24 & 0xFF;
                int n6 = arrn[i] >> 16 & 0xFF;
                int n7 = arrn[i] >> 8 & 0xFF;
                int n8 = arrn[i] & 0xFF;
                if (class_17512 != null && class_17512.IlIIIIIllllllIIlllIllllll) {
                    int n9 = (n6 * 30 + n7 * 59 + n8 * 11) / 100;
                    int n10 = (n6 * 30 + n7 * 70) / 100;
                    int n11 = (n6 * 30 + n8 * 70) / 100;
                    n6 = n9;
                    n7 = n10;
                    n8 = n11;
                }
                arrby[i * 4 + 0] = (byte)n6;
                arrby[i * 4 + 1] = (byte)n7;
                arrby[i * 4 + 2] = (byte)n8;
                arrby[i * 4 + 3] = (byte)n5;
            }
            return arrby;
        }
        catch (FileNotFoundException fileNotFoundException) {
            return null;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    private static BufferedImage lllIIIllIIIIlllIlIIllIIll(InputStream inputStream) {
        BufferedImage bufferedImage = ImageIO.read(inputStream);
        inputStream.close();
        return bufferedImage;
    }

    public static BufferedImage lllIIIllIIIIlllIlIIllIIll(BufferedImage bufferedImage, int n, int n2) {
        BufferedImage bufferedImage2 = new BufferedImage(n, n2, 2);
        Graphics2D graphics2D = bufferedImage2.createGraphics();
        graphics2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        graphics2D.drawImage(bufferedImage, 0, 0, n, n2, null);
        return bufferedImage2;
    }
}

