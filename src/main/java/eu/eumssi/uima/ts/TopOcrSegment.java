

/* First created by JCasGen Mon Jul 06 16:25:03 CEST 2015 */
package eu.eumssi.uima.ts;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Mon Jul 06 18:45:35 CEST 2015
 * XML source: /home/jgrivolla/GitHub/EUMSSI-UIMA/uima-ts/src/main/resources/eu/eumssi/uima/ts/media.xml
 * @generated */
public class TopOcrSegment extends OcrSegment {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TopOcrSegment.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected TopOcrSegment() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public TopOcrSegment(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public TopOcrSegment(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public TopOcrSegment(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
  //*--------------*
  //* Feature: confidenceRatio

  /** getter for confidenceRatio - gets 
   * @generated
   * @return value of the feature 
   */
  public double getConfidenceRatio() {
    if (TopOcrSegment_Type.featOkTst && ((TopOcrSegment_Type)jcasType).casFeat_confidenceRatio == null)
      jcasType.jcas.throwFeatMissing("confidenceRatio", "eu.eumssi.uima.ts.TopOcrSegment");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((TopOcrSegment_Type)jcasType).casFeatCode_confidenceRatio);}
    
  /** setter for confidenceRatio - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setConfidenceRatio(double v) {
    if (TopOcrSegment_Type.featOkTst && ((TopOcrSegment_Type)jcasType).casFeat_confidenceRatio == null)
      jcasType.jcas.throwFeatMissing("confidenceRatio", "eu.eumssi.uima.ts.TopOcrSegment");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((TopOcrSegment_Type)jcasType).casFeatCode_confidenceRatio, v);}    
  }

    