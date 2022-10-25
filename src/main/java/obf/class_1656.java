package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import net.minecraft.block.Block;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_1656
extends class_0703 {
    private static final Logger lllIIIllIIIIlllIlIIllIIll = LogManager.getLogger();
    private class_1108 lllIlIIlIIIlIlIIIllIlllIl;
    private byte[] IlIllllllIIlIIllllIIlIIIl;
    private int lIlllIlllIIIIlIIlllIllIII;

    public class_1656() {
    }

    public class_1656(int n, short[] arrs, class_0723 class_07232) {
        this.lllIlIIlIIIlIlIIIllIlllIl = new class_1108(class_07232.IIIllIIlIIIIIIlIlIIllIIlI, class_07232.IllIIlllllllIIlIIlIIIIlIl);
        this.lIlllIlllIIIIlIIlllIllIII = n;
        int n2 = 4 * n;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(n2);
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            for (int i = 0; i < n; ++i) {
                int n3 = arrs[i] >> 12 & 0xF;
                int n4 = arrs[i] >> 8 & 0xF;
                int n5 = arrs[i] & 0xFF;
                dataOutputStream.writeShort(arrs[i]);
                dataOutputStream.writeShort((short)((Block.lllIIIllIIIIlllIlIIllIIll(class_07232.lllIlIIlIIIlIlIIIllIlllIl(n3, n5, n4)) & 0xFFF) << 4 | class_07232.IlIllllllIIlIIllllIIlIIIl(n3, n5, n4) & 0xF));
            }
            this.IlIllllllIIlIIllllIIlIIIl = byteArrayOutputStream.toByteArray();
            if (this.IlIllllllIIlIIllllIIlIIIl.length != n2) {
                throw new RuntimeException("Expected length " + n2 + " doesn't match received length " + this.IlIllllllIIlIIllllIIlIIIl.length);
            }
        }
        catch (IOException iOException) {
            lllIIIllIIIIlllIlIIllIIll.error("Couldn't create bulk block update packet", (Throwable)iOException);
            this.IlIllllllIIlIIllllIIlIIIl = null;
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0181 class_01812) {
        this.lllIlIIlIIIlIlIIIllIlllIl = new class_1108(class_01812.readInt(), class_01812.readInt());
        this.lIlllIlllIIIIlIIlllIllIII = class_01812.readShort() & 0xFFFF;
        int n = class_01812.readInt();
        if (n > 0) {
            this.IlIllllllIIlIIllllIIlIIIl = new byte[n];
            class_01812.readBytes(this.IlIllllllIIlIIllllIIlIIIl);
        }
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0181 class_01812) {
        class_01812.writeInt(this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll);
        class_01812.writeInt(this.lllIlIIlIIIlIlIIIllIlllIl.lllIlIIlIIIlIlIIIllIlllIl);
        class_01812.writeShort((short)this.lIlllIlllIIIIlIIlllIllIII);
        if (this.IlIllllllIIlIIllllIIlIIIl != null) {
            class_01812.writeInt(this.IlIllllllIIlIIllllIIlIIIl.length);
            class_01812.writeBytes(this.IlIllllllIIlIIllllIIlIIIl);
        } else {
            class_01812.writeInt(0);
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0596 class_05962) {
        class_05962.lllIIIllIIIIlllIlIIllIIll(this);
    }

    @Override
    public String lllIlIIlIIIlIlIIIllIlllIl() {
        return String.format("xc=%d, zc=%d, count=%d", this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl.lllIlIIlIIIlIlIIIllIlllIl, this.lIlllIlllIIIIlIIlllIllIII);
    }

    public class_1108 IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public byte[] lIlllIlllIIIIlIIlllIllIII() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public int IlIIIIIllllllIIlllIllllll() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_2075 class_20752) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0596)class_20752);
    }
}

