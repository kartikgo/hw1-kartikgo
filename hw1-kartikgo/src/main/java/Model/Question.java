

/* First created by JCasGen Wed Sep 11 19:05:22 EDT 2013 */
package Model;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import General.MetaData;
import org.apache.uima.jcas.tcas.Annotation;


/** This represents the Question. It is a feature of Entity. It has a sentence and metadata
 * Updated by JCasGen Wed Sep 11 19:05:22 EDT 2013
 * XML source: /home/kartik/git/hw1-kartikgo/hw1-kartikgo/src/main/resources/hw1-kartikgo-typesystem.xml
 * @generated */
public class Question extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Question.class);
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
  protected Question() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Question(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Question(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Question(JCas jcas, int begin, int end) {
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
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_Sentence == null)
      jcasType.jcas.throwFeatMissing("Sentence", "Model.Question");
    return (Sentence)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_Sentence)));}
    
  /** setter for Sentence - sets  
   * @generated */
  public void setSentence(Sentence v) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_Sentence == null)
      jcasType.jcas.throwFeatMissing("Sentence", "Model.Question");
    jcasType.ll_cas.ll_setRefValue(addr, ((Question_Type)jcasType).casFeatCode_Sentence, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: Meta

  /** getter for Meta - gets 
   * @generated */
  public MetaData getMeta() {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_Meta == null)
      jcasType.jcas.throwFeatMissing("Meta", "Model.Question");
    return (MetaData)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_Meta)));}
    
  /** setter for Meta - sets  
   * @generated */
  public void setMeta(MetaData v) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_Meta == null)
      jcasType.jcas.throwFeatMissing("Meta", "Model.Question");
    jcasType.ll_cas.ll_setRefValue(addr, ((Question_Type)jcasType).casFeatCode_Meta, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    