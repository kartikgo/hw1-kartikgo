

/* First created by JCasGen Wed Sep 11 19:05:22 EDT 2013 */
package Model;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import General.MetaData;
import org.apache.uima.jcas.tcas.Annotation;


/** This class represents a candidate answer. It has sentence, True Score, Predicted Score and meta fields.
 * Updated by JCasGen Wed Sep 11 19:05:22 EDT 2013
 * XML source: /home/kartik/git/hw1-kartikgo/hw1-kartikgo/src/main/resources/hw1-kartikgo-typesystem.xml
 * @generated */
public class Answer extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Answer.class);
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
  protected Answer() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Answer(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Answer(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Answer(JCas jcas, int begin, int end) {
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
  //* Feature: Sentence

  /** getter for Sentence - gets 
   * @generated */
  public Sentence getSentence() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_Sentence == null)
      jcasType.jcas.throwFeatMissing("Sentence", "Model.Answer");
    return (Sentence)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_Sentence)));}
    
  /** setter for Sentence - sets  
   * @generated */
  public void setSentence(Sentence v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_Sentence == null)
      jcasType.jcas.throwFeatMissing("Sentence", "Model.Answer");
    jcasType.ll_cas.ll_setRefValue(addr, ((Answer_Type)jcasType).casFeatCode_Sentence, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: TrueScore

  /** getter for TrueScore - gets 
   * @generated */
  public double getTrueScore() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_TrueScore == null)
      jcasType.jcas.throwFeatMissing("TrueScore", "Model.Answer");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Answer_Type)jcasType).casFeatCode_TrueScore);}
    
  /** setter for TrueScore - sets  
   * @generated */
  public void setTrueScore(double v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_TrueScore == null)
      jcasType.jcas.throwFeatMissing("TrueScore", "Model.Answer");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Answer_Type)jcasType).casFeatCode_TrueScore, v);}    
   
    
  //*--------------*
  //* Feature: PredictedScore

  /** getter for PredictedScore - gets 
   * @generated */
  public double getPredictedScore() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_PredictedScore == null)
      jcasType.jcas.throwFeatMissing("PredictedScore", "Model.Answer");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Answer_Type)jcasType).casFeatCode_PredictedScore);}
    
  /** setter for PredictedScore - sets  
   * @generated */
  public void setPredictedScore(double v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_PredictedScore == null)
      jcasType.jcas.throwFeatMissing("PredictedScore", "Model.Answer");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Answer_Type)jcasType).casFeatCode_PredictedScore, v);}    
   
    
  //*--------------*
  //* Feature: Meta

  /** getter for Meta - gets 
   * @generated */
  public MetaData getMeta() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_Meta == null)
      jcasType.jcas.throwFeatMissing("Meta", "Model.Answer");
    return (MetaData)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_Meta)));}
    
  /** setter for Meta - sets  
   * @generated */
  public void setMeta(MetaData v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_Meta == null)
      jcasType.jcas.throwFeatMissing("Meta", "Model.Answer");
    jcasType.ll_cas.ll_setRefValue(addr, ((Answer_Type)jcasType).casFeatCode_Meta, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    