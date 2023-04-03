package case_study_furama_resort_module_2.util.regex;

public class RegEx {
    private static final String REGEX_SERVICE_ID_VILLA = "^(SVVL)\\-\\d{4}$";
    private static final String REGEX_SERVICE_ID_HOUSE = "^(SVHO)\\-\\d{4}$";
    private static final String REGEX_SERVICE_ID_ROOM = "^(SVRO)\\-\\d{4}$";
    private static final String REGEX_SERVICE_NAME_VILLA = "^V[a-z]*$";
    private static final String REGEX_SERVICE_NAME_HOUSE = "^H[a-z]*$";
    private static final String REGEX_SERVICE_NAME_ROME = "^R[a-z]*$";
    private static final String REGEX_USE_AREA = "^(([3-9]\\d+)|([1-9]\\d+\\d+))$";
    private static final String REGEX_POSITIVE_INTEGER = "^([1-9]\\d*)$";
    private static final String REGEX_MAX_PEOPLE = "^((0[1-9])|(1[0-9])|20)$";
    private static final String REGEX_BIRTHDAY = "^((0[1-9])|((1|2)[0-9])|3[0-1])\\/((0[1-9])|1[0-2])\\/((19((2[4-9])|([3-9][0-9])))|200[0-5])$";
    private static final String REGEX_PHONE_NUMBER = "^0\\d{9}$";
    private static final String REGEX_ID_CARD = "^\\d{6,12}$";
    private static final String REGEX_ID_PERSON = "^\\d+$";
    private static final String REGEX_NAME_PERSON = "^[A-Z][a-z]*(\\s[A-Z][a-z]*)+$";



    public static boolean checkIdCard(String str) {
        return str.matches(REGEX_ID_CARD);
    }
    public static boolean checkIdPerson(String str) {
        return str.matches(REGEX_ID_PERSON);
    }
    public static boolean checkNamePerson(String str) {
        return str.matches(REGEX_NAME_PERSON);
    }

    public static boolean checkServiceIdVilla(String str) {
        return str.matches(REGEX_SERVICE_ID_VILLA);
    }

    public static boolean checkServiceIdHouse(String str) {
        return str.matches(REGEX_SERVICE_ID_HOUSE);
    }

    public static boolean checkServiceIdRoom(String str) {
        return str.matches(REGEX_SERVICE_ID_ROOM);
    }

    public static boolean checkServiceNameVilla(String str) {
        return str.matches(REGEX_SERVICE_NAME_VILLA);
    }

    public static boolean checkServiceNameHouse(String str) {
        return str.matches(REGEX_SERVICE_NAME_HOUSE);
    }

    public static boolean checkServiceNameRoom(String str) {
        return str.matches(REGEX_SERVICE_NAME_ROME);
    }

    public static boolean checkUseArea(String str) {
        return str.matches(REGEX_USE_AREA);
    }

    public static boolean checkPositiveInteger(String str) {
        return str.matches(REGEX_POSITIVE_INTEGER);
    }

    public static boolean checkMaxPeople(String str) {
        return str.matches(REGEX_MAX_PEOPLE);
    }

    public static boolean checkBirthday(String str) {
        return str.matches(REGEX_BIRTHDAY);
    }

    public static boolean checkPhoneNumber(String str) {
        return str.matches(REGEX_PHONE_NUMBER);
    }

}