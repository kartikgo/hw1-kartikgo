
/* First created by JCasGen Wed Sep 11 19:05:22 EDT 2013 */
package General;

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

/** This is common to every annotation. It has fields about its source(component which generated the annotation), the confidence of it being an annotation, it's start and end offsets
 * Updated by JCasGen Wed Sep 11 19:05:22 EDT 2013
 * @generated */
public class MetaData_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (MetaData_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = MetaData_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new MetaData(addr, MetaData_Type.this);
  			   MetaData_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new MetaData(addr, MetaData_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = MetaData.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("General.MetaData");
 
  /** @generated */
  final Feature casFeat_Source;
  /** @generated */
  final int     casFeatCode_Source;
  /** @generated */ 
  public String getSource(int addr) {
        if (featOkTst && casFeat_Source == null)
      jcas.throwFeatMissing("Source", "General.MetaData");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Source);
  }
  /** @generated */    
  public void setSource(int addr, String v) {
        if (featOkTst && casFeat_Source == null)
      jcas.throwFeatMissing("Source", "General.MetaData");
    ll_cas.ll_setStringValue(addr, casFeatCode_Source, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Start;
  /** @generated */
  final int     casFeatCode_Start;
  /** @generated */ 
  public int getStart(int addr) {
        if (featOkTst && casFeat_Start == null)
      jcas.throwFeatMissing("Start", "General.MetaData");
    return ll_cas.ll_getIntValue(addr, casFeatCode_Start);
  }
  /** @generated */    
  public void setStart(int addr, int v) {
        if (featOkTst && casFeat_Start == null)
      jcas.throwFeatMissing("Start", "General.MetaData");
    ll_cas.ll_setIntValue(addr, casFeatCode_Start, v);}
    
  
 
  /** @generated */
  final Feature casFeat_End;
  /** @generated */
  final int     casFeatCode_End;
  /** @generated */ 
  public int getEnd(int addr) {
        if (featOkTst && casFeat_End == null)
      jcas.throwFeatMissing("End", "General.MetaData");
    return ll_cas.ll_getIntValue(addr, casFeatCode_End);
  }
  /** @generated */    
  public void setEnd(int addr, int v) {
        if (featOkTst && casFeat_End == null)
      jcas.throwFeatMissing("End", "General.MetaData");
    ll_cas.ll_setIntValue(addr, casFeatCode_End, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Confidence;
  /** @generated */
  final int     casFeatCode_Confidence;
  /** @generated */ 
  public double getConfidence(int addr) {
        if (featOkTst && casFeat_Confidence == null)
      jcas.throwFeatMissing("Confidence", "General.MetaData");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_Confidence);
  }
  /** @generated */    
  public void setConfidence(int addr, double v) {
        if (featOkTst && casFeat_Confidence == null)
      jcas.throwFeatMissing("Confidence", "General.MetaData");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_Confidence, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public MetaData_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Source = jcas.getRequiredFeatureDE(casType, "Source", "uima.cas.String", featOkTst);
    casFeatCode_Source  = (null == casFeat_Source) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Source).getCode();

 
    casFeat_Start = jcas.getRequiredFeatureDE(casType, "Start", "uima.cas.Integer", featOkTst);
    casFeatCode_Start  = (null == casFeat_Start) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Start).getCode();

 
    casFeat_End = jcas.getRequiredFeatureDE(casType, "End", "uima.cas.Integer", featOkTst);
    casFeatCode_End  = (null == casFeat_End) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_End).getCode();

 
    casFeat_Confidence = jcas.getRequiredFeatureDE(casType, "Confidence", "uima.cas.Double", featOkTst);
    casFeatCode_Confidence  = (null == casFeat_Confidence) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Confidence).getCode();

  }
}



    