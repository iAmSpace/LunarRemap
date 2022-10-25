package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Throwables
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.GL11
 */
import com.google.common.base.Throwables;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.moonsworth.lunar.client.LunarClient;
import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public class class_0229
extends class_0210 {
    protected static class_1785 IlIlIIlIlIllIIlIlIIllIIIl = new class_1785();
    protected Minecraft lllllIlllIIllIlIIlIIIllII;
    public int IlIlIIlllIIlIllIIIlllllIl;
    public int lIIlIIIIIlIlllIlIIlIlIlll;
    protected List lIlIlIIlIIIIlIIIIIlllIIII = new ArrayList();
    protected List IlIIIlIIIIllIIIllIIIIIIll = new ArrayList();
    public boolean IIlllIlIlllIllIIIlllIIlIl;
    protected class_1854 lIlIllIIlIIlIIlIIlIIlIIll;
    private class_1197 lllIIIllIIIIlllIlIIllIIll;
    private int lllIlIIlIIIlIlIIIllIlllIl;
    private long IlIllllllIIlIIllllIIlIIIl;
    private int lIlllIlllIIIIlIIlllIllIII;
    protected static class_0730 llIIlIllIllllIlIIIIlIIlll = new class_0730(0, -553648128);
    protected static class_0730 llIllllIlIllIIIlIllIIlIlI = new class_0730(0, 1243487774);

    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
        int n3;
        for (n3 = 0; n3 < this.lIlIlIIlIIIIlIIIIIlllIIII.size(); ++n3) {
            ((class_1197)this.lIlIlIIlIIIIlIIIIIlllIIII.get(n3)).lllIIIllIIIIlllIlIIllIIll(this.lllllIlllIIllIlIIlIIIllII, n, n2);
        }
        for (n3 = 0; n3 < this.IlIIIlIIIIllIIIllIIIIIIll.size(); ++n3) {
            ((class_0343)this.IlIIIlIIIIllIIIllIIIIIIll.get(n3)).lllIIIllIIIIlllIlIIllIIll(this.lllllIlllIIllIlIIlIIIllII, n, n2);
        }
    }

    protected void lllIIIllIIIIlllIlIIllIIll(char c, int n) {
        if (Keyboard.isKeyDown((int)42) && n == 15) {
            this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(class_0713.lllIIIllIIIIlllIlIIllIIll(this.lllllIlllIIllIlIIlIIIllII.lllllIlllIIllIlIIlIIIllII));
        }
        if (n == 1) {
            if (((Boolean) LunarClient.getInstance().getSettingsManager().gsGuiBlur.getValue()).booleanValue()) {
                this.lllllIlllIIllIlIIlIIIllII.lIIlIIIIIlIlllIlIIlIlIlll.IlIllllllIIlIIllllIIlIIIl();
            }
            this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll((class_0229)null);
            this.lllllIlllIIllIlIIlIIIllII.lllIIlIIIllllllIIIIlIlIlI();
        }
    }

    public static String lIIlIIIIIlIlllIlIIlIlIlll() {
        try {
            Transferable transferable = Toolkit.getDefaultToolkit().getSystemClipboard().getContents(null);
            if (transferable != null && transferable.isDataFlavorSupported(DataFlavor.stringFlavor)) {
                return (String)transferable.getTransferData(DataFlavor.stringFlavor);
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return "";
    }

    public static void IlIllllllIIlIIllllIIlIIIl(String string) {
        try {
            StringSelection stringSelection = new StringSelection(string);
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    protected void lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, int n, int n2) {
        List list = class_08972.lllIIIllIIIIlllIlIIllIIll((class_0814)this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII, this.lllllIlllIIllIlIIlIIIllII.gameSettings.lIIllllIllIlllllIIllIllIl);
        for (int i = 0; i < list.size(); ++i) {
            if (i == 0) {
                list.set(i, (Object)((Object)class_08972.lIlIllIIlIIlIIlIIlIIlIIll().rarityColor) + (String)list.get(i));
                continue;
            }
            list.set(i, (Object)((Object) EnumChatFormatting.GRAY) + (String)list.get(i));
        }
        this.lllIIIllIIIIlllIlIIllIIll(list, n, n2);
    }

    protected void lllIlIIlIIIlIlIIIllIlllIl(String string, int n, int n2) {
        this.lllIIIllIIIIlllIlIIllIIll(Arrays.asList(string), n, n2);
    }

    protected void lllIIIllIIIIlllIlIIllIIll(List list, int n, int n2) {
        if (!list.isEmpty()) {
            int n3;
            GL11.glDisable((int)32826);
            class_0624.lllIIIllIIIIlllIlIIllIIll();
            GL11.glDisable((int)2896);
            GL11.glDisable((int)2929);
            int n4 = 0;
            for (String string : list) {
                n3 = this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(string);
                if (n3 <= n4) continue;
                n4 = n3;
            }
            int n5 = n + 12;
            n3 = n2 - 12;
            int n6 = 8;
            if (list.size() > 1) {
                n6 += 2 + (list.size() - 1) * 10;
            }
            if (n5 + n4 > this.IlIlIIlllIIlIllIIIlllllIl) {
                n5 -= 28 + n4;
            }
            if (n3 + n6 + 6 > this.lIIlIIIIIlIlllIlIIlIlIlll) {
                n3 = this.lIIlIIIIIlIlllIlIIlIlIlll - n6 - 6;
            }
            IlIlllIIIIIIlIIllIIllIlll = 300.0f;
            class_0229.IlIlIIlIlIllIIlIlIIllIIIl.lIllllIIlIIIlIllllllIIIll = 300.0f;
            int n7 = -267386864;
            class_0229.lllIIIllIIIIlllIlIIllIIll((float)(n5 - 3), (float)(n3 - 4), (float)(n5 + n4 + 3), (float)(n3 - 3), n7, n7);
            class_0229.lllIIIllIIIIlllIlIIllIIll((float)(n5 - 3), (float)(n3 + n6 + 3), (float)(n5 + n4 + 3), (float)(n3 + n6 + 4), n7, n7);
            class_0229.lllIIIllIIIIlllIlIIllIIll((float)(n5 - 3), (float)(n3 - 3), (float)(n5 + n4 + 3), (float)(n3 + n6 + 3), n7, n7);
            class_0229.lllIIIllIIIIlllIlIIllIIll((float)(n5 - 4), (float)(n3 - 3), (float)(n5 - 3), (float)(n3 + n6 + 3), n7, n7);
            class_0229.lllIIIllIIIIlllIlIIllIIll((float)(n5 + n4 + 3), (float)(n3 - 3), (float)(n5 + n4 + 4), (float)(n3 + n6 + 3), n7, n7);
            int n8 = 0x505000FF;
            int n9 = (n8 & 0xFEFEFE) >> 1 | n8 & 0xFF000000;
            class_0229.lllIIIllIIIIlllIlIIllIIll((float)(n5 - 3), (float)(n3 - 3 + 1), (float)(n5 - 3 + 1), (float)(n3 + n6 + 3 - 1), n8, n9);
            class_0229.lllIIIllIIIIlllIlIIllIIll((float)(n5 + n4 + 2), (float)(n3 - 3 + 1), (float)(n5 + n4 + 3), (float)(n3 + n6 + 3 - 1), n8, n9);
            class_0229.lllIIIllIIIIlllIlIIllIIll((float)(n5 - 3), (float)(n3 - 3), (float)(n5 + n4 + 3), (float)(n3 - 3 + 1), n8, n8);
            class_0229.lllIIIllIIIIlllIlIIllIIll((float)(n5 - 3), (float)(n3 + n6 + 2), (float)(n5 + n4 + 3), (float)(n3 + n6 + 3), n9, n9);
            for (int i = 0; i < list.size(); ++i) {
                String string = (String)list.get(i);
                this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(string, (float)n5, (float)n3, -1);
                if (i == 0) {
                    n3 += 2;
                }
                n3 += 10;
            }
            IlIlllIIIIIIlIIllIIllIlll = 0.0f;
            class_0229.IlIlIIlIlIllIIlIlIIllIIIl.lIllllIIlIIIlIllllllIIIll = 0.0f;
            GL11.glEnable((int)2896);
            GL11.glEnable((int)2929);
            class_0624.lllIlIIlIIIlIlIIIllIlllIl();
            GL11.glEnable((int)32826);
        }
    }

    protected void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        if (n3 == 0) {
            for (int i = 0; i < this.lIlIlIIlIIIIlIIIIIlllIIII.size(); ++i) {
                class_1197 class_11972 = (class_1197)this.lIlIlIIlIIIIlIIIIIlllIIII.get(i);
                if (!class_11972.IlIllllllIIlIIllllIIlIIIl(this.lllllIlllIIllIlIIlIIIllII, n, n2)) continue;
                this.lllIIIllIIIIlllIlIIllIIll = class_11972;
                class_11972.lllIIIllIIIIlllIlIIllIIll(this.lllllIlllIIllIlIIlIIIllII.IllIIIlllllIlIlllIlllllII());
                this.lllIIIllIIIIlllIlIIllIIll(class_11972);
            }
        }
    }

    protected void lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, int n3) {
        if (this.lllIIIllIIIIlllIlIIllIIll != null && n3 == 0) {
            this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(n, n2);
            this.lllIIIllIIIIlllIlIIllIIll = null;
        }
    }

    protected void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, long l) {
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_1197 class_11972) {
    }

    public void lllIIIllIIIIlllIlIIllIIll(Minecraft class_06672, int n, int n2) {
        this.lllllIlllIIllIlIIlIIIllII = class_06672;
        this.lIlIllIIlIIlIIlIIlIIlIIll = class_06672.IlIlllIIIIIIlIIllIIllIlll;
        this.IlIlIIlllIIlIllIIIlllllIl = n;
        this.lIIlIIIIIlIlllIlIIlIlIlll = n2;
        this.lIlIlIIlIIIIlIIIIIlllIIII.clear();
        this.n_();
        this.lIlIlIIlIIIIlIIIIIlllIIII();
    }

    public void n_() {
    }

    public void lIlIlIIlIIIIlIIIIIlllIIII() {
        if (((Boolean) LunarClient.getInstance().getSettingsManager().gsGuiBlur.getValue()).booleanValue() && !(this instanceof class_1522) && this.lllllIlllIIllIlIIlIIIllII.theWorld != null && this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII != null) {
            this.lllllIlllIIllIlIIlIIIllII.lIIlIIIIIlIlllIlIIlIlIlll.IlIIIIIllllllIIlllIllllll();
        }
        if (this.lllllIlllIIllIlIIlIIIllII.llIlllIIllIlllIlIlIlIIIll == null) {
            llIIlIllIllllIlIIIIlIIlll.lllIlIIlIIIlIlIIIllIlllIl();
            llIllllIlIllIIIlIllIIlIlI.lllIlIIlIIIlIlIIIllIlllIl();
        }
    }

    public void IlIIIlIIIIllIIIllIIIIIIll() {
        if (Mouse.isCreated()) {
            while (Mouse.next()) {
                this.a_();
            }
        }
        if (Keyboard.isCreated()) {
            while (Keyboard.next()) {
                this.IIlllIlIlllIllIIIlllIIlIl();
            }
        }
    }

    public void a_() {
        int n = Mouse.getEventX() * this.IlIlIIlllIIlIllIIIlllllIl / this.lllllIlllIIllIlIIlIIIllII.displayWidth;
        int n2 = this.lIIlIIIIIlIlllIlIIlIlIlll - Mouse.getEventY() * this.lIIlIIIIIlIlllIlIIlIlIlll / this.lllllIlllIIllIlIIlIIIllII.displayHeight - 1;
        int n3 = Mouse.getEventButton();
        if (Mouse.getEventButtonState()) {
            if (this.lllllIlllIIllIlIIlIIIllII.gameSettings.IllIlIlIIIlIllIlIlIIlllII && this.lIlllIlllIIIIlIIlllIllIII++ > 0) {
                return;
            }
            this.lllIlIIlIIIlIlIIIllIlllIl = n3;
            this.IlIllllllIIlIIllllIIlIIIl = Minecraft.getSystemTime();
            this.lllIIIllIIIIlllIlIIllIIll(n, n2, this.lllIlIIlIIIlIlIIIllIlllIl);
        } else if (n3 != -1) {
            if (this.lllllIlllIIllIlIIlIIIllII.gameSettings.IllIlIlIIIlIllIlIlIIlllII && --this.lIlllIlllIIIIlIIlllIllIII > 0) {
                return;
            }
            this.lllIlIIlIIIlIlIIIllIlllIl = -1;
            this.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3);
        } else if (this.lllIlIIlIIIlIlIIIllIlllIl != -1 && this.IlIllllllIIlIIllllIIlIIIl > 0L) {
            long l = Minecraft.getSystemTime() - this.IlIllllllIIlIIllllIIlIIIl;
            this.lllIIIllIIIIlllIlIIllIIll(n, n2, this.lllIlIIlIIIlIlIIIllIlllIl, l);
        }
    }

    public void IIlllIlIlllIllIIIlllIIlIl() {
        if (Keyboard.getEventKeyState()) {
            this.lllIIIllIIIIlllIlIIllIIll(Keyboard.getEventCharacter(), Keyboard.getEventKey());
        }
        this.lllllIlllIIllIlIIlIIIllII.IlIllllllIIlIIllllIIlIIIl();
    }

    public void IlIllllllIIlIIllllIIlIIIl() {
    }

    public void o_() {
    }

    public void lIlIllIIlIIlIIlIIlIIlIIll() {
        if (((Boolean) LunarClient.getInstance().getSettingsManager().gsGuiBlur.getValue()).booleanValue() && !(this instanceof class_1522)) {
            try {
                if (this.lllllIlllIIllIlIIlIIIllII.lIIlIIIIIlIlllIlIIlIlIlll.lllIIIllIIIIlllIlIIllIIll()) {
                    class_1711 class_17112 = Minecraft.getMinecraft().lIIlIIIIIlIlllIlIIlIlIlll.IllIIlllllllIIlIIlIIIIlIl();
                    for (class_1649 class_16492 : class_17112.IlIllllllIIlIIllllIIlIIIl()) {
                        class_0900 class_09002 = class_16492.lllIlIIlIIIlIlIIIllIlllIl().lllIlIIlIIIlIlIIIllIlllIl("Progress");
                        if (class_09002 == null) continue;
                        class_09002.lllIIIllIIIIlllIlIIllIIll(llIIlIllIllllIlIIIIlIIlll.IllIIlllllllIIlIIlIIIIlIl());
                    }
                }
                GL11.glEnable((int)2929);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                Throwables.propagate((Throwable)illegalArgumentException);
            }
        }
    }

    public void llIIlIllIllllIlIIIIlIIlll() {
        this.lIlIllIIlIIlIIlIIlIIlIIll();
        class_0229.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, (float)this.IlIlIIlllIIlIllIIIlllllIl, (float)this.lIIlIIIIIlIlllIlIIlIlIlll, llIIlIllIllllIlIIIIlIIlll.lllIlIIlIIIlIlIIIllIlllIl(true).getRGB(), llIllllIlIllIIIlIllIIlIlI.lllIlIIlIIIlIlIIIllIlllIl(true).getRGB());
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(float f, float f2) {
        class_1711 class_17112 = Minecraft.getMinecraft().lIIlIIIIIlIlllIlIIlIlIlll.IllIIlllllllIIlIIlIIIIlIl();
        try {
            if (this.lllllIlllIIllIlIIlIIIllII.lIIlIIIIIlIlllIlIIlIlIlll.lllIIIllIIIIlllIlIIllIIll()) {
                for (class_1649 class_16492 : class_17112.IlIllllllIIlIIllllIIlIIIl()) {
                    class_0900 class_09002 = class_16492.lllIlIIlIIIlIlIIIllIlllIl().lllIlIIlIIIlIlIIIllIlllIl("Progress");
                    if (class_09002 == null) continue;
                    class_09002.lllIIIllIIIIlllIlIIllIIll(0.5f);
                }
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            Throwables.propagate((Throwable)illegalArgumentException);
        }
        class_0229.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, f, f2, llIIlIllIllllIlIIIIlIIlll.lllIlIIlIIIlIlIIIllIlllIl(true).getRGB(), llIllllIlIllIIIlIllIIlIlI.lllIlIIlIIIlIlIIIllIlllIl(true).getRGB());
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(int n) {
        if (this.lllllIlllIIllIlIIlIIIllII.theWorld != null) {
            class_0229.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, (float)this.IlIlIIlllIIlIllIIIlllllIl, (float)this.lIIlIIIIIlIlllIlIIlIlIlll, -1072689136, -804253680);
        } else {
            this.IlIllllllIIlIIllllIIlIIIl(n);
        }
    }

    public void IlIllllllIIlIIllllIIlIIIl(int n) {
        GL11.glDisable((int)2896);
        GL11.glDisable((int)2912);
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        this.lllllIlllIIllIlIIlIIIllII.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(llIIlllIllIllllIIIlIIIIII);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        float f = 32.0f;
        class_08682.lllIlIIlIIIlIlIIIllIlllIl();
        class_08682.IlIllllllIIlIIllllIIlIIIl(0x404040);
        class_08682.lllIIIllIIIIlllIlIIllIIll(0.0, this.lIIlIIIIIlIlllIlIIlIlIlll, 0.0, 0.0, (float)this.lIIlIIIIIlIlllIlIIlIlIlll / f + (float)n);
        class_08682.lllIIIllIIIIlllIlIIllIIll(this.IlIlIIlllIIlIllIIIlllllIl, this.lIIlIIIIIlIlllIlIIlIlIlll, 0.0, (float)this.IlIlIIlllIIlIllIIIlllllIl / f, (float)this.lIIlIIIIIlIlllIlIIlIlIlll / f + (float)n);
        class_08682.lllIIIllIIIIlllIlIIllIIll(this.IlIlIIlllIIlIllIIIlllllIl, 0.0, 0.0, (float)this.IlIlIIlllIIlIllIIIlllllIl / f, n);
        class_08682.lllIIIllIIIIlllIlIIllIIll(0.0, 0.0, 0.0, 0.0, n);
        class_08682.lllIIIllIIIIlllIlIIllIIll();
    }

    public boolean lIlllIlllIIIIlIIlllIllIII() {
        return true;
    }

    public void lllIIIllIIIIlllIlIIllIIll(boolean bl, int n) {
    }

    public static boolean llIllllIlIllIIIlIllIIlIlI() {
        return Minecraft.lllIIIllIIIIlllIlIIllIIll ? Keyboard.isKeyDown((int)219) || Keyboard.isKeyDown((int)220) : Keyboard.isKeyDown((int)29) || Keyboard.isKeyDown((int)157);
    }

    public static boolean lIlllIlllIlIIIIlllIlIlIIl() {
        return Keyboard.isKeyDown((int)42) || Keyboard.isKeyDown((int)54);
    }
}

