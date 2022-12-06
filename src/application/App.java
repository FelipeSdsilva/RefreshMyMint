package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;
import exercicies.Array;
import exercicies.ComparationOfTriangle;
import exercicies.IntrodutionTheFunction;
import exercicies.StringText;
import exercicies.StructuralSequence;
import exercicies.RepetitionFor;
import exercicies.RepetitionWhile;

@SuppressWarnings("unused")
public class App {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		//ComparationOfTriangle.triangleExercicie();
		StringText.resolvProblemWithOrientationObject();
		
		Array arr = new Array();
		IntrodutionTheFunction fc = new IntrodutionTheFunction();
		StringText fix1 = new StringText();
		StructuralSequence ss = new StructuralSequence();
		RepetitionWhile sw = new RepetitionWhile();
		RepetitionFor sf = new RepetitionFor();
		
		

		// fc.whatNumberMoreHigh();
		// sf.exercicie4();
		// sw.exercicie4();
		// arr.arrayFixedExercicies3();
		// fix1.fixedExercicieString();
		// ss.duration();

		sc.close();
	}

}
