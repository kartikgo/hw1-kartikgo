

/* First created by JCasGen Wed Sep 11 19:05:22 EDT 2013 */
package Model;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import General.MetaData;
import org.apache.uima.jcas.cas.FSList;
import org.apache.uima.jcas.tcas.Annotation;


/** This represents a sentence containing tokens, N-grams and metadata. It is a feature of Question and Answer.
 * Updated by JCasGen Wed Sep 11 19:05:22 EDT 2013
 * XML source: /home/kartik/git/hw1-kartikgo/hw1-kartikgo/src/main/resources/hw1-kartikgo-typesystem.xml
 * @generated */
public class Sentence extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Sentence.class);
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
  protected Sentence() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Sentence(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Sentence(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Sentence(JCas jcas, int begin, int end) {
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
  //* Feature: TokenList

  /** getter for TokenList - gets 
   * @generated */
  public FSList getTokenList() {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_TokenList == null)
      jcasType.jcas.throwFeatMissing("TokenList", "Model.Sentence");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_TokenList)));}
    
  /** setter for TokenList - sets  
   * @generated */
  public void setTokenList(FSList v) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_TokenList == null)
      jcasType.jcas.throwFeatMissing("TokenList", "Model.Sentence");
    jcasType.ll_cas.ll_setRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_TokenList, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: UniGrams

  /** getter for UniGrams - gets 
   * @generated */
  public FSList getUniGrams() {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_UniGrams == null)
      jcasType.jcas.throwFeatMissing("UniGrams", "Model.Sentence");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_UniGrams)));}
    
  /** setter for UniGrams - sets  
   * @generated */
  public void setUniGrams(FSList v) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_UniGrams == null)
      jcasType.jcas.throwFeatMissing("UniGrams", "Model.Sentence");
    jcasType.ll_cas.ll_setRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_UniGrams, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: BiGrams

  /** getter for BiGrams - gets 
   * @generated */
  public FSList getBiGrams() {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_BiGrams == null)
      jcasType.jcas.throwFeatMissing("BiGrams", "Model.Sentence");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_BiGrams)));}
    
  /** setter for BiGrams - sets  
   * @generated */
  public void setBiGrams(FSList v) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_BiGrams == null)
      jcasType.jcas.throwFeatMissing("BiGrams", "Model.Sentence");
    jcasType.ll_cas.ll_setRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_BiGrams, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: Trigrams

  /** getter for Trigrams - gets 
   * @generated */
  public FSList getTrigrams() {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_Trigrams == null)
      jcasType.jcas.throwFeatMissing("Trigrams", "Model.Sentence");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_Trigrams)));}
    
  /** setter for Trigrams - sets  
   * @generated */
  public void setTrigrams(FSList v) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_Trigrams == null)
      jcasType.jcas.throwFeatMissing("Trigrams", "Model.Sentence");
    jcasType.ll_cas.ll_setRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_Trigrams, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: Meta

  /** getter for Meta - gets 
   * @generated */
  public MetaData getMeta() {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_Meta == null)
      jcasType.jcas.throwFeatMissing("Meta", "Model.Sentence");
    return (MetaData)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_Meta)));}
    
  /** setter for Meta - sets  
   * @generated */
  public void setMeta(MetaData v) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_Meta == null)
      jcasType.jcas.throwFeatMissing("Meta", "Model.Sentence");
    jcasType.ll_cas.ll_setRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_Meta, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    