package userformapp.best;

public class BestForm {

    private String firstName;

    private String lastName;

    private String userName;

    private String password;

    private String email;

    private String city;

    private String country;

    private String language;

    private BestForm(FormBuilder formBuilder) {
        this.firstName = formBuilder.firstName;

        this.lastName = formBuilder.lastName;

        this.userName = formBuilder.userName;

        this.password = formBuilder.password;

        this.email = formBuilder.email;

        this.city = formBuilder.city;

        this.country = formBuilder.country;

        this.language = formBuilder.language;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getLanguage() {
        return language;
    }

    public static class FormBuilder {

        private String firstName;

        private String lastName;

        private String userName;

        private String password;

        private String email;

        private String city;

        private String country;

        private String language;

        public FormBuilder(String firstName, String lastName, String userName, String password) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.userName = userName;
            this.password = password;
        }

        public FormBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public FormBuilder setCity(String city) {
            this.city = city;
            return this;
        }

        public FormBuilder setCountry(String country) {
            this.country = country;
            return this;
        }

        public FormBuilder setLanguage(String language) {
            this.language = language;
            return this;
        }

        public BestForm build() {
            return new BestForm(this);
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" First Name: ").append(firstName);
        stringBuilder.append("\n Last Name: ").append(lastName);
        stringBuilder.append("\n User Name: ").append(userName);
        stringBuilder.append("\n Password: ").append(password);

        if (this.email != null) {
            stringBuilder.append("\n Email: ").append(email);
        }

        if (this.city != null) {
            stringBuilder.append("\n City: ").append(city);
        }

        if (this.country != null) {
            stringBuilder.append("\n Country: ").append(country);
        }

        if (this.language != null) {
            stringBuilder.append("\n Language: ").append(language);
        }

        return stringBuilder.toString();
    }
}
