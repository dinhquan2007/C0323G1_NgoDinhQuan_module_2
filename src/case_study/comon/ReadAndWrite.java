package case_study.comon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public List<String> readFile(String path){
        List<String> strings=new ArrayList<>();
       try {
           FileReader fileReader=new FileReader(path);
           BufferedReader bufferedReader=new BufferedReader(fileReader);
           String line="";
           while ((line=bufferedReader.readLine())!=null){
               strings.add(line);
           }
       } catch (FileNotFoundException e) {
           System.out.println("find not file");
       } catch (IOException e) {
           System.out.println("error read file");
       }
       return strings;
    }
    public void writeToFile(String path,List<String> strings,boolean append){
       try {
           FileWriter fileWriter=new FileWriter(path,append);
           BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
           for (String str:strings) {
               bufferedWriter.write(str);
               bufferedWriter.newLine();
           }
           bufferedWriter.close();
       } catch (IOException e) {
           System.out.println("error file");
       }
    }

}
