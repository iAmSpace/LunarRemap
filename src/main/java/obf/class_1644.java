package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
import com.google.gson.JsonObject;
import java.io.File;
import java.net.SocketAddress;

public class class_1644
extends class_1731 {
    public class_1644(File file) {
        super(file);
    }

    @Override
    protected class_1356 lllIIIllIIIIlllIlIIllIIll(JsonObject jsonObject) {
        return new class_2227(jsonObject);
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(SocketAddress socketAddress) {
        String string = this.IlIllllllIIlIIllllIIlIIIl(socketAddress);
        return this.lIlllIlllIIIIlIIlllIllIII(string);
    }

    public class_2227 lllIlIIlIIIlIlIIIllIlllIl(SocketAddress socketAddress) {
        String string = this.IlIllllllIIlIIllllIIlIIIl(socketAddress);
        return (class_2227)this.lllIIIllIIIIlllIlIIllIIll(string);
    }

    private String IlIllllllIIlIIllllIIlIIIl(SocketAddress socketAddress) {
        String string = socketAddress.toString();
        if (string.contains("/")) {
            string = string.substring(string.indexOf(47) + 1);
        }
        if (string.contains(":")) {
            string = string.substring(0, string.indexOf(58));
        }
        return string;
    }
}

