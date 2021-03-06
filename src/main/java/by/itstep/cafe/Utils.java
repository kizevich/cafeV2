package by.itstep.cafe;

public class Utils {

    public static final String TEXT_PATTERN = "[A-Za-z]+";
    public static final String PHONE_PATTERN =
            "\\+[0-9]{2,3}-[0-9]{2}-[0-9]{7}";
    private static final String EMAIL_PATTERN = "[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}";

    public static boolean isText(String text) {
        if (text == null) return false;
        return text.matches(TEXT_PATTERN);
    }

    public static boolean isPhone(String phone){
        return phone.matches(PHONE_PATTERN);
    }

    public static boolean isEmail(String email){
        return email!= null && email.matches(EMAIL_PATTERN);
    }
}
