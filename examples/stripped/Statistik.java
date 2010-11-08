public class Statistik {
	double	summeX = 0;
	double	summeX2 = 0;
	int	n = 0;

	public void hinzufuegen(double x) {
		summeX = summeX + x;
		summeX2 = summeX2 + x * x;
		n = n + 1;
	}

	public double leseMittelwert() {
		return summeX / n;
	}

	public double leseStandardabweichung() {
		double mittelwert = leseMittelwert();
		double varianz = summeX2 / n - mittelwert * mittelwert;
		return Math.sqrt(varianz);
	}
}
