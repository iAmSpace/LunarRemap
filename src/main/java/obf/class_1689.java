package obf;/*
 * Decompiled with CFR 0.150.
 */
import com.moonsworth.lunar.client.LunarClient;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.init.Blocks;
import optifine.Config;
import net.minecraft.util.MathHelper;

import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Properties;
import java.util.Random;
import java.util.Set;
import javax.imageio.ImageIO;

public class class_1689 {
    private static int[] lllIIIllIIIIlllIlIIllIIll = null;
    private static int[] lllIlIIlIIIlIlIIIllIlllIl = null;
    private static int[] IlIllllllIIlIIllllIIlIIIl = null;
    private static int[] lIlllIlllIIIIlIIlllIllIII = null;
    private static int[] IlIIIIIllllllIIlllIllllll = null;
    private static int[] lIllllIIlIIIlIllllllIIIll = null;
    private static int[] IIIllIIlIIIIIIlIlIIllIIlI = null;
    private static int[][] IllIIlllllllIIlIIlIIIIlIl = null;
    private static int[][] IIIllIllIIlIlIlIlIllllIIl = null;
    private static int[] IllIIIllIIIIlIlIlIllIIlll = null;
    private static int[] lIIIIlIlIIlllllIIllIIlIII = null;
    private static int[] llIIlllIllIllllIIIlIIIIII = null;
    private static float[][][] llIIllIllIlIIlIIllIllllll = null;
    private static int[] lllIIlIIIllllllIIIIlIlIlI = null;
    private static float[][] IlIlllIIIIIIlIIllIIllIlll = new float[16][3];
    private static float[][] IlIlIIlIlIllIIlIlIIllIIIl = new float[16][3];
    private static int[] lllllIlllIIllIlIIlIIIllII = null;
    private static int[] IlIlIIlllIIlIllIIIlllllIl = null;
    private static int[] lIIlIIIIIlIlllIlIIlIlIlll = null;
    private static boolean lIlIlIIlIIIIlIIIIIlllIIII = true;
    private static int IlIIIlIIIIllIIIllIIIIIIll = -1;
    private static int IIlllIlIlllIllIIIlllIIlIl = -1;
    private static int lIlIllIIlIIlIIlIIlIIlIIll = -1;
    private static class_0864 llIIlIllIllllIlIIIIlIIlll = null;
    private static class_0864 llIllllIlIllIIIlIllIIlIlI = null;
    private static class_0864 lIlllIlllIlIIIIlllIlIlIIl = null;
    private static int[] IlIIlllllIIlIlIlllllIllll = null;
    private static final int llIIlIlIlllIIllIlIlllIllI = 0;
    private static final int IllIIIIllIIllIllIlllIlIIl = 1;
    private static final int IIIIIIIIlIllIIllIIlllIllI = 2;
    private static Random IIlIIlIlIlIllIIlIlIIIIlll = new Random();

    public static void lllIIIllIIIIlllIlIIllIIll() {
        lllIIIllIIIIlllIlIIllIIll = null;
        lllIlIIlIIIlIlIIIllIlllIl = null;
        IlIllllllIIlIIllllIIlIIIl = null;
        IlIIIIIllllllIIlllIllllll = null;
        lIlllIlllIIIIlIIlllIllIII = null;
        IIIllIIlIIIIIIlIlIIllIIlI = null;
        lIllllIIlIIIlIllllllIIIll = null;
        IllIIIllIIIIlIlIlIllIIlll = null;
        lIIIIlIlIIlllllIIllIIlIII = null;
        llIIlllIllIllllIIIlIIIIII = null;
        lllllIlllIIllIlIIlIIIllII = null;
        IlIlIIlllIIlIllIIIlllllIl = null;
        lIIlIIIIIlIlllIlIIlIlIlll = null;
        llIIllIllIlIIlIIllIllllll = null;
        lllIIlIIIllllllIIIIlIlIlI = null;
        lIlIllIIlIIlIIlIIlIIlIIll = -1;
        IlIIIlIIIIllIIIllIIIIIIll = -1;
        IIlllIlIlllIllIIIlllIIlIl = -1;
        llIIlIllIllllIlIIIIlIIlll = null;
        llIllllIlIllIIIlIllIIlIlI = null;
        lIlllIlllIlIIIIlllIlIlIIl = null;
        IlIIlllllIIlIlIlllllIllll = null;
        IllIIlllllllIIlIIlIIIIlIl = null;
        IIIllIllIIlIlIlIlIllllIIl = null;
        lIlIlIIlIIIIlIIIIIlllIIII = true;
        String string = "mcpatcher/colormap/";
        lllIIIllIIIIlllIlIIllIIll = class_1689.lllIlIIlIIIlIlIIIllIlllIl("textures/colormap/grass.png", 65536);
        IlIllllllIIlIIllllIIlIIIl = class_1689.lllIlIIlIIIlIlIIIllIlllIl("textures/colormap/foliage.png", 65536);
        String[] arrstring = new String[]{"water.png", "watercolorX.png"};
        lllIlIIlIIIlIlIIIllIlllIl = class_1689.lllIIIllIIIIlllIlIIllIIll(string, arrstring, 65536);
        if (Config.IlIIlIIlllllIlIIlIlIlIlIl()) {
            String[] arrstring2 = new String[]{"pine.png", "pinecolor.png"};
            lIlllIlllIIIIlIIlllIllIII = class_1689.lllIIIllIIIIlllIlIIllIIll(string, arrstring2, 65536);
            String[] arrstring3 = new String[]{"birch.png", "birchcolor.png"};
            IlIIIIIllllllIIlllIllllll = class_1689.lllIIIllIIIIlllIlIIllIIll(string, arrstring3, 65536);
            String[] arrstring4 = new String[]{"swampgrass.png", "swampgrasscolor.png"};
            IIIllIIlIIIIIIlIlIIllIIlI = class_1689.lllIIIllIIIIlllIlIIllIIll(string, arrstring4, 65536);
            String[] arrstring5 = new String[]{"swampfoliage.png", "swampfoliagecolor.png"};
            lIllllIIlIIIlIllllllIIIll = class_1689.lllIIIllIIIIlllIlIIllIIll(string, arrstring5, 65536);
            String[] arrstring6 = new String[]{"sky0.png", "skycolor0.png"};
            IllIIIllIIIIlIlIlIllIIlll = class_1689.lllIIIllIIIIlllIlIIllIIll(string, arrstring6, 65536);
            String[] arrstring7 = new String[]{"fog0.png", "fogcolor0.png"};
            lIIIIlIlIIlllllIIllIIlIII = class_1689.lllIIIllIIIIlllIlIIllIIll(string, arrstring7, 65536);
            String[] arrstring8 = new String[]{"underwater.png", "underwatercolor.png"};
            llIIlllIllIllllIIIlIIIIII = class_1689.lllIIIllIIIIlllIlIIllIIll(string, arrstring8, 65536);
            String[] arrstring9 = new String[]{"redstone.png", "redstonecolor.png"};
            lllllIlllIIllIlIIlIIIllII = class_1689.lllIIIllIIIIlllIlIIllIIll(string, arrstring9, 16);
            String[] arrstring10 = new String[]{"stem.png", "stemcolor.png"};
            IlIlIIlllIIlIllIIIlllllIl = class_1689.lllIIIllIIIIlllIlIIllIIll(string, arrstring10, 8);
            String[] arrstring11 = new String[]{"myceliumparticle.png", "myceliumparticlecolor.png"};
            lIIlIIIIIlIlllIlIIlIlIlll = class_1689.lllIIIllIIIIlllIlIIllIIll(string, arrstring11, -1);
            int[][] arrarrn = new int[3][];
            llIIllIllIlIIlIIllIllllll = new float[3][][];
            lllIIlIIIllllllIIIIlIlIlI = new int[3];
            for (int i = 0; i < arrarrn.length; ++i) {
                String string2 = "mcpatcher/lightmap/world" + (i - 1) + ".png";
                arrarrn[i] = class_1689.lllIlIIlIIIlIlIIIllIlllIl(string2, -1);
                if (arrarrn[i] != null) {
                    class_1689.llIIllIllIlIIlIIllIllllll[i] = class_1689.lllIIIllIIIIlllIlIIllIIll(arrarrn[i]);
                }
                class_1689.lllIIlIIIllllllIIIIlIlIlI[i] = class_1689.lllIIIllIIIIlllIlIIllIIll(string2, 32);
            }
            class_1689.lllIIIllIIIIlllIlIIllIIll("mcpatcher/color.properties");
            class_1689.lllIlIIlIIIlIlIIIllIlllIl();
        }
    }

