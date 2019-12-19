package codewars;

// return string without spaces //


class Kata {
	static String noSpace(final String x) {
		String x1 = x.replace(" ", ""); // creazione di una nuova stringa // oppure al posto di string x1 -> return
											// senza creare x1
		return x1;
	}

	static String noSpace2(final String y) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < y.length(); i++) {
			char cur = y.charAt(i);
			if (cur != ' ') {           // il carattere tab è '\t', per a capo '\n'
				sb.append(cur);
			}
		}
		return sb.toString();
	}
}