/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sevenet.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author lszydlow
 */
@Entity
@Table(name = "EGPL_CASEMGMT_CUSTOMER")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EgplCasemgmtCustomer.findAll", query = "SELECT e FROM EgplCasemgmtCustomer e")
    , @NamedQuery(name = "EgplCasemgmtCustomer.findByCustomerId", query = "SELECT e FROM EgplCasemgmtCustomer e WHERE e.customerId = :customerId")
    , @NamedQuery(name = "EgplCasemgmtCustomer.findByCustomerType", query = "SELECT e FROM EgplCasemgmtCustomer e WHERE e.customerType = :customerType")
    , @NamedQuery(name = "EgplCasemgmtCustomer.findByCustomerRole", query = "SELECT e FROM EgplCasemgmtCustomer e WHERE e.customerRole = :customerRole")
    , @NamedQuery(name = "EgplCasemgmtCustomer.findByReferredBy", query = "SELECT e FROM EgplCasemgmtCustomer e WHERE e.referredBy = :referredBy")
    , @NamedQuery(name = "EgplCasemgmtCustomer.findByClassification", query = "SELECT e FROM EgplCasemgmtCustomer e WHERE e.classification = :classification")
    , @NamedQuery(name = "EgplCasemgmtCustomer.findByPinInfo", query = "SELECT e FROM EgplCasemgmtCustomer e WHERE e.pinInfo = :pinInfo")
    , @NamedQuery(name = "EgplCasemgmtCustomer.findByHowCreated", query = "SELECT e FROM EgplCasemgmtCustomer e WHERE e.howCreated = :howCreated")
    , @NamedQuery(name = "EgplCasemgmtCustomer.findByWhoCreated", query = "SELECT e FROM EgplCasemgmtCustomer e WHERE e.whoCreated = :whoCreated")
    , @NamedQuery(name = "EgplCasemgmtCustomer.findByWhenCreated", query = "SELECT e FROM EgplCasemgmtCustomer e WHERE e.whenCreated = :whenCreated")
    , @NamedQuery(name = "EgplCasemgmtCustomer.findByHowReferred", query = "SELECT e FROM EgplCasemgmtCustomer e WHERE e.howReferred = :howReferred")
    , @NamedQuery(name = "EgplCasemgmtCustomer.findByIndustry", query = "SELECT e FROM EgplCasemgmtCustomer e WHERE e.industry = :industry")
    , @NamedQuery(name = "EgplCasemgmtCustomer.findByMktgSeg", query = "SELECT e FROM EgplCasemgmtCustomer e WHERE e.mktgSeg = :mktgSeg")
    , @NamedQuery(name = "EgplCasemgmtCustomer.findByRole", query = "SELECT e FROM EgplCasemgmtCustomer e WHERE e.role = :role")
    , @NamedQuery(name = "EgplCasemgmtCustomer.findBySla", query = "SELECT e FROM EgplCasemgmtCustomer e WHERE e.sla = :sla")
    , @NamedQuery(name = "EgplCasemgmtCustomer.findByEntitlements", query = "SELECT e FROM EgplCasemgmtCustomer e WHERE e.entitlements = :entitlements")
    , @NamedQuery(name = "EgplCasemgmtCustomer.findByPreferedAgentId", query = "SELECT e FROM EgplCasemgmtCustomer e WHERE e.preferedAgentId = :preferedAgentId")
    , @NamedQuery(name = "EgplCasemgmtCustomer.findByDepartmentId", query = "SELECT e FROM EgplCasemgmtCustomer e WHERE e.departmentId = :departmentId")
    , @NamedQuery(name = "EgplCasemgmtCustomer.findByDeleteFlag", query = "SELECT e FROM EgplCasemgmtCustomer e WHERE e.deleteFlag = :deleteFlag")
    , @NamedQuery(name = "EgplCasemgmtCustomer.findByArchiveFlag", query = "SELECT e FROM EgplCasemgmtCustomer e WHERE e.archiveFlag = :archiveFlag")
    , @NamedQuery(name = "EgplCasemgmtCustomer.findByCreateDate", query = "SELECT e FROM EgplCasemgmtCustomer e WHERE e.createDate = :createDate")
    , @NamedQuery(name = "EgplCasemgmtCustomer.findByWhenModified", query = "SELECT e FROM EgplCasemgmtCustomer e WHERE e.whenModified = :whenModified")})
