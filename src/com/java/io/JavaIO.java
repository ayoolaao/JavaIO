package com.java.io;

import java.io.File;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.*;

public class JavaIO {

    static String path = "./UX_resume_nlb.txt";
    static String text = "fist";

    public static void main(String[] args){
        try {
            deleteFile(path);
            readFile(path);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static boolean searchText(String text, String path){
        try {
            return readFile(path).toString().contains(text);
        } catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    public static void deleteFile(String path) throws IOException{
        Files.delete(Paths.get(path));
    }

    public static StringBuffer readFile(String path) throws IOException{
        StringBuffer content = new StringBuffer();
//        Files.lines(Paths.get(path)).forEach(l -> System.out.println(l));
//        Files.lines(Paths.get(path)).forEach(System.out::println);
        Files.lines(Paths.get(path)).forEach(l -> content.append(l).append("\n"));
//        Files.lines(Paths.get(path)).forEach(l -> content.append(l));
//        Files.lines(Paths.get(path)).forEach(content::append);
        return content;
    }
}