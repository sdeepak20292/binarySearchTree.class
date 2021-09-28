public class Person {
    private String FullName;
    private String LastName;
    private int Age;

    public void setFullName (String Fname) {
        if (Fname.isEmpty()){
            this.FullName = "";
        }
        else {
            this.FullName = Fname.toUpperCase();

        }

    }

    public void setLastName(String Lname) {
        if (Lname.isEmpty()){
            this.LastName = "";
        }
        else {
            this.LastName = Lname.toUpperCase();

        }

    }

    public void setAge(int age) {
        if ((age > 0) && (age < 100)) {
            this.Age = age;

        }
    }

    public boolean IsTeen() {
        return ((this.Age > 12) && (this.Age < 20));

    }

    public String giveName() {
        return (this.FullName +" "+ this.LastName);
    }
}
