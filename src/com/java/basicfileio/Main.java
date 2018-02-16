package com.java.basicfileio;

public class Main {

    public static void main(String[] args){
        String path = "./UX_resume_nlb.txt";
        String text = "Abimbola";

        try {
            boolean inFile = JavaIO.searchText(text, path);
//            String tt = JavaIO.readFile("./sample.txt").toString();

            System.out.println(inFile);
//            System.out.println(tt);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
