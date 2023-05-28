package ss16_IO.exercise.read_file_csv;

import ss11_stack_queue.exercise.mvc.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFileCSV {
    public static void main(String[] args) {
        List<Student> studentList=new ArrayList<>();
        Student student1=new Student("A11","Quan","1998",true,"C0323G1",9);
        Student student2=new Student("A12","Quang","1994",true,"C0323G1",4);
        Student student3=new Student("A13","Quanh","1996",true,"C0323G1",8);
        Student student4=new Student("A14","Quat","1996",true,"C0323G1",5);
        Student student5=new Student("A15","Quyt","1988",true,"C0323G1",6);
        Student student6=new Student("A16","Que","1999",true,"C0323G1",7);
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        studentList.add(student6);
        writeStudentListToFile(studentList,"ss16_IO/exercise/copy_file_text/text.text");
        List<Student> studentsListFromFile=readStudentListFromFile("ss16_IO/exercise/copy_file_text/text.text");
        for (Student s:studentList) {
            System.out.println(s);
        }
    }
    private static void writeStudentListToFile(List<Student> students,String path){

        try {
            File file=new File(path);
            FileWriter fileWriter=new FileWriter(file,false);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            for (int i = 0; i < students.size(); i++) {
                bufferedWriter.write(students.get(i).getInfoToCSV());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private static List<Student> readStudentListFromFile(String path){
        List<Student> studentList=new ArrayList<>();
        File file=new File(path);
        try {
            FileReader fileReader=new FileReader(file);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String line=null;
            while ((line=bufferedReader.readLine())!=null){
                String[] studentArray=line.split(",");
                Student student=new Student(studentArray[0],studentArray[1],studentArray[2],Boolean.parseBoolean(studentArray[3]),studentArray[4],Integer.parseInt(studentArray[5]));
                studentList.add(student);

            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return studentList;
    }
}
