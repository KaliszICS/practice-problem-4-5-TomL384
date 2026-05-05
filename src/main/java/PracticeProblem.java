/**
 * File Name: Nested for/while/if
 * Author: Tom Leung
 * Date Created: May 4, 2026
 * Date Last Edited: May 4, 2026
 */


public class PracticeProblem {

	public static void main(String args[]) {
		System.out.println(multiplicationTable(3));
	}

	public static String triangle(int i1){
		String base = "*";
		String r = "";
		for (int i2 = 0; i2 < i1; i2++){
			r = r + base + "\n";
			base = base + "*";
		}
		return r;
	}

	public static String pyramid(int n) {
        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            // leading spaces
            for (int j = 0; j < n - i; j++) {
                result.append(" ");
            }

            // stars with spaces between them
            for (int k = 0; k < i; k++) {
                result.append("*");
                if (k < i - 1) {
                    result.append(" ");
                }
            }

            result.append("\n");
        }

        return result.toString();
    }

	public static String  multiplicationTable(int i1){
		String r = "";
		int i = 1;
		int count = 1;
		for (int i2 = 1; i2 <= i1; i2++){
			for(int i3 = 1; i3 <= i1; i3++){
				i = i2 * i3;
				if (count % i1 == 0){
					r = r + i + "\n";
				}
				else{
					r = r + i + " ";
				}
				count ++;
			}
		}
		
		return r;
	}

}
