package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  org.lwjgl.opengl.GL11
 */
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.moonsworth.lunar.client.LunarClient;
import org.lwjgl.opengl.GL11;

public class class_0679
extends class_2043 {
    private final class_0869 IllIIlllllllIIlIIlIIIIlIl;
    private final class_0869 IIIllIllIIlIlIlIlIllllIIl;
    private final class_0806 IllIIIllIIIIlIlIlIllIIlll;
    private final class_0806 lIIIIlIlIIlllllIIllIIlIII;
    private final class_1326 llIIlllIllIllllIIIlIIIIII;
    private List llIIllIllIlIIlIIllIllllll = new ArrayList();

    public class_0679(List list) {
        super(list);
        this.IllIIlllllllIIlIIlIIIIlIl = new class_0869(LunarClient.getInstance().robotoMedium13px, "Filter", 0x2FFFFFFF, 0x6FFFFFFF);
        this.IIIllIllIIlIlIlIlIllllIIl = new class_0869(LunarClient.getInstance().robotoMedium13px, "Username", 0x2FFFFFFF, 0x6FFFFFFF);
        this.IllIIIllIIIIlIlIlIllIIlll = new class_0806("ADD");
        this.lIIIIlIlIIlllllIIllIIlIII = new class_0806("");
        this.llIIlllIllIllllIIIlIIIIII = new class_1326(this);
    }

    public void IIIllIllIIlIlIlIlIllllIIl() {
        this.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(float f, float f2, float f3, float f4) {
        super.lllIIIllIIIIlllIlIIllIIll(f, f2, f3, f4);
        this.llIIlllIllIllllIIIlIIIIII.lllIIIllIIIIlllIlIIllIIll(f + f3 - 4.0f, f2, 4.0f, f4);
        int n = 22;
        int n2 = 0;
        for (class_0825 class_08252 : this.IIIllIIlIIIIIIlIlIIllIIlI) {
            if (!this.lllIIIllIIIIlllIlIIllIIll(class_08252)) continue;
            class_08252.lllIIIllIIIIlllIlIIllIIll(f, f2 + 14.0f + (float)(n2 * 22), f3, 22.0f);
            ++n2;
        }
        float f5 = 14 + this.IIIllIIlIIIIIIlIlIIllIIlI.size() * 22 + 30;
        if (f5 < f4) {
            f5 = f4;
        }
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(0.0f, f2, f3, 13.0f);
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(0.0f, f2 + f5 - 13.0f, f3 - 35.0f, 13.0f);
        this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(f3 - 35.0f, f2 + f5 - 13.0f, 35.0f, 13.0f);
        this.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(0.0f, f2 + f5 - 26.0f, f3, 13.0f);
        this.llIIlllIllIllllIIIlIIIIII.IlIIIIIllllllIIlllIllllll(f5);
    }

    private boolean lllIIIllIIIIlllIlIIllIIll(class_0825 class_08252) {
        return this.IllIIlllllllIIlIIlIIIIlIl.IIIllIllIIlIlIlIlIllllIIl().equals("") || class_1227.lllIIIllIIIIlllIlIIllIIll(class_08252.IllIIlllllllIIlIIlIIIIlIl().lllIIIllIIIIlllIlIIllIIll()).toLowerCase().startsWith(this.IllIIlllllllIIlIIlIIIIlIl.IIIllIllIIlIlIlIlIllllIIl().toLowerCase());
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(float f, float f2, boolean bl) {
        if (!this.llIIllIllIlIIlIIllIllllll.isEmpty()) {
            this.IIIllIIlIIIIIIlIlIIllIIlI.removeAll(this.llIIllIllIlIIlIIllIllllll);
            class_0713.IlIlllIIIIIIlIIllIIllIlll().lllllIlllIIllIlIIlIIIllII().IIIllIllIIlIlIlIlIllllIIl();
            this.llIIllIllIlIIlIIllIllllll.clear();
        }
        if (!LunarClient.getInstance().getWebsocket().isOpen()) {
            LunarClient.getInstance().robotoLight18px.lllIlIIlIIIlIlIIIllIlllIl("Connection lost", this.lllIIIllIIIIlllIlIIllIIll + this.IlIllllllIIlIIllllIIlIIIl / 2.0f, this.lllIlIIlIIIlIlIIIllIlllIl + 10.0f, -1);
            LunarClient.getInstance().robotoMedium13px.lllIlIIlIIIlIlIIIllIlllIl("Please try again later.", this.lllIIIllIIIIlllIlIIllIIll + this.IlIllllllIIlIIllllIIlIIIl / 2.0f, this.lllIlIIlIIIlIlIIIllIlllIl + 22.0f, -1);
        } else {
            GL11.glPushMatrix();
            GL11.glEnable((int)3089);
            class_0713 class_07132 = class_0713.IlIlllIIIIIIlIIllIIllIlll();
            this.llIIlllIllIllllIIIlIIIIII.IlIllllllIIlIIllllIIlIIIl(f, f2, bl);
            class_0857.lllIIIllIIIIlllIlIIllIIll((int)this.lllIIIllIIIIlllIlIIllIIll, (int)this.lllIlIIlIIIlIlIIIllIlllIl, (int)(this.lllIIIllIIIIlllIlIIllIIll + this.IlIllllllIIlIIllllIIlIIIl), (int)(this.lllIlIIlIIIlIlIIIllIlllIl + this.lIlllIlllIIIIlIIlllIllIII), (float)((int)((float)class_07132.llIIlllIllIllllIIIlIIIIII().IlIIIIIllllllIIlllIllllll() * class_07132.IlIIIIIllllllIIlllIllllll())), (int)class_07132.IIIllIIlIIIIIIlIlIIllIIlI());
            ImmutableList immutableList = ImmutableList.copyOf((Collection)this.IIIllIIlIIIIIIlIlIIllIIlI);
            for (class_0825 class_08252 : immutableList) {
                if (!this.lllIIIllIIIIlllIlIIllIIll(class_08252)) continue;
                class_08252.lllIlIIlIIIlIlIIIllIlllIl(f, f2 - this.llIIlllIllIllllIIIlIIIIII.IllIIlllllllIIlIIlIIIIlIl(), bl);
            }
            if (immutableList.isEmpty()) {
                LunarClient.getInstance().robotoLight18px.lllIlIIlIIIlIlIIIllIlllIl("No friend requests", this.lllIIIllIIIIlllIlIIllIIll + this.IlIllllllIIlIIllllIIlIIIl / 2.0f, this.lllIlIIlIIIlIlIIIllIlllIl + 30.0f, -1);
            }
            this.IllIIlllllllIIlIIlIIIIlIl.lllIlIIlIIIlIlIIIllIlllIl(f, f2 - this.llIIlllIllIllllIIIlIIIIII.IllIIlllllllIIlIIlIIIIlIl(), true);
            this.IIIllIllIIlIlIlIlIllllIIl.lllIlIIlIIIlIlIIIllIlllIl(f, f2, true);
            this.IllIIIllIIIIlIlIlIllIIlll.lllIlIIlIIIlIlIIIllIlllIl(f, f2, true);
            this.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll((LunarClient.getInstance().IIlllIlIlllIllIIIlllIIlIl() ? "Disable" : "Enable") + " incoming friend requests", f, f2, true);
            GL11.glDisable((int)3089);
            GL11.glPopMatrix();
            this.llIIlllIllIllllIIIlIIIIII.lllIIIllIIIIlllIlIIllIIll(f, f2, bl);
        }
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
        this.llIIlllIllIllllIIIlIIIIII.IlIllllllIIlIIllllIIlIIIl();
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll() {
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll();
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll();
        this.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll();
        this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll();
        this.llIIlllIllIllllIIIlIIIIII.lllIIIllIIIIlllIlIIllIIll();
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl() {
        this.IllIIlllllllIIlIIlIIIIlIl.lllIlIIlIIIlIlIIIllIlllIl();
        this.llIIlllIllIllllIIIlIIIIII.lllIlIIlIIIlIlIIIllIlllIl();
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(char c, int n) {
        super.lllIIIllIIIIlllIlIIllIIll(c, n);
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(c, n);
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(c, n);
        this.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(c, n);
        this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(c, n);
        this.llIIlllIllIllllIIIlIIIIII.lllIIIllIIIIlllIlIIllIIll(c, n);
        if (this.IIIllIllIIlIlIlIlIllllIIl.lllllIlllIIllIlIIlIIIllII() && n == 28) {
            this.llIIllIllIlIIlIIllIllllll();
        }
        this.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(float f, float f2, int n, boolean bl) {
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(f, f2 - this.llIIlllIllIllllIIIlIIIIII.IllIIlllllllIIlIIlIIIIlIl(), n, bl);
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(f, f2 - this.llIIlllIllIllllIIIlIIIIII.IllIIlllllllIIlIIlIIIIlIl(), n, bl);
        if (this.IllIIlllllllIIlIIlIIIIlIl.lllllIlllIIllIlIIlIIIllII() && n == 1 && this.IllIIlllllllIIlIIlIIIIlIl.IIIllIllIIlIlIlIlIllllIIl().equals("")) {
            this.IIIllIllIIlIlIlIlIllllIIl();
        }
        if (!bl) {
            return false;
        }
        this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(f, f2 - this.llIIlllIllIllllIIIlIIIIII.IllIIlllllllIIlIIlIIIIlIl(), n, bl);
        this.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(f, f2 - this.llIIlllIllIllllIIIlIIIIII.IllIIlllllllIIlIIlIIIIlIl(), n, bl);
        this.llIIlllIllIllllIIIlIIIIII.lllIIIllIIIIlllIlIIllIIll(f, f2, n, bl);
        if (this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(f, f2 - this.llIIlllIllIllllIIIlIIIIII.IllIIlllllllIIlIIlIIIIlIl())) {
            this.llIIllIllIlIIlIIllIllllll();
        }
        if (this.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(f, f2 - this.llIIlllIllIllllIIIlIIIIII.IllIIlllllllIIlIIlIIIIlIl())) {
            LunarClient.getInstance().getWebsocket().lllIIIllIIIIlllIlIIllIIll(new class_0103(!LunarClient.getInstance().IIlllIlIlllIllIIIlllIIlIl()));
            LunarClient.getInstance().lllIlIIlIIIlIlIIIllIlllIl(!LunarClient.getInstance().IIlllIlIlllIllIIIlllIIlIl());
            return false;
        }
        boolean bl2 = false;
        for (class_0825 class_08252 : this.IIIllIIlIIIIIIlIlIIllIIlI) {
            if (!this.lllIIIllIIIIlllIlIIllIIll(class_08252)) continue;
            if (bl2) break;
            bl2 = class_08252.lllIIIllIIIIlllIlIIllIIll(f, f2 - this.llIIlllIllIllllIIIlIIIIII.IllIIlllllllIIlIIlIIIIlIl(), n, bl);
        }
        return bl2;
    }

    private void llIIllIllIlIIlIIllIllllll() {
        if (!this.IIIllIllIIlIlIlIlIllllIIl.IIIllIllIIlIlIlIlIllllIIl().isEmpty()) {
            this.IlIIIIIllllllIIlllIllllll.IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
            String string = this.IIIllIllIIlIlIlIlIllllIIl.IIIllIllIIlIlIlIlIllllIIl();
            if (string.matches("([a-zA-Z0-9_]+)") && string.length() <= 16) {
                LunarClient.getInstance().getWebsocket().lllIIIllIIIIlllIlIIllIIll(new class_0022("", this.IIIllIllIIlIlIlIlIllllIIl.IIIllIllIIlIlIlIlIllllIIl()));
                this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll("");
            } else {
                class_0078.lllIIIllIIIIlllIlIIllIIll((Object)((Object)class_1227.llIIllIllIlIIlIIllIllllll) + "Error!", "Incorrect username.");
            }
        }
    }

    @Override
    public boolean lllIlIIlIIIlIlIIIllIlllIl(float f, float f2, int n, boolean bl) {
        if (!bl) {
            return false;
        }
        this.IllIIlllllllIIlIIlIIIIlIl.lllIlIIlIIIlIlIIIllIlllIl(f, f2 - this.llIIlllIllIllllIIIlIIIIII.IllIIlllllllIIlIIlIIIIlIl(), n, bl);
        this.IIIllIllIIlIlIlIlIllllIIl.lllIlIIlIIIlIlIIIllIlllIl(f, f2 - this.llIIlllIllIllllIIIlIIIIII.IllIIlllllllIIlIIlIIIIlIl(), n, bl);
        this.IllIIIllIIIIlIlIlIllIIlll.lllIlIIlIIIlIlIIIllIlllIl(f, f2 - this.llIIlllIllIllllIIIlIIIIII.IllIIlllllllIIlIIlIIIIlIl(), n, bl);
        this.llIIlllIllIllllIIIlIIIIII.lllIlIIlIIIlIlIIIllIlllIl(f, f2 - this.llIIlllIllIllllIIIlIIIIII.IllIIlllllllIIlIIlIIIIlIl(), n, bl);
        boolean bl2 = false;
        for (class_0825 class_08252 : this.IIIllIIlIIIIIIlIlIIllIIlI) {
            if (!this.lllIIIllIIIIlllIlIIllIIll(class_08252)) continue;
            if (bl2) break;
            bl2 = class_08252.lllIlIIlIIIlIlIIIllIlllIl(f, f2 - this.llIIlllIllIllllIIIlIIIIII.IllIIlllllllIIlIIlIIIIlIl(), n, bl);
        }
        return bl2;
    }

    public class_0806 IllIIIllIIIIlIlIlIllIIlll() {
        return this.IllIIIllIIIIlIlIlIllIIlll;
    }

    public class_0806 lIIIIlIlIIlllllIIllIIlIII() {
        return this.lIIIIlIlIIlllllIIllIIlIII;
    }

    public List llIIlllIllIllllIIIlIIIIII() {
        return this.llIIllIllIlIIlIIllIllllll;
    }
}

