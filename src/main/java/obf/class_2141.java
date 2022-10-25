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

public class class_2141
extends class_2117 {
    private Setting lllIIIllIIIIlllIlIIllIIll;
    private ResourceLocation IllIIlllllllIIlIIlIIIIlIl = new ResourceLocation("client/icons/left.png");
    private ResourceLocation IIIllIllIIlIlIlIlIllllIIl = new ResourceLocation("client/icons/right.png");
    private int IllIIIllIIIIlIlIlIllIIlll = 0;
    private float lIIIIlIlIIlllllIIllIIlIII = 0.0f;
    private String llIIlllIllIllllIIIlIIIIII;

    public class_2141(Setting class_16092, float f) {
        super(f);
        this.lllIIIllIIIIlllIlIIllIIll = class_16092;
        this.IIIllIIlIIIIIIlIlIIllIIlI = 12;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
        boolean bl = (float)n > (float)(this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll - 48) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n < (float)(this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll - 10) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n2 > (float)(this.IlIIIIIllllllIIlllIllllll + this.IlIllllllIIlIIllllIIlIIIl) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n2 < (float)(this.IlIIIIIllllllIIlllIllllll + 10 + this.IlIllllllIIlIIllllIIlIIIl) * this.lllIlIIlIIIlIlIIIllIlllIl;
        boolean bl2 = (float)n > (float)(this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll - 92) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n < (float)(this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll - 48) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n2 > (float)(this.IlIIIIIllllllIIlllIllllll + this.IlIllllllIIlIIllllIIlIIIl) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n2 < (float)(this.IlIIIIIllllllIIlllIllllll + 10 + this.IlIllllllIIlIIllllIIlIIIl) * this.lllIlIIlIIIlIlIIIllIlllIl;
        LunarClient.getInstance().ubuntuMedium16px.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll.getName().toUpperCase(), this.lIlllIlllIIIIlIIlllIllIII + 10, (float)(this.IlIIIIIllllllIIlllIllllll + 2), bl2 || bl ? Color.WHITE.getRGB() : Color.LIGHT_GRAY.getRGB());
        boolean bl3 = this.lllIIIllIIIIlllIlIIllIIll.getName().toLowerCase().endsWith("color");
        if (!bl3) {
            if (this.IllIIIllIIIIlIlIlIllIIlll == 0) {
                LunarClient.getInstance().ubuntuMedium16px.lllIlIIlIIIlIlIIIllIlllIl((String)this.lllIIIllIIIIlllIlIIllIIll.getValue(), this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll - 48, this.IlIIIIIllllllIIlllIllllll + 2, Color.WHITE.getRGB());
            } else {
                boolean bl4 = this.IllIIIllIIIIlIlIlIllIIlll == 1;
                LunarClient.getInstance().ubuntuMedium16px.lllIlIIlIIIlIlIIIllIlllIl(this.llIIlllIllIllllIIIlIIIIII, (float)(this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll - 48) - (bl4 ? -this.lIIIIlIlIIlllllIIllIIlIII : this.lIIIIlIlIIlllllIIllIIlIII), this.IlIIIIIllllllIIlllIllllll + 2, Color.WHITE.getRGB());
                if (bl4) {
                    LunarClient.getInstance().ubuntuMedium16px.lllIlIIlIIIlIlIIIllIlllIl((String)this.lllIIIllIIIIlllIlIIllIIll.getValue(), (float)(this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll - 98) + this.lIIIIlIlIIlllllIIllIIlIII, this.IlIIIIIllllllIIlllIllllll + 2, Color.WHITE.getRGB());
                } else {
                    LunarClient.getInstance().ubuntuMedium16px.lllIlIIlIIIlIlIIIllIlllIl((String)this.lllIIIllIIIIlllIlIIllIIll.getValue(), (float)(this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll + 2) - this.lIIIIlIlIIlllllIIllIIlIII, this.IlIIIIIllllllIIlllIllllll + 2, Color.WHITE.getRGB());
                }
                if (this.lIIIIlIlIIlllllIIllIIlIII >= 50.0f) {
                    this.IllIIIllIIIIlIlIlIllIIlll = 0;
                    this.lIIIIlIlIIlllllIIllIIlIII = 0.0f;
                } else {
                    float f2 = class_0822.lllIIIllIIIIlllIlIIllIIll(50.0f + this.lIIIIlIlIIlllllIIllIIlIII * 15.0f);
                    this.lIIIIlIlIIlllllIIllIIlIII = this.lIIIIlIlIIlllllIIllIIlIII + f2 >= 50.0f ? 50.0f : (this.lIIIIlIlIIlllllIIllIIlIII += f2);
                }
            }
        } else if (this.IllIIIllIIIIlIlIlIllIIlll == 0) {
            float f3 = LunarClient.getInstance().ubuntuMedium16px.lllIlIIlIIIlIlIIIllIlllIl((String)this.lllIIIllIIIIlllIlIIllIIll.getValue());
            LunarClient.getInstance().ubuntuMedium16px.lllIIIllIIIIlllIlIIllIIll((String)this.lllIIIllIIIIlllIlIIllIIll.getValue(), (float)(this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll) - 47.5f - f3 / 2.0f, (float)this.IlIIIIIllllllIIlllIllllll + 2.5f, Color.WHITE.getRGB());
            LunarClient.getInstance().ubuntuMedium16px.lllIIIllIIIIlllIlIIllIIll("\u00a7" + (String)this.lllIIIllIIIIlllIlIIllIIll.getValue() + (String)this.lllIIIllIIIIlllIlIIllIIll.getValue(), (float)(this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll - 48) - f3 / 2.0f, (float)(this.IlIIIIIllllllIIlllIllllll + 2), Color.WHITE.getRGB());
        } else {
            boolean bl5 = this.IllIIIllIIIIlIlIlIllIIlll == 1;
            LunarClient.getInstance().ubuntuMedium16px.lllIlIIlIIIlIlIIIllIlllIl(this.llIIlllIllIllllIIIlIIIIII, (float)(this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll - 48) - (bl5 ? -this.lIIIIlIlIIlllllIIllIIlIII : this.lIIIIlIlIIlllllIIllIIlIII), this.IlIIIIIllllllIIlllIllllll + 2, Color.WHITE.getRGB());
            float f4 = LunarClient.getInstance().ubuntuMedium16px.lllIlIIlIIIlIlIIIllIlllIl((String)this.lllIIIllIIIIlllIlIIllIIll.getValue());
            if (bl5) {
                LunarClient.getInstance().ubuntuMedium16px.lllIIIllIIIIlllIlIIllIIll((String)this.lllIIIllIIIIlllIlIIllIIll.getValue(), (float)(this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll) - 97.5f - f4 / 2.0f + this.lIIIIlIlIIlllllIIllIIlIII, (float)this.IlIIIIIllllllIIlllIllllll + 2.5f, Color.WHITE.getRGB());
                LunarClient.getInstance().ubuntuMedium16px.lllIIIllIIIIlllIlIIllIIll("\u00a7" + (String)this.lllIIIllIIIIlllIlIIllIIll.getValue() + (String)this.lllIIIllIIIIlllIlIIllIIll.getValue(), (float)(this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll - 98) - f4 / 2.0f + this.lIIIIlIlIIlllllIIllIIlIII, (float)(this.IlIIIIIllllllIIlllIllllll + 2), Color.WHITE.getRGB());
            } else {
                LunarClient.getInstance().ubuntuMedium16px.lllIIIllIIIIlllIlIIllIIll((String)this.lllIIIllIIIIlllIlIIllIIll.getValue(), (float)(this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll) - 1.5f - f4 / 2.0f - this.lIIIIlIlIIlllllIIllIIlIII, (float)this.IlIIIIIllllllIIlllIllllll + 2.5f, Color.WHITE.getRGB());
                LunarClient.getInstance().ubuntuMedium16px.lllIIIllIIIIlllIlIIllIIll("\u00a7" + (String)this.lllIIIllIIIIlllIlIIllIIll.getValue() + (String)this.lllIIIllIIIIlllIlIIllIIll.getValue(), (float)(this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll - 2) - f4 / 2.0f - this.lIIIIlIlIIlllllIIllIIlIII, (float)(this.IlIIIIIllllllIIlllIllllll + 2), Color.WHITE.getRGB());
            }
            if (this.lIIIIlIlIIlllllIIllIIlIII >= 50.0f) {
                this.IllIIIllIIIIlIlIlIllIIlll = 0;
                this.lIIIIlIlIIlllllIIllIIlIII = 0.0f;
            } else {
                float f5 = class_0822.lllIIIllIIIIlllIlIIllIIll(50.0f + this.lIIIIlIlIIlllllIIllIIlIII * 15.0f);
                this.lIIIIlIlIIlllllIIllIIlIII = this.lIIIIlIlIIlllllIIllIIlIII + f5 >= 50.0f ? 50.0f : (this.lIIIIlIlIIlllllIIllIIlIII += f5);
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
            Minecraft.getMinecraft().IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
            for (int i = 0; i < ((String[])this.lllIIIllIIIIlllIlIIllIIll.IllIIlllllllIIlIIlIIIIlIl()).length; ++i) {
                if (!((String[])this.lllIIIllIIIIlllIlIIllIIll.IllIIlllllllIIlIIlIIIIlIl())[i].toLowerCase().equalsIgnoreCase((String)this.lllIIIllIIIIlllIlIIllIIll.getValue())) continue;
                this.llIIlllIllIllllIIIlIIIIII = (String)this.lllIIIllIIIIlllIlIIllIIll.getValue();
                if (bl2) {
                    if (i + 1 >= ((String[])this.lllIIIllIIIIlllIlIIllIIll.IllIIlllllllIIlIIlIIIIlIl()).length) {
                        this.IllIIIllIIIIlIlIlIllIIlll = 2;
                        this.lllIIIllIIIIlllIlIIllIIll.setValue(((String[])this.lllIIIllIIIIlllIlIIllIIll.IllIIlllllllIIlIIlIIIIlIl())[0]);
                        break;
                    }
                    this.IllIIIllIIIIlIlIlIllIIlll = 2;
                    this.lllIIIllIIIIlllIlIIllIIll.setValue(((String[])this.lllIIIllIIIIlllIlIIllIIll.IllIIlllllllIIlIIlIIIIlIl())[i + 1]);
                    break;
                }
                if (!bl) continue;
                if (i - 1 < 0) {
                    this.IllIIIllIIIIlIlIlIllIIlll = 1;
                    this.lllIIIllIIIIlllIlIIllIIll.setValue(((String[])this.lllIIIllIIIIlllIlIIllIIll.IllIIlllllllIIlIIlIIIIlIl())[((String[])this.lllIIIllIIIIlllIlIIllIIll.IllIIlllllllIIlIIlIIIIlIl()).length - 1]);
                    break;
                }
                this.IllIIIllIIIIlIlIlIllIIlll = 1;
                this.lllIIIllIIIIlllIlIIllIIll.setValue(((String[])this.lllIIIllIIIIlllIlIIllIIll.IllIIlllllllIIlIIlIIIIlIl())[i - 1]);
                break;
            }
            if (this.lllIIIllIIIIlllIlIIllIIll == LunarClient.getInstance().getSettingsManager().rsClearGlass) {
                Minecraft.getMinecraft().IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll();
            }
        }
    }
}

