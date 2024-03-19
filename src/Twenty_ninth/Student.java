package Twenty_ninth;

public class Student {
    int id;
    String surname;
    String name;
    String patronymic;
    String date_of_birth;
    String address;
    String phone_number;
    String school;
    String grade;

    public Student(int id, String surname, String name, String patronymic, String date_of_birth, String address, String phone_number, String school, String grade) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.date_of_birth = date_of_birth;
        this.address = address;
        this.phone_number = phone_number;
        this.school = school;
        this.grade = grade;
    }
}
