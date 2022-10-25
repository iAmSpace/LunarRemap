package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.GL11
 */
import java.awt.Color;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.moonsworth.lunar.client.LunarClient;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public class class_0822
extends class_0229 {
    public static class_0822 lllIIIllIIIIlllIlIIllIIll;
    private final ResourceLocation lIlllIlllIlIIIIlllIlIlIIl = new ResourceLocation("client/icons/cog-64.png");
    private final ResourceLocation IlIIlllllIIlIlIlllllIllll = new ResourceLocation("client/icons/delete-64.png");
    private final List llIIlIlIlllIIllIlIlllIllI = new ArrayList();
    private final List IllIIIIllIIllIllIlllIlIIl = new ArrayList();
    private final List IIIIIIIIlIllIIllIIlllIllI = new ArrayList();
    private List IIlIIlIlIlIllIIlIlIIIIlll;
    private class_0527 llIIIlllIlllIlIllIIIIllIl;
    public class_0527 lllIlIIlIIIlIlIIIllIlllIl;
    @Deprecated
    protected class_1194 IlIllllllIIlIIllllIIlIIIl;
    @Deprecated
    protected class_1194 lIlllIlllIIIIlIIlllIllIII;
    public class_1194 IlIIIIIllllllIIlllIllllll;
    public class_1194 lIllllIIlIIIlIllllllIIIll;
    protected class_1194 IIIllIIlIIIIIIlIlIIllIIlI;
    protected class_1194 IllIIlllllllIIlIIlIIIIlIl;
    protected class_1194 IIIllIllIIlIlIlIlIllllIIl = null;
    public class_1194 IllIIIllIIIIlIlIlIllIIlll = null;
    private static class_1665 IIIIlIllIlIIlIIlIllIlIlll;
    private boolean IlIlIIlllIllllllllIIIlIlI = false;
    private float llllIIIIlIIIlIIIIIIlIllll;
    private float llIIIIllIIIIIIIlIIIlIIIIl;
    private List IIllIllIIllIIlllIIIlIlllI;
    private List llllllIlIllllIlIlIlIIIIlI;
    private int lIlIIllllIlIIIIllIIIIlIIl;
    private int llIlllIIllIlllIlIlIlIIIll;
    private boolean IIIIlIIlIIIllIIIIllIIIlII = false;
    private class_0307 lllIIIIIIlIlllIIlIlIIIllI;
    public static boolean lIIIIlIlIIlllllIIllIIlIII;
    private int llIIlIIllIIllIlIIllIIllII;
    private int lIlIlIIIIIIlIIllllIlIIllI = 0;
    private class_1623 IllllIIIIlIIlIIIIlllIIIIl;

    @Override
    public void o_() {
        Keyboard.enableRepeatEvents((boolean)false);
        this.lllllIlllIIllIlIIlIIIllII.lIIlIIIIIlIlllIlIIlIlIlll.IlIllllllIIlIIllllIIlIIIl();
    }

    @Override
    public void n_() {
        this.lIlIlIIlIIIIlIIIIIlllIIII();
        Keyboard.enableRepeatEvents((boolean)true);
        this.IIlIIlIlIlIllIIlIlIIIIlll = new ArrayList();
        this.IIlIIlIlIlIllIIlIlIIIIlll.addAll(LunarClient.getInstance().getModuleManager().lllIIIllIIIIlllIlIIllIIll);
        this.IIllIllIIllIIlllIIIlIlllI = new ArrayList();
        this.llllllIlIllllIlIlIlIIIIlI = new ArrayList();
        this.lIlIIllllIlIIIIllIIIIlIIl = -1;
        this.llIlllIIllIlllIlIlIlIIIll = -1;
        this.llIIlIIllIIllIlIIllIIllII = 0;
        lllIIIllIIIIlllIlIIllIIll = this;
        IIIIlIllIlIIlIIlIllIlIlll = null;
        lIIIIlIlIIlllllIIllIIlIII = false;
        this.IIIllIllIIlIlIlIlIllllIIl = null;
        this.IllIIIllIIIIlIlIlIllIIlll = null;
        this.lllIIIIIIlIlllIIlIlIIIllI = null;
        lIIIIlIlIIlllllIIllIIlIII = false;
        float f = 1.0f / LunarClient.IllIIIllIIIIlIlIlIllIIlll();
        int n = (int)((float)this.IlIlIIlllIIlIllIIIlllllIl / f);
        int n2 = (int)((float)this.lIIlIIIIIlIlllIlIIlIlIlll / f);
        this.IllIIIIllIIllIllIlllIlIIl.clear();
        this.IIIIIIIIlIllIIllIIlllIllI.clear();
        List list = LunarClient.getInstance().getModuleManager().lllIIIllIIIIlllIlIIllIIll;
        List list2 = LunarClient.getInstance().getModuleManager().lllIlIIlIIIlIlIIIllIlllIl;
        this.IIIllIIlIIIIIIlIlIIllIIlI = new class_1001(f, n / 2 - 565, n2 / 2 + 14, 370, n2 / 2 - 35);
        this.IllIIIIllIIllIllIlllIlIIl.add(this.IIIllIIlIIIIIIlIlIIllIIlI);
        this.IllIIlllllllIIlIIlIIIIlIl = new class_0914(list2, f, n / 2 + 195, n2 / 2 + 14, 370, n2 / 2 - 35);
        this.IllIIIIllIIllIllIlllIlIIl.add(this.IllIIlllllllIIlIIlIIIIlIl);
        this.IlIIIIIllllllIIlllIllllll = new class_0914(list, f, n / 2 + 195, n2 / 2 + 14, 370, n2 / 2 - 35);
        this.IllIIIIllIIllIllIlllIlIIl.add(this.IlIIIIIllllllIIlllIllllll);
        this.lIllllIIlIIIlIllllllIIIll = new class_1319(f, n / 2 - 565, n2 / 2 + 14, 370, n2 / 2 - 35);
        this.IllIIIIllIIllIllIlllIlIIl.add(this.lIllllIIlIIIlIllllllIIIll);
        this.llIIIlllIlllIlIllIIIIllIl = new class_0527(null, "eye-64.png", 4, n2 - 32, 28, 28, -12418828, f);
        this.lllIlIIlIIIlIlIIIllIlllIl = new class_0527(null, "?", 36, n2 - 32, 28, 28, -12418828, f);
        if (LunarClient.getInstance().IlIlllIIIIIIlIIllIIllIlll()) {
            this.IIIIIIIIlIllIIllIIlllIllI.add(new class_0527(FontRegistry.robotoLight18px, this.IllIIlllllllIIlIIlIIIIlIl, "Staff Mods", n / 2 - 50, n2 / 2 - 44, 100, 20, -9442858, f));
        }
        this.IIIIIIIIlIllIIllIIlllIllI.add(new class_0527(this.IIIllIIlIIIIIIlIlIIllIIlI, "Mods", n / 2 - 50, n2 / 2 - 19, 100, 28, -13916106, f));
        this.IIIIIIIIlIllIIllIIlllIllI.add(new class_0527(this.IlIIIIIllllllIIlllIllllll, "cog-64.png", n / 2 + 54, n2 / 2 - 19, 28, 28, -12418828, f));
        this.IIIIIIIIlIllIIllIIlllIllI.add(new class_0527(this.lIllllIIlIIIlIllllllIIIll, "profiles-64.png", n / 2 - 82, n2 / 2 - 19, 28, 28, -12418828, f));
        lIIIIlIlIIlllllIIllIIlIII = false;
        this.IIIllIllIIlIlIlIlIllllIIl = null;
        this.lIlIlIIIIIIlIIllllIlIIllI = 5;
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
        float f = 1.0f / LunarClient.IllIIIllIIIIlIlIlIllIIlll();
        int n = (int)((float)this.IlIlIIlllIIlIllIIIlllllIl / f);
        int n2 = (int)((float)this.lIIlIIIIIlIlllIlIIlIlIlll / f);
        this.lllIIIllIIIIlllIlIIllIIll(n);
        if (!this.llIIlIlIlllIIllIlIlllIllI.isEmpty()) {
            boolean bl = Keyboard.isKeyDown((int)203);
            boolean bl2 = Keyboard.isKeyDown((int)205);
            boolean bl3 = Keyboard.isKeyDown((int)200);
            boolean bl4 = Keyboard.isKeyDown((int)208);
            if (bl || bl2 || bl3 || bl4) {
                ++this.llIIlIIllIIllIlIIllIIllII;
                if (this.llIIlIIllIIllIlIIllIIllII > 10) {
                    for (class_1376 class_13762 : this.llIIlIlIlllIIllIlIlllIllI) {
                        class_1665 class_16652 = class_13762.lllIIIllIIIIlllIlIIllIIll;
                        if (class_16652 == null) continue;
                        if (bl) {
                            class_16652.lllIIIllIIIIlllIlIIllIIll((int)class_16652.IllIIIllIIIIlIlIlIllIIlll() - 1, (float)((int)class_16652.lIIIIlIlIIlllllIIllIIlIII()));
                            continue;
                        }
                        if (bl2) {
                            class_16652.lllIIIllIIIIlllIlIIllIIll((int)class_16652.IllIIIllIIIIlIlIlIllIIlll() + 1, (float)((int)class_16652.lIIIIlIlIIlllllIIllIIlIII()));
                            continue;
                        }
                        if (bl3) {
                            class_16652.lllIIIllIIIIlllIlIIllIIll((int)class_16652.IllIIIllIIIIlIlIlIllIIlll(), (float)((int)class_16652.lIIIIlIlIIlllllIIllIIlIII() - 1));
                            continue;
                        }
                        if (!bl4) continue;
                        class_16652.lllIIIllIIIIlllIlIIllIIll((int)class_16652.IllIIIllIIIIlIlIlIllIIlll(), (float)((int)class_16652.lIIIIlIlIIlllllIIllIIlIII() + 1));
                    }
                }
            }
        }
        float f2 = this.lIlIlIIIIIIlIIllllIlIIllI > 30 ? 2.0f + (float)this.lIlIlIIIIIIlIIllllIlIIllI / 2.0f : 4.0f;
        this.lIlIlIIIIIIlIIllllIlIIllI = (float)this.lIlIlIIIIIIlIIllllIlIIllI + f2 >= 255.0f ? 255 : (int)((float)this.lIlIlIIIIIIlIIllllIlIIllI + f2);
    }

    private float lllIIIllIIIIlllIlIIllIIll(Rectangle rectangle, Rectangle rectangle2) {
        float f = Math.max(Math.abs(rectangle.x - rectangle2.x) - rectangle2.width / 2, 0);
        float f2 = Math.max(Math.abs(rectangle.y - rectangle2.y) - rectangle2.height / 2, 0);
        return f * f + f2 * f2;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
        Object object;
        float f2;
        float[] arrf;
        Object object222;
        Object object322;
        super.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
        this.lIlIllIIlIIlIIlIIlIIlIIll();
        class_0321 class_03212 = new class_0321(this.lllllIlllIIllIlIIlIIIllII, this.lllllIlllIIllIlIIlIIIllII.displayWidth, this.lllllIlllIIllIlIIlIIIllII.displayHeight);
        float f3 = 1.0f / LunarClient.IllIIIllIIIIlIlIlIllIIlll();
        if (IIIIlIllIlIIlIIlIllIlIlll != null) {
            if (!Mouse.isButtonDown((int)1)) {
                class_0857.lllIIIllIIIIlllIlIIllIIll(2.0, 0.0, 2.5, (double)this.lIIlIIIIIlIlllIlIIlIlIlll, 0.0, -15599126);
                class_0857.lllIIIllIIIIlllIlIIllIIll((double)((float)this.IlIlIIlllIIlIllIIIlllllIl - 2.5f), 0.0, (double)(this.IlIlIIlllIIlIllIIIlllllIl - 2), (double)this.lIIlIIIIIlIlllIlIIlIlIlll, 0.0, -15599126);
                class_0857.lllIIIllIIIIlllIlIIllIIll(0.0, 2.0, (double)this.IlIlIIlllIIlIllIIIlllllIl, 2.5, 0.0, -15599126);
                class_0857.lllIIIllIIIIlllIlIIllIIll(0.0, (double)((float)this.lIIlIIIIIlIlllIlIIlIlIlll - 3.5f), (double)this.IlIlIIlllIIlIllIIIlllllIl, (double)(this.lIIlIIIIIlIlllIlIIlIlIlll - 3), 0.0, -15599126);
            }
            this.IIlIIlIlIlIllIIlIlIIIIlll.sort((class_16652, class_16653) -> {
                if (class_16652 == IIIIlIllIlIIlIIlIllIlIlll || class_16653 == IIIIlIllIlIIlIIlIllIlIlll || class_16652.IlIlllIIIIIIlIIllIIllIlll() == null || class_16653.IlIlllIIIIIIlIIllIIllIlll() == null) {
                    return 0;
                }
                float[] arrf = class_16652.lllIIIllIIIIlllIlIIllIIll(class_03212, true);
                float[] arrf2 = class_16653.lllIIIllIIIIlllIlIIllIIll(class_03212, true);
                float[] arrf3 = IIIIlIllIlIIlIIlIllIlIlll.lllIIIllIIIIlllIlIIllIIll(class_03212, true);
                Rectangle rectangle = new Rectangle((int)(arrf[0] * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue()), (int)(arrf[1] * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue()), (int)(class_16652.llIllllIlIllIIIlIllIIlIlI * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue()), (int)(class_16652.lIlllIlllIlIIIIlllIlIlIIl * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue()));
                Rectangle rectangle2 = new Rectangle((int)(arrf2[0] * ((Float)class_16653.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue()), (int)(arrf2[1] * ((Float)class_16653.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue()), (int)(class_16653.llIllllIlIllIIIlIllIIlIlI * ((Float)class_16653.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue()), (int)(class_16653.lIlllIlllIlIIIIlllIlIlIIl * ((Float)class_16653.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue()));
                Rectangle rectangle3 = new Rectangle((int)(arrf3[0] * ((Float)class_0822.IIIIlIllIlIIlIIlIllIlIlll.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue()), (int)(arrf3[1] * ((Float)class_0822.IIIIlIllIlIIlIIlIllIlIlll.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue()), (int)(class_0822.IIIIlIllIlIIlIIlIllIlIlll.llIllllIlIllIIIlIllIIlIlI * ((Float)class_0822.IIIIlIllIlIIlIIlIllIlIlll.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue()), (int)(class_0822.IIIIlIllIlIIlIIlIllIlIlll.lIlllIlllIlIIIIlllIlIlIIl * ((Float)class_0822.IIIIlIllIlIIlIIlIllIlIlll.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue()));
                try {
                    if (this.lllIIIllIIIIlllIlIIllIIll(rectangle, rectangle3) > this.lllIIIllIIIIlllIlIIllIIll(rectangle2, rectangle3)) {
                        return -1;
                    }
                    return 1;
                }
                catch (Exception exception) {
                    return 0;
                }
            });
            class_1376 class_13762 = this.lllIIIllIIIIlllIlIIllIIll(IIIIlIllIlIIlIIlIllIlIlll);
            if (class_13762 != null) {
                this.llIIlIlIlllIIllIlIlllIllI.remove(class_13762);
                this.llIIlIlIlllIIllIlIlllIllI.add(class_13762);
            }
            for (Object object4 : this.llIIlIlIlllIIllIlIlllIllI) {
                this.lllIIIllIIIIlllIlIIllIIll((class_1376)object4, n, n2, class_03212);
                if (!((Boolean) LunarClient.getInstance().getSettingsManager().llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).booleanValue() || !this.IlIlIIlllIllllllllIIIlIlI || Mouse.isButtonDown((int)1) || ((class_1376)object4).lllIIIllIIIIlllIlIIllIIll != IIIIlIllIlIIlIIlIllIlIlll) continue;
                for (Object object322 : this.IIlIIlIlIlIllIIlIlIIIIlll) {
                    if (this.lllIIIllIIIIlllIlIIllIIll((class_1665)object322) != null || ((class_1665)object322).IlIlllIIIIIIlIIllIIllIlll() == null || !((class_1665)object322).lIllllIIlIIIlIllllllIIIll() || ((class_1665)object322).IIIllIIlIIIIIIlIlIIllIIlI().contains("Zans") && LunarClient.getInstance().getModuleManager().lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll().lllIlIIlIIIlIlIIIllIlllIl().lIlllIlllIIIIlIIlllIllIII) continue;
                    float f4 = 18.0f;
                    if (((class_1665)object322).llIllllIlIllIIIlIllIIlIlI < f4) {
                        ((class_1665)object322).llIllllIlIllIIIlIllIIlIlI = (int)f4;
                    }
                    if (((class_1665)object322).lIlllIlllIlIIIIlllIlIlIIl < 18.0f) {
                        ((class_1665)object322).lIlllIlllIlIIIIlllIlIlIIl = 18.0f;
                    }
                    if (object4.lllIIIllIIIIlllIlIIllIIll.llIllllIlIllIIIlIllIIlIlI < f4) {
                        object4.lllIIIllIIIIlllIlIIllIIll.llIllllIlIllIIIlIllIIlIlI = (int)f4;
                    }
                    if (object4.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIlIIIIlllIlIlIIl < 18.0f) {
                        object4.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIlIIIIlllIlIlIIl = 18.0f;
                    }
                    boolean bl = true;
                    boolean bl2 = true;
                    object222 = ((class_1665)object322).lllIIIllIIIIlllIlIIllIIll(class_03212, true);
                    arrf = ((class_1376)object4).lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(class_03212, true);
                    f2 = object222[0] * ((Float)((class_1665)object322).llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() - arrf[0] * ((Float)object4.lllIIIllIIIIlllIlIIllIIll.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue();
                    float f5 = (object222[0] + ((class_1665)object322).llIllllIlIllIIIlIllIIlIlI) * ((Float)((class_1665)object322).llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() - (arrf[0] + object4.lllIIIllIIIIlllIlIIllIIll.llIllllIlIllIIIlIllIIlIlI) * ((Float)object4.lllIIIllIIIIlllIlIIllIIll.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue();
                    reference var18_31 = (object222[0] + ((class_1665)object322).llIllllIlIllIIIlIllIIlIlI) * ((Float)((class_1665)object322).llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() - arrf[0] * ((Float)object4.lllIIIllIIIIlllIlIIllIIll.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue();
                    reference var19_33 = object222[0] * ((Float)((class_1665)object322).llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() - (arrf[0] + object4.lllIIIllIIIIlllIlIIllIIll.llIllllIlIllIIIlIllIIlIlI) * ((Float)object4.lllIIIllIIIIlllIlIIllIIll.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue();
                    reference var20_35 = object222[1] * ((Float)((class_1665)object322).llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() - arrf[1] * ((Float)object4.lllIIIllIIIIlllIlIIllIIll.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue();
                    reference var21_37 = (object222[1] + ((class_1665)object322).lIlllIlllIlIIIIlllIlIlIIl) * ((Float)((class_1665)object322).llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() - (arrf[1] + object4.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIlIIIIlllIlIlIIl) * ((Float)object4.lllIIIllIIIIlllIlIIllIIll.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue();
                    reference var22_39 = (object222[1] + ((class_1665)object322).lIlllIlllIlIIIIlllIlIlIIl) * ((Float)((class_1665)object322).llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() - arrf[1] * ((Float)object4.lllIIIllIIIIlllIlIIllIIll.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue();
                    object = object222[1] * ((Float)((class_1665)object322).llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() - (arrf[1] + object4.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIlIIIIlllIlIlIIl) * ((Float)object4.lllIIIllIIIIlllIlIIllIIll.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue();
                    int n3 = 2;
                    if (f2 >= (float)(-n3) && f2 <= (float)n3) {
                        bl = false;
                        this.IlIllllllIIlIIllllIIlIIIl(f2);
                    }
                    if (f5 >= (float)(-n3) && f5 <= (float)n3 && bl) {
                        bl = false;
                        this.IlIllllllIIlIIllllIIlIIIl(f5);
                    }
                    if (var19_33 >= (float)(-n3) && var19_33 <= (float)n3 && bl) {
                        bl = false;
                        this.IlIllllllIIlIIllllIIlIIIl((float)var19_33);
                    }
                    if (var18_31 >= (float)(-n3) && var18_31 <= (float)n3 && bl) {
                        this.IlIllllllIIlIIllllIIlIIIl((float)var18_31);
                    }
                    if (var20_35 >= (float)(-n3) && var20_35 <= (float)n3) {
                        bl2 = false;
                        this.lIlllIlllIIIIlIIlllIllIII((float)var20_35);
                    }
                    if (var21_37 >= (float)(-n3) && var21_37 <= (float)n3 && bl2) {
                        bl2 = false;
                        this.lIlllIlllIIIIlIIlllIllIII((float)var21_37);
                    }
                    if (object >= (float)(-n3) && object <= (float)n3 && bl2) {
                        bl2 = false;
                        this.lIlllIlllIIIIlIIlllIllIII((float)object);
                    }
                    if (!(var22_39 >= (float)(-n3)) || !(var22_39 <= (float)n3) || !bl2) continue;
                    this.lIlllIlllIIIIlIIlllIllIII((float)var22_39);
                }
            }
        } else if (this.lllIIIIIIlIlllIIlIlIIIllI != null) {
            float f6 = 1.0f;
            switch (this.lllIIIIIIlIlllIIlIlIIIllI.IIIllIllIIlIlIlIlIllllIIl) {
                case lllIIIllIIIIlllIlIIllIIll: {
                    int n4 = n2 - this.lllIIIIIIlIlllIIlIlIIIllI.IIIllIIlIIIIIIlIlIIllIIlI + (n - this.lllIIIIIIlIlllIIlIlIIIllI.IllIIlllllllIIlIIlIIIIlIl);
                    f6 = this.lllIIIIIIlIlllIIlIlIIIllI.lIlllIlllIIIIlIIlllIllIII - (float)n4 / 115.0f;
                    break;
                }
                case lIlllIlllIIIIlIIlllIllIII: {
                    int n4 = n2 - this.lllIIIIIIlIlllIIlIlIIIllI.IIIllIIlIIIIIIlIlIIllIIlI + (n - this.lllIIIIIIlIlllIIlIlIIIllI.IllIIlllllllIIlIIlIIIIlIl);
                    f6 = this.lllIIIIIIlIlllIIlIlIIIllI.lIlllIlllIIIIlIIlllIllIII + (float)n4 / 115.0f;
                    break;
                }
                case IlIllllllIIlIIllllIIlIIIl: {
                    int n4 = n - this.lllIIIIIIlIlllIIlIlIIIllI.IllIIlllllllIIlIIlIIIIlIl - (n2 - this.lllIIIIIIlIlllIIlIlIIIllI.IIIllIIlIIIIIIlIlIIllIIlI);
                    f6 = this.lllIIIIIIlIlllIIlIlIIIllI.lIlllIlllIIIIlIIlllIllIII - (float)n4 / 115.0f;
                    break;
                }
                case lllIlIIlIIIlIlIIIllIlllIl: {
                    int n4 = n - this.lllIIIIIIlIlllIIlIlIIIllI.IllIIlllllllIIlIIlIIIIlIl - (n2 - this.lllIIIIIIlIlllIIlIlIIIllI.IIIllIIlIIIIIIlIlIIllIIlI);
                    f6 = this.lllIIIIIIlIlllIIlIlIIIllI.lIlllIlllIIIIlIIlllIllIII + (float)n4 / 115.0f;
                }
            }
            if (f6 >= 0.5f && f6 <= 1.5f) {
                this.lllIIIIIIlIlllIIlIlIIIllI.lllIIIllIIIIlllIlIIllIIll.llIIlIlIlllIIllIlIlllIllI.lllIlIIlIIIlIlIIIllIlllIl(Float.valueOf((float)((double)Math.round((double)f6 * 100.0) / 100.0)));
            }
        }
        this.lllIIIllIIIIlllIlIIllIIll(class_03212);
        boolean bl = true;
        for (Object object4 : this.IIlIIlIlIlIllIIlIlIIIIlll) {
            boolean bl3 = this.lllIIIllIIIIlllIlIIllIIll(f3, (class_1665)object4, class_03212, n, n2, bl);
            if (bl3) continue;
            bl = false;
        }
        GL11.glPushMatrix();
        GL11.glScalef((float)f3, (float)f3, (float)f3);
        int n5 = (int)((float)this.IlIlIIlllIIlIllIIIlllllIl / f3);
        int n6 = (int)((float)this.lIIlIIIIIlIlllIlIIlIlIlll / f3);
        this.llIIIlllIlllIlIllIIIIllIl.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
        this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
        float f7 = (float)(this.lIlIlIIIIIIlIIllllIlIIllI * 8) / 255.0f;
        GL11.glPushMatrix();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)f7);
        object322 = Color.WHITE;
        if (f7 / 4.0f > 0.0f && f7 / 4.0f < 1.0f) {
            object322 = new Color(1.0f, 1.0f, 1.0f, f7 / 9.0f);
        }
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)(f7 / 9.0f));
        if (f7 > 2.0f) {
            int n7 = LunarClient.getInstance().robotoBold22px.lllIlIIlIIIlIlIIIllIlllIl("LUNAR");
            LunarClient.getInstance().lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll("LUNAR", n5 / 2 - n7 - 4 + 1, (float)(n6 / 2 - 40 - (LunarClient.getInstance().IlIlllIIIIIIlIIllIIllIlll() ? 22 : 0) + 1), new Color(0.0f, 0.0f, 0.0f, 0.4f).getRGB());
            LunarClient.getInstance().lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll("LUNAR", n5 / 2 - n7 - 4, (float)(n6 / 2 - 40 - (LunarClient.getInstance().IlIlllIIIIIIlIIllIIllIlll() ? 22 : 0)), ((Color)object322).getRGB());
            LunarClient.getInstance().IlIlIIlllIIlIllIIIlllllIl.lllIIIllIIIIlllIlIIllIIll("CLIENT", n5 / 2 + 2 + 1, (float)(n6 / 2 - 40 - (LunarClient.getInstance().IlIlllIIIIIIlIIllIIllIlll() ? 22 : 0) + 1), new Color(0.0f, 0.0f, 0.0f, 0.4f).getRGB());
            LunarClient.getInstance().IlIlIIlllIIlIllIIIlllllIl.lllIIIllIIIIlllIlIIllIIll("CLIENT", n5 / 2 + 2, (float)(n6 / 2 - 40 - (LunarClient.getInstance().IlIlllIIIIIIlIIllIIllIlll() ? 22 : 0)), ((Color)object322).getRGB());
        }
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        if (f7 > 1.0f) {
            float f8 = -((float)this.lIlIlIIIIIIlIIllllIlIIllI / 20.0f);
            GL11.glTranslatef((float)0.0f, (float)f8, (float)0.0f);
        }
        float f9 = n5 / 2 - 32;
        float f10 = n6 / 2 - 92 - (LunarClient.getInstance().IlIlllIIIIIIlIIllIIllIlll() ? 22 : 0);
        if (this.IllllIIIIlIIlIIIIlllIIIIl == null) {
            this.IllllIIIIlIIlIIIIlllIIIIl = new class_1623();
        }
        this.IllllIIIIlIIlIIIIlllIIIIl.lllIIIllIIIIlllIlIIllIIll(f9, f10, 64.0f, 58.5f);
        this.IllllIIIIlIIlIIIIlllIIIIl.lllIlIIlIIIlIlIIIllIlllIl(0.0f, 0.0f, true);
        GL11.glPopMatrix();
        Iterator iterator = this.IIIIIIIIlIllIIllIIlllIllI.iterator();
        while (iterator.hasNext()) {
            object222 = (class_0527)iterator.next();
            ((class_0527)object222).lllIIIllIIIIlllIlIIllIIll(n, n2, f);
        }
        if (IIIIlIllIlIIlIIlIllIlIlll == null) {
            GL11.glPushMatrix();
            GL11.glEnable((int)3089);
            class_0857.lllIIIllIIIIlllIlIIllIIll(n5 / 2 - 185, n6 / 2 + 15, n5 / 2 + 185, n6 - 20, (float)class_03212.IlIIIIIllllllIIlllIllllll() * f3, n6);
            for (Object object222 : this.IllIIIIllIIllIllIlllIlIIl) {
                if (object222 != this.IIIllIllIIlIlIlIlIllllIIl && object222 != this.IllIIIllIIIIlIlIlIllIIlll) continue;
                ((class_1194)object222).lllIIIllIIIIlllIlIIllIIll(n, n2, f);
            }
            GL11.glDisable((int)3089);
            GL11.glPopMatrix();
        }
        GL11.glPopMatrix();
        if (this.lIlIIllllIlIIIIllIIIIlIIl != -1) {
            if (Mouse.isButtonDown((int)0)) {
                if (this.lIlIIllllIlIIIIllIIIIlIIl != n && this.llIlllIIllIlllIlIlIlIIIll != n2) {
                    class_0822.lllIIIllIIIIlllIlIIllIIll(n, this.llIlllIIllIlllIlIlIlIIIll, (float)n + 0.5f, n2, -1358888961);
                    class_0822.lllIIIllIIIIlllIlIIllIIll((float)this.lIlIIllllIlIIIIllIIIIlIIl - 0.5f, n2, (float)n + 0.5f, (float)n2 + 0.5f, -1358888961);
                    class_0822.lllIIIllIIIIlllIlIIllIIll((float)this.lIlIIllllIlIIIIllIIIIlIIl - 0.5f, this.llIlllIIllIlllIlIlIlIIIll, this.lIlIIllllIlIIIIllIIIIlIIl, n2, -1358888961);
                    class_0822.lllIIIllIIIIlllIlIIllIIll((float)this.lIlIIllllIlIIIIllIIIIlIIl - 0.5f, (float)this.llIlllIIllIlllIlIlIlIIIll - 0.5f, (float)n + 0.5f, this.llIlllIIllIlllIlIlIlIIIll, -1358888961);
                    class_0822.lllIIIllIIIIlllIlIIllIIll(this.lIlIIllllIlIIIIllIIIIlIIl, this.llIlllIIllIlllIlIlIlIIIll, n, n2, 0x1F00FFFF);
                }
            } else {
                this.llIIlIlIlllIIllIlIlllIllI.clear();
                for (Object object222 : this.IIlIIlIlIlIllIIlIlIIIIlll) {
                    int n8;
                    int n9;
                    int n10;
                    int n11;
                    Rectangle rectangle;
                    if (((class_1665)object222).IlIlllIIIIIIlIIllIIllIlll() == null || !((class_1665)object222).lIllllIIlIIIlIllllllIIIll() || ((class_1665)object222).IIIllIIlIIIIIIlIlIIllIIlI().contains("Zans") && LunarClient.getInstance().getModuleManager().lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll().lllIlIIlIIIlIlIIIllIlllIl().lIlllIlllIIIIlIIlllIllIII) continue;
                    arrf = ((class_1665)object222).lllIIIllIIIIlllIlIIllIIll(class_03212, true);
                    f2 = f3 / ((Float)((class_1665)object222).llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue();
                    Rectangle rectangle2 = new Rectangle((int)(arrf[0] * ((Float)((class_1665)object222).llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() - 2.0f), (int)(arrf[1] * ((Float)((class_1665)object222).llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() - 2.0f), (int)(((class_1665)object222).llIllllIlIllIIIlIllIIlIlI * ((Float)((class_1665)object222).llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() + 4.0f), (int)(((class_1665)object222).lIlllIlllIlIIIIlllIlIlIIl * ((Float)((class_1665)object222).llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() + 4.0f));
                    if (!rectangle2.intersects(rectangle = new Rectangle(n11 = Math.min(this.lIlIIllllIlIIIIllIIIIlIIl, n), n10 = Math.min(this.llIlllIIllIlllIlIlIlIIIll, n2), n9 = Math.max(this.lIlIIllllIlIIIIllIIIIlIIl, n) - n11, n8 = Math.max(this.llIlllIIllIlllIlIlIlIIIll, n2) - n10))) continue;
                    object = (float)n - ((class_1665)object222).IllIIIllIIIIlIlIlIllIIlll();
                    float f11 = (float)n2 - ((class_1665)object222).lIIIIlIlIIlllllIIllIIlIII();
                    this.llIIlIlIlllIIllIlIlllIllI.add(new class_1376((class_1665)object222, (float)object, f11));
                }
                this.lIlIIllllIlIIIIllIIIIlIIl = -1;
                this.llIlllIIllIlllIlIlIlIIIll = -1;
            }
        }
        if (this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(n, n2) && (this.IIIllIllIIlIlIlIlIllllIIl == null || !this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(n, n2))) {
            this.lllIlIIlIIIlIlIIIllIlllIl(f3);
        }
    }

    private void lllIlIIlIIIlIlIIIllIlllIl(float f) {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)4.0f, (float)((float)this.lIIlIIIIIlIlllIlIIlIlIlll - 185.0f * f), (float)0.0f);
        GL11.glScalef((float)f, (float)f, (float)f);
        class_0210.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 240.0f, 140.0f, -1895825408);
        LunarClient.getInstance().ubuntuMedium16px.lllIIIllIIIIlllIlIIllIIll("Shortcuts & Movement", 4.0f, 2.0f, -1);
        class_0210.lllIIIllIIIIlllIlIIllIIll(4.0f, 12.0f, 234.0f, 12.5f, 0x4FFFFFFF);
        int n = 16;
        this.lllIIIllIIIIlllIlIIllIIll("Mouse1", 6, n);
        LunarClient.getInstance().robotoMedium13px.lllIIIllIIIIlllIlIIllIIll("| " + (Object)((Object)class_1227.llIIlllIllIllllIIIlIIIIII) + "HOLD" + (Object)((Object)class_1227.IIlllIlIlllIllIIIlllIIlIl) + " Add mods to selected region", 80.0f, (float)n, -1);
        this.lllIIIllIIIIlllIlIIllIIll("Mouse1", 6, n += 12);
        LunarClient.getInstance().robotoMedium13px.lllIIIllIIIIlllIlIIllIIll("| " + (Object)((Object)class_1227.llIIlllIllIllllIIIlIIIIII) + "HOLD" + (Object)((Object)class_1227.IIlllIlIlllIllIIIlllIIlIl) + " Select & drag mods", 80.0f, (float)n, -1);
        this.lllIIIllIIIIlllIlIIllIIll("Mouse2", 6, n += 12);
        LunarClient.getInstance().robotoMedium13px.lllIIIllIIIIlllIlIIllIIll("| " + (Object)((Object)class_1227.llIIlllIllIllllIIIlIIIIII) + "CLICK" + (Object)((Object)class_1227.IIlllIlIlllIllIIIlllIIlIl) + " Reset mod to closest position", 80.0f, (float)n, -1);
        this.lllIIIllIIIIlllIlIIllIIll("Mouse2", 6, n += 12);
        LunarClient.getInstance().robotoMedium13px.lllIIIllIIIIlllIlIIllIIll("| " + (Object)((Object)class_1227.llIIlllIllIllllIIIlIIIIII) + "HOLD" + (Object)((Object)class_1227.IIlllIlIlllIllIIIlllIIlIl) + " Don't lock mods while dragging", 80.0f, (float)n, -1);
        this.lllIIIllIIIIlllIlIIllIIll("CTRL", 6, n += 12);
        LunarClient.getInstance().robotoMedium13px.lllIIIllIIIIlllIlIIllIIll("+", 30.0f, (float)n, -1);
        this.lllIIIllIIIIlllIlIIllIIll("Mouse1", 36, n);
        LunarClient.getInstance().robotoMedium13px.lllIIIllIIIIlllIlIIllIIll("| Toggle (multiple) mod selection", 80.0f, (float)n, -1);
        this.lllIIIllIIIIlllIlIIllIIll("CTRL", 6, n += 12);
        LunarClient.getInstance().robotoMedium13px.lllIIIllIIIIlllIlIIllIIll("+", 30.0f, (float)n, -1);
        this.lllIIIllIIIIlllIlIIllIIll("Z", 36, n);
        LunarClient.getInstance().robotoMedium13px.lllIIIllIIIIlllIlIIllIIll("| Undo mod movements", 80.0f, (float)n, -1);
        this.lllIIIllIIIIlllIlIIllIIll("CTRL", 6, n += 12);
        LunarClient.getInstance().robotoMedium13px.lllIIIllIIIIlllIlIIllIIll("+", 30.0f, (float)n, -1);
        this.lllIIIllIIIIlllIlIIllIIll("Y", 36, n);
        LunarClient.getInstance().robotoMedium13px.lllIIIllIIIIlllIlIIllIIll("| Redo mod movements", 80.0f, (float)n, -1);
        n = 112;
        this.lllIIIllIIIIlllIlIIllIIll("Up", 31, n);
        this.lllIIIllIIIIlllIlIIllIIll("Left", 6, n += 12);
        this.lllIIIllIIIIlllIlIIllIIll("Down", 26, n);
        this.lllIIIllIIIIlllIlIIllIIll("Right", 51, n);
        LunarClient.getInstance().robotoMedium13px.lllIIIllIIIIlllIlIIllIIll("| Move selected mod with precision", 80.0f, (float)n, -1);
        GL11.glPopMatrix();
    }

    private void lllIIIllIIIIlllIlIIllIIll(String string, int n, int n2) {
        LCFontRenderer class_09542 = LunarClient.getInstance().robotoMedium13px;
        float f = class_09542.lllIlIIlIIIlIlIIIllIlllIl(string);
        class_0857.lllIIIllIIIIlllIlIIllIIll((double)n, (double)n2, (double)((float)n + f + 4.0f), (double)(n2 + 10), 2.0, -1073741825);
        class_09542.lllIIIllIIIIlllIlIIllIIll(string, n + 2, (float)n2, -16777216);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        class_0321 class_03212 = new class_0321(this.lllllIlllIIllIlIIlIIIllII, this.lllllIlllIIllIlIIlIIIllII.displayWidth, this.lllllIlllIIllIlIIlIIIllII.displayHeight);
        if (this.IIIllIllIIlIlIlIlIllllIIl != null && this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(n, n2)) {
            this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(n, n2, n3);
        } else {
            Iterator iterator;
            if (!(IIIIlIllIlIIlIIlIllIlIlll != null && this.IlIlIIlllIllllllllIIIlIlI || (iterator = this.lllIIIllIIIIlllIlIIllIIll(class_03212, n, n2)) == null)) {
                boolean bl;
                float[] arrf = ((class_1665)((Object)iterator)).lllIIIllIIIIlllIlIIllIIll(class_03212, true);
                boolean bl2 = !((class_1665)((Object)iterator)).llIIlllIllIllllIIIlIIIIII().isEmpty() && (float)n >= arrf[0] * ((Float)((class_1665)iterator).llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() && (float)n <= (arrf[0] + 10.0f) * ((Float)((class_1665)iterator).llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() && (float)n2 >= (arrf[1] + ((class_1665)iterator).lIlllIlllIlIIIIlllIlIlIIl - 10.0f) * ((Float)((class_1665)iterator).llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() && (float)n2 <= (arrf[1] + ((class_1665)iterator).lIlllIlllIlIIIIlllIlIlIIl + 2.0f) * ((Float)((class_1665)iterator).llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue();
                boolean bl3 = bl = (float)n > (arrf[0] + ((class_1665)iterator).llIllllIlIllIIIlIllIIlIlI - 10.0f) * ((Float)((class_1665)iterator).llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() && (float)n < (arrf[0] + ((class_1665)iterator).llIllllIlIllIIIlIllIIlIlI + 2.0f) * ((Float)((class_1665)iterator).llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() && (float)n2 > (arrf[1] + ((class_1665)iterator).lIlllIlllIlIIIIlllIlIlIIl - 10.0f) * ((Float)((class_1665)iterator).llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() && (float)n2 < (arrf[1] + ((class_1665)iterator).lIlllIlllIlIIIIlllIlIlIIl + 2.0f) * ((Float)((class_1665)iterator).llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue();
                if (bl2) {
                    Minecraft.getMinecraft().IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
                    ((class_0914)this.IlIIIIIllllllIIlllIllllll).IlIlllIIIIIIlIIllIIllIlll = false;
                    ((class_0914)this.IlIIIIIllllllIIlllIllllll).IlIlIIlIlIllIIlIlIIllIIIl = iterator;
                    this.IllIIIllIIIIlIlIlIllIIlll = this.IlIIIIIllllllIIlllIllllll;
                } else if (bl) {
                    Minecraft.getMinecraft().IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
                    ((class_1665)((Object)iterator)).lllIIIllIIIIlllIlIIllIIll(false);
                }
                return;
            }
            for (Object object : this.IIlIIlIlIlIllIIlIlIIIIlll) {
                class_0767 class_07672;
                class_1248 class_12482;
                boolean bl;
                if (((class_1665)object).IlIlllIIIIIIlIIllIIllIlll() == null || !((class_1665)object).lIllllIIlIIIlIllllllIIIll() || object == LunarClient.getInstance().getModuleManager().lIlllIlllIIIIlIIlllIllIII) continue;
                float[] arrf = ((class_1665)object).lllIIIllIIIIlllIlIIllIIll(class_03212, true);
                boolean bl4 = (float)n > arrf[0] * ((Float)((class_1665)object).llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() && (float)n < (arrf[0] + ((class_1665)object).llIllllIlIllIIIlIllIIlIlI) * ((Float)((class_1665)object).llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() && (float)n2 > arrf[1] * ((Float)((class_1665)object).llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() && (float)n2 < (arrf[1] + ((class_1665)object).lIlllIlllIlIIIIlllIlIlIIl) * ((Float)((class_1665)object).llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue();
                boolean bl5 = this.lllIIIIIIlIlllIIlIlIIIllI != null && this.lllIIIIIIlIlllIIlIlIIIllI.lllIIIllIIIIlllIlIIllIIll == object && this.lllIIIIIIlIlllIIlIlIIIllI.IIIllIllIIlIlIlIlIllllIIl == class_1248.lllIlIIlIIIlIlIIIllIlllIl || !bl4 && (float)n >= (arrf[0] + ((class_1665)object).llIllllIlIllIIIlIllIIlIlI - 5.0f) * ((Float)((class_1665)object).llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() && (float)n <= (arrf[0] + ((class_1665)object).llIllllIlIllIIIlIllIIlIlI + 5.0f) * ((Float)((class_1665)object).llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() && (float)n2 >= (arrf[1] - 5.0f) * ((Float)((class_1665)object).llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() && (float)n2 <= (arrf[1] + 5.0f) * ((Float)((class_1665)object).llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue();
                boolean bl6 = this.lllIIIIIIlIlllIIlIlIIIllI != null && this.lllIIIIIIlIlllIIlIlIIIllI.lllIIIllIIIIlllIlIIllIIll == object && this.lllIIIIIIlIlllIIlIlIIIllI.IIIllIllIIlIlIlIlIllllIIl == class_1248.IlIllllllIIlIIllllIIlIIIl || !bl4 && (float)n >= (arrf[0] - 5.0f) * ((Float)((class_1665)object).llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() && (float)n <= (arrf[0] + 5.0f) * ((Float)((class_1665)object).llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() && (float)n2 >= (arrf[1] + ((class_1665)object).lIlllIlllIlIIIIlllIlIlIIl - 5.0f) * ((Float)((class_1665)object).llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() && (float)n2 <= (arrf[1] + ((class_1665)object).lIlllIlllIlIIIIlllIlIlIIl + 5.0f) * ((Float)((class_1665)object).llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue();
                boolean bl7 = this.lllIIIIIIlIlllIIlIlIIIllI != null && this.lllIIIIIIlIlllIIlIlIIIllI.lllIIIllIIIIlllIlIIllIIll == object && this.lllIIIIIIlIlllIIlIlIIIllI.IIIllIllIIlIlIlIlIllllIIl == class_1248.lllIIIllIIIIlllIlIIllIIll || !bl4 && (float)n >= (arrf[0] - 5.0f) * ((Float)((class_1665)object).llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() && (float)n <= (arrf[0] + 5.0f) * ((Float)((class_1665)object).llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() && (float)n2 >= (arrf[1] - 5.0f) * ((Float)((class_1665)object).llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() && (float)n2 <= (arrf[1] + 5.0f) * ((Float)((class_1665)object).llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue();
                boolean bl8 = bl = this.lllIIIIIIlIlllIIlIlIIIllI != null && this.lllIIIIIIlIlllIIlIlIIIllI.lllIIIllIIIIlllIlIIllIIll == object && this.lllIIIIIIlIlllIIlIlIIIllI.IIIllIllIIlIlIlIlIllllIIl == class_1248.lIlllIlllIIIIlIIlllIllIII || !bl4 && (float)n >= (arrf[0] + ((class_1665)object).llIllllIlIllIIIlIllIIlIlI - 5.0f) * ((Float)((class_1665)object).llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() && (float)n <= (arrf[0] + ((class_1665)object).llIllllIlIllIIIlIllIIlIlI + 5.0f) * ((Float)((class_1665)object).llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() && (float)n2 >= (arrf[1] + ((class_1665)object).lIlllIlllIlIIIIlllIlIlIIl - 5.0f) * ((Float)((class_1665)object).llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() && (float)n2 <= (arrf[1] + ((class_1665)object).lIlllIlllIlIIIIlllIlIlIIl + 5.0f) * ((Float)((class_1665)object).llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue();
                if (this.lIlIIllllIlIIIIllIIIIlIIl != -1 || !bl5 && !bl6 && !bl7 && !bl) continue;
                if (bl5) {
                    class_12482 = class_1248.lllIlIIlIIIlIlIIIllIlllIl;
                    class_07672 = class_0767.IlIllllllIIlIIllllIIlIIIl;
                } else if (bl6) {
                    class_12482 = class_1248.IlIllllllIIlIIllllIIlIIIl;
                    class_07672 = class_0767.IllIIlllllllIIlIIlIIIIlIl;
                } else if (bl7) {
                    class_12482 = class_1248.lllIIIllIIIIlllIlIIllIIll;
                    class_07672 = class_0767.IllIIIllIIIIlIlIlIllIIlll;
                } else {
                    class_12482 = class_1248.lIlllIlllIIIIlIIlllIllIII;
                    class_07672 = class_0767.lllIIIllIIIIlllIlIIllIIll;
                }
                if (this.lllIlIIlIIIlIlIIIllIlllIl(class_03212, n, n2)) continue;
                if (n3 == 0) {
                    this.IIllIllIIllIIlllIIIlIlllI.add(new class_0010(this, this.llIIlIlIlllIIllIlIlllIllI));
                    this.lllIIIIIIlIlllIIlIlIIIllI = new class_0307(this, (class_1665)object, class_12482, n, n2);
                    this.lllIIIllIIIIlllIlIIllIIll((class_1665)object, class_07672, n, n2, class_03212);
                } else if (n3 == 1) {
                    class_0767 class_07673 = ((class_1665)object).IlIlllIIIIIIlIIllIIllIlll();
                    this.lllIIIllIIIIlllIlIIllIIll((class_1665)object, class_07672, n, n2, class_03212);
                    ((class_1665)object).llIIlIlIlllIIllIlIlllIllI.lllIlIIlIIIlIlIIIllIlllIl(Float.valueOf(1.0f));
                    this.lllIIIllIIIIlllIlIIllIIll((class_1665)object, class_07673, n, n2, class_03212);
                }
                return;
            }
            if (IIIIlIllIlIIlIIlIllIlIlll == null) {
                if (this.llIIIlllIlllIlIllIIIIllIl.lllIIIllIIIIlllIlIIllIIll(n, n2)) {
                    Minecraft.getMinecraft().IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
                    this.IIIIlIIlIIIllIIIIllIIIlII = !this.IIIIlIIlIIIllIIIIllIIIlII;
                }
                this.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
                this.lllIIIllIIIIlllIlIIllIIll(class_03212, n, n2, n3);
            }
            for (Object object : this.IIIIIIIIlIllIIllIIlllIllI) {
                if (!((class_2117)object).lllIIIllIIIIlllIlIIllIIll(n, n2)) continue;
                return;
            }
            boolean bl = this.lllIlIIlIIIlIlIIIllIlllIl(class_03212, n, n2);
            if (bl) {
                return;
            }
            if (!this.llIIlIlIlllIIllIlIlllIllI.isEmpty()) {
                this.llIIlIlIlllIIllIlIlllIllI.clear();
                Minecraft.getMinecraft().IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
            }
            this.lIlIIllllIlIIIIllIIIIlIIl = n;
            this.llIlllIIllIlllIlIlIlIIIll = n2;
        }
        if (!this.llIIlIlIlllIIllIlIlllIllI.isEmpty()) {
            this.llIIlIIllIIllIlIIllIIllII = 0;
        }
    }

    @Override
    public void a_() {
        super.a_();
        int n = Mouse.getEventDWheel();
        if (this.IIIllIllIIlIlIlIlIllllIIl != null) {
            this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(n);
        }
    }

    private void lllIIIllIIIIlllIlIIllIIll(class_1665 class_16652, class_0767 class_07672, int n, int n2, class_0321 class_03212) {
        if (class_07672 != class_16652.IlIlllIIIIIIlIIllIIllIlll()) {
            float[] arrf = class_16652.lllIIIllIIIIlllIlIIllIIll(class_03212, true);
            class_16652.lllIIIllIIIIlllIlIIllIIll(class_07672);
            float[] arrf2 = class_16652.lllIIIllIIIIlllIlIIllIIll(class_03212, false);
            class_16652.lllIIIllIIIIlllIlIIllIIll(arrf[0] * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() - arrf2[0] * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue(), arrf[1] * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() - arrf2[1] * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue());
        }
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, int n3) {
        class_0321 class_03212 = new class_0321(this.lllllIlllIIllIlIIlIIIllII, this.lllllIlllIIllIlIIlIIIllII.displayWidth, this.lllllIlllIIllIlIIlIIIllII.displayHeight);
        if (this.lllIIIIIIlIlllIIlIlIIIllI != null && n3 == 0) {
            this.lllIIIllIIIIlllIlIIllIIll(this.lllIIIIIIlIlllIIlIlIIIllI.lllIIIllIIIIlllIlIIllIIll, this.lllIIIIIIlIlllIIlIlIIIllI.IllIIIllIIIIlIlIlIllIIlll, n, n2, class_03212);
            this.lllIIIIIIlIlllIIlIlIIIllI = null;
        }
        if (IIIIlIllIlIIlIIlIllIlIlll != null && n3 == 0) {
            if (this.IlIlIIlllIllllllllIIIlIlI) {
                for (class_1376 class_13762 : this.llIIlIlIlllIIllIlIlllIllI) {
                    class_0767 class_07672 = class_1271.lllIIIllIIIIlllIlIIllIIll(n, n2, class_03212);
                    if (class_07672 == class_0767.IlIIIIIllllllIIlllIllllll || class_07672 == class_13762.lllIIIllIIIIlllIlIIllIIll.IlIlllIIIIIIlIIllIIllIlll() || !this.IlIlIIlllIllllllllIIIlIlI) continue;
                    this.lllIIIllIIIIlllIlIIllIIll(class_13762.lllIIIllIIIIlllIlIIllIIll, class_07672, n, n2, class_03212);
                    class_13762.lllIlIIlIIIlIlIIIllIlllIl = (float)n - class_13762.lllIIIllIIIIlllIlIIllIIll.IllIIIllIIIIlIlIlIllIIlll();
                    class_13762.IlIllllllIIlIIllllIIlIIIl = (float)n2 - class_13762.lllIIIllIIIIlllIlIIllIIll.lIIIIlIlIIlllllIIllIIlIII();
                }
                if (this.lllIIIllIIIIlllIlIIllIIll(IIIIlIllIlIIlIIlIllIlIlll) == null) {
                    Object object = IIIIlIllIlIIlIIlIllIlIlll.lllIIIllIIIIlllIlIIllIIll(class_03212, true);
                    float f = (float)n - IIIIlIllIlIIlIIlIllIlIlll.IllIIIllIIIIlIlIlIllIIlll();
                    float f2 = (float)n2 - IIIIlIllIlIIlIIlIllIlIlll.lIIIIlIlIIlllllIIllIIlIII();
                    this.llIIlIlIlllIIllIlIlllIllI.add(new class_1376(IIIIlIllIlIIlIIlIllIlIlll, f, f2));
                }
                Minecraft.getMinecraft().IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
                IIIIlIllIlIIlIIlIllIlIlll = null;
            } else {
                IIIIlIllIlIIlIIlIllIlIlll = null;
            }
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(char c, int n) {
        if (n == 1) {
            LunarClient.getInstance().lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll();
        }
        super.lllIIIllIIIIlllIlIIllIIll(c, n);
        if (n == 44 && class_0822.llIllllIlIllIIIlIllIIlIlI()) {
            if (!this.IIllIllIIllIIlllIIIlIlllI.isEmpty()) {
                int n2 = this.IIllIllIIllIIlllIIIlIlllI.size() - 1;
                class_0010 class_00102 = (class_0010)this.IIllIllIIllIIlllIIIlIlllI.get(this.IIllIllIIllIIlllIIIlIlllI.size() - 1);
                for (int i = 0; i < class_00102.lllIIIllIIIIlllIlIIllIIll.size(); ++i) {
                    class_1665 class_16652 = (class_1665)class_00102.lllIIIllIIIIlllIlIIllIIll.get(i);
                    float f = ((Float)class_00102.IlIllllllIIlIIllllIIlIIIl.get(i)).floatValue();
                    float f2 = ((Float)class_00102.lIlllIlllIIIIlIIlllIllIII.get(i)).floatValue();
                    class_0767 class_07672 = (class_0767)((Object)class_00102.lllIlIIlIIIlIlIIIllIlllIl.get(i));
                    Float f3 = (Float)class_00102.IlIIIIIllllllIIlllIllllll.get(i);
                    class_16652.lllIIIllIIIIlllIlIIllIIll(class_07672);
                    class_16652.lllIIIllIIIIlllIlIIllIIll(f, f2);
                    class_16652.llIIlIlIlllIIllIlIlllIllI.lllIlIIlIIIlIlIIIllIlllIl(f3);
                }
                if (this.llllllIlIllllIlIlIlIIIIlI.size() > 50) {
                    this.llllllIlIllllIlIlIlIIIIlI.remove(0);
                }
                this.llllllIlIllllIlIlIlIIIIlI.add(class_00102);
                this.IIllIllIIllIIlllIIIlIlllI.remove(n2);
            }
        } else if (n == 21 && class_0822.llIllllIlIllIIIlIllIIlIlI()) {
            if (!this.llllllIlIllllIlIlIlIIIIlI.isEmpty()) {
                int n3 = this.llllllIlIllllIlIlIlIIIIlI.size() - 1;
                class_0010 class_00103 = (class_0010)this.llllllIlIllllIlIlIlIIIIlI.get(this.llllllIlIllllIlIlIlIIIIlI.size() - 1);
                for (int i = 0; i < class_00103.lllIIIllIIIIlllIlIIllIIll.size(); ++i) {
                    class_1665 class_16653 = (class_1665)class_00103.lllIIIllIIIIlllIlIIllIIll.get(i);
                    float f = ((Float)class_00103.IlIllllllIIlIIllllIIlIIIl.get(i)).floatValue();
                    float f4 = ((Float)class_00103.lIlllIlllIIIIlIIlllIllIII.get(i)).floatValue();
                    class_0767 class_07673 = (class_0767)((Object)class_00103.lllIlIIlIIIlIlIIIllIlllIl.get(i));
                    Float f5 = (Float)class_00103.IlIIIIIllllllIIlllIllllll.get(i);
                    class_16653.lllIIIllIIIIlllIlIIllIIll(class_07673);
                    class_16653.lllIIIllIIIIlllIlIIllIIll(f, f4);
                    class_16653.llIIlIlIlllIIllIlIlllIllI.lllIlIIlIIIlIlIIIllIlllIl(f5);
                }
                if (this.llllllIlIllllIlIlIlIIIIlI.size() > 50) {
                    this.llllllIlIllllIlIlIlIIIIlI.remove(0);
                }
                this.IIllIllIIllIIlllIIIlIlllI.add(class_00103);
                this.llllllIlIllllIlIlIlIIIIlI.remove(n3);
            }
        } else {
            this.llIIlIIllIIllIlIIllIIllII = 0;
            for (class_1376 class_13762 : this.llIIlIlIlllIIllIlIlllIllI) {
                class_1665 class_16654 = class_13762.lllIIIllIIIIlllIlIIllIIll;
                if (class_16654 == null) continue;
                switch (n) {
                    case 203: {
                        class_16654.lllIIIllIIIIlllIlIIllIIll(class_16654.IllIIIllIIIIlIlIlIllIIlll() - 1.0f, class_16654.lIIIIlIlIIlllllIIllIIlIII());
                        break;
                    }
                    case 205: {
                        class_16654.lllIIIllIIIIlllIlIIllIIll(class_16654.IllIIIllIIIIlIlIlIllIIlll() + 1.0f, class_16654.lIIIIlIlIIlllllIIllIIlIII());
                        break;
                    }
                    case 200: {
                        class_16654.lllIIIllIIIIlllIlIIllIIll(class_16654.IllIIIllIIIIlIlIlIllIIlll(), class_16654.lIIIIlIlIIlllllIIllIIlIII() - 1.0f);
                        break;
                    }
                    case 208: {
                        class_16654.lllIIIllIIIIlllIlIIllIIll(class_16654.IllIIIllIIIIlIlIlIllIIlll(), class_16654.lIIIIlIlIIlllllIIllIIlIII() + 1.0f);
                    }
                }
            }
        }
    }

    private void IlIllllllIIlIIllllIIlIIIl(float f) {
        for (class_1376 class_13762 : this.llIIlIlIlllIIllIlIlllIllI) {
            class_13762.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(class_13762.lllIIIllIIIIlllIlIIllIIll.IllIIIllIIIIlIlIlIllIIlll() + f, class_13762.lllIIIllIIIIlllIlIIllIIll.lIIIIlIlIIlllllIIllIIlIII());
        }
    }

    private void lIlllIlllIIIIlIIlllIllIII(float f) {
        for (class_1376 class_13762 : this.llIIlIlIlllIIllIlIlllIllI) {
            class_13762.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(class_13762.lllIIIllIIIIlllIlIIllIIll.IllIIIllIIIIlIlIlIllIIlll(), class_13762.lllIIIllIIIIlllIlIIllIIll.lIIIIlIlIIlllllIIllIIlIII() + f);
        }
    }

    private void lllIIIllIIIIlllIlIIllIIll(class_0321 class_03212, int n, int n2, int n3) {
        for (class_1665 class_16652 : this.IIlIIlIlIlIllIIlIlIIIIlll) {
            boolean bl;
            float[] arrf;
            boolean bl2;
            if (class_16652.IlIlllIIIIIIlIIllIIllIlll() == null || !class_16652.lIllllIIlIIIlIllllllIIIll() || class_16652.IIIllIIlIIIIIIlIlIIllIIlI().contains("Zans") && LunarClient.getInstance().getModuleManager().lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll().lllIlIIlIIIlIlIIIllIlllIl().lIlllIlllIIIIlIIlllIllIII) continue;
            float f = class_16652.llIllllIlIllIIIlIllIIlIlI;
            float f2 = class_16652.lIlllIlllIlIIIIlllIlIlIIl;
            float f3 = 18.0f;
            if (f < f3) {
                class_16652.llIllllIlIllIIIlIllIIlIlI = f3;
            }
            if (f2 < 18.0f) {
                class_16652.lIlllIlllIlIIIIlllIlIlIIl = 18.0f;
            }
            if (!(bl2 = (float)n > (arrf = class_16652.lllIIIllIIIIlllIlIIllIIll(class_03212, true))[0] * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() && (float)n < (arrf[0] + class_16652.llIllllIlIllIIIlIllIIlIlI) * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() && (float)n2 > arrf[1] * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() && (float)n2 < (arrf[1] + class_16652.lIlllIlllIlIIIIlllIlIlIIl) * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue())) continue;
            boolean bl3 = !class_16652.llIIlllIllIllllIIIlIIIIII().isEmpty() && (float)n >= arrf[0] * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() && (float)n <= (arrf[0] + 10.0f) * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() && (float)n2 >= (arrf[1] + class_16652.lIlllIlllIlIIIIlllIlIlIIl - 10.0f) * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() && (float)n2 <= (arrf[1] + class_16652.lIlllIlllIlIIIIlllIlIlIIl + 2.0f) * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue();
            boolean bl4 = bl = (float)n > (arrf[0] + class_16652.llIllllIlIllIIIlIllIIlIlI - 10.0f) * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() && (float)n < (arrf[0] + class_16652.llIllllIlIllIIIlIllIIlIlI + 2.0f) * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() && (float)n2 > (arrf[1] + class_16652.lIlllIlllIlIIIIlllIlIlIIl - 10.0f) * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() && (float)n2 < (arrf[1] + class_16652.lIlllIlllIlIIIIlllIlIlIIl + 2.0f) * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue();
            if (n3 == 0 && !bl3 && !bl && class_16652 != LunarClient.getInstance().getModuleManager().lIlllIlllIIIIlIIlllIllIII) {
                boolean bl5 = true;
                if (this.lllIIIllIIIIlllIlIIllIIll(class_16652) != null) {
                    this.lllIlIIlIIIlIlIIIllIlllIl(class_16652);
                    bl5 = false;
                }
                float f4 = (float)n - class_16652.IllIIIllIIIIlIlIlIllIIlll() * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue();
                float f5 = (float)n2 - class_16652.lIIIIlIlIIlllllIIllIIlIII() * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue();
                this.llllIIIIlIIIlIIIIIIlIllll = n;
                this.llIIIIllIIIIIIIlIIIlIIIIl = n2;
                this.IlIlIIlllIllllllllIIIlIlI = false;
                IIIIlIllIlIIlIIlIllIlIlll = class_16652;
                if (this.lllIIIllIIIIlllIlIIllIIll(class_16652) == null) {
                    if (!class_0822.llIllllIlIllIIIlIllIIlIlI() && bl5) {
                        this.llIIlIlIlllIIllIlIlllIllI.clear();
                    }
                    if (bl5 || !class_0822.llIllllIlIllIIIlIllIIlIlI()) {
                        this.llIIlIlIlllIIllIlIlllIllI.add(new class_1376(class_16652, f4, f5));
                    }
                }
                this.IlIllllllIIlIIllllIIlIIIl(class_03212, n, n2);
            }
            if (!(n3 != 0 || this.IIIllIllIIlIlIlIlIllllIIl != null && this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(n, n2))) {
                if (bl3) {
                    Minecraft.getMinecraft().IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
                    ((class_0914)this.IlIIIIIllllllIIlllIllllll).IlIlllIIIIIIlIIllIIllIlll = false;
                    ((class_0914)this.IlIIIIIllllllIIlllIllllll).IlIlIIlIlIllIIlIlIIllIIIl = class_16652;
                    this.IllIIIllIIIIlIlIlIllIIlll = this.IlIIIIIllllllIIlllIllllll;
                } else if (bl) {
                    Minecraft.getMinecraft().IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
                    class_16652.lllIIIllIIIIlllIlIIllIIll(false);
                }
            } else if (n3 == 1) {
                Minecraft.getMinecraft().IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
                float[] arrf2 = class_1271.lllIIIllIIIIlllIlIIllIIll(class_16652.IlIlllIIIIIIlIIllIIllIlll());
                class_16652.lllIIIllIIIIlllIlIIllIIll(arrf2[0], arrf2[1]);
            }
            if (class_16652 == LunarClient.getInstance().getModuleManager().lIlllIlllIIIIlIIlllIllIII) continue;
            break;
        }
    }

    private void IlIllllllIIlIIllllIIlIIIl(int n, int n2, int n3) {
        for (class_0527 class_05272 : this.IIIIIIIIlIllIIllIIlllIllI) {
            if (n3 != 0 || !class_05272.lllIIIllIIIIlllIlIIllIIll(n, n2) || lIIIIlIlIIlllllIIllIIlIII) continue;
            if (class_05272.IIIllIllIIlIlIlIlIllllIIl != null && this.IIIllIllIIlIlIlIlIllllIIl != class_05272.IIIllIllIIlIlIlIlIllllIIl && this.IllIIIllIIIIlIlIlIllIIlll == null) {
                Minecraft.getMinecraft().IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
                this.IllIIIllIIIIlIlIlIllIIlll = class_05272.IIIllIllIIlIlIlIlIllllIIl;
                continue;
            }
            if (class_05272.IIIllIllIIlIlIlIlIllllIIl == null || this.IllIIIllIIIIlIlIlIllIIlll != null) continue;
            Minecraft.getMinecraft().IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
            lIIIIlIlIIlllllIIllIIlIII = true;
        }
    }

    private class_1665 lllIIIllIIIIlllIlIIllIIll(class_0321 class_03212, int n, int n2) {
        for (class_1665 class_16652 : this.IIlIIlIlIlIllIIlIlIIIIlll) {
            boolean bl;
            if (class_16652.IlIlllIIIIIIlIIllIIllIlll() == null) continue;
            float[] arrf = class_16652.lllIIIllIIIIlllIlIIllIIll(class_03212, true);
            boolean bl2 = !class_16652.llIIlllIllIllllIIIlIIIIII().isEmpty() && (float)n >= arrf[0] * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() && (float)n <= (arrf[0] + 10.0f) * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() && (float)n2 >= (arrf[1] + class_16652.lIlllIlllIlIIIIlllIlIlIIl - 10.0f) * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() && (float)n2 <= (arrf[1] + class_16652.lIlllIlllIlIIIIlllIlIlIIl + 2.0f) * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue();
            boolean bl3 = bl = (float)n > (arrf[0] + class_16652.llIllllIlIllIIIlIllIIlIlI - 10.0f) * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() && (float)n < (arrf[0] + class_16652.llIllllIlIllIIIlIllIIlIlI + 2.0f) * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() && (float)n2 > (arrf[1] + class_16652.lIlllIlllIlIIIIlllIlIlIIl - 10.0f) * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() && (float)n2 < (arrf[1] + class_16652.lIlllIlllIlIIIIlllIlIlIIl + 2.0f) * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue();
            if (!bl && !bl2) continue;
            return class_16652;
        }
        return null;
    }

    private boolean lllIlIIlIIIlIlIIIllIlllIl(class_0321 class_03212, int n, int n2) {
        boolean bl = false;
        for (class_1665 class_16652 : this.IIlIIlIlIlIllIIlIlIIIIlll) {
            if (class_16652.IlIlllIIIIIIlIIllIIllIlll() == null) continue;
            float[] arrf = class_16652.lllIIIllIIIIlllIlIIllIIll(class_03212, true);
            boolean bl2 = (float)n > arrf[0] * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() && (float)n < (arrf[0] + class_16652.llIllllIlIllIIIlIllIIlIlI) * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() && (float)n2 > arrf[1] * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() && (float)n2 < (arrf[1] + class_16652.lIlllIlllIlIIIIlllIlIlIIl) * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue();
            bl = bl || bl2;
        }
        return bl;
    }

    private boolean lllIIIllIIIIlllIlIIllIIll(float f, class_1665 class_16652, class_0321 class_03212, int n, int n2, boolean bl) {
        int n3;
        int n4;
        int n5;
        int n6;
        Object object;
        boolean bl2;
        if (class_16652.IlIlllIIIIIIlIIllIIllIlll() == null || !class_16652.lIllllIIlIIIlIllllllIIIll() || class_16652 == LunarClient.getInstance().getModuleManager().lIlllIlllIIIIlIIlllIllIII || !class_16652.IlIIlllllIIlIlIlllllIllll && !class_16652.lllIIlIIIllllllIIIIlIlIlI()) {
            return true;
        }
        boolean bl3 = false;
        float f2 = 18.0f;
        if (class_16652.llIllllIlIllIIIlIllIIlIlI < f2) {
            class_16652.llIllllIlIllIIIlIllIIlIlI = (int)f2;
        }
        if (class_16652.lIlllIlllIlIIIIlllIlIlIIl < 18.0f) {
            class_16652.lIlllIlllIlIIIIlllIlIlIIl = 18.0f;
        }
        GL11.glPushMatrix();
        float[] arrf = class_16652.lllIIIllIIIIlllIlIIllIIll(class_03212, true);
        class_16652.lllIIIllIIIIlllIlIIllIIll(class_03212);
        boolean bl4 = bl2 = this.lIlIIllllIlIIIIllIIIIlIIl != -1;
        if (bl2) {
            object = new Rectangle((int)(arrf[0] * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() - 2.0f), (int)(arrf[1] * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() - 2.0f), (int)(class_16652.llIllllIlIllIIIlIllIIlIlI * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() + 4.0f), (int)(class_16652.lIlllIlllIlIIIIlllIlIlIIl * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() + 4.0f));
            n6 = Math.min(this.lIlIIllllIlIIIIllIIIIlIIl, n);
            n5 = Math.min(this.llIlllIIllIlllIlIlIlIIIll, n2);
            n4 = Math.max(this.lIlIIllllIlIIIIllIIIIlIIl, n) - n6;
            n3 = Math.max(this.llIlllIIllIlllIlIlIlIIIll, n2) - n5;
            Rectangle rectangle = new Rectangle(n6, n5, n4, n3);
            bl2 = ((Rectangle)object).intersects(rectangle);
        }
        int n7 = n6 = (float)n > (object = class_16652.lllIIIllIIIIlllIlIIllIIll(class_03212, true))[0] * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() && (float)n < (object[0] + class_16652.llIllllIlIllIIIlIllIIlIlI) * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() && (float)n2 > object[1] * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() && (float)n2 < (object[1] + class_16652.lIlllIlllIlIIIIlllIlIlIIl) * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() ? 1 : 0;
        if (!this.IIIIlIIlIIIllIIIIllIIIlII) {
            if (this.lllIIIllIIIIlllIlIIllIIll(class_16652) != null || bl2) {
                class_0210.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, class_16652.llIllllIlIllIIIlIllIIlIlI, class_16652.lIlllIlllIlIIIIlllIlIlIIl, 0.5f, -1627324417, 0x1AFFFFFF);
            } else {
                class_0210.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, class_16652.llIllllIlIllIIIlIllIIlIlI, class_16652.lIlllIlllIlIIIIlllIlIlIIl, 0.5f, 0x6FFFFFFF, 0x1AFFFFFF);
            }
        }
        if (!this.IIIIlIIlIIIllIIIIllIIIlII && n6 != 0) {
            n5 = !class_16652.llIIlllIllIllllIIIlIIIIII().isEmpty() && (float)n >= (object[0] + 2.0f) * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() && (float)n <= (object[0] + 10.0f) * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() && (float)n2 >= (object[1] + class_16652.lIlllIlllIlIIIIlllIlIlIIl - 8.0f) * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() && (float)n2 <= (object[1] + class_16652.lIlllIlllIlIIIIlllIlIlIIl - 2.0f) * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() ? 1 : 0;
            int n8 = n4 = (float)n > (object[0] + class_16652.llIllllIlIllIIIlIllIIlIlI - 10.0f) * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() && (float)n < (object[0] + class_16652.llIllllIlIllIIIlIllIIlIlI - 2.0f) * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() && (float)n2 > (object[1] + class_16652.lIlllIlllIlIIIIlllIlIlIIl - 8.0f) * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() && (float)n2 < (object[1] + class_16652.lIlllIlllIlIIIIlllIlIlIIl - 2.0f) * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() ? 1 : 0;
            if (!class_16652.llIIlllIllIllllIIIlIIIIII().isEmpty()) {
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)(n5 != 0 ? 1.0f : 0.6f));
                class_0857.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIlIIIIlllIlIlIIl, 3.0f, 2.0f, class_16652.lIlllIlllIlIIIIlllIlIlIIl - 7.5f);
            }
            GL11.glColor4f((float)0.8f, (float)0.2f, (float)0.2f, (float)(n4 != 0 ? 1.0f : 0.6f));
            class_0857.lllIIIllIIIIlllIlIIllIIll(this.IlIIlllllIIlIlIlllllIllll, 3.0f, class_16652.llIllllIlIllIIIlIllIIlIlI - 8.0f, class_16652.lIlllIlllIlIIIIlllIlIlIIl - 7.5f);
        }
        GL11.glPushMatrix();
        float f3 = f / ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue();
        GL11.glScalef((float)f3, (float)f3, (float)f3);
        if (bl) {
            n4 = this.lllIIIIIIlIlllIIlIlIIIllI != null && this.lllIIIIIIlIlllIIlIlIIIllI.lllIIIllIIIIlllIlIIllIIll == class_16652 && this.lllIIIIIIlIlllIIlIlIIIllI.IIIllIllIIlIlIlIlIllllIIl == class_1248.lllIlIIlIIIlIlIIIllIlllIl || n6 == 0 && (float)n >= (object[0] + class_16652.llIllllIlIllIIIlIllIIlIlI - 5.0f) * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() && (float)n <= (object[0] + class_16652.llIllllIlIllIIIlIllIIlIlI + 5.0f) * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() && (float)n2 >= (object[1] - 5.0f) * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() && (float)n2 <= (object[1] + 5.0f) * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() ? 1 : 0;
            n3 = this.lllIIIIIIlIlllIIlIlIIIllI != null && this.lllIIIIIIlIlllIIlIlIIIllI.lllIIIllIIIIlllIlIIllIIll == class_16652 && this.lllIIIIIIlIlllIIlIlIIIllI.IIIllIllIIlIlIlIlIllllIIl == class_1248.IlIllllllIIlIIllllIIlIIIl || n6 == 0 && (float)n >= (object[0] - 5.0f) * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() && (float)n <= (object[0] + 5.0f) * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() && (float)n2 >= (object[1] + class_16652.lIlllIlllIlIIIIlllIlIlIIl - 5.0f) * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() && (float)n2 <= (object[1] + class_16652.lIlllIlllIlIIIIlllIlIlIIl + 5.0f) * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() ? 1 : 0;
            boolean bl5 = this.lllIIIIIIlIlllIIlIlIIIllI != null && this.lllIIIIIIlIlllIIlIlIIIllI.lllIIIllIIIIlllIlIIllIIll == class_16652 && this.lllIIIIIIlIlllIIlIlIIIllI.IIIllIllIIlIlIlIlIllllIIl == class_1248.lllIIIllIIIIlllIlIIllIIll || n6 == 0 && (float)n >= (object[0] - 5.0f) * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() && (float)n <= (object[0] + 5.0f) * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() && (float)n2 >= (object[1] - 5.0f) * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() && (float)n2 <= (object[1] + 5.0f) * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue();
            boolean bl6 = this.lllIIIIIIlIlllIIlIlIIIllI != null && this.lllIIIIIIlIlllIIlIlIIIllI.lllIIIllIIIIlllIlIIllIIll == class_16652 && this.lllIIIIIIlIlllIIlIlIIIllI.IIIllIllIIlIlIlIlIllllIIl == class_1248.lIlllIlllIIIIlIIlllIllIII || n6 == 0 && (float)n >= (object[0] + class_16652.llIllllIlIllIIIlIllIIlIlI - 5.0f) * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() && (float)n <= (object[0] + class_16652.llIllllIlIllIIIlIllIIlIlI + 5.0f) * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() && (float)n2 >= (object[1] + class_16652.lIlllIlllIlIIIIlllIlIlIIl - 5.0f) * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() && (float)n2 <= (object[1] + class_16652.lIlllIlllIlIIIIlllIlIlIIl + 5.0f) * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue();
            GL11.glPushMatrix();
            float f4 = 4.0f;
            if (this.lIlIIllllIlIIIIllIIIIlIIl == -1 && bl5) {
                GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f);
                class_0210.lllIIIllIIIIlllIlIIllIIll(-f4 / 2.0f, -f4 / 2.0f, f4 / 2.0f, f4 / 2.0f, -16711936);
            }
            if (this.lIlIIllllIlIIIIllIIIIlIIl == -1 && n4 != 0) {
                GL11.glTranslatef((float)(class_16652.llIllllIlIllIIIlIllIIlIlI / f3), (float)0.0f, (float)0.0f);
                class_0210.lllIIIllIIIIlllIlIIllIIll(-f4 / 2.0f, -f4 / 2.0f, f4 / 2.0f, f4 / 2.0f, -16711936);
            }
            if (this.lIlIIllllIlIIIIllIIIIlIIl == -1 && bl6) {
                GL11.glTranslatef((float)(class_16652.llIllllIlIllIIIlIllIIlIlI / f3), (float)(class_16652.lIlllIlllIlIIIIlllIlIlIIl / f3), (float)0.0f);
                class_0210.lllIIIllIIIIlllIlIIllIIll(-f4 / 2.0f, -f4 / 2.0f, f4 / 2.0f, f4 / 2.0f, -16711936);
            }
            if (this.lIlIIllllIlIIIIllIIIIlIIl == -1 && n3 != 0) {
                GL11.glTranslatef((float)0.0f, (float)(class_16652.lIlllIlllIlIIIIlllIlIlIIl / f3), (float)0.0f);
                class_0210.lllIIIllIIIIlllIlIIllIIll(-f4 / 2.0f, -f4 / 2.0f, f4 / 2.0f, f4 / 2.0f, -16711936);
            }
            GL11.glPopMatrix();
            bl3 = this.lIlIIllllIlIIIIllIIIIlIIl == -1 && (bl5 || n4 != 0 || n3 != 0 || bl6);
        }
        n4 = arrf[1] - (float) LunarClient.getInstance().ubuntuMedium16px.lllIIIllIIIIlllIlIIllIIll() - 6.0f < 0.0f ? 1 : 0;
        float f5 = n4 != 0 ? class_16652.lIlllIlllIlIIIIlllIlIlIIl * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() / f : (float)(-LunarClient.getInstance().ubuntuMedium16px.lllIIIllIIIIlllIlIIllIIll() - 4);
        switch (class_16652.IlIlIIlIlIllIIlIlIIllIIIl()) {
            case lIlllIlllIIIIlIIlllIllIII: {
                float f6 = 0.0f;
                LunarClient.getInstance().ubuntuMedium16px.lllIIIllIIIIlllIlIIllIIll(class_16652.IIIllIIlIIIIIIlIlIIllIIlI(), (double)f6, (double)f5, -1);
                break;
            }
            case IlIllllllIIlIIllllIIlIIIl: {
                float f7 = class_16652.llIllllIlIllIIIlIllIIlIlI * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() / f / 2.0f;
                LunarClient.getInstance().ubuntuMedium16px.IlIllllllIIlIIllllIIlIIIl(class_16652.IIIllIIlIIIIIIlIlIIllIIlI(), f7, f5, -1);
                break;
            }
            case IlIIIIIllllllIIlllIllllll: {
                float f8 = class_16652.llIllllIlIllIIIlIllIIlIlI * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() / f - (float) LunarClient.getInstance().ubuntuMedium16px.lllIlIIlIIIlIlIIIllIlllIl(class_16652.IIIllIIlIIIIIIlIlIIllIIlI());
                LunarClient.getInstance().ubuntuMedium16px.lllIIIllIIIIlllIlIIllIIll(class_16652.IIIllIIlIIIIIIlIlIIllIIlI(), (double)f8, (double)f5, -1);
            }
        }
        GL11.glPopMatrix();
        GL11.glPopMatrix();
        return !bl3;
    }

    private void lllIIIllIIIIlllIlIIllIIll(class_0321 class_03212) {
        if (!Mouse.isButtonDown((int)1) && IIIIlIllIlIIlIIlIllIlIlll != null) {
            List list = this.llIIlIlIlllIIllIlIlllIllI;
            for (class_1376 class_13762 : this.llIIlIlIlllIIllIlIlllIllI) {
                if (class_13762.lllIIIllIIIIlllIlIIllIIll != IIIIlIllIlIIlIIlIllIlIlll || !((Boolean) LunarClient.getInstance().getSettingsManager().llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).booleanValue()) continue;
                Object var5_5 = null;
                for (class_1665 class_16652 : this.IIlIIlIlIlIllIIlIlIIIIlll) {
                    if (this.lllIIIllIIIIlllIlIIllIIll(class_16652) != null || class_16652.IlIlllIIIIIIlIIllIIllIlll() == null || !class_16652.lIllllIIlIIIlIllllllIIIll() || class_16652 == LunarClient.getInstance().getModuleManager().lIlllIlllIIIIlIIlllIllIII || !class_16652.IlIIlllllIIlIlIlllllIllll && !class_16652.lllIIlIIIllllllIIIIlIlIlI() || var5_5 != null && var5_5 != class_16652) continue;
                    float f = 18.0f;
                    if (class_16652.llIllllIlIllIIIlIllIIlIlI < f) {
                        class_16652.llIllllIlIllIIIlIllIIlIlI = (int)f;
                    }
                    if (class_16652.lIlllIlllIlIIIIlllIlIlIIl < 18.0f) {
                        class_16652.lIlllIlllIlIIIIlllIlIlIIl = 18.0f;
                    }
                    if (class_13762.lllIIIllIIIIlllIlIIllIIll.llIllllIlIllIIIlIllIIlIlI < f) {
                        class_13762.lllIIIllIIIIlllIlIIllIIll.llIllllIlIllIIIlIllIIlIlI = (int)f;
                    }
                    if (class_13762.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIlIIIIlllIlIlIIl < 18.0f) {
                        class_13762.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIlIIIIlllIlIlIIl = 18.0f;
                    }
                    float[] arrf = class_16652.lllIIIllIIIIlllIlIIllIIll(class_03212, true);
                    float[] arrf2 = class_13762.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(class_03212, true);
                    boolean bl = false;
                    float f2 = arrf[0] * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() - arrf2[0] * ((Float)class_13762.lllIIIllIIIIlllIlIIllIIll.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue();
                    float f3 = (arrf[0] + class_16652.llIllllIlIllIIIlIllIIlIlI) * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() - (arrf2[0] + class_13762.lllIIIllIIIIlllIlIIllIIll.llIllllIlIllIIIlIllIIlIlI) * ((Float)class_13762.lllIIIllIIIIlllIlIIllIIll.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue();
                    float f4 = (arrf[0] + class_16652.llIllllIlIllIIIlIllIIlIlI) * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() - arrf2[0] * ((Float)class_13762.lllIIIllIIIIlllIlIIllIIll.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue();
                    float f5 = arrf[0] * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() - (arrf2[0] + class_13762.lllIIIllIIIIlllIlIIllIIll.llIllllIlIllIIIlIllIIlIlI) * ((Float)class_13762.lllIIIllIIIIlllIlIIllIIll.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue();
                    float f6 = arrf[1] * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() - arrf2[1] * ((Float)class_13762.lllIIIllIIIIlllIlIIllIIll.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue();
                    float f7 = (arrf[1] + class_16652.lIlllIlllIlIIIIlllIlIlIIl) * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() - (arrf2[1] + class_13762.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIlIIIIlllIlIlIIl) * ((Float)class_13762.lllIIIllIIIIlllIlIIllIIll.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue();
                    float f8 = (arrf[1] + class_16652.lIlllIlllIlIIIIlllIlIlIIl) * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() - arrf2[1] * ((Float)class_13762.lllIIIllIIIIlllIlIIllIIll.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue();
                    float f9 = arrf[1] * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() - (arrf2[1] + class_13762.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIlIIIIlllIlIlIIl) * ((Float)class_13762.lllIIIllIIIIlllIlIIllIIll.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue();
                    int n = 2;
                    if (f2 >= (float)(-n) && f2 <= (float)n) {
                        bl = true;
                        class_0857.lllIIIllIIIIlllIlIIllIIll((double)(arrf[0] * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() - 0.5f), 0.0, (double)(arrf[0] * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue()), (double)this.lIIlIIIIIlIlllIlIIlIlIlll, 0.0, -3596854);
                    }
                    if (f3 >= (float)(-n) && f3 <= (float)n) {
                        bl = true;
                        class_0857.lllIIIllIIIIlllIlIIllIIll((double)((arrf[0] + class_16652.llIllllIlIllIIIlIllIIlIlI) * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue()), 0.0, (double)((arrf[0] + class_16652.llIllllIlIllIIIlIllIIlIlI) * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() + 0.5f), (double)this.lIIlIIIIIlIlllIlIIlIlIlll, 0.0, -3596854);
                    }
                    if (f5 >= (float)(-n) && f5 <= (float)n) {
                        bl = true;
                        class_0857.lllIIIllIIIIlllIlIIllIIll((double)(arrf[0] * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue()), 0.0, (double)(arrf[0] * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() + 0.5f), (double)this.lIIlIIIIIlIlllIlIIlIlIlll, 0.0, -3596854);
                    }
                    if (f4 >= (float)(-n) && f4 <= (float)n) {
                        bl = true;
                        class_0857.lllIIIllIIIIlllIlIIllIIll((double)((arrf[0] + class_16652.llIllllIlIllIIIlIllIIlIlI) * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue()), 0.0, (double)((arrf[0] + class_16652.llIllllIlIllIIIlIllIIlIlI) * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() + 0.5f), (double)this.lIIlIIIIIlIlllIlIIlIlIlll, 0.0, -3596854);
                    }
                    if (f6 >= (float)(-n) && f6 <= (float)n) {
                        bl = true;
                        class_0857.lllIIIllIIIIlllIlIIllIIll(0.0, (double)(arrf[1] * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue()), (double)this.IlIlIIlllIIlIllIIIlllllIl, (double)(arrf[1] * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() + 0.5f), 0.0, -3596854);
                    }
                    if (f7 >= (float)(-n) && f7 <= (float)n) {
                        bl = true;
                        class_0857.lllIIIllIIIIlllIlIIllIIll(0.0, (double)((arrf[1] + class_16652.lIlllIlllIlIIIIlllIlIlIIl) * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue()), (double)this.IlIlIIlllIIlIllIIIlllllIl, (double)((arrf[1] + class_16652.lIlllIlllIlIIIIlllIlIlIIl) * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() + 0.5f), 0.0, -3596854);
                    }
                    if (f9 >= (float)(-n) && f9 <= (float)n) {
                        bl = true;
                        class_0857.lllIIIllIIIIlllIlIIllIIll(0.0, (double)(arrf[1] * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue()), (double)this.IlIlIIlllIIlIllIIIlllllIl, (double)(arrf[1] * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() + 0.5f), 0.0, -3596854);
                    }
                    if (f8 >= (float)(-n) && f8 <= (float)n) {
                        bl = true;
                        class_0857.lllIIIllIIIIlllIlIIllIIll(0.0, (double)((arrf[1] + class_16652.lIlllIlllIlIIIIlllIlIlIIl) * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() - 0.5f), (double)this.IlIlIIlllIIlIllIIIlllllIl, (double)((arrf[1] + class_16652.lIlllIlllIlIIIIlllIlIlIIl) * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue()), 0.0, -3596854);
                    }
                    if (!bl) continue;
                    GL11.glPushMatrix();
                    class_16652.lllIIIllIIIIlllIlIIllIIll(class_03212);
                    class_0210.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, class_16652.llIllllIlIllIIIlIllIIlIlI, class_16652.lIlllIlllIlIIIIlllIlIlIIl, 0.5f, 0, 449387978);
                    GL11.glPopMatrix();
                }
            }
        }
    }

    private float lllIIIllIIIIlllIlIIllIIll(class_1665 class_16652, float f, float[] arrf, int n) {
        float f2 = f;
        float f3 = 2.0f;
        if (f2 + arrf[0] * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() < f3) {
            f2 = -arrf[0] * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() + f3;
        } else if (f2 + arrf[0] * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() + (float)n > (float)this.IlIlIIlllIIlIllIIIlllllIl - f3) {
            f2 = (float)this.IlIlIIlllIIlIllIIIlllllIl - arrf[0] * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() - (float)n - f3;
        }
        return f2;
    }

    private float lllIlIIlIIIlIlIIIllIlllIl(class_1665 class_16652, float f, float[] arrf, int n) {
        float f2 = f;
        float f3 = 2.0f;
        if (f2 + arrf[1] * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() < f3) {
            f2 = -arrf[1] * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() + f3;
        } else if (f2 + arrf[1] * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() + (float)n > (float)this.lIIlIIIIIlIlllIlIIlIlIlll - f3) {
            f2 = (float)this.lIIlIIIIIlIlllIlIIlIlIlll - arrf[1] * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() - (float)n - f3;
        }
        return f2;
    }

    private void lllIIIllIIIIlllIlIIllIIll(class_1376 class_13762, int n, int n2, class_0321 class_03212) {
        if (class_13762.lllIIIllIIIIlllIlIIllIIll.IlIlllIIIIIIlIIllIIllIlll() == null || !class_13762.lllIIIllIIIIlllIlIIllIIll.lIllllIIlIIIlIllllllIIIll() || class_13762.lllIIIllIIIIlllIlIIllIIll == LunarClient.getInstance().getModuleManager().lIlllIlllIIIIlIIlllIllIII || !class_13762.lllIIIllIIIIlllIlIIllIIll.IlIIlllllIIlIlIlllllIllll && !class_13762.lllIIIllIIIIlllIlIIllIIll.lllIIlIIIllllllIIIIlIlIlI()) {
            return;
        }
        float f = (float)n - class_13762.lllIlIIlIIIlIlIIIllIlllIl;
        float f2 = (float)n2 - class_13762.IlIllllllIIlIIllllIIlIIIl;
        if (!(this.IlIlIIlllIllllllllIIIlIlI || class_13762.lllIIIllIIIIlllIlIIllIIll != IIIIlIllIlIIlIIlIllIlIlll || (float)n == this.llllIIIIlIIIlIIIIIIlIllll && (float)n2 == this.llIIIIllIIIIIIIlIIIlIIIIl)) {
            if (this.IIllIllIIllIIlllIIIlIlllI.size() > 50) {
                this.IIllIllIIllIIlllIIIlIlllI.remove(0);
            }
            this.IIllIllIIllIIlllIIIlIlllI.add(new class_0010(this, this.llIIlIlIlllIIllIlIlllIllI));
            LunarClient.getInstance().lllIIlIIIllllllIIIIlIlIlI();
            this.IlIlIIlllIllllllllIIIlIlI = true;
        }
        float[] arrf = class_13762.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(class_03212, false);
        if (!Mouse.isButtonDown((int)1) && this.IlIlIIlllIllllllllIIIlIlI && class_13762.lllIIIllIIIIlllIlIIllIIll == IIIIlIllIlIIlIIlIllIlIlll) {
            float f3 = f;
            float f4 = f2;
            f = this.lllIIIllIIIIlllIlIIllIIll(class_13762.lllIIIllIIIIlllIlIIllIIll, f, arrf, (int)(class_13762.lllIIIllIIIIlllIlIIllIIll.llIllllIlIllIIIlIllIIlIlI * ((Float)class_13762.lllIIIllIIIIlllIlIIllIIll.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue()));
            f2 = this.lllIlIIlIIIlIlIIIllIlllIl(class_13762.lllIIIllIIIIlllIlIIllIIll, f2, arrf, (int)(class_13762.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIlIIIIlllIlIlIIl * ((Float)class_13762.lllIIIllIIIIlllIlIIllIIll.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue()));
            float f5 = f3 - f;
            float f6 = f4 - f2;
            for (class_1376 class_13763 : this.llIIlIlIlllIIllIlIlllIllI) {
                if (class_13763 == class_13762) continue;
                arrf = class_13763.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(class_03212, false);
                float f7 = this.lllIIIllIIIIlllIlIIllIIll(class_13763.lllIIIllIIIIlllIlIIllIIll, class_13763.lllIIIllIIIIlllIlIIllIIll.IllIIIllIIIIlIlIlIllIIlll() - f5, arrf, (int)(class_13763.lllIIIllIIIIlllIlIIllIIll.llIllllIlIllIIIlIllIIlIlI * ((Float)class_13763.lllIIIllIIIIlllIlIIllIIll.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue()));
                float f8 = this.lllIlIIlIIIlIlIIIllIlllIl(class_13763.lllIIIllIIIIlllIlIIllIIll, class_13763.lllIIIllIIIIlllIlIIllIIll.lIIIIlIlIIlllllIIllIIlIII() - f6, arrf, (int)(class_13763.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIlIIIIlllIlIlIIl * ((Float)class_13763.lllIIIllIIIIlllIlIIllIIll.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue()));
                class_13763.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(f7, f8);
            }
        }
        if (this.IlIlIIlllIllllllllIIIlIlI) {
            class_13762.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(f, f2);
        }
    }

    private void lllIIIllIIIIlllIlIIllIIll(int n) {
        if (lIIIIlIlIIlllllIIllIIlIII) {
            if (this.IIIllIllIIlIlIlIlIllllIIl != null) {
                this.lllIIIllIIIIlllIlIIllIIll(this.IIIllIllIIlIlIlIlIllllIIl, true, n);
            }
        } else if (this.IllIIIllIIIIlIlIlIllIIlll != null) {
            if (this.IIIllIllIIlIlIlIlIllllIIl != null) {
                this.lllIIIllIIIIlllIlIIllIIll(this.IIIllIllIIlIlIlIlIllllIIl, true, n);
            }
            this.lllIIIllIIIIlllIlIIllIIll(this.IllIIIllIIIIlIlIlIllIIlll, false, n);
        }
    }

    private void lllIIIllIIIIlllIlIIllIIll(class_1194 class_11942, boolean bl, int n) {
        if (bl) {
            class_11942.lIlllIlllIIIIlIIlllIllIII = class_11942.lIIIIlIlIIlllllIIllIIlIII;
            lIIIIlIlIIlllllIIllIIlIII = false;
            this.IIIllIllIIlIlIlIlIllllIIl = null;
        } else {
            class_11942.lIlllIlllIIIIlIIlllIllIII = n / 2 - 185;
            this.IllIIIllIIIIlIlIlIllIIlll = null;
            this.IIIllIllIIlIlIlIlIllllIIl = class_11942;
        }
    }

    public static float lllIIIllIIIIlllIlIIllIIll(float f) {
        float f2 = f / (float)(Minecraft.IlIIlllllIIlIlIlllllIllll + 1);
        return f2 < 1.0f ? 1.0f : f2;
    }

    private class_1376 lllIIIllIIIIlllIlIIllIIll(class_1665 class_16652) {
        for (class_1376 class_13762 : this.llIIlIlIlllIIllIlIlllIllI) {
            if (class_16652 != class_13762.lllIIIllIIIIlllIlIIllIIll) continue;
            return class_13762;
        }
        return null;
    }

    private void IlIllllllIIlIIllllIIlIIIl(class_0321 class_03212, int n, int n2) {
        for (class_1376 class_13762 : this.llIIlIlIlllIIllIlIlllIllI) {
            if (class_13762.lllIIIllIIIIlllIlIIllIIll == null || class_13762.lllIIIllIIIIlllIlIIllIIll.IlIlllIIIIIIlIIllIIllIlll() == null) continue;
            class_13762.lllIlIIlIIIlIlIIIllIlllIl = (float)n - class_13762.lllIIIllIIIIlllIlIIllIIll.IllIIIllIIIIlIlIlIllIIlll();
            class_13762.IlIllllllIIlIIllllIIlIIIl = (float)n2 - class_13762.lllIIIllIIIIlllIlIIllIIll.lIIIIlIlIIlllllIIllIIlIII();
        }
    }

    private void lllIlIIlIIIlIlIIIllIlllIl(class_1665 class_16652) {
        this.llIIlIlIlllIIllIlIlllIllI.removeIf(class_13762 -> class_13762.lllIIIllIIIIlllIlIIllIIll == class_16652);
    }

    static {
        lIIIIlIlIIlllllIIllIIlIII = false;
    }
}

