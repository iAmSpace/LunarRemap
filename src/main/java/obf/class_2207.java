package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class class_2207 {
    private static final class_1682 lllIIIllIIIIlllIlIIllIIll = Minecraft.getMinecraft().IlIIIIIllllllIIlllIllllll;
    private final int lllIlIIlIIIlIlIIIllIlllIl;
    private final ResourceLocation IlIllllllIIlIIllllIIlIIIl;

    public class_2207(int n, ResourceLocation class_17732) {
        this.lllIlIIlIIIlIlIIIllIlllIl = n;
        this.IlIllllllIIlIIllllIIlIIIl = class_17732;
    }

    public void lllIIIllIIIIlllIlIIllIIll() {
        if (this.IlIllllllIIlIIllllIIlIIIl == null) {
            GL11.glDisable((int)3553);
        } else {
            lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl);
        }
        GL11.glCallList((int)this.lllIlIIlIIIlIlIIIllIlllIl);
        if (this.IlIllllllIIlIIllllIIlIIIl == null) {
            GL11.glEnable((int)3553);
        }
    }

    public void lllIlIIlIIIlIlIIIllIlllIl() {
        GL11.glDeleteLists((int)this.lllIlIIlIIIlIlIIIllIlllIl, (int)1);
    }
}

