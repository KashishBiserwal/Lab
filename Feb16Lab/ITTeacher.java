package Feb16Lab;

class Teacher {
    String collegeName = "Gurugram University";
    String designation = "Teacher";
    void work(){
        System.out.println("Teaching");
    }
}

class ITTeacher extends Teacher{
    public static void main(String[] args) {
        ITTeacher t =  new ITTeacher();
        System.out.println(t.collegeName);
        System.out.println(t.designation);
        t.work();
    }
}


