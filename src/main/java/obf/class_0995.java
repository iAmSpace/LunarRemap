package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.awt.image.BufferedImage;
import java.io.InputStream;
import javax.imageio.ImageIO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_0995
extends class_1380 {
    private static final Logger lllIIIllIIIIlllIlIIllIIll = LogManager.getLogger();
    protected final ResourceLocation IlIIIIIllllllIIlllIllllll;

    public class_0995(ResourceLocation class_17732) {
        this.IlIIIIIllllllIIlllIllllll = class_17732;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0947 class_09472) {
        this.IlIllllllIIlIIllllIIlIIIl();
        try (InputStream inputStream = null;){
            class_2234 class_22342 = class_09472.getResource(this.IlIIIIIllllllIIlllIllllll);
            inputStream = class_22342.getInputStream();
            BufferedImage bufferedImage = ImageIO.read(inputStream);
            boolean bl = false;
            boolean bl2 = false;
            if (class_22342.lllIlIIlIIIlIlIIIllIlllIl()) {
                try {
                    class_1561 class_15612 = (class_1561)class_22342.lllIIIllIIIIlllIlIIllIIll("texture");
                    if (class_15612 != null) {
                        bl = class_15612.lllIIIllIIIIlllIlIIllIIll();
                        bl2 = class_15612.lllIlIIlIIIlIlIIIllIlllIl();
                    }
                }
                catch (RuntimeException runtimeException) {
                    lllIIIllIIIIlllIlIIllIIll.warn("Failed reading metadata of: " + this.IlIIIIIllllllIIlllIllllll, (Throwable)runtimeException);
                }
            }
            class_0231.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll(), bufferedImage, bl, bl2);
        }
    }
}

