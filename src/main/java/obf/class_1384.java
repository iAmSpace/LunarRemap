package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.commons.io.IOUtils
 */
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.nio.IntBuffer;
import javax.imageio.ImageIO;

import optifine.Config;
import org.apache.commons.io.IOUtils;

public class class_1384 {
    public static final String lllIIIllIIIIlllIlIIllIIll = "grass_top";
    public static final String lllIlIIlIIIlIlIIIllIlllIl = "stone";
    public static final String IlIllllllIIlIIllllIIlIIIl = "dirt";
    public static final String lIlllIlllIIIIlIIlllIllIII = "grass_side";
    public static final String IlIIIIIllllllIIlllIllllll = "stone_slab_side";
    public static final String lIllllIIlIIIlIllllllIIIll = "stone_slab_top";
    public static final String IIIllIIlIIIIIIlIlIIllIIlI = "bedrock";
    public static final String IllIIlllllllIIlIIlIIIIlIl = "sand";
    public static final String IIIllIllIIlIlIlIlIllllIIl = "gravel";
    public static final String IllIIIllIIIIlIlIlIllIIlll = "log_oak";
    public static final String lIIIIlIlIIlllllIIllIIlIII = "log_oak_top";
    public static final String llIIlllIllIllllIIIlIIIIII = "gold_ore";
    public static final String llIIllIllIlIIlIIllIllllll = "iron_ore";
    public static final String lllIIlIIIllllllIIIIlIlIlI = "coal_ore";
    public static final String IlIlllIIIIIIlIIllIIllIlll = "obsidian";
    public static final String IlIlIIlIlIllIIlIlIIllIIIl = "grass_side_overlay";
    public static final String lllllIlllIIllIlIIlIIIllII = "snow";
    public static final String IlIlIIlllIIlIllIIIlllllIl = "grass_side_snowed";
    public static final String lIIlIIIIIlIlllIlIIlIlIlll = "mycelium_side";
    public static final String lIlIlIIlIIIIlIIIIIlllIIII = "mycelium_top";
    public static final String IlIIIlIIIIllIIIllIIIIIIll = "diamond_ore";
    public static final String IIlllIlIlllIllIIIlllIIlIl = "redstone_ore";
    public static final String lIlIllIIlIIlIIlIIlIIlIIll = "lapis_ore";
    public static final String llIIlIllIllllIlIIIIlIIlll = "leaves_oak";
    public static final String llIllllIlIllIIIlIllIIlIlI = "leaves_oak_opaque";
    public static final String lIlllIlllIlIIIIlllIlIlIIl = "leaves_jungle";
    public static final String IlIIlllllIIlIlIlllllIllll = "leaves_jungle_opaque";
    public static final String llIIlIlIlllIIllIlIlllIllI = "cactus_side";
    public static final String IllIIIIllIIllIllIlllIlIIl = "clay";
    public static final String IIIIIIIIlIllIIllIIlllIllI = "farmland_wet";
    public static final String IIlIIlIlIlIllIIlIlIIIIlll = "farmland_dry";
    public static final String llIIIlllIlllIlIllIIIIllIl = "netherrack";
    public static final String IIIIlIllIlIIlIIlIllIlIlll = "soul_sand";
    public static final String IlIlIIlllIllllllllIIIlIlI = "glowstone";
    public static final String llllIIIIlIIIlIIIIIIlIllll = "log_spruce";
    public static final String llIIIIllIIIIIIIlIIIlIIIIl = "log_birch";
    public static final String IIllIllIIllIIlllIIIlIlllI = "leaves_spruce";
    public static final String llllllIlIllllIlIlIlIIIIlI = "leaves_spruce_opaque";
    public static final String lIlIIllllIlIIIIllIIIIlIIl = "log_jungle";
    public static final String llIlllIIllIlllIlIlIlIIIll = "end_stone";
    public static final String IIIIlIIlIIIllIIIIllIIIlII = "sandstone_top";
    public static final String lllIIIIIIlIlllIIlIlIIIllI = "sandstone_bottom";
    public static final String llIIlIIllIIllIlIIllIIllII = "redstone_lamp_off";
    public static final String lIlIlIIIIIIlIIllllIlIIllI = "redstone_lamp_on";
    public static final String IllllIIIIlIIlIIIIlllIIIIl = "water_still";
    public static final String llllIlIIIIIIIIIlllIIlIIIl = "water_flow";
    public static final String IIIIlIlIIlIIIIlIlllIlIIII = "lava_still";
    public static final String lllIIIIlIlIIlIIlllIIIIIIl = "lava_flow";
    public static final String llIlIIlllIIIIIllIIlIlIIII = "fire_layer_0";
    public static final String IllIIIlllllIlIlllIlllllII = "fire_layer_1";
    public static final String llIlllIlIIllIlIIIIllIIlIl = "portal";
    public static final String lIIIllIIIIIllllIlIlIllIll = "glass";
    public static final String lIIIlIIIlIlllIllIIIlIIIlI = "glass_pane_top";
    public static final String lIIlIlllIllIlIlllIIIIIIII = "compass";
    public static final String IIlIllIIlllllIIlIIllllIIl = "clock";
    public static class_2102 IllllIIlIIIllIlllIlllIllI;
    public static class_2102 IllIlIlIIIlllIIllIIIIlIll;
    public static class_2102 IlIIIlIllIIIllIIIIlIIlIll;
    public static class_2102 llllIIllIlIlllllllIIlIIlI;
    public static class_2102 IlllIIlllllllIIllIlIllllI;
    public static class_2102 IlllIIIllllIIllIllIlIIlIl;
    public static class_2102 lllIIIlIIlIlIllIIIIIlIIll;
    public static class_2102 IIIlIlIllIlllllIlIllllllI;
    public static class_2102 IIIIlIllIlIIIIIllllIIlllI;
    public static class_2102 llllIlIIllIIlllllIIllIIll;
    public static class_2102 IlIlIllIIlIIIIlllIlIllIlI;
    public static class_2102 IlIIllIlIlIllIIIlIIlIlIIl;
    public static class_2102 lIlIIllIllIIIIIlIllllIIIl;
    public static class_2102 lIlllIIllIIIIIIlIlIIlIllI;
    public static class_2102 llIIIlIlIlIIlIllIIIllIlIl;
    public static class_2102 lIIlIIlIllIlIIlIlIIlIlIlI;
    public static class_2102 llIIIIIlIIlIIIIllIIIlIIII;
    public static class_2102 lIlIlIIllIIIlllIllIIlIllI;
    private static IntBuffer IlIIIIIllIlllIIIIlIIIllIl;

