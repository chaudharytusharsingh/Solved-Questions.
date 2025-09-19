//parameterized   and NON PARAMETERIZED CONSTRUCTOR
public class OOPS_3_constructor {

    public static void main(String[] args) {
    //  PARAMETERIZED CONSTRUCTOR
        student stu = new student(100000000);
         student stu2 = new student("tushar");
            //  NON  PARAMETERIZED CONSTRUCTOR
          student stu3=new  student();
    }
}

class student{
    int rollno;
    String name;
//  NON  PARAMETERIZED CONSTRUCTOR
    student(){
        System.out.println("NON PARAMETERIZED CONSTRUCTOR ");
    }
   //  PARAMETERIZED CONSTRUCTOR
    student( String name) {
     this.name =name;
     System.out.println(name);
    }
    student(int rollno){
       this.rollno = rollno;
       System.out.println(rollno);
    }
    

}


//NON PARAMETERIZED CONSTRUCTOR
