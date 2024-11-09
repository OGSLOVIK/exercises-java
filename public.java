public class test {
    public static void main(String[] args) {
//        int firstNumber = Utils.input("Podaj liczbę");
//
//        Utils utils = new Utils();
//        int secondNumber = utils.input("Podaj drugą liczbę");
//
//
//        System.out.println(firstNumber);
//        System.out.println(secondNumber);
        Student firstStudent = new Student(  "Jan", "Kowalski");
        System.out.println(firstStudent.getName());
        System.out.println(firstStudent.getSurname());
        System.out.println(firstStudent.getFullName());
    }
}


class Student{
    private String name;
    private String surname;

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;

    }


    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public String getFullName(){
        return name +" " + surname;
    }
    public void setName(String name){
        this.name = name;
    }
}
