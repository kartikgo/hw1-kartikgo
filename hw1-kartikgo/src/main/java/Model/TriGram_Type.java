
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

/** This represents a tri-gram which has three token fields and a metadata field
 * Updated by JCasGen Wed Sep 11 19:05:22 EDT 2013
 * @generated */
public class TriGram_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (TriGram_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = TriGram_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new TriGram(addr, TriGram_Type.this);
  			   TriGram_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new TriGram(addr, TriGram_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = TriGram.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("Model.TriGram");
 
  /** @generated */
  final Feature casFeat_Token1;
  /** @generated */
  final int     casFeatCode_Token1;
  /** @generated */ 
  public int getToken1(int addr) {
        if (featOkTst && casFeat_Token1 == null)
      jcas.throwFeatMissing("Token1", "Model.TriGram");
    return ll_cas.ll_getRefValue(addr, casFeatCode_Token1);
  }
  /** @generated */    
  public void setToken1(int addr, int v) {
        if (featOkTst && casFeat_Token1 == null)
      jcas.throwFeatMissing("Token1", "Model.TriGram");
    ll_cas.ll_setRefValue(addr, casFeatCode_Token1, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Token2;
  /** @generated */
  final int     casFeatCode_Token2;
  /** @generated */ 
  public int getToken2(int addr) {
        if (featOkTst && casFeat_Token2 == null)
      jcas.throwFeatMissing("Token2", "Model.TriGram");
    return ll_cas.ll_getRefValue(addr, casFeatCode_Token2);
  }
  /** @generated */    
  public void setToken2(int addr, int v) {
        if (featOkTst && casFeat_Token2 == null)
      jcas.throwFeatMissing("Token2", "Model.TriGram");
    ll_cas.ll_setRefValue(addr, casFeatCode_Token2, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Token3;
  /** @generated */
  final int     casFeatCode_Token3;
  /** @generated */ 
  public int getToken3(int addr) {
        if (featOkTst && casFeat_Token3 == null)
      jcas.throwFeatMissing("Token3", "Model.TriGram");
    return ll_cas.ll_getRefValue(addr, casFeatCode_Token3);
  }
  /** @generated */    
  public void setToken3(int addr, int v) {
        if (featOkTst && casFeat_Token3 == null)
      jcas.throwFeatMissing("Token3", "Model.TriGram");
    ll_cas.ll_setRefValue(addr, casFeatCode_Token3, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Meta;
  /** @generated */
  final int     casFeatCode_Meta;
  /** @generated */ 
  public int getMeta(int addr) {
        if (featOkTst && casFeat_Meta == null)
      jcas.throwFeatMissing("Meta", "Model.TriGram");
    return ll_cas.ll_getRefValue(addr, casFeatCode_Meta);
  }
  /** @generated */    
  public void setMeta(int addr, int v) {
        if (featOkTst && casFeat_Meta == null)
      jcas.throwFeatMissing("Meta", "Model.TriGram");
    ll_cas.ll_setRefValue(addr, casFeatCode_Meta, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public TriGram_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Token1 = jcas.getRequiredFeatureDE(casType, "Token1", "Model.Token", featOkTst);
    casFeatCode_Token1  = (null == casFeat_Token1) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Token1).getCode();

 
    casFeat_Token2 = jcas.getRequiredFeatureDE(casType, "Token2", "Model.Token", featOkTst);
    casFeatCode_Token2  = (null == casFeat_Token2) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Token2).getCode();

 
    casFeat_Token3 = jcas.getRequiredFeatureDE(casType, "Token3", "Model.Token", featOkTst);
    casFeatCode_Token3  = (null == casFeat_Token3) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Token3).getCode();

 
    casFeat_Meta = jcas.getRequiredFeatureDE(casType, "Meta", "General.MetaData", featOkTst);
    casFeatCode_Meta  = (null == casFeat_Meta) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Meta).getCode();

  }
}



    