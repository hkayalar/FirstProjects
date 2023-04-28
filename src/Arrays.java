public class Arrays {
    public static void main(String[] args){
        String[] students = {"Harry", "Neville", "Ron" , "Seamus"};
        System.out.println("It's time to take your fifth year exams. Please, take your seats.");
        for (int i=0; i< students.length; i++)
        System.out.println(students[i]+" you will take seat " + i + ".");

    }
}

