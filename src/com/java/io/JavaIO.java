package com.java.io;

import java.io.IOException;
import java.nio.file.*;

public class JavaIO {

    static String dir = "./sample.txt";

    public static void main(String[] args){
        //TODO

        try {
//            walkDirectory(dir);
//            deleteFile(dir);
            readFile(dir);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void walkDirectory(String path) throws IOException{
        Files.walk(Paths.get(path)).forEach(f -> System.out.println(f.toFile()));
    }

    public static void deleteFile(String path) throws IOException{
        Files.delete(Paths.get(path));
    }

    public static void readFile(String path) throws IOException{
        StringBuffer content = new StringBuffer();
//        Files.lines(Paths.get(path)).forEach(l -> System.out.println(l));
//        Files.lines(Paths.get(path)).forEach(System.out::println);
//        Files.lines(Paths.get(path)).forEach(l -> content.append(l));
        Files.lines(Paths.get(path)).forEach(content::append);
    }
}