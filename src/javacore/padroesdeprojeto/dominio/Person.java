package javacore.padroesdeprojeto.dominio;

public class Person {
    private String firstName;
    private String lastName;
    private String userName;
    private String email;


    public Person(String firstName, String lastName, String userName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public static final class PessoaBuilder {
        private String firstName;
        private String lastName;
        private String userName;
        private String email;

        public PessoaBuilder() {
        }

        public static PessoaBuilder builder() {
            return new PessoaBuilder();
        }

        public PessoaBuilder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public PessoaBuilder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public PessoaBuilder withUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public PessoaBuilder withEmail(String email) {
            this.email = email;
            return this;
        }

        public Person build() {
            return new Person(firstName, lastName, userName, email);
        }

    }
}
