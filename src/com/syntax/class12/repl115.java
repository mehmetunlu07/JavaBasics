package com.syntax.class12;

public class repl115 {
//Replace all instances of given character with a "*" within the given String.

	String censorLetter(String a, char b) {
		String str = "";

		for (int i = 0; i < a.length(); i++) {

			if (a.charAt(i) == b) {
				str += '*';
			} else {
				str += a.charAt(i);
			}

		}

		return str;
	}

	public static void main(String[] args) {
		repl115 obj = new repl115();
		System.out.println(obj.censorLetter("computer science", 'e'));
		System.out.println(obj.censorLetter("trick or treat", 't'));

	}

}
