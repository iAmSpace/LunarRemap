package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.moonsworth.client.nethandler.LCPacket
 *  com.moonsworth.client.nethandler.client.LCPacketVoiceChannelSwitch
 *  com.moonsworth.client.nethandler.client.LCPacketVoiceMute
 *  org.lwjgl.opengl.GL11
 */
import com.google.common.collect.Lists;
import net.minecraft.util.ResourceLocation;
import com.moonsworth.client.nethandler.LCPacket;
import com.moonsworth.client.nethandler.client.LCPacketVoiceChannelSwitch;
import com.moonsworth.client.nethandler.client.LCPacketVoiceMute;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.moonsworth.lunar.client.LunarClient;
import org.lwjgl.opengl.GL11;

public class class_1470
extends class_0935 {
    private static LunarClient lllIIIllIIIIlllIlIIllIIll = LunarClient.getInstance();
    private List lllIlIIlIIIlIlIIIllIlllIl;
    private class_0944 lIllllIIlIIIlIllllllIIIll;
    private class_0944 IIIllIIlIIIIIIlIlIIllIIlI;
    private class_1950 IllIIlllllllIIlIIlIIIIlIl = null;
    private ResourceLocation IIIllIllIIlIlIlIlIllllIIl = new ResourceLocation("client/icons/headphones.png");
    private ResourceLocation IllIIIllIIIIlIlIlIllIIlll = new ResourceLocation("client/icons/speaker.png");
    private ResourceLocation lIIIIlIlIIlllllIIllIIlIII = new ResourceLocation("client/icons/speaker-mute.png");
    private ResourceLocation lIlllIlllIlIIIIlllIlIlIIl = new ResourceLocation("client/icons/microphone-64.png");

    @Override
    public void n_() {
        this.lIlIlIIlIIIIlIIIIIlllIIII();
        if (lllIIIllIIIIlllIlIIllIIll.getNetworkManager().lIlllIlllIIIIlIIlllIllIII() && lllIIIllIIIIlllIlIIllIIll.getNetworkManager().IlIIIIIllllllIIlllIllllll() != null) {
            this.IllIIlllllllIIlIIlIIIIlIl = lllIIIllIIIIlllIlIIllIIll.getNetworkManager().lIllllIIlIIIlIllllllIIIll();
            boolean bl = lllIIIllIIIIlllIlIIllIIll.getNetworkManager().IllIIlllllllIIlIIlIIIIlIl().contains(this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII.lIIlIlllIIlIIIIlIlIIIIlll().getId());
            this.lIllllIIlIIIlIllllllIIIll = new class_0944("Join Channel");
            this.IIIllIIlIIIIIIlIlIIllIIlI = new class_0944(bl ? "Un-deafen" : "Deafen");
            this.lllIlIIlIIIlIlIIIllIlllIl = new ArrayList();
            float f = 16.0f;
            float f2 = this.lIllllIIlIIIlIllllllIIIll() / 8.0f;
            float f3 = this.IIIllIIlIIIIIIlIlIIllIIlI() / 2.0f - 8.0f - f * (float)lllIIIllIIIIlllIlIIllIIll.getNetworkManager().IlIIIIIllllllIIlllIllllll().size() / 2.0f;
            int n = 0;
            for (class_1950 class_19502 : lllIIIllIIIIlllIlIIllIIll.getNetworkManager().IlIIIIIllllllIIlllIllllll()) {
                class_0944 class_09442 = new class_0944(class_19502.lllIlIIlIIIlIlIIIllIlllIl());
                this.lllIlIIlIIIlIlIIIllIlllIl.add(class_09442);
                class_09442.lllIIIllIIIIlllIlIIllIIll(f2, f3 + 12.0f + f * (float)n, 110.0f, 12.0f);
                if (this.IllIIlllllllIIlIIlIIIIlIl == class_19502) {
                    class_09442.IIIllIllIIlIlIlIlIllllIIl();
                }
                ++n;
            }
        }
    }

    @Override
    public void o_() {
        this.lllllIlllIIllIlIIlIIIllII.lIIlIIIIIlIlllIlIIlIlIlll.IlIllllllIIlIIllllIIlIIIl();
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(float f, float f2) {
        this.lllIlIIlIIIlIlIIIllIlllIl(this.lIllllIIlIIIlIllllllIIIll(), this.IIIllIIlIIIIIIlIlIIllIIlI());
        float f3 = this.lIllllIIlIIIlIllllllIIIll() / 8.0f;
        if (lllIIIllIIIIlllIlIIllIIll.getNetworkManager().lIlllIlllIIIIlIIlllIllIII() && lllIIIllIIIIlllIlIIllIIll.getNetworkManager().IlIIIIIllllllIIlllIllllll() != null) {
            float f4 = 16.0f;
            float f5 = this.IIIllIIlIIIIIIlIlIIllIIlI() / 2.0f - 8.0f - f4 * (float)lllIIIllIIIIlllIlIIllIIll.getNetworkManager().IlIIIIIllllllIIlllIllllll().size() / 2.0f;
            class_1470.lllIIIllIIIIlllIlIIllIIll.robotoLight18px.lllIIIllIIIIlllIlIIllIIll("VOICE CHAT", f3, f5 - 4.0f, -1);
            this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(f3 + 60.0f, f5 - 4.0f, 50.0f, 12.0f);
            this.IIIllIIlIIIIIIlIlIIllIIlI.lllIlIIlIIIlIlIIIllIlllIl(f, f2, true);
            this.lllIlIIlIIIlIlIIIllIlllIl.forEach(class_09442 -> {
                if (this.lllIIIllIIIIlllIlIIllIIll(class_09442.lIIIIlIlIIlllllIIllIIlIII()) == lllIIIllIIIIlllIlIIllIIll.getNetworkManager().lIllllIIlIIIlIllllllIIIll()) {
                    class_09442.lIlllIlllIIIIlIIlllIllIII(f, f2, true);
                    float f3 = class_09442.lIlllIlllIIIIlIIlllIllIII();
                    float f4 = class_09442.IlIIIIIllllllIIlllIllllll();
                    class_0857.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("client/icons/microphone-64.png"), f3 + 4.0f, f4 + 2.0f, 8.0f, 8.0f);
                } else if (this.IllIIlllllllIIlIIlIIIIlIl != null && this.IllIIlllllllIIlIIlIIIIlIl.lllIlIIlIIIlIlIIIllIlllIl().equals(class_09442.lIIIIlIlIIlllllIIllIIlIII())) {
                    class_09442.IlIllllllIIlIIllllIIlIIIl(f, f2, true);
                } else {
                    class_09442.lllIlIIlIIIlIlIIIllIlllIl(f, f2, true);
                }
            });
            if (this.IllIIlllllllIIlIIlIIIIlIl != null) {
                this.lllIIIllIIIIlllIlIIllIIll(f, f2, f3 + 130.0f, this.IIIllIIlIIIIIIlIlIIllIIlI() / 2.0f);
            }
        } else {
            float f6 = this.IIIllIIlIIIIIIlIlIIllIIlI() / 2.0f - 8.0f;
            class_1470.lllIIIllIIIIlllIlIIllIIll.robotoLight18px.lllIIIllIIIIlllIlIIllIIll("VOICE CHAT IS NOT SUPPORTED", f3, f6, -1);
        }
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(float f, float f2, int n) {
        if (this.lllIlIIlIIIlIlIIIllIlllIl == null) {
            return;
        }
        for (class_0944 class_09442 : this.lllIlIIlIIIlIlIIIllIlllIl) {
            class_1950 class_19502;
            if (!class_09442.lllIIIllIIIIlllIlIIllIIll(f, f2) || this.IllIIlllllllIIlIIlIIIIlIl == (class_19502 = this.lllIIIllIIIIlllIlIIllIIll(class_09442.lIIIIlIlIIlllllIIllIIlIII()))) continue;
            for (class_0944 class_09443 : this.lllIlIIlIIIlIlIIIllIlllIl) {
                if (this.IllIIlllllllIIlIIlIIIIlIl == lllIIIllIIIIlllIlIIllIIll.getNetworkManager().lIllllIIlIIIlIllllllIIIll() || !class_09443.lIIIIlIlIIlllllIIllIIlIII().equals(this.IllIIlllllllIIlIIlIIIIlIl.lllIlIIlIIIlIlIIIllIlllIl())) continue;
                class_09443.IllIIIllIIIIlIlIlIllIIlll();
            }
            this.lllllIlllIIllIlIIlIIIllII.IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
            this.IllIIlllllllIIlIIlIIIIlIl = class_19502;
            if (this.IllIIlllllllIIlIIlIIIIlIl == lllIIIllIIIIlllIlIIllIIll.getNetworkManager().lIllllIIlIIIlIllllllIIIll()) continue;
            class_09442.IllIIlllllllIIlIIlIIIIlIl();
        }
        if (this.IllIIlllllllIIlIIlIIIIlIl != null) {
            if (this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(f, f2)) {
                this.lllllIlllIIllIlIIlIIIllII.IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
                lllIIIllIIIIlllIlIIllIIll.getNetworkManager().lllIIIllIIIIlllIlIIllIIll((LCPacket)new LCPacketVoiceChannelSwitch(this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll()));
                for (class_0944 class_09442 : this.lllIlIIlIIIlIlIIIllIlllIl) {
                    class_09442.IllIIIllIIIIlIlIlIllIIlll();
                }
                for (class_0944 class_09442 : this.lllIlIIlIIIlIlIIIllIlllIl) {
                    if (!class_09442.lIIIIlIlIIlllllIIllIIlIII().equals(this.IllIIlllllllIIlIIlIIIIlIl.lllIlIIlIIIlIlIIIllIlllIl())) continue;
                    class_09442.IIIllIllIIlIlIlIlIllllIIl();
                }
            }
            if (this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(f, f2)) {
                boolean bl;
                Iterator iterator = this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII.lIIlIlllIIlIIIIlIlIIIIlll().getId();
                this.lllllIlllIIllIlIIlIIIllII.IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
                lllIIIllIIIIlllIlIIllIIll.getNetworkManager().lllIIIllIIIIlllIlIIllIIll((LCPacket)new LCPacketVoiceMute(iterator));
                if (!lllIIIllIIIIlllIlIIllIIll.getNetworkManager().IllIIlllllllIIlIIlIIIIlIl().removeIf(uUID2 -> uUID2.equals(iterator))) {
                    lllIIIllIIIIlllIlIIllIIll.getNetworkManager().IllIIlllllllIIlIIlIIIIlIl().add(iterator);
                }
                this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll((bl = lllIIIllIIIIlllIlIIllIIll.getNetworkManager().IllIIlllllllIIlIIlIIIIlIl().contains(this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII.lIIlIlllIIlIIIIlIlIIIIlll().getId())) ? "Un-deafen" : "Deafen");
            }
            this.lllIlIIlIIIlIlIIIllIlllIl(f, f2, this.lIllllIIlIIIlIllllllIIIll() / 8.0f + 130.0f, this.IIIllIIlIIIIIIlIlIIllIIlI() / 2.0f);
        }
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(float f, float f2, int n) {
    }

    private void lllIIIllIIIIlllIlIIllIIll(float f, float f2, float f3, float f4) {
        float f5 = 14.0f;
        float f6 = (float)this.IllIIlllllllIIlIIlIIIIlIl.IlIllllllIIlIIllllIIlIIIl().size() * f5;
        class_1470.lllIIIllIIIIlllIlIIllIIll.robotoLight18px.lllIIIllIIIIlllIlIIllIIll(this.IllIIlllllllIIlIIlIIIIlIl.lllIlIIlIIIlIlIIIllIlllIl(), f3, (f4 -= f6 / 2.0f) - 14.0f, -1);
        if (!this.llIIllIllIlIIlIIllIllllll()) {
            this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(f3 + 125.0f, f4 - 14.0f, 50.0f, 12.0f);
            this.lIllllIIlIIIlIllllllIIIll.lllIlIIlIIIlIlIIIllIlllIl(f, f2, true);
        }
        class_0210.lllIIIllIIIIlllIlIIllIIll(f3, f4, f3 + 175.0f, f4 + f6, -1626337264);
        int n = 0;
        ArrayList arrayList = Lists.newArrayList((Iterable)this.IllIIlllllllIIlIIlIIIIlIl.IlIllllllIIlIIllllIIlIIIl());
        arrayList.sort((class_07542, class_07543) -> {
            if (this.IllIIlllllllIIlIIlIIIIlIl.IlIllllllIIlIIllllIIlIIIl(class_07542.lllIIIllIIIIlllIlIIllIIll()) && !this.IllIIlllllllIIlIIlIIIIlIl.IlIllllllIIlIIllllIIlIIIl(class_07543.lllIIIllIIIIlllIlIIllIIll())) {
                return -1;
            }
            if (!this.IllIIlllllllIIlIIlIIIIlIl.IlIllllllIIlIIllllIIlIIIl(class_07542.lllIIIllIIIIlllIlIIllIIll()) && this.IllIIlllllllIIlIIlIIIIlIl.IlIllllllIIlIIllllIIlIIIl(class_07543.lllIIIllIIIIlllIlIIllIIll())) {
                return 1;
            }
            return 0;
        });
        for (class_0754 class_07544 : arrayList) {
            boolean bl = this.IllIIlllllllIIlIIlIIIIlIl.IlIllllllIIlIIllllIIlIIIl(class_07544.lllIIIllIIIIlllIlIIllIIll());
            boolean bl2 = lllIIIllIIIIlllIlIIllIIll.getNetworkManager().IllIIlllllllIIlIIlIIIIlIl().contains(class_07544.lllIIIllIIIIlllIlIIllIIll());
            float f7 = f4 + (float)n * f5;
            float f8 = f3;
            boolean bl3 = f > f3 + 158.0f && f < f3 + 184.0f && f2 > f7 && f2 < f7 + f5;
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            if (!bl) {
                class_0857.lllIIIllIIIIlllIlIIllIIll(this.IIIllIllIIlIlIlIlIllllIIl, f8 + 4.0f, f7 + 3.0f, 8.0f, 8.0f);
            } else {
                class_0857.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIlIIIIlllIlIlIIl, f8 + 4.0f, f7 + 3.0f, 8.0f, 8.0f);
            }
            f8 = f3 + 10.0f;
            if (!class_07544.lllIIIllIIIIlllIlIIllIIll().equals(this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII.lIIlllIIlIlIlIIIlIlllIIll())) {
                if (bl2) {
                    GL11.glColor4f((float)1.0f, (float)0.1f, (float)0.1f, (float)(bl3 ? 1.0f : 0.6f));
                    class_0857.lllIIIllIIIIlllIlIIllIIll(this.lIIIIlIlIIlllllIIllIIlIII, f3 + 162.0f, f7 + 3.0f, 8.0f, 8.0f);
                } else {
                    GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)(bl3 ? 1.0f : 0.6f));
                    class_0857.lllIIIllIIIIlllIlIIllIIll(this.IllIIIllIIIIlIlIlIllIIlll, f3 + 162.0f, f7 + 3.0f, 8.0f, 8.0f);
                }
            }
            class_1470.lllIIIllIIIIlllIlIIllIIll.ubuntuMedium16px.lllIIIllIIIIlllIlIIllIIll(class_07544.lllIlIIlIIIlIlIIIllIlllIl().toUpperCase(), f8 + 6.0f, f7 + 2.0f, bl ? -1 : 0x6FFFFFFF);
            ++n;
        }
    }

    private void lllIlIIlIIIlIlIIIllIlllIl(float f, float f2, float f3, float f4) {
        float f5 = 14.0f;
        float f6 = (float)this.IllIIlllllllIIlIIlIIIIlIl.IlIllllllIIlIIllllIIlIIIl().size() * f5;
        f4 -= f6 / 2.0f;
        int n = 0;
        for (class_0754 class_07542 : this.IllIIlllllllIIlIIlIIIIlIl.IlIllllllIIlIIllllIIlIIIl()) {
            boolean bl;
            float f7 = f4 + (float)n * f5;
            boolean bl2 = bl = f > f3 + 158.0f && f < f3 + 184.0f && f2 > f7 && f2 < f7 + f5;
            if (!class_07542.lllIIIllIIIIlllIlIIllIIll().equals(this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII.lIIlllIIlIlIlIIIlIlllIIll()) && bl) {
                this.lllllIlllIIllIlIIlIIIllII.IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
                lllIIIllIIIIlllIlIIllIIll.getNetworkManager().lllIIIllIIIIlllIlIIllIIll((LCPacket)new LCPacketVoiceMute(class_07542.lllIIIllIIIIlllIlIIllIIll()));
                if (!lllIIIllIIIIlllIlIIllIIll.getNetworkManager().IllIIlllllllIIlIIlIIIIlIl().removeIf(uUID -> uUID.equals(class_07542.lllIIIllIIIIlllIlIIllIIll()))) {
                    lllIIIllIIIIlllIlIIllIIll.getNetworkManager().IllIIlllllllIIlIIlIIIIlIl().add(class_07542.lllIIIllIIIIlllIlIIllIIll());
                }
            }
            ++n;
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(char c, int n) {
        super.lllIIIllIIIIlllIlIIllIIll(c, n);
        if (n == 25 && llIIlIllIllllIlIIIIlIIlll.IlIIIIIllllllIIlllIllllll()) {
            if (((Boolean) LunarClient.getInstance().getSettingsManager().gsGuiBlur.getValue()).booleanValue()) {
                this.lllllIlllIIllIlIIlIIIllII.lIIlIIIIIlIlllIlIIlIlIlll.IlIllllllIIlIIllllIIlIIIl();
            }
            this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll((class_0229)null);
            this.lllllIlllIIllIlIIlIIIllII.lllIIlIIIllllllIIIIlIlIlI();
        }
    }

    private class_1950 lllIIIllIIIIlllIlIIllIIll(String string) {
        for (class_1950 class_19502 : lllIIIllIIIIlllIlIIllIIll.getNetworkManager().IlIIIIIllllllIIlllIllllll()) {
            if (!class_19502.lllIlIIlIIIlIlIIIllIlllIl().equals(string)) continue;
            return class_19502;
        }
        return null;
    }

    private boolean llIIllIllIlIIlIIllIllllll() {
        return this.IllIIlllllllIIlIIlIIIIlIl == lllIIIllIIIIlllIlIIllIIll.getNetworkManager().lIllllIIlIIIlIllllllIIIll();
    }
}

