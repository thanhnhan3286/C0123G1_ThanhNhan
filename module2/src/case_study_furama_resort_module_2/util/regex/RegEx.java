package case_study_furama_resort_module_2.util.regex;

public class RegEx {
    private static final String REGEX_SERVICE_ID ="^(SV)(VL|HO|RO)\\-\\d{4}$";
    private static final String REGEX_SERVICE_NAME = "^[A-Z][a-z]*$";
    private static final String REGEX_USE_AREA = "^(([3-9]\\d+)|([1-9]\\d+\\d+))$";
    private static final String REGEX_POSITIVE_INTEGER = "^([1-9]\\d*)$";
    private static final String REGEX_MAX_PEOPLE = "^(1\\d|20)$";
    private static final String REGEX_BIRTHDAY = "^(([0-2][0-9])|3[0-1])\\/(([0][0-9])|1[0-2])\\/((19((2[4-9])|([3-9][0-9])))|200[0-5])$";
    private static final String REGEX_PHONE_NUMBER = "^0\\d{9}$";
    private static final String REGEX_ID_CARD = "^\\d{6,12}$";

    public static  boolean checkIdCard(String str){
        return str.matches(REGEX_ID_CARD);
    }
    public static boolean checkServiceId(String str){
        return str.matches(REGEX_SERVICE_ID);
    }
    public static boolean checkServiceName(String str){
        return str.matches(REGEX_SERVICE_NAME);
    }
    public static boolean checkUseArea(String str){
        return str.matches(REGEX_USE_AREA);
    }
    public static boolean checkPositiveInteger(String str){
        return str.matches(REGEX_POSITIVE_INTEGER);
    }
    public static boolean checkMaxPeople(String str){
        return str.matches(REGEX_MAX_PEOPLE);
    }
    public static boolean checkBirthday(String str){
        return str.matches(REGEX_BIRTHDAY);
    }
    public static boolean checkPhoneNumber(String str){
        return str.matches(REGEX_PHONE_NUMBER);
    }
}
