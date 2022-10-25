package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.util.Collection;
import java.util.Iterator;

import net.minecraft.scoreboard.IScoreObjectiveCriteria;
import org.lwjgl.opengl.GL11;

public class class_1169
extends class_1665 {
    public class_1609 lllIIIllIIIIlllIlIIllIIll;
    public static class_0561 lllIlIIlIIIlIlIIIllIlllIl = class_0561.lllIIIllIIIIlllIlIIllIIll;

    public class_1169() {
        super("Scoreboard");
        this.lllIlIIlIIIlIlIIIllIlllIl(class_0767.IIIllIllIIlIlIlIlIllllIIl);
        this.lllIIIllIIIIlllIlIIllIIll = new class_1609(this, "Remove Scoreboard numbers").lllIlIIlIIIlIlIIIllIlllIl(true);
        this.lllIIIllIIIIlllIlIIllIIll(class_1217.class, this::lllIIIllIIIIlllIlIIllIIll);
        this.lllIIIllIIIIlllIlIIllIIll(class_0097.class, this::lllIIIllIIIIlllIlIIllIIll);
        this.lllIlIIlIIIlIlIIIllIlllIl(true);
    }

    private void lllIIIllIIIIlllIlIIllIIll(class_1217 class_12172) {
        if (!this.lllIIlIIIllllllIIIIlIlIlI()) {
            return;
        }
        if (this.lIIlIIIIIlIlllIlIIlIlIlll.theWorld.IlIlIIlllIllllllllIIIlIlI().lllIIIllIIIIlllIlIIllIIll(1) != null) {
            return;
        }
        GL11.glPushMatrix();
        this.lllIIIllIIIIlllIlIIllIIll(class_12172.lllIIIllIIIIlllIlIIllIIll());
        GL11.glTranslatef((float)(this.lllIIIllIIIIlllIlIIllIIll() ? -12.0f : 2.0f), (float)this.lIlllIlllIlIIIIlllIlIlIIl, (float)0.0f);
        class_0141 class_01412 = new class_0141();
        class_0693 class_06932 = new class_0693(class_01412, "Lunar Client", IScoreObjectiveCriteria.lllIlIIlIIIlIlIIIllIlllIl);
        class_06932.lllIIIllIIIIlllIlIIllIIll((Object)((Object)class_1227.llIIllIllIlIIlIIllIllllll) + "" + (Object)((Object)class_1227.llIIlllIllIllllIIIlIIIIII) + "Lunar" + (Object)((Object)class_1227.IIlllIlIlllIllIIIlllIIlIl) + " " + (Object)((Object)class_1227.IlIlIIlllIIlIllIIIlllllIl) + "Client");
        class_01412.lllIIIllIIIIlllIlIIllIIll("Steve", class_06932);
        class_01412.lllIIIllIIIIlllIlIIllIIll("Alex", class_06932);
        this.lllIIIllIIIIlllIlIIllIIll(class_06932, class_12172.lllIIIllIIIIlllIlIIllIIll().lllIlIIlIIIlIlIIIllIlllIl(), class_12172.lllIIIllIIIIlllIlIIllIIll().lllIIIllIIIIlllIlIIllIIll(), this.lIIlIIIIIlIlllIlIIlIlIlll.IlIlllIIIIIIlIIllIIllIlll, ((Float)this.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue());
        GL11.glPopMatrix();
    }

    private void lllIIIllIIIIlllIlIIllIIll(class_0097 class_00972) {
        if (!this.lllIIlIIIllllllIIIIlIlIlI()) {
            return;
        }
        GL11.glPushMatrix();
        this.lllIIIllIIIIlllIlIIllIIll(class_00972.lllIIIllIIIIlllIlIIllIIll());
        GL11.glTranslatef((float)(this.lllIIIllIIIIlllIlIIllIIll() ? -12.0f : 2.0f), (float)this.lIlllIlllIlIIIIlllIlIlIIl, (float)0.0f);
        class_0693 class_06932 = this.lIIlIIIIIlIlllIlIIlIlIlll.theWorld.IlIlIIlllIllllllllIIIlIlI().lllIIIllIIIIlllIlIIllIIll(1);
        if (class_06932 != null) {
            this.lllIIIllIIIIlllIlIIllIIll(class_06932, class_00972.lllIIIllIIIIlllIlIIllIIll().lllIlIIlIIIlIlIIIllIlllIl(), class_00972.lllIIIllIIIIlllIlIIllIIll().lllIIIllIIIIlllIlIIllIIll(), this.lIIlIIIIIlIlllIlIIlIlIlll.IlIlllIIIIIIlIIllIIllIlll, ((Float)this.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue());
        }
        GL11.glPopMatrix();
    }

    private void lllIIIllIIIIlllIlIIllIIll(class_0693 class_06932, int n, int n2, class_1854 class_18542, float f) {
        class_0141 class_01412 = class_06932.lllIIIllIIIIlllIlIIllIIll();
        Collection collection = class_01412.lllIIIllIIIIlllIlIIllIIll(class_06932);
        boolean bl = this.lllIIIllIIIIlllIlIIllIIll();
        if (collection.size() <= 15) {
            int n3 = class_18542.lllIIIllIIIIlllIlIIllIIll(class_06932.lIlllIlllIIIIlIIlllIllIII());
            int n4 = n3 + 16;
            for (class_0678 class_06782 : collection) {
                class_0531 class_05312 = class_01412.IIIllIIlIIIIIIlIlIIllIIlI(class_06782.lIlllIlllIIIIlIIlllIllIII());
                String string = class_0531.lllIIIllIIIIlllIlIIllIIll(class_05312, class_06782.lIlllIlllIIIIlIIlllIllIII()) + ": " + (Object)((Object)class_1227.llIIllIllIlIIlIIllIllllll) + class_06782.lllIlIIlIIIlIlIIIllIlllIl();
                n3 = Math.max(n3, class_18542.lllIIIllIIIIlllIlIIllIIll(string));
            }
            int n5 = 0;
            int n6 = 3;
            int n7 = 0;
            int n8 = 0;
            Iterator iterator = collection.iterator();
            int n9 = 0;
            int n10 = n3 + n6 + 6;
            if (n10 < n4) {
                n10 = n4;
            }
            class_0210.lllIIIllIIIIlllIlIIllIIll(n7 - 2 + (bl ? 14 : 0), n5 - (collection.size() + 1) * class_18542.lllIIIllIIIIlllIlIIllIIll - 1, n10, n5 - collection.size() * class_18542.lllIIIllIIIIlllIlIIllIIll, 0x60000000);
            class_0210.lllIIIllIIIIlllIlIIllIIll(n7 - 2 + (bl ? 14 : 0), n5 - collection.size() * class_18542.lllIIIllIIIIlllIlIIllIIll, n10, n5, 0x50000000);
            while (iterator.hasNext()) {
                class_0678 class_06783 = (class_0678)iterator.next();
                class_0531 class_05313 = class_01412.IIIllIIlIIIIIIlIlIIllIIlI(class_06783.lIlllIlllIIIIlIIlllIllIII());
                String string = class_0531.lllIIIllIIIIlllIlIIllIIll(class_05313, class_06783.lIlllIlllIIIIlIIlllIllIII());
                String string2 = (Object)((Object)class_1227.llIIllIllIlIIlIIllIllllll) + "" + class_06783.lllIlIIlIIIlIlIIIllIlllIl();
                int n11 = n5 - ++n8 * class_18542.lllIIIllIIIIlllIlIIllIIll;
                n9 = n10 - (n7 - 2 + (bl ? 14 : 0));
                class_18542.lllIlIIlIIIlIlIIIllIlllIl(string, n7 + (bl ? 16 : 0), n11, 0x20FFFFFF);
                if (!bl) {
                    class_18542.lllIlIIlIIIlIlIIIllIlllIl(string2, n10 - class_18542.lllIIIllIIIIlllIlIIllIIll(string2) - 2, n11, 0x20FFFFFF);
                }
                if (n8 != collection.size()) continue;
                String string3 = class_06932.lIlllIlllIIIIlIIlllIllIII();
                class_18542.lllIlIIlIIIlIlIIIllIlllIl(string3, n7 + n3 / 2 - class_18542.lllIIIllIIIIlllIlIIllIIll(string3) / 2 + (bl ? 14 : 0), n11 - class_18542.lllIIIllIIIIlllIlIIllIIll, 0x20FFFFFF);
            }
            this.IlIllllllIIlIIllllIIlIIIl(n9, collection.size() * class_18542.lllIIIllIIIIlllIlIIllIIll + 12);
        }
    }

    private boolean lllIIIllIIIIlllIlIIllIIll() {
        return lllIlIIlIIIlIlIIIllIlllIl == class_0561.lllIIIllIIIIlllIlIIllIIll ? (Boolean)this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII() : lllIlIIlIIIlIlIIIllIlllIl == class_0561.IlIllllllIIlIIllllIIlIIIl;
    }
}

