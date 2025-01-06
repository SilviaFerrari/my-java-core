package com.SilviaFerrari.main.nio;

public class PortableDesktopPath {
    public static String portableDesktopPath(){
        return String.format("%s%s%s", System.getProperty("user.home"), System.getProperty("file.separator"), "Desktop");
    }
}
