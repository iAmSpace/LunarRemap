package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  org.lwjgl.opengl.GL11
 */
import com.google.common.collect.Maps;
import java.util.Map;

import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class class_1913
extends class_0164 {
    private static final Map lllIIIllIIIIlllIlIIllIIll = Maps.newHashMap();
    private static final ResourceLocation lIllllIIlIIIlIllllllIIIll = new ResourceLocation("textures/entity/horse/horse_white.png");
    private static final ResourceLocation IIIllIIlIIIIIIlIlIIllIIlI = new ResourceLocation("textures/entity/horse/mule.png");
    private static final ResourceLocation IllIIlllllllIIlIIlIIIIlIl = new ResourceLocation("textures/entity/horse/donkey.png");
    private static final ResourceLocation IIIllIllIIlIlIlIlIllllIIl = new ResourceLocation("textures/entity/horse/horse_zombie.png");
    private static final ResourceLocation IllIIIllIIIIlIlIlIllIIlll = new ResourceLocation("textures/entity/horse/horse_skeleton.png");

    public class_1913(class_1382 class_13822, float f) {
        super(class_13822, f);
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_1627 class_16272, float f) {
        float f2 = 1.0f;
        int n = class_16272.IIlIlIlIIlllIIIlIIIIlIIIl();
        if (n == 1) {
            f2 *= 0.87f;
        } else if (n == 2) {
            f2 *= 0.92f;
        }
        GL11.glScalef((float)f2, (float)f2, (float)f2);
        super.lllIIIllIIIIlllIlIIllIIll(class_16272, f);
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_1627 class_16272, float f, float f2, float f3, float f4, float f5, float f6) {
        if (class_16272.lIIlIlIIllIIIlIIlIlIIIlII()) {
            this.llIIllIllIlIIlIIllIllllll.lllIIIllIIIIlllIlIIllIIll(f, f2, f3, f4, f5, f6, class_16272);
        } else {
            this.lllIlIIlIIIlIlIIIllIlllIl((class_1521)class_16272);
            this.llIIllIllIlIIlIIllIllllll.lllIIIllIIIIlllIlIIllIIll(class_16272, f, f2, f3, f4, f5, f6);
        }
    }

    protected ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_1627 class_16272) {
        if (!class_16272.lIllIllllIlIlIIlIllIlIIlI()) {
            switch (class_16272.IIlIlIlIIlllIIIlIIIIlIIIl()) {
                default: {
                    return lIllllIIlIIIlIllllllIIIll;
                }
                case 1: {
                    return IllIIlllllllIIlIIlIIIIlIl;
                }
                case 2: {
                    return IIIllIIlIIIIIIlIlIIllIIlI;
                }
                case 3: {
                    return IIIllIllIIlIlIlIlIllllIIl;
                }
                case 4: 
            }
            return IllIIIllIIIIlIlIlIllIIlll;
        }
        return this.lllIlIIlIIIlIlIIIllIlllIl(class_16272);
    }

    private ResourceLocation lllIlIIlIIIlIlIIIllIlllIl(class_1627 class_16272) {
        String string = class_16272.lllIllllllIIlIIllllIIllIl();
        ResourceLocation class_17732 = (ResourceLocation)lllIIIllIIIIlllIlIIllIIll.get(string);
        if (class_17732 == null) {
            class_17732 = new ResourceLocation(string);
            Minecraft.getMinecraft().llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(class_17732, new class_1433(class_16272.IIIllllllIlIlllIlIlIIIIll()));
            lllIIIllIIIIlllIlIIllIIll.put(string, class_17732);
        }
        return class_17732;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652, float f) {
        this.lllIIIllIIIIlllIlIIllIIll((class_1627)class_19652, f);
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652, float f, float f2, float f3, float f4, float f5, float f6) {
        this.lllIIIllIIIIlllIlIIllIIll((class_1627)class_19652, f, f2, f3, f4, f5, f6);
    }

    @Override
    public ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_1627)class_15212);
    }
}

