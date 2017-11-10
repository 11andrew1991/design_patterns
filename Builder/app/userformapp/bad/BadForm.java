package userformapp.bad;

public class BadForm {

    private String firstName;

    private String lastName;

    private String userName;

    private String password;

    private String email;

    private String city;

    private String country;

    private String language;

    public BadForm(
            String firstName,
            String lastName,
            String userName,
            String password,
            String email,
            String city,
            String country,
            String language)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.city = city;
        this.country = country;
        this.language = language;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
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
