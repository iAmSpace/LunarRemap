package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import com.moonsworth.lunar.client.LunarClient;
import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import org.lwjgl.opengl.GL11;

public class class_1966 {
    public final ItemStack lllIIIllIIIIlllIlIIllIIll;
    public final int lllIlIIlIIIlIlIIIllIlllIl;
    public final int IlIllllllIIlIIllllIIlIIIl;
    public final int lIlllIlllIIIIlIIlllIllIII;
    private int IlIIIIIllllllIIlllIllllll;
    private int lIllllIIlIIIlIllllllIIIll;
    private String IIIllIIlIIIIIIlIlIIllIIlI = "";
    private int IllIIlllllllIIlIIlIIIIlIl;
    private String IIIllIllIIlIlIlIlIllllIIl = "";
    private int IllIIIllIIIIlIlIlIllIIlll;
    private final boolean lIIIIlIlIIlllllIIllIIlIII;
    private Minecraft llIIlllIllIllllIIIlIIIIII = Minecraft.getMinecraft();

    public class_1966(ItemStack class_08972, int n, int n2, int n3, boolean bl) {
        this.lllIIIllIIIIlllIlIIllIIll = class_08972;
        this.lllIlIIlIIIlIlIIIllIlllIl = n;
        this.IlIllllllIIlIIllllIIlIIIl = n2;
        this.lIlllIlllIIIIlIIlllIllIII = n3;
        this.lIIIIlIlIIlllllIIllIIlIII = bl;
        this.IlIllllllIIlIIllllIIlIIIl();
    }

    public int lllIIIllIIIIlllIlIIllIIll() {
        return this.IlIIIIIllllllIIlllIllllll;
    }

