package ss16_IO.practice;

import com.sun.javafx.iio.gif.GIFImageLoaderFactory;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriterFile {
    public List<Integer> readFile(String filePath){
        List<Integer> numbers=new ArrayList<>();
        try{
            File file = new File(filePath);
            if (!file.exists()){
                throw new FileNotFoundException();

            }

            BufferedReader bufferedReader= new BufferedReader(new FileReader(file));
            String line="";
            while ((line= bufferedReader.readLine())!=null){
                numbers.add(Integer.parseInt(line));
            }
            bufferedReader.close();
        }catch (Exception e){
            System.err.println("File không tồn tại hoặc nội dung có lỗi");
        }
        return numbers;
    }
    public void  writeFile(String filePath,int max){
        try{
            FileWriter fileWriter=new FileWriter(filePath,true);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            bufferedWriter.write("Giá trị lớn nhất là "+ max);
            bufferedWriter.close();
        } catch (IOException e) {
           e.printStackTrace();
        }
    }
    public static  int findMax(List<Integer> numbers){
        int max= numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max< numbers.get(i)){
             max= numbers.get(i);
            }
        }
        return  max;
    }

}
