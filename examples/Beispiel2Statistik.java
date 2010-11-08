/**
 * Diese Klasse ist ein weiteres Beispiel fuer die Benutzung von Statistik
 */
class Beispiel2Statistik {
	/**
	 * Erstellt zwei Statistiken mit Beispielwerten und gibt sie aus
	 *
	 * @param args unused
	 */
	public static void main(String[] args) {
		Statistik klasseA = new Statistik();
		Statistik klasseB = new Statistik();
		klasseA.hinzufuegen(10);
		klasseB.hinzufuegen(9);
		klasseA.hinzufuegen(8);
		klasseA.hinzufuegen(6);
		klasseB.hinzufuegen(7);
		klasseA.hinzufuegen(8);
		System.out.println("Mittelwert: " + klasseA.leseMittelwert());
		System.out.println("Standardabweichung: "
			+ klasseA.leseStandardabweichung());
		System.out.println("Mittelwert: " + klasseB.leseMittelwert());
		System.out.println("Standardabweichung: "
			+ klasseB.leseStandardabweichung());
	}
}
