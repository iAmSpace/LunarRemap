package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.lwjgl.opengl.GL11
 */
import com.google.common.collect.Lists;
import java.awt.Color;
import java.util.List;

import com.moonsworth.lunar.client.LunarClient;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class class_1201 {
    private final Minecraft lllIIIllIIIIlllIlIIllIIll = Minecraft.getMinecraft();
    private final LunarClient lllIlIIlIIIlIlIIIllIlllIl = LunarClient.getInstance();
    private final List IlIllllllIIlIIllllIIlIIIl = Lists.newArrayList();

    public void lllIIIllIIIIlllIlIIllIIll(class_2201 class_22012) {
        GL11.glEnable((int)3042);
        for (class_1696 class_16962 : this.IlIllllllIIlIIllllIIlIIIl) {
            float f;
            boolean bl = class_1696.lllIIIllIIIIlllIlIIllIIll(class_16962) == class_0801.lllIlIIlIIIlIlIIIllIlllIl;
            float f2 = bl ? 4.0f : 1.5f;
            float f3 = bl ? -30.0f : 10.0f;
            GL11.glScalef((float)(f2 *= class_1696.lllIlIIlIIIlIlIIIllIlllIl(class_16962)), (float)f2, (float)f2);
            float f4 = 255.0f;
            if (class_16962.lllIIIllIIIIlllIlIIllIIll()) {
                f = class_1696.IlIllllllIIlIIllllIIlIIIl(class_16962) - (System.currentTimeMillis() - class_16962.lllIIIllIIIIlllIlIIllIIll);
                f4 = 1.0f - f / (float)class_1696.IlIllllllIIlIIllllIIlIIIl(class_16962);
            } else if (class_16962.lllIlIIlIIIlIlIIIllIlllIl()) {
                f = class_1696.lIlllIlllIIIIlIIlllIllIII(class_16962) - (System.currentTimeMillis() - class_16962.lllIIIllIIIIlllIlIIllIIll);
                f4 = f <= 0.0f ? 0.0f : f / (float)class_1696.IlIIIIIllllllIIlllIllllll(class_16962);
            }
            f4 = Math.min(1.0f, Math.max(0.0f, f4));
            if ((double)f4 <= 0.15) {
                f4 = 0.15f;
            }
            this.lllIIIllIIIIlllIlIIllIIll.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(class_1696.lIllllIIlIIIlIllllllIIIll(class_16962), (int)((float)(class_22012.lllIIIllIIIIlllIlIIllIIll().lllIIIllIIIIlllIlIIllIIll() / 2) / f2), (int)(((float)(class_22012.lllIIIllIIIIlllIlIIllIIll().lllIlIIlIIIlIlIIIllIlllIl() / 2 - this.lllIIIllIIIIlllIlIIllIIll.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll / 2) + f3) / f2), new Color(1.0f, 1.0f, 1.0f, f4).getRGB());
            GL11.glScalef((float)(1.0f / f2), (float)(1.0f / f2), (float)(1.0f / f2));
        }
        GL11.glDisable((int)3042);
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0312 class_03122) {
        if (!this.IlIllllllIIlIIllllIIlIIIl.isEmpty()) {
            this.IlIllllllIIlIIllllIIlIIIl.removeIf(class_16962 -> class_16962.lllIIIllIIIIlllIlIIllIIll + class_1696.lIlllIlllIIIIlIIlllIllIII(class_16962) < System.currentTimeMillis());
        }
    }

    public List lllIIIllIIIIlllIlIIllIIll() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }
}

