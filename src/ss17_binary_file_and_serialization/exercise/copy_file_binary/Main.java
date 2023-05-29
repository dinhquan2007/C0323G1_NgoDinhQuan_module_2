package ss17_binary_file_and_serialization.exercise.copy_file_binary;

import java.io.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("input path file src");
        String sourcePath=input.nextLine();
        System.out.println("input path destination file");
        String destPath=input.nextLine();
        File sourceFile=new File(sourcePath);
        File destFile= new File(destPath);
        try{
            copyFileUsingStream(sourceFile,destFile);
            System.out.println("copy file completed");
        }catch (IOException ioException){
            System.out.println("can't copy that file");
            System.out.println(ioException.getMessage());
        }


    }
    public static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream inputStream=null;
        OutputStream outputStream=null;
        try{
            inputStream=new FileInputStream(source);
            outputStream=new FileOutputStream(dest);
            byte[] buffer=new byte[1024];
            int length;
            while((length=inputStream.read(buffer))>0){
                outputStream.write(buffer,0,length);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            inputStream.close();
            outputStream.close();
        }
    }
}
