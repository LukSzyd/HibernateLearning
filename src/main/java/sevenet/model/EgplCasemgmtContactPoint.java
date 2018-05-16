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
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
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
@Table(name = "EGPL_CASEMGMT_CONTACT_POINT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EgplCasemgmtContactPoint.findAll", query = "SELECT e FROM EgplCasemgmtContactPoint e")
    , @NamedQuery(name = "EgplCasemgmtContactPoint.findByContactPointId", query = "SELECT e FROM EgplCasemgmtContactPoint e WHERE e.contactPointId = :contactPointId")
    , @NamedQuery(name = "EgplCasemgmtContactPoint.findByContactPointType", query = "SELECT e FROM EgplCasemgmtContactPoint e WHERE e.contactPointType = :contactPointType")
    , @NamedQuery(name = "EgplCasemgmtContactPoint.findByCustomerId", query = "SELECT e FROM EgplCasemgmtContactPoint e WHERE e.customerId = :customerId")
    , @NamedQuery(name = "EgplCasemgmtContactPoint.findByPriority", query = "SELECT e FROM EgplCasemgmtContactPoint e WHERE e.priority = :priority")
    , @NamedQuery(name = "EgplCasemgmtContactPoint.findByStartDate", query = "SELECT e FROM EgplCasemgmtContactPoint e WHERE e.startDate = :startDate")
    , @NamedQuery(name = "EgplCasemgmtContactPoint.findByEndDate", query = "SELECT e FROM EgplCasemgmtContactPoint e WHERE e.endDate = :endDate")
    , @NamedQuery(name = "EgplCasemgmtContactPoint.findByDeleteFlag", query = "SELECT e FROM EgplCasemgmtContactPoint e WHERE e.deleteFlag = :deleteFlag")
    , @NamedQuery(name = "EgplCasemgmtContactPoint.findByDepartmentId", query = "SELECT e FROM EgplCasemgmtContactPoint e WHERE e.departmentId = :departmentId")
    , @NamedQuery(name = "EgplCasemgmtContactPoint.findByCreateDate", query = "SELECT e FROM EgplCasemgmtContactPoint e WHERE e.createDate = :createDate")})
public class EgplCasemgmtContactPoint implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "CONTACT_POINT_ID")
    private BigDecimal contactPointId;
    @Column(name = "CONTACT_POINT_TYPE")
    private String contactPointType;
    @Column(name = "CUSTOMER_ID")
    private BigInteger customerId;
    @Column(name = "PRIORITY")
    private String priority;
    @Column(name = "START_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startDate;
    @Column(name = "END_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date endDate;
    @Basic(optional = false)
    @Column(name = "DELETE_FLAG")
    private String deleteFlag;
    @Column(name = "DEPARTMENT_ID")
    private BigInteger departmentId;
    @Basic(optional = false)
    @Column(name = "CREATE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
    @Basic(optional = false)
    //@Lob
    @Column(name = "UPDATE_VERSION")
    private byte[] updateVersion;
    @JoinColumn(name = "CONTACT_PERSON_ID", referencedColumnName = "CONTACT_PERSON_ID")
    @ManyToOne
    private EgplCasemgmtContactPerson contactPersonId;
    @OneToMany(mappedBy = "contactPointId")
    private Collection<EgplCasemgmtActivity> egplCasemgmtActivityCollection;

    public EgplCasemgmtContactPoint() {
    }

    public EgplCasemgmtContactPoint(BigDecimal contactPointId) {
        this.contactPointId = contactPointId;
    }

    public EgplCasemgmtContactPoint(BigDecimal contactPointId, String deleteFlag, Date createDate, byte[] updateVersion) {
        this.contactPointId = contactPointId;
        this.deleteFlag = deleteFlag;
        this.createDate = createDate;
        this.updateVersion = updateVersion;
    }

    public BigDecimal getContactPointId() {
        return contactPointId;
    }

    public void setContactPointId(BigDecimal contactPointId) {
        this.contactPointId = contactPointId;
    }

    public String getContactPointType() {
        return contactPointType;
    }

    public void setContactPointType(String contactPointType) {
        this.contactPointType = contactPointType;
    }

    public BigInteger getCustomerId() {
        return customerId;
    }

    public void setCustomerId(BigInteger customerId) {
        this.customerId = customerId;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public BigInteger getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(BigInteger departmentId) {
        this.departmentId = departmentId;
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

    public EgplCasemgmtContactPerson getContactPersonId() {
        return contactPersonId;
    }

    public void setContactPersonId(EgplCasemgmtContactPerson contactPersonId) {
        this.contactPersonId = contactPersonId;
    }

    @XmlTransient
    public Collection<EgplCasemgmtActivity> getEgplCasemgmtActivityCollection() {
        return egplCasemgmtActivityCollection;
    }

    public void setEgplCasemgmtActivityCollection(Collection<EgplCasemgmtActivity> egplCasemgmtActivityCollection) {
        this.egplCasemgmtActivityCollection = egplCasemgmtActivityCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (contactPointId != null ? contactPointId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EgplCasemgmtContactPoint)) {
            return false;
        }
        EgplCasemgmtContactPoint other = (EgplCasemgmtContactPoint) object;
        if ((this.contactPointId == null && other.contactPointId != null) || (this.contactPointId != null && !this.contactPointId.equals(other.contactPointId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sevenet.model.EgplCasemgmtContactPoint[ contactPointId=" + contactPointId + " ]";
    }
    
}
