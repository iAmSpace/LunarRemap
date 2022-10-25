package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.vecmath.Matrix4f
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.BufferUtils
 */
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import javax.vecmath.Matrix4f;

import net.minecraft.client.renderer.OpenGlHelper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.BufferUtils;

public class class_0900 {
    private static final Logger lllIIIllIIIIlllIlIIllIIll = LogManager.getLogger();
    private int lllIlIIlIIIlIlIIIllIlllIl;
    private final int IlIllllllIIlIIllllIIlIIIl;
    private final int lIlllIlllIIIIlIIlllIllIII;
    private final IntBuffer IlIIIIIllllllIIlllIllllll;
    private final FloatBuffer lIllllIIlIIIlIllllllIIIll;
    private final String IIIllIIlIIIIIIlIlIIllIIlI;
    private boolean IllIIlllllllIIlIIlIIIIlIl;
    private final class_1282 IIIllIllIIlIlIlIlIllllIIl;

    public class_0900(String string, int n, int n2, class_1282 class_12822) {
        this.IIIllIIlIIIIIIlIlIIllIIlI = string;
        this.IlIllllllIIlIIllllIIlIIIl = n2;
        this.lIlllIlllIIIIlIIlllIllIII = n;
        this.IIIllIllIIlIlIlIlIllllIIl = class_12822;
        if (n <= 3) {
            this.IlIIIIIllllllIIlllIllllll = BufferUtils.createIntBuffer((int)n2);
            this.lIllllIIlIIIlIllllllIIIll = null;
        } else {
            this.IlIIIIIllllllIIlllIllllll = null;
            this.lIllllIIlIIIlIllllllIIIll = BufferUtils.createFloatBuffer((int)n2);
        }
        this.lllIlIIlIIIlIlIIIllIlllIl = -1;
        this.IlIllllllIIlIIllllIIlIIIl();
    }

    private void IlIllllllIIlIIllllIIlIIIl() {
        this.IllIIlllllllIIlIIlIIIIlIl = true;
        if (this.IIIllIllIIlIlIlIlIllllIIl != null) {
            this.IIIllIllIIlIlIlIlIllllIIl.lIlllIlllIIIIlIIlllIllIII();
        }
    }

    public static int lllIIIllIIIIlllIlIIllIIll(String string) {
        int n = -1;
        if (string.equals("int")) {
            n = 0;
        } else if (string.equals("float")) {
            n = 4;
        } else if (string.startsWith("matrix")) {
            if (string.endsWith("2x2")) {
                n = 8;
            } else if (string.endsWith("3x3")) {
                n = 9;
            } else if (string.endsWith("4x4")) {
                n = 10;
            }
        }
        return n;
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n) {
        this.lllIlIIlIIIlIlIIIllIlllIl = n;
    }

    public String lllIIIllIIIIlllIlIIllIIll() {
        return this.IIIllIIlIIIIIIlIlIIllIIlI;
    }

    public void lllIIIllIIIIlllIlIIllIIll(float f) {
        this.lIllllIIlIIIlIllllllIIIll.position(0);
        this.lIllllIIlIIIlIllllllIIIll.put(0, f);
        this.IlIllllllIIlIIllllIIlIIIl();
    }

    public void lllIIIllIIIIlllIlIIllIIll(float f, float f2) {
        this.lIllllIIlIIIlIllllllIIIll.position(0);
        this.lIllllIIlIIIlIllllllIIIll.put(0, f);
        this.lIllllIIlIIIlIllllllIIIll.put(1, f2);
        this.IlIllllllIIlIIllllIIlIIIl();
    }

    public void lllIIIllIIIIlllIlIIllIIll(float f, float f2, float f3) {
        this.lIllllIIlIIIlIllllllIIIll.position(0);
        this.lIllllIIlIIIlIllllllIIIll.put(0, f);
        this.lIllllIIlIIIlIllllllIIIll.put(1, f2);
        this.lIllllIIlIIIlIllllllIIIll.put(2, f3);
        this.IlIllllllIIlIIllllIIlIIIl();
    }

