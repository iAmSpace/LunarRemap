package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.opengl.GL11
 */
import java.net.URI;

import net.minecraft.client.settings.GameSettings;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;

public class class_1284
extends class_0229 {
    private static final Logger lllIIIllIIIIlllIlIIllIIll = LogManager.getLogger();
    private static final ResourceLocation lllIlIIlIIIlIlIIIllIlllIl = new ResourceLocation("textures/gui/demo_background.png");

    @Override
    public void n_() {
        this.lIlIlIIlIIIIlIIIIIlllIIII.clear();
        int n = -16;
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1197(1, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 116, this.lIIlIIIIIlIlllIlIIlIlIlll / 2 + 62 + n, 114, 20, class_0616.lllIIIllIIIIlllIlIIllIIll("demo.help.buy", new Object[0])));
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1197(2, this.IlIlIIlllIIlIllIIIlllllIl / 2 + 2, this.lIIlIIIIIlIlllIlIIlIlIlll / 2 + 62 + n, 114, 20, class_0616.lllIIIllIIIIlllIlIIllIIll("demo.help.later", new Object[0])));
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1197 class_11972) {
        switch (class_11972.IIIllIllIIlIlIlIlIllllIIl) {
            case 1: {
                class_11972.IllIIIllIIIIlIlIlIllIIlll = false;
                try {
                    Class<?> class_ = Class.forName("java.awt.Desktop");
                    Object object = class_.getMethod("getDesktop", new Class[0]).invoke(null, new Object[0]);
                    class_.getMethod("browse", URI.class).invoke(object, new URI("http://www.minecraft.net/store?source=demo"));
                }
                catch (Throwable throwable) {
                    lllIIIllIIIIlllIlIIllIIll.error("Couldn't open link", throwable);
                }
                break;
            }
            case 2: {
                this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll((class_0229)null);
                this.lllllIlllIIllIlIIlIIIllII.lllIIlIIIllllllIIIIlIlIlI();
            }
        }
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
        super.IlIllllllIIlIIllllIIlIIIl();
    }

    @Override
    public void llIIlIllIllllIlIIIIlIIlll() {
        super.llIIlIllIllllIlIIIIlIIlll();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        this.lllllIlllIIllIlIIlIIIllII.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(lllIlIIlIIIlIlIIIllIlllIl);
        int n = (this.IlIlIIlllIIlIllIIIlllllIl - 248) / 2;
        int n2 = (this.lIIlIIIIIlIlllIlIIlIlIlll - 166) / 2;
        class_1284.lllIIIllIIIIlllIlIIllIIll(n, n2, 0, 0, 248, 166);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
        this.llIIlIllIllllIlIIIIlIIlll();
        int n3 = (this.IlIlIIlllIIlIllIIIlllllIl - 248) / 2 + 10;
        int n4 = (this.lIIlIIIIIlIlllIlIIlIlIlll - 166) / 2 + 8;
        this.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl(class_0616.lllIIIllIIIIlllIlIIllIIll("demo.help.title", new Object[0]), n3, n4, 0x1F1F1F);
        GameSettings class_17512 = this.lllllIlllIIllIlIIlIIIllII.gameSettings;
        this.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl(class_0616.lllIIIllIIIIlllIlIIllIIll("demo.help.movementShort", GameSettings.lllIIIllIIIIlllIlIIllIIll(class_17512.lllIIIlllIlllIIlIllllIIlI.IIIllIllIIlIlIlIlIllllIIl()), GameSettings.lllIIIllIIIIlllIlIIllIIll(class_17512.lIIlIlllIIlllIIlllIIlIlII.IIIllIllIIlIlIlIlIllllIIl()), GameSettings.lllIIIllIIIIlllIlIIllIIll(class_17512.lIIlIIIlIlIIlllIlIllIllIl.IIIllIllIIlIlIlIlIllllIIl()), GameSettings.lllIIIllIIIIlllIlIIllIIll(class_17512.lIIlIlIIIIIllIIIIllIlIlII.IIIllIllIIlIlIlIlIllllIIl())), n3, n4 += 12, 0x4F4F4F);
        this.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl(class_0616.lllIIIllIIIIlllIlIIllIIll("demo.help.movementMouse", new Object[0]), n3, n4 + 12, 0x4F4F4F);
        this.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl(class_0616.lllIIIllIIIIlllIlIIllIIll("demo.help.jump", GameSettings.lllIIIllIIIIlllIlIIllIIll(class_17512.lIIIIlIIIIllIlIIllllIlIII.IIIllIllIIlIlIlIlIllllIIl())), n3, n4 + 24, 0x4F4F4F);
        this.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl(class_0616.lllIIIllIIIIlllIlIIllIIll("demo.help.inventory", GameSettings.lllIIIllIIIIlllIlIIllIIll(class_17512.IIllllIIlIlIlIlllIIIllIIl.IIIllIllIIlIlIlIlIllllIIl())), n3, n4 + 36, 0x4F4F4F);
        this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(class_0616.lllIIIllIIIIlllIlIIllIIll("demo.help.fullWrapped", new Object[0]), n3, n4 + 68, 218, 0x1F1F1F);
        super.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
    }
}

