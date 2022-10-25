package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javazoom.jl.decoder.JavaLayerHook
 *  javazoom.jl.decoder.JavaLayerUtils
 */
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import javazoom.jl.decoder.JavaLayerHook;
import javazoom.jl.decoder.JavaLayerUtils;

public class class_0037
implements JavaLayerHook {
    public InputStream getResourceAsStream(String string) {
        Class<JavaLayerUtils> class_ = JavaLayerUtils.class;
        InputStream inputStream = class_.getResourceAsStream(string);
        if (inputStream == null) {
            String string2 = "javazoom/jl/decoder/" + string;
            System.out.println("Retrieving: " + string2);
            if (class_0298.IlIllllllIIlIIllllIIlIIIl(string2)) {
                inputStream = new ByteArrayInputStream(class_0298.lllIIIllIIIIlllIlIIllIIll(string2));
            }
        }
        return inputStream;
    }
}