    public void lllIIIllIIIIlllIlIIllIIll(float f, float f2, float f3, float f4) {
        this.lIllllIIlIIIlIllllllIIIll.position(0);
        this.lIllllIIlIIIlIllllllIIIll.put(f);
        this.lIllllIIlIIIlIllllllIIIll.put(f2);
        this.lIllllIIlIIIlIllllllIIIll.put(f3);
        this.lIllllIIlIIIlIllllllIIIll.put(f4);
        this.lIllllIIlIIIlIllllllIIIll.flip();
        this.IlIllllllIIlIIllllIIlIIIl();
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(float f, float f2, float f3, float f4) {
        this.lIllllIIlIIIlIllllllIIIll.position(0);
        if (this.lIlllIlllIIIIlIIlllIllIII >= 4) {
            this.lIllllIIlIIIlIllllllIIIll.put(0, f);
        }
        if (this.lIlllIlllIIIIlIIlllIllIII >= 5) {
            this.lIllllIIlIIIlIllllllIIIll.put(1, f2);
        }
        if (this.lIlllIlllIIIIlIIlllIllIII >= 6) {
            this.lIllllIIlIIIlIllllllIIIll.put(2, f3);
        }
        if (this.lIlllIlllIIIIlIIlllIllIII >= 7) {
            this.lIllllIIlIIIlIllllllIIIll.put(3, f4);
        }
        this.IlIllllllIIlIIllllIIlIIIl();
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4) {
        this.IlIIIIIllllllIIlllIllllll.position(0);
        if (this.lIlllIlllIIIIlIIlllIllIII >= 0) {
            this.IlIIIIIllllllIIlllIllllll.put(0, n);
        }
        if (this.lIlllIlllIIIIlIIlllIllIII >= 1) {
            this.IlIIIIIllllllIIlllIllllll.put(1, n2);
        }
        if (this.lIlllIlllIIIIlIIlllIllIII >= 2) {
            this.IlIIIIIllllllIIlllIllllll.put(2, n3);
        }
        if (this.lIlllIlllIIIIlIIlllIllIII >= 3) {
            this.IlIIIIIllllllIIlllIllllll.put(3, n4);
        }
        this.IlIllllllIIlIIllllIIlIIIl();
    }

    public void lllIIIllIIIIlllIlIIllIIll(float[] arrf) {
        if (arrf.length < this.IlIllllllIIlIIllllIIlIIIl) {
            lllIIIllIIIIlllIlIIllIIll.warn("Uniform.set called with a too-small value array (expected " + this.IlIllllllIIlIIllllIIlIIIl + ", got " + arrf.length + "). Ignoring.");
        } else {
            this.lIllllIIlIIIlIllllllIIIll.position(0);
            this.lIllllIIlIIIlIllllllIIIll.put(arrf);
            this.lIllllIIlIIIlIllllllIIIll.position(0);
            this.IlIllllllIIlIIllllIIlIIIl();
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        this.lIllllIIlIIIlIllllllIIIll.position(0);
        this.lIllllIIlIIIlIllllllIIIll.put(0, f);
        this.lIllllIIlIIIlIllllllIIIll.put(1, f2);
        this.lIllllIIlIIIlIllllllIIIll.put(2, f3);
        this.lIllllIIlIIIlIllllllIIIll.put(3, f4);
        this.lIllllIIlIIIlIllllllIIIll.put(4, f5);
        this.lIllllIIlIIIlIllllllIIIll.put(5, f6);
        this.lIllllIIlIIIlIllllllIIIll.put(6, f7);
        this.lIllllIIlIIIlIllllllIIIll.put(7, f8);
        this.lIllllIIlIIIlIllllllIIIll.put(8, f9);
        this.lIllllIIlIIIlIllllllIIIll.put(9, f10);
        this.lIllllIIlIIIlIllllllIIIll.put(10, f11);
        this.lIllllIIlIIIlIllllllIIIll.put(11, f12);
        this.lIllllIIlIIIlIllllllIIIll.put(12, f13);
        this.lIllllIIlIIIlIllllllIIIll.put(13, f14);
        this.lIllllIIlIIIlIllllllIIIll.put(14, f15);
        this.lIllllIIlIIIlIllllllIIIll.put(15, f16);
        this.IlIllllllIIlIIllllIIlIIIl();
    }

    public void lllIIIllIIIIlllIlIIllIIll(Matrix4f matrix4f) {
        this.lllIIIllIIIIlllIlIIllIIll(matrix4f.m00, matrix4f.m01, matrix4f.m02, matrix4f.m03, matrix4f.m10, matrix4f.m11, matrix4f.m12, matrix4f.m13, matrix4f.m20, matrix4f.m21, matrix4f.m22, matrix4f.m23, matrix4f.m30, matrix4f.m31, matrix4f.m32, matrix4f.m33);
    }

    public void lllIlIIlIIIlIlIIIllIlllIl() {
        if (!this.IllIIlllllllIIlIIlIIIIlIl) {
            // empty if block
        }
        this.IllIIlllllllIIlIIlIIIIlIl = false;
        if (this.lIlllIlllIIIIlIIlllIllIII <= 3) {
            this.lIlllIlllIIIIlIIlllIllIII();
        } else if (this.lIlllIlllIIIIlIIlllIllIII <= 7) {
            this.IlIIIIIllllllIIlllIllllll();
        } else {
            if (this.lIlllIlllIIIIlIIlllIllIII > 10) {
                lllIIIllIIIIlllIlIIllIIll.warn("Uniform.upload called, but type value (" + this.lIlllIlllIIIIlIIlllIllIII + ") is not a valid type. Ignoring.");
                return;
            }
            this.lIllllIIlIIIlIllllllIIIll();
        }
    }

    private void lIlllIlllIIIIlIIlllIllIII() {
        switch (this.lIlllIlllIIIIlIIlllIllIII) {
            case 0: {
                OpenGlHelper.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIIIIIllllllIIlllIllllll);
                break;
            }
            case 1: {
                OpenGlHelper.lllIlIIlIIIlIlIIIllIlllIl(this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIIIIIllllllIIlllIllllll);
                break;
            }
            case 2: {
                OpenGlHelper.IlIllllllIIlIIllllIIlIIIl(this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIIIIIllllllIIlllIllllll);
                break;
            }
            case 3: {
                OpenGlHelper.lIlllIlllIIIIlIIlllIllIII(this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIIIIIllllllIIlllIllllll);
                break;
            }
            default: {
                lllIIIllIIIIlllIlIIllIIll.warn("Uniform.upload called, but count value (" + this.IlIllllllIIlIIllllIIlIIIl + ") is  not in the range of 1 to 4. Ignoring.");
            }
        }
    }

    private void IlIIIIIllllllIIlllIllllll() {
        switch (this.lIlllIlllIIIIlIIlllIllIII) {
            case 4: {
                OpenGlHelper.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl, this.lIllllIIlIIIlIllllllIIIll);
                break;
            }
            case 5: {
                OpenGlHelper.lllIlIIlIIIlIlIIIllIlllIl(this.lllIlIIlIIIlIlIIIllIlllIl, this.lIllllIIlIIIlIllllllIIIll);
                break;
            }
            case 6: {
                OpenGlHelper.IlIllllllIIlIIllllIIlIIIl(this.lllIlIIlIIIlIlIIIllIlllIl, this.lIllllIIlIIIlIllllllIIIll);
                break;
            }
            case 7: {
                OpenGlHelper.lIlllIlllIIIIlIIlllIllIII(this.lllIlIIlIIIlIlIIIllIlllIl, this.lIllllIIlIIIlIllllllIIIll);
                break;
            }
            default: {
                lllIIIllIIIIlllIlIIllIIll.warn("Uniform.upload called, but count value (" + this.IlIllllllIIlIIllllIIlIIIl + ") is not in the range of 1 to 4. Ignoring.");
            }
        }
    }

    private void lIllllIIlIIIlIllllllIIIll() {
        switch (this.lIlllIlllIIIIlIIlllIllIII) {
            case 8: {
                OpenGlHelper.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl, true, this.lIllllIIlIIIlIllllllIIIll);
                break;
            }
            case 9: {
                OpenGlHelper.lllIlIIlIIIlIlIIIllIlllIl(this.lllIlIIlIIIlIlIIIllIlllIl, true, this.lIllllIIlIIIlIllllllIIIll);
                break;
            }
            case 10: {
                OpenGlHelper.IlIllllllIIlIIllllIIlIIIl(this.lllIlIIlIIIlIlIIIllIlllIl, true, this.lIllllIIlIIIlIllllllIIIll);
            }
        }
    }
}

