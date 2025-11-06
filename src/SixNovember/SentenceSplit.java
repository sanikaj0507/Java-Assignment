package SixNovember;

import java.util.StringTokenizer;

	public class SentenceSplit {
	    public static void main(String[] args) {
	        String sentence = "Java,Python;C++ JavaScript";
	        StringTokenizer st = new StringTokenizer(sentence, ",; ");

	        while (st.hasMoreTokens()) {
	            System.out.println(st.nextToken());
	        }
	    }
	}


