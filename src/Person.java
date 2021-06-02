

public class Person {

    public static void main(String[] args) {
        System.out.println("Hello!");

    }

        protected String firstName = "Hunter";
        protected String lastName = "Parks";


        public String getFirstName () {
            return firstName;
        }

        public void setFirstName (String firstName){
            this.firstName = firstName;
        }

        public String getLastName () {
            return lastName;
        }

        public void setLastName (String lastName){
            this.lastName = lastName;
        }

    public void sayHello() {
        System.out.println("Hello, " + firstName);
    }
}
