package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.lwjgl.opengl.GL11;

public class class_0994 {
    private static final Map lllIIIllIIIIlllIlIIllIIll = new HashMap();
    private static final List lllIlIIlIIIlIlIIIllIlllIl = new ArrayList();

    public static synchronized int lllIIIllIIIIlllIlIIllIIll(int n) {
        int n2 = GL11.glGenLists((int)n);
        lllIIIllIIIIlllIlIIllIIll.put(n2, n);
        return n2;
    }

    public static synchronized void lllIlIIlIIIlIlIIIllIlllIl(int n) {
        GL11.glDeleteLists((int)n, (int)((Integer)lllIIIllIIIIlllIlIIllIIll.remove(n)));
    }

    public static synchronized void lllIIIllIIIIlllIlIIllIIll() {
        for (Map.Entry entry : lllIIIllIIIIlllIlIIllIIll.entrySet()) {
            GL11.glDeleteLists((int)((Integer)entry.getKey()), (int)((Integer)entry.getValue()));
        }
        lllIIIllIIIIlllIlIIllIIll.clear();
    }

    public static synchronized ByteBuffer IlIllllllIIlIIllllIIlIIIl(int n) {
        return ByteBuffer.allocateDirect(n).order(ByteOrder.nativeOrder());
    }

    public static IntBuffer lIlllIlllIIIIlIIlllIllIII(int n) {
        return class_0994.IlIllllllIIlIIllllIIlIIIl(n << 2).asIntBuffer();
    }

    public static FloatBuffer IlIIIIIllllllIIlllIllllll(int n) {
        return class_0994.IlIllllllIIlIIllllIIlIIIl(n << 2).asFloatBuffer();
    }
}

