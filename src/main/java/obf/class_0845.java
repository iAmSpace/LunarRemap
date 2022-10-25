package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.io.*;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.Map;

final class class_0845
implements Runnable {
    final /* synthetic */ class_1832 lllIIIllIIIIlllIlIIllIIll; //
    final /* synthetic */ String lllIlIIlIIIlIlIIIllIlllIl; //
    final /* synthetic */ Proxy IlIllllllIIlIIllllIIlIIIl; //
    final /* synthetic */ Map lIlllIlllIIIIlIIlllIllIII; //
    final /* synthetic */ File IlIIIIIllllllIIlllIllllll; //
    final /* synthetic */ class_1978 lIllllIIlIIIlIllllllIIIll;
    final /* synthetic */ int IIIllIIlIIIIIIlIlIIllIIlI; //

    class_0845(class_1832 class_18322, String string, Proxy proxy, Map map, File file, class_1978 class_19782, int n) {
        this.lllIIIllIIIIlllIlIIllIIll = class_18322;
        this.lllIlIIlIIIlIlIIIllIlllIl = string;
        this.IlIllllllIIlIIllllIIlIIIl = proxy;
        this.lIlllIlllIIIIlIIlllIllIII = map;
        this.IlIIIIIllllllIIlllIllllll = file;
        this.lIllllIIlIIIlIllllllIIIll = class_19782;
        this.IIIllIIlIIIIIIlIlIIllIIlI = n;
    }

    @Override
    public void run() {
        /*block39: {
            block35: {
                block36: {
                    var1_1 = null;
                    var2_2 = null;
                    var3_3 = null;
                    if (this.lllIIIllIIIIlllIlIIllIIll != null) {
                        this.lllIIIllIIIIlllIlIIllIIll.resetProgressAndMessage("Downloading Texture Pack");
                        this.lllIIIllIIIIlllIlIIllIIll.resetProgresAndWorkingMessage("Making Request...");
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
                        this.lllIIIllIIIIlllIlIIllIIll.resetProgresAndWorkingMessage(String.format("Downloading file (%.2f MB)...", new Object[]{Float.valueOf(var7_10 / 1000.0f / 1000.0f)}));
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
        }*/

        // That was pain

        File p_151223_0_ = this.IlIIIIIllllllIIlllIllllll;
        String p_151223_1_ = this.lllIlIIlIIIlIlIIIllIlllIl;
        class_1978 p_151223_2_ = this.lIllllIIlIIIlIllllllIIIll;
        Map p_151223_3_ = this.lIlllIlllIIIIlIIlllIllIII;
        int p_151223_4_ = this.IIIllIIlIIIIIIlIlIIllIIlI;
        class_1832 p_151223_5_ = this.lllIIIllIIIIlllIlIIllIIll;
        Proxy p_151223_6_ = this.IlIllllllIIlIIllllIIlIIIl;

        URLConnection var1 = null;
        InputStream var2 = null;
        DataOutputStream var3 = null;

        if (p_151223_5_ != null)
        {
            p_151223_5_.resetProgressAndMessage("Downloading Texture Pack");
            p_151223_5_.resetProgresAndWorkingMessage("Making Request...");
        }

        try
        {
            byte[] var4 = new byte[4096];
            URL var5 = new URL(p_151223_1_);
            var1 = var5.openConnection(p_151223_6_);
            float var6 = 0.0F;
            float var7 = (float)p_151223_3_.entrySet().size();
            Iterator var8 = p_151223_3_.entrySet().iterator();

            while (var8.hasNext())
            {
                Map.Entry var9 = (Map.Entry)var8.next();
                var1.setRequestProperty((String)var9.getKey(), (String)var9.getValue());

                if (p_151223_5_ != null)
                {
                    p_151223_5_.setLoadingProgress((int)(++var6 / var7 * 100.0F));
                }
            }

            var2 = var1.getInputStream();
            var7 = (float)var1.getContentLength();
            int var28 = var1.getContentLength();

            if (p_151223_5_ != null)
            {
                p_151223_5_.resetProgresAndWorkingMessage(String.format("Downloading file (%.2f MB)...", new Object[] {Float.valueOf(var7 / 1000.0F / 1000.0F)}));
            }

            if (p_151223_0_.exists())
            {
                long var29 = p_151223_0_.length();

                if (var29 == (long)var28)
                {
                    p_151223_2_.func_148522_a(p_151223_0_);

                    if (p_151223_5_ != null)
                    {
                        p_151223_5_.func_146586_a();
                    }

                    return;
                }

                HttpUtil.getLogger().warn("Deleting " + p_151223_0_ + " as it does not match what we currently have (" + var28 + " vs our " + var29 + ").");
                p_151223_0_.delete();
            }
            else if (p_151223_0_.getParentFile() != null)
            {
                p_151223_0_.getParentFile().mkdirs();
            }

            var3 = new DataOutputStream(new FileOutputStream(p_151223_0_));

            if (p_151223_4_ > 0 && var7 > (float)p_151223_4_)
            {
                if (p_151223_5_ != null)
                {
                    p_151223_5_.func_146586_a();
                }

                throw new IOException("Filesize is bigger than maximum allowed (file is " + var6 + ", limit is " + p_151223_4_ + ")");
            }

            boolean var30 = false;
            int var31;

            while ((var31 = var2.read(var4)) >= 0)
            {
                var6 += (float)var31;

                if (p_151223_5_ != null)
                {
                    p_151223_5_.setLoadingProgress((int)(var6 / var7 * 100.0F));
                }

                if (p_151223_4_ > 0 && var6 > (float)p_151223_4_)
                {
                    if (p_151223_5_ != null)
                    {
                        p_151223_5_.func_146586_a();
                    }

                    throw new IOException("Filesize was bigger than maximum allowed (got >= " + var6 + ", limit was " + p_151223_4_ + ")");
                }

                var3.write(var4, 0, var31);
            }

            p_151223_2_.func_148522_a(p_151223_0_);

            if (p_151223_5_ != null)
            {
                p_151223_5_.func_146586_a();
            }
        }
        catch (Throwable var26)
        {
            var26.printStackTrace();
        }
        finally
        {
            try
            {
                if (var2 != null)
                {
                    var2.close();
                }
            }
            catch (IOException var25)
            {
                ;
            }

            try
            {
                if (var3 != null)
                {
                    var3.close();
                }
            }
            catch (IOException var24)
            {
                ;
            }
        }

    }
}

