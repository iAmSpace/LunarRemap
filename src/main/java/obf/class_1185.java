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

public class class_1185
extends class_2043 {
    private final class_0869 IllIIlllllllIIlIIlIIIIlIl;
    private final class_1326 IIIllIllIIlIlIlIlIllllIIl;
    private List IllIIIllIIIIlIlIlIllIIlll = new ArrayList();

    public class_1185(List list) {
        super(list);
        this.IllIIlllllllIIlIIlIIIIlIl = new class_0869(LunarClient.getInstance().robotoMedium13px, "Filter", 0x2FFFFFFF, 0x6FFFFFFF);
        this.IIIllIllIIlIlIlIlIllllIIl = new class_1326(this);
    }

    public void IIIllIllIIlIlIlIlIllllIIl() {
        this.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(float f, float f2, float f3, float f4) {
        super.lllIIIllIIIIlllIlIIllIIll(f, f2, f3, f4);
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(0.0f, f2, f3, 13.0f);
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(f + f3 - 4.0f, f2, 4.0f, f4);
        this.IIIllIIlIIIIIIlIlIIllIIlI.sort((class_18732, class_18733) -> {
            String string = class_1227.lllIIIllIIIIlllIlIIllIIll(class_18732.IllIIlllllllIIlIIlIIIIlIl().lIlllIlllIIIIlIIlllIllIII());
            String string2 = class_1227.lllIIIllIIIIlllIlIIllIIll(class_18733.IllIIlllllllIIlIIlIIIIlIl().lIlllIlllIIIIlIIlllIllIII());
            if (class_18732.IllIIlllllllIIlIIlIIIIlIl().IIIllIIlIIIIIIlIlIIllIIlI() == class_18733.IllIIlllllllIIlIIlIIIIlIl().IIIllIIlIIIIIIlIlIIllIIlI()) {
                return string.compareTo(string2);
            }
            return class_18732.IllIIlllllllIIlIIlIIIIlIl().IIIllIIlIIIIIIlIlIIllIIlI() ? -1 : 1;
        });
        int n = 22;
        int n2 = 0;
        for (class_1873 class_18734 : this.IIIllIIlIIIIIIlIlIIllIIlI) {
            if (!this.lllIIIllIIIIlllIlIIllIIll(class_18734)) continue;
            class_18734.lllIIIllIIIIlllIlIIllIIll(f, f2 + 14.0f + (float)(n2 * 22), f3, 22.0f);
            ++n2;
        }
        this.IIIllIllIIlIlIlIlIllllIIl.IlIIIIIllllllIIlllIllllll(14 + this.IIIllIIlIIIIIIlIlIIllIIlI.size() * 22);
    }

    private boolean lllIIIllIIIIlllIlIIllIIll(class_1873 class_18732) {
        return this.IllIIlllllllIIlIIlIIIIlIl.IIIllIllIIlIlIlIlIllllIIl().equals("") || class_1227.lllIIIllIIIIlllIlIIllIIll(class_18732.IllIIlllllllIIlIIlIIIIlIl().lIlllIlllIIIIlIIlllIllIII()).toLowerCase().startsWith(this.IllIIlllllllIIlIIlIIIIlIl.IIIllIllIIlIlIlIlIllllIIl().toLowerCase());
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(float f, float f2, boolean bl) {
        if (!this.IllIIIllIIIIlIlIlIllIIlll.isEmpty()) {
            this.IIIllIIlIIIIIIlIlIIllIIlI.removeAll(this.IllIIIllIIIIlIlIlIllIIlll);
            class_0713.IlIlllIIIIIIlIIllIIllIlll().IlIlIIlIlIllIIlIlIIllIIIl().IIIllIllIIlIlIlIlIllllIIl();
        }
        if (!LunarClient.getInstance().getWebsocket().isOpen()) {
            LunarClient.getInstance().robotoLight18px.lllIlIIlIIIlIlIIIllIlllIl("Connection lost", this.lllIIIllIIIIlllIlIIllIIll + this.IlIllllllIIlIIllllIIlIIIl / 2.0f, this.lllIlIIlIIIlIlIIIllIlllIl + 10.0f, -1);
            LunarClient.getInstance().robotoMedium13px.lllIlIIlIIIlIlIIIllIlllIl("Please try again later.", this.lllIIIllIIIIlllIlIIllIIll + this.IlIllllllIIlIIllllIIlIIIl / 2.0f, this.lllIlIIlIIIlIlIIIllIlllIl + 22.0f, -1);
        } else {
            GL11.glPushMatrix();
            GL11.glEnable((int)3089);
            class_0713 class_07132 = class_0713.IlIlllIIIIIIlIIllIIllIlll();
            this.IIIllIllIIlIlIlIlIllllIIl.IlIllllllIIlIIllllIIlIIIl(f, f2, bl);
            class_0857.lllIIIllIIIIlllIlIIllIIll((int)this.lllIIIllIIIIlllIlIIllIIll, (int)this.lllIlIIlIIIlIlIIIllIlllIl, (int)(this.lllIIIllIIIIlllIlIIllIIll + this.IlIllllllIIlIIllllIIlIIIl), (int)(this.lllIlIIlIIIlIlIIIllIlllIl + this.lIlllIlllIIIIlIIlllIllIII), (float)((int)((float)class_07132.llIIlllIllIllllIIIlIIIIII().IlIIIIIllllllIIlllIllllll() * class_07132.IlIIIIIllllllIIlllIllllll())), (int)class_07132.IIIllIIlIIIIIIlIlIIllIIlI());
            ImmutableList immutableList = ImmutableList.copyOf((Collection)this.IIIllIIlIIIIIIlIlIIllIIlI);
            for (class_1873 class_18732 : immutableList) {
                if (!this.lllIIIllIIIIlllIlIIllIIll(class_18732)) continue;
                class_18732.lllIlIIlIIIlIlIIIllIlllIl(f, f2 - this.IIIllIllIIlIlIlIlIllllIIl.IllIIlllllllIIlIIlIIIIlIl(), bl && !this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(f, f2));
            }
            if (immutableList.isEmpty()) {
                LunarClient.getInstance().robotoLight18px.lllIlIIlIIIlIlIIIllIlllIl("No friends", this.lllIIIllIIIIlllIlIIllIIll + this.IlIllllllIIlIIllllIIlIIIl / 2.0f, this.lllIlIIlIIIlIlIIIllIlllIl + 30.0f, -1);
            }
            this.IllIIlllllllIIlIIlIIIIlIl.lllIlIIlIIIlIlIIIllIlllIl(f, f2 - this.IIIllIllIIlIlIlIlIllllIIl.IllIIlllllllIIlIIlIIIIlIl(), bl);
            GL11.glDisable((int)3089);
            GL11.glPopMatrix();
            this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(f, f2, bl);
        }
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
        this.IIIllIllIIlIlIlIlIllllIIl.IlIllllllIIlIIllllIIlIIIl();
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll() {
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll();
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll();
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl() {
        this.IllIIlllllllIIlIIlIIIIlIl.lllIlIIlIIIlIlIIIllIlllIl();
        this.IIIllIllIIlIlIlIlIllllIIl.lllIlIIlIIIlIlIIIllIlllIl();
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(char c, int n) {
        super.lllIIIllIIIIlllIlIIllIIll(c, n);
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(c, n);
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(c, n);
        this.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(float f, float f2, int n, boolean bl) {
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(f, f2 - this.IIIllIllIIlIlIlIlIllllIIl.IllIIlllllllIIlIIlIIIIlIl(), n, bl);
        if (this.IllIIlllllllIIlIIlIIIIlIl.lllllIlllIIllIlIIlIIIllII() && n == 1 && this.IllIIlllllllIIlIIlIIIIlIl.IIIllIllIIlIlIlIlIllllIIl().equals("")) {
            this.IIIllIllIIlIlIlIlIllllIIl();
        }
        if (!bl) {
            return false;
        }
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(f, f2, n, bl);
        boolean bl2 = false;
        for (class_1873 class_18732 : this.IIIllIIlIIIIIIlIlIIllIIlI) {
            if (!this.lllIIIllIIIIlllIlIIllIIll(class_18732)) continue;
            if (bl2) break;
            bl2 = class_18732.lllIIIllIIIIlllIlIIllIIll(f, f2 - this.IIIllIllIIlIlIlIlIllllIIl.IllIIlllllllIIlIIlIIIIlIl(), n, bl && !this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(f, f2));
        }
        return bl2;
    }

    @Override
    public boolean lllIlIIlIIIlIlIIIllIlllIl(float f, float f2, int n, boolean bl) {
        this.IllIIlllllllIIlIIlIIIIlIl.lllIlIIlIIIlIlIIIllIlllIl(f, f2 - this.IIIllIllIIlIlIlIlIllllIIl.IllIIlllllllIIlIIlIIIIlIl(), n, bl);
        this.IIIllIllIIlIlIlIlIllllIIl.lllIlIIlIIIlIlIIIllIlllIl(f, f2, n, bl);
        if (!bl) {
            return false;
        }
        boolean bl2 = false;
        for (class_1873 class_18732 : this.IIIllIIlIIIIIIlIlIIllIIlI) {
            if (!this.lllIIIllIIIIlllIlIIllIIll(class_18732)) continue;
            if (bl2) break;
            bl2 = class_18732.lllIlIIlIIIlIlIIIllIlllIl(f, f2, n, bl);
        }
        return bl2;
    }

    public List IllIIIllIIIIlIlIlIllIIlll() {
        return this.IllIIIllIIIIlIlIlIllIIlll;
    }
}

