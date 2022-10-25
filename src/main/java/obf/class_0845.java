package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.Proxy;
import java.net.URL;
import java.util.Map;

final class class_0845
implements Runnable {
    final /* synthetic */ class_1832 lllIIIllIIIIlllIlIIllIIll;
    final /* synthetic */ String lllIlIIlIIIlIlIIIllIlllIl;
    final /* synthetic */ Proxy IlIllllllIIlIIllllIIlIIIl;
    final /* synthetic */ Map lIlllIlllIIIIlIIlllIllIII;
    final /* synthetic */ File IlIIIIIllllllIIlllIllllll;
    final /* synthetic */ class_1978 lIllllIIlIIIlIllllllIIIll;
    final /* synthetic */ int IIIllIIlIIIIIIlIlIIllIIlI;

    class_0845(class_1832 class_18322, String string, Proxy proxy, Map map, File file, class_1978 class_19782, int n) {
        this.lllIIIllIIIIlllIlIIllIIll = class_18322;
        this.lllIlIIlIIIlIlIIIllIlllIl = string;
        this.IlIllllllIIlIIllllIIlIIIl = proxy;
        this.lIlllIlllIIIIlIIlllIllIII = map;
        this.IlIIIIIllllllIIlllIllllll = file;
        this.lIllllIIlIIIlIllllllIIIll = class_19782;
        this.IIIllIIlIIIIIIlIlIIllIIlI = n;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    public void run() {
        block39: {
            block35: {
                block36: {
                    var1_1 = null;
                    var2_2 = null;
                    var3_3 = null;
                    if (this.lllIIIllIIIIlllIlIIllIIll != null) {
                        this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll("Downloading Texture Pack");
                        this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII("Making Request...");
                    }
                    var4_4 = new byte[4096];
                    var5_8 = new URL(this.lllIlIIlIIIlIlIIIllIlllIl);
                    var1_1 = var5_8.openConnection(this.IlIllllllIIlIIllllIIlIIIl);
                    var6_9 = 0.0f;
                    var7_10 = this.lIlllIlllIIIIlIIlllIllIII.entrySet().size();
                    for (Map.Entry<K, V> var9_12 : this.lIlllIlllIIIIlIIlllIllIII.entrySet()) {
                        var1_1.setRequestProperty((String)var9_12.getKey(), (String)var9_12.getValue());
                        if (this.lllIIIllIIIIlllIlIIllIIll == null) continue;
                        this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll((int)((var6_9 += 1.0f) / var7_10 * 100.0f));
                    }
                    var2_2 = var1_1.getInputStream();
                    var7_10 = var1_1.getContentLength();
                    var9_13 = var1_1.getContentLength();
                    if (this.lllIIIllIIIIlllIlIIllIIll != null) {
                        this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII(String.format("Downloading file (%.2f MB)...", new Object[]{Float.valueOf(var7_10 / 1000.0f / 1000.0f)}));
                    }
                    if (!this.IlIIIIIllllllIIlllIllllll.exists()) ** GOTO lbl49
                    var10_14 = this.IlIIIIIllllllIIlllIllllll.length();
                    if (var10_14 != (long)var9_13) break block35;
                    this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(this.IlIIIIIllllllIIlllIllllll);
                    if (this.lllIIIllIIIIlllIlIIllIIll == null) break block36;
                    this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll();
                }
                try {
                    if (var2_2 != null) {
                        var2_2.close();
                    }
                }
                catch (IOException var12_16) {
                    // empty catch block
                }
                try {
                    if (var3_3 == null) return;
                    var3_3.close();
                    return;
                }
                catch (IOException var12_17) {
                    // empty catch block
                }
                return;
            }
            class_0790.lllIlIIlIIIlIlIIIllIlllIl().warn("Deleting " + this.IlIIIIIllllllIIlllIllllll + " as it does not match what we currently have (" + var9_13 + " vs our " + var10_14 + ").");
            this.IlIIIIIllllllIIlllIllllll.delete();
            break block39;
lbl49:
            // 1 sources

            if (this.IlIIIIIllllllIIlllIllllll.getParentFile() != null) {
                this.IlIIIIIllllllIIlllIllllll.getParentFile().mkdirs();
            }
        }
        var3_3 = new DataOutputStream(new FileOutputStream(this.IlIIIIIllllllIIlllIllllll));
        if (this.IIIllIIlIIIIIIlIlIIllIIlI > 0 && var7_10 > (float)this.IIIllIIlIIIIIIlIlIIllIIlI) {
            if (this.lllIIIllIIIIlllIlIIllIIll == null) throw new IOException("Filesize is bigger than maximum allowed (file is " + var6_9 + ", limit is " + this.IIIllIIlIIIIIIlIlIIllIIlI + ")");
            this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll();
            throw new IOException("Filesize is bigger than maximum allowed (file is " + var6_9 + ", limit is " + this.IIIllIIlIIIIIIlIlIIllIIlI + ")");
        }
        var10_15 = false;
        {
            catch (Throwable var4_5) {
                var4_5.printStackTrace();
                return;
            }
        }
        while ((var11_20 = var2_2.read(var4_4)) >= 0) {
            var6_9 += (float)var11_20;
            if (this.lllIIIllIIIIlllIlIIllIIll != null) {
                this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll((int)(var6_9 / var7_10 * 100.0f));
            }
            if (this.IIIllIIlIIIIIIlIlIIllIIlI > 0 && var6_9 > (float)this.IIIllIIlIIIIIIlIlIIllIIlI) {
                if (this.lllIIIllIIIIlllIlIIllIIll == null) throw new IOException("Filesize was bigger than maximum allowed (got >= " + var6_9 + ", limit was " + this.IIIllIIlIIIIIIlIlIIllIIlI + ")");
                this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll();
                throw new IOException("Filesize was bigger than maximum allowed (got >= " + var6_9 + ", limit was " + this.IIIllIIlIIIIIIlIlIIllIIlI + ")");
            }
            var3_3.write(var4_4, 0, var11_20);
        }
        this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(this.IlIIIIIllllllIIlllIllllll);
        if (this.lllIIIllIIIIlllIlIIllIIll != null) {
            this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll();
            try {
                if (var2_2 != null) {
                    var2_2.close();
                }
            }
            catch (IOException var12_18) {
                // empty catch block
            }
            try {
                if (var3_3 == null) return;
                var3_3.close();
                return;
            }
            catch (IOException var12_19) {
                // empty catch block
            }
            return;
        }
        ** try [egrp 6[TRYBLOCK] [10 : 701->711)] { 
lbl92:
        // 1 sources

        return;
lbl93:
        // 1 sources

        finally {
            try {
                if (var2_2 != null) {
                    var2_2.close();
                }
            }
            catch (IOException var4_6) {}
            try {
                if (var3_3 != null) {
                    var3_3.close();
                }
            }
            catch (IOException var4_7) {}
        }
    }
}

