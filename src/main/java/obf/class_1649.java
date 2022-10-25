package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  javax.vecmath.Matrix4f
 *  org.lwjgl.opengl.GL11
 */
import com.google.common.collect.Lists;
import java.util.List;
import javax.vecmath.Matrix4f;

import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class class_1649 {
    private final class_1282 IlIllllllIIlIIllllIIlIIIl;
    public final class_0778 lllIIIllIIIIlllIlIIllIIll;
    public final class_0778 lllIlIIlIIIlIlIIIllIlllIl;
    private final List lIlllIlllIIIIlIIlllIllIII = Lists.newArrayList();
    private final List IlIIIIIllllllIIlllIllllll = Lists.newArrayList();
    private final List lIllllIIlIIIlIllllllIIIll = Lists.newArrayList();
    private final List IIIllIIlIIIIIIlIlIIllIIlI = Lists.newArrayList();
    private Matrix4f IllIIlllllllIIlIIlIIIIlIl;

    public class_1649(class_0947 class_09472, String string, class_0778 class_07782, class_0778 class_07783) {
        this.IlIllllllIIlIIllllIIlIIIl = new class_1282(class_09472, string);
        this.lllIIIllIIIIlllIlIIllIIll = class_07782;
        this.lllIlIIlIIIlIlIIIllIlllIl = class_07783;
    }

    public void lllIIIllIIIIlllIlIIllIIll() {
        this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll();
    }

    public void lllIIIllIIIIlllIlIIllIIll(String string, Object object, int n, int n2) {
        this.IlIIIIIllllllIIlllIllllll.add(this.IlIIIIIllllllIIlllIllllll.size(), string);
        this.lIlllIlllIIIIlIIlllIllIII.add(this.lIlllIlllIIIIlIIlllIllIII.size(), object);
        this.lIllllIIlIIIlIllllllIIIll.add(this.lIllllIIlIIIlIllllllIIIll.size(), n);
        this.IIIllIIlIIIIIIlIlIIllIIlI.add(this.IIIllIIlIIIIIIlIlIIllIIlI.size(), n2);
    }

    private void IlIllllllIIlIIllllIIlIIIl() {
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glDisable((int)3042);
        GL11.glDisable((int)2929);
        GL11.glDisable((int)3008);
        GL11.glDisable((int)2912);
        GL11.glDisable((int)2896);
        GL11.glDisable((int)2903);
        GL11.glEnable((int)3553);
        GL11.glBindTexture((int)3553, (int)0);
    }

    public void lllIIIllIIIIlllIlIIllIIll(Matrix4f matrix4f) {
        this.IllIIlllllllIIlIIlIIIIlIl = matrix4f;
    }

    public void lllIIIllIIIIlllIlIIllIIll(float f) {
        this.IlIllllllIIlIIllllIIlIIIl();
        this.lllIIIllIIIIlllIlIIllIIll.IlIIIIIllllllIIlllIllllll();
        float f2 = this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll;
        float f3 = this.lllIlIIlIIIlIlIIIllIlllIl.lllIlIIlIIIlIlIIIllIlllIl;
        GL11.glViewport((int)0, (int)0, (int)((int)f2), (int)((int)f3));
        this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll("DiffuseSampler", this.lllIIIllIIIIlllIlIIllIIll);
        for (int i = 0; i < this.lIlllIlllIIIIlIIlllIllIII.size(); ++i) {
            this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll((String)this.IlIIIIIllllllIIlllIllllll.get(i), this.lIlllIlllIIIIlIIlllIllIII.get(i));
            this.IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl("AuxSize" + i).lllIIIllIIIIlllIlIIllIIll(((Integer)this.lIllllIIlIIIlIllllllIIIll.get(i)).intValue(), ((Integer)this.IIIllIIlIIIIIIlIlIIllIIlI.get(i)).intValue());
        }
        this.IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl("ProjMat").lllIIIllIIIIlllIlIIllIIll(this.IllIIlllllllIIlIIlIIIIlIl);
        this.IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl("InSize").lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll, this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl);
        this.IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl("OutSize").lllIIIllIIIIlllIlIIllIIll(f2, f3);
        this.IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl("Time").lllIIIllIIIIlllIlIIllIIll(f);
        Minecraft class_06672 = Minecraft.getMinecraft();
        this.IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl("ScreenSize").lllIIIllIIIIlllIlIIllIIll(class_06672.displayWidth, class_06672.displayHeight);
        this.IlIllllllIIlIIllllIIlIIIl.IlIllllllIIlIIllllIIlIIIl();
        this.lllIlIIlIIIlIlIIIllIlllIl.lIllllIIlIIIlIllllllIIIll();
        this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(false);
        GL11.glDepthMask((boolean)false);
        GL11.glColorMask((boolean)true, (boolean)true, (boolean)true, (boolean)false);
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        class_08682.lllIlIIlIIIlIlIIIllIlllIl();
        class_08682.IlIllllllIIlIIllllIIlIIIl(-1);
        class_08682.lllIIIllIIIIlllIlIIllIIll(0.0, (double)f3, 500.0);
        class_08682.lllIIIllIIIIlllIlIIllIIll((double)f2, (double)f3, 500.0);
        class_08682.lllIIIllIIIIlllIlIIllIIll((double)f2, 0.0, 500.0);
        class_08682.lllIIIllIIIIlllIlIIllIIll(0.0, 0.0, 500.0);
        class_08682.lllIIIllIIIIlllIlIIllIIll();
        GL11.glDepthMask((boolean)true);
        GL11.glColorMask((boolean)true, (boolean)true, (boolean)true, (boolean)true);
        this.IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl();
        this.lllIlIIlIIIlIlIIIllIlllIl.IlIIIIIllllllIIlllIllllll();
        this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII();
        for (Object e : this.lIlllIlllIIIIlIIlllIllIII) {
            if (!(e instanceof class_0778)) continue;
            ((class_0778)e).lIlllIlllIIIIlIIlllIllIII();
        }
    }

    public class_1282 lllIlIIlIIIlIlIIIllIlllIl() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }
}

