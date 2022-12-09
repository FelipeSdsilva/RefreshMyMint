package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;
import exercicies.Array;
import exercicies.ComparationOfTriangle;
import exercicies.ConditionalStructure;
import exercicies.IntrodutionTheFunction;
import exercicies.OrientationObject;
import exercicies.SequentialStructure;
import views.StringText;
import exercicies.RepetitionFor;
import exercicies.RepetitionWhile;

@SuppressWarnings("unused")
public class App {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Array arr = new Array();
		ConditionalStructure cs = new ConditionalStructure();
		IntrodutionTheFunction fc = new IntrodutionTheFunction();
		OrientationObject or = new OrientationObject();
		StringText fix1 = new StringText();
		SequentialStructure ss = new SequentialStructure();
		RepetitionWhile sw = new RepetitionWhile();
		RepetitionFor sf = new RepetitionFor();
		
		// arr.exercice8();
		cs.exercice1();
		// ComparationOfTriangle.triangleExercicie();
		// fc.whatNumberMoreHigh();
		// fc.IGoWentPayYReaisForValueXinDollar();
		// fix1.fixedExercicieString();
		// or.accountExercicie();
		// or.estudentExercicie();
		// sf.exercicie4();
		// ss.exercice10();
		// sw.exercicie4();

		sc.close();
	}

}
