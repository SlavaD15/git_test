
public class Person {
    private String name;
    private String surname;
    private boolean isEmployed;
    private String workName;

    private Person(PersonBuilder personBuilder) {
        name = personBuilder.name;
        surname = personBuilder.surname;
        isEmployed = personBuilder.isEmployed;
        workName = personBuilder.workName;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public boolean isEmployed() {
        return isEmployed;
    }

    public String getWorkName() {
        return workName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", isEmployed=" + isEmployed +
                ", workName='" + workName + '\'' +
                '}';
    }

    public static class PersonBuilder{
        private String name;
        private String surname;
        private boolean isEmployed;
        private String workName;

        public PersonBuilder(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }

        public PersonBuilder setIsEmployed(boolean isEmployed) {
            this.isEmployed = isEmployed;
            return this;
        }

        public PersonBuilder setWorkName(String workName) {
            this.workName = workName;
            return this;
        }

        public Person build(){
            return new Person(this);
        }
    }

    static class TestPerson{
        public static void main(String[] args) {
            Person person = new Person.PersonBuilder("name1", "surname1").setIsEmployed(true).setWorkName("28stone").build();
            System.out.println(person.toString());
        }
    }
}
