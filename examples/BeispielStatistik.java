/**
 * Diese Klasse ist ein Beispiel fuer die Benutzung der Klasse Statistik
 */
class BeispielStatistik {
	/**
	 * Erstellt eine Statistik mit Beispielwerten und gibt sie aus
	 *
	 * @param args unused
	 */
	public static void main(String[] args) {
		Statistik punkte = new Statistik();
		punkte.hinzufuegen(6);
		punkte.hinzufuegen(8);
		punkte.hinzufuegen(7.5);
		punkte.hinzufuegen(10);
		punkte.hinzufuegen(5.5);
		punkte.hinzufuegen(9);
		punkte.hinzufuegen(8.5);
		punkte.hinzufuegen(7);
		punkte.hinzufuegen(8);
		punkte.hinzufuegen(9.5);
		punkte.hinzufuegen(8);
		punkte.hinzufuegen(10);
		punkte.hinzufuegen(7.5);
		punkte.hinzufuegen(6);
		punkte.hinzufuegen(9);
		punkte.hinzufuegen(10);
		punkte.hinzufuegen(7.5);
		System.out.print("Mittelwert: ");
		System.out.println(punkte.leseMittelwert());
		System.out.print("Standardabweichung: ");
		System.out.println(punkte.leseStandardabweichung());
	}
}
