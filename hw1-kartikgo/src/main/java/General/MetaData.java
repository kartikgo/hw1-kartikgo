

/* First created by JCasGen Wed Sep 11 19:05:22 EDT 2013 */
package General;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** This is common to every annotation. It has fields about its source(component which generated the annotation), the confidence of it being an annotation, it's start and end offsets
 * Updated by JCasGen Wed Sep 11 19:05:22 EDT 2013
 * XML source: /home/kartik/git/hw1-kartikgo/hw1-kartikgo/src/main/resources/hw1-kartikgo-typesystem.xml
 * @generated */
public class MetaData extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(MetaData.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected MetaData() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public MetaData(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public MetaData(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public MetaData(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: Source

  /** getter for Source - gets 
   * @generated */
  public String getSource() {
    if (MetaData_Type.featOkTst && ((MetaData_Type)jcasType).casFeat_Source == null)
      jcasType.jcas.throwFeatMissing("Source", "General.MetaData");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MetaData_Type)jcasType).casFeatCode_Source);}
    
  /** setter for Source - sets  
   * @generated */
  public void setSource(String v) {
    if (MetaData_Type.featOkTst && ((MetaData_Type)jcasType).casFeat_Source == null)
      jcasType.jcas.throwFeatMissing("Source", "General.MetaData");
    jcasType.ll_cas.ll_setStringValue(addr, ((MetaData_Type)jcasType).casFeatCode_Source, v);}    
   
    
  //*--------------*
  //* Feature: Start

  /** getter for Start - gets 
   * @generated */
  public int getStart() {
    if (MetaData_Type.featOkTst && ((MetaData_Type)jcasType).casFeat_Start == null)
      jcasType.jcas.throwFeatMissing("Start", "General.MetaData");
    return jcasType.ll_cas.ll_getIntValue(addr, ((MetaData_Type)jcasType).casFeatCode_Start);}
    
  /** setter for Start - sets  
   * @generated */
  public void setStart(int v) {
    if (MetaData_Type.featOkTst && ((MetaData_Type)jcasType).casFeat_Start == null)
      jcasType.jcas.throwFeatMissing("Start", "General.MetaData");
    jcasType.ll_cas.ll_setIntValue(addr, ((MetaData_Type)jcasType).casFeatCode_Start, v);}    
   
    
  //*--------------*
  //* Feature: End

  /** getter for End - gets 
   * @generated */
  public int getEnd() {
    if (MetaData_Type.featOkTst && ((MetaData_Type)jcasType).casFeat_End == null)
      jcasType.jcas.throwFeatMissing("End", "General.MetaData");
    return jcasType.ll_cas.ll_getIntValue(addr, ((MetaData_Type)jcasType).casFeatCode_End);}
    
  /** setter for End - sets  
   * @generated */
  public void setEnd(int v) {
    if (MetaData_Type.featOkTst && ((MetaData_Type)jcasType).casFeat_End == null)
      jcasType.jcas.throwFeatMissing("End", "General.MetaData");
    jcasType.ll_cas.ll_setIntValue(addr, ((MetaData_Type)jcasType).casFeatCode_End, v);}    
   
    
  //*--------------*
  //* Feature: Confidence

  /** getter for Confidence - gets 
   * @generated */
  public double getConfidence() {
    if (MetaData_Type.featOkTst && ((MetaData_Type)jcasType).casFeat_Confidence == null)
      jcasType.jcas.throwFeatMissing("Confidence", "General.MetaData");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((MetaData_Type)jcasType).casFeatCode_Confidence);}
    
  /** setter for Confidence - sets  
   * @generated */
  public void setConfidence(double v) {
    if (MetaData_Type.featOkTst && ((MetaData_Type)jcasType).casFeat_Confidence == null)
      jcasType.jcas.throwFeatMissing("Confidence", "General.MetaData");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((MetaData_Type)jcasType).casFeatCode_Confidence, v);}    
  }

    