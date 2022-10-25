package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonParseException
 *  org.apache.commons.lang3.exception.ExceptionUtils
 */
import com.google.gson.JsonParseException;
import java.util.List;

import net.minecraft.util.IChatComponent;
import org.apache.commons.lang3.exception.ExceptionUtils;

public class class_0137
extends class_1246 {
    @Override
    public String lllIIIllIIIIlllIlIIllIIll() {
        return "tellraw";
    }

    @Override
    public int lllIlIIlIIIlIlIIIllIlllIl() {
        return 2;
    }

    @Override
    public String lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692) {
        return "commands.tellraw.usage";
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692, String[] arrstring) {
        if (arrstring.length < 2) {
            throw new class_0932("commands.tellraw.usage", new Object[0]);
        }
        class_1822 class_18222 = class_0137.lIlllIlllIIIIlIIlllIllIII(class_19692, arrstring[0]);
        String string = class_0137.lllIlIIlIIIlIlIIIllIlllIl(class_19692, arrstring, 1);
        try {
            IChatComponent class_22552 = class_2095.lllIIIllIIIIlllIlIIllIIll(string);
            class_18222.lllIIIllIIIIlllIlIIllIIll(class_22552);
        }
        catch (JsonParseException jsonParseException) {
            Throwable throwable = ExceptionUtils.getRootCause((Throwable)jsonParseException);
            throw new class_1648("commands.tellraw.jsonException", throwable == null ? "" : throwable.getMessage());
        }
    }

    @Override
    public List lllIlIIlIIIlIlIIIllIlllIl(class_1969 class_19692, String[] arrstring) {
        return arrstring.length == 1 ? class_0137.lllIIIllIIIIlllIlIIllIIll(arrstring, class_0220.IlIIlllllIIlIlIlllllIllll().llIIlIllIllllIlIIIIlIIlll()) : null;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(String[] arrstring, int n) {
        return n == 0;
    }
}

