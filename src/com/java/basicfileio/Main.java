package com.java.basicfileio;

public class Main {

    public static void main(String[] args){
        String dir = "./";
        String path = "./UX_resume_nlb.txt";
        String text = "Abimbola";

        try {



            StringBuffer tb = JavaIO.readFile(path);
            String tt = tb.toString();
//            boolean inFile = JavaIO.searchText(text, tb);
            boolean inFile = JavaIO.searchText(text, path);

            System.out.println(inFile);
//            System.out.println(tt);

//            JavaFile.walkDirectory(dir);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
