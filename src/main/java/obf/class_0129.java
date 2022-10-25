package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.awt.Color;

import net.minecraft.util.ResourceLocation;
import com.moonsworth.lunar.client.LunarClient;
import org.lwjgl.opengl.GL11;

public class class_0129
extends class_2117 {
    private final int IllIIlllllllIIlIIlIIIIlIl;
    public final AbstractModule lllIIIllIIIIlllIlIIllIIll;
    private final class_1194 IIIllIllIIlIlIlIlIllllIIl;
    private final class_0730 IllIIIllIIIIlIlIlIllIIlll;
    private final class_0730 lIIIIlIlIIlllllIIllIIlIII;
    private final class_0730 llIIlllIllIllllIIIlIIIIII;
    private int llIIllIllIlIIlIIllIllllll = 0;
    private ResourceLocation lllIIlIIIllllllIIIIlIlIlI = new ResourceLocation("client/icons/right.png");

    public class_0129(class_1194 class_11942, int n, AbstractModule class_16652, float f) {
        super(f);
        this.IIIllIllIIlIlIlIlIllllIIl = class_11942;
        this.IllIIlllllllIIlIIlIIIIlIl = n;
        this.lllIIIllIIIIlllIlIIllIIll = class_16652;
        this.IllIIIllIIIIlIlIlIllIIlll = new class_0730(0x4FFFFFFF, -1);
        this.lIIIIlIlIIlllllIIllIIlIII = new class_0730(0x40000000, 444958085);
        this.llIIlllIllIllllIIIlIIIIII = new class_0730(0x40000000, 444958085);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
        boolean bl = this.lllIIIllIIIIlllIlIIllIIll(n, n2);
        class_0857.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll, this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll, this.IlIIIIIllllllIIlllIllllll + this.IIIllIIlIIIIIIlIlIIllIIlI, this.IllIIIllIIIIlIlIlIllIIlll.lllIlIIlIIIlIlIIIllIlllIl(bl).getRGB(), this.lIIIIlIlIIlllllIIllIIlIII.lllIlIIlIIIlIlIIIllIlllIl(bl).getRGB(), this.llIIlllIllIllllIIIlIIIIII.lllIlIIlIIIlIlIIIllIlllIl(bl).getRGB());
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)0.35f);
        class_0857.lllIIIllIIIIlllIlIIllIIll(this.lllIIlIIIllllllIIIIlIlIlI, 2.5f, (float)(this.lIlllIlllIIIIlIIlllIllIII + 6), (float)this.IlIIIIIllllllIIlllIllllll + 6.0f);
        LunarClient.getInstance().robotoLight18px.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll.IIIllIIlIIIIIIlIlIIllIIlI().toUpperCase(), (float)this.lIlllIlllIIIIlIIlllIllIII + 14.0f, (float)this.IlIIIIIllllllIIlllIllllll + 3.0f, this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll) ? Color.WHITE.getRGB() : Color.LIGHT_GRAY.getRGB());
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        this.IIIllIllIIlIlIlIlIllllIIl.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll);
    }
}

