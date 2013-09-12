

/* First created by JCasGen Wed Sep 11 19:05:22 EDT 2013 */
package Model;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import General.MetaData;
import org.apache.uima.jcas.cas.FSList;
import org.apache.uima.jcas.tcas.Annotation;


/** This is the representation of the whole structure. It has Question and List of Answers as its features
 * Updated by JCasGen Wed Sep 11 19:05:22 EDT 2013
 * XML source: /home/kartik/git/hw1-kartikgo/hw1-kartikgo/src/main/resources/hw1-kartikgo-typesystem.xml
 * @generated */
public class Entity extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Entity.class);
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
  protected Entity() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Entity(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Entity(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Entity(JCas jcas, int begin, int end) {
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
  //* Feature: Question

  /** getter for Question - gets 
   * @generated */
  public Question getQuestion() {
    if (Entity_Type.featOkTst && ((Entity_Type)jcasType).casFeat_Question == null)
      jcasType.jcas.throwFeatMissing("Question", "Model.Entity");
    return (Question)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Entity_Type)jcasType).casFeatCode_Question)));}
    
  /** setter for Question - sets  
   * @generated */
  public void setQuestion(Question v) {
    if (Entity_Type.featOkTst && ((Entity_Type)jcasType).casFeat_Question == null)
      jcasType.jcas.throwFeatMissing("Question", "Model.Entity");
    jcasType.ll_cas.ll_setRefValue(addr, ((Entity_Type)jcasType).casFeatCode_Question, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: AnswerList

  /** getter for AnswerList - gets 
   * @generated */
  public FSList getAnswerList() {
    if (Entity_Type.featOkTst && ((Entity_Type)jcasType).casFeat_AnswerList == null)
      jcasType.jcas.throwFeatMissing("AnswerList", "Model.Entity");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Entity_Type)jcasType).casFeatCode_AnswerList)));}
    
  /** setter for AnswerList - sets  
   * @generated */
  public void setAnswerList(FSList v) {
    if (Entity_Type.featOkTst && ((Entity_Type)jcasType).casFeat_AnswerList == null)
      jcasType.jcas.throwFeatMissing("AnswerList", "Model.Entity");
    jcasType.ll_cas.ll_setRefValue(addr, ((Entity_Type)jcasType).casFeatCode_AnswerList, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: Meta

  /** getter for Meta - gets 
   * @generated */
  public MetaData getMeta() {
    if (Entity_Type.featOkTst && ((Entity_Type)jcasType).casFeat_Meta == null)
      jcasType.jcas.throwFeatMissing("Meta", "Model.Entity");
    return (MetaData)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Entity_Type)jcasType).casFeatCode_Meta)));}
    
  /** setter for Meta - sets  
   * @generated */
  public void setMeta(MetaData v) {
    if (Entity_Type.featOkTst && ((Entity_Type)jcasType).casFeat_Meta == null)
      jcasType.jcas.throwFeatMissing("Meta", "Model.Entity");
    jcasType.ll_cas.ll_setRefValue(addr, ((Entity_Type)jcasType).casFeatCode_Meta, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    