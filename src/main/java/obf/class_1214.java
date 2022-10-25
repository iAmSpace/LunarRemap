package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.commons.io.FilenameUtils
 */
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.UUID;

import net.minecraft.util.ResourceLocation;
import com.moonsworth.lunar.client.LunarClient;
import net.minecraft.client.Minecraft;
import org.apache.commons.io.FilenameUtils;

public class class_1214 {
    public static void lllIIIllIIIIlllIlIIllIIll(class_2174 class_21742, UUID uUID) {
        String string = class_21742.c_();
        if (string != null && !string.isEmpty()) {
            class_1085 class_10852;
            String string2 = "http://s.optifine.net/capes/" + string + ".png";
            String string3 = FilenameUtils.getBaseName((String)string2);
            ResourceLocation class_17732 = new ResourceLocation("capeof/" + string3);
            class_1682 class_16822 = Minecraft.getMinecraft().llIIlIIllIIllIlIIllIIllII();
            class_0211 class_02112 = class_16822.lllIlIIlIIIlIlIIIllIlllIl(class_17732);
            if (class_02112 != null && class_02112 instanceof class_1085) {
                class_10852 = (class_1085)class_02112;
                if (class_10852.lllIIIllIIIIlllIlIIllIIll != null) {
                    if (class_10852.lllIIIllIIIIlllIlIIllIIll.booleanValue() && LunarClient.getInstance().lllIIIllIIIIlllIlIIllIIll(uUID) == null) {
                        class_21742.lllIIIllIIIIlllIlIIllIIll(class_17732);
                    }
                    return;
                }
            }
            class_10852 = new class_1085(null, string2, null, new class_0380(class_21742, class_17732));
            class_10852.lllIlIIlIIIlIlIIIllIlllIl = true;
            class_16822.lllIIIllIIIIlllIlIIllIIll(class_17732, class_10852);
        }
    }

    public static BufferedImage lllIIIllIIIIlllIlIIllIIll(BufferedImage bufferedImage) {
        int n;
        int n2 = 64;
        int n3 = bufferedImage.getWidth();
        int n4 = bufferedImage.getHeight();
        for (n = 32; n2 < n3 || n < n4; n2 *= 2, n *= 2) {
        }
        BufferedImage bufferedImage2 = new BufferedImage(n2, n, 2);
        Graphics graphics = bufferedImage2.getGraphics();
        graphics.drawImage(bufferedImage, 0, 0, null);
        graphics.dispose();
        return bufferedImage2;
    }
}

