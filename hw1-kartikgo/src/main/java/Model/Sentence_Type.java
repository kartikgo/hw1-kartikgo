
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

/** This represents a sentence containing tokens, N-grams and metadata. It is a feature of Question and Answer.
 * Updated by JCasGen Wed Sep 11 19:05:22 EDT 2013
 * @generated */
public class Sentence_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Sentence_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Sentence_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Sentence(addr, Sentence_Type.this);
  			   Sentence_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Sentence(addr, Sentence_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Sentence.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("Model.Sentence");
 
  /** @generated */
  final Feature casFeat_TokenList;
  /** @generated */
  final int     casFeatCode_TokenList;
  /** @generated */ 
  public int getTokenList(int addr) {
        if (featOkTst && casFeat_TokenList == null)
      jcas.throwFeatMissing("TokenList", "Model.Sentence");
    return ll_cas.ll_getRefValue(addr, casFeatCode_TokenList);
  }
  /** @generated */    
  public void setTokenList(int addr, int v) {
        if (featOkTst && casFeat_TokenList == null)
      jcas.throwFeatMissing("TokenList", "Model.Sentence");
    ll_cas.ll_setRefValue(addr, casFeatCode_TokenList, v);}
    
  
 
  /** @generated */
  final Feature casFeat_UniGrams;
  /** @generated */
  final int     casFeatCode_UniGrams;
  /** @generated */ 
  public int getUniGrams(int addr) {
        if (featOkTst && casFeat_UniGrams == null)
      jcas.throwFeatMissing("UniGrams", "Model.Sentence");
    return ll_cas.ll_getRefValue(addr, casFeatCode_UniGrams);
  }
  /** @generated */    
  public void setUniGrams(int addr, int v) {
        if (featOkTst && casFeat_UniGrams == null)
      jcas.throwFeatMissing("UniGrams", "Model.Sentence");
    ll_cas.ll_setRefValue(addr, casFeatCode_UniGrams, v);}
    
  
 
  /** @generated */
  final Feature casFeat_BiGrams;
  /** @generated */
  final int     casFeatCode_BiGrams;
  /** @generated */ 
  public int getBiGrams(int addr) {
        if (featOkTst && casFeat_BiGrams == null)
      jcas.throwFeatMissing("BiGrams", "Model.Sentence");
    return ll_cas.ll_getRefValue(addr, casFeatCode_BiGrams);
  }
  /** @generated */    
  public void setBiGrams(int addr, int v) {
        if (featOkTst && casFeat_BiGrams == null)
      jcas.throwFeatMissing("BiGrams", "Model.Sentence");
    ll_cas.ll_setRefValue(addr, casFeatCode_BiGrams, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Trigrams;
  /** @generated */
  final int     casFeatCode_Trigrams;
  /** @generated */ 
  public int getTrigrams(int addr) {
        if (featOkTst && casFeat_Trigrams == null)
      jcas.throwFeatMissing("Trigrams", "Model.Sentence");
    return ll_cas.ll_getRefValue(addr, casFeatCode_Trigrams);
  }
  /** @generated */    
  public void setTrigrams(int addr, int v) {
        if (featOkTst && casFeat_Trigrams == null)
      jcas.throwFeatMissing("Trigrams", "Model.Sentence");
    ll_cas.ll_setRefValue(addr, casFeatCode_Trigrams, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Meta;
  /** @generated */
  final int     casFeatCode_Meta;
  /** @generated */ 
  public int getMeta(int addr) {
        if (featOkTst && casFeat_Meta == null)
      jcas.throwFeatMissing("Meta", "Model.Sentence");
    return ll_cas.ll_getRefValue(addr, casFeatCode_Meta);
  }
  /** @generated */    
  public void setMeta(int addr, int v) {
        if (featOkTst && casFeat_Meta == null)
      jcas.throwFeatMissing("Meta", "Model.Sentence");
    ll_cas.ll_setRefValue(addr, casFeatCode_Meta, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Sentence_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_TokenList = jcas.getRequiredFeatureDE(casType, "TokenList", "uima.cas.FSList", featOkTst);
    casFeatCode_TokenList  = (null == casFeat_TokenList) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_TokenList).getCode();

 
    casFeat_UniGrams = jcas.getRequiredFeatureDE(casType, "UniGrams", "uima.cas.FSList", featOkTst);
    casFeatCode_UniGrams  = (null == casFeat_UniGrams) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_UniGrams).getCode();

 
    casFeat_BiGrams = jcas.getRequiredFeatureDE(casType, "BiGrams", "uima.cas.FSList", featOkTst);
    casFeatCode_BiGrams  = (null == casFeat_BiGrams) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_BiGrams).getCode();

 
    casFeat_Trigrams = jcas.getRequiredFeatureDE(casType, "Trigrams", "uima.cas.FSList", featOkTst);
    casFeatCode_Trigrams  = (null == casFeat_Trigrams) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Trigrams).getCode();

 
    casFeat_Meta = jcas.getRequiredFeatureDE(casType, "Meta", "General.MetaData", featOkTst);
    casFeatCode_Meta  = (null == casFeat_Meta) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Meta).getCode();

  }
}



    