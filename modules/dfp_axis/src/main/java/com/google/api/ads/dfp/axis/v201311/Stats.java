/**
 * Stats.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201311;


/**
 * {@code Stats} contains trafficking statistics for {@link LineItem}
 * and
 *             {@link LineItemCreativeAssociation} objects
 */
public class Stats  implements java.io.Serializable {
    /* The number of impressions delivered. */
    private java.lang.Long impressionsDelivered;

    /* The number of clicks delivered. */
    private java.lang.Long clicksDelivered;

    /* The number of video completions delivered. */
    private java.lang.Long videoCompletionsDelivered;

    /* The number of video starts delivered. */
    private java.lang.Long videoStartsDelivered;

    public Stats() {
    }

    public Stats(
           java.lang.Long impressionsDelivered,
           java.lang.Long clicksDelivered,
           java.lang.Long videoCompletionsDelivered,
           java.lang.Long videoStartsDelivered) {
           this.impressionsDelivered = impressionsDelivered;
           this.clicksDelivered = clicksDelivered;
           this.videoCompletionsDelivered = videoCompletionsDelivered;
           this.videoStartsDelivered = videoStartsDelivered;
    }


    /**
     * Gets the impressionsDelivered value for this Stats.
     * 
     * @return impressionsDelivered   * The number of impressions delivered.
     */
    public java.lang.Long getImpressionsDelivered() {
        return impressionsDelivered;
    }


    /**
     * Sets the impressionsDelivered value for this Stats.
     * 
     * @param impressionsDelivered   * The number of impressions delivered.
     */
    public void setImpressionsDelivered(java.lang.Long impressionsDelivered) {
        this.impressionsDelivered = impressionsDelivered;
    }


    /**
     * Gets the clicksDelivered value for this Stats.
     * 
     * @return clicksDelivered   * The number of clicks delivered.
     */
    public java.lang.Long getClicksDelivered() {
        return clicksDelivered;
    }


    /**
     * Sets the clicksDelivered value for this Stats.
     * 
     * @param clicksDelivered   * The number of clicks delivered.
     */
    public void setClicksDelivered(java.lang.Long clicksDelivered) {
        this.clicksDelivered = clicksDelivered;
    }


    /**
     * Gets the videoCompletionsDelivered value for this Stats.
     * 
     * @return videoCompletionsDelivered   * The number of video completions delivered.
     */
    public java.lang.Long getVideoCompletionsDelivered() {
        return videoCompletionsDelivered;
    }


    /**
     * Sets the videoCompletionsDelivered value for this Stats.
     * 
     * @param videoCompletionsDelivered   * The number of video completions delivered.
     */
    public void setVideoCompletionsDelivered(java.lang.Long videoCompletionsDelivered) {
        this.videoCompletionsDelivered = videoCompletionsDelivered;
    }


    /**
     * Gets the videoStartsDelivered value for this Stats.
     * 
     * @return videoStartsDelivered   * The number of video starts delivered.
     */
    public java.lang.Long getVideoStartsDelivered() {
        return videoStartsDelivered;
    }


    /**
     * Sets the videoStartsDelivered value for this Stats.
     * 
     * @param videoStartsDelivered   * The number of video starts delivered.
     */
    public void setVideoStartsDelivered(java.lang.Long videoStartsDelivered) {
        this.videoStartsDelivered = videoStartsDelivered;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Stats)) return false;
        Stats other = (Stats) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.impressionsDelivered==null && other.getImpressionsDelivered()==null) || 
             (this.impressionsDelivered!=null &&
              this.impressionsDelivered.equals(other.getImpressionsDelivered()))) &&
            ((this.clicksDelivered==null && other.getClicksDelivered()==null) || 
             (this.clicksDelivered!=null &&
              this.clicksDelivered.equals(other.getClicksDelivered()))) &&
            ((this.videoCompletionsDelivered==null && other.getVideoCompletionsDelivered()==null) || 
             (this.videoCompletionsDelivered!=null &&
              this.videoCompletionsDelivered.equals(other.getVideoCompletionsDelivered()))) &&
            ((this.videoStartsDelivered==null && other.getVideoStartsDelivered()==null) || 
             (this.videoStartsDelivered!=null &&
              this.videoStartsDelivered.equals(other.getVideoStartsDelivered())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getImpressionsDelivered() != null) {
            _hashCode += getImpressionsDelivered().hashCode();
        }
        if (getClicksDelivered() != null) {
            _hashCode += getClicksDelivered().hashCode();
        }
        if (getVideoCompletionsDelivered() != null) {
            _hashCode += getVideoCompletionsDelivered().hashCode();
        }
        if (getVideoStartsDelivered() != null) {
            _hashCode += getVideoStartsDelivered().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Stats.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "Stats"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impressionsDelivered");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "impressionsDelivered"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clicksDelivered");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "clicksDelivered"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("videoCompletionsDelivered");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "videoCompletionsDelivered"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("videoStartsDelivered");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "videoStartsDelivered"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
