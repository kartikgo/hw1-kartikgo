
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

/** This is the representation of the whole structure. It has Question and List of Answers as its features
 * Updated by JCasGen Wed Sep 11 19:05:22 EDT 2013
 * @generated */
public class Entity_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Entity_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Entity_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Entity(addr, Entity_Type.this);
  			   Entity_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Entity(addr, Entity_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Entity.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("Model.Entity");
 
  /** @generated */
  final Feature casFeat_Question;
  /** @generated */
  final int     casFeatCode_Question;
  /** @generated */ 
  public int getQuestion(int addr) {
        if (featOkTst && casFeat_Question == null)
      jcas.throwFeatMissing("Question", "Model.Entity");
    return ll_cas.ll_getRefValue(addr, casFeatCode_Question);
  }
  /** @generated */    
  public void setQuestion(int addr, int v) {
        if (featOkTst && casFeat_Question == null)
      jcas.throwFeatMissing("Question", "Model.Entity");
    ll_cas.ll_setRefValue(addr, casFeatCode_Question, v);}
    
  
 
  /** @generated */
  final Feature casFeat_AnswerList;
  /** @generated */
  final int     casFeatCode_AnswerList;
  /** @generated */ 
  public int getAnswerList(int addr) {
        if (featOkTst && casFeat_AnswerList == null)
      jcas.throwFeatMissing("AnswerList", "Model.Entity");
    return ll_cas.ll_getRefValue(addr, casFeatCode_AnswerList);
  }
  /** @generated */    
  public void setAnswerList(int addr, int v) {
        if (featOkTst && casFeat_AnswerList == null)
      jcas.throwFeatMissing("AnswerList", "Model.Entity");
    ll_cas.ll_setRefValue(addr, casFeatCode_AnswerList, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Meta;
  /** @generated */
  final int     casFeatCode_Meta;
  /** @generated */ 
  public int getMeta(int addr) {
        if (featOkTst && casFeat_Meta == null)
      jcas.throwFeatMissing("Meta", "Model.Entity");
    return ll_cas.ll_getRefValue(addr, casFeatCode_Meta);
  }
  /** @generated */    
  public void setMeta(int addr, int v) {
        if (featOkTst && casFeat_Meta == null)
      jcas.throwFeatMissing("Meta", "Model.Entity");
    ll_cas.ll_setRefValue(addr, casFeatCode_Meta, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Entity_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Question = jcas.getRequiredFeatureDE(casType, "Question", "Model.Question", featOkTst);
    casFeatCode_Question  = (null == casFeat_Question) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Question).getCode();

 
    casFeat_AnswerList = jcas.getRequiredFeatureDE(casType, "AnswerList", "uima.cas.FSList", featOkTst);
    casFeatCode_AnswerList  = (null == casFeat_AnswerList) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_AnswerList).getCode();

 
    casFeat_Meta = jcas.getRequiredFeatureDE(casType, "Meta", "General.MetaData", featOkTst);
    casFeatCode_Meta  = (null == casFeat_Meta) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Meta).getCode();

  }
}



    