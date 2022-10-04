package com.company;
import java.io.*;
import java.io.FileNotFoundException;
import java.util.Scanner; //to read the text in file
import java.util.*;
//import java.util.Arrays;

public class ReadFile {
    public void readText() throws FileNotFoundException {
            String element = " ";
            List <ArrayList<String>> listItem = new ArrayList<ArrayList<String>>();
            ArrayList<String> title = new ArrayList<String>();
            //var file = new File;
            Scanner read = new Scanner(new File("/Users/tiffanyngo/Desktop/java/Assignment2/src/inputT.txt"));
            while(read.hasNext()){

                String data = read.nextLine();
                listItem.add(new ArrayList<String>(Arrays.asList(data)));
                //print the element
                }
            for(int i = 1; i < listItem.size();i++ ){
                    //for(String innerItem : item){
                    ArrayList Infor = new ArrayList( listItem.get(i) ); //list array course name inside the big list

                    System.out.println("Course " + i + ":" + Infor );
                for(int j = 0; j< Infor.size() ; j++ ) {
                    if(j==0){
                    System.out.println("CourseNumber " + Infor.get(j));}


//                    System.out.println("CourseName " + Infor.get(2));
//                    System.out.println("CourseName " + Infor.get(4));}

                }
                //System.out.println("CourseNumber");
                }
        }
                //System.out.println(list);
            }
            //read.close();





