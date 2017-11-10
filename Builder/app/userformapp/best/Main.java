package userformapp.best;

public class Main {

    private static final String FIRST_NAME = "Andrei";

    private static final String LAST_NAME = "Varzari";

    private static final String USERNAME = "avarzari";

    private static final String PASS = "1235";

    private static final String EMAIL = "avarzari@abc.com";

    private static final String CITY = "Balti";

    private static final String COUNTRY = "Moldova";

    private static final String LANGUAGE = "RO";

    public static void main(String[] args) {
        BestForm form = new BestForm.FormBuilder(FIRST_NAME, LAST_NAME, USERNAME, PASS)
                .setCountry(COUNTRY)
                .setCity(CITY)
                .setEmail(EMAIL)
                .setLanguage(LANGUAGE)
                .build();

        System.out.println(form);
    }
}
