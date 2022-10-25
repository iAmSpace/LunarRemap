package net.minecraft.client.renderer;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.ARBFramebufferObject
 *  org.lwjgl.opengl.ARBMultitexture
 *  org.lwjgl.opengl.ARBShaderObjects
 *  org.lwjgl.opengl.ARBVertexShader
 *  org.lwjgl.opengl.ContextCapabilities
 *  org.lwjgl.opengl.EXTBlendFuncSeparate
 *  org.lwjgl.opengl.EXTFramebufferObject
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL13
 *  org.lwjgl.opengl.GL14
 *  org.lwjgl.opengl.GL20
 *  org.lwjgl.opengl.GL30
 *  org.lwjgl.opengl.GLContext
 */
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.Options;
import optifine.Config;
import org.lwjgl.opengl.ARBFramebufferObject;
import org.lwjgl.opengl.ARBMultitexture;
import org.lwjgl.opengl.ARBShaderObjects;
import org.lwjgl.opengl.ARBVertexShader;
import org.lwjgl.opengl.ContextCapabilities;
import org.lwjgl.opengl.EXTBlendFuncSeparate;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;
import org.lwjgl.opengl.GLContext;

public class OpenGlHelper {
    public static boolean lllIIIllIIIIlllIlIIllIIll;
    public static int lllIlIIlIIIlIlIIIllIlllIl;
    public static int IlIllllllIIlIIllllIIlIIIl;
    public static boolean lIlllIlllIIIIlIIlllIllIII;
    public static int IlIIIIIllllllIIlllIllllll;
    public static int lIllllIIlIIIlIllllllIIIll;
    public static int IIIllIIlIIIIIIlIlIIllIIlI;
    public static int IllIIlllllllIIlIIlIIIIlIl;
    public static int IIIllIllIIlIlIlIlIllllIIl;
    public static int IllIIIllIIIIlIlIlIllIIlll;
    public static int lIIIIlIlIIlllllIIllIIlIII;
    public static int llIIlllIllIllllIIIlIIIIII;
    public static int llIIllIllIlIIlIIllIllllll;
    private static int llIllllIlIllIIIlIllIIlIlI;
    public static boolean lllIIlIIIllllllIIIIlIlIlI;
    private static boolean lIlllIlllIlIIIIlllIlIlIIl;
    private static boolean IlIIlllllIIlIlIlllllIllll;
    public static int IlIlllIIIIIIlIIllIIllIlll;
    public static int IlIlIIlIlIllIIlIlIIllIIIl;
    public static int lllllIlllIIllIlIIlIIIllII;
    public static int IlIlIIlllIIlIllIIIlllllIl;
    public static boolean lIIlIIIIIlIlllIlIIlIlIlll;
    public static int lIlIlIIlIIIIlIIIIIlllIIII;
    private static boolean llIIlIlIlllIIllIlIlllIllI;
    private static boolean IllIIIIllIIllIllIlllIlIIl;
    public static boolean IlIIIlIIIIllIIIllIIIIIIll;
    public static boolean IIlllIlIlllIllIIIlllIIlIl;
    private static String field_153196_B;
    public static float lIlIllIIlIIlIIlIIlIIlIIll;
    public static float llIIlIllIllllIlIIIIlIIlll;

