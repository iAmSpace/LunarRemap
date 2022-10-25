package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.util.List;

import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public abstract class class_1924
implements class_0677 {
    private static final ResourceLocation IlIllllllIIlIIllllIIlIIIl = new ResourceLocation("textures/gui/resource_packs.png");
    protected final Minecraft lllIIIllIIIIlllIlIIllIIll;
    protected final class_2018 lllIlIIlIIIlIlIIIllIlllIl;

    public class_1924(class_2018 class_20182) {
        this.lllIlIIlIIIlIlIIIllIlllIl = class_20182;
        this.lllIIIllIIIIlllIlIIllIIll = Minecraft.getMinecraft();
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4, int n5, class_0868 class_08682, int n6, int n7, boolean bl) {
        String string;
        int n8;
        this.IlIllllllIIlIIllllIIlIIIl();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        class_0210.lllIIIllIIIIlllIlIIllIIll(n2, n3, 0.0f, 0.0f, 32, 32, 32.0f, 32.0f);
        if ((this.lllIIIllIIIIlllIlIIllIIll.gameSettings.IllIlIlIIIlIllIlIlIIlllII || bl) && this.lIlllIlllIIIIlIIlllIllIII()) {
            this.lllIIIllIIIIlllIlIIllIIll.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(IlIllllllIIlIIllllIIlIIIl);
            class_0210.lllIIIllIIIIlllIlIIllIIll(n2, n3, n2 + 32, n3 + 32, -1601138544);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            int n9 = n6 - n2;
            n8 = n7 - n3;
            if (this.IlIIIIIllllllIIlllIllllll()) {
                if (n9 < 32) {
                    class_0210.lllIIIllIIIIlllIlIIllIIll(n2, n3, 0.0f, 32.0f, 32, 32, 256.0f, 256.0f);
                } else {
                    class_0210.lllIIIllIIIIlllIlIIllIIll(n2, n3, 0.0f, 0.0f, 32, 32, 256.0f, 256.0f);
                }
            } else {
                if (this.lIllllIIlIIIlIllllllIIIll()) {
                    if (n9 < 16) {
                        class_0210.lllIIIllIIIIlllIlIIllIIll(n2, n3, 32.0f, 32.0f, 32, 32, 256.0f, 256.0f);
                    } else {
                        class_0210.lllIIIllIIIIlllIlIIllIIll(n2, n3, 32.0f, 0.0f, 32, 32, 256.0f, 256.0f);
                    }
                }
                if (this.IIIllIIlIIIIIIlIlIIllIIlI()) {
                    if (n9 < 32 && n9 > 16 && n8 < 16) {
                        class_0210.lllIIIllIIIIlllIlIIllIIll(n2, n3, 96.0f, 32.0f, 32, 32, 256.0f, 256.0f);
                    } else {
                        class_0210.lllIIIllIIIIlllIlIIllIIll(n2, n3, 96.0f, 0.0f, 32, 32, 256.0f, 256.0f);
                    }
                }
                if (this.IllIIlllllllIIlIIlIIIIlIl()) {
                    if (n9 < 32 && n9 > 16 && n8 > 16) {
                        class_0210.lllIIIllIIIIlllIlIIllIIll(n2, n3, 64.0f, 32.0f, 32, 32, 256.0f, 256.0f);
                    } else {
                        class_0210.lllIIIllIIIIlllIlIIllIIll(n2, n3, 64.0f, 0.0f, 32, 32, 256.0f, 256.0f);
                    }
                }
            }
        }
        if ((n8 = this.lllIIIllIIIIlllIlIIllIIll.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(string = this.lllIlIIlIIIlIlIIIllIlllIl())) > 157) {
            string = this.lllIIIllIIIIlllIlIIllIIll.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(string, 157 - this.lllIIIllIIIIlllIlIIllIIll.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll("...")) + "...";
        }
        this.lllIIIllIIIIlllIlIIllIIll.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(string, (float)(n2 + 32 + 2), (float)(n3 + 1), 0xFFFFFF);
        List list = this.lllIIIllIIIIlllIlIIllIIll.IlIlllIIIIIIlIIllIIllIlll.IlIllllllIIlIIllllIIlIIIl(this.lllIIIllIIIIlllIlIIllIIll(), 157);
        for (int i = 0; i < 2 && i < list.size(); ++i) {
            this.lllIIIllIIIIlllIlIIllIIll.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll((String)list.get(i), (float)(n2 + 32 + 2), (float)(n3 + 12 + 10 * i), 0x808080);
        }
    }

    protected abstract String lllIIIllIIIIlllIlIIllIIll();

    protected abstract String lllIlIIlIIIlIlIIIllIlllIl();

    protected abstract void IlIllllllIIlIIllllIIlIIIl();

    protected boolean lIlllIlllIIIIlIIlllIllIII() {
        return true;
    }

    protected boolean IlIIIIIllllllIIlllIllllll() {
        return !this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(this);
    }

    protected boolean lIllllIIlIIIlIllllllIIIll() {
        return this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(this);
    }

    protected boolean IIIllIIlIIIIIIlIlIIllIIlI() {
        List list = this.lllIlIIlIIIlIlIIIllIlllIl.lllIlIIlIIIlIlIIIllIlllIl(this);
        int n = list.indexOf(this);
        return n > 0 && ((class_1924)list.get(n - 1)).lIlllIlllIIIIlIIlllIllIII();
    }

    protected boolean IllIIlllllllIIlIIlIIIIlIl() {
        List list = this.lllIlIIlIIIlIlIIIllIlllIl.lllIlIIlIIIlIlIIIllIlllIl(this);
        int n = list.indexOf(this);
        return n >= 0 && n < list.size() - 1 && ((class_1924)list.get(n + 1)).lIlllIlllIIIIlIIlllIllIII();
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4, int n5, int n6) {
        if (this.lIlllIlllIIIIlIIlllIllIII() && n5 <= 32) {
            if (this.IlIIIIIllllllIIlllIllllll()) {
                this.lllIlIIlIIIlIlIIIllIlllIl.lllIlIIlIIIlIlIIIllIlllIl(this).remove(this);
                this.lllIlIIlIIIlIlIIIllIlllIl.IIIllIIlIIIIIIlIlIIllIIlI().add(0, this);
                return true;
            }
            if (n5 < 16 && this.lIllllIIlIIIlIllllllIIIll()) {
                this.lllIlIIlIIIlIlIIIllIlllIl.lllIlIIlIIIlIlIIIllIlllIl(this).remove(this);
                this.lllIlIIlIIIlIlIIIllIlllIl.lIllllIIlIIIlIllllllIIIll().add(0, this);
                return true;
            }
            if (n5 > 16 && n6 < 16 && this.IIIllIIlIIIIIIlIlIIllIIlI()) {
                List list = this.lllIlIIlIIIlIlIIIllIlllIl.lllIlIIlIIIlIlIIIllIlllIl(this);
                int n7 = list.indexOf(this);
                list.remove(this);
                list.add(n7 - 1, this);
                return true;
            }
            if (n5 > 16 && n6 > 16 && this.IllIIlllllllIIlIIlIIIIlIl()) {
                List list = this.lllIlIIlIIIlIlIIIllIlllIl.lllIlIIlIIIlIlIIIllIlllIl(this);
                int n8 = list.indexOf(this);
                list.remove(this);
                list.add(n8 + 1, this);
                return true;
            }
        }
        return false;
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, int n3, int n4, int n5, int n6) {
    }
}

