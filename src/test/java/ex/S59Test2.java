package ex;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class S59Test2 { // inizia con lettera maiuscola, poi si continua con la CamelCase

	@Test // questa annotazione con @ determina la presenza del test
	void multiplicationTableThree() { // plain se è un test semplice, non è uno dei casi limite; la prima lettera è minuscola, poi si continua con la CamelCase (si tratta di un METODO)
		int[][] actual = S59.multiplicationTable(3);

		int[][] expected = { //
			{ 1, 2, 3 }, //
			{ 2, 4, 6 }, //
			{ 3, 6, 9 } //
		};

		assertEquals(expected.length, actual.length); // si tratta di un array di array di interi
		
		for (int i = 0; i < expected.length; i++) { // vogliamo verificare che effettivamente tutte le righe della matrice abbiamo la stessa lunghezza
			assertEquals(expected[i].length, actual[i].length);
//			assertTrue(expected[i].length == actual[i].length);
		}
		for (int i = 0; i < expected.length; i++) { // controlla tutte le celle delle tabelle, confrontale tra loro, devono essere uguali
			for (int j = 0; j < expected.length; j++) {
				assertEquals(expected[i][j], actual[i][j]);
			}
		}
	}
}
