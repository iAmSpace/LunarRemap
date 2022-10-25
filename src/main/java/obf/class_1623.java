package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.util.concurrent.ThreadLocalRandom;

import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public final class class_1623
extends class_0759 {
    private static final int IllIIlllllllIIlIIlIIIIlIl = 8;
    private static final float IIIllIllIIlIlIlIlIllllIIl = 0.15f;
    private final ResourceLocation IllIIIllIIIIlIlIlIllIIlll = new ResourceLocation("client/animatedlogo/128/logo_128_no_stars.png");
    private static final ResourceLocation[] lIIIIlIlIIlllllIIllIIlIII = new ResourceLocation[8];
    private final class_1970[] llIIlllIllIllllIIIlIIIIII = new class_1970[8];
    private boolean llIIllIllIlIIlIIllIllllll = true;
    private final float[] lllIIlIIIllllllIIIIlIlIlI = new float[8];
    private boolean IlIlllIIIIIIlIIllIIllIlll;
    public transient int IIIllIIlIIIIIIlIlIIllIIlI;

    public class_1623() {
        this(true);
    }

    public class_1623(boolean bl) {
        for (int i = 1; i <= 8; ++i) {
            if (lIIIIlIlIIlllllIIllIIlIII[i - 1] != null) continue;
            class_1623.lIIIIlIlIIlllllIIllIIlIII[i - 1] = new ResourceLocation("client/animatedlogo/128/logo_128_star_" + i + ".png");
        }
        this.IllIIlllllllIIlIIlIIIIlIl();
        this.IlIlllIIIIIIlIIllIIllIlll = bl;
    }

    private void IllIIlllllllIIlIIlIIIIlIl() {
        for (int i = 1; i <= 8; ++i) {
            if (this.llIIlllIllIllllIIIlIIIIII[i - 1] != null && !this.llIIlllIllIllllIIIlIIIIII[i - 1].IIIllIIlIIIIIIlIlIIllIIlI()) {
                this.llIIllIllIlIIlIIllIllllll = false;
            }
            if (this.llIIlllIllIllllIIIlIIIIII[i - 1] != null && this.llIIlllIllIllllIIIlIIIIII[i - 1].IIIllIIlIIIIIIlIlIIllIIlI()) continue;
            long l = ThreadLocalRandom.current().nextLong(4000L, 12000L);
            if (this.llIIllIllIlIIlIIllIllllll) {
                this.lllIIlIIIllllllIIIIlIlIlI[i - 1] = Math.max(ThreadLocalRandom.current().nextFloat(), 0.8f);
            }
            this.llIIlllIllIllllIIIlIIIIII[i - 1] = new class_1970(this, l, null);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(float f, float f2, float f3, float f4) {
        super.lllIIIllIIIIlllIlIIllIIll(f, f2, f3, f4);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll() {
        ++this.IIIllIIlIIIIIIlIlIIllIIlI;
        this.IllIIlllllllIIlIIlIIIIlIl();
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(float f, float f2, boolean bl) {
        GL11.glPushMatrix();
        if (this.IlIlllIIIIIIlIIllIIllIlll) {
            GL11.glColor4f((float)0.0f, (float)0.0f, (float)0.0f, (float)0.2f);
            class_0857.lllIIIllIIIIlllIlIIllIIll(this.IllIIIllIIIIlIlIlIllIIlll, this.lllIIIllIIIIlllIlIIllIIll + 1.0f, this.lllIlIIlIIIlIlIIIllIlllIl + 1.0f, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII);
        }
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        class_0857.lllIIIllIIIIlllIlIIllIIll(this.IllIIIllIIIIlIlIlIllIIlll, this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII);
        for (int i = 0; i < 8; ++i) {
            class_1970 class_19702 = this.llIIlllIllIllllIIIlIIIIII[i];
            if (!class_19702.lIlllIlllIIIIlIIlllIllIII()) {
                class_19702.lllIlIIlIIIlIlIIIllIlllIl();
            }
            GL11.glPushMatrix();
            if (!class_19702.IIIllIIlIIIIIIlIlIIllIIlI()) {
                this.IllIIlllllllIIlIIlIIIIlIl();
            }
            float f3 = 1.0f * class_19702.lIlIllIIlIIlIIlIIlIIlIIll();
            if (class_19702.IIlllIlIlllIllIIIlllIIlIl() && this.llIIllIllIlIIlIIllIllllll) {
                this.llIIllIllIlIIlIIllIllllll = false;
            }
            if (this.llIIllIllIlIIlIIllIllllll) {
                f3 = Math.max(f3, this.lllIIlIIIllllllIIIIlIlIlI[i]);
            }
            if (this.IlIlllIIIIIIlIIllIIllIlll) {
                GL11.glColor4f((float)0.0f, (float)0.0f, (float)0.0f, (float)(f3 / 5.0f));
                class_0857.lllIIIllIIIIlllIlIIllIIll(lIIIIlIlIIlllllIIllIIlIII[i], this.lllIIIllIIIIlllIlIIllIIll + 1.0f, this.lllIlIIlIIIlIlIIIllIlllIl + 1.0f, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII);
            }
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)f3);
            class_0857.lllIIIllIIIIlllIlIIllIIll(lIIIIlIlIIlllllIIllIIlIII[i], this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII);
            GL11.glPopMatrix();
        }
        GL11.glPopMatrix();
    }
}

