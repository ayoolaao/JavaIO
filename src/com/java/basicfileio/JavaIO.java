package com.java.basicfileio;

import java.io.IOException;
import java.nio.file.*;

public class JavaIO {

    public static boolean searchText(String text, String path){
        try {
            return readFile(path).toString().toLowerCase().contains(text.toLowerCase());
        } catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    public static boolean searchText(String text, StringBuffer content){
        try {
            return content.toString().toLowerCase().contains(text.toLowerCase());
        } catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    public static void deleteFile(String path) throws IOException{
        Files.delete(Paths.get(path));
    }

    static StringBuffer readFile(String path) throws IOException{
        StringBuffer content = new StringBuffer();
//        Files.lines(Paths.get(path)).forEach(l -> System.out.println(l));
//        Files.lines(Paths.get(path)).forEach(System.out::println);
        Files.lines(Paths.get(path)).forEach(l -> content.append(l).append("\n"));
//        Files.lines(Paths.get(path)).forEach(l -> content.append(l));
//        Files.lines(Paths.get(path)).forEach(content::append);
        return content;
    }
}