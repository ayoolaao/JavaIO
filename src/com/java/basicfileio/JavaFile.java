package com.java.basicfileio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JavaFile {

    static void walkDirectory(String dirPath) throws IOException{
        Files.walk(Paths.get(dirPath)).forEach(f -> System.out.println(f.toString()));
    }

//    static boolean checkFiles (File file) throws IOException{
//        return Files.lines(file.toPath()).anyMatch(text -> );
//        return false;
//    }
}
