package SevenKyu;

public class Regex_Validate_PIN_Code {
    public static boolean validatePin(String pin) {
        return (pin.length() == 4 || pin.length() == 6) && pin.matches("[0-9]+");
    }
}