    public static void lllIIIllIIIIlllIlIIllIIll() {
        class_1511 class_15112 = class_1511.lIllllIIlIIIlIllllllIIIll;
        if (class_15112 != null) {
            IllllIIlIIIllIlllIlllIllI = class_15112.lIlllIlllIIIIlIIlllIllIII(lllIIIllIIIIlllIlIIllIIll);
            IllIlIlIIIlllIIllIIIIlIll = class_15112.lIlllIlllIIIIlIIlllIllIII(lIlllIlllIIIIlIIlllIllIII);
            IlIIIlIllIIIllIIIIlIIlIll = class_15112.lIlllIlllIIIIlIIlllIllIII(IlIlIIlIlIllIIlIlIIllIIIl);
            llllIIllIlIlllllllIIlIIlI = class_15112.lIlllIlllIIIIlIIlllIllIII(lllllIlllIIllIlIIlIIIllII);
            IlllIIlllllllIIllIlIllllI = class_15112.lIlllIlllIIIIlIIlllIllIII(IlIlIIlllIIlIllIIIlllllIl);
            IlllIIIllllIIllIllIlIIlIl = class_15112.lIlllIlllIIIIlIIlllIllIII(lIIlIIIIIlIlllIlIIlIlIlll);
            lllIIIlIIlIlIllIIIIIlIIll = class_15112.lIlllIlllIIIIlIIlllIllIII(lIlIlIIlIIIIlIIIIIlllIIII);
            IIIlIlIllIlllllIlIllllllI = class_15112.lIlllIlllIIIIlIIlllIllIII(IllllIIIIlIIlIIIIlllIIIIl);
            IIIIlIllIlIIIIIllllIIlllI = class_15112.lIlllIlllIIIIlIIlllIllIII(llllIlIIIIIIIIIlllIIlIIIl);
            llllIlIIllIIlllllIIllIIll = class_15112.lIlllIlllIIIIlIIlllIllIII(IIIIlIlIIlIIIIlIlllIlIIII);
            IlIlIllIIlIIIIlllIlIllIlI = class_15112.lIlllIlllIIIIlIIlllIllIII(lllIIIIlIlIIlIIlllIIIIIIl);
            lIlIIllIllIIIIIlIllllIIIl = class_15112.lIlllIlllIIIIlIIlllIllIII(llIlIIlllIIIIIllIIlIlIIII);
            lIlllIIllIIIIIIlIlIIlIllI = class_15112.lIlllIlllIIIIlIIlllIllIII(IllIIIlllllIlIlllIlllllII);
            IlIIllIlIlIllIIIlIIlIlIIl = class_15112.lIlllIlllIIIIlIIlllIllIII(llIlllIlIIllIlIIIIllIIlIl);
            llIIIlIlIlIIlIllIIIllIlIl = class_15112.lIlllIlllIIIIlIIlllIllIII(lIIIllIIIIIllllIlIlIllIll);
            lIIlIIlIllIlIIlIlIIlIlIlI = class_15112.lIlllIlllIIIIlIIlllIllIII(lIIIlIIIlIlllIllIIIlIIIlI);
            class_1511 class_15113 = class_1511.IIIllIIlIIIIIIlIlIIllIIlI;
            if (class_15113 != null) {
                llIIIIIlIIlIIIIllIIIlIIII = class_15113.lIlllIlllIIIIlIIlllIllIII(lIIlIlllIllIlIlllIIIIIIII);
                lIlIlIIllIIIlllIllIIlIllI = class_15113.lIlllIlllIIIIlIIlllIllIII(IIlIllIIlllllIIlIIllllIIl);
            }
        }
    }

