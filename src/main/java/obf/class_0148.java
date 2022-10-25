package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.util.ResourceLocation;
import com.moonsworth.lunar.client.LunarClient;
import org.lwjgl.opengl.GL11;

public class class_0148
extends class_0759 {
    private final class_1878 IIIllIIlIIIIIIlIlIIllIIlI;
    private final ResourceLocation IllIIlllllllIIlIIlIIIIlIl = new ResourceLocation("client/icons/star-21.png");
    private final ResourceLocation IIIllIllIIlIlIlIlIllllIIl = new ResourceLocation("client/icons/star-filled-21.png");
    private final class_0929 IllIIIllIIIIlIlIlIllIIlll;

    public class_0148(class_0929 class_09292, class_1878 class_18782) {
        this.IllIIIllIIIIlIlIlIllIIlll = class_09292;
        this.IIIllIIlIIIIIIlIlIIllIIlI = class_18782;
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(float f, float f2, boolean bl) {
        if (this.lllIlIIlIIIlIlIIIllIlllIl(f, f2) && bl) {
            class_0210.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl, this.lllIIIllIIIIlllIlIIllIIll + 22.0f, this.lllIlIIlIIIlIlIIIllIlllIl + this.lIlllIlllIIIIlIIlllIllIII, -13158601);
        } else if (this.lllIIIllIIIIlllIlIIllIIll(f, f2) && bl) {
            class_0210.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl, this.lllIIIllIIIIlllIlIIllIIll + this.IlIllllllIIlIIllllIIlIIIl, this.lllIlIIlIIIlIlIIIllIlllIl + this.lIlllIlllIIIIlIIlllIllIII, -13158601);
        }
        boolean bl2 = this.IIIllIIlIIIIIIlIlIIllIIlI.IllIIlllllllIIlIIlIIIIlIl();
        if (bl2) {
            GL11.glColor4f((float)0.95f, (float)0.72f, (float)0.15f, (float)1.0f);
        } else {
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        }
        boolean bl3 = LunarClient.getInstance().lIlllIlllIlIIIIlllIlIlIIl().IlIIIIIllllllIIlllIllllll() == this.IIIllIIlIIIIIIlIlIIllIIlI;
        class_0857.lllIIIllIIIIlllIlIIllIIll(bl2 ? this.IIIllIllIIlIlIlIlIllllIIl : this.IllIIlllllllIIlIIlIIIIlIl, 5.0f, this.lllIIIllIIIIlllIlIIllIIll + 6.0f, this.lllIlIIlIIIlIlIIIllIlllIl + 5.0f);
        LunarClient.getInstance().robotoMedium13px.lllIIIllIIIIlllIlIIllIIll(this.IIIllIIlIIIIIIlIlIIllIIlI.IIIllIIlIIIIIIlIlIIllIIlI(), this.lllIIIllIIIIlllIlIIllIIll + 24.0f, this.lllIlIIlIIIlIlIIIllIlllIl + 1.5f, bl3 ? -13369549 : -1);
        LunarClient.getInstance().robotoMedium13px.lllIIIllIIIIlllIlIIllIIll(this.IIIllIIlIIIIIIlIlIIllIIlI.IlIIIIIllllllIIlllIllllll(), this.lllIIIllIIIIlllIlIIllIIll + 24.0f, this.lllIlIIlIIIlIlIIIllIlllIl + 9.5f, -1342177281);
    }

    private boolean lllIlIIlIIIlIlIIIllIlllIl(float f, float f2) {
        return this.lllIIIllIIIIlllIlIIllIIll(f, f2) && f < this.lllIIIllIIIIlllIlIIllIIll + 22.0f;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(float f, float f2, int n, boolean bl) {
        if (!bl) {
            return false;
        }
        if (this.lllIlIIlIIIlIlIIIllIlllIl(f, f2) && bl) {
            this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(!this.IIIllIIlIIIIIIlIlIIllIIlI.IllIIlllllllIIlIIlIIIIlIl());
            this.IllIIIllIIIIlIlIlIllIIlll.IIIllIllIIlIlIlIlIllllIIl();
            return true;
        }
        if (this.lllIIIllIIIIlllIlIIllIIll(f, f2) && bl) {
            if (class_1868.IlIllllllIIlIIllllIIlIIIl()) {
                class_1868.lllIlIIlIIIlIlIIIllIlllIl();
            }
            this.IIIllIIlIIIIIIlIlIIllIIlI.IlIllllllIIlIIllllIIlIIIl = true;
            LunarClient.getInstance().lIlllIlllIlIIIIlllIlIlIIl().IlIllllllIIlIIllllIIlIIIl().lllIIIllIIIIlllIlIIllIIll(this.IIIllIIlIIIIIIlIlIIllIIlI);
            LunarClient.getInstance().lIlllIlllIlIIIIlllIlIlIIl().lllIlIIlIIIlIlIIIllIlllIl(this.IIIllIIlIIIIIIlIlIIllIIlI);
        }
        return false;
    }

    public class_1878 IllIIlllllllIIlIIlIIIIlIl() {
        return this.IIIllIIlIIIIIIlIlIIllIIlI;
    }
}