    public static void lllIIIllIIIIlllIlIIllIIll() {
        Config.IlIllllllIIlIIllllIIlIIIl();
        ContextCapabilities contextCapabilities = GLContext.getCapabilities();
        boolean bl = llIIlIlIlllIIllIlIlllIllI = contextCapabilities.GL_ARB_multitexture && !contextCapabilities.OpenGL13;
        if (llIIlIlIlllIIllIlIlllIllI) {
            field_153196_B = field_153196_B + "Using multitexturing ARB.\n";
            lllIlIIlIIIlIlIIIllIlllIl = 33984;
            IlIllllllIIlIIllllIIlIIIl = 33985;
        } else {
            field_153196_B = field_153196_B + "Using GL 1.3 multitexturing.\n";
            lllIlIIlIIIlIlIIIllIlllIl = 33984;
            IlIllllllIIlIIllllIIlIIIl = 33985;
        }
        IlIIIlIIIIllIIIllIIIIIIll = contextCapabilities.GL_EXT_blend_func_separate && !contextCapabilities.OpenGL14;
        IllIIIIllIIllIllIlllIlIIl = contextCapabilities.OpenGL14 || contextCapabilities.GL_EXT_blend_func_separate;
        boolean bl2 = lllIIlIIIllllllIIIIlIlIlI = IllIIIIllIIllIllIlllIlIIl && (contextCapabilities.GL_ARB_framebuffer_object || contextCapabilities.GL_EXT_framebuffer_object || contextCapabilities.OpenGL30);
        if (lllIIlIIIllllllIIIIlIlIlI) {
            field_153196_B = field_153196_B + "Using framebuffer objects because ";
            if (contextCapabilities.OpenGL30) {
                field_153196_B = field_153196_B + "OpenGL 3.0 is supported and separate blending is supported.\n";
                llIllllIlIllIIIlIllIIlIlI = 0;
                IlIIIIIllllllIIlllIllllll = 36160;
                lIllllIIlIIIlIllllllIIIll = 36161;
                IIIllIIlIIIIIIlIlIIllIIlI = 36064;
                IllIIlllllllIIlIIlIIIIlIl = 36096;
                IIIllIllIIlIlIlIlIllllIIl = 36053;
                IllIIIllIIIIlIlIlIllIIlll = 36054;
                lIIIIlIlIIlllllIIllIIlIII = 36055;
                llIIlllIllIllllIIIlIIIIII = 36059;
                llIIllIllIlIIlIIllIllllll = 36060;
            } else if (contextCapabilities.GL_ARB_framebuffer_object) {
                field_153196_B = field_153196_B + "ARB_framebuffer_object is supported and separate blending is supported.\n";
                llIllllIlIllIIIlIllIIlIlI = 1;
                IlIIIIIllllllIIlllIllllll = 36160;
                lIllllIIlIIIlIllllllIIIll = 36161;
                IIIllIIlIIIIIIlIlIIllIIlI = 36064;
                IllIIlllllllIIlIIlIIIIlIl = 36096;
                IIIllIllIIlIlIlIlIllllIIl = 36053;
                lIIIIlIlIIlllllIIllIIlIII = 36055;
                IllIIIllIIIIlIlIlIllIIlll = 36054;
                llIIlllIllIllllIIIlIIIIII = 36059;
                llIIllIllIlIIlIIllIllllll = 36060;
            } else if (contextCapabilities.GL_EXT_framebuffer_object) {
                field_153196_B = field_153196_B + "EXT_framebuffer_object is supported.\n";
                llIllllIlIllIIIlIllIIlIlI = 2;
                IlIIIIIllllllIIlllIllllll = 36160;
                lIllllIIlIIIlIllllllIIIll = 36161;
                IIIllIIlIIIIIIlIlIIllIIlI = 36064;
                IllIIlllllllIIlIIlIIIIlIl = 36096;
                IIIllIllIIlIlIlIlIllllIIl = 36053;
                lIIIIlIlIIlllllIIllIIlIII = 36055;
                IllIIIllIIIIlIlIlIllIIlll = 36054;
                llIIlllIllIllllIIIlIIIIII = 36059;
                llIIllIllIlIIlIIllIllllll = 36060;
            }
        } else {
            field_153196_B = field_153196_B + "Not using framebuffer objects because ";
            field_153196_B = field_153196_B + "OpenGL 1.4 is " + (contextCapabilities.OpenGL14 ? "" : "not ") + "supported, ";
            field_153196_B = field_153196_B + "EXT_blend_func_separate is " + (contextCapabilities.GL_EXT_blend_func_separate ? "" : "not ") + "supported, ";
            field_153196_B = field_153196_B + "OpenGL 3.0 is " + (contextCapabilities.OpenGL30 ? "" : "not ") + "supported, ";
            field_153196_B = field_153196_B + "ARB_framebuffer_object is " + (contextCapabilities.GL_ARB_framebuffer_object ? "" : "not ") + "supported, and ";
            field_153196_B = field_153196_B + "EXT_framebuffer_object is " + (contextCapabilities.GL_EXT_framebuffer_object ? "" : "not ") + "supported.\n";
        }
        lIIlIIIIIlIlllIlIIlIlIlll = contextCapabilities.GL_EXT_texture_filter_anisotropic;
        lIlIlIIlIIIIlIIIIIlllIIII = (int)(lIIlIIIIIlIlllIlIIlIlIlll ? GL11.glGetFloat((int)34047) : 0.0f);
        field_153196_B = field_153196_B + "Anisotropic filtering is " + (lIIlIIIIIlIlllIlIIlIlIlll ? "" : "not ") + "supported";
        field_153196_B = lIIlIIIIIlIlllIlIIlIlIlll ? field_153196_B + " and maximum anisotropy is " + lIlIlIIlIIIIlIIIIIlllIIII + ".\n" : field_153196_B + ".\n";
        Options.ANISOTROPIC_FILTERING.getEnumOptions(lIlIlIIlIIIIlIIIIIlllIIII);
        lllIIIllIIIIlllIlIIllIIll = contextCapabilities.OpenGL21;
        lIlllIlllIlIIIIlllIlIlIIl = lllIIIllIIIIlllIlIIllIIll || contextCapabilities.GL_ARB_vertex_shader && contextCapabilities.GL_ARB_fragment_shader && contextCapabilities.GL_ARB_shader_objects;
        field_153196_B = field_153196_B + "Shaders are " + (lIlllIlllIlIIIIlllIlIlIIl ? "" : "not ") + "available because ";
        if (lIlllIlllIlIIIIlllIlIlIIl) {
            if (contextCapabilities.OpenGL21) {
                field_153196_B = field_153196_B + "OpenGL 2.1 is supported.\n";
                IlIIlllllIIlIlIlllllIllll = false;
                IlIlllIIIIIIlIIllIIllIlll = 35714;
                IlIlIIlIlIllIIlIlIIllIIIl = 35713;
                lllllIlllIIllIlIIlIIIllII = 35633;
                IlIlIIlllIIlIllIIIlllllIl = 35632;
            } else {
                field_153196_B = field_153196_B + "ARB_shader_objects, ARB_vertex_shader, and ARB_fragment_shader are supported.\n";
                IlIIlllllIIlIlIlllllIllll = true;
                IlIlllIIIIIIlIIllIIllIlll = 35714;
                IlIlIIlIlIllIIlIlIIllIIIl = 35713;
                lllllIlllIIllIlIIlIIIllII = 35633;
                IlIlIIlllIIlIllIIIlllllIl = 35632;
            }
        } else {
            field_153196_B = field_153196_B + "OpenGL 2.1 is " + (contextCapabilities.OpenGL21 ? "" : "not ") + "supported, ";
            field_153196_B = field_153196_B + "ARB_shader_objects is " + (contextCapabilities.GL_ARB_shader_objects ? "" : "not ") + "supported, ";
            field_153196_B = field_153196_B + "ARB_vertex_shader is " + (contextCapabilities.GL_ARB_vertex_shader ? "" : "not ") + "supported, and ";
            field_153196_B = field_153196_B + "ARB_fragment_shader is " + (contextCapabilities.GL_ARB_fragment_shader ? "" : "not ") + "supported.\n";
        }
        IIlllIlIlllIllIIIlllIIlIl = lllIIlIIIllllllIIIIlIlIlI && lIlllIlllIlIIIIlllIlIlIIl;
        lIlllIlllIIIIlIIlllIllIII = GL11.glGetString((int)7936).toLowerCase().contains("nvidia");
    }

