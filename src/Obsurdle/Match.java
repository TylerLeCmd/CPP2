public class Match {
	private static String w = "";
	private static String g = "";

	public void setWords(String word, String guess) {
		this.w = word;
		this.g = guess;
	}

	/*
	 * System.out.println("Welcome to OBSURDLE.");
	 * System.out.println("The rules are similar to Wordle:");
	 * System.out.println("You are trying to guess a seven-letter word.");
	 * System.out.
	 * println("You'll be told whether you get a letter correctly guessed by these indicators: □ ■"
	 * );
	 * System.out.println("Example Word: Poggers");
	 * System.out.println("| ■ | - | - | - | - | □ | □ |");
	 * System.out.println();
	 * System.out.println("| □ | indicates a right letter, wrong position,");
	 * System.out.println("| ■ | indicates a right letter, right position,");
	 * System.out.println("| - | indicates a wrong letter.");
	 * System.out.println();
	 * System.out.println("You will get 7 tries to get the word.");
	 * System.out.println("[Press ENTER to continue]");
	 */
	public static String matchText() {
		String output = "|";
		for (int j = 0; j < 7; j++) {
			String check = " -";
			for (int i = 0; i < 7; i++) {
				if (w.charAt(i) == g.charAt(j)) {
					if (i == j) {
						check = " ■";
					} else if (check != " ■") {
						check = " □";
					}
				}
			}
			output = output + check + " |";
		}
		return output;
	}
}
