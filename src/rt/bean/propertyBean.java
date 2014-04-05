package rt.bean;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
/*
 * @Author rahultejwani
 */
public class propertyBean {
	private String SourcePath;
	private String LexiconPath;
	private String FeaturePath;
	private String AdverbPath;
	private String SentiWordPath;
	private String ReviewPath;
	private String IntensityTraining;
	private String PolarityTraining;
	public propertyBean()
	{
		Properties prop = new Properties();
    	InputStream input = null;
     
    	try {
    		input = getClass().getClassLoader().getResourceAsStream("/config.properties");
    		//input = new FileInputStream("config.properties");
     
    		// load a properties file
    		prop.load(input);
    		SourcePath = prop.getProperty("SourcePath");
    		LexiconPath = prop.getProperty("LexiconPath");
    		FeaturePath = prop.getProperty("FeatureFilePath");
    		setSentiWordPath(prop.getProperty("SentiWordPath"));
    		setAdverbPath(prop.getProperty("AdverbPath"));
    		setReviewPath(prop.getProperty("ReviewPath"));
    		setPolarityTraining(prop.getProperty("PolarityTraining"));
    		setIntensityTraining(prop.getProperty("IntensityTraining"));
     
    	} catch (IOException ex) {
    		ex.printStackTrace();
    	} finally {
    		if (input != null) {
    			try {
    				input.close();
    			} catch (IOException e) {
    				e.printStackTrace();
    			}
    		}
    	}
	}
	
	public String getSourcePath()
	{
		return this.SourcePath;
	}

	public String getLexiconPath() {
		return LexiconPath;
	}

	public String getFeaturePath() {
		return FeaturePath;
	}

	public String getAdverbPath() {
		return AdverbPath;
	}

	private void setAdverbPath(String adverbPath) {
		AdverbPath = adverbPath;
	}

	public String getSentiWordPath() {
		return SentiWordPath;
	}

	private void setSentiWordPath(String sentiWordPath) {
		SentiWordPath = sentiWordPath;
	}

	public String getReviewPath() {
		return ReviewPath;
	}

	private void setReviewPath(String reviewPath) {
		ReviewPath = reviewPath;
	}

	public String getIntensityTraining() {
		return IntensityTraining;
	}

	private void setIntensityTraining(String intensityTraining) {
		IntensityTraining = intensityTraining;
	}

	public String getPolarityTraining() {
		return PolarityTraining;
	}

	private void setPolarityTraining(String polarityTraining) {
		PolarityTraining = polarityTraining;
	}

	

	
}
