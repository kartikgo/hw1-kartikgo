

/* First created by JCasGen Wed Sep 11 19:05:22 EDT 2013 */
package Model;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import General.MetaData;
import org.apache.uima.jcas.tcas.Annotation;


/** This represents a tri-gram which has three token fields and a metadata field
 * Updated by JCasGen Wed Sep 11 19:05:22 EDT 2013
 * XML source: /home/kartik/git/hw1-kartikgo/hw1-kartikgo/src/main/resources/hw1-kartikgo-typesystem.xml
 * @generated */
public class TriGram extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TriGram.class);
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
  protected TriGram() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public TriGram(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public TriGram(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public TriGram(JCas jcas, int begin, int end) {
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
    if (TriGram_Type.featOkTst && ((TriGram_Type)jcasType).casFeat_Token1 == null)
      jcasType.jcas.throwFeatMissing("Token1", "Model.TriGram");
    return (Token)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((TriGram_Type)jcasType).casFeatCode_Token1)));}
    
  /** setter for Token1 - sets  
   * @generated */
  public void setToken1(Token v) {
    if (TriGram_Type.featOkTst && ((TriGram_Type)jcasType).casFeat_Token1 == null)
      jcasType.jcas.throwFeatMissing("Token1", "Model.TriGram");
    jcasType.ll_cas.ll_setRefValue(addr, ((TriGram_Type)jcasType).casFeatCode_Token1, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: Token2

  /** getter for Token2 - gets 
   * @generated */
  public Token getToken2() {
    if (TriGram_Type.featOkTst && ((TriGram_Type)jcasType).casFeat_Token2 == null)
      jcasType.jcas.throwFeatMissing("Token2", "Model.TriGram");
    return (Token)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((TriGram_Type)jcasType).casFeatCode_Token2)));}
    
  /** setter for Token2 - sets  
   * @generated */
  public void setToken2(Token v) {
    if (TriGram_Type.featOkTst && ((TriGram_Type)jcasType).casFeat_Token2 == null)
      jcasType.jcas.throwFeatMissing("Token2", "Model.TriGram");
    jcasType.ll_cas.ll_setRefValue(addr, ((TriGram_Type)jcasType).casFeatCode_Token2, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: Token3

  /** getter for Token3 - gets 
   * @generated */
  public Token getToken3() {
    if (TriGram_Type.featOkTst && ((TriGram_Type)jcasType).casFeat_Token3 == null)
      jcasType.jcas.throwFeatMissing("Token3", "Model.TriGram");
    return (Token)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((TriGram_Type)jcasType).casFeatCode_Token3)));}
    
  /** setter for Token3 - sets  
   * @generated */
  public void setToken3(Token v) {
    if (TriGram_Type.featOkTst && ((TriGram_Type)jcasType).casFeat_Token3 == null)
      jcasType.jcas.throwFeatMissing("Token3", "Model.TriGram");
    jcasType.ll_cas.ll_setRefValue(addr, ((TriGram_Type)jcasType).casFeatCode_Token3, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: Meta

  /** getter for Meta - gets 
   * @generated */
  public MetaData getMeta() {
    if (TriGram_Type.featOkTst && ((TriGram_Type)jcasType).casFeat_Meta == null)
      jcasType.jcas.throwFeatMissing("Meta", "Model.TriGram");
    return (MetaData)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((TriGram_Type)jcasType).casFeatCode_Meta)));}
    
  /** setter for Meta - sets  
   * @generated */
  public void setMeta(MetaData v) {
    if (TriGram_Type.featOkTst && ((TriGram_Type)jcasType).casFeat_Meta == null)
      jcasType.jcas.throwFeatMissing("Meta", "Model.TriGram");
    jcasType.ll_cas.ll_setRefValue(addr, ((TriGram_Type)jcasType).casFeatCode_Meta, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    