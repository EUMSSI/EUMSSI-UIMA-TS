
/* First created by JCasGen Mon Jul 06 16:25:03 CEST 2015 */
package eu.eumssi.uima.ts;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;

import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** 
 * Updated by JCasGen Mon Jul 06 18:45:35 CEST 2015
 * @generated */
public class TopOcrSegment_Type extends OcrSegment_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (TopOcrSegment_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = TopOcrSegment_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new TopOcrSegment(addr, TopOcrSegment_Type.this);
  			   TopOcrSegment_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new TopOcrSegment(addr, TopOcrSegment_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = TopOcrSegment.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("eu.eumssi.uima.ts.TopOcrSegment");



  /** @generated */
  final Feature casFeat_confidenceRatio;
  /** @generated */
  final int     casFeatCode_confidenceRatio;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getConfidenceRatio(int addr) {
        if (featOkTst && casFeat_confidenceRatio == null)
      jcas.throwFeatMissing("confidenceRatio", "eu.eumssi.uima.ts.TopOcrSegment");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_confidenceRatio);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setConfidenceRatio(int addr, double v) {
        if (featOkTst && casFeat_confidenceRatio == null)
      jcas.throwFeatMissing("confidenceRatio", "eu.eumssi.uima.ts.TopOcrSegment");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_confidenceRatio, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public TopOcrSegment_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_confidenceRatio = jcas.getRequiredFeatureDE(casType, "confidenceRatio", "uima.cas.Double", featOkTst);
    casFeatCode_confidenceRatio  = (null == casFeat_confidenceRatio) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_confidenceRatio).getCode();

  }
}



    