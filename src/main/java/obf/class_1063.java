package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.GL11
 */
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.moonsworth.lunar.client.LunarClient;
import net.minecraft.client.Minecraft;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.MathHelper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public class class_1063
extends class_0210 {
    private static final Logger lllIIIllIIIIlllIlIIllIIll = LogManager.getLogger();
    private final Minecraft lllIlIIlIIIlIlIIIllIlllIl;
    private final List IlIllllllIIlIIllllIIlIIIl = new ArrayList();
    private final List lIlllIlllIIIIlIIlllIllIII = new ArrayList();
    private final List IlIIIIIllllllIIlllIllllll = new ArrayList();
    private int lIllllIIlIIIlIllllllIIIll;
    private boolean IIIllIIlIIIIIIlIlIIllIIlI;

    public class_1063(Minecraft class_06672) {
        this.lllIlIIlIIIlIlIIIllIlllIl = class_06672;
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n) {
        if (this.lllIlIIlIIIlIlIIIllIlllIl.gameSettings.IIIIIIlIIIIIIIIIIlIlIlIlI != class_1210.lllIlIIlIIIlIlIIIllIlllIl) {
            Minecraft class_06672 = Minecraft.getMinecraft();
            class_0321 class_03212 = new class_0321(class_06672, class_06672.displayWidth, class_06672.displayHeight);
            int n2 = class_03212.lllIIIllIIIIlllIlIIllIIll();
            int n3 = class_03212.lllIlIIlIIIlIlIIIllIlllIl();
            class_0229 class_02292 = Minecraft.getMinecraft().lllllIlllIIllIlIIlIIIllII;
            if (class_02292 instanceof class_0822 && ((class_0822)class_02292).lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(Mouse.getX() * n2 / class_06672.displayWidth, n3 - Mouse.getY() * n3 / class_06672.displayHeight - 1)) {
                return;
            }
            int n4 = this.IIIllIllIIlIlIlIlIllllIIl();
            boolean bl = false;
            int n5 = 0;
            int n6 = this.IlIIIIIllllllIIlllIllllll.size();
            float f = this.lllIlIIlIIIlIlIIIllIlllIl.gameSettings.llllIIIlIlIlIlIIlIIIIIlIl * 0.9f + 0.1f;
            if (n6 > 0) {
                int n7;
                int n8;
                int n9;
                int n10;
                class_1550 class_15502;
                int n11;
                int n12;
                if (this.IlIIIIIllllllIIlllIllllll()) {
                    bl = true;
                }
                float f2 = this.IllIIlllllllIIlIIlIIIIlIl();
                int n13 = MathHelper.lIllllIIlIIIlIllllllIIIll((float)this.lIllllIIlIIIlIllllllIIIll() / f2);
                GL11.glPushMatrix();
                GL11.glTranslatef((float)2.0f, (float)20.0f, (float)0.0f);
                GL11.glScalef((float)f2, (float)f2, (float)1.0f);
                if (Minecraft.getMinecraft().lllllIlllIIllIlIIlIIIllII instanceof class_1056 || ((Boolean) LunarClient.getInstance().getSettingsManager().IIIIIIIIlIllIIllIIlllIllI.lIlllIlllIIIIlIIlllIllIII()).booleanValue()) {
                    n12 = 0;
                    for (n11 = 0; n11 + this.lIllllIIlIIIlIllllllIIIll < this.IlIIIIIllllllIIlllIllllll.size() && n11 < n4; ++n11) {
                        class_15502 = (class_1550)this.IlIIIIIllllllIIlllIllllll.get(n11 + this.lIllllIIlIIIlIllllllIIIll);
                        if (!bl && !(10.0 - (double)(n - class_15502.lllIlIIlIIIlIlIIIllIlllIl()) / 20.0 > 1.0)) continue;
                        n12 -= this.lllIlIIlIIIlIlIIIllIlllIl.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll;
                    }
                    class_1063.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, n13 + 4, n12, 0x7F000000);
                }
                n12 = 0;
                for (n11 = 0; n11 + this.lIllllIIlIIIlIllllllIIIll < this.IlIIIIIllllllIIlllIllllll.size() && n11 < n4; ++n11) {
                    class_15502 = (class_1550)this.IlIIIIIllllllIIlllIllllll.get(n11 + this.lIllllIIlIIIlIllllllIIIll);
                    if (!bl && !(10.0 - (double)(n - class_15502.lllIlIIlIIIlIlIIIllIlllIl()) / 20.0 > 1.0)) continue;
                    n12 -= this.lllIlIIlIIIlIlIIIllIlllIl.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll;
                }
                for (n10 = 0; n10 + this.lIllllIIlIIIlIllllllIIIll < this.IlIIIIIllllllIIlllIllllll.size() && n10 < n4; ++n10) {
                    class_1550 class_15503 = (class_1550)this.IlIIIIIllllllIIlllIllllll.get(n10 + this.lIllllIIlIIIlIllllllIIIll);
                    if (class_15503 == null || (n9 = n - class_15503.lllIlIIlIIIlIlIIIllIlllIl()) >= 200 && !bl) continue;
                    double d = (double)n9 / 200.0;
                    d = 1.0 - d;
                    if ((d *= 10.0) < 0.0) {
                        d = 0.0;
                    }
                    if (d > 1.0) {
                        d = 1.0;
                    }
                    d *= d;
                    n8 = (int)(255.0 * d);
                    if (bl) {
                        n8 = 255;
                    }
                    n8 = (int)((float)n8 * f);
                    ++n5;
                    if (n8 <= 3) continue;
                    n7 = 0;
                    int n14 = -n10 * 9;
                    if ((Minecraft.getMinecraft().lllllIlllIIllIlIIlIIIllII instanceof class_1056 || ((Boolean) LunarClient.getInstance().getSettingsManager().IIIIIIIIlIllIIllIIlllIllI.lIlllIlllIIIIlIIlllIllIII()).booleanValue()) && n8 < 255) {
                        class_1063.lllIIIllIIIIlllIlIIllIIll(n7, n14 - 9, n7 + n13 + 4, n14, n8 / 2 << 24);
                    }
                    String string = class_15503.lllIIIllIIIIlllIlIIllIIll().lIlllIlllIIIIlIIlllIllIII();
                    if (n8 < 255) {
                        GL11.glEnable((int)3042);
                    }
                    this.lllIlIIlIIIlIlIIIllIlllIl.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(string, (float)(n7 + 1), (float)(n14 - 8), 0xFFFFFF + (n8 << 24));
                    GL11.glDisable((int)3008);
                }
                if (bl) {
                    n10 = this.lllIlIIlIIIlIlIIIllIlllIl.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll;
                    GL11.glTranslatef((float)-3.0f, (float)0.0f, (float)0.0f);
                    n11 = n6 * n10 + n6;
                    n9 = n5 * n10 + n5;
                    int n15 = this.lIllllIIlIIIlIllllllIIIll * n9 / n6;
                    int n16 = n9 * n9 / n11;
                    if (n11 != n9) {
                        n8 = n15 > 0 ? 170 : 96;
                        n7 = this.IIIllIIlIIIIIIlIlIIllIIlI ? 0xCC3333 : 0x3333AA;
                        class_1063.lllIIIllIIIIlllIlIIllIIll(0.0f, -n15, 2.0f, -n15 - n16, n7 + (n8 << 24));
                        class_1063.lllIIIllIIIIlllIlIIllIIll(2.0f, -n15, 1.0f, -n15 - n16, 0xCCCCCC + (n8 << 24));
                    }
                }
                GL11.glPopMatrix();
            }
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll() {
        this.IlIIIIIllllllIIlllIllllll.clear();
        this.lIlllIlllIIIIlIIlllIllIII.clear();
        this.IlIllllllIIlIIllllIIlIIIl.clear();
    }

    public void lllIIIllIIIIlllIlIIllIIll(IChatComponent class_22552) {
        this.lllIIIllIIIIlllIlIIllIIll(class_22552, 0);
    }

    public void lllIIIllIIIIlllIlIIllIIll(IChatComponent class_22552, int n) {
        this.lllIIIllIIIIlllIlIIllIIll(class_22552, n, this.lllIlIIlIIIlIlIIIllIlllIl.IlIIIlIIIIllIIIllIIIIIIll.IlIllllllIIlIIllllIIlIIIl(), false);
        System.out.println("[CHAT] " + class_22552.IlIllllllIIlIIllllIIlIIIl());
    }

    private String lllIlIIlIIIlIlIIIllIlllIl(String string) {
        return Minecraft.getMinecraft().gameSettings.IllIlllIIIlllllIllIIlIlIl ? string : class_1227.lllIIIllIIIIlllIlIIllIIll(string);
    }

    private void lllIIIllIIIIlllIlIIllIIll(IChatComponent class_22552, int n, int n2, boolean bl) {
        Object object;
        int n3;
        if (n != 0) {
            this.IlIllllllIIlIIllllIIlIIIl(n);
        }
        int n4 = MathHelper.lIlllIlllIIIIlIIlllIllIII((float)this.lIllllIIlIIIlIllllllIIIll() / this.IllIIlllllllIIlIIlIIIIlIl());
        int n5 = 0;
        class_0722 class_07222 = new class_0722("");
        if (class_22552 instanceof class_0722 && ((class_0722)class_22552).IllIIlllllllIIlIIlIIIIlIl()) {
            class_07222.lllIIIllIIIIlllIlIIllIIll(true);
        }
        ArrayList arrayList = Lists.newArrayList();
        ArrayList arrayList2 = Lists.newArrayList((Iterable)class_22552);
        for (n3 = 0; n3 < arrayList2.size(); ++n3) {
            IChatComponent class_22553 = (IChatComponent)arrayList2.get(n3);
            object = this.lllIlIIlIIIlIlIIIllIlllIl(class_22553.lllIlIIlIIIlIlIIIllIlllIl().IllIIIllIIIIlIlIlIllIIlll() + class_22553.lIllllIIlIIIlIllllllIIIll());
            int n6 = this.lllIlIIlIIIlIlIIIllIlllIl.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll((String)object);
            class_0722 class_07223 = new class_0722((String)object);
            class_07223.lllIIIllIIIIlllIlIIllIIll(class_22553.lllIlIIlIIIlIlIIIllIlllIl().lIIIIlIlIIlllllIIllIIlIII());
            boolean bl2 = false;
            boolean bl3 = false;
            if (n5 + n6 > n4) {
                String string = this.lllIlIIlIIIlIlIIIllIlllIl.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll((String)object, n4 - n5, false);
                String string2 = string.length() < ((String)object).length() ? ((String)object).substring(string.length()) : null;
                boolean bl4 = bl3 = class_1227.lllIIIllIIIIlllIlIIllIIll(string).matches("^[-]+$") && class_1227.lllIIIllIIIIlllIlIIllIIll(string2).matches("^[-]+$");
                if (!bl3 && string2 != null && string2.length() > 0) {
                    int n7 = string.lastIndexOf(" ");
                    if (n7 >= 0 && this.lllIlIIlIIIlIlIIIllIlllIl.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(((String)object).substring(0, n7)) > 0) {
                        string = ((String)object).substring(0, n7);
                        string2 = ((String)object).substring(n7);
                    }
                    class_0722 class_07224 = new class_0722(string2);
                    class_07224.lllIIIllIIIIlllIlIIllIIll(class_22553.lllIlIIlIIIlIlIIIllIlllIl().lIIIIlIlIIlllllIIllIIlIII());
                    arrayList2.add(n3 + 1, class_07224);
                }
                n6 = this.lllIlIIlIIIlIlIIIllIlllIl.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(string);
                class_07223 = new class_0722(string);
                class_07223.lllIIIllIIIIlllIlIIllIIll(class_22553.lllIlIIlIIIlIlIIIllIlllIl().lIIIIlIlIIlllllIIllIIlIII());
                boolean bl5 = bl2 = !bl3;
            }
            if (n5 + n6 <= n4) {
                n5 += n6;
                class_07222.lllIIIllIIIIlllIlIIllIIll(class_07223);
            } else {
                bl2 = true;
            }
            if (!bl2) continue;
            arrayList.add(class_07222);
            n5 = 0;
            class_07222 = new class_0722("");
        }
        arrayList.add(class_07222);
        n3 = this.IlIIIIIllllllIIlllIllllll() ? 1 : 0;
        object = null;
        for (IChatComponent class_22553 : arrayList) {
            if (class_22553 instanceof class_0722 && ((class_0722)class_22553).IllIIlllllllIIlIIlIIIIlIl() && object != null) {
                ((class_1550)object).lllIIIllIIIIlllIlIIllIIll(true);
            }
            if (n3 != 0 && this.lIllllIIlIIIlIllllllIIIll > 0) {
                this.IIIllIIlIIIIIIlIlIIllIIlI = true;
                this.lllIlIIlIIIlIlIIIllIlllIl(1);
            }
            object = new class_1550(n2, class_22553, n);
            this.IlIIIIIllllllIIlllIllllll.add(0, object);
        }
        while (this.IlIIIIIllllllIIlllIllllll.size() > 100) {
            this.IlIIIIIllllllIIlllIllllll.remove(this.IlIIIIIllllllIIlllIllllll.size() - 1);
        }
        if (!bl) {
            this.lIlllIlllIIIIlIIlllIllIII.add(0, new class_1550(n2, class_22552, n));
            while (this.lIlllIlllIIIIlIIlllIllIII.size() > 100) {
                this.lIlllIlllIIIIlIIlllIllIII.remove(this.lIlllIlllIIIIlIIlllIllIII.size() - 1);
            }
        }
    }

    public void lllIlIIlIIIlIlIIIllIlllIl() {
        this.IlIIIIIllllllIIlllIllllll.clear();
        this.lIlllIlllIIIIlIIlllIllIII();
        for (int i = this.lIlllIlllIIIIlIIlllIllIII.size() - 1; i >= 0; --i) {
            class_1550 class_15502 = (class_1550)this.lIlllIlllIIIIlIIlllIllIII.get(i);
            this.lllIIIllIIIIlllIlIIllIIll(class_15502.lllIIIllIIIIlllIlIIllIIll(), class_15502.IlIllllllIIlIIllllIIlIIIl(), class_15502.lllIlIIlIIIlIlIIIllIlllIl(), true);
        }
    }

    public List IlIllllllIIlIIllllIIlIIIl() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public void lllIIIllIIIIlllIlIIllIIll(String string) {
        if (this.IlIllllllIIlIIllllIIlIIIl.isEmpty() || !((String)this.IlIllllllIIlIIllllIIlIIIl.get(this.IlIllllllIIlIIllllIIlIIIl.size() - 1)).equals(string)) {
            this.IlIllllllIIlIIllllIIlIIIl.add(string);
        }
    }

    public void lIlllIlllIIIIlIIlllIllIII() {
        this.lIllllIIlIIIlIllllllIIIll = 0;
        this.IIIllIIlIIIIIIlIlIIllIIlI = false;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(int n) {
        this.lIllllIIlIIIlIllllllIIIll += n;
        int n2 = this.IlIIIIIllllllIIlllIllllll.size();
        if (this.lIllllIIlIIIlIllllllIIIll > n2 - this.IIIllIllIIlIlIlIlIllllIIl()) {
            this.lIllllIIlIIIlIllllllIIIll = n2 - this.IIIllIllIIlIlIlIlIllllIIl();
        }
        if (this.lIllllIIlIIIlIllllllIIIll <= 0) {
            this.lIllllIIlIIIlIllllllIIIll = 0;
            this.IIIllIIlIIIIIIlIlIIllIIlI = false;
        }
    }

    public IChatComponent lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        if (!this.IlIIIIIllllllIIlllIllllll()) {
            return null;
        }
        class_0321 class_03212 = new class_0321(this.lllIlIIlIIIlIlIIIllIlllIl, this.lllIlIIlIIIlIlIIIllIlllIl.displayWidth, this.lllIlIIlIIIlIlIIIllIlllIl.displayHeight);
        int n3 = class_03212.IlIIIIIllllllIIlllIllllll();
        float f = this.IllIIlllllllIIlIIlIIIIlIl();
        int n4 = n / n3 - 3;
        int n5 = n2 / n3 - 27;
        n4 = MathHelper.lIlllIlllIIIIlIIlllIllIII((float)n4 / f);
        n5 = MathHelper.lIlllIlllIIIIlIIlllIllIII((float)n5 / f);
        if (n4 >= 0 && n5 >= 0) {
            int n6 = Math.min(this.IIIllIllIIlIlIlIlIllllIIl(), this.IlIIIIIllllllIIlllIllllll.size());
            if (n4 <= MathHelper.lIlllIlllIIIIlIIlllIllIII((float)this.lIllllIIlIIIlIllllllIIIll() / this.IllIIlllllllIIlIIlIIIIlIl()) && n5 < this.lllIlIIlIIIlIlIIIllIlllIl.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll * n6 + n6) {
                int n7 = n5 / this.lllIlIIlIIIlIlIIIllIlllIl.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll + this.lIllllIIlIIIlIllllllIIIll;
                if (n7 >= 0 && n7 < this.IlIIIIIllllllIIlllIllllll.size()) {
                    class_1550 class_15502 = (class_1550)this.IlIIIIIllllllIIlllIllllll.get(n7);
                    int n8 = 0;
                    for (IChatComponent class_22552 : class_15502.lllIIIllIIIIlllIlIIllIIll()) {
                        if (!(class_22552 instanceof class_0722) || (n8 += this.lllIlIIlIIIlIlIIIllIlllIl.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl(((class_0722)class_22552).IlIIIIIllllllIIlllIllllll()))) <= n4) continue;
                        return class_22552;
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public boolean IlIIIIIllllllIIlllIllllll() {
        return this.lllIlIIlIIIlIlIIIllIlllIl.lllllIlllIIllIlIIlIIIllII instanceof class_1056;
    }

    public void IlIllllllIIlIIllllIIlIIIl(int n) {
        class_1550 class_15502;
        Iterator iterator = this.IlIIIIIllllllIIlllIllllll.iterator();
        while (iterator.hasNext()) {
            class_15502 = (class_1550)iterator.next();
            if (class_15502.IlIllllllIIlIIllllIIlIIIl() != n) continue;
            iterator.remove();
        }
        iterator = this.lIlllIlllIIIIlIIlllIllIII.iterator();
        while (iterator.hasNext()) {
            class_15502 = (class_1550)iterator.next();
            if (class_15502.IlIllllllIIlIIllllIIlIIIl() != n) continue;
            iterator.remove();
            break;
        }
    }

    public int lIllllIIlIIIlIllllllIIIll() {
        return class_1063.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl.gameSettings.IIIIlIIIllIIIlIIlIIIIIlll);
    }

    public int IIIllIIlIIIIIIlIlIIllIIlI() {
        return class_1063.lllIlIIlIIIlIlIIIllIlllIl(this.IlIIIIIllllllIIlllIllllll() ? this.lllIlIIlIIIlIlIIIllIlllIl.gameSettings.lIIIlllIlIIIlIllIIIlIllll : this.lllIlIIlIIIlIlIIIllIlllIl.gameSettings.lIIIIIlIllIllIlIlIIllllll);
    }

    public float IllIIlllllllIIlIIlIIIIlIl() {
        return this.lllIlIIlIIIlIlIIIllIlllIl.gameSettings.IIIlIIllIIlIlIIlIIllIIIIl;
    }

    public static int lllIIIllIIIIlllIlIIllIIll(float f) {
        int n = 320;
        int n2 = 40;
        return MathHelper.lIlllIlllIIIIlIIlllIllIII(f * (float)(n - n2) + (float)n2);
    }

    public static int lllIlIIlIIIlIlIIIllIlllIl(float f) {
        int n = 180;
        int n2 = 20;
        return MathHelper.lIlllIlllIIIIlIIlllIllIII(f * (float)(n - n2) + (float)n2);
    }

    public int IIIllIllIIlIlIlIlIllllIIl() {
        return this.IIIllIIlIIIIIIlIlIIllIIlI() / 9;
    }
}

