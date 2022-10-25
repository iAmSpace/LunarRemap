package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.opengl.GL11
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import net.minecraft.util.ResourceLocation;
import com.moonsworth.lunar.client.LunarClient;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public class class_0713
extends class_0935 {
    private static class_0713 lllIIIllIIIIlllIlIIllIIll;
    private final class_1185 lllIlIIlIIIlIlIIIllIlllIl;
    private final class_0679 lIllllIIlIIIlIllllllIIIll;
    private final int IIIllIIlIIIIIIlIlIIllIIlI = 140;
    private final int IllIIlllllllIIlIIlIIIIlIl = 28;
    private final class_0806 IIIllIllIIlIlIlIlIllllIIl;
    private final class_0806 IllIIIllIIIIlIlIlIllIIlll;
    private class_2043 lIIIIlIlIIlllllIIllIIlIII;
    private class_1676 lIlllIlllIlIIIIlllIlIlIIl;
    private long IlIIlllllIIlIlIlllllIllll;
    private Queue llIIlIlIlllIIllIlIlllIllI = new LinkedList();
    private List IllIIIIllIIllIllIlllIlIIl = new ArrayList();
    private class_0229 IIIIIIIIlIllIIllIIlllIllI;
    private long IIlIIlIlIlIllIIlIlIIIIlll;

    public class_0713() {
        ArrayList arrayList = new ArrayList();
        LunarClient.getInstance().llIllllIlIllIIIlIllIIlIlI().lllIIIllIIIIlllIlIIllIIll().forEach((string, class_01152) -> arrayList.add(new class_1873((class_0115)class_01152)));
        class_0759[] arrclass_0759 = new class_0759[4];
        this.lllIlIIlIIIlIlIIIllIlllIl = new class_1185(arrayList);
        arrclass_0759[0] = this.lllIlIIlIIIlIlIIIllIlllIl;
        this.lIllllIIlIIIlIllllllIIIll = new class_0679(new ArrayList());
        arrclass_0759[1] = this.lIllllIIlIIIlIllllllIIIll;
        this.IllIIIllIIIIlIlIlIllIIlll = new class_0806("REQUESTS");
        arrclass_0759[2] = this.IllIIIllIIIIlIlIlIllIIlll;
        this.IIIllIllIIlIlIlIlIllllIIl = new class_0806("FRIENDS");
        arrclass_0759[3] = this.IIIllIllIIlIlIlIlIllllIIl;
        this.lllIIIllIIIIlllIlIIllIIll(arrclass_0759);
        this.lIlllIlllIIIIlIIlllIllIII(this.lllIlIIlIIIlIlIIIllIlllIl, this.lIllllIIlIIIlIllllllIIIll, this.IllIIIllIIIIlIlIlIllIIlll, this.IIIllIllIIlIlIlIlIllllIIl);
        this.lIIIIlIlIIlllllIIllIIlIII = this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0115 class_01152) {
        try {
            class_1676 class_16762 = null;
            for (class_0759 class_07592 : this.IlIllllllIIlIIllllIIlIIIl) {
                if (!(class_07592 instanceof class_1676)) continue;
                class_16762 = (class_1676)class_07592;
            }
            if (class_16762 == null) {
                this.lIlllIlllIlIIIIlllIlIlIIl = new class_1676(class_01152);
                this.IlIllllllIIlIIllllIIlIIIl.add(this.lIlllIlllIlIIIIlllIlIlIIl);
                this.lIlllIlllIlIIIIlllIlIlIIl.lllIIIllIIIIlllIlIIllIIll(170.0f, 30.0f, 245.0f, 150.0f);
            } else {
                this.IlIllllllIIlIIllllIIlIIIl.add(this.IlIllllllIIlIIllllIIlIIIl.remove(this.IlIllllllIIlIIllllIIlIIIl.indexOf(class_16762)));
                class_16762.lllIIIllIIIIlllIlIIllIIll(class_01152);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public void n_() {
        Keyboard.enableRepeatEvents((boolean)true);
        this.IlIIlllllIIlIlIlllllIllll = System.currentTimeMillis();
        if (this.lllllIlllIIllIlIIlIIIllII.llIlllIIllIlllIlIlIlIIIll != this) {
            this.lIlIlIIlIIIIlIIIIIlllIIII();
        }
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(0.0f, 28.0f, 69.5f, 20.0f);
        this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(70.5f, 28.0f, 69.5f, 20.0f);
        float f = 28.0f + this.IIIllIllIIlIlIlIlIllllIIl.IIIllIIlIIIIIIlIlIIllIIlI() + 1.0f;
        this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(0.0f, f, 140.0f, this.IIIllIIlIIIIIIlIlIIllIIlI() - f);
        this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(0.0f, f, 140.0f, this.IIIllIIlIIIIIIlIlIIllIIlI() - f);
        float f2 = 190.0f;
    }

    @Override
    public void a_() {
        super.a_();
        this.IllIIIllIIIIlIlIlIllIIlll();
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(float f, float f2) {
        boolean bl;
        GL11.glClear((int)256);
        this.lllIlIIlIIIlIlIIIllIlllIl(this.lIllllIIlIIIlIllllllIIIll(), this.IIIllIIlIIIIIIlIlIIllIIlI());
        class_0713.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 140.0f, this.IIIllIIlIIIIIIlIlIIllIIlI(), -14671840);
        class_0713.lllIIIllIIIIlllIlIIllIIll(140.0f, 0.0f, 141.0f, this.IIIllIIlIIIIIIlIlIIllIIlI(), -15395563);
        class_0713.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 140.0f, 28.0f, -15395563);
        class_0713.lllIIIllIIIIlllIlIIllIIll(6.0f, 6.0f, 22.0f, 22.0f, class_0115.lllIIIllIIIIlllIlIIllIIll(LunarClient.getInstance().getStatus()));
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        ResourceLocation class_17732 = LunarClient.getInstance().lllIIIllIIIIlllIlIIllIIll(this.lllllIlllIIllIlIIlIIIllII.getSession().getUsername(), this.lllllIlllIIllIlIIlIIIllII.getSession().getPlayerID());
        class_0857.lllIIIllIIIIlllIlIIllIIll(class_17732, 7.0f, 7.0f, 7.0f);
        LunarClient.getInstance().robotoLight16px.lllIIIllIIIIlllIlIIllIIll(this.lllllIlllIIllIlIIlIIIllII.getSession().getUsername(), 28.0f, 6.0f, -1);
        LunarClient.getInstance().robotoBold12px.lllIIIllIIIIlllIlIIllIIll(LunarClient.getInstance().getStatusAsString(), 28.0f, 15.0f, -5460820);
        boolean bl2 = bl = f > 6.0f && f < 134.0f && f2 > 6.0f && f2 < 22.0f;
        if (this.lllIIIllIIIIlllIlIIllIIll((class_0759)this.IIIllIllIIlIlIlIlIllllIIl, f, f2, new class_0759[0]) && bl && LunarClient.getInstance().getWebsocket().isOpen()) {
            class_0713.lllIIIllIIIIlllIlIIllIIll(22.0f, 0.0f, 140.0f, 28.0f, -15395563);
            class_0713.lllIIIllIIIIlllIlIIllIIll(24.0f, 6.0f, 40.0f, 22.0f, class_0115.lllIIIllIIIIlllIlIIllIIll(class_0135.lllIIIllIIIIlllIlIIllIIll));
            class_0713.lllIIIllIIIIlllIlIIllIIll(42.0f, 6.0f, 58.0f, 22.0f, class_0115.lllIIIllIIIIlllIlIIllIIll(class_0135.lllIlIIlIIIlIlIIIllIlllIl));
            class_0713.lllIIIllIIIIlllIlIIllIIll(60.0f, 6.0f, 76.0f, 22.0f, class_0115.lllIIIllIIIIlllIlIIllIIll(class_0135.IlIllllllIIlIIllllIIlIIIl));
            class_0713.lllIIIllIIIIlllIlIIllIIll(78.0f, 6.0f, 94.0f, 22.0f, class_0115.lllIIIllIIIIlllIlIIllIIll(class_0135.lIlllIlllIIIIlIIlllIllIII));
            GL11.glColor4f((float)0.15f, (float)0.15f, (float)0.15f, (float)1.0f);
            class_0857.lllIIIllIIIIlllIlIIllIIll(class_17732, 7.0f, 25.0f, 7.0f);
            class_0857.lllIIIllIIIIlllIlIIllIIll(class_17732, 7.0f, 43.0f, 7.0f);
            class_0857.lllIIIllIIIIlllIlIIllIIll(class_17732, 7.0f, 61.0f, 7.0f);
            class_0857.lllIIIllIIIIlllIlIIllIIll(class_17732, 7.0f, 79.0f, 7.0f);
        }
        this.lIIIIlIlIIlllllIIllIIlIII.lllIlIIlIIIlIlIIIllIlllIl(f, f2, this.lllIIIllIIIIlllIlIIllIIll((class_0759)this.IllIIIllIIIIlIlIlIllIIlll, f, f2, new class_0759[0]));
        class_0713.lllIIIllIIIIlllIlIIllIIll(69.5f, 28.0f, 70.5f, 28.0f + this.IIIllIllIIlIlIlIlIllllIIl.IIIllIIlIIIIIIlIlIIllIIlI(), -14869219);
        class_0713.lllIIIllIIIIlllIlIIllIIll(0.0f, 28.0f + this.IIIllIllIIlIlIlIlIllllIIl.IIIllIIlIIIIIIlIlIIllIIlI(), 140.0f, 28.0f + this.IIIllIllIIlIlIlIlIllllIIl.IIIllIIlIIIIIIlIlIIllIIlI() + 1.0f, -15395563);
        this.lllIIIllIIIIlllIlIIllIIll(f, f2, this.lllIlIIlIIIlIlIIIllIlllIl, this.lIllllIIlIIIlIllllllIIIll);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(char c, int n) {
        if (n == 15 && Keyboard.isKeyDown((int)42) && System.currentTimeMillis() - this.IlIIlllllIIlIlIlllllIllll > 200L || n == 1) {
            this.IIlIIlIlIlIllIIlIlIIIIlll = System.currentTimeMillis();
            this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(this.IIIIIIIIlIllIIllIIlllIllI);
        }
        this.lllIlIIlIIIlIlIIIllIlllIl(c, n);
        if (n == 59 && LunarClient.getInstance().IlIIIlIIIIllIIIllIIIIIIll()) {
            boolean bl = true;
            for (class_0759 class_07592 : this.IlIllllllIIlIIllllIIlIIIl) {
                if (!(class_07592 instanceof class_1471)) continue;
                bl = false;
            }
            if (bl) {
                class_0759[] arrclass_0759 = new class_0759[1];
                class_1471 class_14712 = new class_1471();
                arrclass_0759[0] = class_14712;
                this.lllIlIIlIIIlIlIIIllIlllIl(arrclass_0759);
                class_14712.lllIIIllIIIIlllIlIIllIIll(60.0f, 30.0f, 500.0f, 200.0f);
            }
        }
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(float f, float f2, int n) {
        boolean bl;
        this.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(f, f2, n, this.lllIIIllIIIIlllIlIIllIIll((class_0759)this.IllIIIllIIIIlIlIlIllIIlll, f, f2, new class_0759[0]));
        this.lllIIIllIIIIlllIlIIllIIll(f, f2, n, this.lllIlIIlIIIlIlIIIllIlllIl, this.lIllllIIlIIIlIllllllIIIll);
        boolean bl2 = this.lllIIIllIIIIlllIlIIllIIll((class_0759)this.IIIllIllIIlIlIlIlIllllIIl, f, f2, new class_0759[0]);
        if (bl2 && this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(f, f2) && this.lIIIIlIlIIlllllIIllIIlIII != this.lllIlIIlIIIlIlIIIllIlllIl) {
            this.lllllIlllIIllIlIIlIIIllII.IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
            this.lIIIIlIlIIlllllIIllIIlIII = this.lllIlIIlIIIlIlIIIllIlllIl;
        } else if (bl2 && this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(f, f2) && this.lIIIIlIlIIlllllIIllIIlIII != this.lIllllIIlIIIlIllllllIIIll) {
            this.lllllIlllIIllIlIIlIIIllII.IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
            this.lIIIIlIlIIlllllIIllIIlIII = this.lIllllIIlIIIlIllllllIIIll;
        }
        boolean bl3 = bl = f > 6.0f && f < 134.0f && f2 > 6.0f && f2 < 22.0f;
        if (bl2 && bl && LunarClient.getInstance().getWebsocket().isOpen()) {
            boolean bl4;
            boolean bl5 = f > 24.0f && f < 40.0f;
            boolean bl6 = f > 42.0f && f < 58.0f;
            boolean bl7 = f > 60.0f && f < 76.0f;
            boolean bl8 = bl4 = f > 78.0f && f < 94.0f;
            if (bl5) {
                LunarClient.getInstance().setStatus(class_0135.lllIIIllIIIIlllIlIIllIIll);
                this.lllllIlllIIllIlIIlIIIllII.IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
            } else if (bl6) {
                LunarClient.getInstance().setStatus(class_0135.lllIlIIlIIIlIlIIIllIlllIl);
                this.lllllIlllIIllIlIIlIIIllII.IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
            } else if (bl7) {
                LunarClient.getInstance().setStatus(class_0135.IlIllllllIIlIIllllIIlIIIl);
                this.lllllIlllIIllIlIIlIIIllII.IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
            } else if (bl4) {
                LunarClient.getInstance().setStatus(class_0135.lIlllIlllIIIIlIIlllIllIII);
                this.lllllIlllIIllIlIIlIIIllII.IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
            }
            LunarClient.getInstance().getWebsocket().IlIllllllIIlIIllllIIlIIIl();
        }
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(float f, float f2, int n) {
        this.IlIllllllIIlIIllllIIlIIIl(f, f2, n);
    }

    @Override
    public void o_() {
        Keyboard.enableRepeatEvents((boolean)false);
        this.IIIIIIIIlIllIIllIIlllIllI = null;
        this.IllIIlllllllIIlIIlIIIIlIl();
        this.lllllIlllIIllIlIIlIIIllII.lIIlIIIIIlIlllIlIIlIlIlll.IlIllllllIIlIIllllIIlIIIl();
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
        if (this.IIIIIIIIlIllIIllIIlllIllI != null) {
            this.IIIIIIIIlIllIIllIIlllIllI.IlIllllllIIlIIllllIIlIIIl();
        }
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll("FRIENDS (" + this.lllIlIIlIIIlIlIIIllIlllIl.IllIIlllllllIIlIIlIIIIlIl().size() + ")");
        this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll("REQUESTS (" + this.lIllllIIlIIIlIllllllIIIll.IllIIlllllllIIlIIlIIIIlIl().stream().filter(class_08252 -> !class_08252.IllIIlllllllIIlIIlIIIIlIl().IlIllllllIIlIIllllIIlIIIl()).count() + ")");
        this.IIIllIllIIlIlIlIlIllllIIl();
    }

    public void llIIllIllIlIIlIIllIllllll() {
        this.IllIIIIllIIllIllIlllIlIIl.removeIf(class_0078::IlIllllllIIlIIllllIIlIIIl);
        if (this.llIIlIlIlllIIllIlIlllIllI.isEmpty()) {
            return;
        }
        boolean bl = true;
        for (class_0078 class_00783 : this.IllIIIIllIIllIllIlllIlIIl) {
            if (class_00783.lllIlIIlIIIlIlIIIllIlllIl()) continue;
            bl = false;
        }
        if (bl) {
            class_0078 class_00784 = (class_0078)this.llIIlIlIlllIIllIlIlllIllI.poll();
            class_00784.lllIIIllIIIIlllIlIIllIIll(this.IIIllIIlIIIIIIlIlIIllIIlI() - (float)class_0078.IlIIIIIllllllIIlllIllllll());
            this.IllIIIIllIIllIllIlllIlIIl.forEach(class_00782 -> class_00782.lllIIIllIIIIlllIlIIllIIll(class_00782.IllIIlllllllIIlIIlIIIIlIl() - (float)class_0078.IlIIIIIllllllIIlllIllllll()));
            this.IllIIIIllIIllIllIlllIlIIl.add(class_00784);
        }
    }

    public void lllIIlIIIllllllIIIIlIlIlI() {
        this.IllIIIIllIIllIllIlllIlIIl.forEach(class_0078::lllIIIllIIIIlllIlIIllIIll);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(Minecraft class_06672, int n, int n2) {
        if (this.IIIIIIIIlIllIIllIIlllIllI != null) {
            this.IIIIIIIIlIllIIllIIlllIllI.lllIIIllIIIIlllIlIIllIIll(class_06672, n, n2);
        }
        float f = this.IIIllIIlIIIIIIlIlIIllIIlI();
        super.lllIIIllIIIIlllIlIIllIIll(class_06672, n, n2);
        this.IllIIIIllIIllIllIlllIlIIl.forEach(class_00782 -> this.lllIIIllIIIIlllIlIIllIIll((class_0078)class_00782, this.IIIllIIlIIIIIIlIlIIllIIlI() - f));
        this.llIIlIlIlllIIllIlIlllIllI.forEach(class_00782 -> this.lllIIIllIIIIlllIlIIllIIll((class_0078)class_00782, this.IIIllIIlIIIIIIlIlIIllIIlI() - f));
    }

    private void lllIIIllIIIIlllIlIIllIIll(class_0078 class_00782, float f) {
        class_00782.lllIlIIlIIIlIlIIIllIlllIl(this.lIllllIIlIIIlIllllllIIIll() - (float)class_0078.lIlllIlllIIIIlIIlllIllIII());
        class_00782.IlIllllllIIlIIllllIIlIIIl(class_00782.IIIllIIlIIIIIIlIlIIllIIlI() + f);
        class_00782.lIlllIlllIIIIlIIlllIllIII(class_00782.IllIIlllllllIIlIIlIIIIlIl() + f);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
        if (this.IIIIIIIIlIllIIllIIlllIllI != null) {
            this.IIIIIIIIlIllIIllIIlllIllI.lllIIIllIIIIlllIlIIllIIll(-1, -1, f);
        }
        super.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
    }

    public void lllIIIllIIIIlllIlIIllIIll(String string) {
        this.lllIIIllIIIIlllIlIIllIIll("", string);
    }

    public void lllIIIllIIIIlllIlIIllIIll(String string, String string2) {
        int n = class_0078.lIlllIlllIIIIlIIlllIllIII();
        string2 = LunarClient.getInstance().robotoMedium13px.lllIlIIlIIIlIlIIIllIlllIl(string2, n - 10);
        class_0078 class_00782 = new class_0078(string, string2.split("\n"), this.lIllllIIlIIIlIllllllIIIll() - (float)n, this.IIIllIIlIIIIIIlIlIIllIIlI());
        class_00782.lllIIIllIIIIlllIlIIllIIll(string.equals(""));
        this.llIIlIlIlllIIllIlIlllIllI.add(class_00782);
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0115 class_01152, boolean bl) {
        if (bl) {
            this.lllIlIIlIIIlIlIIIllIlllIl.IllIIlllllllIIlIIlIIIIlIl().add(new class_1873(class_01152));
        } else {
            this.lllIlIIlIIIlIlIIIllIlllIl.IllIIlllllllIIlIIlIIIIlIl().removeIf(class_18732 -> class_18732.IllIIlllllllIIlIIlIIIIlIl() == class_01152);
        }
        this.lllIlIIlIIIlIlIIIllIlllIl.IIIllIllIIlIlIlIlIllllIIl();
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0642 class_06422, boolean bl) {
        if (bl) {
            this.lIllllIIlIIIlIllllllIIIll.IllIIlllllllIIlIIlIIIIlIl().add(new class_0825(class_06422));
        } else {
            this.lIllllIIlIIIlIllllllIIIll.IllIIlllllllIIlIIlIIIIlIl().removeIf(class_08252 -> class_08252.IllIIlllllllIIlIIlIIIIlIl() == class_06422);
        }
        this.lIllllIIlIIIlIllllllIIIll.IIIllIllIIlIlIlIlIllllIIl();
    }

    public static class_0713 lllIIIllIIIIlllIlIIllIIll(class_0229 class_02292) {
        if (class_02292 != lllIIIllIIIIlllIlIIllIIll) {
            class_0713.IlIlllIIIIIIlIIllIIllIlll().IIIIIIIIlIllIIllIIlllIllI = class_02292;
        }
        return class_0713.IlIlllIIIIIIlIIllIIllIlll();
    }

    public static class_0713 IlIlllIIIIIIlIIllIIllIlll() {
        return lllIIIllIIIIlllIlIIllIIll;
    }

    public static void lllIIIllIIIIlllIlIIllIIll(class_0713 class_07132) {
        lllIIIllIIIIlllIlIIllIIll = class_07132;
    }

    public class_1185 IlIlIIlIlIllIIlIlIIllIIIl() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public class_0679 lllllIlllIIllIlIIlIIIllII() {
        return this.lIllllIIlIIIlIllllllIIIll;
    }

    public long IlIlIIlllIIlIllIIIlllllIl() {
        return this.IIlIIlIlIlIllIIlIlIIIIlll;
    }
}

