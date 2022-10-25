package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javazoom.jl.decoder.Decoder
 *  javazoom.jl.decoder.JavaLayerException
 *  javazoom.jl.player.AudioDeviceBase
 */
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.Line;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

import com.moonsworth.lunar.client.LunarClient;
import javazoom.jl.decoder.Decoder;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.AudioDeviceBase;

public class class_0445
extends AudioDeviceBase {
    private SourceDataLine lllIIIllIIIIlllIlIIllIIll = null;
    private AudioFormat lllIlIIlIIIlIlIIIllIlllIl = null;
    private byte[] IlIllllllIIlIIllllIIlIIIl = new byte[4096];

    protected void lllIIIllIIIIlllIlIIllIIll(AudioFormat audioFormat) {
        this.lllIlIIlIIIlIlIIIllIlllIl = audioFormat;
    }

    protected AudioFormat lllIIIllIIIIlllIlIIllIIll() {
        if (this.lllIlIIlIIIlIlIIIllIlllIl == null) {
            Decoder decoder = this.getDecoder();
            this.lllIlIIlIIIlIlIIIllIlllIl = new AudioFormat(decoder.getOutputFrequency(), 16, decoder.getOutputChannels(), true, false);
        }
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    protected DataLine.Info lllIlIIlIIIlIlIIIllIlllIl() {
        AudioFormat audioFormat = this.lllIIIllIIIIlllIlIIllIIll();
        DataLine.Info info = new DataLine.Info(SourceDataLine.class, audioFormat);
        return info;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(AudioFormat audioFormat) {
        if (!this.isOpen()) {
            this.lllIIIllIIIIlllIlIIllIIll(audioFormat);
            this.openImpl();
            this.setOpen(true);
        }
    }

    protected void openImpl() {
    }

    protected void IlIllllllIIlIIllllIIlIIIl() {
        Throwable throwable = null;
        try {
            Line line = AudioSystem.getLine(this.lllIlIIlIIIlIlIIIllIlllIl());
            if (line instanceof SourceDataLine) {
                this.lllIIIllIIIIlllIlIIllIIll = (SourceDataLine)line;
                this.lllIIIllIIIIlllIlIIllIIll.open(this.lllIlIIlIIIlIlIIIllIlllIl);
                this.lllIIIllIIIIlllIlIIllIIll.start();
                this.lllIIIllIIIIlllIlIIllIIll((float)((Integer) LunarClient.getInstance().getSettingsManager().llIIllIllIlIIlIIllIllllll.lIlllIlllIIIIlIIlllIllIII()).intValue());
            }
        }
        catch (RuntimeException runtimeException) {
            throwable = runtimeException;
        }
        catch (LinkageError linkageError) {
            throwable = linkageError;
        }
        catch (LineUnavailableException lineUnavailableException) {
            throwable = lineUnavailableException;
        }
        if (this.lllIIIllIIIIlllIlIIllIIll == null) {
            throw new JavaLayerException("cannot obtain source audio line", throwable);
        }
    }

    public int lllIIIllIIIIlllIlIIllIIll(AudioFormat audioFormat, int n) {
        return (int)((double)((float)n * audioFormat.getSampleRate() * (float)audioFormat.getChannels() * (float)audioFormat.getSampleSizeInBits()) / 8000.0);
    }

    protected void closeImpl() {
        if (this.lllIIIllIIIIlllIlIIllIIll != null) {
            this.lllIIIllIIIIlllIlIIllIIll.close();
        }
    }

    protected void writeImpl(short[] arrs, int n, int n2) {
        if (this.lllIIIllIIIIlllIlIIllIIll == null) {
            this.IlIllllllIIlIIllllIIlIIIl();
        }
        byte[] arrby = this.lllIIIllIIIIlllIlIIllIIll(arrs, n, n2);
        this.lllIIIllIIIIlllIlIIllIIll.write(arrby, 0, n2 * 2);
    }

    protected byte[] lllIIIllIIIIlllIlIIllIIll(int n) {
        if (this.IlIllllllIIlIIllllIIlIIIl.length < n) {
            this.IlIllllllIIlIIllllIIlIIIl = new byte[n + 1024];
        }
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    protected byte[] lllIIIllIIIIlllIlIIllIIll(short[] arrs, int n, int n2) {
        byte[] arrby = this.lllIIIllIIIIlllIlIIllIIll(n2 * 2);
        int n3 = 0;
        while (n2-- > 0) {
            short s = arrs[n++];
            arrby[n3++] = (byte)s;
            arrby[n3++] = (byte)(s >>> 8);
        }
        return arrby;
    }

    protected void flushImpl() {
        if (this.lllIIIllIIIIlllIlIIllIIll != null) {
            this.lllIIIllIIIIlllIlIIllIIll.drain();
        }
    }

    public int getPosition() {
        int n = 0;
        if (this.lllIIIllIIIIlllIlIIllIIll != null) {
            n = (int)(this.lllIIIllIIIIlllIlIIllIIll.getMicrosecondPosition() / 1000L);
        }
        return n;
    }

    public void lIlllIlllIIIIlIIlllIllIII() {
        try {
            this.lllIlIIlIIIlIlIIIllIlllIl(new AudioFormat(22050.0f, 16, 1, true, false));
            short[] arrs = new short[2205];
            this.write(arrs, 0, arrs.length);
            this.flush();
            this.close();
        }
        catch (RuntimeException runtimeException) {
            throw new JavaLayerException("Device test failed: " + runtimeException);
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(float f) {
        if (this.lllIIIllIIIIlllIlIIllIIll != null) {
            FloatControl floatControl = (FloatControl)this.lllIIIllIIIIlllIlIIllIIll.getControl(FloatControl.Type.MASTER_GAIN);
            float f2 = floatControl.getMaximum() - floatControl.getMinimum();
            float f3 = f2 * (f / 100.0f) + floatControl.getMinimum();
            if (f <= 58.0f) {
                f3 = -80.0f;
            }
            floatControl.setValue(f3);
        }
    }
}

