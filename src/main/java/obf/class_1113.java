package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.util.List;

import com.moonsworth.lunar.client.LunarClient;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import org.lwjgl.opengl.GL11;

public class class_1113
extends class_2117 {
    private String lllIIIllIIIIlllIlIIllIIll;
    private List IllIIlllllllIIlIIlIIIIlIl;
    private class_1785 IIIllIllIIlIlIlIlIllllIIl = new class_1785();

    public class_1113(List list, String string, float f) {
        super(f);
        this.IIIllIIlIIIIIIlIlIIllIIlI = 220;
        this.IllIIlllllllIIlIIlIIIIlIl = list;
        this.lllIIIllIIIIlllIlIIllIIll = string;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
        LunarClient.getInstance().ubuntuMedium16px.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll.toUpperCase(), this.lIlllIlllIIIIlIIlllIllIII + 10, (float)(this.IlIIIIIllllllIIlllIllllll + 2), -1895825408);
        Minecraft class_06672 = Minecraft.getMinecraft();
        List list = LunarClient.getInstance().getModuleManager().lllllIlllIIllIlIIlIIIllII.llIIlIllIllllIlIIIIlIIlll();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glEnable((int)32826);
        class_0624.lllIlIIlIIIlIlIIIllIlllIl();
        class_0624.IlIllllllIIlIIllllIIlIIIl();
        int n3 = 0;
        int n4 = 0;
        for (Block class_05492 : Block.blockRegistry) {
            boolean bl;
            Item class_06112 = Item.getItemFromBlock(class_05492);
            if (class_06112 == null) continue;
            if (n3 >= 15) {
                n3 = 0;
                ++n4;
            }
            int n5 = this.lIlllIlllIIIIlIIlllIllIII + 12 + n3 * 20;
            int n6 = this.IlIIIIIllllllIIlllIllllll + 14 + n4 * 20;
            boolean bl2 = bl = (float)n > (float)(n5 - 2) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n < (float)(n5 + 18) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n2 > (float)(n6 - 2 + this.IlIllllllIIlIIllllIIlIIIl) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n2 < (float)(n6 + 18 + this.IlIllllllIIlIIllllIIlIIIl) * this.lllIlIIlIIIlIlIIIllIlllIl;
            if (list.contains(Item.lllIIIllIIIIlllIlIIllIIll(class_06112))) {
                class_0210.lllIIIllIIIIlllIlIIllIIll(n5 - 2, n6 - 2, n5 + 18, n6 + 18, 0x7F00FF00);
            } else if (bl) {
                class_0210.lllIIIllIIIIlllIlIIllIIll(n5 - 2, n6 - 2, n5 + 18, n6 + 18, 0x4F0000FF);
            }
            this.IIIllIllIIlIlIlIlIllllIIl.lllIlIIlIIIlIlIIIllIlllIl(class_06672.IlIlllIIIIIIlIIllIIllIlll, class_06672.llIIlIIllIIllIlIIllIIllII(), new ItemStack(class_06112), n5, n6);
            ++n3;
        }
        class_0624.lllIIIllIIIIlllIlIIllIIll();
        GL11.glDisable((int)32826);
        GL11.glDisable((int)3042);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n3, int n4) {
        try {
            List list = LunarClient.getInstance().getModuleManager().lllllIlllIIllIlIIlIIIllII.llIIlIllIllllIlIIIIlIIlll();
            int n5 = 0;
            int n6 = 0;
            for (Block class_05492 : Block.blockRegistry) {
                boolean bl;
                Item class_06112 = Item.getItemFromBlock(class_05492);
                if (class_06112 == null) continue;
                if (n5 >= 15) {
                    n5 = 0;
                    ++n6;
                }
                int n7 = this.lIlllIlllIIIIlIIlllIllIII + 12 + n5 * 20;
                int n8 = this.IlIIIIIllllllIIlllIllllll + 14 + n6 * 20;
                boolean bl2 = bl = (float)n > (float)(n7 - 2) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n < (float)(n7 + 18) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n3 > (float)(n8 - 2 + this.IlIllllllIIlIIllllIIlIIIl) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n3 < (float)(n8 + 18 + this.IlIllllllIIlIIllllIIlIIIl) * this.lllIlIIlIIIlIlIIIllIlllIl;
                if (bl && n4 == 0) {
                    int n9 = Item.lllIIIllIIIIlllIlIIllIIll(class_06112);
                    if (list.contains(n9)) {
                        LunarClient.getInstance().getModuleManager().lllllIlllIIllIlIIlIIIllII.llIIlIllIllllIlIIIIlIIlll().removeIf(n2 -> n2 == n9);
                    } else {
                        LunarClient.getInstance().getModuleManager().lllllIlllIIllIlIIlIIIllII.llIIlIllIllllIlIIIIlIIlll().add(n9);
                    }
                    if (LunarClient.getInstance().getModuleManager().lllllIlllIIllIlIIlIIIllII.lIllllIIlIIIlIllllllIIIll()) {
                        Minecraft.getMinecraft().IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll();
                    }
                    Minecraft.getMinecraft().IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
                }
                ++n5;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}

