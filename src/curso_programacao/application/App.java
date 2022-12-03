package curso_programacao.application;

import java.util.Locale;

import exercicies.Array;
import exercicies.StringText;
import exercicies.StructuralSequence;
import exercicies.StructureRepetitionWhile;

public class App {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		
		@SuppressWarnings("unused")
		StringText fix1 = new StringText();
		@SuppressWarnings("unused")
		Array arr = new Array();
		@SuppressWarnings("unused")
		StructuralSequence ss =  new StructuralSequence();
		
		StructureRepetitionWhile sw = new StructureRepetitionWhile();
		
		sw.exercicie3();
		
		//arr.arrayFixedExercicies3();
		//fix1.fixedExercicieString();
		//ss.duration();
		
	}

}
