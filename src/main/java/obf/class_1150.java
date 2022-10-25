package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.GL11
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import com.moonsworth.lunar.client.LunarClient;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public class class_1150 {
    Minecraft lllIIIllIIIIlllIlIIllIIll = Minecraft.getMinecraft();
    LunarClient lllIlIIlIIIlIlIIIllIlllIl = LunarClient.getInstance();
    private final ResourceLocation IlIllllllIIlIIllllIIlIIIl = new ResourceLocation("client/icons/microphone-64.png");
    private Map lIlllIlllIIIIlIIlllIllIII = new HashMap();
    private boolean IlIIIIIllllllIIlllIllllll;

    public class_1150() {
        LunarClient.getInstance().getEventBus().addEvent(class_2201.class, this::lllIIIllIIIIlllIlIIllIIll);
        LunarClient.getInstance().getEventBus().addEvent(class_0312.class, this::lllIIIllIIIIlllIlIIllIIll);
    }

    public void lllIIIllIIIIlllIlIIllIIll(UUID uUID) {
        class_0754 class_07542 = this.lllIlIIlIIIlIlIIIllIlllIl.getNetworkManager().lllIIIllIIIIlllIlIIllIIll(uUID);
        if (class_07542 != null) {
            this.lIlllIlllIIIIlIIlllIllIII.put(class_07542, System.currentTimeMillis() + 250L);
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_2201 class_22012) {
        if (this.lllIlIIlIIIlIlIIIllIlllIl.getNetworkManager().lIlllIlllIIIIlIIlllIllIII() && this.lllIlIIlIIIlIlIIIllIlllIl.getNetworkManager().IlIIIIIllllllIIlllIllllll() != null && (!this.lIlllIlllIIIIlIIlllIllIII.isEmpty() || this.IlIIIIIllllllIIlllIllllll)) {
            float f = 20.0f;
            float f2 = (float)class_22012.lllIIIllIIIIlllIlIIllIIll().IlIllllllIIlIIllllIIlIIIl() - 120.0f;
            float[] arrf = new float[]{10.0f};
            if (this.IlIIIIIllllllIIlllIllllll) {
                this.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll.lIIIIlIlIIlllllIIllIIlIII.llllIIIIlIIIlIIIIIIlIllll(), this.lllIIIllIIIIlllIlIIllIIll.getSession().getPlayerID(), f2, arrf[0], true);
                arrf[0] = arrf[0] + f;
            }
            this.lIlllIlllIIIIlIIlllIllIII.forEach((class_07542, l) -> {
                this.lllIIIllIIIIlllIlIIllIIll(class_07542.lllIlIIlIIIlIlIIIllIlllIl(), class_07542.lllIIIllIIIIlllIlIIllIIll().toString(), f2, arrf[0], false);
                arrf[0] = arrf[0] + f;
            });
        }
    }

    private void lllIIIllIIIIlllIlIIllIIll(String string, String string2, float f, float f2, boolean bl) {
        if (bl) {
            class_0857.lllIIIllIIIIlllIlIIllIIll(f, f2, f + 110.0f, f2 + 18.0f, -11493284, -10176146, -11164318);
        } else {
            class_0857.lllIIIllIIIIlllIlIIllIIll(f, f2, f + 110.0f, f2 + 18.0f, -1356454362, -1355664846, -1356191190);
        }
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        ResourceLocation class_17732 = LunarClient.getInstance().lllIIIllIIIIlllIlIIllIIll(string, string2);
        class_0857.lllIIIllIIIIlllIlIIllIIll(class_17732, 7.0f, f + 2.0f, f2 + 2.0f);
        this.lllIlIIlIIIlIlIIIllIlllIl.robotoLight16px.lllIIIllIIIIlllIlIIllIIll(string, f + 22.0f, f2 + 4.0f, -1);
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0312 class_03122) {
        if (!this.lIlllIlllIIIIlIIlllIllIII.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : this.lIlllIlllIIIIlIIlllIllIII.entrySet()) {
                if (System.currentTimeMillis() - (Long)entry.getValue() < 0L) continue;
                arrayList.add(entry.getKey());
            }
            arrayList.forEach(class_07542 -> {
                Long cfr_ignored_0 = (Long)this.lIlllIlllIIIIlIIlllIllIII.remove(class_07542);
            });
        }
        if (!this.lllIlIIlIIIlIlIIIllIlllIl.getNetworkManager().lIlllIlllIIIIlIIlllIllIII() && this.lllIlIIlIIIlIlIIIllIlllIl.getNetworkManager().IlIIIIIllllllIIlllIllllll() != null) {
            return;
        }
        if (this.IlIIIIIllllllIIlllIllllll && !this.lllIIIllIIIIlllIlIIllIIll.IIlIIlIlIlIllIIlIlIIIIlll) {
            this.IlIIIIIllllllIIlllIllllll = false;
            LunarClient.getInstance().lllIIIllIIIIlllIlIIllIIll("voice_up");
        }
        if (!this.IlIIIIIllllllIIlllIllllll && this.lllIIIllIIIIlllIlIIllIIll.IIlIIlIlIlIllIIlIlIIIIlll && this.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl.getSettingsManager().lIlllIlllIIIIlIIlllIllIII.IIIllIllIIlIlIlIlIllllIIl())) {
            this.IlIIIIIllllllIIlllIllllll = true;
            LunarClient.getInstance().lllIIIllIIIIlllIlIIllIIll("voice_down");
        } else if (this.IlIIIIIllllllIIlllIllllll && this.lllIIIllIIIIlllIlIIllIIll.IIlIIlIlIlIllIIlIlIIIIlll && !this.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl.getSettingsManager().lIlllIlllIIIIlIIlllIllIII.IIIllIllIIlIlIlIlIllllIIl())) {
            this.IlIIIIIllllllIIlllIllllll = false;
            LunarClient.getInstance().lllIIIllIIIIlllIlIIllIIll("voice_up");
        }
    }

    private boolean lllIIIllIIIIlllIlIIllIIll(int n) {
        return n != 0 && (n < 0 ? Mouse.isButtonDown((int)(n + 100)) : Keyboard.isKeyDown((int)n));
    }
}

