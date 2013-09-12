

/* First created by JCasGen Wed Sep 11 19:05:22 EDT 2013 */
package Model;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import General.MetaData;
import org.apache.uima.jcas.tcas.Annotation;


/** This represents a uni-gram which has one token fields and a metadata field
 * Updated by JCasGen Wed Sep 11 19:05:22 EDT 2013
 * XML source: /home/kartik/git/hw1-kartikgo/hw1-kartikgo/src/main/resources/hw1-kartikgo-typesystem.xml
 * @generated */
public class Unigram extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Unigram.class);
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
  protected Unigram() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Unigram(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Unigram(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Unigram(JCas jcas, int begin, int end) {
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
  //* Feature: Token1

  /** getter for Token1 - gets 
   * @generated */
  public Token getToken1() {
    if (Unigram_Type.featOkTst && ((Unigram_Type)jcasType).casFeat_Token1 == null)
      jcasType.jcas.throwFeatMissing("Token1", "Model.Unigram");
    return (Token)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Unigram_Type)jcasType).casFeatCode_Token1)));}
    
  /** setter for Token1 - sets  
   * @generated */
  public void setToken1(Token v) {
    if (Unigram_Type.featOkTst && ((Unigram_Type)jcasType).casFeat_Token1 == null)
      jcasType.jcas.throwFeatMissing("Token1", "Model.Unigram");
    jcasType.ll_cas.ll_setRefValue(addr, ((Unigram_Type)jcasType).casFeatCode_Token1, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: Meta

  /** getter for Meta - gets 
   * @generated */
  public MetaData getMeta() {
    if (Unigram_Type.featOkTst && ((Unigram_Type)jcasType).casFeat_Meta == null)
      jcasType.jcas.throwFeatMissing("Meta", "Model.Unigram");
    return (MetaData)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Unigram_Type)jcasType).casFeatCode_Meta)));}
    
  /** setter for Meta - sets  
   * @generated */
  public void setMeta(MetaData v) {
    if (Unigram_Type.featOkTst && ((Unigram_Type)jcasType).casFeat_Meta == null)
      jcasType.jcas.throwFeatMissing("Meta", "Model.Unigram");
    jcasType.ll_cas.ll_setRefValue(addr, ((Unigram_Type)jcasType).casFeatCode_Meta, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    