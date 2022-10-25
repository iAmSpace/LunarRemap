package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

import com.moonsworth.lunar.client.LunarClient;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class class_1665 {
    protected Minecraft lIIlIIIIIlIlllIlIIlIlIlll;
    private boolean lllIIIllIIIIlllIlIIllIIll = false;
    private boolean lllIlIIlIIIlIlIIIllIlllIl = false;
    private String IlIllllllIIlIIllllIIlIIIl;
    private boolean lIlllIlllIIIIlIIlllIllIII = false;
    public boolean lIlIlIIlIIIIlIIIIIlllIIII = false;
    private class_0767 IlIIIIIllllllIIlllIllllll;
    public class_0767 IlIIIlIIIIllIIIllIIIIIIll;
    private float lIllllIIlIIIlIllllllIIIll = 0.0f;
    public float IIlllIlIlllIllIIIlllIIlIl = 0.0f;
    private float IIIllIIlIIIIIIlIlIIllIIlI = 0.0f;
    public float lIlIllIIlIIlIIlIIlIIlIIll = 0.0f;
    private boolean IllIIlllllllIIlIIlIIIIlIl = true;
    public boolean llIIlIllIllllIlIIIIlIIlll = true;
    public float llIllllIlIllIIIlIllIIlIlI = 0.0f;
    public float lIlllIlllIlIIIIlllIlIlIIl = 0.0f;
    public boolean IlIIlllllIIlIlIlllllIllll = true;
    private List IIIllIllIIlIlIlIlIllllIIl;
    private List IllIIIllIIIIlIlIlIllIIlll;
    public class_1609 llIIlIlIlllIIllIlIlllIllI;
    private Map lIIIIlIlIIlllllIIllIIlIII;
    private class_1528 llIIlllIllIllllIIIlIIIIII;
    private ResourceLocation llIIllIllIlIIlIIllIllllll;
    private float lllIIlIIIllllllIIIIlIlIlI;
    private float IlIlllIIIIIIlIIllIIllIlll;
    private float IlIlIIlIlIllIIlIlIIllIIIl;
    private String lllllIlllIIllIlIIlIIIllII;

    public class_1665(String string) {
        this.IlIllllllIIlIIllllIIlIIIl = string;
        this.lIIIIlIlIIlllllIIllIIlIII = new HashMap();
        this.lIIlIIIIIlIlllIlIIlIlIlll = Minecraft.getMinecraft();
        this.IIIllIllIIlIlIlIlIllllIIl = new ArrayList();
        this.IllIIIllIIIIlIlIlIllIIlll = new ArrayList();
        this.llIIlIlIlllIIllIlIlllIllI = new class_1609(this, "Scale").lllIlIIlIIIlIlIIIllIlllIl(Float.valueOf(1.0f)).lllIIIllIIIIlllIlIIllIIll((Object)Float.valueOf(0.5f), (Object)Float.valueOf(1.5f));
    }

    protected void lllIIIllIIIIlllIlIIllIIll(Class class_, Consumer consumer) {
        this.lIIIIlIlIIlllllIIllIIlIII.put(class_, consumer);
    }

    protected void lllIlIIlIIIlIlIIIllIlllIl() {
        for (Map.Entry entry : this.lIIIIlIlIIlllllIIllIIlIII.entrySet()) {
            LunarClient.getInstance().getEventBus().addEvent((Class)entry.getKey(), (Consumer)entry.getValue());
        }
    }

    protected void IlIllllllIIlIIllllIIlIIIl() {
        for (Map.Entry entry : this.lIIIIlIlIIlllllIIllIIlIII.entrySet()) {
            LunarClient.getInstance().getEventBus().removeEvent((Class)entry.getKey(), (Consumer)entry.getValue());
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(boolean bl) {
        if (bl != this.lIlIlIIlIIIIlIIIIIlllIIII) {
            LunarClient.getInstance().lllIIlIIIllllllIIIIlIlIlI();
        }
        if (bl) {
            if (!this.lIlllIlllIIIIlIIlllIllIII) {
                this.lIlllIlllIIIIlIIlllIllIII = true;
                this.lllIlIIlIIIlIlIIIllIlllIl();
            }
        } else if (this.lIlllIlllIIIIlIIlllIllIII) {
            this.lIlllIlllIIIIlIIlllIllIII = false;
            this.IlIllllllIIlIIllllIIlIIIl();
        }
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(boolean bl) {
        if (bl) {
            if (!this.lIlllIlllIIIIlIIlllIllIII) {
                this.lIlllIlllIIIIlIIlllIllIII = true;
                this.lllIlIIlIIIlIlIIIllIlllIl();
            }
        } else if (this.lIlllIlllIIIIlIIlllIllIII) {
            this.lIlllIlllIIIIlIIlllIllIII = false;
            this.IlIllllllIIlIIllllIIlIIIl();
        }
        this.lIlIlIIlIIIIlIIIIIlllIIII = this.lIlllIlllIIIIlIIlllIllIII;
    }

    public void lllIIIllIIIIlllIlIIllIIll(float f, float f2) {
        this.lIllllIIlIIIlIllllllIIIll = f;
        this.IIIllIIlIIIIIIlIlIIllIIlI = f2;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(float f, float f2) {
        this.lIllllIIlIIIlIllllllIIIll = f;
        this.IIIllIIlIIIIIIlIlIIllIIlI = f2;
        this.IIlllIlIlllIllIIIlllIIlIl = f;
        this.lIlIllIIlIIlIIlIIlIIlIIll = f2;
    }

    public void IlIllllllIIlIIllllIIlIIIl(float f, float f2) {
        this.llIllllIlIllIIIlIllIIlIlI = f;
        this.lIlllIlllIlIIIIlllIlIlIIl = f2;
    }

    public boolean lIlllIlllIIIIlIIlllIllIII() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public void IlIllllllIIlIIllllIIlIIIl(boolean bl) {
        this.lllIIIllIIIIlllIlIIllIIll = bl;
    }

    public boolean IlIIIIIllllllIIlllIllllll() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public void lIlllIlllIIIIlIIlllIllIII(boolean bl) {
        this.lllIlIIlIIIlIlIIIllIlllIl = bl;
        if (!bl && this.lIllllIIlIIIlIllllllIIIll()) {
            this.lllIIIllIIIIlllIlIIllIIll(false);
        }
    }

    public boolean lIllllIIlIIIlIllllllIIIll() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    public String IIIllIIlIIIIIIlIlIIllIIlI() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public float IllIIlllllllIIlIIlIIIIlIl() {
        return this.llIllllIlIllIIIlIllIIlIlI;
    }

    public float IIIllIllIIlIlIlIlIllllIIl() {
        return this.lIlllIlllIlIIIIlllIlIlIIl;
    }

    public float IllIIIllIIIIlIlIlIllIIlll() {
        return this.lIllllIIlIIIlIllllllIIIll;
    }

    public float lIIIIlIlIIlllllIIllIIlIII() {
        return this.IIIllIIlIIIIIIlIlIIllIIlI;
    }

    public void lllIIIllIIIIlllIlIIllIIll(float f) {
        this.IIIllIIlIIIIIIlIlIIllIIlI = f;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(float f) {
        this.lIllllIIlIIIlIllllllIIIll = f;
    }

    public List llIIlllIllIllllIIIlIIIIII() {
        return this.IIIllIllIIlIlIlIlIllllIIl;
    }

    public List llIIllIllIlIIlIIllIllllll() {
        return this.IllIIIllIIIIlIlIlIllIIlll;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0321 class_03212) {
        this.lllIIIllIIIIlllIlIIllIIll(class_03212, this.llIllllIlIllIIIlIllIIlIlI, this.lIlllIlllIlIIIIlllIlIlIIl);
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0321 class_03212, float f, float f2) {
        float f3 = 0.0f;
        float f4 = 0.0f;
        GL11.glScalef((float)((Float)this.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue(), (float)((Float)this.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue(), (float)((Float)this.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue());
        f *= ((Float)this.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue();
        f2 *= ((Float)this.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue();
        switch (this.IlIIIIIllllllIIlllIllllll) {
            case lllIIIllIIIIlllIlIIllIIll: {
                f3 = 2.0f;
                f4 = 2.0f;
                break;
            }
            case lllIlIIlIIIlIlIIIllIlllIl: {
                f3 = 2.0f;
                f4 = (float)class_03212.lllIlIIlIIIlIlIIIllIlllIl() / 2.0f - f2 / 2.0f;
                break;
            }
            case IlIllllllIIlIIllllIIlIIIl: {
                f4 = (float)class_03212.lllIlIIlIIIlIlIIIllIlllIl() - f2 - 2.0f;
                f3 = 2.0f;
                break;
            }
            case lIlllIlllIIIIlIIlllIllIII: {
                f3 = (float)class_03212.lllIIIllIIIIlllIlIIllIIll() / 2.0f - f / 2.0f;
                f4 = 2.0f;
                break;
            }
            case IlIIIIIllllllIIlllIllllll: {
                f3 = (float)class_03212.lllIIIllIIIIlllIlIIllIIll() / 2.0f - f / 2.0f;
                f4 = (float)class_03212.lllIlIIlIIIlIlIIIllIlllIl() / 2.0f - f2 / 2.0f;
                break;
            }
            case lIllllIIlIIIlIllllllIIIll: {
                f3 = (float)class_03212.lllIIIllIIIIlllIlIIllIIll() / 2.0f - f;
                f4 = (float)class_03212.lllIlIIlIIIlIlIIIllIlllIl() - f2 - 2.0f;
                break;
            }
            case IIIllIIlIIIIIIlIlIIllIIlI: {
                f3 = (float)class_03212.lllIIIllIIIIlllIlIIllIIll() / 2.0f;
                f4 = (float)class_03212.lllIlIIlIIIlIlIIIllIlllIl() - f2 - 2.0f;
                break;
            }
            case IllIIlllllllIIlIIlIIIIlIl: {
                f3 = (float)class_03212.lllIIIllIIIIlllIlIIllIIll() - f - 2.0f;
                f4 = 2.0f;
                break;
            }
            case IIIllIllIIlIlIlIlIllllIIl: {
                f3 = (float)class_03212.lllIIIllIIIIlllIlIIllIIll() - f;
                f4 = (float)class_03212.lllIlIIlIIIlIlIIIllIlllIl() / 2.0f - f2 / 2.0f;
                break;
            }
            case IllIIIllIIIIlIlIlIllIIlll: {
                f3 = (float)class_03212.lllIIIllIIIIlllIlIIllIIll() - f;
                f4 = (float)class_03212.lllIlIIlIIIlIlIIIllIlllIl() - f2;
            }
        }
        GL11.glTranslatef((float)(f3 / ((Float)this.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue()), (float)(f4 / ((Float)this.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue()), (float)0.0f);
        GL11.glTranslatef((float)(this.lIllllIIlIIIlIllllllIIIll / ((Float)this.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue()), (float)(this.IIIllIIlIIIIIIlIlIIllIIlI / ((Float)this.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue()), (float)0.0f);
    }

    public float[] lllIIIllIIIIlllIlIIllIIll(class_0321 class_03212, boolean bl) {
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = this.llIllllIlIllIIIlIllIIlIlI * ((Float)this.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue();
        float f4 = this.lIlllIlllIlIIIIlllIlIlIIl * ((Float)this.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue();
        switch (this.IlIIIIIllllllIIlllIllllll) {
            case lllIIIllIIIIlllIlIIllIIll: {
                f = 2.0f;
                f2 = 2.0f;
                break;
            }
            case lllIlIIlIIIlIlIIIllIlllIl: {
                f = 2.0f;
                f2 = (float)class_03212.lllIlIIlIIIlIlIIIllIlllIl() / 2.0f - f4 / 2.0f;
                break;
            }
            case IlIllllllIIlIIllllIIlIIIl: {
                f2 = (float)class_03212.lllIlIIlIIIlIlIIIllIlllIl() - f4 - 2.0f;
                f = 2.0f;
                break;
            }
            case lIlllIlllIIIIlIIlllIllIII: {
                f = (float)class_03212.lllIIIllIIIIlllIlIIllIIll() / 2.0f - f3 / 2.0f;
                f2 = 2.0f;
                break;
            }
            case IlIIIIIllllllIIlllIllllll: {
                f = (float)class_03212.lllIIIllIIIIlllIlIIllIIll() / 2.0f - f3 / 2.0f;
                f2 = (float)class_03212.lllIlIIlIIIlIlIIIllIlllIl() / 2.0f - f4 / 2.0f;
                break;
            }
            case lIllllIIlIIIlIllllllIIIll: {
                f = (float)class_03212.lllIIIllIIIIlllIlIIllIIll() / 2.0f - f3;
                f2 = (float)class_03212.lllIlIIlIIIlIlIIIllIlllIl() - f4 - 2.0f;
                break;
            }
            case IIIllIIlIIIIIIlIlIIllIIlI: {
                f = (float)class_03212.lllIIIllIIIIlllIlIIllIIll() / 2.0f;
                f2 = (float)class_03212.lllIlIIlIIIlIlIIIllIlllIl() - f4 - 2.0f;
                break;
            }
            case IllIIlllllllIIlIIlIIIIlIl: {
                f = (float)class_03212.lllIIIllIIIIlllIlIIllIIll() - f3 - 2.0f;
                f2 = 2.0f;
                break;
            }
            case IIIllIllIIlIlIlIlIllllIIl: {
                f = (float)class_03212.lllIIIllIIIIlllIlIIllIIll() - f3;
                f2 = (float)class_03212.lllIlIIlIIIlIlIIIllIlllIl() / 2.0f - f4 / 2.0f;
                break;
            }
            case IllIIIllIIIIlIlIlIllIIlll: {
                f = (float)class_03212.lllIIIllIIIIlllIlIIllIIll() - f3;
                f2 = (float)class_03212.lllIlIIlIIIlIlIIIllIlllIl() - f4;
            }
        }
        return new float[]{(f + (bl ? this.lIllllIIlIIIlIllllllIIIll : 0.0f)) / ((Float)this.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue(), (f2 + (bl ? this.IIIllIIlIIIIIIlIlIIllIIlI : 0.0f)) / ((Float)this.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue()};
    }

    public boolean lllIIlIIIllllllIIIIlIlIlI() {
        return this.IllIIlllllllIIlIIlIIIIlIl;
    }

    public class_0767 IlIlllIIIIIIlIIllIIllIlll() {
        return this.IlIIIIIllllllIIlllIllllll;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0767 class_07672) {
        if (class_07672 != this.IlIIIlIIIIllIIIllIIIIIIll) {
            LunarClient.getInstance().lllIIlIIIllllllIIIIlIlIlI();
        }
        this.IlIIIIIllllllIIlllIllllll = class_07672;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(class_0767 class_07672) {
        this.IlIIIIIllllllIIlllIllllll = class_07672;
        this.IlIIIlIIIIllIIIllIIIIIIll = class_07672;
    }

    public class_1564 IlIlIIlIlIllIIlIlIIllIIIl() {
        return class_1271.IlIllllllIIlIIllllIIlIIIl(this.IlIIIIIllllllIIlllIllllll);
    }

    protected void lllIIIllIIIIlllIlIIllIIll(ResourceLocation class_17732, int n, int n2) {
        this.llIIlllIllIllllIIIlIIIIII = class_1528.lllIlIIlIIIlIlIIIllIlllIl;
        this.llIIllIllIlIIlIIllIllllll = class_17732;
        this.lllIIlIIIllllllIIIIlIlIlI = n;
        this.IlIlllIIIIIIlIIllIIllIlll = n2;
    }

    protected void lllIIIllIIIIlllIlIIllIIll(String string, float f) {
        this.llIIlllIllIllllIIIlIIIIII = class_1528.lllIIIllIIIIlllIlIIllIIll;
        this.lllllIlllIIllIlIIlIIIllII = string;
        this.IlIlIIlIlIllIIlIlIIllIIIl = f;
    }

    public class_1528 lllllIlllIIllIlIIlIIIllII() {
        return this.llIIlllIllIllllIIIlIIIIII;
    }

    public ResourceLocation IlIlIIlllIIlIllIIIlllllIl() {
        return this.llIIllIllIlIIlIIllIllllll;
    }

    public float lIIlIIIIIlIlllIlIIlIlIlll() {
        return this.lllIIlIIIllllllIIIIlIlIlI;
    }

    public float lIlIlIIlIIIIlIIIIIlllIIII() {
        return this.IlIlllIIIIIIlIIllIIllIlll;
    }

    public String IlIIIlIIIIllIIIllIIIIIIll() {
        return this.lllllIlllIIllIlIIlIIIllII;
    }

    public float IIlllIlIlllIllIIIlllIIlIl() {
        return this.IlIlIIlIlIllIIlIlIIllIIIl;
    }

    public void lllIIIllIIIIlllIlIIllIIll(List list) {
        this.IIIllIllIIlIlIlIlIllllIIl = list;
    }

    public void IlIIIIIllllllIIlllIllllll(boolean bl) {
        if (bl != this.llIIlIllIllllIlIIIIlIIlll) {
            LunarClient.getInstance().lllIIlIIIllllllIIIIlIlIlI();
        }
        this.IllIIlllllllIIlIIlIIIIlIl = bl;
    }

    public void lIllllIIlIIIlIllllllIIIll(boolean bl) {
        this.IllIIlllllllIIlIIlIIIIlIl = bl;
        this.llIIlIllIllllIlIIIIlIIlll = bl;
    }
}

