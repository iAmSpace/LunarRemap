package net.minecraft.network.play.server;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.network.Packet;
import obf.*;

import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

public class S21PacketChunkData
extends Packet {
    private int lllIIIllIIIIlllIlIIllIIll;
    private int lllIlIIlIIIlIlIIIllIlllIl;
    private int IlIllllllIIlIIllllIIlIIIl;
    private int lIlllIlllIIIIlIIlllIllIII;
    private byte[] IlIIIIIllllllIIlllIllllll;
    private byte[] lIllllIIlIIIlIllllllIIIll;
    private boolean IIIllIIlIIIIIIlIlIIllIIlI;
    private int IllIIlllllllIIlIIlIIIIlIl;
    private static byte[] IIIllIllIIlIlIlIlIllllIIl = new byte[196864];

    public S21PacketChunkData() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public S21PacketChunkData(class_0723 class_07232, boolean bl, int n) {
        this.lllIIIllIIIIlllIlIIllIIll = class_07232.IIIllIIlIIIIIIlIlIIllIIlI;
        this.lllIlIIlIIIlIlIIIllIlllIl = class_07232.IllIIlllllllIIlIIlIIIIlIl;
        this.IIIllIIlIIIIIIlIlIIllIIlI = bl;
        class_0537 class_05372 = S21PacketChunkData.lllIIIllIIIIlllIlIIllIIll(class_07232, bl, n);
        Deflater deflater = new Deflater(-1);
        this.lIlllIlllIIIIlIIlllIllIII = class_05372.IlIllllllIIlIIllllIIlIIIl;
        this.IlIllllllIIlIIllllIIlIIIl = class_05372.lllIlIIlIIIlIlIIIllIlllIl;
        try {
            this.lIllllIIlIIIlIllllllIIIll = class_05372.lllIIIllIIIIlllIlIIllIIll;
            deflater.setInput(class_05372.lllIIIllIIIIlllIlIIllIIll, 0, class_05372.lllIIIllIIIIlllIlIIllIIll.length);
            deflater.finish();
            this.IlIIIIIllllllIIlllIllllll = new byte[class_05372.lllIIIllIIIIlllIlIIllIIll.length];
            this.IllIIlllllllIIlIIlIIIIlIl = deflater.deflate(this.IlIIIIIllllllIIlllIllllll);
        }
        finally {
            deflater.end();
        }
    }

    public static int IlIllllllIIlIIllllIIlIIIl() {
        return 196864;
    }

    @Override
    public void readPacketData(PacketBuffer class_01812) throws IOException {
        int n;
        this.lllIIIllIIIIlllIlIIllIIll = class_01812.readInt();
        this.lllIlIIlIIIlIlIIIllIlllIl = class_01812.readInt();
        this.IIIllIIlIIIIIIlIlIIllIIlI = class_01812.readBoolean();
        this.IlIllllllIIlIIllllIIlIIIl = class_01812.readShort();
        this.lIlllIlllIIIIlIIlllIllIII = class_01812.readShort();
        this.IllIIlllllllIIlIIlIIIIlIl = class_01812.readInt();
        if (IIIllIllIIlIlIlIlIllllIIl.length < this.IllIIlllllllIIlIIlIIIIlIl) {
            IIIllIllIIlIlIlIlIllllIIl = new byte[this.IllIIlllllllIIlIIlIIIIlIl];
        }
        class_01812.readBytes(IIIllIllIIlIlIlIlIllllIIl, 0, this.IllIIlllllllIIlIIlIIIIlIl);
        int n2 = 0;
        for (n = 0; n < 16; ++n) {
            n2 += this.IlIllllllIIlIIllllIIlIIIl >> n & 1;
        }
        n = 12288 * n2;
        if (this.IIIllIIlIIIIIIlIlIIllIIlI) {
            n += 256;
        }
        this.lIllllIIlIIIlIllllllIIIll = new byte[n];
        Inflater inflater = new Inflater();
        inflater.setInput(IIIllIllIIlIlIlIlIllllIIl, 0, this.IllIIlllllllIIlIIlIIIIlIl);
        try {
            inflater.inflate(this.lIllllIIlIIIlIllllllIIIll);
        }
        catch (DataFormatException dataFormatException) {
            throw new IOException("Bad compressed data format");
        }
        finally {
            inflater.end();
        }
    }

    @Override
    public void writePacketData(PacketBuffer class_01812) {
        class_01812.writeInt(this.lllIIIllIIIIlllIlIIllIIll);
        class_01812.writeInt(this.lllIlIIlIIIlIlIIIllIlllIl);
        class_01812.writeBoolean(this.IIIllIIlIIIIIIlIlIIllIIlI);
        class_01812.writeShort((short)(this.IlIllllllIIlIIllllIIlIIIl & 0xFFFF));
        class_01812.writeShort((short)(this.lIlllIlllIIIIlIIlllIllIII & 0xFFFF));
        class_01812.writeInt(this.IllIIlllllllIIlIIlIIIIlIl);
        class_01812.writeBytes(this.IlIIIIIllllllIIlllIllllll, 0, this.IllIIlllllllIIlIIlIIIIlIl);
    }

    public void lllIIIllIIIIlllIlIIllIIll(INetHandlerPlayClient class_05962) {
        class_05962.lllIIIllIIIIlllIlIIllIIll(this);
    }

    @Override
    public String serialize() {
        return String.format("x=%d, z=%d, full=%b, sects=%d, add=%d, size=%d", this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl, this.IIIllIIlIIIIIIlIlIIllIIlI, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, this.IllIIlllllllIIlIIlIIIIlIl);
    }

    public byte[] lIlllIlllIIIIlIIlllIllIII() {
        return this.lIllllIIlIIIlIllllllIIIll;
    }

    public static class_0537 lllIIIllIIIIlllIlIIllIIll(class_0723 class_07232, boolean bl, int n) {
        Object object;
        int n2;
        int n3 = 0;
        class_1532[] arrclass_1532 = class_07232.lllIlIIlIIIlIlIIIllIlllIl();
        int n4 = 0;
        class_0537 class_05372 = new class_0537();
        byte[] arrby = IIIllIllIIlIlIlIlIllllIIl;
        if (bl) {
            class_07232.lllllIlllIIllIlIIlIIIllII = true;
        }
        for (n2 = 0; n2 < arrclass_1532.length; ++n2) {
            if (arrclass_1532[n2] == null || bl && arrclass_1532[n2].lllIIIllIIIIlllIlIIllIIll() || (n & 1 << n2) == 0) continue;
            class_05372.lllIlIIlIIIlIlIIIllIlllIl |= 1 << n2;
            if (arrclass_1532[n2].IIIllIIlIIIIIIlIlIIllIIlI() == null) continue;
            class_05372.IlIllllllIIlIIllllIIlIIIl |= 1 << n2;
            ++n4;
        }
        for (n2 = 0; n2 < arrclass_1532.length; ++n2) {
            if (arrclass_1532[n2] == null || bl && arrclass_1532[n2].lllIIIllIIIIlllIlIIllIIll() || (n & 1 << n2) == 0) continue;
            object = arrclass_1532[n2].IlIIIIIllllllIIlllIllllll();
            System.arraycopy(object, 0, arrby, n3, ((byte[])object).length);
            n3 += ((byte[])object).length;
        }
        for (n2 = 0; n2 < arrclass_1532.length; ++n2) {
            if (arrclass_1532[n2] == null || bl && arrclass_1532[n2].lllIIIllIIIIlllIlIIllIIll() || (n & 1 << n2) == 0) continue;
            object = arrclass_1532[n2].IllIIlllllllIIlIIlIIIIlIl();
            System.arraycopy(((class_0783) object).lllIIIllIIIIlllIlIIllIIll, 0, arrby, n3, ((class_0783) object).lllIIIllIIIIlllIlIIllIIll.length);
            n3 += ((class_0783) object).lllIIIllIIIIlllIlIIllIIll.length;
        }
        for (n2 = 0; n2 < arrclass_1532.length; ++n2) {
            if (arrclass_1532[n2] == null || bl && arrclass_1532[n2].lllIIIllIIIIlllIlIIllIIll() || (n & 1 << n2) == 0) continue;
            object = arrclass_1532[n2].IIIllIllIIlIlIlIlIllllIIl();
            System.arraycopy(((class_0783) object).lllIIIllIIIIlllIlIIllIIll, 0, arrby, n3, ((class_0783) object).lllIIIllIIIIlllIlIIllIIll.length);
            n3 += ((class_0783) object).lllIIIllIIIIlllIlIIllIIll.length;
        }
        if (!class_07232.IlIIIIIllllllIIlllIllllll.IlIlIIlllIIlIllIIIlllllIl.IIIllIIlIIIIIIlIlIIllIIlI) {
            for (n2 = 0; n2 < arrclass_1532.length; ++n2) {
                if (arrclass_1532[n2] == null || bl && arrclass_1532[n2].lllIIIllIIIIlllIlIIllIIll() || (n & 1 << n2) == 0) continue;
                object = arrclass_1532[n2].IllIIIllIIIIlIlIlIllIIlll();
                System.arraycopy(((class_0783) object).lllIIIllIIIIlllIlIIllIIll, 0, arrby, n3, ((class_0783) object).lllIIIllIIIIlllIlIIllIIll.length);
                n3 += ((class_0783) object).lllIIIllIIIIlllIlIIllIIll.length;
            }
        }
        if (n4 > 0) {
            for (n2 = 0; n2 < arrclass_1532.length; ++n2) {
                if (arrclass_1532[n2] == null || bl && arrclass_1532[n2].lllIIIllIIIIlllIlIIllIIll() || arrclass_1532[n2].IIIllIIlIIIIIIlIlIIllIIlI() == null || (n & 1 << n2) == 0) continue;
                object = arrclass_1532[n2].IIIllIIlIIIIIIlIlIIllIIlI();
                System.arraycopy(((class_0783) object).lllIIIllIIIIlllIlIIllIIll, 0, arrby, n3, ((class_0783) object).lllIIIllIIIIlllIlIIllIIll.length);
                n3 += ((class_0783) object).lllIIIllIIIIlllIlIIllIIll.length;
            }
        }
        if (bl) {
            byte[] arrby2 = class_07232.lIIIIlIlIIlllllIIllIIlIII();
            System.arraycopy(arrby2, 0, arrby, n3, arrby2.length);
            n3 += arrby2.length;
        }
        class_05372.lllIIIllIIIIlllIlIIllIIll = new byte[n3];
        System.arraycopy(arrby, 0, class_05372.lllIIIllIIIIlllIlIIllIIll, 0, n3);
        return class_05372;
    }

    public int IlIIIIIllllllIIlllIllllll() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public int lIllllIIlIIIlIllllllIIIll() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public int IIIllIIlIIIIIIlIlIIllIIlI() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public int IllIIlllllllIIlIIlIIIIlIl() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    public boolean IIIllIllIIlIlIlIlIllllIIl() {
        return this.IIIllIIlIIIIIIlIlIIllIIlI;
    }

    @Override
    public void processPacket(INetHandler class_20752) {
        this.lllIIIllIIIIlllIlIIllIIll((INetHandlerPlayClient)class_20752);
    }
}

