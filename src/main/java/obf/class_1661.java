package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.moonsworth.client.nethandler.LCPacket
 *  com.moonsworth.client.nethandler.shared.LCPacketWaypointAdd
 *  com.moonsworth.client.nethandler.shared.LCPacketWaypointRemove
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.opengl.GL11
 */
import com.moonsworth.client.nethandler.LCPacket;
import com.moonsworth.client.nethandler.shared.LCPacketWaypointAdd;
import com.moonsworth.client.nethandler.shared.LCPacketWaypointRemove;
import java.awt.Color;
import java.util.Random;

import com.moonsworth.lunar.client.LunarClient;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public class class_1661
extends class_1634 {
    class_2013 lllIIIllIIIIlllIlIIllIIll;
    class_0153 lllIlIIlIIIlIlIIIllIlllIl;
    class_0237 IlIllllllIIlIIllllIIlIIIl;
    private class_1400 lIllllIIlIIIlIllllllIIIll;
    private class_2228 IIIllIIlIIIIIIlIlIIllIIlI;
    protected class_1149 lIlllIlllIIIIlIIlllIllIII = null;
    private String IllIIlllllllIIlIIlIIIIlIl = null;
    private class_0598 IIIllIllIIlIlIlIlIllllIIl;
    private class_0598 IllIIIllIIIIlIlIlIllIIlll;
    private class_0598 lIIIIlIlIIlllllIIllIIlIII;
    private class_0598 lIlllIlllIlIIIIlllIlIlIIl;
    private class_1197 IlIIlllllIIlIlIlllllIllll;
    protected class_0368 IlIIIIIllllllIIlllIllllll;
    private boolean llIIlIlIlllIIllIlIlllIllI = false;
    private float IllIIIIllIIllIllIlllIlIIl;
    private float IIIIIIIIlIllIIllIIlllIllI;
    private float IIlIIlIlIlIllIIlIlIIIIlll;
    private boolean llIIIlllIlllIlIllIIIIllIl;
    private Random IIIIlIllIlIIlIIlIllIlIlll = new Random();
    private boolean IlIlIIlllIllllllllIIIlIlI;

    public class_1661(class_2013 class_20132, class_1400 class_14002, class_0368 class_03682, boolean bl) {
        this.lllIIIllIIIIlllIlIIllIIll = class_20132;
        this.lllIlIIlIIIlIlIIIllIlllIl = class_20132.IIIllIIlIIIIIIlIlIIllIIlI();
        this.IlIllllllIIlIIllllIIlIIIl = class_20132.lIllllIIlIIIlIllllllIIIll();
        this.lIllllIIlIIIlIllllllIIIll = class_14002;
        this.IlIIIIIllllllIIlllIllllll = class_03682;
        this.IllIIIIllIIllIllIlllIlIIl = this.IlIIIIIllllllIIlllIllllll.IlIlIIlIlIllIIlIlIIllIIIl;
        this.IIIIIIIIlIllIIllIIlllIllI = this.IlIIIIIllllllIIlllIllllll.lllllIlllIIllIlIIlIIIllII;
        this.IIlIIlIlIlIllIIlIlIIIIlll = this.IlIIIIIllllllIIlllIllllll.IlIlIIlllIIlIllIIIlllllIl;
        this.llIIIlllIlllIlIllIIIIllIl = this.IlIIIIIllllllIIlllIllllll.llIIlllIllIllllIIIlIIIIII;
        this.IlIlIIlllIllllllllIIIlIlI = bl;
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll();
        this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll();
    }

    @Override
    public void n_() {
        Keyboard.enableRepeatEvents((boolean)true);
        this.llIIllIllIlIIlIIllIllllll().clear();
        this.llIIllIllIlIIlIIllIllllll().add(new class_1197(0, this.lIIIIlIlIIlllllIIllIIlIII() / 2 - 155, this.llIIlllIllIllllIIIlIIIIII() / 6 + 168, 150, 20, class_0950.lllIIIllIIIIlllIlIIllIIll("addServer.add")));
        this.llIIllIllIlIIlIIllIllllll().add(new class_1197(1, this.lIIIIlIlIIlllllIIllIIlIII() / 2 + 5, this.llIIlllIllIllllIIIlIIIIII() / 6 + 168, 150, 20, class_0950.lllIIIllIIIIlllIlIIllIIll("gui.cancel")));
        this.IIIllIllIIlIlIlIlIllllIIl = new class_0598(this.lllIIlIIIllllllIIIIlIlIlI(), this.lIIIIlIlIIlllllIIllIIlIII() / 2 - 100, this.llIIlllIllIllllIIIlIIIIII() / 6 + 0 + 13, 200, 20);
        this.IIIllIllIIlIlIlIlIllllIIl.lllIlIIlIIIlIlIIIllIlllIl(true);
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll);
        this.IllIIIllIIIIlIlIlIllIIlll = new class_0598(this.lllIIlIIIllllllIIIIlIlIlI(), this.lIIIIlIlIIlllllIIllIIlIII() / 2 - 100, this.llIIlllIllIllllIIIlIIIIII() / 6 + 41 + 13, 56, 20);
        this.IllIIIllIIIIlIlIlIllIIlll.lIllllIIlIIIlIllllllIIIll(128);
        this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll("" + this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl());
        this.lIIIIlIlIIlllllIIllIIlIII = new class_0598(this.lllIIlIIIllllllIIIIlIlIlI(), this.lIIIIlIlIIlllllIIllIIlIII() / 2 - 28, this.llIIlllIllIllllIIIlIIIIII() / 6 + 41 + 13, 56, 20);
        this.lIIIIlIlIIlllllIIllIIlIII.lIllllIIlIIIlIllllllIIIll(128);
        this.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll("" + this.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII());
        this.lIlllIlllIlIIIIlllIlIlIIl = new class_0598(this.lllIIlIIIllllllIIIIlIlIlI(), this.lIIIIlIlIIlllllIIllIIlIII() / 2 + 44, this.llIIlllIllIllllIIIlIIIIII() / 6 + 41 + 13, 56, 20);
        this.lIlllIlllIlIIIIlllIlIlIIl.lIllllIIlIIIlIllllllIIIll(128);
        this.lIlllIlllIlIIIIlllIlIlIIl.lllIIIllIIIIlllIlIIllIIll("" + this.IlIIIIIllllllIIlllIllllll.IlIIIIIllllllIIlllIllllll());
        this.IlIIlllllIIlIlIlllllIllll = new class_1197(2, this.lIIIIlIlIIlllllIIllIIlIII() / 2 - 101, this.llIIlllIllIllllIIIlIIIIII() / 6 + 82 + 6, 100, 20, "Enabled: " + (this.IlIIIIIllllllIIlllIllllll.llIIlllIllIllllIIIlIIIIII ? "On" : "Off"));
        this.llIIllIllIlIIlIIllIllllll().add(this.IlIIlllllIIlIlIlllllIllll);
        ((class_1197)this.llIIllIllIlIIlIIllIllllll().get((int)0)).IllIIIllIIIIlIlIlIllIIlll = this.IIIllIllIIlIlIlIlIllllIIl.lllIlIIlIIIlIlIIIllIlllIl().length() > 0;
        this.IIIllIIlIIIIIIlIlIIllIIlI = new class_2228(this);
        this.IIIllIIlIIIIIIlIlIIllIIlI.lIlllIlllIIIIlIIlllIllIII(7, 8);
    }

    @Override
    public void o_() {
        Keyboard.enableRepeatEvents((boolean)false);
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1197 class_11972) {
        if (class_11972.IllIIIllIIIIlIlIlIllIIlll) {
            if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 2) {
                boolean bl = this.IlIIIIIllllllIIlllIllllll.llIIlllIllIllllIIIlIIIIII = !this.IlIIIIIllllllIIlllIllllll.llIIlllIllIllllIIIlIIIIII;
            }
            if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 1) {
                this.IlIIIIIllllllIIlllIllllll.IlIlIIlIlIllIIlIlIIllIIIl = this.IllIIIIllIIllIllIlllIlIIl;
                this.IlIIIIIllllllIIlllIllllll.lllllIlllIIllIlIIlIIIllII = this.IIIIIIIIlIllIIllIIlllIllI;
                this.IlIIIIIllllllIIlllIllllll.IlIlIIlllIIlIllIIIlllllIl = this.IIlIIlIlIlIllIIlIlIIIIlll;
                this.IlIIIIIllllllIIlllIllllll.llIIlllIllIllllIIIlIIIIII = this.llIIIlllIlllIlIllIIIIllIl;
                if (this.lIllllIIlIIIlIllllllIIIll != null) {
                    this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(false, 0);
                } else {
                    if (((Boolean) LunarClient.getInstance().getSettingsManager().llIllllIlIllIIIlIllIIlIlI.lIlllIlllIIIIlIIlllIllIII()).booleanValue()) {
                        this.lllllIlllIIllIlIIlIIIllII.lIIlIIIIIlIlllIlIIlIlIlll.IlIllllllIIlIIllllIIlIIIl();
                    }
                    this.IllIIIllIIIIlIlIlIllIIlll().lllIIIllIIIIlllIlIIllIIll((class_0229)null);
                }
            } else if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 0) {
                class_1398 class_13982 = LunarClient.getInstance().getModuleManager().lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll();
                class_1187 class_11872 = (class_1187)class_13982.IIIllIIlIIIIIIlIlIIllIIlI();
                String string = this.IIIllIllIIlIlIlIlIllllIIl.lllIlIIlIIIlIlIIIllIlllIl();
                if (!this.IlIlIIlllIllllllllIIIlIlI) {
                    while (!class_11872.lllIIIllIIIIlllIlIIllIIll(string, this.lIlllIlllIIIIlIIlllIllIII == null ? this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII.lIIllllllllIlIllllllllIlI : this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl)) {
                        string = string + "1";
                    }
                }
                if (this.IlIlIIlllIllllllllIIIlIlI) {
                    LunarClient.getInstance().getNetworkManager().lllIIIllIIIIlllIlIIllIIll((LCPacket)new LCPacketWaypointRemove(this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll, this.IlIIIIIllllllIIlllIllllll.IlIIIIIllllllIIlllIllllll));
                }
                this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll = string;
                this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(Integer.parseInt(this.IllIIIllIIIIlIlIlIllIIlll.lllIlIIlIIIlIlIIIllIlllIl()));
                this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl(Integer.parseInt(this.lIIIIlIlIIlllllIIllIIlIII.lllIlIIlIIIlIlIIIllIlllIl()));
                this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl(Integer.parseInt(this.lIlllIlllIlIIIIlllIlIlIIl.lllIlIIlIIIlIlIIIllIlllIl()));
                if (this.lIllllIIlIIIlIllllllIIIll != null) {
                    this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(true, 0);
                    if (this.IlIlIIlllIllllllllIIIlIlI) {
                        LunarClient.getInstance().getNetworkManager().lllIIIllIIIIlllIlIIllIIll((LCPacket)new LCPacketWaypointAdd(this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll, this.IlIIIIIllllllIIlllIllllll.IlIIIIIllllllIIlllIllllll, new Color(this.IlIIIIIllllllIIlllIllllll.IlIlIIlIlIllIIlIlIIllIIIl, this.IlIIIIIllllllIIlllIllllll.lllllIlllIIllIlIIlIIIllII, this.IlIIIIIllllllIIlllIllllll.IlIlIIlllIIlIllIIIlllllIl).getRGB(), this.IlIIIIIllllllIIlllIllllll.IIIllIllIIlIlIlIlIllllIIl, this.IlIIIIIllllllIIlllIllllll.lIIIIlIlIIlllllIIllIIlIII, this.IlIIIIIllllllIIlllIllllll.IllIIIllIIIIlIlIlIllIIlll, false, this.IlIIIIIllllllIIlllIllllll.llIIlllIllIllllIIIlIIIIII));
                    }
                } else {
                    this.lllIlIIlIIIlIlIIIllIlllIl.lllIlIIlIIIlIlIIIllIlllIl(this.IlIIIIIllllllIIlllIllllll);
                    if (((Boolean) LunarClient.getInstance().getSettingsManager().llIllllIlIllIIIlIllIIlIlI.lIlllIlllIIIIlIIlllIllIII()).booleanValue()) {
                        Minecraft.getMinecraft().lIIlIIIIIlIlllIlIIlIlIlll.IlIllllllIIlIIllllIIlIIIl();
                    }
                    this.IllIIIllIIIIlIlIlIllIIlll().lllIIIllIIIIlllIlIIllIIll((class_0229)null);
                }
            }
        }
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(char c, int n) {
        int n2;
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(c, n);
        this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(c, n);
        this.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(c, n);
        this.lIlllIlllIlIIIIlllIlIlIIl.lllIIIllIIIIlllIlIIllIIll(c, n);
        if (c == '\t') {
            if (this.IIIllIllIIlIlIlIlIllllIIl.IllIIIllIIIIlIlIlIllIIlll()) {
                this.IIIllIllIIlIlIlIlIllllIIl.lllIlIIlIIIlIlIIIllIlllIl(false);
                this.IllIIIllIIIIlIlIlIllIIlll.lllIlIIlIIIlIlIIIllIlllIl(true);
                this.lIIIIlIlIIlllllIIllIIlIII.lllIlIIlIIIlIlIIIllIlllIl(false);
                this.lIlllIlllIlIIIIlllIlIlIIl.lllIlIIlIIIlIlIIIllIlllIl(false);
            } else if (this.IllIIIllIIIIlIlIlIllIIlll.IllIIIllIIIIlIlIlIllIIlll()) {
                this.IIIllIllIIlIlIlIlIllllIIl.lllIlIIlIIIlIlIIIllIlllIl(false);
                this.IllIIIllIIIIlIlIlIllIIlll.lllIlIIlIIIlIlIIIllIlllIl(false);
                this.lIIIIlIlIIlllllIIllIIlIII.lllIlIIlIIIlIlIIIllIlllIl(true);
                this.lIlllIlllIlIIIIlllIlIlIIl.lllIlIIlIIIlIlIIIllIlllIl(false);
            } else if (this.lIIIIlIlIIlllllIIllIIlIII.IllIIIllIIIIlIlIlIllIIlll()) {
                this.IIIllIllIIlIlIlIlIllllIIl.lllIlIIlIIIlIlIIIllIlllIl(false);
                this.IllIIIllIIIIlIlIlIllIIlll.lllIlIIlIIIlIlIIIllIlllIl(false);
                this.lIIIIlIlIIlllllIIllIIlIII.lllIlIIlIIIlIlIIIllIlllIl(false);
                this.lIlllIlllIlIIIIlllIlIlIIl.lllIlIIlIIIlIlIIIllIlllIl(true);
            } else if (this.lIlllIlllIlIIIIlllIlIlIIl.IllIIIllIIIIlIlIlIllIIlll()) {
                this.IIIllIllIIlIlIlIlIllllIIl.lllIlIIlIIIlIlIIIllIlllIl(true);
                this.IllIIIllIIIIlIlIlIllIIlll.lllIlIIlIIIlIlIIIllIlllIl(false);
                this.lIIIIlIlIIlllllIIllIIlIII.lllIlIIlIIIlIlIIIllIlllIl(false);
                this.lIlllIlllIlIIIIlllIlIlIIl.lllIlIIlIIIlIlIIIllIlllIl(false);
            }
        }
        if (c == '\r') {
            this.lllIIIllIIIIlllIlIIllIIll((class_1197)this.llIIllIllIlIIlIIllIllllll().get(0));
        }
        boolean bl = this.IIIllIllIIlIlIlIlIllllIIl.lllIlIIlIIIlIlIIIllIlllIl().length() > 0;
        try {
            n2 = Integer.parseInt(this.IllIIIllIIIIlIlIlIllIIlll.lllIlIIlIIIlIlIIIllIlllIl());
        }
        catch (NumberFormatException numberFormatException) {
            bl = false;
        }
        try {
            n2 = Integer.parseInt(this.lIIIIlIlIIlllllIIllIIlIII.lllIlIIlIIIlIlIIIllIlllIl());
        }
        catch (NumberFormatException numberFormatException) {
            bl = false;
        }
        try {
            int n3 = Integer.parseInt(this.lIlllIlllIlIIIIlllIlIlIIl.lllIlIIlIIIlIlIIIllIlllIl());
        }
        catch (NumberFormatException numberFormatException) {
            bl = false;
        }
        ((class_1197)this.llIIllIllIlIIlIIllIllllll().get((int)0)).IllIIIllIIIIlIlIlIllIIlll = bl;
        if (n == 1) {
            this.IlIIIIIllllllIIlllIllllll.IlIlIIlIlIllIIlIlIIllIIIl = this.IllIIIIllIIllIllIlllIlIIl;
            this.IlIIIIIllllllIIlllIllllll.lllllIlllIIllIlIIlIIIllII = this.IIIIIIIIlIllIIllIIlllIllI;
            this.IlIIIIIllllllIIlllIllllll.IlIlIIlllIIlIllIIIlllllIl = this.IIlIIlIlIlIllIIlIlIIIIlll;
            this.IlIIIIIllllllIIlllIllllll.llIIlllIllIllllIIIlIIIIII = this.llIIIlllIlllIlIllIIIIllIl;
        }
        super.lllIIIllIIIIlllIlIIllIIll(c, n);
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        if (!this.llIIlIlIlllIIllIlIlllIllI) {
            super.lllIIIllIIIIlllIlIIllIIll(n, n2, n3);
            this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(n, n2, n3);
            this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(n, n2, n3);
            this.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(n, n2, n3);
            this.lIlllIlllIlIIIIlllIlIlIIl.lllIIIllIIIIlllIlIIllIIll(n, n2, n3);
            if (n >= this.lIIIIlIlIIlllllIIllIIlIII() / 2 + 85 && n <= this.lIIIIlIlIIlllllIIllIIlIII() / 2 + 101 && n2 >= this.llIIlllIllIllllIIIlIIIIII() / 6 + 82 + 11 && n2 <= this.llIIlllIllIllllIIIlIIIIII() / 6 + 82 + 21) {
                this.llIIlIlIlllIIllIlIlllIllI = true;
            }
        } else if (n >= this.lIIIIlIlIIlllllIIllIIlIII() / 2 - 128 && n <= this.lIIIIlIlIIlllllIIllIIlIII() / 2 + 128 && n2 >= this.llIIlllIllIllllIIIlIIIIII() / 2 - 128 && n2 <= this.llIIlllIllIllllIIIlIIIIII() / 2 + 128) {
            int n4 = this.IlIllllllIIlIIllllIIlIIIl.lIllllIIlIIIlIllllllIIIll().getRGB(n - (this.lIIIIlIlIIlllllIIllIIlIII() / 2 - 128), n2 - (this.llIIlllIllIllllIIIlIIIIII() / 2 - 128));
            this.IlIIIIIllllllIIlllIllllll.IlIlIIlIlIllIIlIlIIllIIIl = (float)(n4 >> 16 & 0xFF) / 255.0f;
            this.IlIIIIIllllllIIlllIllllll.lllllIlllIIllIlIIlIIIllII = (float)(n4 >> 8 & 0xFF) / 255.0f;
            this.IlIIIIIllllllIIlllIllllll.IlIlIIlllIIlIllIIIlllllIl = (float)(n4 >> 0 & 0xFF) / 255.0f;
            this.llIIlIlIlllIIllIlIlllIllI = false;
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
        super.IIIllIllIIlIlIlIlIllllIIl();
        this.IllIIlllllllIIlIIlIIIIlIl = null;
        this.IlIIlllllIIlIlIlllllIllll.IllIIlllllllIIlIIlIIIIlIl = class_0950.lllIIIllIIIIlllIlIIllIIll("minimap.waypoints.enabled") + " " + (this.IlIIIIIllllllIIlllIllllll.llIIlllIllIllllIIIlIIIIII ? class_0950.lllIIIllIIIIlllIlIIllIIll("options.on") : class_0950.lllIIIllIIIIlllIlIIllIIll("options.off"));
        this.llIIlIllIllllIlIIIIlIIlll();
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
        this.lllIIIllIIIIlllIlIIllIIll(this.lllIIlIIIllllllIIIIlIlIlI(), this.lIllllIIlIIIlIllllllIIIll != null && this.lIllllIIlIIIlIllllllIIIll.lIlllIlllIIIIlIIlllIllIII ? class_0950.lllIIIllIIIIlllIlIIllIIll("minimap.waypoints.edit") : class_0950.lllIIIllIIIIlllIlIIllIIll("minimap.waypoints.new"), this.lIIIIlIlIIlllllIIllIIlIII() / 2, 20, 0xFFFFFF);
        this.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIlIIIllllllIIIIlIlIlI(), class_0950.lllIIIllIIIIlllIlIIllIIll("minimap.waypoints.name"), this.lIIIIlIlIIlllllIIllIIlIII() / 2 - 100, this.llIIlllIllIllllIIIlIIIIII() / 6 + 0, 0xA0A0A0);
        this.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIlIIIllllllIIIIlIlIlI(), class_0950.lllIIIllIIIIlllIlIIllIIll("X"), this.lIIIIlIlIIlllllIIllIIlIII() / 2 - 100, this.llIIlllIllIllllIIIlIIIIII() / 6 + 41, 0xA0A0A0);
        this.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIlIIIllllllIIIIlIlIlI(), class_0950.lllIIIllIIIIlllIlIIllIIll("Z"), this.lIIIIlIlIIlllllIIllIIlIII() / 2 - 28, this.llIIlllIllIllllIIIlIIIIII() / 6 + 41, 0xA0A0A0);
        this.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIlIIIllllllIIIIlIlIlI(), class_0950.lllIIIllIIIIlllIlIIllIIll("Y"), this.lIIIIlIlIIlllllIIllIIlIII() / 2 + 44, this.llIIlllIllIllllIIIlIIIIII() / 6 + 41, 0xA0A0A0);
        this.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIlIIIllllllIIIIlIlIlI(), class_0950.lllIIIllIIIIlllIlIIllIIll("minimap.waypoints.choosecolor"), this.lIIIIlIlIIlllllIIllIIlIII() / 2 + 10, this.llIIlllIllIllllIIIlIIIIII() / 6 + 82 + 11, 0xA0A0A0);
        this.IIIllIllIIlIlIlIlIllllIIl.lIllllIIlIIIlIllllllIIIll();
        this.IllIIIllIIIIlIlIlIllIIlll.lIllllIIlIIIlIllllllIIIll();
        this.lIIIIlIlIIlllllIIllIIlIII.lIllllIIlIIIlIllllllIIIll();
        this.lIlllIlllIlIIIIlllIlIlIIl.lIllllIIlIIIlIllllllIIIll();
        GL11.glColor4f((float)this.IlIIIIIllllllIIlllIllllll.IlIlIIlIlIllIIlIlIIllIIIl, (float)this.IlIIIIIllllllIIlllIllllll.lllllIlllIIllIlIIlIIIllII, (float)this.IlIIIIIllllllIIlllIllllll.IlIlIIlllIIlIllIIIlllllIl, (float)1.0f);
        class_2210.lllIIIllIIIIlllIlIIllIIll(-1);
        class_1661.lllIIIllIIIIlllIlIIllIIll(this.lIIIIlIlIIlllllIIllIIlIII() / 2 + 85, this.llIIlllIllIllllIIIlIIIIII() / 6 + 82 + 11, 0, 0, 16, 10);
        super.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
        if (this.llIIlIlIlllIIllIlIlllIllI) {
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            class_2210.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("voxelmap/images/colorPicker.png"));
            class_1661.lllIIIllIIIIlllIlIIllIIll(this.lIIIIlIlIIlllllIIllIIlIII() / 2 - 128, this.llIIlllIllIllllIIIlIIIIII() / 2 - 128, 0, 0, 256, 256);
        }
        this.lllIIIllIIIIlllIlIIllIIll(this.IllIIlllllllIIlIIlIIIIlIl, n, n2);
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1149 class_11492) {
        this.lIlllIlllIIIIlIIlllIllIII = class_11492;
    }

    public void lIllllIIlIIIlIllllllIIIll() {
        if (this.IlIIIIIllllllIIlllIllllll.IllIIlllllllIIlIIlIIIIlIl.size() > 1 && this.IlIIIIIllllllIIlllIllllll.IllIIlllllllIIlIIlIIIIlIl.contains(this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl) && this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl != Minecraft.getMinecraft().lIIIIlIlIIlllllIIllIIlIII.lIIllllllllIlIllllllllIlI) {
            this.IlIIIIIllllllIIlllIllllll.IllIIlllllllIIlIIlIIIIlIl.remove(new Integer(this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl));
        } else if (!this.IlIIIIIllllllIIlllIllllll.IllIIlllllllIIlIIlIIIIlIl.contains(this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl)) {
            this.IlIIIIIllllllIIlllIllllll.IllIIlllllllIIlIIlIIIIlIl.add(new Integer(this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl));
        }
    }

    protected void lllIIIllIIIIlllIlIIllIIll(String string, int n, int n2) {
        if (string != null) {
            int n3 = n + 12;
            int n4 = n2 - 12;
            int n5 = this.lllIIlIIIllllllIIIIlIlIlI().lllIIIllIIIIlllIlIIllIIll(string);
            class_1661.lllIIIllIIIIlllIlIIllIIll((float)(n3 - 3), (float)(n4 - 3), (float)(n3 + n5 + 3), (float)(n4 + 8 + 3), -1073741824, -1073741824);
            this.lllIIlIIIllllllIIIIlIlIlI().lllIIIllIIIIlllIlIIllIIll(string, (float)n3, (float)n4, -1);
        }
    }

    static String lllIIIllIIIIlllIlIIllIIll(class_1661 class_16612, String string) {
        class_16612.IllIIlllllllIIlIIlIIIIlIl = string;
        return class_16612.IllIIlllllllIIlIIlIIIIlIl;
    }
}

