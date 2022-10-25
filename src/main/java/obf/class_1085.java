package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.ThreadFactoryBuilder
 *  org.apache.commons.io.FileUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import javax.imageio.ImageIO;

import net.minecraft.client.Minecraft;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_1085
extends class_0995 {
    private static final Logger lIllllIIlIIIlIllllllIIIll = LogManager.getLogger();
    private static final AtomicInteger IIIllIIlIIIIIIlIlIIllIIlI = new AtomicInteger(0);
    private final File IllIIlllllllIIlIIlIIIIlIl;
    private final String IIIllIllIIlIlIlIlIllllIIl;
    private final class_0702 IllIIIllIIIIlIlIlIllIIlll;
    private BufferedImage lIIIIlIlIIlllllIIllIIlIII;
    private Thread llIIlllIllIllllIIIlIIIIII;
    private boolean llIIllIllIlIIlIIllIllllll;
    public Boolean lllIIIllIIIIlllIlIIllIIll = null;
    public boolean lllIlIIlIIIlIlIIIllIlllIl = false;
    private static ThreadFactory lllIIlIIIllllllIIIIlIlIlI = new ThreadFactoryBuilder().setNameFormat("Texture Downloader #%d").setDaemon(true).build();
    public static Runtime IlIllllllIIlIIllllIIlIIIl = Runtime.getRuntime();
    private static ExecutorService IlIlllIIIIIIlIIllIIllIlll = Executors.newFixedThreadPool(IlIllllllIIlIIllllIIlIIIl.availableProcessors(), lllIIlIIIllllllIIIIlIlIlI);

    public class_1085(File file, String string, ResourceLocation class_17732, class_0702 class_07022) {
        super(class_17732);
        this.IllIIlllllllIIlIIlIIIIlIl = file;
        this.IIIllIllIIlIlIlIlIllllIIl = string;
        this.IllIIIllIIIIlIlIlIllIIlll = class_07022;
    }

    private void lIlllIlllIIIIlIIlllIllIII() {
        if (!this.llIIllIllIlIIlIIllIllllll && this.lIIIIlIlIIlllllIIllIIlIII != null) {
            if (this.IlIIIIIllllllIIlllIllllll != null) {
                this.IlIllllllIIlIIllllIIlIIIl();
            }
            class_0231.lllIIIllIIIIlllIlIIllIIll(super.lllIIIllIIIIlllIlIIllIIll(), this.lIIIIlIlIIlllllIIllIIlIII);
            this.llIIllIllIlIIlIIllIllllll = true;
        }
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll() {
        this.lIlllIlllIIIIlIIlllIllIII();
        return super.lllIIIllIIIIlllIlIIllIIll();
    }

    public void lllIIIllIIIIlllIlIIllIIll(BufferedImage bufferedImage) {
        this.lIIIIlIlIIlllllIIllIIlIII = bufferedImage;
        if (this.IllIIIllIIIIlIlIlIllIIlll != null) {
            this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll();
        }
        this.lllIIIllIIIIlllIlIIllIIll = this.lIIIIlIlIIlllllIIllIIlIII != null;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0947 class_09472) {
        if (this.lIIIIlIlIIlllllIIllIIlIII == null && this.IlIIIIIllllllIIlllIllllll != null) {
            super.lllIIIllIIIIlllIlIIllIIll(class_09472);
        }
        if (this.llIIlllIllIllllIIIlIIIIII == null) {
            if (this.IllIIlllllllIIlIIlIIIIlIl != null && this.IllIIlllllllIIlIIlIIIIlIl.isFile()) {
                lIllllIIlIIIlIllllllIIIll.debug("Loading http texture from local cache ({})", new Object[]{this.IllIIlllllllIIlIIlIIIIlIl});
                try {
                    this.lIIIIlIlIIlllllIIllIIlIII = ImageIO.read(this.IllIIlllllllIIlIIlIIIIlIl);
                    if (this.IllIIIllIIIIlIlIlIllIIlll != null) {
                        this.lllIIIllIIIIlllIlIIllIIll(this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(this.lIIIIlIlIIlllllIIllIIlIII));
                    }
                    this.lllIIIllIIIIlllIlIIllIIll = this.lIIIIlIlIIlllllIIllIIlIII != null;
                }
                catch (IOException iOException) {
                    lIllllIIlIIIlIllllllIIIll.error("Couldn't load skin " + this.IllIIlllllllIIlIIlIIIIlIl, (Throwable)iOException);
                    this.lllIlIIlIIIlIlIIIllIlllIl();
                }
            } else {
                this.lllIlIIlIIIlIlIIIllIlllIl();
            }
        }
    }

    protected void lllIlIIlIIIlIlIIIllIlllIl() {
        IlIlllIIIIIIlIIllIIllIlll.submit(() -> {
            HttpURLConnection httpURLConnection = null;
            lIllllIIlIIIlIllllllIIIll.debug("Downloading http texture from {} to {}", new Object[]{this.IIIllIllIIlIlIlIlIllllIIl, this.IllIIlllllllIIlIIlIIIIlIl});
            httpURLConnection = (HttpURLConnection)new URL(this.IIIllIllIIlIlIlIlIllllIIl).openConnection(Minecraft.getMinecraft().lllIIIIIIlIlllIIlIlIIIllI());
            try (InputStream inputStream = httpURLConnection.getInputStream();){
                BufferedImage bufferedImage;
                if (this.IllIIlllllllIIlIIlIIIIlIl != null) {
                    FileUtils.copyInputStreamToFile((InputStream)inputStream, (File)this.IllIIlllllllIIlIIlIIIIlIl);
                    bufferedImage = ImageIO.read(this.IllIIlllllllIIlIIlIIIIlIl);
                } else {
                    bufferedImage = ImageIO.read(inputStream);
                }
                if (this.IllIIIllIIIIlIlIlIllIIlll != null) {
                    bufferedImage = this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(bufferedImage);
                }
                this.lllIIIllIIIIlllIlIIllIIll(bufferedImage);
            }
            this.lllIIIllIIIIlllIlIIllIIll = this.lIIIIlIlIIlllllIIllIIlIII != null;
            if (httpURLConnection == null) return;
            if (httpURLConnection.getErrorStream() == null) return;
            try {
                inputStream = httpURLConnection.getErrorStream();
                throwable = null;
                try {
                    while (inputStream.skip(2048L) > 0L) {
                    }
                    return;
                }
                catch (Throwable throwable5) {
                    throwable = throwable5;
                    throw throwable5;
                }
                finally {
                    if (inputStream != null) {
                        if (throwable != null) {
                            try {
                                inputStream.close();
                            }
                            catch (Throwable throwable6) {
                                throwable.addSuppressed(throwable6);
                            }
                        } else {
                            inputStream.close();
                        }
                    }
                }
            }
            catch (Exception exception) {
                return;
            }
            catch (Exception exception) {
                if (!(exception instanceof FileNotFoundException)) {
                    lIllllIIlIIIlIllllllIIIll.error("Couldn't download http texture: " + exception.getClass().getName() + ": " + exception.getMessage());
                }
                this.lllIIIllIIIIlllIlIIllIIll = this.lIIIIlIlIIlllllIIllIIlIII != null;
                if (httpURLConnection == null) return;
                if (httpURLConnection.getErrorStream() == null) return;
                try (InputStream inputStream2 = httpURLConnection.getErrorStream();){
                    while (inputStream2.skip(2048L) > 0L) {
                    }
                    return;
                }
                catch (Exception exception2) {
                    return;
                }
                catch (Throwable throwable4) {
                    this.lllIIIllIIIIlllIlIIllIIll = this.lIIIIlIlIIlllllIIllIIlIII != null;
                    if (httpURLConnection == null) throw throwable4;
                    if (httpURLConnection.getErrorStream() == null) throw throwable4;
                    try (InputStream inputStream3 = httpURLConnection.getErrorStream();){
                        while (inputStream3.skip(2048L) > 0L) {
                        }
                        throw throwable4;
                    }
                    catch (Exception exception3) {
                        // empty catch block
                    }
                    throw throwable4;
                }
            }
        });
    }

    private boolean IlIIIIIllllllIIlllIllllll() {
        if (!this.lllIlIIlIIIlIlIIIllIlllIl) {
            return false;
        }
        Proxy proxy = Minecraft.getMinecraft().lllIIIIIIlIlllIIlIlIIIllI();
        return proxy.type() != Proxy.Type.DIRECT && proxy.type() != Proxy.Type.SOCKS ? false : this.IIIllIllIIlIlIlIlIllllIIl.startsWith("http://");
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void lIllllIIlIIIlIllllllIIIll() {
        class_0962 class_09622;
        block8: {
            class_1416 class_14162 = class_1186.lllIIIllIIIIlllIlIIllIIll(this.IIIllIllIIlIlIlIlIllllIIl, Minecraft.getMinecraft().lllIIIIIIlIlllIIlIlIIIllI());
            class_09622 = class_1186.lllIIIllIIIIlllIlIIllIIll(class_14162);
            if (class_09622.lllIIIllIIIIlllIlIIllIIll() / 100 == 2) break block8;
            this.lllIIIllIIIIlllIlIIllIIll = this.lIIIIlIlIIlllllIIllIIlIII != null;
            return;
        }
        try {
            BufferedImage bufferedImage;
            byte[] arrby = class_09622.lIlllIlllIIIIlIIlllIllIII();
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arrby);
            if (this.IllIIlllllllIIlIIlIIIIlIl != null) {
                FileUtils.copyInputStreamToFile((InputStream)byteArrayInputStream, (File)this.IllIIlllllllIIlIIlIIIIlIl);
                bufferedImage = ImageIO.read(this.IllIIlllllllIIlIIlIIIIlIl);
            } else {
                bufferedImage = class_1384.lllIIIllIIIIlllIlIIllIIll(byteArrayInputStream);
            }
            if (this.IllIIIllIIIIlIlIlIllIIlll != null) {
                bufferedImage = this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(bufferedImage);
            }
            this.lllIIIllIIIIlllIlIIllIIll(bufferedImage);
            this.lllIIIllIIIIlllIlIIllIIll = this.lIIIIlIlIIlllllIIllIIlIII != null;
        }
        catch (Exception exception) {
            try {
                lIllllIIlIIIlIllllllIIIll.error("Couldn't download http texture: " + exception.getClass().getName() + ": " + exception.getMessage());
                this.lllIIIllIIIIlllIlIIllIIll = this.lIIIIlIlIIlllllIIllIIlIII != null;
            }
            catch (Throwable throwable) {
                this.lllIIIllIIIIlllIlIIllIIll = this.lIIIIlIlIIlllllIIllIIlIII != null;
                throw throwable;
            }
            return;
        }
    }
}

