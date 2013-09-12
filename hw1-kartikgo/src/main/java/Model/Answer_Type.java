
/* First created by JCasGen Wed Sep 11 19:05:22 EDT 2013 */
package Model;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** This class represents a candidate answer. It has sentence, True Score, Predicted Score and meta fields.
 * Updated by JCasGen Wed Sep 11 19:05:22 EDT 2013
 * @generated */
public class Answer_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Answer_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Answer_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Answer(addr, Answer_Type.this);
  			   Answer_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Answer(addr, Answer_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Answer.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("Model.Answer");
 
  /** @generated */
  final Feature casFeat_Sentence;
  /** @generated */
  final int     casFeatCode_Sentence;
  /** @generated */ 
  public int getSentence(int addr) {
        if (featOkTst && casFeat_Sentence == null)
      jcas.throwFeatMissing("Sentence", "Model.Answer");
    return ll_cas.ll_getRefValue(addr, casFeatCode_Sentence);
  }
  /** @generated */    
  public void setSentence(int addr, int v) {
        if (featOkTst && casFeat_Sentence == null)
      jcas.throwFeatMissing("Sentence", "Model.Answer");
    ll_cas.ll_setRefValue(addr, casFeatCode_Sentence, v);}
    
  
 
  /** @generated */
  final Feature casFeat_TrueScore;
  /** @generated */
  final int     casFeatCode_TrueScore;
  /** @generated */ 
  public double getTrueScore(int addr) {
        if (featOkTst && casFeat_TrueScore == null)
      jcas.throwFeatMissing("TrueScore", "Model.Answer");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_TrueScore);
  }
  /** @generated */    
  public void setTrueScore(int addr, double v) {
        if (featOkTst && casFeat_TrueScore == null)
      jcas.throwFeatMissing("TrueScore", "Model.Answer");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_TrueScore, v);}
    
  
 
  /** @generated */
  final Feature casFeat_PredictedScore;
  /** @generated */
  final int     casFeatCode_PredictedScore;
  /** @generated */ 
  public double getPredictedScore(int addr) {
        if (featOkTst && casFeat_PredictedScore == null)
      jcas.throwFeatMissing("PredictedScore", "Model.Answer");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_PredictedScore);
  }
  /** @generated */    
  public void setPredictedScore(int addr, double v) {
        if (featOkTst && casFeat_PredictedScore == null)
      jcas.throwFeatMissing("PredictedScore", "Model.Answer");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_PredictedScore, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Meta;
  /** @generated */
  final int     casFeatCode_Meta;
  /** @generated */ 
  public int getMeta(int addr) {
        if (featOkTst && casFeat_Meta == null)
      jcas.throwFeatMissing("Meta", "Model.Answer");
    return ll_cas.ll_getRefValue(addr, casFeatCode_Meta);
  }
  /** @generated */    
  public void setMeta(int addr, int v) {
        if (featOkTst && casFeat_Meta == null)
      jcas.throwFeatMissing("Meta", "Model.Answer");
    ll_cas.ll_setRefValue(addr, casFeatCode_Meta, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Answer_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Sentence = jcas.getRequiredFeatureDE(casType, "Sentence", "Model.Sentence", featOkTst);
    casFeatCode_Sentence  = (null == casFeat_Sentence) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Sentence).getCode();

 
    casFeat_TrueScore = jcas.getRequiredFeatureDE(casType, "TrueScore", "uima.cas.Double", featOkTst);
    casFeatCode_TrueScore  = (null == casFeat_TrueScore) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_TrueScore).getCode();

 
    casFeat_PredictedScore = jcas.getRequiredFeatureDE(casType, "PredictedScore", "uima.cas.Double", featOkTst);
    casFeatCode_PredictedScore  = (null == casFeat_PredictedScore) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_PredictedScore).getCode();

 
    casFeat_Meta = jcas.getRequiredFeatureDE(casType, "Meta", "General.MetaData", featOkTst);
    casFeatCode_Meta  = (null == casFeat_Meta) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Meta).getCode();

  }
}



    