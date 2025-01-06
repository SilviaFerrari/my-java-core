package com.SilviaFerrari.main.nio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class CopyBinaryLong {
    public static void copyBinaryLong(String src, String dst){
        try(FileChannel srcChannel = FileChannel.open(Paths.get(src), StandardOpenOption.READ);
            FileChannel dstChannel = FileChannel.open(Paths.get(dst), StandardOpenOption.WRITE)){
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            while(srcChannel.read(buffer) != -1){
                buffer.flip();
                dstChannel.write(buffer);
                buffer.clear();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
