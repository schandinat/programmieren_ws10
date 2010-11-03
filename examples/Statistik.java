/**
 * Diese Klasse stellt Statistikfunktionen zur Verfuegung
 *
 * Sie kann Werte akkumulieren und dazu Mittelwert und Standardabweichung
 * berechnen.
 */
public class Statistik {
	double	summeX = 0;
	double	summeX2 = 0;
	int	n = 0;

	/**
	 * Fuege x den akkumulierten Werten hinzu
	 *
	 * @param x der Wert der zur Statistik hinzugefuegt werden soll
	 */
	public void hinzufuegen(double x) {
		summeX = summeX + x;
		summeX2 = summeX2 + x * x;
		n = n + 1;
	}

	/**
	 * Lese den aktuellen Mittelwert der Statistik aus
	 *
	 * @return den aktuellen Mittelwert der Statistik
	 */
	public double leseMittelwert() {
		return summeX / n;
	}

	/**
	 * Lese die aktuelle Standardabweichung der Statistik
	 *
	 * @return die aktuelle Standardabweichung der Statistik
	 */
	public double leseStandardabweichung() {
		double mittelwert = leseMittelwert();
		double varianz = summeX2 / n - mittelwert * mittelwert;
		return Math.sqrt(varianz);
	}
}