    public static BufferedImage lllIIIllIIIIlllIlIIllIIll(String string, BufferedImage bufferedImage) {
        int n;
        int n2;
        if ((string.startsWith("/mob/zombie") || string.startsWith("/mob/pigzombie")) && (n2 = bufferedImage.getWidth()) == (n = bufferedImage.getHeight()) * 2) {
            BufferedImage bufferedImage2 = new BufferedImage(n2, n * 2, 2);
            Graphics2D graphics2D = bufferedImage2.createGraphics();
            graphics2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            graphics2D.drawImage(bufferedImage, 0, 0, n2, n, null);
            return bufferedImage2;
        }
        return bufferedImage;
    }

    public static class_1585 lllIIIllIIIIlllIlIIllIIll(class_2102 class_21022) {
        return class_21022 instanceof class_1585 ? (class_1585)class_21022 : null;
    }

    public static int lllIIIllIIIIlllIlIIllIIll(int n) {
        int n2;
        for (n2 = 1; n2 < n; n2 *= 2) {
        }
        return n2;
    }

    public static int lllIlIIlIIIlIlIIIllIlllIl(int n) {
        int n2 = 1;
        int n3 = 0;
        while (n2 < n) {
            n2 *= 2;
            ++n3;
        }
        return n3;
    }

    public static int IlIllllllIIlIIllllIIlIIIl(int n) {
        int n2 = 1;
        for (int i = 0; i < n; ++i) {
            n2 *= 2;
        }
        return n2;
    }

    public static void lllIlIIlIIIlIlIIIllIlllIl() {
        Config.lllIIIllIIIIlllIlIIllIIll("*** Reloading block textures ***");
        class_1379.IlIIIIIllllllIIlllIllllll();
        class_1511.lIllllIIlIIIlIllllllIIIll.IlIllllllIIlIIllllIIlIIIl(Config.lIIIlIIIlIlllIllIIIlIIIlI());
        class_1384.lllIIIllIIIIlllIlIIllIIll();
        class_1446.lllIIIllIIIIlllIlIIllIIll();
        class_1511.lIllllIIlIIIlIllllllIIIll.lIlllIlllIIIIlIIlllIllIII();
    }

