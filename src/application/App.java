package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;
import exercicies.Array;
import exercicies.ComparationOfTriangle;
import exercicies.IntrodutionTheFunction;
import exercicies.OrientationObject;
import exercicies.StructuralSequence;
import views.StringText;
import exercicies.RepetitionFor;
import exercicies.RepetitionWhile;

@SuppressWarnings("unused")
public class App {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// ComparationOfTriangle.triangleExercicie();

		Array arr = new Array();
		IntrodutionTheFunction fc = new IntrodutionTheFunction();
		OrientationObject or = new OrientationObject();
		StringText fix1 = new StringText();
		StructuralSequence ss = new StructuralSequence();
		RepetitionWhile sw = new RepetitionWhile();
		RepetitionFor sf = new RepetitionFor();

		// arr.arrayFixedExercicies3();
		// fc.whatNumberMoreHigh();
		// fix1.fixedExercicieString();
		or.estudentExercicie();
		// sf.exercicie4();
		// ss.duration();
		// sw.exercicie4();

		sc.close();
	}

}
