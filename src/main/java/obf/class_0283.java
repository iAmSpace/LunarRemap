package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.util.ArrayList;
import java.util.List;

import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import org.lwjgl.opengl.GL11;

public class class_0283
extends class_1665 {
    private class_1609 lllIIlIIIllllllIIIIlIlIlI;
    public static class_1609 lllIIIllIIIIlllIlIIllIIll;
    public static class_1609 lllIlIIlIIIlIlIIIllIlllIl;
    public static class_1609 IlIllllllIIlIIllllIIlIIIl;
    public static class_1609 lIlllIlllIIIIlIIlllIllIII;
    public static class_1609 IlIIIIIllllllIIlllIllllll;
    private class_1609 IlIlllIIIIIIlIIllIIllIlll;
    public static class_1609 lIllllIIlIIIlIllllllIIIll;
    public static class_1609 IIIllIIlIIIIIIlIlIIllIIlI;
    public static class_1609 IllIIlllllllIIlIIlIIIIlIl;
    public static class_1609 IIIllIllIIlIlIlIlIllllIIl;
    private class_1609 IlIlIIlIlIllIIlIlIIllIIIl;
    public static class_1609 IllIIIllIIIIlIlIlIllIIlll;
    public static class_1609 lIIIIlIlIIlllllIIllIIlIII;
    public static class_1785 llIIlllIllIllllIIIlIIIIII;
    public static final List llIIllIllIlIIlIIllIllllll;
    private static List lllllIlllIIllIlIIlIIIllII;
    private static class_0321 IlIlIIlllIIlIllIIIlllllIl;

    public class_0283() {
        super("Armor Status");
        this.lllIlIIlIIIlIlIIIllIlllIl(class_0767.IllIIIllIIIIlIlIlIllIIlll);
        this.lllIlIIlIIIlIlIIIllIlllIl(false);
        this.lllIIlIIIllllllIIIIlIlIlI = new class_1609(this, "label").lllIlIIlIIIlIlIIIllIlllIl("General Options");
        lllIIIllIIIIlllIlIIllIIll = new class_1609(this, "List Mode").lllIlIIlIIIlIlIIIllIlllIl("vertical").lllIIIllIIIIlllIlIIllIIll(new String[]{"vertical", "horizontal"});
        lllIlIIlIIIlIlIIIllIlllIl = new class_1609(this, "Item Name").lllIlIIlIIIlIlIIIllIlllIl(false);
        IlIllllllIIlIIllllIIlIIIl = new class_1609(this, "Item Count").lllIlIIlIIIlIlIIIllIlllIl(true);
        IlIIIIIllllllIIlllIllllll = new class_1609(this, "Equipped Item").lllIlIIlIIIlIlIIIllIlllIl(true);
        lIlllIlllIIIIlIIlllIllIII = new class_1609(this, "Show While Typing").lllIlIIlIIIlIlIIIllIlllIl(false);
        this.IlIlllIIIIIIlIIllIIllIlll = new class_1609(this, "label").lllIlIIlIIIlIlIIIllIlllIl("Damage Options");
        lIllllIIlIIIlIllllllIIIll = new class_1609(this, "Damage Overlay").lllIlIIlIIIlIlIIIllIlllIl(true);
        IIIllIIlIIIIIIlIlIIllIIlI = new class_1609(this, "Show Item Damage").lllIlIIlIIIlIlIIIllIlllIl(true);
        IllIIlllllllIIlIIlIIIIlIl = new class_1609(this, "Show Armor Damage").lllIlIIlIIIlIlIIIllIlllIl(true);
        IIIllIllIIlIlIlIlIllllIIl = new class_1609(this, "Show Max Damage").lllIlIIlIIIlIlIIIllIlllIl(false);
        this.IlIlIIlIlIllIIlIlIIllIIIl = new class_1609(this, "label").lllIlIIlIIIlIlIIIllIlllIl("Damage Display");
        IllIIIllIIIIlIlIlIllIIlll = new class_1609(this, "Damage Display Type").lllIlIIlIIIlIlIIIllIlllIl("value").lllIIIllIIIIlllIlIIllIIll("value", "percent", "none");
        lIIIIlIlIIlllllIIllIIlIII = new class_1609(this, "Damage Threshold Type").lllIlIIlIIIlIlIIIllIlllIl("percent").lllIIIllIIIIlllIlIIllIIll(new String[]{"percent", "value"});
        llIIllIllIlIIlIIllIllllll.add(new class_1650(10, "4"));
        llIIllIllIlIIlIIllIllllll.add(new class_1650(25, "c"));
        llIIllIllIlIIlIIllIllllll.add(new class_1650(40, "6"));
        llIIllIllIlIIlIIllIllllll.add(new class_1650(60, "e"));
        llIIllIllIlIIlIIllIllllll.add(new class_1650(80, "7"));
        llIIllIllIlIIlIIllIllllll.add(new class_1650(100, "f"));
        this.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("client/icons/mods/diamond_chestplate.png"), 34, 34);
        this.lllIIIllIIIIlllIlIIllIIll(class_1217.class, this::lllIIIllIIIIlllIlIIllIIll);
        this.lllIIIllIIIIlllIlIIllIIll(class_2201.class, this::lllIIIllIIIIlllIlIIllIIll);
    }

    private void lllIIIllIIIIlllIlIIllIIll(class_1217 class_12172) {
        if (!this.lllIIlIIIllllllIIIIlIlIlI()) {
            return;
        }
        ArrayList<class_1966> arrayList = new ArrayList<class_1966>();
        for (int i = 3; i >= 0; --i) {
            ItemStack class_08972 = this.lIIlIIIIIlIlllIlIIlIlIlll.lIIIIlIlIIlllllIIllIIlIII.lllIIlIIIllllllIIIIlIlIlI.lllIlIIlIIIlIlIIIllIlllIl[i];
            if (class_08972 == null) continue;
            arrayList.add(new class_1966(class_08972, 16, 16, 2, i > -1));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new class_1966(new ItemStack(Item.lllIIIllIIIIlllIlIIllIIll(310)), 16, 16, 2, true));
            arrayList.add(new class_1966(new ItemStack(Item.lllIIIllIIIIlllIlIIllIIll(311)), 16, 16, 2, true));
            arrayList.add(new class_1966(new ItemStack(Item.lllIIIllIIIIlllIlIIllIIll(312)), 16, 16, 2, true));
            arrayList.add(new class_1966(new ItemStack(Item.lllIIIllIIIIlllIlIIllIIll(313)), 16, 16, 2, true));
        }
        if (((Boolean)IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII()).booleanValue() && this.lIIlIIIIIlIlllIlIIlIlIlll.lIIIIlIlIIlllllIIllIIlIII.IllIlIlIIIlIllIlIlIIlllII() != null) {
            arrayList.add(new class_1966(this.lIIlIIIIIlIlllIlIIlIlIlll.lIIIIlIlIIlllllIIllIIlIII.IllIlIlIIIlIllIlIlIIlllII(), 16, 16, 2, false));
        } else if (((Boolean)IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII()).booleanValue()) {
            arrayList.add(new class_1966(new ItemStack(Item.lllIIIllIIIIlllIlIIllIIll(276)), 16, 16, 2, false));
        }
        GL11.glPushMatrix();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        IlIlIIlllIIlIllIIIlllllIl = class_12172.lllIIIllIIIIlllIlIIllIIll();
        this.lllIIIllIIIIlllIlIIllIIll(IlIlIIlllIIlIllIIIlllllIl);
        this.lllIIIllIIIIlllIlIIllIIll(this.lIIlIIIIIlIlllIlIIlIlIlll, arrayList);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glPopMatrix();
    }

    private void lllIIIllIIIIlllIlIIllIIll(class_2201 class_22012) {
        if (!this.lllIIlIIIllllllIIIIlIlIlI()) {
            return;
        }
        if (!(this.lIIlIIIIIlIlllIlIIlIlIlll.lllllIlllIIllIlIIlIIIllII instanceof class_0822 || this.lIIlIIIIIlIlllIlIIlIlIlll.lllllIlllIIllIlIIlIIIllII instanceof class_1998 || this.lIIlIIIIIlIlllIlIIlIlIlll.lllllIlllIIllIlIIlIIIllII instanceof class_1056 && !((Boolean)lIlllIlllIIIIlIIlllIllIII.lIlllIlllIIIIlIIlllIllIII()).booleanValue())) {
            this.lllIIIllIIIIlllIlIIllIIll(this.lIIlIIIIIlIlllIlIIlIlIlll);
            if (!lllllIlllIIllIlIIlIIIllII.isEmpty()) {
                GL11.glPushMatrix();
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                IlIlIIlllIIlIllIIIlllllIl = class_22012.lllIIIllIIIIlllIlIIllIIll();
                this.lllIIIllIIIIlllIlIIllIIll(IlIlIIlllIIlIllIIIlllllIl);
                this.lllIIIllIIIIlllIlIIllIIll(this.lIIlIIIIIlIlllIlIIlIlIlll, lllllIlllIIllIlIIlIIIllII);
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                GL11.glPopMatrix();
            }
        }
    }

    private void lllIIIllIIIIlllIlIIllIIll(Minecraft class_06672) {
        lllllIlllIIllIlIIlIIIllII.clear();
        for (int i = 3; i >= -1; --i) {
            ItemStack class_08972 = null;
            if (i == -1 && ((Boolean)IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII()).booleanValue()) {
                class_08972 = class_06672.lIIIIlIlIIlllllIIllIIlIII.IllIlIlIIIlIllIlIlIIlllII();
            } else if (i != -1) {
                class_08972 = class_06672.lIIIIlIlIIlllllIIllIIlIII.lllIIlIIIllllllIIIIlIlIlI.lllIlIIlIIIlIlIIIllIlllIl[i];
            }
            if (class_08972 == null) continue;
            lllllIlllIIllIlIIlIIIllII.add(new class_1966(class_08972, 16, 16, 2, i > -1));
        }
    }

    private void lllIIIllIIIIlllIlIIllIIll(Minecraft class_06672, List list) {
        if (list.size() > 0) {
            int n;
            int n2 = n = (Boolean)lllIlIIlIIIlIlIIIllIlllIl.lIlllIlllIIIIlIIlllIllIII() != false ? 18 : 16;
            if (((String)lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII()).equalsIgnoreCase("vertical")) {
                int n3 = 0;
                int n4 = 0;
                boolean bl = class_1271.IlIllllllIIlIIllllIIlIIIl(this.IlIlllIIIIIIlIIllIIllIlll()) == class_1564.IlIIIIIllllllIIlllIllllll;
                for (class_1966 class_19662 : list) {
                    class_19662.lllIIIllIIIIlllIlIIllIIll(bl ? this.llIllllIlIllIIIlIllIIlIlI : 0.0f, n3);
                    n3 += n;
                    if (class_19662.lllIIIllIIIIlllIlIIllIIll() <= n4) continue;
                    n4 = class_19662.lllIIIllIIIIlllIlIIllIIll();
                }
                this.lIlllIlllIlIIIIlllIlIlIIl = n3;
                this.llIllllIlIllIIIlIllIIlIlI = n4;
            } else if (((String)lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII()).equalsIgnoreCase("horizontal")) {
                boolean bl = false;
                int n5 = 0;
                int n6 = 0;
                boolean bl2 = class_1271.IlIllllllIIlIIllllIIlIIIl(this.IlIlllIIIIIIlIIllIIllIlll()) == class_1564.IlIIIIIllllllIIlllIllllll;
                for (class_1966 class_19663 : list) {
                    if (bl2) {
                        n5 += class_19663.lllIIIllIIIIlllIlIIllIIll();
                    }
                    class_19663.lllIIIllIIIIlllIlIIllIIll(n5, (float)bl);
                    if (!bl2) {
                        n5 += class_19663.lllIIIllIIIIlllIlIIllIIll();
                    }
                    if (class_19663.lllIlIIlIIIlIlIIIllIlllIl() <= n6) continue;
                    n6 += class_19663.lllIlIIlIIIlIlIIIllIlllIl();
                }
                this.lIlllIlllIlIIIIlllIlIlIIl = n6;
                this.llIllllIlIllIIIlIllIIlIlI = n5;
            }
        }
    }

    static {
        llIIlllIllIllllIIIlIIIIII = new class_1785();
        llIIllIllIlIIlIIllIllllll = new ArrayList();
        lllllIlllIIllIlIIlIIIllII = new ArrayList();
    }
}

