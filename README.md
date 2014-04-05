Polarity
========
This Package gives the polarity score of a text between -1 to 1. Where 0 is neutral score

Example code to use the library:
String check = "today is a bright sunny day and I am excited :) ";
FeatureExtractionPolarity fep = new FeatureExtractionPolarity(check);
System.out.println("Polarity Score :  "+ fep.getFinalScore());
System.out.println("*********************************************************");