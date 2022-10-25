package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonParseException
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.gson.JsonParseException;
import java.io.IOException;

import net.minecraft.util.ResourceLocation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_0582
extends class_1924 {
    private static final Logger IlIllllllIIlIIllllIIlIIIl = LogManager.getLogger();
    private final class_0449 lIlllIlllIIIIlIIlllIllIII;
    private final ResourceLocation IlIIIIIllllllIIlllIllllll;

    public class_0582(class_2018 class_20182) {
        super(class_20182);
        class_2202 class_22022;
        this.lIlllIlllIIIIlIIlllIllIII = this.lllIIIllIIIIlllIlIIllIIll.IllllIIIIlIIlIIIIlllIIIIl().lllIlIIlIIIlIlIIIllIlllIl;
        try {
            class_22022 = new class_2202(this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl());
        }
        catch (IOException iOException) {
            class_22022 = class_0231.lllIIIllIIIIlllIlIIllIIll;
        }
        this.IlIIIIIllllllIIlllIllllll = this.lllIIIllIIIIlllIlIIllIIll.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll("texturepackicon", class_22022);
    }

    @Override
    protected String lllIIIllIIIIlllIlIIllIIll() {
        try {
            class_1866 class_18662 = (class_1866)this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll.IllllIIIIlIIlIIIIlllIIIIl().IlIllllllIIlIIllllIIlIIIl, "pack");
            if (class_18662 != null) {
                return class_18662.lllIIIllIIIIlllIlIIllIIll().lIlllIlllIIIIlIIlllIllIII();
            }
        }
        catch (JsonParseException jsonParseException) {
            IlIllllllIIlIIllllIIlIIIl.error("Couldn't load metadata info", (Throwable)jsonParseException);
        }
        catch (IOException iOException) {
            IlIllllllIIlIIllllIIlIIIl.error("Couldn't load metadata info", (Throwable)iOException);
        }
        return (Object)((Object) EnumChatFormatting.RED) + "Missing pack.mcmeta :(";
    }

    @Override
    protected boolean IlIIIIIllllllIIlllIllllll() {
        return false;
    }

    @Override
    protected boolean lIllllIIlIIIlIllllllIIIll() {
        return false;
    }

    @Override
    protected boolean IIIllIIlIIIIIIlIlIIllIIlI() {
        return false;
    }

    @Override
    protected boolean IllIIlllllllIIlIIlIIIIlIl() {
        return false;
    }

    @Override
    protected String lllIlIIlIIIlIlIIIllIlllIl() {
        return "Default";
    }

    @Override
    protected void IlIllllllIIlIIllllIIlIIIl() {
        this.lllIIIllIIIIlllIlIIllIIll.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(this.IlIIIIIllllllIIlllIllllll);
    }

    @Override
    protected boolean lIlllIlllIIIIlIIlllIllIII() {
        return false;
    }
}

