public class ValidateSaId {
    public static boolean isIdNumberValid(String id) {
        return id.matches("\\d{13}");
    }
}
