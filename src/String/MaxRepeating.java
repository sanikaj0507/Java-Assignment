package String;

public class MaxRepeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String sentence = "hi hello hello bye bye Namasthe bye";
        String[] words = sentence.split(" ");
        int n = words.length;

        int[] count = new int[n];    
        boolean[] visited = new boolean[n]; 

        for (int i = 0; i < n; i++) {
            if (visited[i]) continue; 

            int freq = 1;
            for (int j = i + 1; j < n; j++) {
                if (words[i].equals(words[j])) {
                    freq++;
                    visited[j] = true;
                }
            }
            count[i] = freq;
        }

        int maxFreq = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i] && count[i] > maxFreq) {
                maxFreq = count[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (!visited[i] && count[i] == maxFreq) {
                System.out.println(words[i] + " " + count[i]);
            }
        }
	}

}
