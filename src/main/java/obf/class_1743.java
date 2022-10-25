package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.io.ByteArrayOutputStream;

class class_1743
extends ByteArrayOutputStream {
    private int lllIlIIlIIIlIlIIIllIlllIl;
    private int IlIllllllIIlIIllllIIlIIIl;
    final /* synthetic */ class_1938 lllIIIllIIIIlllIlIIllIIll;

    public class_1743(class_1938 class_19382, int n, int n2) {
        this.lllIIIllIIIIlllIlIIllIIll = class_19382;
        super(8096);
        this.lllIlIIlIIIlIlIIIllIlllIl = n;
        this.IlIllllllIIlIIllllIIlIIIl = n2;
    }

    @Override
    public void close() {
        this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.buf, this.count);
    }
}

