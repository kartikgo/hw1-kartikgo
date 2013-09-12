

/* First created by JCasGen Wed Sep 11 19:05:22 EDT 2013 */
package Model;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import General.MetaData;
import org.apache.uima.jcas.tcas.Annotation;


/** This represents a token which has a surface 'word' form and a part of speech tag. It also has a metadata field
 * Updated by JCasGen Wed Sep 11 19:05:22 EDT 2013
 * XML source: /home/kartik/git/hw1-kartikgo/hw1-kartikgo/src/main/resources/hw1-kartikgo-typesystem.xml
 * @generated */
public class Token extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Token.class);
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
  protected Token() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Token(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Token(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Token(JCas jcas, int begin, int end) {
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
  //* Feature: Word

  /** getter for Word - gets 
   * @generated */
  public String getWord() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_Word == null)
      jcasType.jcas.throwFeatMissing("Word", "Model.Token");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Token_Type)jcasType).casFeatCode_Word);}
    
  /** setter for Word - sets  
   * @generated */
  public void setWord(String v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_Word == null)
      jcasType.jcas.throwFeatMissing("Word", "Model.Token");
    jcasType.ll_cas.ll_setStringValue(addr, ((Token_Type)jcasType).casFeatCode_Word, v);}    
   
    
  //*--------------*
  //* Feature: POS

  /** getter for POS - gets 
   * @generated */
  public String getPOS() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_POS == null)
      jcasType.jcas.throwFeatMissing("POS", "Model.Token");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Token_Type)jcasType).casFeatCode_POS);}
    
  /** setter for POS - sets  
   * @generated */
  public void setPOS(String v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_POS == null)
      jcasType.jcas.throwFeatMissing("POS", "Model.Token");
    jcasType.ll_cas.ll_setStringValue(addr, ((Token_Type)jcasType).casFeatCode_POS, v);}    
   
    
  //*--------------*
  //* Feature: Meta

  /** getter for Meta - gets 
   * @generated */
  public MetaData getMeta() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_Meta == null)
      jcasType.jcas.throwFeatMissing("Meta", "Model.Token");
    return (MetaData)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Token_Type)jcasType).casFeatCode_Meta)));}
    
  /** setter for Meta - sets  
   * @generated */
  public void setMeta(MetaData v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_Meta == null)
      jcasType.jcas.throwFeatMissing("Meta", "Model.Token");
    jcasType.ll_cas.ll_setRefValue(addr, ((Token_Type)jcasType).casFeatCode_Meta, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    