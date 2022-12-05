package curso_programacao.application;

import java.util.Locale;

import exercicies.Array;
import exercicies.StringText;
import exercicies.StructuralSequence;
import exercicies.RepetitionFor;
import exercicies.RepetitionWhile;


@SuppressWarnings("unused")
public class App {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		StringText fix1 = new StringText();
		Array arr = new Array();
		StructuralSequence ss = new StructuralSequence();
		RepetitionWhile sw = new RepetitionWhile();
		RepetitionFor sf = new RepetitionFor();

		//sf.exercicie4();
		
		sw.exercicie4();

		// arr.arrayFixedExercicies3();
		// fix1.fixedExercicieString();
		// ss.duration();

	}

}
