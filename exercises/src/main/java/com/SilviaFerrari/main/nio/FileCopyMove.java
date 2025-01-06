package com.SilviaFerrari.main.nio;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileCopyMove {
    public static void fileCopy(String src, String dst) throws IOException{
        try{
            Files.copy(Paths.get(src), Paths.get(dst), StandardCopyOption.REPLACE_EXISTING);
        }
        /*
        catch(FileAlreadyExistsException e){
            throw new FileAlreadyExistsException("File already exists");
        }
        */
        catch(IOException e){
            throw new IOException(e.getMessage());
        }
    }
    public static void fileMove(String src, String dst) throws IOException {
        try{
            Files.move(Paths.get(src), Paths.get(dst), StandardCopyOption.REPLACE_EXISTING);
        }
        /*
        catch(FileAlreadyExistsException e){
            throw new FileAlreadyExistsException("File already exists");
        }
        */
        catch(IOException e){
            throw new IOException(e.getMessage());
        }
    }
}
