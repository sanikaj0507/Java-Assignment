package String;

public class ToggleCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Sanika Jadhav";
        StringBuilder toggled = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                toggled.append(Character.toLowerCase(ch));
            } else {
                toggled.append(Character.toUpperCase(ch));
            }
        }
        System.out.println(toggled.toString());
	}

}
