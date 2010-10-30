/**
 * This class implements a little  sample program to print the command line
 * arguments
 */
class ParameterOut {
	/**
	 * This method prints the command line arguments
	 *
	 * @param args command line arguments to be printed
	 */
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			System.out.println("args[" + i + "]: " + args[i]);
		}
	}
}