    public static class_0211 lllIIIllIIIIlllIlIIllIIll(String string) {
        return class_1384.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation(string));
    }

    public static class_0211 lllIIIllIIIIlllIlIIllIIll(ResourceLocation class_17732) {
        class_0211 class_02112 = Config.lIIIllIIIIIllllIlIlIllIll().lllIlIIlIIIlIlIIIllIlllIl(class_17732);
        if (class_02112 != null) {
            return class_02112;
        }
        if (!Config.IlIllllllIIlIIllllIIlIIIl(class_17732)) {
            return null;
        }
        class_0995 class_09952 = new class_0995(class_17732);
        Config.lIIIllIIIIIllllIlIlIllIll().lllIIIllIIIIlllIlIIllIIll(class_17732, class_09952);
        return class_09952;
    }

    public static void lllIIIllIIIIlllIlIIllIIll(class_0947 class_09472) {
        if (class_1511.lIllllIIlIIIlIllllllIIIll != null) {
            Config.lllIIIllIIIIlllIlIIllIIll("*** Reloading custom textures ***");
            class_1065.lllIIIllIIIIlllIlIIllIIll();
            class_2057.lllIIIllIIIIlllIlIIllIIll();
            class_1379.IlIIIIIllllllIIlllIllllll();
            class_1384.lllIIIllIIIIlllIlIIllIIll();
            class_1446.lllIIIllIIIIlllIlIIllIIll();
            class_2057.lllIlIIlIIIlIlIIIllIlllIl();
            class_1689.lllIIIllIIIIlllIlIIllIIll();
            class_1065.lllIlIIlIIIlIlIIIllIlllIl();
            class_1630.lllIIIllIIIIlllIlIIllIIll();
            Config.IIIIIIIIlIllIIllIIlllIllI();
            Config.lIIIllIIIIIllllIlIlIllIll().lllIlIIlIIIlIlIIIllIlllIl();
        }
    }

    public static void lllIlIIlIIIlIlIIIllIlllIl(class_0947 class_09472) {
        class_1511.lIllllIIlIIIlIllllllIIIll.IlIllllllIIlIIllllIIlIIIl(class_09472);
        class_1511.IIIllIIlIIIIIIlIlIIllIIlI.IlIllllllIIlIIllllIIlIIIl(class_09472);
        class_1384.lllIIIllIIIIlllIlIIllIIll();
        class_1446.lllIIIllIIIIlllIlIIllIIll();
    }

    public static void IlIllllllIIlIIllllIIlIIIl() {
        Object object;
        Object object2;
        class_0947 class_09472 = Config.lIIIlIIIlIlllIllIIIlIIIlI();
        if (class_09472 instanceof class_1900) {
            object2 = (class_1900)class_09472;
            object = new class_0712();
            object2.lllIIIllIIIIlllIlIIllIIll((class_0334)object);
        }
        object2 = new class_1205();
        object = new ResourceLocation("optifine/TickableTextures");
        Config.lIIIllIIIIIllllIlIlIllIll().lllIIIllIIIIlllIlIIllIIll((ResourceLocation)object, (class_1420)object2);
    }

    public static String lllIIIllIIIIlllIlIIllIIll(String string, String string2) {
        String string3 = "assets/minecraft/";
        if (string.startsWith(string3)) {
            string = string.substring(string3.length());
            return string;
        }
        if (string.startsWith("./")) {
            string = string.substring(2);
            if (!string2.endsWith("/")) {
                string2 = string2 + "/";
            }
            string = string2 + string;
            return string;
        }
        if (string.startsWith("/~")) {
            string = string.substring(1);
        }
        String string4 = "mcpatcher/";
        if (string.startsWith("~/")) {
            string = string.substring(2);
            string = string4 + string;
            return string;
        }
        if (string.startsWith("/")) {
            string = string4 + string.substring(1);
            return string;
        }
        return string;
    }

    public static String lllIlIIlIIIlIlIIIllIlllIl(String string) {
        int n = string.lastIndexOf(47);
        return n < 0 ? "" : string.substring(0, n);
    }

    public static BufferedImage lllIIIllIIIIlllIlIIllIIll(InputStream inputStream) {
        BufferedImage bufferedImage;
        try {
            bufferedImage = ImageIO.read(inputStream);
        }
        finally {
            IOUtils.closeQuietly((InputStream)inputStream);
        }
        return bufferedImage;
    }

    static {
        IlIIIIIllIlllIIIIlIIIllIl = class_0994.lIlllIlllIIIIlIIlllIllIII(256);
    }
}

