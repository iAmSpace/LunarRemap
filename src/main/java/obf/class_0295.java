package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Preconditions
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.GL11
 */
import com.google.common.base.Preconditions;
import java.util.List;
import java.util.function.Consumer;

import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public abstract class class_0295
extends class_0229 {
    public static final int lllIIIllIIIIlllIlIIllIIll = 8;
    private static final Minecraft lIlllIlllIIIIlIIlllIllIII = Minecraft.getMinecraft();
    private final class_0663[] IlIIIIIllllllIIlllIllllll = new class_0663[8];
    private final class_0264[] lIllllIIlIIIlIllllllIIIll = new class_0264[8];
    private final int IIIllIIlIIIIIIlIlIIllIIlI;
    protected Consumer lllIlIIlIIIlIlIIIllIlllIl;
    public int IlIllllllIIlIIllllIIlIIIl = 0;

    public class_0295(int n, List list) {
        int n2;
        Preconditions.checkNotNull((Object)list, (Object)"options");
        Preconditions.checkArgument((list.size() <= 8 ? 1 : 0) != 0, (Object)"cannot have more than 8 options");
        for (n2 = 0; n2 < list.size(); ++n2) {
            this.IlIIIIIllllllIIlllIllllll[n2] = (class_0663)list.get(n2);
        }
        for (n2 = 0; n2 < this.lIllllIIlIIIlIllllllIIIll.length; ++n2) {
            class_0663 class_06632 = null;
            if (n2 < list.size()) {
                class_06632 = (class_0663)list.get(n2);
            }
            this.lIllllIIlIIIlIllllllIIIll[n2] = new class_0264(this, n2, class_06632);
        }
        this.IIIllIIlIIIIIIlIlIIllIIlI = n;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
        super.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
        class_0321 class_03212 = new class_0321(lIlllIlllIIIIlIIlllIllIII, class_0295.lIlllIlllIIIIlIIlllIllIII.displayWidth, class_0295.lIlllIlllIIIIlIIlllIllIII.displayHeight);
        int n3 = class_03212.lllIIIllIIIIlllIlIIllIIll();
        int n4 = class_03212.lllIlIIlIIIlIlIIIllIlllIl();
        for (class_0264 class_02642 : this.lIllllIIlIIIlIllllllIIIll) {
            if (class_02642 == null) continue;
            class_02642.lllIIIllIIIIlllIlIIllIIll((float)n, (float)n2, true);
        }
        float f2 = 10.0f;
        float f3 = (float)this.IlIllllllIIlIIllllIIlIIIl >= f2 ? 1.0f : (float)this.IlIllllllIIlIIllllIIlIIIl / f2;
        GL11.glPushMatrix();
        GL11.glColor4f((float)0.0f, (float)0.0f, (float)0.0f, (float)(0.5f * f3));
        class_0857.lllIIIllIIIIlllIlIIllIIll((double)((float)n3 / 2.0f), (double)((float)n4 / 2.0f), 90.0, 88.0, 100.0, 100, 100.0);
        class_0857.lllIIIllIIIIlllIlIIllIIll((double)((float)n3 / 2.0f), (double)((float)n4 / 2.0f), 20.0, 18.0, 100.0, 100, 100.0);
        GL11.glPopMatrix();
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
        super.IlIllllllIIlIIllllIIlIIIl();
        ++this.IlIllllllIIlIIllllIIlIIIl;
        if (!Keyboard.isKeyDown((int)this.IIIllIIlIIIIIIlIlIIllIIlI)) {
            if (this.lllIlIIlIIIlIlIIIllIlllIl != null) {
                for (int i = 0; i < this.lIllllIIlIIIlIllllllIIIll.length; ++i) {
                    int n;
                    class_0264 class_02642 = this.lIllllIIlIIIlIllllllIIIll[i];
                    class_0663 class_06632 = this.IlIIIIIllllllIIlllIllllll[i];
                    class_0321 class_03212 = new class_0321(lIlllIlllIIIIlIIlllIllIII, class_0295.lIlllIlllIIIIlIIlllIllIII.displayWidth, class_0295.lIlllIlllIIIIlIIlllIllIII.displayHeight);
                    int n2 = class_03212.lllIIIllIIIIlllIlIIllIIll();
                    int n3 = class_03212.lllIlIIlIIIlIlIIIllIlllIl();
                    int n4 = Mouse.getX() * n2 / class_0295.lIlllIlllIIIIlIIlllIllIII.displayWidth;
                    if (!class_02642.lllIlIIlIIIlIlIIIllIlllIl(n4, n = n3 - Mouse.getY() * n3 / class_0295.lIlllIlllIIIIlIIlllIllIII.displayHeight - 1)) continue;
                    this.lllIlIIlIIIlIlIIIllIlllIl.accept(class_06632);
                    break;
                }
            }
            lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll((class_0229)null);
        }
    }
}

