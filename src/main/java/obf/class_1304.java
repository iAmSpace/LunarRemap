package obf;

import net.minecraft.util.ResourceLocation;
import com.moonsworth.lunar.client.LunarClient;
import net.minecraft.client.Minecraft;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1304
extends AbstractModule {
    private final class_1398 lllIlIIlIIIlIlIIIllIlllIl;
    public static class_0561 lllIIIllIIIIlllIlIIllIIll = class_0561.IlIllllllIIlIIllllIIlIIIl;

    public class_1398 lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public class_1304() {
        super("Zans Minimap");
        this.lllIlIIlIIIlIlIIIllIlllIl(false);
        this.IlIIlllllIIlIlIlllllIllll = false;
        this.lllIlIIlIIIlIlIIIllIlllIl(class_0767.IllIIlllllllIIlIIlIIIIlIl);
        this.lllIlIIlIIIlIlIIIllIlllIl = new class_1398(true, true);
        this.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("client/icons/mods/zans.png"), 42, 42);
        this.lllIIIllIIIIlllIlIIllIIll(class_2201.class, this::lllIIIllIIIIlllIlIIllIIll);
    }

    @Override
    public void addAllEvents() {
        super.addAllEvents();
        if (lllIIIllIIIIlllIlIIllIIll == class_0561.IlIllllllIIlIIllllIIlIIIl) {
            LunarClient.getInstance().getModuleManager().lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll("Error", "&4Minimap &fis not allowed on this server. Some functions may not work.", 4000L);
        }
    }

    private void lllIIIllIIIIlllIlIIllIIll(class_2201 class_22012) {
        float f = 1.0f / LunarClient.IllIIIllIIIIlIlIlIllIIlll();
        switch (this.lllIlIIlIIIlIlIIIllIlllIl.lllIlIIlIIIlIlIIIllIlllIl().lIlllIlllIlIIIIlllIlIlIIl) {
            case 0: {
                if (this.IlIlllIIIIIIlIIllIIllIlll() == class_0767.lllIIIllIIIIlllIlIIllIIll) break;
                this.lllIIIllIIIIlllIlIIllIIll(class_0767.lllIIIllIIIIlllIlIIllIIll);
                break;
            }
            case 1: {
                if (this.IlIlllIIIIIIlIIllIIllIlll() == class_0767.IllIIlllllllIIlIIlIIIIlIl) break;
                this.lllIIIllIIIIlllIlIIllIIll(class_0767.IllIIlllllllIIlIIlIIIIlIl);
                break;
            }
            case 2: {
                if (this.IlIlllIIIIIIlIIllIIllIlll() == class_0767.IllIIIllIIIIlIlIlIllIIlll) break;
                this.lllIIIllIIIIlllIlIIllIIll(class_0767.IllIIIllIIIIlIlIlIllIIlll);
                break;
            }
            case 3: {
                if (this.IlIlllIIIIIIlIIllIIllIlll() == class_0767.IlIllllllIIlIIllllIIlIIIl) break;
                this.lllIIIllIIIIlllIlIIllIIll(class_0767.IlIllllllIIlIIllllIIlIIIl);
            }
        }
        switch (this.lllIlIIlIIIlIlIIIllIlllIl.lllIlIIlIIIlIlIIIllIlllIl().llIllllIlIllIIIlIllIIlIlI) {
            case -1: {
                this.lllIIIllIIIIlllIlIIllIIll((int)(-5.0f * f), (float)((int)(5.0f * f)));
                this.IlIllllllIIlIIllllIIlIIIl((int)(100.0f * f), (int)(100.0f * f));
                break;
            }
            case 0: {
                this.lllIIIllIIIIlllIlIIllIIll((int)(-5.0f * f), (float)((int)(5.0f * f)));
                this.IlIllllllIIlIIllllIIlIIIl((int)(135.0f * f), (int)(135.0f * f));
                break;
            }
            case 1: {
                this.lllIIIllIIIIlllIlIIllIIll((int)(-5.0f * f), (float)((int)(5.0f * f)));
                this.IlIllllllIIlIIllllIIlIIIl((int)(175.0f * f), (int)(175.0f * f));
            }
        }
        this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(Minecraft.getMinecraft());
    }
}

