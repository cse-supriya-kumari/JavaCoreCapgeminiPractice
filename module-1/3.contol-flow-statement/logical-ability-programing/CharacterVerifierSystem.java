class CharacterVerifierSystem {
	public static void main(String[] args) {
		char character = 'f';
		if((character >= 'A' && character <= 'Z') || (character >= 'a' && character <= 'z')) {
			System.out.println("Alphabet");
			if(character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U' || character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
			System.out.println("Vowel");
			}
			else{
				System.out.println("Consonent");
			}
			}
			else if(character >= '0' && character <= '9') {
				System.out.println("Digit");
			}
			else {
				System.out.println("Symbol");
			}
		}
}

//homeWork