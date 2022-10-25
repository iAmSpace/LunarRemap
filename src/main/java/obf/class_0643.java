package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class class_0643
extends class_1603 {
    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, double d, double d2, double d3, float f, float f2) {
        GL11.glPushMatrix();
        class_0643.lllIIIllIIIIlllIlIIllIIll(class_15212.IIllIllIIllIIlllIIIlIlllI, d - class_15212.lIIIlIIIlIlllIllIIIlIIIlI, d2 - class_15212.lIIlIlllIllIlIlllIIIIIIII, d3 - class_15212.IIlIllIIlllllIIlIIllllIIl);
        GL11.glPopMatrix();
    }

    @Override
    public ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212) {
        return null;
    }
}

