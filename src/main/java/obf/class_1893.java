package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.exceptions.AuthenticationException
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.util.glu.Project
 */
import com.mojang.authlib.exceptions.AuthenticationException;
import java.awt.Color;

import net.minecraft.util.ResourceLocation;
import com.moonsworth.lunar.client.LunarClient;
import net.minecraft.util.MathHelper;
import net.minecraft.client.renderer.OpenGlHelper;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.Project;

public class class_1893
extends class_0935 {
    private static final ResourceLocation[] lIllllIIlIIIlIllllllIIIll = new ResourceLocation[]{new ResourceLocation("client/panorama/0.png"), new ResourceLocation("client/panorama/1.png"), new ResourceLocation("client/panorama/2.png"), new ResourceLocation("client/panorama/3.png"), new ResourceLocation("client/panorama/4.png"), new ResourceLocation("client/panorama/5.png")};
    private class_2202 IIIllIIlIIIIIIlIlIIllIIlI;
    private ResourceLocation IllIIlllllllIIlIIlIIIIlIl;
    private final class_0980 IIIllIllIIlIlIlIlIllllIIl;
    private final class_0980 IllIIIllIIIIlIlIlIllIIlll;
    private final class_0980 lIIIIlIlIIlllllIIllIIlIII;
    private final class_0869 lIlllIlllIlIIIIlllIlIlIIl;
    boolean lllIIIllIIIIlllIlIIllIIll;
    String lllIlIIlIIIlIlIIIllIlllIl;
    private final class_0869 IlIIlllllIIlIlIlllllIllll;
    private final class_0847 llIIlIlIlllIIllIlIlllIllI;
    private final boolean IllIIIIllIIllIllIlllIlIIl;
    private String IIIIIIIIlIllIIllIIlllIllI;
    private int IIlIIlIlIlIllIIlIlIIIIlll;
    private long llIIIlllIlllIlIllIIIIllIl;

    public class_1893(boolean bl, String string, boolean bl2) {
        this.IllIIIIllIIllIllIlllIlIIl = bl;
        this.lIIIIlIlIIlllllIIllIIlIII = new class_0980(2.0f, new ResourceLocation("client/icons/delete-64.png"));
        this.IllIIIllIIIIlIlIlIllIIlll = new class_0980("TITLE");
        this.IIIllIllIIlIlIlIlIllllIIl = new class_0980("CONFIRM");
        this.llIIlIlIlllIIllIlIlllIllI = new class_0847(400L);
        this.lIlllIlllIlIIIIlllIlIlIIl = new class_0869(LunarClient.getInstance().ubuntuMedium16px, "login", -2147483633, 436207631);
        this.IlIIlllllIIlIlIlllllIllll = new class_0869(LunarClient.getInstance().ubuntuMedium16px, "password", -2147483633, 436207631, true);
        this.IIIllIllIIlIlIlIlIllllIIl.IIIllIIlIIIIIIlIlIIllIIlI = () -> this.lIlllIlllIlIIIIlllIlIlIIl.IIIllIllIIlIlIlIlIllllIIl().isEmpty() || this.IlIIlllllIIlIlIlllllIllll.IIIllIllIIlIlIlIlIllllIIl().isEmpty();
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(float f, float f2, int n) {
        this.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(f, f2, n, true);
        if (!((Boolean)this.IIIllIllIIlIlIlIlIllllIIl.IIIllIIlIIIIIIlIlIIllIIlI.get()).booleanValue()) {
            this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(f, f2, n, true);
        }
        this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(f, f2, n, true);
        if (!this.lllIIIllIIIIlllIlIIllIIll) {
            this.lIlllIlllIlIIIIlllIlIlIIl.lllIIIllIIIIlllIlIIllIIll(f, f2, n, true);
        }
        this.IlIIlllllIIlIlIlllllIllll.lllIIIllIIIIlllIlIIllIIll(f, f2, n, true);
        if (this.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(f, f2)) {
            this.lllllIlllIIllIlIIlIIIllII.IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
            this.lllllIlllIIllIlIIlIIIllII.llIIllIllIlIIlIIllIllllll();
        } else if (!((Boolean)this.IIIllIllIIlIlIlIlIllllIIl.IIIllIIlIIIIIIlIlIIllIIlI.get()).booleanValue() && this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(f, f2)) {
            this.llIIllIllIlIIlIIllIllllll();
        } else if (this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(f, f2) && LunarClient.getInstance().IlIIlllllIIlIlIlllllIllll().lllIlIIlIIIlIlIIIllIlllIl()) {
            this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll((class_0229)null);
        }
    }

    private void llIIllIllIlIIlIIllIllllll() {
        String string = this.lIlllIlllIlIIIIlllIlIlIIl.IIIllIllIIlIlIlIlIllllIIl();
        String string2 = this.IlIIlllllIIlIlIlllllIllll.IIIllIllIIlIlIlIlIllllIIl();
        boolean bl = false;
        try {
            bl = LunarClient.getInstance().IlIIlllllIIlIlIlllllIllll().lllIIIllIIIIlllIlIIllIIll(string, string2);
        }
        catch (AuthenticationException authenticationException) {
            this.lllIIIllIIIIlllIlIIllIIll(authenticationException.getMessage(), 5000L);
        }
        if (bl) {
            if (class_0909.lllIlIIlIIIlIlIIIllIlllIl == 0) {
                ++class_0909.lllIlIIlIIIlIlIIIllIlllIl;
            }
            this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll((class_0229)null);
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(String string, long l) {
        this.IIIIIIIIlIllIIllIIlllIllI = string;
        this.llIIIlllIlllIlIllIIIIllIl = System.currentTimeMillis() + l;
        this.IIlIIlIlIlIllIIlIlIIIIlll = new Color(1.0f, 0.15f, 0.15f, 0.75f).getRGB();
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
        GL11.glDisable((int)3008);
        this.lllIlIIlIIIlIlIIIllIlllIl(n, n2, 1.0f);
        GL11.glEnable((int)3008);
        super.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
        super.IlIllllllIIlIIllllIIlIIIl();
        if (this.IllIIIIllIIllIllIlllIlIIl && !this.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()) {
            this.llIIlIlIlllIIllIlIlllIllI.lllIlIIlIIIlIlIIIllIlllIl();
        }
        this.lIlllIlllIlIIIIlllIlIlIIl.lllIIIllIIIIlllIlIIllIIll();
        this.IlIIlllllIIlIlIlllllIllll.lllIIIllIIIIlllIlIIllIIll();
        ++class_1546.lllIIIllIIIIlllIlIIllIIll;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(float f, float f2) {
        if (this.IllIIIIllIIllIllIlllIlIIl) {
            class_0210.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, this.lIllllIIlIIIlIllllllIIIll(), this.IIIllIIlIIIIIIlIlIIllIIlI(), new Color(0.3f, 0.3f, 0.3f, 1.0f - 1.0f * this.llIIlIlIlllIIllIlIlllIllI.IllIIlllllllIIlIIlIIIIlIl()).getRGB());
        }
        float f3 = this.lIllllIIlIIIlIllllllIIIll() * 0.8f;
        float f4 = this.IIIllIIlIIIIIIlIlIIllIIlI() * 0.75f;
        class_0210.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll() / 2.0f - f3 / 2.0f, this.IIIllIIlIIIIIIlIlIIllIIlI() / 2.0f - f4 / 2.0f, this.lIllllIIlIIIlIllllllIIIll() / 2.0f + f3 / 2.0f, this.IIIllIIlIIIIIIlIlIIllIIlI() / 2.0f + f4 / 2.0f, 0x2F000000);
        class_0210.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll() / 2.0f - f3 / 2.0f, this.IIIllIIlIIIIIIlIlIIllIIlI() / 2.0f - f4 / 4.0f, this.lIllllIIlIIIlIllllllIIIll() / 2.0f + f3 / 2.0f, this.IIIllIIlIIIIIIlIlIIllIIlI() / 2.0f - f4 / 4.0f + 2.0f, 0x1AFFFFFF);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        this.lIIIIlIlIIlllllIIllIIlIII.lllIlIIlIIIlIlIIIllIlllIl(f, f2, true);
        if (LunarClient.getInstance().IlIIlllllIIlIlIlllllIllll().lllIlIIlIIIlIlIIIllIlllIl()) {
            this.IllIIIllIIIIlIlIlIllIIlll.lllIlIIlIIIlIlIIIllIlllIl(f, f2, true);
        }
        this.IIIllIllIIlIlIlIlIllllIIl.lllIlIIlIIIlIlIIIllIlllIl(f, f2, !this.lIlllIlllIlIIIIlllIlIlIIl.IIIllIllIIlIlIlIlIllllIIl().isEmpty() && !this.IlIIlllllIIlIlIlllllIllll.IIIllIllIIlIlIlIlIllllIIl().isEmpty());
        if (this.IIIIIIIIlIllIIllIIlllIllI != null && this.llIIIlllIlllIlIllIIIIllIl > System.currentTimeMillis()) {
            LunarClient.getInstance().robotoLight16px.lllIlIIlIIIlIlIIIllIlllIl(this.IIIIIIIIlIllIIllIIlllIllI, this.lIllllIIlIIIlIllllllIIIll() / 2.0f, this.IIIllIllIIlIlIlIlIllllIIl.IlIIIIIllllllIIlllIllllll() + 30.0f, this.IIlIIlIlIlIllIIlIlIIIIlll);
            LunarClient.getInstance().robotoLight16px.lllIlIIlIIIlIlIIIllIlllIl(this.IIIIIIIIlIllIIllIIlllIllI, this.lIllllIIlIIIlIllllllIIIll() / 2.0f + 1.0f, this.IIIllIllIIlIlIlIlIllllIIl.IlIIIIIllllllIIlllIllllll() + 31.0f, Integer.MIN_VALUE);
        }
        this.lIlllIlllIlIIIIlllIlIlIIl.lllIlIIlIIIlIlIIIllIlllIl(f, f2, !this.lllIIIllIIIIlllIlIIllIIll);
        this.IlIIlllllIIlIlIlllllIllll.lllIlIIlIIIlIlIIIllIlllIl(f, f2, true);
        float f5 = this.lIllllIIlIIIlIllllllIIIll() / 2.0f - 80.0f;
        float f6 = this.IIIllIIlIIIIIIlIlIIllIIlI() - 40.0f;
        class_0857.lllIIIllIIIIlllIlIIllIIll((double)f5, (double)f6, (double)(f5 + 160.0f), (double)(f6 + 10.0f), 8.0, new Color(218, 66, 83, 0).getRGB());
        this.lllIIIllIIIIlllIlIIllIIll(f4);
    }

    private void lllIIIllIIIIlllIlIIllIIll(float f) {
        float f2 = 16.0f;
        float f3 = this.lIllllIIlIIIlIllllllIIIll() / 2.0f - f2;
        float f4 = this.IIIllIIlIIIIIIlIlIIllIIlI() / 2.0f - f / 2.0f;
        float f5 = this.IIIllIIlIIIIIIlIlIIllIIlI() / 2.0f - f / 4.0f;
        float f6 = f5 - f4;
        float f7 = f5 - f6 / 2.0f - f2 / 2.0f;
        LunarClient.getInstance().robotoRegular24px.lllIlIIlIIIlIlIIIllIlllIl("Log in", f3 + f2, f7 - f6 / 5.0f, -1);
    }

    @Override
    public void n_() {
        super.n_();
        Keyboard.enableRepeatEvents((boolean)true);
        this.IIIllIIlIIIIIIlIlIIllIIlI = new class_2202(256, 256);
        this.IllIIlllllllIIlIIlIIIIlIl = this.lllllIlllIIllIlIIlIIIllII.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll("background", this.IIIllIIlIIIIIIlIlIIllIIlI);
        this.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll() - 30.0f, 11.0f, 23.0f, 15.0f);
        this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll() - 60.0f, 11.0f, 28.0f, 15.0f);
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll() / 2.0f - 27.0f, this.IIIllIIlIIIIIIlIlIIllIIlI() / 2.0f + 25.0f, 55.0f, 16.0f);
        this.lIlllIlllIlIIIIlllIlIlIIl.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll() / 2.0f - 64.0f, this.IIIllIIlIIIIIIlIlIIllIIlI() / 2.0f - 20.0f, 128.0f, 16.0f);
        this.IlIIlllllIIlIlIlllllIllll.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll() / 2.0f - 64.0f, this.IIIllIIlIIIIIIlIlIIllIIlI() / 2.0f, 128.0f, 16.0f);
        if (this.lllIlIIlIIIlIlIIIllIlllIl != null) {
            if (this.lllIlIIlIIIlIlIIIllIlllIl.equals("current")) {
                String string = LunarClient.getInstance().IlIIlllllIIlIlIlllllIllll().IIIllIIlIIIIIIlIlIIllIIlI();
                if (string != null) {
                    this.lIlllIlllIlIIIIlllIlIlIIl.lllIIIllIIIIlllIlIIllIIll(string);
                } else {
                    this.lIlllIlllIlIIIIlllIlIlIIl.lllIIIllIIIIlllIlIIllIIll("");
                    this.lllIIIllIIIIlllIlIIllIIll = false;
                }
            } else {
                this.lIlllIlllIlIIIIlllIlIlIIl.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl);
            }
        }
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(char c, int n) {
        if (LunarClient.getInstance().IlIIlllllIIlIlIlllllIllll().lllIlIIlIIIlIlIIIllIlllIl()) {
            super.lllIIIllIIIIlllIlIIllIIll(c, n);
        }
        if (n == 28) {
            if (((Boolean)this.IIIllIllIIlIlIlIlIllllIIl.IIIllIIlIIIIIIlIlIIllIIlI.get()).booleanValue()) {
                return;
            }
            this.llIIllIllIlIIlIIllIllllll();
        } else if (n == 15) {
            if (this.lIlllIlllIlIIIIlllIlIlIIl.lllllIlllIIllIlIIlIIIllII()) {
                this.lIlllIlllIlIIIIlllIlIlIIl.lllIlIIlIIIlIlIIIllIlllIl(false);
                this.IlIIlllllIIlIlIlllllIllll.lllIlIIlIIIlIlIIIllIlllIl(true);
            } else if (this.IlIIlllllIIlIlIlllllIllll.lllllIlllIIllIlIIlIIIllII()) {
                this.IlIIlllllIIlIlIlllllIllll.lllIlIIlIIIlIlIIIllIlllIl(false);
                this.lIlllIlllIlIIIIlllIlIlIIl.lllIlIIlIIIlIlIIIllIlllIl(true);
            }
        } else {
            if (!this.lllIIIllIIIIlllIlIIllIIll) {
                this.lIlllIlllIlIIIIlllIlIlIIl.lllIIIllIIIIlllIlIIllIIll(c, n);
            }
            this.IlIIlllllIIlIlIlllllIllll.lllIIIllIIIIlllIlIIllIIll(c, n);
        }
    }

    private void lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, float f) {
        this.lllllIlllIIllIlIIlIIIllII.lllIlIIlIIIlIlIIIllIlllIl().IlIIIIIllllllIIlllIllllll();
        GL11.glViewport((int)0, (int)0, (int)256, (int)256);
        this.IlIllllllIIlIIllllIIlIIIl(n, n2, f);
        this.lllIlIIlIIIlIlIIIllIlllIl(f);
        this.lllIlIIlIIIlIlIIIllIlllIl(f);
        this.lllIlIIlIIIlIlIIIllIlllIl(f);
        this.lllIlIIlIIIlIlIIIllIlllIl(f);
        this.lllIlIIlIIIlIlIIIllIlllIl(f);
        this.lllIlIIlIIIlIlIIIllIlllIl(f);
        this.lllIlIIlIIIlIlIIIllIlllIl(f);
        this.lllllIlllIIllIlIIlIIIllII.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(true);
        GL11.glViewport((int)0, (int)0, (int)this.lllllIlllIIllIlIIlIIIllII.displayWidth, (int)this.lllllIlllIIllIlIIlIIIllII.displayHeight);
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        class_08682.lllIlIIlIIIlIlIIIllIlllIl();
        float f2 = this.IlIlIIlllIIlIllIIIlllllIl > this.lIIlIIIIIlIlllIlIIlIlIlll ? 120.0f / (float)this.IlIlIIlllIIlIllIIIlllllIl : 120.0f / (float)this.lIIlIIIIIlIlllIlIIlIlIlll;
        float f3 = (float)this.lIIlIIIIIlIlllIlIIlIlIlll * f2 / 256.0f;
        float f4 = (float)this.IlIlIIlllIIlIllIIIlllllIl * f2 / 256.0f;
        class_08682.lllIIIllIIIIlllIlIIllIIll(1.0f, 1.0f, 1.0f, 1.0f);
        float f5 = this.IlIlIIlllIIlIllIIIlllllIl;
        float f6 = this.lIIlIIIIIlIlllIlIIlIlIlll;
        class_08682.lllIIIllIIIIlllIlIIllIIll(0.0, f6, IlIlllIIIIIIlIIllIIllIlll, 0.5f - f3, 0.5f + f4);
        class_08682.lllIIIllIIIIlllIlIIllIIll(f5, f6, IlIlllIIIIIIlIIllIIllIlll, 0.5f - f3, 0.5f - f4);
        class_08682.lllIIIllIIIIlllIlIIllIIll(f5, 0.0, IlIlllIIIIIIlIIllIIllIlll, 0.5f + f3, 0.5f - f4);
        class_08682.lllIIIllIIIIlllIlIIllIIll(0.0, 0.0, IlIlllIIIIIIlIIllIIllIlll, 0.5f + f3, 0.5f + f4);
        class_08682.lllIIIllIIIIlllIlIIllIIll();
    }

    private void lllIlIIlIIIlIlIIIllIlllIl(float f) {
        this.lllllIlllIIllIlIIlIIIllII.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(this.IllIIlllllllIIlIIlIIIIlIl);
        GL11.glTexParameteri((int)3553, (int)10241, (int)9729);
        GL11.glTexParameteri((int)3553, (int)10240, (int)9729);
        GL11.glCopyTexSubImage2D((int)3553, (int)0, (int)0, (int)0, (int)0, (int)0, (int)256, (int)256);
        GL11.glEnable((int)3042);
        OpenGlHelper.glBlendFunc(770, 771, 1, 0);
        GL11.glColorMask((boolean)true, (boolean)true, (boolean)true, (boolean)false);
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        class_08682.lllIlIIlIIIlIlIIIllIlllIl();
        GL11.glDisable((int)3008);
        int n = 3;
        for (int i = 0; i < n; ++i) {
            class_08682.lllIIIllIIIIlllIlIIllIIll(1.0f, 1.0f, 1.0f, 1.0f / (float)(i + 1));
            float f2 = this.IlIlIIlllIIlIllIIIlllllIl;
            float f3 = this.lIIlIIIIIlIlllIlIIlIlIlll;
            float f4 = (float)(i - n / 2) / 256.0f;
            class_08682.lllIIIllIIIIlllIlIIllIIll(f2, f3, IlIlllIIIIIIlIIllIIllIlll, 0.0f + f4, 1.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll(f2, 0.0, IlIlllIIIIIIlIIllIIllIlll, 1.0f + f4, 1.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll(0.0, 0.0, IlIlllIIIIIIlIIllIIllIlll, 1.0f + f4, 0.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll(0.0, f3, IlIlllIIIIIIlIIllIIllIlll, 0.0f + f4, 0.0);
        }
        class_08682.lllIIIllIIIIlllIlIIllIIll();
        GL11.glEnable((int)3008);
        GL11.glColorMask((boolean)true, (boolean)true, (boolean)true, (boolean)true);
    }

    private void IlIllllllIIlIIllllIIlIIIl(int n, int n2, float f) {
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        GL11.glMatrixMode((int)5889);
        GL11.glPushMatrix();
        GL11.glLoadIdentity();
        Project.gluPerspective((float)120.0f, (float)1.0f, (float)0.05f, (float)10.0f);
        GL11.glMatrixMode((int)5888);
        GL11.glPushMatrix();
        GL11.glLoadIdentity();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glRotatef((float)180.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3008);
        GL11.glDisable((int)2884);
        GL11.glDepthMask((boolean)false);
        OpenGlHelper.glBlendFunc(770, 771, 1, 0);
        int n3 = 8;
        for (int i = 0; i < n3 * n3; ++i) {
            GL11.glPushMatrix();
            float f2 = ((float)(i % n3) / (float)n3 - 0.5f) / 64.0f;
            float f3 = ((float)(i / n3) / (float)n3 - 0.5f) / 64.0f;
            float f4 = 0.0f;
            GL11.glTranslatef((float)f2, (float)f3, (float)f4);
            GL11.glRotatef((float)(MathHelper.lllIIIllIIIIlllIlIIllIIll(((float)class_1546.lllIIIllIIIIlllIlIIllIIll + f) / 400.0f) * 25.0f + 20.0f), (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)(-((float)class_1546.lllIIIllIIIIlllIlIIllIIll + f) * 0.1f), (float)0.0f, (float)1.0f, (float)0.0f);
            for (int j = 0; j < 6; ++j) {
                GL11.glPushMatrix();
                if (j == 1) {
                    GL11.glRotatef((float)90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                }
                if (j == 2) {
                    GL11.glRotatef((float)180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                }
                if (j == 3) {
                    GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                }
                if (j == 4) {
                    GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                }
                if (j == 5) {
                    GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                }
                this.lllllIlllIIllIlIIlIIIllII.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(lIllllIIlIIIlIllllllIIIll[j]);
                class_08682.lllIlIIlIIIlIlIIIllIlllIl();
                class_08682.lllIIIllIIIIlllIlIIllIIll(0xFFFFFF, 255 / (i + 1));
                float f5 = 0.0f;
                class_08682.lllIIIllIIIIlllIlIIllIIll(-1.0, -1.0, 1.0, 0.0f + f5, 0.0f + f5);
                class_08682.lllIIIllIIIIlllIlIIllIIll(1.0, -1.0, 1.0, 1.0f - f5, 0.0f + f5);
                class_08682.lllIIIllIIIIlllIlIIllIIll(1.0, 1.0, 1.0, 1.0f - f5, 1.0f - f5);
                class_08682.lllIIIllIIIIlllIlIIllIIll(-1.0, 1.0, 1.0, 0.0f + f5, 1.0f - f5);
                class_08682.lllIIIllIIIIlllIlIIllIIll();
                GL11.glPopMatrix();
            }
            GL11.glPopMatrix();
            GL11.glColorMask((boolean)true, (boolean)true, (boolean)true, (boolean)false);
        }
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(0.0, 0.0, 0.0);
        GL11.glColorMask((boolean)true, (boolean)true, (boolean)true, (boolean)true);
        GL11.glMatrixMode((int)5889);
        GL11.glPopMatrix();
        GL11.glMatrixMode((int)5888);
        GL11.glPopMatrix();
        GL11.glDepthMask((boolean)true);
        GL11.glEnable((int)2884);
        GL11.glEnable((int)2929);
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(float f, float f2, int n) {
        this.lIlllIlllIlIIIIlllIlIlIIl.lllIlIIlIIIlIlIIIllIlllIl(f, f2, n, true);
        this.IlIIlllllIIlIlIlllllIllll.lllIlIIlIIIlIlIIIllIlllIl(f, f2, n, true);
    }
}