    public static boolean lllIlIIlIIIlIlIIIllIlllIl() {
        return IIlllIlIlllIllIIIlllIIlIl;
    }

    public static String func_153172_c() {
        return field_153196_B;
    }

    public static int lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        return IlIIlllllIIlIlIlllllIllll ? ARBShaderObjects.glGetObjectParameteriARB((int)n, (int)n2) : GL20.glGetProgrami((int)n, (int)n2);
    }

    public static void lllIlIIlIIIlIlIIIllIlllIl(int n, int n2) {
        if (IlIIlllllIIlIlIlllllIllll) {
            ARBShaderObjects.glAttachObjectARB((int)n, (int)n2);
        } else {
            GL20.glAttachShader((int)n, (int)n2);
        }
    }

    public static void lllIIIllIIIIlllIlIIllIIll(int n) {
        if (IlIIlllllIIlIlIlllllIllll) {
            ARBShaderObjects.glDeleteObjectARB((int)n);
        } else {
            GL20.glDeleteShader((int)n);
        }
    }

    public static int lllIlIIlIIIlIlIIIllIlllIl(int n) {
        return IlIIlllllIIlIlIlllllIllll ? ARBShaderObjects.glCreateShaderObjectARB((int)n) : GL20.glCreateShader((int)n);
    }

    public static void lllIIIllIIIIlllIlIIllIIll(int n, ByteBuffer byteBuffer) {
        if (IlIIlllllIIlIlIlllllIllll) {
            ARBShaderObjects.glShaderSourceARB((int)n, (ByteBuffer)byteBuffer);
        } else {
            GL20.glShaderSource((int)n, (ByteBuffer)byteBuffer);
        }
    }

    public static void IlIllllllIIlIIllllIIlIIIl(int n) {
        if (IlIIlllllIIlIlIlllllIllll) {
            ARBShaderObjects.glCompileShaderARB((int)n);
        } else {
            GL20.glCompileShader((int)n);
        }
    }

    public static int IlIllllllIIlIIllllIIlIIIl(int n, int n2) {
        return IlIIlllllIIlIlIlllllIllll ? ARBShaderObjects.glGetObjectParameteriARB((int)n, (int)n2) : GL20.glGetShaderi((int)n, (int)n2);
    }

    public static String lIlllIlllIIIIlIIlllIllIII(int n, int n2) {
        return IlIIlllllIIlIlIlllllIllll ? ARBShaderObjects.glGetInfoLogARB((int)n, (int)n2) : GL20.glGetShaderInfoLog((int)n, (int)n2);
    }

    public static String IlIIIIIllllllIIlllIllllll(int n, int n2) {
        return IlIIlllllIIlIlIlllllIllll ? ARBShaderObjects.glGetInfoLogARB((int)n, (int)n2) : GL20.glGetProgramInfoLog((int)n, (int)n2);
    }

    public static void lIlllIlllIIIIlIIlllIllIII(int n) {
        if (IlIIlllllIIlIlIlllllIllll) {
            ARBShaderObjects.glUseProgramObjectARB((int)n);
        } else {
            GL20.glUseProgram((int)n);
        }
    }

    public static int lIlllIlllIIIIlIIlllIllIII() {
        return IlIIlllllIIlIlIlllllIllll ? ARBShaderObjects.glCreateProgramObjectARB() : GL20.glCreateProgram();
    }

    public static void IlIIIIIllllllIIlllIllllll(int n) {
        if (IlIIlllllIIlIlIlllllIllll) {
            ARBShaderObjects.glDeleteObjectARB((int)n);
        } else {
            GL20.glDeleteProgram((int)n);
        }
    }

    public static void lIllllIIlIIIlIllllllIIIll(int n) {
        if (IlIIlllllIIlIlIlllllIllll) {
            ARBShaderObjects.glLinkProgramARB((int)n);
        } else {
            GL20.glLinkProgram((int)n);
        }
    }

    public static int lllIIIllIIIIlllIlIIllIIll(int n, CharSequence charSequence) {
        return IlIIlllllIIlIlIlllllIllll ? ARBShaderObjects.glGetUniformLocationARB((int)n, (CharSequence)charSequence) : GL20.glGetUniformLocation((int)n, (CharSequence)charSequence);
    }

    public static void lllIIIllIIIIlllIlIIllIIll(int n, IntBuffer intBuffer) {
        if (IlIIlllllIIlIlIlllllIllll) {
            ARBShaderObjects.glUniform1ARB((int)n, (IntBuffer)intBuffer);
        } else {
            GL20.glUniform1((int)n, (IntBuffer)intBuffer);
        }
    }

    public static void lIllllIIlIIIlIllllllIIIll(int n, int n2) {
        if (IlIIlllllIIlIlIlllllIllll) {
            ARBShaderObjects.glUniform1iARB((int)n, (int)n2);
        } else {
            GL20.glUniform1i((int)n, (int)n2);
        }
    }

    public static void lllIIIllIIIIlllIlIIllIIll(int n, FloatBuffer floatBuffer) {
        if (IlIIlllllIIlIlIlllllIllll) {
            ARBShaderObjects.glUniform1ARB((int)n, (FloatBuffer)floatBuffer);
        } else {
            GL20.glUniform1((int)n, (FloatBuffer)floatBuffer);
        }
    }

    public static void lllIlIIlIIIlIlIIIllIlllIl(int n, IntBuffer intBuffer) {
        if (IlIIlllllIIlIlIlllllIllll) {
            ARBShaderObjects.glUniform2ARB((int)n, (IntBuffer)intBuffer);
        } else {
            GL20.glUniform2((int)n, (IntBuffer)intBuffer);
        }
    }

    public static void lllIlIIlIIIlIlIIIllIlllIl(int n, FloatBuffer floatBuffer) {
        if (IlIIlllllIIlIlIlllllIllll) {
            ARBShaderObjects.glUniform2ARB((int)n, (FloatBuffer)floatBuffer);
        } else {
            GL20.glUniform2((int)n, (FloatBuffer)floatBuffer);
        }
    }

    public static void IlIllllllIIlIIllllIIlIIIl(int n, IntBuffer intBuffer) {
        if (IlIIlllllIIlIlIlllllIllll) {
            ARBShaderObjects.glUniform3ARB((int)n, (IntBuffer)intBuffer);
        } else {
            GL20.glUniform3((int)n, (IntBuffer)intBuffer);
        }
    }

    public static void IlIllllllIIlIIllllIIlIIIl(int n, FloatBuffer floatBuffer) {
        if (IlIIlllllIIlIlIlllllIllll) {
            ARBShaderObjects.glUniform3ARB((int)n, (FloatBuffer)floatBuffer);
        } else {
            GL20.glUniform3((int)n, (FloatBuffer)floatBuffer);
        }
    }

    public static void lIlllIlllIIIIlIIlllIllIII(int n, IntBuffer intBuffer) {
        if (IlIIlllllIIlIlIlllllIllll) {
            ARBShaderObjects.glUniform4ARB((int)n, (IntBuffer)intBuffer);
        } else {
            GL20.glUniform4((int)n, (IntBuffer)intBuffer);
        }
    }

    public static void lIlllIlllIIIIlIIlllIllIII(int n, FloatBuffer floatBuffer) {
        if (IlIIlllllIIlIlIlllllIllll) {
            ARBShaderObjects.glUniform4ARB((int)n, (FloatBuffer)floatBuffer);
        } else {
            GL20.glUniform4((int)n, (FloatBuffer)floatBuffer);
        }
    }

    public static void lllIIIllIIIIlllIlIIllIIll(int n, boolean bl, FloatBuffer floatBuffer) {
        if (IlIIlllllIIlIlIlllllIllll) {
            ARBShaderObjects.glUniformMatrix2ARB((int)n, (boolean)bl, (FloatBuffer)floatBuffer);
        } else {
            GL20.glUniformMatrix2((int)n, (boolean)bl, (FloatBuffer)floatBuffer);
        }
    }

    public static void lllIlIIlIIIlIlIIIllIlllIl(int n, boolean bl, FloatBuffer floatBuffer) {
        if (IlIIlllllIIlIlIlllllIllll) {
            ARBShaderObjects.glUniformMatrix3ARB((int)n, (boolean)bl, (FloatBuffer)floatBuffer);
        } else {
            GL20.glUniformMatrix3((int)n, (boolean)bl, (FloatBuffer)floatBuffer);
        }
    }

    public static void IlIllllllIIlIIllllIIlIIIl(int n, boolean bl, FloatBuffer floatBuffer) {
        if (IlIIlllllIIlIlIlllllIllll) {
            ARBShaderObjects.glUniformMatrix4ARB((int)n, (boolean)bl, (FloatBuffer)floatBuffer);
        } else {
            GL20.glUniformMatrix4((int)n, (boolean)bl, (FloatBuffer)floatBuffer);
        }
    }

    public static int lllIlIIlIIIlIlIIIllIlllIl(int n, CharSequence charSequence) {
        return IlIIlllllIIlIlIlllllIllll ? ARBVertexShader.glGetAttribLocationARB((int)n, (CharSequence)charSequence) : GL20.glGetAttribLocation((int)n, (CharSequence)charSequence);
    }

    public static void IIIllIIlIIIIIIlIlIIllIIlI(int n, int n2) {
        if (lllIIlIIIllllllIIIIlIlIlI) {
            switch (llIllllIlIllIIIlIllIIlIlI) {
                case 0: {
                    GL30.glBindFramebuffer((int)n, (int)n2);
                    break;
                }
                case 1: {
                    ARBFramebufferObject.glBindFramebuffer((int)n, (int)n2);
                    break;
                }
                case 2: {
                    EXTFramebufferObject.glBindFramebufferEXT((int)n, (int)n2);
                }
            }
        }
    }

    public static void IllIIlllllllIIlIIlIIIIlIl(int n, int n2) {
        if (lllIIlIIIllllllIIIIlIlIlI) {
            switch (llIllllIlIllIIIlIllIIlIlI) {
                case 0: {
                    GL30.glBindRenderbuffer((int)n, (int)n2);
                    break;
                }
                case 1: {
                    ARBFramebufferObject.glBindRenderbuffer((int)n, (int)n2);
                    break;
                }
                case 2: {
                    EXTFramebufferObject.glBindRenderbufferEXT((int)n, (int)n2);
                }
            }
        }
    }

    public static void IIIllIIlIIIIIIlIlIIllIIlI(int n) {
        if (lllIIlIIIllllllIIIIlIlIlI) {
            switch (llIllllIlIllIIIlIllIIlIlI) {
                case 0: {
                    GL30.glDeleteRenderbuffers((int)n);
                    break;
                }
                case 1: {
                    ARBFramebufferObject.glDeleteRenderbuffers((int)n);
                    break;
                }
                case 2: {
                    EXTFramebufferObject.glDeleteRenderbuffersEXT((int)n);
                }
            }
        }
    }

    public static void IllIIlllllllIIlIIlIIIIlIl(int n) {
        if (lllIIlIIIllllllIIIIlIlIlI) {
            switch (llIllllIlIllIIIlIllIIlIlI) {
                case 0: {
                    GL30.glDeleteFramebuffers((int)n);
                    break;
                }
                case 1: {
                    ARBFramebufferObject.glDeleteFramebuffers((int)n);
                    break;
                }
                case 2: {
                    EXTFramebufferObject.glDeleteFramebuffersEXT((int)n);
                }
            }
        }
    }

    public static int IlIIIIIllllllIIlllIllllll() {
        if (!lllIIlIIIllllllIIIIlIlIlI) {
            return -1;
        }
        switch (llIllllIlIllIIIlIllIIlIlI) {
            case 0: {
                return GL30.glGenFramebuffers();
            }
            case 1: {
                return ARBFramebufferObject.glGenFramebuffers();
            }
            case 2: {
                return EXTFramebufferObject.glGenFramebuffersEXT();
            }
        }
        return -1;
    }

    public static int lIllllIIlIIIlIllllllIIIll() {
        if (!lllIIlIIIllllllIIIIlIlIlI) {
            return -1;
        }
        switch (llIllllIlIllIIIlIllIIlIlI) {
            case 0: {
                return GL30.glGenRenderbuffers();
            }
            case 1: {
                return ARBFramebufferObject.glGenRenderbuffers();
            }
            case 2: {
                return EXTFramebufferObject.glGenRenderbuffersEXT();
            }
        }
        return -1;
    }

    public static void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4) {
        if (lllIIlIIIllllllIIIIlIlIlI) {
            switch (llIllllIlIllIIIlIllIIlIlI) {
                case 0: {
                    GL30.glRenderbufferStorage((int)n, (int)n2, (int)n3, (int)n4);
                    break;
                }
                case 1: {
                    ARBFramebufferObject.glRenderbufferStorage((int)n, (int)n2, (int)n3, (int)n4);
                    break;
                }
                case 2: {
                    EXTFramebufferObject.glRenderbufferStorageEXT((int)n, (int)n2, (int)n3, (int)n4);
                }
            }
        }
    }

    public static void lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, int n3, int n4) {
        if (lllIIlIIIllllllIIIIlIlIlI) {
            switch (llIllllIlIllIIIlIllIIlIlI) {
                case 0: {
                    GL30.glFramebufferRenderbuffer((int)n, (int)n2, (int)n3, (int)n4);
                    break;
                }
                case 1: {
                    ARBFramebufferObject.glFramebufferRenderbuffer((int)n, (int)n2, (int)n3, (int)n4);
                    break;
                }
                case 2: {
                    EXTFramebufferObject.glFramebufferRenderbufferEXT((int)n, (int)n2, (int)n3, (int)n4);
                }
            }
        }
    }

    public static int IIIllIllIIlIlIlIlIllllIIl(int n) {
        if (!lllIIlIIIllllllIIIIlIlIlI) {
            return -1;
        }
        switch (llIllllIlIllIIIlIllIIlIlI) {
            case 0: {
                return GL30.glCheckFramebufferStatus((int)n);
            }
            case 1: {
                return ARBFramebufferObject.glCheckFramebufferStatus((int)n);
            }
            case 2: {
                return EXTFramebufferObject.glCheckFramebufferStatusEXT((int)n);
            }
        }
        return -1;
    }

    public static void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4, int n5) {
        if (lllIIlIIIllllllIIIIlIlIlI) {
            switch (llIllllIlIllIIIlIllIIlIlI) {
                case 0: {
                    GL30.glFramebufferTexture2D((int)n, (int)n2, (int)n3, (int)n4, (int)n5);
                    break;
                }
                case 1: {
                    ARBFramebufferObject.glFramebufferTexture2D((int)n, (int)n2, (int)n3, (int)n4, (int)n5);
                    break;
                }
                case 2: {
                    EXTFramebufferObject.glFramebufferTexture2DEXT((int)n, (int)n2, (int)n3, (int)n4, (int)n5);
                }
            }
        }
    }

    public static void IllIIIllIIIIlIlIlIllIIlll(int n) {
        if (llIIlIlIlllIIllIlIlllIllI) {
            ARBMultitexture.glActiveTextureARB((int)n);
        } else {
            GL13.glActiveTexture((int)n);
        }
    }

    public static void lIIIIlIlIIlllllIIllIIlIII(int n) {
        if (llIIlIlIlllIIllIlIlllIllI) {
            ARBMultitexture.glClientActiveTextureARB((int)n);
        } else {
            GL13.glClientActiveTexture((int)n);
        }
    }

    public static void lllIIIllIIIIlllIlIIllIIll(int n, float f, float f2) {
        if (llIIlIlIlllIIllIlIlllIllI) {
            ARBMultitexture.glMultiTexCoord2fARB((int)n, (float)f, (float)f2);
        } else {
            GL13.glMultiTexCoord2f((int)n, (float)f, (float)f2);
        }
        if (n == IlIllllllIIlIIllllIIlIIIl) {
            lIlIllIIlIIlIIlIIlIIlIIll = f;
            llIIlIllIllllIlIIIIlIIlll = f2;
        }
    }

    public static void glBlendFunc(int n, int n2, int n3, int n4) {
        if (IllIIIIllIIllIllIlllIlIIl) {
            if (IlIIIlIIIIllIIIllIIIIIIll) {
                EXTBlendFuncSeparate.glBlendFuncSeparateEXT((int)n, (int)n2, (int)n3, (int)n4);
            } else {
                GL14.glBlendFuncSeparate((int)n, (int)n2, (int)n3, (int)n4);
            }
        } else {
            GL11.glBlendFunc((int)n, (int)n2);
        }
    }

    public static boolean IIIllIIlIIIIIIlIlIIllIIlI() {
        return lllIIlIIIllllllIIIIlIlIlI && Minecraft.getMinecraft().gameSettings.IIIllIIlIIIIIIlIlIIllIIlI;
    }

    static {
        field_153196_B = "";
        lIlIllIIlIIlIIlIIlIIlIIll = 0.0f;
        llIIlIllIllllIlIIIIlIIlll = 0.0f;
    }
}

