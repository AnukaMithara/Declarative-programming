package package2019e054;

import java.util.ArrayList;
import static java.util.Collections.swap;

public class Task2 {
    public static void sortNames(ArrayList<Student> data){

        for(Student i:data){
            i.setName(i.getName().toUpperCase());
        }

        for(int j = 0;j<data.size(); j++){
            for(int k = 0;k<data.size()-1; k++){

                if((data.get(k).getName()).compareTo(data.get(j).getName())>0)
                {
                    swap(data,j,k);
                }
            }
        }
        for(Student i:data){
            System.out.println(i.getName());
        }
    }

    public static void printRegNo(ArrayList<Student> data){
        for(Student i:data){
            String temp =(String)i.getRegNo();

            if(temp.substring(0,4).equals("2019")){
                System.out.println(temp);
            }
        }
    }

    public static ArrayList<Student> getStudents(){
        ArrayList<Student> students = new ArrayList<Student>();

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        Student s5 = new Student();
        Student s6 = new Student();

        s1.setName("Anuka Mithara");
        s1.setRegNo("2019/E/054");
        students.add(s1);

        s2.setName("Sachira Heshan");
        s2.setRegNo("2019/E/055");
        students.add(s2);

        s3.setName("Nadun Channa");
        s3.setRegNo("2019/E/094");
        students.add(s3);

        s4.setName("Dilinuwan Induwara");
        s4.setRegNo("2018/E/047");
        students.add(s4);

        s5.setName("Banula Lakwindu");
        s5.setRegNo("2019/E/023");
        students.add(s5);

        s6.setName("Lahiru Dilshan");
        s6.setRegNo("2017/E/023");
        students.add(s6);

        return students;
    }

    public static void main(String[] args){

        //a. Add sample data to the ArrayList.
        ArrayList<Student> students =  getStudents();

        //b.Print all uppercase names in a sorted order.
        sortNames(students);

        System.out.println();

        //c.Print the registration number of students which starts with 2019.
        printRegNo(students);


    }
}


