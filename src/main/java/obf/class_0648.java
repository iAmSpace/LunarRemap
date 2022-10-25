package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.init.Blocks;
import org.lwjgl.opengl.GL11;

public class class_0648
extends class_2052 {
    private class_1333 lllIIIllIIIIlllIlIIllIIll;

    public void lllIIIllIIIIlllIlIIllIIll(class_0919 class_09192, double d, double d2, double d3, float f) {
        Block class_05492 = class_09192.lllIIIllIIIIlllIlIIllIIll();
        if (class_05492.lIllllIIlIIIlIllllllIIIll() != class_1855.lllIIIllIIIIlllIlIIllIIll && class_09192.lllIIIllIIIIlllIlIIllIIll(f) < 1.0f) {
            class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
            this.lllIIIllIIIIlllIlIIllIIll(class_1511.lllIIIllIIIIlllIlIIllIIll);
            class_0624.lllIIIllIIIIlllIlIIllIIll();
            GL11.glBlendFunc((int)770, (int)771);
            GL11.glEnable((int)3042);
            GL11.glDisable((int)2884);
            if (Minecraft.IlIIlllllIIlIlIlllllIllll()) {
                GL11.glShadeModel((int)7425);
            } else {
                GL11.glShadeModel((int)7424);
            }
            class_08682.lllIlIIlIIIlIlIIIllIlllIl();
            class_08682.lllIlIIlIIIlIlIIIllIlllIl((double)((float)d - (float)class_09192.lllIlIIlIIIlIlIIIllIlllIl + class_09192.lllIlIIlIIIlIlIIIllIlllIl(f)), (double)((float)d2 - (float)class_09192.IlIllllllIIlIIllllIIlIIIl + class_09192.IlIllllllIIlIIllllIIlIIIl(f)), (double)((float)d3 - (float)class_09192.lIlllIlllIIIIlIIlllIllIII + class_09192.lIlllIlllIIIIlIIlllIllIII(f)));
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(1.0f, 1.0f, 1.0f);
            if (class_05492 == Blocks.IIllIllIIllIIlllIIIlIlllI && class_09192.lllIIIllIIIIlllIlIIllIIll(f) < 0.5f) {
                this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl(class_05492, class_09192.lllIlIIlIIIlIlIIIllIlllIl, class_09192.IlIllllllIIlIIllllIIlIIIl, class_09192.lIlllIlllIIIIlIIlllIllIII, false);
            } else if (class_09192.IlIlllIIIIIIlIIllIIllIlll() && !class_09192.IlIIIIIllllllIIlllIllllll()) {
                Blocks.IIllIllIIllIIlllIIIlIlllI.lllIIIllIIIIlllIlIIllIIll(((class_1039)class_05492).llIlllIIllIlllIlIlIlIIIll());
                this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl((Block) Blocks.IIllIllIIllIIlllIIIlIlllI, class_09192.lllIlIIlIIIlIlIIIllIlllIl, class_09192.IlIllllllIIlIIllllIIlIIIl, class_09192.lIlllIlllIIIIlIIlllIllIII, class_09192.lllIIIllIIIIlllIlIIllIIll(f) < 0.5f);
                Blocks.IIllIllIIllIIlllIIIlIlllI.llIlllIIllIlllIlIlIlIIIll();
                class_08682.lllIlIIlIIIlIlIIIllIlllIl((double)((float)d - (float)class_09192.lllIlIIlIIIlIlIIIllIlllIl), (double)((float)d2 - (float)class_09192.IlIllllllIIlIIllllIIlIIIl), (double)((float)d3 - (float)class_09192.lIlllIlllIIIIlIIlllIllIII));
                this.lllIIIllIIIIlllIlIIllIIll.IlIIIIIllllllIIlllIllllll(class_05492, class_09192.lllIlIIlIIIlIlIIIllIlllIl, class_09192.IlIllllllIIlIIllllIIlIIIl, class_09192.lIlllIlllIIIIlIIlllIllIII);
            } else {
                this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(class_05492, class_09192.lllIlIIlIIIlIlIIIllIlllIl, class_09192.IlIllllllIIlIIllllIIlIIIl, class_09192.lIlllIlllIIIIlIIlllIllIII);
            }
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(0.0, 0.0, 0.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll();
            class_0624.lllIlIIlIIIlIlIIIllIlllIl();
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342) {
        this.lllIIIllIIIIlllIlIIllIIll = new class_1333(class_13342);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1774 class_17742, double d, double d2, double d3, float f) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0919)class_17742, d, d2, d3, f);
    }
}

