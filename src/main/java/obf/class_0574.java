package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.Minecraft;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.client.renderer.OpenGlHelper;
import org.lwjgl.opengl.GL11;

public final class class_0574 {
    private static int[] lllIIIllIIIIlllIlIIllIIll = new int[]{0, 170, 43520, 43690, 0xAA0000, 0xAA00AA, 0xFFAA00, 0xAAAAAA, 0x555555, 0x5555FF, 0x55FF55, 0x55FFFF, 0xFF5555, 0xFF55FF, 0xFFFF55, 0xFFFFFF, 0, 42, 10752, 10794, 0x2A0000, 0x2A002A, 0x2A2A00, 0x2A2A2A, 0x151515, 1381695, 1392405, 1392447, 4134165, 4134207, 4144917, 0x3F3F3F};

    public static int lllIIIllIIIIlllIlIIllIIll(char c, boolean bl) {
        return lllIIIllIIIIlllIlIIllIIll[bl ? "0123456789abcdef".indexOf(c) : "0123456789abcdef".indexOf(c) + 16];
    }

    public static void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, float f) {
        class_0574.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n4, n5, n6, n7, n8, n9, n9, n9, n9, f);
    }

    public static void lllIIIllIIIIlllIlIIllIIll(ResourceLocation class_17732, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, float f) {
        class_0574.lllIIIllIIIIlllIlIIllIIll(class_17732, n, n2, n3, n4, n5, n6, n7, n8, n9, n9, n9, n9, f);
    }

    public static void lllIIIllIIIIlllIlIIllIIll(ResourceLocation class_17732, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, float f) {
        Minecraft.getMinecraft().llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(class_17732);
        class_0574.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, f);
    }

    public static void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, float f) {
        int n13;
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glEnable((int)3042);
        OpenGlHelper.glBlendFunc(770, 771, 1, 0);
        GL11.glBlendFunc((int)770, (int)771);
        int n14 = n7 - n11 - n12;
        int n15 = n8 - n9 - n10;
        int n16 = n5 - n11 - n12;
        int n17 = n6 - n9 - n10;
        int n18 = n16 / n14;
        int n19 = n16 % n14;
        int n20 = n17 / n15;
        int n21 = n17 % n15;
        class_0574.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n4, n11, n9, f);
        class_0574.lllIIIllIIIIlllIlIIllIIll(n + n11 + n16, n2, n3 + n11 + n14, n4, n12, n9, f);
        class_0574.lllIIIllIIIIlllIlIIllIIll(n, n2 + n9 + n17, n3, n4 + n9 + n15, n11, n10, f);
        class_0574.lllIIIllIIIIlllIlIIllIIll(n + n11 + n16, n2 + n9 + n17, n3 + n11 + n14, n4 + n9 + n15, n12, n10, f);
        for (n13 = 0; n13 < n18 + (n19 > 0 ? 1 : 0); ++n13) {
            class_0574.lllIIIllIIIIlllIlIIllIIll(n + n11 + n13 * n14, n2, n3 + n11, n4, n13 == n18 ? n19 : n14, n9, f);
            class_0574.lllIIIllIIIIlllIlIIllIIll(n + n11 + n13 * n14, n2 + n9 + n17, n3 + n11, n4 + n9 + n15, n13 == n18 ? n19 : n14, n10, f);
            for (int i = 0; i < n20 + (n21 > 0 ? 1 : 0); ++i) {
                class_0574.lllIIIllIIIIlllIlIIllIIll(n + n11 + n13 * n14, n2 + n9 + i * n15, n3 + n11, n4 + n9, n13 == n18 ? n19 : n14, i == n20 ? n21 : n15, f);
            }
        }
        for (n13 = 0; n13 < n20 + (n21 > 0 ? 1 : 0); ++n13) {
            class_0574.lllIIIllIIIIlllIlIIllIIll(n, n2 + n9 + n13 * n15, n3, n4 + n9, n11, n13 == n20 ? n21 : n15, f);
            class_0574.lllIIIllIIIIlllIlIIllIIll(n + n11 + n16, n2 + n9 + n13 * n15, n3 + n11 + n14, n4 + n9, n12, n13 == n20 ? n21 : n15, f);
        }
    }

    public static void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4, int n5, int n6, float f) {
        float f2 = 0.00390625f;
        float f3 = 0.00390625f;
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        class_08682.lllIlIIlIIIlIlIIIllIlllIl();
        class_08682.lllIIIllIIIIlllIlIIllIIll(n + 0, n2 + n6, f, (float)(n3 + 0) * f2, (float)(n4 + n6) * f3);
        class_08682.lllIIIllIIIIlllIlIIllIIll(n + n5, n2 + n6, f, (float)(n3 + n5) * f2, (float)(n4 + n6) * f3);
        class_08682.lllIIIllIIIIlllIlIIllIIll(n + n5, n2 + 0, f, (float)(n3 + n5) * f2, (float)(n4 + 0) * f3);
        class_08682.lllIIIllIIIIlllIlIIllIIll(n + 0, n2 + 0, f, (float)(n3 + 0) * f2, (float)(n4 + 0) * f3);
        class_08682.lllIIIllIIIIlllIlIIllIIll();
    }

    public static void lllIIIllIIIIlllIlIIllIIll(class_1854 class_18542, ItemStack class_08972, int n, int n2) {
        class_0574.lllIIIllIIIIlllIlIIllIIll(class_18542, class_08972, n, n2, true, true);
    }

    public static void lllIIIllIIIIlllIlIIllIIll(class_1854 class_18542, ItemStack class_08972, int n, int n2, boolean bl, boolean bl2) {
        if (class_08972 != null && (bl || bl2)) {
            int n3;
            if (class_08972.IllIIlllllllIIlIIlIIIIlIl() && bl) {
                n3 = (int)Math.round(13.0 - (double)class_08972.IIIllIllIIlIlIlIlIllllIIl() * 13.0 / (double)class_08972.lIIIIlIlIIlllllIIllIIlIII());
                int n4 = (int)Math.round(255.0 - (double)class_08972.IIIllIllIIlIlIlIlIllllIIl() * 255.0 / (double)class_08972.lIIIIlIlIIlllllIIllIIlIII());
                GL11.glDisable((int)2896);
                GL11.glDisable((int)2929);
                GL11.glDisable((int)3553);
                class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
                int n5 = 255 - n4 << 16 | n4 << 8;
                int n6 = (255 - n4) / 4 << 16 | 0x3F00;
                class_0574.lllIIIllIIIIlllIlIIllIIll(class_08682, n + 2, n2 + 13, 13, 2, 0);
                class_0574.lllIIIllIIIIlllIlIIllIIll(class_08682, n + 2, n2 + 13, 12, 1, n6);
                class_0574.lllIIIllIIIIlllIlIIllIIll(class_08682, n + 2, n2 + 13, n3, 1, n5);
                GL11.glEnable((int)3553);
                GL11.glEnable((int)2896);
                GL11.glEnable((int)2929);
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            }
            if (bl2) {
                n3 = 0;
                if (class_08972.lIlllIlllIIIIlIIlllIllIII() > 1) {
                    n3 = class_0574.lllIIIllIIIIlllIlIIllIIll(Minecraft.getMinecraft().lIIIIlIlIIlllllIIllIIlIII, class_08972.lllIIIllIIIIlllIlIIllIIll(), class_08972.IllIIIllIIIIlIlIlIllIIlll());
                } else if (class_08972.lllIIIllIIIIlllIlIIllIIll().equals(Items.bow)) {
                    n3 = class_0574.lllIIIllIIIIlllIlIIllIIll(Minecraft.getMinecraft().lIIIIlIlIIlllllIIllIIlIII, Items.arrow);
                }
                if (n3 > 1) {
                    String string = "" + n3;
                    GL11.glDisable((int)2896);
                    GL11.glDisable((int)2929);
                    class_18542.lllIIIllIIIIlllIlIIllIIll(string, (float)(n + 19 - 2 - class_18542.lllIIIllIIIIlllIlIIllIIll(string)), (float)(n2 + 6 + 3), 0xFFFFFF);
                    GL11.glEnable((int)2896);
                    GL11.glEnable((int)2929);
                }
            }
        }
    }

    public static void lllIIIllIIIIlllIlIIllIIll(class_0868 class_08682, int n, int n2, int n3, int n4, int n5) {
        class_08682.lllIlIIlIIIlIlIIIllIlllIl();
        class_08682.IlIllllllIIlIIllllIIlIIIl(n5);
        class_08682.lllIIIllIIIIlllIlIIllIIll((double)(n + 0), (double)(n2 + 0), 0.0);
        class_08682.lllIIIllIIIIlllIlIIllIIll((double)(n + 0), (double)(n2 + n4), 0.0);
        class_08682.lllIIIllIIIIlllIlIIllIIll((double)(n + n3), (double)(n2 + n4), 0.0);
        class_08682.lllIIIllIIIIlllIlIIllIIll((double)(n + n3), (double)(n2 + 0), 0.0);
        class_08682.lllIIIllIIIIlllIlIIllIIll();
    }

    public static int lllIIIllIIIIlllIlIIllIIll(class_0814 class_08142, Item class_06112) {
        return class_0574.lllIIIllIIIIlllIlIIllIIll(class_08142, class_06112, -1);
    }

    public static int lllIIIllIIIIlllIlIIllIIll(class_0814 class_08142, Item class_06112, int n) {
        int n2 = 0;
        for (int i = 0; i < class_08142.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll.length; ++i) {
            if (class_08142.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll[i] == null || !class_06112.equals(class_08142.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll[i].lllIIIllIIIIlllIlIIllIIll()) || n != -1 && class_08142.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll[i].IllIIIllIIIIlIlIlIllIIlll() != n) continue;
            n2 += class_08142.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll[i].lllIlIIlIIIlIlIIIllIlllIl;
        }
        return n2;
    }

    public static String lllIIIllIIIIlllIlIIllIIll(String string) {
        return string.replaceAll("(?i)\u00a7[0-9a-fklmnor]", "");
    }
}

