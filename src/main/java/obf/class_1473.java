package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class class_1473
extends class_1665 {
    private class_1609 lllIIIllIIIIlllIlIIllIIll;
    private class_1609 lllIlIIlIIIlIlIIIllIlllIl;
    private class_1609 IlIllllllIIlIIllllIIlIIIl;
    private ResourceLocation lIlllIlllIIIIlIIlllIllIII = new ResourceLocation("textures/gui/compass.png");

    public class_1473() {
        super("Direction HUD");
        this.lllIlIIlIIIlIlIIIllIlllIl(class_0767.IlIIIIIllllllIIlllIllllll);
        this.lllIIIllIIIIlllIlIIllIIll(false);
        this.IlIllllllIIlIIllllIIlIIIl = new class_1609(this, "Show While Typing").lllIlIIlIIIlIlIIIllIlllIl(true);
        this.lllIIIllIIIIlllIlIIllIIll = new class_1609(this, "Marker Color").lllIlIIlIIIlIlIIIllIlllIl(-43691).lllIIIllIIIIlllIlIIllIIll((Object)Integer.MIN_VALUE, (Object)Integer.MAX_VALUE);
        this.lllIlIIlIIIlIlIIIllIlllIl = new class_1609(this, "Direction Color").lllIlIIlIIIlIlIIIllIlllIl(-1).lllIIIllIIIIlllIlIIllIIll((Object)Integer.MIN_VALUE, (Object)Integer.MAX_VALUE);
        this.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("client/icons/mods/dirhud.png"), 65, 12);
        this.lllIIIllIIIIlllIlIIllIIll(class_2201.class, this::lllIIIllIIIIlllIlIIllIIll);
    }

    private void lllIIIllIIIIlllIlIIllIIll(class_2201 class_22012) {
        if (!this.lllIIlIIIllllllIIIIlIlIlI()) {
            return;
        }
        GL11.glPushMatrix();
        this.lllIIIllIIIIlllIlIIllIIll(class_22012.lllIIIllIIIIlllIlIIllIIll());
        this.IlIllllllIIlIIllllIIlIIIl(66.0f, 18.0f);
        if (!this.lIIlIIIIIlIlllIlIIlIlIlll.IlIIIlIIIIllIIIllIIIIIIll.lllIlIIlIIIlIlIIIllIlllIl().IlIIIIIllllllIIlllIllllll() || ((Boolean)this.IlIllllllIIlIIllllIIlIIIl.lIlllIlllIIIIlIIlllIllIII()).booleanValue()) {
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            this.lllIlIIlIIIlIlIIIllIlllIl(class_22012.lllIIIllIIIIlllIlIIllIIll());
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        }
        GL11.glPopMatrix();
    }

    private void lllIlIIlIIIlIlIIIllIlllIl(class_0321 class_03212) {
        int n = MathHelper.IlIllllllIIlIIllllIIlIIIl((double)(this.lIIlIIIIIlIlllIlIIlIlIlll.lIIIIlIlIIlllllIIllIIlIII.IIIIlIllIlIIlIIlIllIlIlll * 256.0f / 360.0f) + 0.5) & 0xFF;
        int n2 = 0;
        int n3 = 0;
        if ((Integer)this.lllIlIIlIIIlIlIIIllIlllIl.lIlllIlllIIIIlIIlllIllIII() != 4095) {
            int n4 = this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll();
            this.lIIlIIIIIlIlllIlIIlIlIlll.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            if (n < 128) {
                class_0574.lllIIIllIIIIlllIlIIllIIll(n3, n2, n, 0, 65, 12, -100.0f);
            } else {
                class_0574.lllIIIllIIIIlllIlIIllIIll(n3, n2, n - 128, 12, 65, 12, -100.0f);
            }
            GL11.glColor4f((float)((float)(n4 >> 16 & 0xFF) / 255.0f), (float)((float)(n4 >> 8 & 0xFF) / 255.0f), (float)((float)(n4 & 0xFF) / 255.0f), (float)1.0f);
            if (n < 128) {
                class_0574.lllIIIllIIIIlllIlIIllIIll(n3, n2, n, 24, 65, 12, -100.0f);
            } else {
                class_0574.lllIIIllIIIIlllIlIIllIIll(n3, n2, n - 128, 36, 65, 12, -100.0f);
            }
        } else {
            this.lIIlIIIIIlIlllIlIIlIlIlll.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII);
            if (n < 128) {
                class_0574.lllIIIllIIIIlllIlIIllIIll(n3, n2, n, 0, 65, 12, -100.0f);
            } else {
                class_0574.lllIIIllIIIIlllIlIIllIIll(n3, n2, n - 128, 12, 65, 12, -100.0f);
            }
        }
        this.lIIlIIIIIlIlllIlIIlIlIlll.IlIlllIIIIIIlIIllIIllIlll.lllIlIIlIIIlIlIIIllIlllIl("|", n3 + 32, n2 + 1, this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll());
        this.lIIlIIIIIlIlllIlIIlIlIlll.IlIlllIIIIIIlIIllIIllIlll.lllIlIIlIIIlIlIIIllIlllIl("|\u00a7r", n3 + 32, n2 + 5, this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll());
    }
}

