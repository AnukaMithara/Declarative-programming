package package2019e054;

import java.util.ArrayList;
import java.util.stream.Collectors;

import static java.util.Collections.swap;

public class Task3 {
    public static void sortNames(ArrayList<Student> data){

        for(int i =0; i< data.size(); i++){
            data.get(i).setName(data.get(i).getName().toUpperCase());
        }

        for(int j = 0;j<data.size(); j++){
            for(int k = 0;k<data.size()-1; k++){

                if((data.get(k).getName()).compareTo(data.get(j).getName())>0)
                {
                    swap(data,j,k);
                }
            }
        }
        for(int n =0; n< data.size(); n++){
            System.out.println(data.get(n));
        }
    }

    public static void printRegNo(ArrayList<Student> data){
        for(int i =0; i< data.size(); i++){
            String temp =(String)data.get(i).getRegNo();

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
        ArrayList<Student> students = getStudents();

        //b.Print all uppercase names in a sorted order.
        ArrayList<String> studentNames = students.stream().map(e -> e.getName()).map(e -> e.toUpperCase()).sorted().collect(Collectors.toCollection(ArrayList::new));
        for(String i: studentNames){
            System.out.println(i);
        }

        System.out.println();

        //c.Print the registration number of students which starts with 2019.
        ArrayList<String> studentRegNos = students.stream().map(e -> e.getRegNo()).filter(e -> e.substring(0,4).equals("2019")).collect(Collectors.toCollection(ArrayList::new));
        for(String i: studentRegNos){
            System.out.println(i);
        }







    }
}


