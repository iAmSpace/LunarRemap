package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
import com.moonsworth.lunar.client.LunarClient;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;

public class class_1488 {
    private Minecraft lIllllIIlIIIlIllllllIIIll = Minecraft.getMinecraft();
    public boolean lllIIIllIIIIlllIlIIllIIll = false;
    public float lllIlIIlIIIlIlIIIllIlllIl;
    public float IlIllllllIIlIIllllIIlIIIl;
    public float lIlllIlllIIIIlIIlllIllIII;
    public float IlIIIIIllllllIIlllIllllll;
    private int IIIllIIlIIIIIIlIlIIllIIlI;

    public class_1488() {
        LunarClient.getInstance().getEventBus().addEvent(class_0312.class, class_03122 -> {
            if (this.lllIIIllIIIIlllIlIIllIIll && !Keyboard.isKeyDown((int) LunarClient.getInstance().getSettingsManager().keyDragToLook.IIIllIllIIlIlIlIlIllllIIl())) {
                this.lllIlIIlIIIlIlIIIllIlllIl();
            }
        });
    }

    public void lllIIIllIIIIlllIlIIllIIll() {
        this.lllIlIIlIIIlIlIIIllIlllIl = this.lIllllIIlIIIlIllllllIIIll.lIIIIlIlIIlllllIIllIIlIII.IIIIlIllIlIIlIIlIllIlIlll;
        this.lIlllIlllIIIIlIIlllIllIII = this.lIllllIIlIIIlIllllllIIIll.lIIIIlIlIIlllllIIllIIlIII.IlIlIIlllIllllllllIIIlIlI;
        this.IlIllllllIIlIIllllIIlIIIl = this.lIllllIIlIIIlIllllllIIIll.lIIIIlIlIIlllllIIllIIlIII.llllIIIIlIIIlIIIIIIlIllll;
        this.IlIIIIIllllllIIlllIllllll = this.lIllllIIlIIIlIllllllIIIll.lIIIIlIlIIlllllIIllIIlIII.llIIIIllIIIIIIIlIIIlIIIIl;
        this.IIIllIIlIIIIIIlIlIIllIIlI = this.lIllllIIlIIIlIllllllIIIll.gameSettings.IIlIlIlIIlllIIIlIIIIlIIIl;
        switch ((String) LunarClient.getInstance().getSettingsManager().gsLookView.getValue()) {
            case "Third": {
                this.lIllllIIlIIIlIllllllIIIll.gameSettings.IIlIlIlIIlllIIIlIIIIlIIIl = 1;
                break;
            }
            case "Reverse": {
                this.lIllllIIlIIIlIllllllIIIll.gameSettings.IIlIlIlIIlllIIIlIIIIlIIIl = 2;
                break;
            }
            default: {
                this.lIllllIIlIIIlIllllllIIIll.gameSettings.IIlIlIlIIlllIIIlIIIIlIIIl = 0;
            }
        }
        this.lllIIIllIIIIlllIlIIllIIll = true;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl() {
        this.lIllllIIlIIIlIllllllIIIll.gameSettings.IIlIlIlIIlllIIIlIIIIlIIIl = this.IIIllIIlIIIIIIlIlIIllIIlI;
        this.lllIIIllIIIIlllIlIIllIIll = false;
    }

    public void lllIIIllIIIIlllIlIIllIIll(float f, float f2) {
        float f3 = this.lIlllIlllIIIIlIIlllIllIII;
        float f4 = this.lllIlIIlIIIlIlIIIllIlllIl;
        this.lllIlIIlIIIlIlIIIllIlllIl = (float)((double)this.lllIlIIlIIIlIlIIIllIlllIl + (double)f * 0.15);
        this.lIlllIlllIIIIlIIlllIllIII = (float)((double)this.lIlllIlllIIIIlIIlllIllIII - (double)f2 * 0.15);
        if (this.lIlllIlllIIIIlIIlllIllIII < -90.0f) {
            this.lIlllIlllIIIIlIIlllIllIII = -90.0f;
        }
        if (this.lIlllIlllIIIIlIIlllIllIII > 90.0f) {
            this.lIlllIlllIIIIlIIlllIllIII = 90.0f;
        }
        this.IlIIIIIllllllIIlllIllllll += this.lIlllIlllIIIIlIIlllIllIII - f3;
        this.IlIllllllIIlIIllllIIlIIIl += this.lllIlIIlIIIlIlIIIllIlllIl - f4;
    }
}

