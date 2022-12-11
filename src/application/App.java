package application;

import java.util.Locale;
import java.util.Scanner;

import exercicies.Array;
import exercicies.ConditionalStructure;
import exercicies.OrientationObject;
import exercicies.For;
import exercicies.While;
import exercicies.SequentialStructure;
import views.StringText;

@SuppressWarnings("unused")
public class App {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Array arr = new Array();
		ConditionalStructure cs = new ConditionalStructure();
		OrientationObject or = new OrientationObject();
		SequentialStructure ss = new SequentialStructure();
		While sw = new While();
		For sf = new For();
		
		// arr.exercice08();
		cs.exercice07();
		// fc.whatNumberMoreHigh();
		// fc.IGoWentPayYReaisForValueXinDollar();
		// fix1.fixedExercicieString();
		// or.accountExercicie();
		// or.estudentExercicie();
		// sf.exercicie04();
		// ss.exercice10();
		// sw.exercicie04();

		sc.close();
	}

}
