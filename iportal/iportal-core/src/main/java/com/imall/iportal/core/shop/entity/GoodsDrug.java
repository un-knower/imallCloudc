
package com.imall.iportal.core.shop.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import com.imall.commons.base.entity.BaseEntity;
import com.imall.commons.base.util.DateTimeUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import java.math.BigDecimal;
import java.text.ParseException;

/**
 * 实体类
 * @author by imall core generator
 * @version 1.0.0
 */
@Entity
@Table(name = "t_shp_goods_drug" )
public class GoodsDrug extends BaseEntity<Long>{

	public static final String GOODS_ID = "goodsId";
	public static final String APPROVAL_NUMBER = "approvalNumber";
	public static final String APPROVAL_NUMBER_TERM = "approvalNumberTerm";
	public static final String IS_IMPORT_GOODS = "isImportGoods";
	public static final String IS_CHINESE_MEDICINE_PROTECT = "isChineseMedicineProtect";
	public static final String APPROVE_DATE = "approveDate";
	public static final String DOSAGE_FORM = "dosageForm";
	public static final String PRESCRIPTION_DRUGS_TYPE_CODE = "prescriptionDrugsTypeCode";
	public static final String IS_EPHEDRINE = "isEphedrine";
	public static final String IS_KEY_CURING = "isKeyCuring";
	public static final String IS_MEDICAL_INSURANCE_GOODS = "isMedicalInsuranceGoods";
	public static final String MEDICAL_INSURANCE_NUM = "medicalInsuranceNum";

    /** GOODS_ID - 商品 ID */
    @Column(name = "GOODS_ID", unique = false, nullable = false, insertable = true, updatable = true, length = 19)
    private java.lang.Long goodsId;
    /** APPROVAL_NUMBER - 批准文号 */
    @Column(name = "APPROVAL_NUMBER", unique = false, nullable = false, insertable = true, updatable = true, length = 64)
    private java.lang.String approvalNumber;
    /** APPROVAL_NUMBER_TERM - 批准文号 期限 */
    @Column(name = "APPROVAL_NUMBER_TERM", unique = false, nullable = false, insertable = true, updatable = true, length = 0)
    private java.util.Date approvalNumberTerm;
    /** IS_IMPORT_GOODS - 是否 进口 商品 */
    @Column(name = "IS_IMPORT_GOODS", unique = false, nullable = false, insertable = true, updatable = true, length = 1)
    private java.lang.String isImportGoods;
    /** IS_CHINESE_MEDICINE_PROTECT - 是否 中药 保护 */
    @Column(name = "IS_CHINESE_MEDICINE_PROTECT", unique = false, nullable = false, insertable = true, updatable = true, length = 1)
    private java.lang.String isChineseMedicineProtect;
    /** APPROVE_DATE - 批准 日期 */
    @Column(name = "APPROVE_DATE", unique = false, nullable = true, insertable = true, updatable = true, length = 0)
    private java.util.Date approveDate;
    /** DOSAGE_FORM - 剂型 */
    @Column(name = "DOSAGE_FORM", unique = false, nullable = false, insertable = true, updatable = true, length = 64)
    private java.lang.String dosageForm;
    /** PRESCRIPTION_DRUGS_TYPE_CODE - 处方药 类型 代码 */
    @Column(name = "PRESCRIPTION_DRUGS_TYPE_CODE", unique = false, nullable = false, insertable = true, updatable = true, length = 32)
    private java.lang.String prescriptionDrugsTypeCode;
    /** IS_EPHEDRINE - 是否 麻黄碱 */
    @Column(name = "IS_EPHEDRINE", unique = false, nullable = false, insertable = true, updatable = true, length = 1)
    private java.lang.String isEphedrine;
    /** IS_KEY_CURING - 是否 重点 养护 */
    @Column(name = "IS_KEY_CURING", unique = false, nullable = false, insertable = true, updatable = true, length = 1)
    private java.lang.String isKeyCuring;
    /** IS_MEDICAL_INSURANCE_GOODS - 是否 医保 商品 */
    @Column(name = "IS_MEDICAL_INSURANCE_GOODS", unique = false, nullable = false, insertable = true, updatable = true, length = 1)
    private java.lang.String isMedicalInsuranceGoods;
    /** MEDICAL_INSURANCE_NUM - 医保 号码 */
    @Column(name = "MEDICAL_INSURANCE_NUM", unique = false, nullable = true, insertable = true, updatable = true, length = 32)
    private java.lang.String medicalInsuranceNum;

