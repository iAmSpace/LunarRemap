package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.Unpooled
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.input.Keyboard
 */
import com.moonsworth.lunar.client.LunarClient;
import io.netty.buffer.Unpooled;
import net.minecraft.client.Minecraft;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;

public class class_0809
extends class_0229 {
    private static final Logger lllIIIllIIIIlllIlIIllIIll = LogManager.getLogger();
    private class_0598 lllIlIIlIIIlIlIIIllIlllIl;
    private class_0598 IlIllllllIIlIIllllIIlIIIl;
    private final class_0484 lIlllIlllIIIIlIIlllIllIII;
    private class_1197 IlIIIIIllllllIIlllIllllll;
    private class_1197 lIllllIIlIIIlIllllllIIIll;

    public class_0809(class_0484 class_04842) {
        this.lIlllIlllIIIIlIIlllIllIII = class_04842;
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
        this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll();
    }

    @Override
    public void n_() {
        Keyboard.enableRepeatEvents((boolean)true);
        this.lIlIlIIlIIIIlIIIIIlllIIII.clear();
        this.IlIIIIIllllllIIlllIllllll = new class_1197(0, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 4 - 150, this.lIIlIIIIIlIlllIlIIlIlIlll / 4 + 120 + 12, 150, 20, class_0616.lllIIIllIIIIlllIlIIllIIll("gui.done", new Object[0]));
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(this.IlIIIIIllllllIIlllIllllll);
        this.lIllllIIlIIIlIllllllIIIll = new class_1197(1, this.IlIlIIlllIIlIllIIIlllllIl / 2 + 4, this.lIIlIIIIIlIlllIlIIlIlIlll / 4 + 120 + 12, 150, 20, class_0616.lllIIIllIIIIlllIlIIllIIll("gui.cancel", new Object[0]));
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(this.lIllllIIlIIIlIllllllIIIll);
        this.lllIlIIlIIIlIlIIIllIlllIl = new class_0598(this.lIlIllIIlIIlIIlIIlIIlIIll, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 150, 50, 300, 20);
        this.lllIlIIlIIIlIlIIIllIlllIl.lIllllIIlIIIlIllllllIIIll(32767);
        this.lllIlIIlIIIlIlIIIllIlllIl.lllIlIIlIIIlIlIIIllIlllIl(true);
        this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII.IlIllllllIIlIIllllIIlIIIl());
        this.IlIllllllIIlIIllllIIlIIIl = new class_0598(this.lIlIllIIlIIlIIlIIlIIlIIll, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 150, 135, 300, 20);
        this.IlIllllllIIlIIllllIIlIIIl.lIllllIIlIIIlIllllllIIIll(32767);
        this.IlIllllllIIlIIllllIIlIIIl.IlIllllllIIlIIllllIIlIIIl(false);
        this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII.IlIllllllIIlIIllllIIlIIIl());
        if (this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl() != null) {
            this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl().IlIllllllIIlIIllllIIlIIIl());
        }
        this.IlIIIIIllllllIIlllIllllll.IllIIIllIIIIlIlIlIllIIlll = this.lllIlIIlIIIlIlIIIllIlllIl.lllIlIIlIIIlIlIIIllIlllIl().trim().length() > 0;
    }

    @Override
    public void o_() {
        Keyboard.enableRepeatEvents((boolean)false);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1197 class_11972) {
        if (class_11972.IllIIIllIIIIlIlIlIllIIlll) {
            if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 1) {
                if (((Boolean) LunarClient.getInstance().getSettingsManager().llIllllIlIllIIIlIllIIlIlI.lIlllIlllIIIIlIIlllIllIII()).booleanValue()) {
                    Minecraft.getMinecraft().lIIlIIIIIlIlllIlIIlIlIlll.IlIllllllIIlIIllllIIlIIIl();
                }
                this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll((class_0229)null);
            } else if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 0) {
                class_0181 class_01812 = new class_0181(Unpooled.buffer());
                try {
                    class_01812.writeByte(this.lIlllIlllIIIIlIIlllIllIII.IlIIIIIllllllIIlllIllllll());
                    this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(class_01812);
                    class_01812.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl.lllIlIIlIIIlIlIIIllIlllIl());
                    this.lllllIlllIIllIlIIlIIIllII.llIIlIllIllllIlIIIIlIIlll().lllIIIllIIIIlllIlIIllIIll(new class_0917("MC|AdvCdm", class_01812));
                }
                catch (Exception exception) {
                    lllIIIllIIIIlllIlIIllIIll.error("Couldn't send command block info", (Throwable)exception);
                }
                finally {
                    class_01812.release();
                }
                if (((Boolean) LunarClient.getInstance().getSettingsManager().llIllllIlIllIIIlIllIIlIlI.lIlllIlllIIIIlIIlllIllIII()).booleanValue()) {
                    Minecraft.getMinecraft().lIIlIIIIIlIlllIlIIlIlIlll.IlIllllllIIlIIllllIIlIIIl();
                }
                this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll((class_0229)null);
            }
        }
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(char c, int n) {
        this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(c, n);
        this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(c, n);
        boolean bl = this.IlIIIIIllllllIIlllIllllll.IllIIIllIIIIlIlIlIllIIlll = this.lllIlIIlIIIlIlIIIllIlllIl.lllIlIIlIIIlIlIIIllIlllIl().trim().length() > 0;
        if (n != 28 && n != 156) {
            if (n == 1) {
                this.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll);
            }
        } else {
            this.lllIIIllIIIIlllIlIIllIIll(this.IlIIIIIllllllIIlllIllllll);
        }
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        super.lllIIIllIIIIlllIlIIllIIll(n, n2, n3);
        this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(n, n2, n3);
        this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(n, n2, n3);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
        this.llIIlIllIllllIlIIIIlIIlll();
        this.lllIIIllIIIIlllIlIIllIIll(this.lIlIllIIlIIlIIlIIlIIlIIll, class_0616.lllIIIllIIIIlllIlIIllIIll("advMode.setCommand", new Object[0]), this.IlIlIIlllIIlIllIIIlllllIl / 2, 20, 0xFFFFFF);
        this.lllIlIIlIIIlIlIIIllIlllIl(this.lIlIllIIlIIlIIlIIlIIlIIll, class_0616.lllIIIllIIIIlllIlIIllIIll("advMode.command", new Object[0]), this.IlIlIIlllIIlIllIIIlllllIl / 2 - 150, 37, 0xA0A0A0);
        this.lllIlIIlIIIlIlIIIllIlllIl.lIllllIIlIIIlIllllllIIIll();
        int n3 = 75;
        int n4 = 0;
        class_1854 class_18542 = this.lIlIllIIlIIlIIlIIlIIlIIll;
        String string = class_0616.lllIIIllIIIIlllIlIIllIIll("advMode.nearestPlayer", new Object[0]);
        int n5 = this.IlIlIIlllIIlIllIIIlllllIl / 2 - 150;
        int n6 = n4 + 1;
        this.lllIlIIlIIIlIlIIIllIlllIl(class_18542, string, n5, n3 + n4 * this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll, 0xA0A0A0);
        this.lllIlIIlIIIlIlIIIllIlllIl(this.lIlIllIIlIIlIIlIIlIIlIIll, class_0616.lllIIIllIIIIlllIlIIllIIll("advMode.randomPlayer", new Object[0]), this.IlIlIIlllIIlIllIIIlllllIl / 2 - 150, n3 + n6++ * this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll, 0xA0A0A0);
        this.lllIlIIlIIIlIlIIIllIlllIl(this.lIlIllIIlIIlIIlIIlIIlIIll, class_0616.lllIIIllIIIIlllIlIIllIIll("advMode.allPlayers", new Object[0]), this.IlIlIIlllIIlIllIIIlllllIl / 2 - 150, n3 + n6++ * this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll, 0xA0A0A0);
        if (this.IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl().length() > 0) {
            int n7 = n3 + n6 * this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll + 20;
            this.lllIlIIlIIIlIlIIIllIlllIl(this.lIlIllIIlIIlIIlIIlIIlIIll, class_0616.lllIIIllIIIIlllIlIIllIIll("advMode.previousOutput", new Object[0]), this.IlIlIIlllIIlIllIIIlllllIl / 2 - 150, n7, 0xA0A0A0);
            this.IlIllllllIIlIIllllIIlIIIl.lIllllIIlIIIlIllllllIIIll();
        }
        super.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
    }
}

