package rt.testMain;

import rt.features.FeatureExtractionPolarity;



public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FeatureExtractionPolarity fep = new FeatureExtractionPolarity("is this what indian politics all about? :(");
		double unigram = fep.getUnigramScore();
		double bigram = fep.getBigramFirstScore();
		System.out.println("Unigram Score:"+ unigram);
		System.out.println("Bigram Score:"+ bigram);
		System.out.println("emoticon score:" + fep.getEmotcionScore());
		System.out.println("trigram score:" + fep.getTrigramScore());
		System.out.println("Final Score :  "+ fep.getFinalScore());
		System.out.println("Size:"+ fep.getWordCount());
		System.out.println("*********************************************************");
	}

}
