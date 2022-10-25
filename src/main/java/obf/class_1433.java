package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.collect.Lists;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import javax.imageio.ImageIO;

import net.minecraft.util.ResourceLocation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_1433
extends class_1380 {
    private static final Logger lllIlIIlIIIlIlIIIllIlllIl = LogManager.getLogger();
    public final List lllIIIllIIIIlllIlIIllIIll;

    public class_1433(String ... arrstring) {
        this.lllIIIllIIIIlllIlIIllIIll = Lists.newArrayList((Object[])arrstring);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0947 class_09472) {
        this.IlIllllllIIlIIllllIIlIIIl();
        BufferedImage bufferedImage = null;
        try {
            for (String string : this.lllIIIllIIIIlllIlIIllIIll) {
                if (string == null) continue;
                InputStream inputStream = class_09472.getResource(new ResourceLocation(string)).getInputStream();
                BufferedImage bufferedImage2 = ImageIO.read(inputStream);
                if (bufferedImage == null) {
                    bufferedImage = new BufferedImage(bufferedImage2.getWidth(), bufferedImage2.getHeight(), 2);
                }
                bufferedImage.getGraphics().drawImage(bufferedImage2, 0, 0, null);
            }
        }
        catch (IOException iOException) {
            lllIlIIlIIIlIlIIIllIlllIl.error("Couldn't load layered image", (Throwable)iOException);
            return;
        }
        class_0231.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll(), bufferedImage);
    }
}

