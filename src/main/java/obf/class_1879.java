package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.util.ArrayList;
import java.util.List;

import com.moonsworth.lunar.client.config.Setting;
import net.minecraft.client.Minecraft;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class class_1879
extends AbstractModule {
    private Setting lllIlIIlIIIlIlIIIllIlllIl;
    private Setting IlIllllllIIlIIllllIIlIIIl;
    private Setting lIlllIlllIIIIlIIlllIllIII;
    private Setting IlIIIIIllllllIIlllIllllll;
    private Setting lIllllIIlIIIlIllllllIIIll;
    private Setting IIIllIIlIIIIIIlIlIIllIIlI;
    public Setting lllIIIllIIIIlllIlIIllIIll;
    private Setting IllIIlllllllIIlIIlIIIIlIl;
    private Setting IIIllIllIIlIlIlIlIllllIIl;
    private Setting IllIIIllIIIIlIlIlIllIIlll;
    private final List lIIIIlIlIIlllllIIllIIlIII = new ArrayList();

    public class_1879() {
        super("Coordinates");
        this.lllIlIIlIIIlIlIIIllIlllIl(class_0767.lllIIIllIIIIlllIlIIllIIll);
        this.lllIlIIlIIIlIlIIIllIlllIl(-1.0f, 0.0f);
        this.lllIlIIlIIIlIlIIIllIlllIl(false);
        this.lllIlIIlIIIlIlIIIllIlllIl = new Setting(this, "label").setValue("General Options");
        this.IlIllllllIIlIIllllIIlIIIl = new Setting(this, "Show While Typing").setValue(true);
        this.lIlllIlllIIIIlIIlllIllIII = new Setting(this, "Mode").setValue("Horizontal").setAcceptedValues(new String[]{"Horizontal", "Vertical"});
        this.IlIIIIIllllllIIlllIllllll = new Setting(this, "Coordinates").setValue(true);
        this.lIllllIIlIIIlIllllllIIIll = new Setting(this, "Hide Y Coordinate").setValue(false);
        this.IIIllIIlIIIIIIlIlIIllIIlI = new Setting(this, "Direction").setValue(true);
        this.lllIIIllIIIIlllIlIIllIIll = new Setting(this, "Custom Line").setValue("");
        this.IllIIlllllllIIlIIlIIIIlIl = new Setting(this, "label").setValue("Color Settings");
        this.IIIllIllIIlIlIlIlIllllIIl = new Setting(this, "Coordinates Color").setValue(-1).setMinMax((Object)Integer.MIN_VALUE, (Object)Integer.MAX_VALUE);
        this.IllIIIllIIIIlIlIlIllIIlll = new Setting(this, "Direction Color").setValue(-1).setMinMax((Object)Integer.MIN_VALUE, (Object)Integer.MAX_VALUE);
        this.lllIIIllIIIIlllIlIIllIIll("(16, 65, 120) NW", 1.0f);
        this.lllIIIllIIIIlllIlIIllIIll(class_2201.class, this::lllIIIllIIIIlllIlIIllIIll);
        this.lllIIIllIIIIlllIlIIllIIll(class_0312.class, this::lllIIIllIIIIlllIlIIllIIll);
        this.lllIIIllIIIIlllIlIIllIIll(class_0773.class, this::lllIIIllIIIIlllIlIIllIIll);
    }

    private void lllIIIllIIIIlllIlIIllIIll(class_2201 class_22012) {
        if (!this.lllIIlIIIllllllIIIIlIlIlI()) {
            return;
        }
        GL11.glPushMatrix();
        this.lllIIIllIIIIlllIlIIllIIll(class_22012.lllIIIllIIIIlllIlIIllIIll());
        int n = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.lIIlIIIIIlIlllIlIIlIlIlll.lIIIIlIlIIlllllIIllIIlIII.IlIIlllllIIlIlIlllllIllll);
        int n2 = (int)this.lIIlIIIIIlIlllIlIIlIlIlll.lIIIIlIlIIlllllIIllIIlIII.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl;
        int n3 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.lIIlIIIIIlIlllIlIIlIlIlll.lIIIIlIlIIlllllIIllIIlIII.IllIIIIllIIllIllIlllIlIIl);
        if (!this.lIIlIIIIIlIlllIlIIlIlIlll.IlIIIlIIIIllIIIllIIIIIIll.lllIlIIlIIIlIlIIIllIlllIl().IlIIIIIllllllIIlllIllllll() || ((Boolean)this.IlIllllllIIlIIllllIIlIIIl.getValue()).booleanValue()) {
            if (((String)this.lllIIIllIIIIlllIlIIllIIll.getValue()).equals("")) {
                int n4;
                Object object;
                float f = 4.0f;
                if (((String)this.lIlllIlllIIIIlIIlllIllIII.getValue()).equals("Horizontal")) {
                    object = ((Boolean)this.lIllllIIlIIIlIllllllIIIll.getValue()).booleanValue() ? (((Boolean)this.IlIIIIIllllllIIlllIllllll.getValue()).booleanValue() ? String.format("(%1$d, %2$d) ", n, n3) : "") : (((Boolean)this.IlIIIIIllllllIIlllIllllll.getValue()).booleanValue() ? String.format("(%1$d, %2$d, %3$d) ", n, n2, n3) : "");
                    n4 = this.lIIlIIIIIlIlllIlIIlIlIlll.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll((String)object, 0.0f, 0.0f, this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll());
                } else {
                    n4 = 50;
                    f = (Boolean)this.lIllllIIlIIIlIllllllIIIll.getValue() != false ? 9.5f : 16.0f;
                    this.lIIlIIIIIlIlllIlIIlIlIlll.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll("X: " + n, 0.0f, 0.0f, this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll());
                    if (!((Boolean)this.lIllllIIlIIIlIllllllIIIll.getValue()).booleanValue()) {
                        this.lIIlIIIIIlIlllIlIIlIlIlll.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll("Y: " + n2, 0.0f, 12.0f, this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll());
                    }
                    this.lIIlIIIIIlIlllIlIIlIlIlll.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll("Z: " + n3, 0.0f, (Boolean)this.lIllllIIlIIIlIllllllIIIll.getValue() != false ? 12.0f : 24.0f, this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll());
                }
                if (((Boolean)this.IIIllIIlIIIIIIlIlIIllIIlI.getValue()).booleanValue()) {
                    object = new String[]{"N", "NE", "E", "SE", "S", "SW", "W", "NW"};
                    double d = (double) MathHelper.IIIllIIlIIIIIIlIlIIllIIlI(this.lIIlIIIIIlIlllIlIIlIlIlll.lIIIIlIlIIlllllIIllIIlIII.IIIIlIllIlIIlIIlIllIlIlll) + 180.0;
                    d += 22.5;
                    d %= 360.0;
                    String string = object[MathHelper.IlIllllllIIlIIllllIIlIIIl(d /= 45.0)];
                    this.lIIlIIIIIlIlllIlIIlIlIlll.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(string, (float)n4, f - 4.0f, this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll());
                    n4 += this.lIIlIIIIIlIlllIlIIlIlIlll.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(string);
                }
                this.IlIllllllIIlIIllllIIlIIIl(n4, 18.0f + f);
            } else {
                String[] arrstring = ((String)this.lllIIIllIIIIlllIlIIllIIll.getValue()).split("%NL%");
                float f = -1.0f;
                float f2 = arrstring.length * (this.lIIlIIIIIlIlllIlIIlIlIlll.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll + 1);
                int n5 = 0;
                for (String string : arrstring) {
                    float f3 = this.lIIlIIIIIlIlllIlIIlIlIlll.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(string = this.lllIIIllIIIIlllIlIIllIIll(string), 0.0f, (float)((this.lIIlIIIIIlIlllIlIIlIlIlll.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll + 1) * n5), -1);
                    if (f3 > f) {
                        f = f3;
                    }
                    this.IlIllllllIIlIIllllIIlIIIl((int)f, (int)(f2 < 18.0f ? 18.0f : f2));
                    ++n5;
                }
            }
        }
        GL11.glPopMatrix();
    }

    private String lllIIIllIIIIlllIlIIllIIll(String string) {
        String[] arrstring = new String[]{"N", "NE", "E", "SE", "S", "SW", "W", "NW"};
        double d = (double) MathHelper.IIIllIIlIIIIIIlIlIIllIIlI(this.lIIlIIIIIlIlllIlIIlIlIlll.lIIIIlIlIIlllllIIllIIlIII.IIIIlIllIlIIlIIlIllIlIlll) + 180.0;
        d += 22.5;
        d %= 360.0;
        String string2 = arrstring[MathHelper.IlIllllllIIlIIllllIIlIIIl(d /= 45.0)];
        int n = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.lIIlIIIIIlIlllIlIIlIlIlll.lIIIIlIlIIlllllIIllIIlIII.IlIIlllllIIlIlIlllllIllll);
        int n2 = (int)this.lIIlIIIIIlIlllIlIIlIlIlll.lIIIIlIlIIlllllIIllIIlIII.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl;
        int n3 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.lIIlIIIIIlIlllIlIIlIlIlll.lIIIIlIlIIlllllIIllIIlIII.IllIIIIllIIllIllIlllIlIIl);
        string = !this.lIIlIIIIIlIlllIlIIlIlIlll.isIntegratedServerRunning() && this.lIIlIIIIIlIlllIlIIlIlIlll.theWorld != null ? string.replaceAll("%IP%", this.lIIlIIIIIlIlllIlIIlIlIlll.IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl) : string.replaceAll("%IP%", "?");
        return string.replaceAll("%FPS%", Minecraft.IlIIlllllIIlIlIlllllIllll + "").replaceAll("%DIR%", string2).replaceAll("%CPS%", this.lIIIIlIlIIlllllIIllIIlIII.size() + "").replaceAll("%COORDS%", String.format("%1$d, %2$d, %3$d", n, n2, n3)).replaceAll("%X%", n + "").replaceAll("%Y%", n2 + "").replaceAll("%Z%", n3 + "");
    }

    private void lllIIIllIIIIlllIlIIllIIll(class_0312 class_03122) {
        if (((String)this.lllIIIllIIIIlllIlIIllIIll.getValue()).contains("%CPS%")) {
            this.lIIIIlIlIIlllllIIllIIlIII.removeIf(l -> l < System.currentTimeMillis() - 1000L);
        }
    }

    private void lllIIIllIIIIlllIlIIllIIll(class_0773 class_07732) {
        if (class_07732.lllIIIllIIIIlllIlIIllIIll() == 0 && ((String)this.lllIIIllIIIIlllIlIIllIIll.getValue()).contains("%CPS%")) {
            this.lIIIIlIlIIlllllIIllIIlIII.add(System.currentTimeMillis());
        }
    }
}