    public void setGoodsId(java.lang.Long value) {
		this.goodsId = value;
	}

    public java.lang.Long getGoodsId() {
		return this.goodsId;
	}

    public void setApprovalNumber(java.lang.String value) {
		this.approvalNumber = value;
	}

    public java.lang.String getApprovalNumber() {
		return this.approvalNumber;
	}

    public void setApprovalNumberTerm(java.util.Date value) {
		this.approvalNumberTerm = value;
	}

    public java.util.Date getApprovalNumberTerm() {
		return this.approvalNumberTerm;
	}

    public void setIsImportGoods(java.lang.String value) {
		this.isImportGoods = value;
	}

    public java.lang.String getIsImportGoods() {
		return this.isImportGoods;
	}

    public void setIsChineseMedicineProtect(java.lang.String value) {
		this.isChineseMedicineProtect = value;
	}

    public java.lang.String getIsChineseMedicineProtect() {
		return this.isChineseMedicineProtect;
	}

    public void setApproveDate(java.util.Date value) {
		this.approveDate = value;
	}

    public java.util.Date getApproveDate() {
		return this.approveDate;
	}

    public void setDosageForm(java.lang.String value) {
		this.dosageForm = value;
	}

    public java.lang.String getDosageForm() {
		return this.dosageForm;
	}

    public void setPrescriptionDrugsTypeCode(java.lang.String value) {
		this.prescriptionDrugsTypeCode = value;
	}

    public java.lang.String getPrescriptionDrugsTypeCode() {
		return this.prescriptionDrugsTypeCode;
	}

    public void setIsEphedrine(java.lang.String value) {
		this.isEphedrine = value;
	}

    public java.lang.String getIsEphedrine() {
		return this.isEphedrine;
	}

    public void setIsKeyCuring(java.lang.String value) {
		this.isKeyCuring = value;
	}

    public java.lang.String getIsKeyCuring() {
		return this.isKeyCuring;
	}

    public void setIsMedicalInsuranceGoods(java.lang.String value) {
		this.isMedicalInsuranceGoods = value;
	}

    public java.lang.String getIsMedicalInsuranceGoods() {
		return this.isMedicalInsuranceGoods;
	}

    public void setMedicalInsuranceNum(java.lang.String value) {
		this.medicalInsuranceNum = value;
	}

    public java.lang.String getMedicalInsuranceNum() {
		return this.medicalInsuranceNum;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("ID",getId())
			.append("GOODS_ID",getGoodsId())
			.append("APPROVAL_NUMBER",getApprovalNumber())
			.append("APPROVAL_NUMBER_TERM",getApprovalNumberTerm())
			.append("IS_IMPORT_GOODS",getIsImportGoods())
			.append("IS_CHINESE_MEDICINE_PROTECT",getIsChineseMedicineProtect())
			.append("APPROVE_DATE",getApproveDate())
			.append("DOSAGE_FORM",getDosageForm())
			.append("PRESCRIPTION_DRUGS_TYPE_CODE",getPrescriptionDrugsTypeCode())
			.append("IS_EPHEDRINE",getIsEphedrine())
			.append("IS_KEY_CURING",getIsKeyCuring())
			.append("IS_MEDICAL_INSURANCE_GOODS",getIsMedicalInsuranceGoods())
			.append("MEDICAL_INSURANCE_NUM",getMedicalInsuranceNum())
			.append("CREATE_DATE",getCreateDate())
			.append("CREATE_BY",getCreateBy())
			.append("LAST_MODIFIED_DATE",getLastModifiedDate())
			.append("LAST_MODIFIED_BY",getLastModifiedBy())
			.append("VERSION",getVersion())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(this.getId() == null){
			return false;
		}
		if(!(obj instanceof GoodsDrug)){
			return false;
		}
		if(this == obj) {
			return true;
		}
		GoodsDrug other = (GoodsDrug)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}

	public String getApprovalNumberTermString() {
		return DateTimeUtils.convertDateToString(getApprovalNumberTerm());
	}
	public void setApprovalNumberTermString(String value) throws ParseException {
		setApprovalNumberTerm(StringUtils.isBlank(value)?null:DateTimeUtils.convertStringToDate(value));
	}

	public String getApproveDateString() {
		return DateTimeUtils.convertDateToString(getApproveDate());
	}
	public void setApproveDateString(String value) throws ParseException {
		setApproveDate(StringUtils.isBlank(value)?null:DateTimeUtils.convertStringToDate(value));
	}
}