public class EgplCasemgmtCustomer implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "CUSTOMER_ID")
    private BigDecimal customerId;
    @Basic(optional = false)
    @Column(name = "CUSTOMER_TYPE")
    private String customerType;
    @Column(name = "CUSTOMER_ROLE")
    private String customerRole;
    @Column(name = "REFERRED_BY")
    private BigInteger referredBy;
    @Column(name = "CLASSIFICATION")
    private String classification;
    @Column(name = "PIN_INFO")
    private String pinInfo;
    @Column(name = "HOW_CREATED")
    private Short howCreated;
    @Basic(optional = false)
    @Column(name = "WHO_CREATED")
    private BigInteger whoCreated;
    @Basic(optional = false)
    @Column(name = "WHEN_CREATED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date whenCreated;
    @Column(name = "HOW_REFERRED")
    private String howReferred;
    @Column(name = "INDUSTRY")
    private String industry;
    @Column(name = "MKTG_SEG")
    private String mktgSeg;
    @Column(name = "ROLE")
    private BigInteger role;
    @Column(name = "SLA")
    private String sla;
    @Column(name = "ENTITLEMENTS")
    private String entitlements;
    @Column(name = "PREFERED_AGENT_ID")
    private BigInteger preferedAgentId;
    @Column(name = "DEPARTMENT_ID")
    private BigInteger departmentId;
    @Basic(optional = false)
    @Column(name = "DELETE_FLAG")
    private String deleteFlag;
    @Column(name = "ARCHIVE_FLAG")
    private Short archiveFlag;
    @Basic(optional = false)
    @Column(name = "CREATE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
    @Basic(optional = false)
    //@Lob
    @Column(name = "UPDATE_VERSION")
    private byte[] updateVersion;
    @Basic(optional = false)
    @Column(name = "WHEN_MODIFIED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date whenModified;
    @OneToMany(mappedBy = "customerId")
    private Collection<EgplCasemgmtContactPerson> egplCasemgmtContactPersonCollection;

    public EgplCasemgmtCustomer() {
    }

    public EgplCasemgmtCustomer(BigDecimal customerId) {
        this.customerId = customerId;
    }

    public EgplCasemgmtCustomer(BigDecimal customerId, String customerType, BigInteger whoCreated, Date whenCreated, String deleteFlag, Date createDate, byte[] updateVersion, Date whenModified) {
        this.customerId = customerId;
        this.customerType = customerType;
        this.whoCreated = whoCreated;
        this.whenCreated = whenCreated;
        this.deleteFlag = deleteFlag;
        this.createDate = createDate;
        this.updateVersion = updateVersion;
        this.whenModified = whenModified;
    }

    public BigDecimal getCustomerId() {
        return customerId;
    }

    public void setCustomerId(BigDecimal customerId) {
        this.customerId = customerId;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getCustomerRole() {
        return customerRole;
    }

    public void setCustomerRole(String customerRole) {
        this.customerRole = customerRole;
    }

    public BigInteger getReferredBy() {
        return referredBy;
    }

    public void setReferredBy(BigInteger referredBy) {
        this.referredBy = referredBy;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getPinInfo() {
        return pinInfo;
    }

    public void setPinInfo(String pinInfo) {
        this.pinInfo = pinInfo;
    }

    public Short getHowCreated() {
        return howCreated;
    }

    public void setHowCreated(Short howCreated) {
        this.howCreated = howCreated;
    }

    public BigInteger getWhoCreated() {
        return whoCreated;
    }

    public void setWhoCreated(BigInteger whoCreated) {
        this.whoCreated = whoCreated;
    }

    public Date getWhenCreated() {
        return whenCreated;
    }

    public void setWhenCreated(Date whenCreated) {
        this.whenCreated = whenCreated;
    }

    public String getHowReferred() {
        return howReferred;
    }

    public void setHowReferred(String howReferred) {
        this.howReferred = howReferred;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getMktgSeg() {
        return mktgSeg;
    }

    public void setMktgSeg(String mktgSeg) {
        this.mktgSeg = mktgSeg;
    }

    public BigInteger getRole() {
        return role;
    }

    public void setRole(BigInteger role) {
        this.role = role;
    }

    public String getSla() {
        return sla;
    }

    public void setSla(String sla) {
        this.sla = sla;
    }

    public String getEntitlements() {
        return entitlements;
    }

    public void setEntitlements(String entitlements) {
        this.entitlements = entitlements;
    }

    public BigInteger getPreferedAgentId() {
        return preferedAgentId;
    }

    public void setPreferedAgentId(BigInteger preferedAgentId) {
        this.preferedAgentId = preferedAgentId;
    }

    public BigInteger getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(BigInteger departmentId) {
        this.departmentId = departmentId;
    }

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Short getArchiveFlag() {
        return archiveFlag;
    }

    public void setArchiveFlag(Short archiveFlag) {
        this.archiveFlag = archiveFlag;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public byte[] getUpdateVersion() {
        return updateVersion;
    }

    public void setUpdateVersion(byte[] updateVersion) {
        this.updateVersion = updateVersion;
    }

    public Date getWhenModified() {
        return whenModified;
    }

    public void setWhenModified(Date whenModified) {
        this.whenModified = whenModified;
    }

    @XmlTransient
    public Collection<EgplCasemgmtContactPerson> getEgplCasemgmtContactPersonCollection() {
        return egplCasemgmtContactPersonCollection;
    }

    public void setEgplCasemgmtContactPersonCollection(Collection<EgplCasemgmtContactPerson> egplCasemgmtContactPersonCollection) {
        this.egplCasemgmtContactPersonCollection = egplCasemgmtContactPersonCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (customerId != null ? customerId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EgplCasemgmtCustomer)) {
            return false;
        }
        EgplCasemgmtCustomer other = (EgplCasemgmtCustomer) object;
        if ((this.customerId == null && other.customerId != null) || (this.customerId != null && !this.customerId.equals(other.customerId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sevenet.model.EgplCasemgmtCustomer[ customerId=" + customerId + " ]";
    }
    
}