    public int lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lIllllIIlIIIlIllllllIIIll;
    }

    private void IlIllllllIIlIIllllIIlIIIl() {
        int n = this.lIllllIIlIIIlIllllllIIIll = (Boolean)class_0283.lllIlIIlIIIlIlIIIllIlllIl.getValue() != false ? Math.max(Minecraft.getMinecraft().IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll * 2, this.IlIllllllIIlIIllllIIlIIIl) : Math.max(this.llIIlllIllIllllIIIlIIIIII.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll, this.IlIllllllIIlIIllllIIlIIIl);
        if (this.lllIIIllIIIIlllIlIIllIIll != null) {
            int n2 = 1;
            int n3 = 1;
            if ((this.lIIIIlIlIIlllllIIllIIlIII && ((Boolean)class_0283.IllIIlllllllIIlIIlIIIIlIl.getValue()).booleanValue() || !this.lIIIIlIlIIlllllIIllIIlIII && ((Boolean)class_0283.IIIllIIlIIIIIIlIlIIllIIlI.getValue()).booleanValue()) && this.lllIIIllIIIIlllIlIIllIIll.lIllllIIlIIIlIllllllIIIll()) {
                n3 = this.lllIIIllIIIIlllIlIIllIIll.lIIIIlIlIIlllllIIllIIlIII() + 1;
                n2 = n3 - this.lllIIIllIIIIlllIlIIllIIll.IIIllIllIIlIlIlIlIllllIIl();
                if (((String)class_0283.IllIIIllIIIIlIlIlIllIIlll.getValue()).equalsIgnoreCase("value")) {
                    this.IIIllIllIIlIlIlIlIllllIIl = "\u00a7" + class_1650.lllIIIllIIIIlllIlIIllIIll(class_0283.llIIllIllIlIIlIIllIllllll, ((String)class_0283.lIIIIlIlIIlllllIIllIIlIII.getValue()).equalsIgnoreCase("percent") ? n2 * 100 / n3 : n2) + n2 + ((Boolean)class_0283.IIIllIllIIlIlIlIlIllllIIl.getValue() != false ? "/" + n3 : "");
                } else if (((String)class_0283.IllIIIllIIIIlIlIlIllIIlll.getValue()).equalsIgnoreCase("percent")) {
                    this.IIIllIllIIlIlIlIlIllllIIl = "\u00a7" + class_1650.lllIIIllIIIIlllIlIIllIIll(class_0283.llIIllIllIlIIlIIllIllllll, ((String)class_0283.lIIIIlIlIIlllllIIllIIlIII.getValue()).equalsIgnoreCase("percent") ? n2 * 100 / n3 : n2) + n2 * 100 / n3 + "%";
                }
            }
            this.IllIIIllIIIIlIlIlIllIIlll = this.llIIlllIllIllllIIIlIIIIII.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(class_0574.lllIIIllIIIIlllIlIIllIIll(this.IIIllIllIIlIlIlIlIllllIIl));
            this.IlIIIIIllllllIIlllIllllll = this.lIlllIlllIIIIlIIlllIllIII + this.lllIlIIlIIIlIlIIIllIlllIl + this.lIlllIlllIIIIlIIlllIllIII + this.IllIIIllIIIIlIlIlIllIIlll;
            if (((Boolean)class_0283.lllIlIIlIIIlIlIIIllIlllIl.getValue()).booleanValue()) {
                this.IIIllIIlIIIIIIlIlIIllIIlI = this.lllIIIllIIIIlllIlIIllIIll.lIIlIIIIIlIlllIlIIlIlIlll();
                this.IlIIIIIllllllIIlllIllllll = this.lIlllIlllIIIIlIIlllIllIII + this.lllIlIIlIIIlIlIIIllIlllIl + this.lIlllIlllIIIIlIIlllIllIII + Math.max(this.llIIlllIllIllllIIIlIIIIII.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(class_0574.lllIIIllIIIIlllIlIIllIIll(this.IIIllIIlIIIIIIlIlIIllIIlI)), this.IllIIIllIIIIlIlIlIllIIlll);
            }
            this.IllIIlllllllIIlIIlIIIIlIl = this.llIIlllIllIllllIIIlIIIIII.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(class_0574.lllIIIllIIIIlllIlIIllIIll(this.IIIllIIlIIIIIIlIlIIllIIlI));
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(float f, float f2) {
        boolean bl;
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glEnable((int)32826);
        class_0624.lllIlIIlIIIlIlIIIllIlllIl();
        class_0624.IlIllllllIIlIIllllIIlIIIl();
        class_0283.llIIlllIllIllllIIIlIIIIII.lIllllIIlIIIlIllllllIIIll = -10.0f;
        class_0767 class_07672 = LunarClient.getInstance().getModuleManager().IIIllIIlIIIIIIlIlIIllIIlI.IlIlllIIIIIIlIIllIIllIlll();
        boolean bl2 = bl = class_1271.IlIllllllIIlIIllllIIlIIIl(class_07672) == class_1564.IlIIIIIllllllIIlllIllllll;
        if (bl) {
            class_0283.llIIlllIllIllllIIIlIIIIII.lllIlIIlIIIlIlIIIllIlllIl(this.llIIlllIllIllllIIIlIIIIII.IlIlllIIIIIIlIIllIIllIlll, this.llIIlllIllIllllIIIlIIIIII.llIIlIIllIIllIlIIllIIllII(), this.lllIIIllIIIIlllIlIIllIIll, (int)(f - (float)(this.lllIlIIlIIIlIlIIIllIlllIl + this.lIlllIlllIIIIlIIlllIllIII)), (int)f2);
            class_0574.lllIIIllIIIIlllIlIIllIIll(this.llIIlllIllIllllIIIlIIIIII.IlIlllIIIIIIlIIllIIllIlll, this.lllIIIllIIIIlllIlIIllIIll, (int)(f - (float)(this.lllIlIIlIIIlIlIIIllIlllIl + this.lIlllIlllIIIIlIIlllIllIII)), (int)f2, (Boolean)class_0283.lIllllIIlIIIlIllllllIIIll.getValue(), (Boolean)class_0283.IlIllllllIIlIIllllIIlIIIl.getValue());
            class_0624.lllIIIllIIIIlllIlIIllIIll();
            GL11.glDisable((int)32826);
            GL11.glDisable((int)3042);
            this.llIIlllIllIllllIIIlIIIIII.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(this.IIIllIIlIIIIIIlIlIIllIIlI + "\u00a7r", f - (float)(this.lIlllIlllIIIIlIIlllIllIII + this.lllIlIIlIIIlIlIIIllIlllIl + this.lIlllIlllIIIIlIIlllIllIII) - (float)this.IllIIlllllllIIlIIlIIIIlIl, f2, 0xFFFFFF);
            this.llIIlllIllIllllIIIlIIIIII.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(this.IIIllIllIIlIlIlIlIllllIIl + "\u00a7r", f - (float)(this.lIlllIlllIIIIlIIlllIllIII + this.lllIlIIlIIIlIlIIIllIlllIl + this.lIlllIlllIIIIlIIlllIllIII) - (float)this.IllIIIllIIIIlIlIlIllIIlll, f2 + (float)((Boolean)class_0283.lllIlIIlIIIlIlIIIllIlllIl.getValue() != false ? this.lIllllIIlIIIlIllllllIIIll / 2 : this.lIllllIIlIIIlIllllllIIIll / 4), 0xFFFFFF);
        } else {
            class_0283.llIIlllIllIllllIIIlIIIIII.lllIlIIlIIIlIlIIIllIlllIl(this.llIIlllIllIllllIIIlIIIIII.IlIlllIIIIIIlIIllIIllIlll, this.llIIlllIllIllllIIIlIIIIII.llIIlIIllIIllIlIIllIIllII(), this.lllIIIllIIIIlllIlIIllIIll, (int)f, (int)f2);
            class_0574.lllIIIllIIIIlllIlIIllIIll(this.llIIlllIllIllllIIIlIIIIII.IlIlllIIIIIIlIIllIIllIlll, this.lllIIIllIIIIlllIlIIllIIll, (int)f, (int)f2, (Boolean)class_0283.lIllllIIlIIIlIllllllIIIll.getValue(), (Boolean)class_0283.IlIllllllIIlIIllllIIlIIIl.getValue());
            class_0624.lllIIIllIIIIlllIlIIllIIll();
            GL11.glDisable((int)32826);
            GL11.glDisable((int)3042);
            this.llIIlllIllIllllIIIlIIIIII.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(this.IIIllIIlIIIIIIlIlIIllIIlI + "\u00a7r", f + (float)this.lllIlIIlIIIlIlIIIllIlllIl + (float)this.lIlllIlllIIIIlIIlllIllIII, f2, 0xFFFFFF);
            this.llIIlllIllIllllIIIlIIIIII.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(this.IIIllIllIIlIlIlIlIllllIIl + "\u00a7r", f + (float)this.lllIlIIlIIIlIlIIIllIlllIl + (float)this.lIlllIlllIIIIlIIlllIllIII, f2 + (float)((Boolean)class_0283.lllIlIIlIIIlIlIIIllIlllIl.getValue() != false ? this.lIllllIIlIIIlIllllllIIIll / 2 : this.lIllllIIlIIIlIllllllIIIll / 4), 0xFFFFFF);
        }
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }
}

