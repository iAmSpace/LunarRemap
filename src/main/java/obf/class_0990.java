package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.awt.Color;

import net.minecraft.util.ResourceLocation;
import com.moonsworth.lunar.client.config.Setting;
import com.moonsworth.lunar.client.LunarClient;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class class_0990
extends class_2117 {
    private Setting lllIIIllIIIIlllIlIIllIIll;
    private ResourceLocation IllIIlllllllIIlIIlIIIIlIl = new ResourceLocation("client/icons/left.png");
    private ResourceLocation IIIllIllIIlIlIlIlIllllIIl = new ResourceLocation("client/icons/right.png");
    private int IllIIIllIIIIlIlIlIllIIlll = 0;
    private float lIIIIlIlIIlllllIIllIIlIII = 0.0f;
    private String llIIlllIllIllllIIIlIIIIII;

    public class_0990(Setting class_16092, float f) {
        super(f);
        this.lllIIIllIIIIlllIlIIllIIll = class_16092;
        this.IIIllIIlIIIIIIlIlIIllIIlI = 12;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
        boolean bl = (float)n > (float)(this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll - 48) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n < (float)(this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll - 10) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n2 > (float)(this.IlIIIIIllllllIIlllIllllll + this.IlIllllllIIlIIllllIIlIIIl) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n2 < (float)(this.IlIIIIIllllllIIlllIllllll + 10 + this.IlIllllllIIlIIllllIIlIIIl) * this.lllIlIIlIIIlIlIIIllIlllIl;
        boolean bl2 = (float)n > (float)(this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll - 92) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n < (float)(this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll - 48) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n2 > (float)(this.IlIIIIIllllllIIlllIllllll + this.IlIllllllIIlIIllllIIlIIIl) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n2 < (float)(this.IlIIIIIllllllIIlllIllllll + 10 + this.IlIllllllIIlIIllllIIlIIIl) * this.lllIlIIlIIIlIlIIIllIlllIl;
        LunarClient.getInstance().ubuntuMedium16px.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll.getName().toUpperCase(), this.lIlllIlllIIIIlIIlllIllIII + 10, (float)(this.IlIIIIIllllllIIlllIllllll + 2), bl2 || bl ? Color.WHITE.getRGB() : Color.LIGHT_GRAY.getRGB());
        if (this.IllIIIllIIIIlIlIlIllIIlll == 0) {
            LunarClient.getInstance().ubuntuMedium16px.lllIlIIlIIIlIlIIIllIlllIl((Boolean)this.lllIIIllIIIIlllIlIIllIIll.getValue() != false ? "ON" : "OFF", this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll - 48, this.IlIIIIIllllllIIlllIllllll + 2, Color.WHITE.getRGB());
        } else {
            boolean bl3 = this.IllIIIllIIIIlIlIlIllIIlll == 1;
            LunarClient.getInstance().ubuntuMedium16px.lllIlIIlIIIlIlIIIllIlllIl(this.llIIlllIllIllllIIIlIIIIII, (float)(this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll - 48) - (bl3 ? -this.lIIIIlIlIIlllllIIllIIlIII : this.lIIIIlIlIIlllllIIllIIlIII), this.IlIIIIIllllllIIlllIllllll + 2, Color.LIGHT_GRAY.getRGB());
            if (bl3) {
                LunarClient.getInstance().ubuntuMedium16px.lllIlIIlIIIlIlIIIllIlllIl((Boolean)this.lllIIIllIIIIlllIlIIllIIll.getValue() != false ? "ON" : "OFF", (float)(this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll - 98) + this.lIIIIlIlIIlllllIIllIIlIII, this.IlIIIIIllllllIIlllIllllll + 2, Color.LIGHT_GRAY.getRGB());
            } else {
                LunarClient.getInstance().ubuntuMedium16px.lllIlIIlIIIlIlIIIllIlllIl((Boolean)this.lllIIIllIIIIlllIlIIllIIll.getValue() != false ? "ON" : "OFF", (float)(this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll + 2) - this.lIIIIlIlIIlllllIIllIIlIII, this.IlIIIIIllllllIIlllIllllll + 2, Color.LIGHT_GRAY.getRGB());
            }
            if (this.lIIIIlIlIIlllllIIllIIlIII >= 50.0f) {
                this.IllIIIllIIIIlIlIlIllIIlll = 0;
                this.lIIIIlIlIIlllllIIllIIlIII = 0.0f;
            } else {
                float f2 = class_0822.lllIIIllIIIIlllIlIIllIIll(50.0f + this.lIIIIlIlIIlllllIIllIIlIII * 15.0f);
                this.lIIIIlIlIIlllllIIllIIlIII = this.lIIIIlIlIIlllllIIllIIlIII + f2 >= 50.0f ? 50.0f : (this.lIIIIlIlIIlllllIIllIIlIII += f2);
            }
        }
        GL11.glColor4f((float)(bl2 ? 1.0f : 0.0f), (float)(bl2 ? 1.0f : 0.0f), (float)(bl2 ? 1.0f : 0.0f), (float)0.5f);
        class_0857.lllIIIllIIIIlllIlIIllIIll(this.IllIIlllllllIIlIIlIIIIlIl, 4.0f, (float)(this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll - 82), (float)(this.IlIIIIIllllllIIlllIllllll + 3));
        GL11.glColor4f((float)(bl ? 1.0f : 0.0f), (float)(bl ? 1.0f : 0.0f), (float)(bl ? 1.0f : 0.0f), (float)0.5f);
        class_0857.lllIIIllIIIIlllIlIIllIIll(this.IIIllIllIIlIlIlIlIllllIIl, 4.0f, (float)(this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll - 22), (float)(this.IlIIIIIllllllIIlllIllllll + 3));
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        boolean bl;
        boolean bl2 = (float)n > (float)(this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll - 48) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n < (float)(this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll - 10) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n2 > (float)(this.IlIIIIIllllllIIlllIllllll + this.IlIllllllIIlIIllllIIlIIIl) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n2 < (float)(this.IlIIIIIllllllIIlllIllllll + 10 + this.IlIllllllIIlIIllllIIlIIIl) * this.lllIlIIlIIIlIlIIIllIlllIl;
        boolean bl3 = bl = (float)n > (float)(this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll - 92) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n < (float)(this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll - 48) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n2 > (float)(this.IlIIIIIllllllIIlllIllllll + this.IlIllllllIIlIIllllIIlIIIl) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n2 < (float)(this.IlIIIIIllllllIIlllIllllll + 10 + this.IlIllllllIIlIIllllIIlIIIl) * this.lllIlIIlIIIlIlIIIllIlllIl;
        if ((bl || bl2) && this.IllIIIllIIIIlIlIlIllIIlll == 0) {
            this.IllIIIllIIIIlIlIlIllIIlll = bl ? 1 : 2;
            this.lIIIIlIlIIlllllIIllIIlIII = 0.0f;
            this.llIIlllIllIllllIIIlIIIIII = (Boolean)this.lllIIIllIIIIlllIlIIllIIll.getValue() != false ? "ON" : "OFF";
            Minecraft.getMinecraft().IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
            this.lllIIIllIIIIlllIlIIllIIll.setValue((Boolean)this.lllIIIllIIIIlllIlIIllIIll.getValue() == false);
            if (this.lllIIIllIIIIlllIlIIllIIll == LunarClient.getInstance().getModuleManager().IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll) {
                LunarClient.getInstance().getModuleManager().IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll();
            } else if (this.lllIIIllIIIIlllIlIIllIIll == LunarClient.getInstance().getSettingsManager().tvEnableTeamView && !((Boolean) LunarClient.getInstance().getSettingsManager().tvEnableTeamView.getValue()).booleanValue()) {
                LunarClient.getInstance().getModuleManager().IIlllIlIlllIllIIIlllIIlIl.lllIIIllIIIIlllIlIIllIIll(false);
            }
        }
    }
}

