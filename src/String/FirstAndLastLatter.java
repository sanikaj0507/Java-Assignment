package String;

public class FirstAndLastLatter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "on one two thRee four five six seven eight";
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            int len = word.length();
            if (len == 1) {
                result.append(Character.toUpperCase(word.charAt(0)));
            } else {
                result.append(Character.toUpperCase(word.charAt(0)))
                      .append(word.substring(1, len - 1))
                      .append(Character.toUpperCase(word.charAt(len - 1)));
            }
            result.append(" ");
        }
        System.out.println(result.toString());
	}

}
