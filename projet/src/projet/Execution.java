package projet;

import java.io.IOException;

public class Execution {

	public static void main(String[] args) {

		/*
		 * ProcessBuilder pb = new ProcessBuilder(); pb.command("bash", "-c",
		 * "./runCalculator.sh"); Process process = null; try { process =
		 * pb.start(); } catch (IOException e) { // TODO Auto-generated catch
		 * block e.printStackTrace(); } try { int retValue = process.waitFor();
		 * } catch (InterruptedException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */

		try {
			Runtime.getRuntime()
					.exec(new String[] {
							"/bin/bash",
							"-c",
							"android create project -p projectsPFE_1 -t 1 -n testPFE -k org.pfe.appmaker -a screen" });
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
