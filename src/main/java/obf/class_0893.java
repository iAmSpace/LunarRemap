package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.crash.CrashReport;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class class_0893 {
    public static class_0775 lllIIIllIIIIlllIlIIllIIll(InputStream inputStream) {
        class_0775 class_07752;
        try (DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new GZIPInputStream(inputStream)));){
            class_07752 = class_0893.lllIIIllIIIIlllIlIIllIIll(dataInputStream, class_1633.lllIIIllIIIIlllIlIIllIIll);
        }
        return class_07752;
    }

    public static void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752, OutputStream outputStream) {
        try (DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new GZIPOutputStream(outputStream)));){
            class_0893.lllIIIllIIIIlllIlIIllIIll(class_07752, (DataOutput)dataOutputStream);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static class_0775 lllIIIllIIIIlllIlIIllIIll(byte[] arrby, class_1633 class_16332) {
        class_0775 class_07752;
        try (DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new GZIPInputStream(new ByteArrayInputStream(arrby))));){
            class_07752 = class_0893.lllIIIllIIIIlllIlIIllIIll(dataInputStream, class_16332);
        }
        return class_07752;
    }

    public static byte[] lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try (DataOutputStream dataOutputStream = new DataOutputStream(new GZIPOutputStream(byteArrayOutputStream));){
            class_0893.lllIIIllIIIIlllIlIIllIIll(class_07752, (DataOutput)dataOutputStream);
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752, File file) {
        File file2 = new File(file.getAbsolutePath() + "_tmp");
        if (file2.exists()) {
            file2.delete();
        }
        class_0893.lllIlIIlIIIlIlIIIllIlllIl(class_07752, file2);
        if (file.exists()) {
            file.delete();
        }
        if (file.exists()) {
            throw new IOException("Failed to delete " + file);
        }
        file2.renameTo(file);
    }

    public static void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752, File file) {
        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));){
            class_0893.lllIIIllIIIIlllIlIIllIIll(class_07752, (DataOutput)dataOutputStream);
        }
    }

    public static class_0775 lllIIIllIIIIlllIlIIllIIll(File file) {
        return class_0893.lllIIIllIIIIlllIlIIllIIll(file, class_1633.lllIIIllIIIIlllIlIIllIIll);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static class_0775 lllIIIllIIIIlllIlIIllIIll(File file, class_1633 class_16332) {
        class_0775 class_07752;
        if (!file.exists()) {
            return null;
        }
        try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));){
            class_07752 = class_0893.lllIIIllIIIIlllIlIIllIIll(dataInputStream, class_16332);
        }
        return class_07752;
    }

    public static class_0775 lllIIIllIIIIlllIlIIllIIll(DataInputStream dataInputStream) {
        return class_0893.lllIIIllIIIIlllIlIIllIIll(dataInputStream, class_1633.lllIIIllIIIIlllIlIIllIIll);
    }

    public static class_0775 lllIIIllIIIIlllIlIIllIIll(DataInput dataInput, class_1633 class_16332) {
        class_2037 class_20372 = class_0893.lllIIIllIIIIlllIlIIllIIll(dataInput, 0, class_16332);
        if (class_20372 instanceof class_0775) {
            return (class_0775)class_20372;
        }
        throw new IOException("Root tag must be a named compound tag");
    }

    public static void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752, DataOutput dataOutput) {
        class_0893.lllIIIllIIIIlllIlIIllIIll((class_2037)class_07752, dataOutput);
    }

    private static void lllIIIllIIIIlllIlIIllIIll(class_2037 class_20372, DataOutput dataOutput) {
        dataOutput.writeByte(class_20372.lllIIIllIIIIlllIlIIllIIll());
        if (class_20372.lllIIIllIIIIlllIlIIllIIll() != 0) {
            dataOutput.writeUTF("");
            class_20372.lllIIIllIIIIlllIlIIllIIll(dataOutput);
        }
    }

    private static class_2037 lllIIIllIIIIlllIlIIllIIll(DataInput dataInput, int n, class_1633 class_16332) {
        byte by = dataInput.readByte();
        if (by == 0) {
            return new class_1011();
        }
        dataInput.readUTF();
        class_2037 class_20372 = class_2037.lllIIIllIIIIlllIlIIllIIll(by);
        try {
            class_20372.lllIIIllIIIIlllIlIIllIIll(dataInput, n, class_16332);
            return class_20372;
        }
        catch (IOException iOException) {
            CrashReport class_02232 = CrashReport.lllIIIllIIIIlllIlIIllIIll(iOException, "Loading NBT data");
            class_0799 class_07992 = class_02232.lllIIIllIIIIlllIlIIllIIll("NBT Tag");
            class_07992.lllIIIllIIIIlllIlIIllIIll("Tag name", "[UNNAMED TAG]");
            class_07992.lllIIIllIIIIlllIlIIllIIll("Tag type", by);
            throw new class_0892(class_02232);
        }
    }
}

