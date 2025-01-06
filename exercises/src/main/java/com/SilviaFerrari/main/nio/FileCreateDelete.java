package com.SilviaFerrari.main.nio;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileCreateDelete {
    public static void createFile(String src) throws IOException {
        try {
            Path newFile = Files.createFile(Paths.get(src));
        }
        catch (FileAlreadyExistsException e){
            throw new FileAlreadyExistsException("File already exists");
        }
    }

    public static void deleteFile(String src) throws IOException{
        Files.deleteIfExists(Paths.get(src));
    }
}
