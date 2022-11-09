package package2019e054;

public class Student implements Comparable<Student> {
    private String name;
    private String regNo;

    public String getName(){
        return name;
    }
    public String getRegNo(){
        return regNo;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setRegNo(String regNo){
        this.regNo = regNo;
    }

    public String toString(){//overriding the toString() method
        return "Name :" + name + " , Reg.No. :" + regNo;
    }

    public int compareTo(Student o) {
        return this.getName().compareTo(o.getName());
    }

}