    private static int lllIIIllIIIIlllIlIIllIIll(String string, int n) {
        try {
            InputStream inputStream = Config.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation(string));
            if (inputStream == null) {
                return n;
            }
            BufferedImage bufferedImage = ImageIO.read(inputStream);
            return bufferedImage == null ? n : bufferedImage.getHeight();
        }
        catch (IOException iOException) {
            return n;
        }
    }

    private static float[][] lllIIIllIIIIlllIlIIllIIll(int[] arrn) {
        float[][] arrf = new float[arrn.length][3];
        for (int i = 0; i < arrn.length; ++i) {
            int n = arrn[i];
            float f = (float)(n >> 16 & 0xFF) / 255.0f;
            float f2 = (float)(n >> 8 & 0xFF) / 255.0f;
            float f3 = (float)(n & 0xFF) / 255.0f;
            float[] arrf2 = arrf[i];
            arrf2[0] = f;
            arrf2[1] = f2;
            arrf2[2] = f3;
        }
        return arrf;
    }

    private static void lllIIIllIIIIlllIlIIllIIll(String string) {
        try {
            ResourceLocation class_17732 = new ResourceLocation(string);
            InputStream inputStream = Config.lllIIIllIIIIlllIlIIllIIll(class_17732);
            if (inputStream == null) {
                return;
            }
            Config.lIlllIlllIIIIlIIlllIllIII("Loading " + string);
            Properties properties = new Properties();
            properties.load(inputStream);
            lIlIllIIlIIlIIlIIlIIlIIll = class_1689.lllIlIIlIIIlIlIIIllIlllIl(properties, "lilypad");
            IlIIIlIIIIllIIIllIIIIIIll = class_1689.lllIIIllIIIIlllIlIIllIIll(properties, new String[]{"particle.water", "drop.water"});
            IIlllIlIlllIllIIIlllIIlIl = class_1689.lllIlIIlIIIlIlIIIllIlllIl(properties, "particle.portal");
            llIIlIllIllllIlIIIIlIIlll = class_1689.IlIllllllIIlIIllllIIlIIIl(properties, "fog.nether");
            llIllllIlIllIIIlIllIIlIlI = class_1689.IlIllllllIIlIIllllIIlIIIl(properties, "fog.end");
            lIlllIlllIlIIIIlllIlIlIIl = class_1689.IlIllllllIIlIIllllIIlIIIl(properties, "sky.end");
            IlIIlllllIIlIlIlllllIllll = class_1689.lllIIIllIIIIlllIlIIllIIll(properties, string, "text.code.", "Text");
            class_1689.lllIIIllIIIIlllIlIIllIIll(properties, string);
        }
        catch (FileNotFoundException fileNotFoundException) {
            return;
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    private static void lllIIIllIIIIlllIlIIllIIll(Properties properties, String string) {
        String string2;
        IllIIlllllllIIlIIlIIIIlIl = new int[256][1];
        for (int i = 0; i < 256; ++i) {
            class_1689.IllIIlllllllIIlIIlIIIIlIl[i][0] = -1;
        }
        String string3 = "palette.block.";
        HashMap<String, String> hashMap = new HashMap<String, String>();
        Set<Object> set = properties.keySet();
        for (String arrstring2 : set) {
            string2 = properties.getProperty(arrstring2);
            if (!arrstring2.startsWith(string3)) continue;
            hashMap.put(arrstring2, string2);
        }
        String[] arrstring = hashMap.keySet().toArray(new String[hashMap.size()]);
        IIIllIllIIlIlIlIlIllllIIl = new int[arrstring.length][];
        for (int i = 0; i < arrstring.length; ++i) {
            string2 = arrstring[i];
            String string4 = properties.getProperty(string2);
            Config.lIlllIlllIIIIlIIlllIllIII("net.minecraft.block.Block palette: " + string2 + " = " + string4);
            String string5 = string2.substring(string3.length());
            String string6 = class_1384.lllIlIIlIIIlIlIIIllIlllIl(string);
            string5 = class_1384.lllIIIllIIIIlllIlIIllIIll(string5, string6);
            int[] arrn = class_1689.lllIlIIlIIIlIlIIIllIlllIl(string5, 65536);
            class_1689.IIIllIllIIlIlIlIlIllllIIl[i] = arrn;
            String[] arrstring2 = Config.lllIIIllIIIIlllIlIIllIIll(string4, " ,;");
            for (int j = 0; j < arrstring2.length; ++j) {
                int n;
                String string7 = arrstring2[j];
                int n2 = -1;
                if (string7.contains(":")) {
                    String[] n3 = Config.lllIIIllIIIIlllIlIIllIIll(string7, ":");
                    string7 = n3[0];
                    String string8 = n3[1];
                    n2 = Config.lllIIIllIIIIlllIlIIllIIll(string8, -1);
                    if (n2 < 0 || n2 > 15) {
                        Config.lIlllIlllIIIIlIIlllIllIII("Invalid block metadata: " + string7 + " in palette: " + string2);
                        continue;
                    }
                }
                if ((n = Config.lllIIIllIIIIlllIlIIllIIll(string7, -1)) >= 0 && n <= 255) {
                    if (n == Block.lllIIIllIIIIlllIlIIllIIll(Blocks.IlIllllllIIlIIllllIIlIIIl) || n == Block.lllIIIllIIIIlllIlIIllIIll(Blocks.IlIlIIlllIllllllllIIIlIlI) || n == Block.lllIIIllIIIIlllIlIIllIIll(Blocks.lIlIlIIlIIIIlIIIIIlllIIII) || n == Block.lllIIIllIIIIlllIlIIllIIll(Blocks.lIIlIlllIIlIIIIlIlIIIIlll)) continue;
                    if (n2 == -1) {
                        class_1689.IllIIlllllllIIlIIlIIIIlIl[n][0] = i;
                        continue;
                    }
                    if (IllIIlllllllIIlIIlIIIIlIl[n].length < 16) {
                        class_1689.IllIIlllllllIIlIIlIIIIlIl[n] = new int[16];
                        Arrays.fill(IllIIlllllllIIlIIlIIIIlIl[n], -1);
                    }
                    class_1689.IllIIlllllllIIlIIlIIIIlIl[n][n2] = i;
                    continue;
                }
                Config.lIlllIlllIIIIlIIlllIllIII("Invalid block index: " + n + " in palette: " + string2);
            }
        }
    }

    private static int lllIIIllIIIIlllIlIIllIIll(Properties properties, String[] arrstring) {
        for (int i = 0; i < arrstring.length; ++i) {
            String string = arrstring[i];
            int n = class_1689.lllIlIIlIIIlIlIIIllIlllIl(properties, string);
            if (n < 0) continue;
            return n;
        }
        return -1;
    }

    private static int lllIlIIlIIIlIlIIIllIlllIl(Properties properties, String string) {
        String string2 = properties.getProperty(string);
        if (string2 == null) {
            return -1;
        }
        try {
            int n = Integer.parseInt(string2, 16) & 0xFFFFFF;
            Config.lIlllIlllIIIIlIIlllIllIII("Custom color: " + string + " = " + string2);
            return n;
        }
        catch (NumberFormatException numberFormatException) {
            Config.lIlllIlllIIIIlIIlllIllIII("Invalid custom color: " + string + " = " + string2);
            return -1;
        }
    }

    private static class_0864 IlIllllllIIlIIllllIIlIIIl(Properties properties, String string) {
        int n = class_1689.lllIlIIlIIIlIlIIIllIlllIl(properties, string);
        if (n < 0) {
            return null;
        }
        int n2 = n >> 16 & 0xFF;
        int n3 = n >> 8 & 0xFF;
        int n4 = n & 0xFF;
        float f = (float)n2 / 255.0f;
        float f2 = (float)n3 / 255.0f;
        float f3 = (float)n4 / 255.0f;
        return class_0864.lllIIIllIIIIlllIlIIllIIll(f, f2, f3);
    }

    private static int[] lllIIIllIIIIlllIlIIllIIll(String string, String[] arrstring, int n) {
        for (int i = 0; i < arrstring.length; ++i) {
            String string2 = arrstring[i];
            string2 = string + string2;
            int[] arrn = class_1689.lllIlIIlIIIlIlIIIllIlllIl(string2, n);
            if (arrn == null) continue;
            return arrn;
        }
        return null;
    }

    private static int[] lllIlIIlIIIlIlIIIllIlllIl(String string, int n) {
        try {
            ResourceLocation class_17732 = new ResourceLocation(string);
            InputStream inputStream = Config.lllIIIllIIIIlllIlIIllIIll(class_17732);
            if (inputStream == null) {
                return null;
            }
            int[] arrn = class_0231.lllIIIllIIIIlllIlIIllIIll(Config.lIIIlIIIlIlllIllIIIlIIIlI(), class_17732);
            if (arrn == null) {
                return null;
            }
            if (n > 0 && arrn.length != n) {
                Config.lIlllIlllIIIIlIIlllIllIII("Invalid custom colors length: " + arrn.length + ", path: " + string);
                return null;
            }
            Config.lIlllIlllIIIIlIIlllIllIII("Loading custom colors: " + string);
            return arrn;
        }
        catch (FileNotFoundException fileNotFoundException) {
            return null;
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return null;
        }
    }

    public static void lllIlIIlIIIlIlIIIllIlllIl() {
        lIlIlIIlIIIIlIIIIIlllIIII = IlIIIIIllllllIIlllIllllll == null && lIlllIlllIIIIlIIlllIllIII == null && IIIllIIlIIIIIIlIlIIllIIlI == null && lIllllIIlIIIlIllllllIIIll == null && IllIIlllllllIIlIIlIIIIlIl == null && Config.IIIIIllIlIllIlIlIIlIllIIl() && Config.lIIlllIIlIlIlIIIlIlllIIll();
    }

    public static int lllIIIllIIIIlllIlIIllIIll(Block class_05492, class_1843 class_18432, int n, int n2, int n3) {
        int n4;
        int n5;
        int n6;
        if (lIlIlIIlIIIIlIIIIIlllIIII) {
            return class_05492.lIlllIlllIIIIlIIlllIllIII(class_18432, n, n2, n3);
        }
        int[] arrn = null;
        int[] arrn2 = null;
        if (IllIIlllllllIIlIIlIIIIlIl != null) {
            n6 = Block.lllIIIllIIIIlllIlIIllIIll(class_05492);
            if (n6 >= 0 && n6 < 256) {
                int n7;
                int[] arrn3 = IllIIlllllllIIlIIlIIIIlIl[n6];
                n5 = 1;
                if (arrn3.length > 1) {
                    n4 = class_18432.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
                    n7 = arrn3[n4];
                } else {
                    n7 = arrn3[0];
                }
                if (n7 >= 0) {
                    arrn = IIIllIllIIlIlIlIlIllllIIl[n7];
                }
            }
            if (arrn != null) {
                if (Config.lIIlllIIlIlIlIIIlIlllIIll()) {
                    return class_1689.lllIIIllIIIIlllIlIIllIIll(class_05492, class_18432, n, n2, n3, arrn, arrn, 0, 0);
                }
                return class_1689.lllIIIllIIIIlllIlIIllIIll(arrn, class_18432, n, n2, n3);
            }
        }
        n6 = Config.IIIIIllIlIllIlIlIIlIllIIl();
        boolean bl = false;
        n5 = 0;
        n4 = 0;
        if (class_05492 != Blocks.IlIllllllIIlIIllllIIlIIIl && class_05492 != Blocks.IlIlIIlllIllllllllIIIlIlI) {
            if (class_05492 == Blocks.lIlIlIIlIIIIlIIIIIlllIIII) {
                n5 = 2;
                bl = Config.lIIlllIIlIlIlIIIlIlllIIll();
                n4 = class_18432.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
                if ((n4 & 3) == 1) {
                    arrn = lIlllIlllIIIIlIIlllIllIII;
                } else if ((n4 & 3) == 2) {
                    arrn = IlIIIIIllllllIIlllIllllll;
                } else {
                    arrn = IlIllllllIIlIIllllIIlIIIl;
                    arrn2 = n6 != 0 ? lIllllIIlIIIlIllllllIIIll : arrn;
                }
            } else if (class_05492 == Blocks.lIIlIlllIIlIIIIlIlIIIIlll) {
                n5 = 2;
                bl = Config.lIIlllIIlIlIlIIIlIlllIIll();
                arrn = IlIllllllIIlIIllllIIlIIIl;
                arrn2 = n6 != 0 ? lIllllIIlIIIlIllllllIIIll : arrn;
            }
        } else {
            n5 = 1;
            bl = Config.lIIlllIIlIlIlIIIlIlllIIll();
            arrn = lllIIIllIIIIlllIlIIllIIll;
            arrn2 = n6 != 0 ? IIIllIIlIIIIIIlIlIIllIIlI : arrn;
        }
        if (bl) {
            return class_1689.lllIIIllIIIIlllIlIIllIIll(class_05492, class_18432, n, n2, n3, arrn, arrn2, n5, n4);
        }
        if (arrn2 != arrn && class_18432.a_(n, n3) == class_0672.IlIIIlIIIIllIIIllIIIIIIll) {
            arrn = arrn2;
        }
        return arrn != null ? class_1689.lllIIIllIIIIlllIlIIllIIll(arrn, class_18432, n, n2, n3) : class_05492.lIlllIlllIIIIlIIlllIllIII(class_18432, n, n2, n3);
    }

    private static int lllIIIllIIIIlllIlIIllIIll(Block class_05492, class_1843 class_18432, int n, int n2, int n3, int[] arrn, int[] arrn2, int n4, int n5) {
        int n6;
        int n7;
        int n8 = 0;
        int n9 = 0;
        int n10 = 0;
        for (n7 = n - 1; n7 <= n + 1; ++n7) {
            for (n6 = n3 - 1; n6 <= n3 + 1; ++n6) {
                int n11;
                int[] arrn3 = arrn;
                if (arrn2 != arrn && class_18432.a_(n7, n6) == class_0672.IlIIIlIIIIllIIIllIIIIIIll) {
                    arrn3 = arrn2;
                }
                boolean bl = false;
                if (arrn3 == null) {
                    switch (n4) {
                        case 1: {
                            n11 = class_18432.a_(n7, n6).lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3);
                            break;
                        }
                        case 2: {
                            if ((n5 & 3) == 1) {
                                n11 = class_0828.lllIIIllIIIIlllIlIIllIIll();
                                break;
                            }
                            if ((n5 & 3) == 2) {
                                n11 = class_0828.lllIlIIlIIIlIlIIIllIlllIl();
                                break;
                            }
                            n11 = class_18432.a_(n7, n6).IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
                            break;
                        }
                        default: {
                            n11 = class_05492.lIlllIlllIIIIlIIlllIllIII(class_18432, n7, n2, n6);
                            break;
                        }
                    }
                } else {
                    n11 = class_1689.lllIIIllIIIIlllIlIIllIIll(arrn3, class_18432, n7, n2, n6);
                }
                n8 += n11 >> 16 & 0xFF;
                n9 += n11 >> 8 & 0xFF;
                n10 += n11 & 0xFF;
            }
        }
        n7 = n8 / 9;
        n6 = n9 / 9;
        int n12 = n10 / 9;
        return n7 << 16 | n6 << 8 | n12;
    }

    public static int lllIlIIlIIIlIlIIIllIlllIl(Block class_05492, class_1843 class_18432, int n, int n2, int n3) {
        return class_05492.lIllllIIlIIIlIllllllIIIll() != class_1855.IllIIlllllllIIlIIlIIIIlIl ? class_05492.lIlllIlllIIIIlIIlllIllIII(class_18432, n, n2, n3) : (lllIlIIlIIIlIlIIIllIlllIl != null ? (Config.lIIlllIIlIlIlIIIlIlllIIll() ? class_1689.lllIIIllIIIIlllIlIIllIIll(lllIlIIlIIIlIlIIIllIlllIl, class_18432, n, n2, n3, 3, 1) : class_1689.lllIIIllIIIIlllIlIIllIIll(lllIlIIlIIIlIlIIIllIlllIl, class_18432, n, n2, n3)) : (!Config.IIIIIllIlIllIlIlIIlIllIIl() ? 0xFFFFFF : class_05492.lIlllIlllIIIIlIIlllIllIII(class_18432, n, n2, n3)));
    }

    private static int lllIIIllIIIIlllIlIIllIIll(int[] arrn, class_1843 class_18432, int n, int n2, int n3) {
        class_0672 class_06722 = class_18432.a_(n, n3);
        double d = MathHelper.clamp_float(class_06722.lllIIIllIIIIlllIlIIllIIll(n, n2, n3), 0.0f, 1.0f);
        double d2 = MathHelper.clamp_float(class_06722.IIIllIllIIlIlIlIlIllllIIl(), 0.0f, 1.0f);
        int n4 = (int)((1.0 - d) * 255.0);
        int n5 = (int)((1.0 - (d2 *= d)) * 255.0);
        return arrn[n5 << 8 | n4] & 0xFFFFFF;
    }

    public static void lllIIIllIIIIlllIlIIllIIll(class_0323 class_03232) {
        if (IIlllIlIlllIllIIIlllIIlIl >= 0) {
            int n = IIlllIlIlllIllIIIlllIIlIl;
            int n2 = n >> 16 & 0xFF;
            int n3 = n >> 8 & 0xFF;
            int n4 = n & 0xFF;
            float f = (float)n2 / 255.0f;
            float f2 = (float)n3 / 255.0f;
            float f3 = (float)n4 / 255.0f;
            class_03232.lllIlIIlIIIlIlIIIllIlllIl(f, f2, f3);
        }
    }

    public static void lllIlIIlIIIlIlIIIllIlllIl(class_0323 class_03232) {
        if (lIIlIIIIIlIlllIlIIlIlIlll != null) {
            int n = lIIlIIIIIlIlllIlIIlIlIlll[IIlIIlIlIlIllIIlIlIIIIlll.nextInt(lIIlIIIIIlIlllIlIIlIlIlll.length)];
            int n2 = n >> 16 & 0xFF;
            int n3 = n >> 8 & 0xFF;
            int n4 = n & 0xFF;
            float f = (float)n2 / 255.0f;
            float f2 = (float)n3 / 255.0f;
            float f3 = (float)n4 / 255.0f;
            class_03232.lllIlIIlIIIlIlIIIllIlllIl(f, f2, f3);
        }
    }

    public static void lllIIIllIIIIlllIlIIllIIll(class_0323 class_03232, class_1843 class_18432, double d, double d2, double d3) {
        int n;
        int n2;
        if (lllllIlllIIllIlIIlIIIllII != null && (n2 = class_1689.lllIIIllIIIIlllIlIIllIIll(n = class_18432.IlIllllllIIlIIllllIIlIIIl((int)d, (int)d2, (int)d3))) != -1) {
            int n3 = n2 >> 16 & 0xFF;
            int n4 = n2 >> 8 & 0xFF;
            int n5 = n2 & 0xFF;
            float f = (float)n3 / 255.0f;
            float f2 = (float)n4 / 255.0f;
            float f3 = (float)n5 / 255.0f;
            class_03232.lllIlIIlIIIlIlIIIllIlllIl(f, f2, f3);
        }
    }

    public static int lllIIIllIIIIlllIlIIllIIll(int n) {
        return lllllIlllIIllIlIIlIIIllII == null ? -1 : (n >= 0 && n <= 15 ? lllllIlllIIllIlIIlIIIllII[n] & 0xFFFFFF : -1);
    }

    public static void lllIIIllIIIIlllIlIIllIIll(class_0323 class_03232, class_1843 class_18432) {
        if (lllIlIIlIIIlIlIIIllIlllIl != null) {
            int n = (int)class_03232.IlIIlllllIIlIlIlllllIllll;
            int n2 = (int)class_03232.llIIlIlIlllIIllIlIlllIllI;
            int n3 = (int)class_03232.IllIIIIllIIllIllIlllIlIIl;
            int n4 = class_1689.lllIlIIlIIIlIlIIIllIlllIl(Blocks.IllIIIllIIIIlIlIlIllIIlll, class_18432, n, n2, n3);
            int n5 = n4 >> 16 & 0xFF;
            int n6 = n4 >> 8 & 0xFF;
            int n7 = n4 & 0xFF;
            float f = (float)n5 / 255.0f;
            float f2 = (float)n6 / 255.0f;
            float f3 = (float)n7 / 255.0f;
            if (IlIIIlIIIIllIIIllIIIIIIll >= 0) {
                int n8 = IlIIIlIIIIllIIIllIIIIIIll >> 16 & 0xFF;
                int n9 = IlIIIlIIIIllIIIllIIIIIIll >> 8 & 0xFF;
                int n10 = IlIIIlIIIIllIIIllIIIIIIll & 0xFF;
                f *= (float)n8 / 255.0f;
                f2 *= (float)n9 / 255.0f;
                f3 *= (float)n10 / 255.0f;
            }
            class_03232.lllIlIIlIIIlIlIIIllIlllIl(f, f2, f3);
        }
    }

    public static int IlIllllllIIlIIllllIIlIIIl() {
        return lIlIllIIlIIlIIlIIlIIlIIll < 0 ? Blocks.IlIIIIIIIIIIlIIlllIIIlIlI.llIIlIllIllllIlIIIIlIIlll() : lIlIllIIlIIlIIlIIlIIlIIll;
    }

    public static class_0864 lllIIIllIIIIlllIlIIllIIll(class_0864 class_08642) {
        return llIIlIllIllllIlIIIIlIIlll == null ? class_08642 : llIIlIllIllllIlIIIIlIIlll;
    }

    public static class_0864 lllIlIIlIIIlIlIIIllIlllIl(class_0864 class_08642) {
        return llIllllIlIllIIIlIllIIlIlI == null ? class_08642 : llIllllIlIllIIIlIllIIlIlI;
    }

    public static class_0864 IlIllllllIIlIIllllIIlIIIl(class_0864 class_08642) {
        return lIlllIlllIlIIIIlllIlIlIIl == null ? class_08642 : lIlllIlllIlIIIIlllIlIlIIl;
    }

    public static class_0864 lllIIIllIIIIlllIlIIllIIll(class_0864 class_08642, class_1843 class_18432, double d, double d2, double d3) {
        if (IllIIIllIIIIlIlIlIllIIlll == null) {
            return class_08642;
        }
        int n = class_1689.lllIIIllIIIIlllIlIIllIIll(IllIIIllIIIIlIlIlIllIIlll, class_18432, d, d2, d3, 10, 1);
        int n2 = n >> 16 & 0xFF;
        int n3 = n >> 8 & 0xFF;
        int n4 = n & 0xFF;
        float f = (float)n2 / 255.0f;
        float f2 = (float)n3 / 255.0f;
        float f3 = (float)n4 / 255.0f;
        float f4 = (float)class_08642.lllIIIllIIIIlllIlIIllIIll / 0.5f;
        float f5 = (float)class_08642.lllIlIIlIIIlIlIIIllIlllIl / 0.66275f;
        float f6 = (float)class_08642.IlIllllllIIlIIllllIIlIIIl;
        return class_0864.lllIIIllIIIIlllIlIIllIIll(f *= f4, f2 *= f5, f3 *= f6);
    }

    public static class_0864 lllIlIIlIIIlIlIIIllIlllIl(class_0864 class_08642, class_1843 class_18432, double d, double d2, double d3) {
        if (lIIIIlIlIIlllllIIllIIlIII == null) {
            return class_08642;
        }
        int n = class_1689.lllIIIllIIIIlllIlIIllIIll(lIIIIlIlIIlllllIIllIIlIII, class_18432, d, d2, d3, 10, 1);
        int n2 = n >> 16 & 0xFF;
        int n3 = n >> 8 & 0xFF;
        int n4 = n & 0xFF;
        float f = (float)n2 / 255.0f;
        float f2 = (float)n3 / 255.0f;
        float f3 = (float)n4 / 255.0f;
        float f4 = (float)class_08642.lllIIIllIIIIlllIlIIllIIll / 0.753f;
        float f5 = (float)class_08642.lllIlIIlIIIlIlIIIllIlllIl / 0.8471f;
        float f6 = (float)class_08642.IlIllllllIIlIIllllIIlIIIl;
        return class_0864.lllIIIllIIIIlllIlIIllIIll(f *= f4, f2 *= f5, f3 *= f6);
    }

    private static int[] lllIIIllIIIIlllIlIIllIIll(Properties properties, String string, String string2, String string3) {
        int[] arrn = new int[32];
        Arrays.fill(arrn, -1);
        int n = 0;
        Set<Object> set = properties.keySet();
        for (String string4 : set) {
            String string5 = properties.getProperty(string4);
            if (!string4.startsWith(string2)) continue;
            String string6 = class_2254.lIlllIlllIIIIlIIlllIllIII(string4, string2);
            int n2 = Config.lllIIIllIIIIlllIlIIllIIll(string6, -1);
            int n3 = class_1689.lllIlIIlIIIlIlIIIllIlllIl(string5);
            if (n2 >= 0 && n2 < arrn.length && n3 >= 0) {
                arrn[n2] = n3;
                ++n;
                continue;
            }
            class_1689.lIlllIlllIIIIlIIlllIllIII("Invalid color: " + string4 + " = " + string5);
        }
        if (n <= 0) {
            return null;
        }
        class_1689.IlIllllllIIlIIllllIIlIIIl(string3 + " colors: " + n);
        return arrn;
    }

    public static int lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        if (IlIIlllllIIlIlIlllllIllll == null) {
            return n2;
        }
        if (n >= 0 && n < IlIIlllllIIlIlIlllllIllll.length) {
            int n3 = IlIIlllllIIlIlIlllllIllll[n];
            return n3 < 0 ? n2 : n3;
        }
        return n2;
    }

    private static int lllIlIIlIIIlIlIIIllIlllIl(String string) {
        if (string == null) {
            return -1;
        }
        string = string.trim();
        try {
            int n = Integer.parseInt(string, 16) & 0xFFFFFF;
            return n;
        }
        catch (NumberFormatException numberFormatException) {
            return -1;
        }
    }

    public static class_0864 lllIIIllIIIIlllIlIIllIIll(class_1843 class_18432, double d, double d2, double d3) {
        if (llIIlllIllIllllIIIlIIIIII == null) {
            return null;
        }
        int n = class_1689.lllIIIllIIIIlllIlIIllIIll(llIIlllIllIllllIIIlIIIIII, class_18432, d, d2, d3, 10, 1);
        int n2 = n >> 16 & 0xFF;
        int n3 = n >> 8 & 0xFF;
        int n4 = n & 0xFF;
        float f = (float)n2 / 255.0f;
        float f2 = (float)n3 / 255.0f;
        float f3 = (float)n4 / 255.0f;
        return class_0864.lllIIIllIIIIlllIlIIllIIll(f, f2, f3);
    }

    public static int lllIIIllIIIIlllIlIIllIIll(int[] arrn, class_1843 class_18432, double d, double d2, double d3, int n, int n2) {
        int n3;
        int n4;
        int n5;
        if (arrn == null) {
            return -1;
        }
        int n6 = (int)Math.floor(d);
        int n7 = (int)Math.floor(d2);
        int n8 = (int)Math.floor(d3);
        int n9 = n * n2 / 2;
        int n10 = 0;
        int n11 = 0;
        int n12 = 0;
        int n13 = 0;
        for (n5 = n6 - n9; n5 <= n6 + n9; n5 += n2) {
            for (n4 = n8 - n9; n4 <= n8 + n9; n4 += n2) {
                n3 = class_1689.lllIIIllIIIIlllIlIIllIIll(arrn, class_18432, n5, n7, n4);
                n10 += n3 >> 16 & 0xFF;
                n11 += n3 >> 8 & 0xFF;
                n12 += n3 & 0xFF;
                ++n13;
            }
        }
        n5 = n10 / n13;
        n4 = n11 / n13;
        n3 = n12 / n13;
        return n5 << 16 | n4 << 8 | n3;
    }

    public static int lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
        if (f <= 0.0f) {
            return n2;
        }
        if (f >= 1.0f) {
            return n;
        }
        float f2 = 1.0f - f;
        int n3 = n >> 16 & 0xFF;
        int n4 = n >> 8 & 0xFF;
        int n5 = n & 0xFF;
        int n6 = n2 >> 16 & 0xFF;
        int n7 = n2 >> 8 & 0xFF;
        int n8 = n2 & 0xFF;
        int n9 = (int)((float)n3 * f + (float)n6 * f2);
        int n10 = (int)((float)n4 * f + (float)n7 * f2);
        int n11 = (int)((float)n5 * f + (float)n8 * f2);
        return n9 << 16 | n10 << 8 | n11;
    }

    private static int lllIlIIlIIIlIlIIIllIlllIl(int n, int n2) {
        int n3 = n >> 16 & 0xFF;
        int n4 = n >> 8 & 0xFF;
        int n5 = n & 0xFF;
        int n6 = n2 >> 16 & 0xFF;
        int n7 = n2 >> 8 & 0xFF;
        int n8 = n2 & 0xFF;
        int n9 = (n3 + n6) / 2;
        int n10 = (n4 + n7) / 2;
        int n11 = (n5 + n8) / 2;
        return n9 << 16 | n10 << 8 | n11;
    }

    public static int lllIIIllIIIIlllIlIIllIIll(class_0895 class_08952, class_1843 class_18432, int n, int n2, int n3) {
        if (IlIlIIlllIIlIllIIIlllllIl == null) {
            return class_08952.lIlllIlllIIIIlIIlllIllIII(class_18432, n, n2, n3);
        }
        int n4 = class_18432.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        if (n4 < 0) {
            n4 = 0;
        }
        if (n4 >= IlIlIIlllIIlIllIIIlllllIl.length) {
            n4 = IlIlIIlllIIlIllIIIlllllIl.length - 1;
        }
        return IlIlIIlllIIlIllIIIlllllIl[n4];
    }

    public static boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, float f, int[] arrn, boolean bl) {
        if (class_13342 == null) {
            return false;
        }
        if (llIIllIllIlIIlIIllIllllll == null) {
            return false;
        }
        if (((Boolean) LunarClient.getInstance().getSettingsManager().IlIlIIlllIIlIllIIIlllllIl.lIlllIlllIIIIlIIlllIllIII()).booleanValue() && ((Boolean) LunarClient.getInstance().getSettingsManager().lIlIlIIlIIIIlIIIIIlllIIII.lIlllIlllIIIIlIIlllIllIII()).booleanValue()) {
            return false;
        }
        if (!Config.IlIIlIIlllllIlIIlIlIlIlIl()) {
            return false;
        }
        int n = class_13342.IlIlIIlllIIlIllIIIlllllIl.IIIllIllIIlIlIlIlIllllIIl;
        if (n >= -1 && n <= 1) {
            int n2 = n + 1;
            float[][] arrf = llIIllIllIlIIlIIllIllllll[n2];
            if (arrf == null) {
                return false;
            }
            int n3 = lllIIlIIIllllllIIIIlIlIlI[n2];
            if (bl && n3 < 64) {
                return false;
            }
            int n4 = arrf.length / n3;
            if (n4 < 16) {
                Config.lllIlIIlIIIlIlIIIllIlllIl("Invalid lightmap width: " + n4 + " for: /environment/lightmap" + n + ".png");
                class_1689.llIIllIllIlIIlIIllIllllll[n2] = null;
                return false;
            }
            int n5 = 0;
            if (bl) {
                n5 = n4 * 16 * 2;
            }
            float f2 = 1.1666666f * (class_13342.lllIlIIlIIIlIlIIIllIlllIl(1.0f) - 0.2f);
            if (class_13342.IlIlllIIIIIIlIIllIIllIlll > 0) {
                f2 = 1.0f;
            }
            f2 = Config.lllIIIllIIIIlllIlIIllIIll(f2);
            float f3 = f2 * (float)(n4 - 1);
            float f4 = Config.lllIIIllIIIIlllIlIIllIIll(f + 0.5f) * (float)(n4 - 1);
            float f5 = Config.lllIIIllIIIIlllIlIIllIIll(Config.getGameSettings().lllIIIllIIIIlllIlIIllIIll());
            boolean bl2 = f5 > 1.0E-4f;
            class_1689.lllIIIllIIIIlllIlIIllIIll(arrf, f3, n5, n4, IlIlllIIIIIIlIIllIIllIlll);
            class_1689.lllIIIllIIIIlllIlIIllIIll(arrf, f4, n5 + 16 * n4, n4, IlIlIIlIlIllIIlIlIIllIIIl);
            float[] arrf2 = new float[3];
            for (int i = 0; i < 16; ++i) {
                for (int j = 0; j < 16; ++j) {
                    int n6;
                    for (n6 = 0; n6 < 3; ++n6) {
                        float f6 = Config.lllIIIllIIIIlllIlIIllIIll(IlIlllIIIIIIlIIllIIllIlll[i][n6] + IlIlIIlIlIllIIlIlIIllIIIl[j][n6]);
                        if (bl2) {
                            float f7 = 1.0f - f6;
                            f7 = 1.0f - f7 * f7 * f7 * f7;
                            f6 = f5 * f7 + (1.0f - f5) * f6;
                        }
                        arrf2[n6] = f6;
                    }
                    n6 = (int)(arrf2[0] * 255.0f);
                    int n7 = (int)(arrf2[1] * 255.0f);
                    int n8 = (int)(arrf2[2] * 255.0f);
                    arrn[i * 16 + j] = 0xFF000000 | n6 << 16 | n7 << 8 | n8;
                }
            }
            return true;
        }
        return false;
    }

    private static void lllIIIllIIIIlllIlIIllIIll(float[][] arrf, float f, int n, int n2, float[][] arrf2) {
        int n3;
        int n4 = (int)Math.floor(f);
        if (n4 == (n3 = (int)Math.ceil(f))) {
            for (int i = 0; i < 16; ++i) {
                float[] arrf3 = arrf[n + i * n2 + n4];
                float[] arrf4 = arrf2[i];
                for (int j = 0; j < 3; ++j) {
                    arrf4[j] = arrf3[j];
                }
            }
        } else {
            float f2 = 1.0f - (f - (float)n4);
            float f3 = 1.0f - ((float)n3 - f);
            for (int i = 0; i < 16; ++i) {
                float[] arrf5 = arrf[n + i * n2 + n4];
                float[] arrf6 = arrf[n + i * n2 + n3];
                float[] arrf7 = arrf2[i];
                for (int j = 0; j < 3; ++j) {
                    arrf7[j] = arrf5[j] * f2 + arrf6[j] * f3;
                }
            }
        }
    }

    public static class_0864 lllIIIllIIIIlllIlIIllIIll(class_0864 class_08642, class_0564 class_05642, float f) {
        int n = class_05642.IlIlIIlllIIlIllIIIlllllIl.IIIllIllIIlIlIlIlIllllIIl;
        switch (n) {
            case -1: {
                class_08642 = class_1689.lllIIIllIIIIlllIlIIllIIll(class_08642);
                break;
            }
            case 0: {
                Minecraft class_06672 = Minecraft.getMinecraft();
                class_08642 = class_1689.lllIlIIlIIIlIlIIIllIlllIl(class_08642, (class_1843)class_06672.theWorld, class_06672.llIIlllIllIllllIIIlIIIIII.IlIIlllllIIlIlIlllllIllll, class_06672.llIIlllIllIllllIIIlIIIIII.llIIlIlIlllIIllIlIlllIllI + 1.0, class_06672.llIIlllIllIllllIIIlIIIIII.IllIIIIllIIllIllIlllIlIIl);
                break;
            }
            case 1: {
                class_08642 = class_1689.lllIlIIlIIIlIlIIIllIlllIl(class_08642);
            }
        }
        return class_08642;
    }

    public static class_0864 lllIIIllIIIIlllIlIIllIIll(class_0864 class_08642, class_0564 class_05642, class_1965 class_19652, float f) {
        int n = class_05642.IlIlIIlllIIlIllIIIlllllIl.IIIllIllIIlIlIlIlIllllIIl;
        switch (n) {
            case 0: {
                Minecraft class_06672 = Minecraft.getMinecraft();
                class_08642 = class_1689.lllIIIllIIIIlllIlIIllIIll(class_08642, (class_1843)class_06672.theWorld, class_06672.llIIlllIllIllllIIIlIIIIII.IlIIlllllIIlIlIlllllIllll, class_06672.llIIlllIllIllllIIIlIIIIII.llIIlIlIlllIIllIlIlllIllI + 1.0, class_06672.llIIlllIllIllllIIIlIIIIII.IllIIIIllIIllIllIlllIlIIl);
                break;
            }
            case 1: {
                class_08642 = class_1689.IlIllllllIIlIIllllIIlIIIl(class_08642);
            }
        }
        return class_08642;
    }

    private static void IlIllllllIIlIIllllIIlIIIl(String string) {
        Config.lllIIIllIIIIlllIlIIllIIll("CustomColors: " + string);
    }

    private static void lIlllIlllIIIIlIIlllIllIII(String string) {
        Config.lllIlIIlIIIlIlIIIllIlllIl("CustomColors: " + string);
    }
}

