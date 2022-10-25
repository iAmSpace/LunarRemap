package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.net.Authenticator;
import java.net.PasswordAuthentication;

public final class class_1102
extends Authenticator {
    final /* synthetic */ String lllIIIllIIIIlllIlIIllIIll;
    final /* synthetic */ String lllIlIIlIIIlIlIIIllIlllIl;

    public class_1102(String string, String string2) {
        this.lllIIIllIIIIlllIlIIllIIll = string;
        this.lllIlIIlIIIlIlIIIllIlllIl = string2;
    }

    @Override
    protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl.toCharArray());
    }
}

