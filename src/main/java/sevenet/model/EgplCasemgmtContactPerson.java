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
@Table(name = "EGPL_CASEMGMT_CONTACT_PERSON")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EgplCasemgmtContactPerson.findAll", query = "SELECT e FROM EgplCasemgmtContactPerson e")
    , @NamedQuery(name = "EgplCasemgmtContactPerson.findByContactPersonId", query = "SELECT e FROM EgplCasemgmtContactPerson e WHERE e.contactPersonId = :contactPersonId")
    , @NamedQuery(name = "EgplCasemgmtContactPerson.findByContactPersonType", query = "SELECT e FROM EgplCasemgmtContactPerson e WHERE e.contactPersonType = :contactPersonType")
    , @NamedQuery(name = "EgplCasemgmtContactPerson.findBySalutation", query = "SELECT e FROM EgplCasemgmtContactPerson e WHERE e.salutation = :salutation")
    , @NamedQuery(name = "EgplCasemgmtContactPerson.findByFirstName", query = "SELECT e FROM EgplCasemgmtContactPerson e WHERE e.firstName = :firstName")
    , @NamedQuery(name = "EgplCasemgmtContactPerson.findByFirstNameFurigana", query = "SELECT e FROM EgplCasemgmtContactPerson e WHERE e.firstNameFurigana = :firstNameFurigana")
    , @NamedQuery(name = "EgplCasemgmtContactPerson.findByLastName", query = "SELECT e FROM EgplCasemgmtContactPerson e WHERE e.lastName = :lastName")
    , @NamedQuery(name = "EgplCasemgmtContactPerson.findByLastNameFurigana", query = "SELECT e FROM EgplCasemgmtContactPerson e WHERE e.lastNameFurigana = :lastNameFurigana")
    , @NamedQuery(name = "EgplCasemgmtContactPerson.findByMiddleName", query = "SELECT e FROM EgplCasemgmtContactPerson e WHERE e.middleName = :middleName")
    , @NamedQuery(name = "EgplCasemgmtContactPerson.findByMiddleNameFurigana", query = "SELECT e FROM EgplCasemgmtContactPerson e WHERE e.middleNameFurigana = :middleNameFurigana")
    , @NamedQuery(name = "EgplCasemgmtContactPerson.findBySuffix", query = "SELECT e FROM EgplCasemgmtContactPerson e WHERE e.suffix = :suffix")
    , @NamedQuery(name = "EgplCasemgmtContactPerson.findByInitials", query = "SELECT e FROM EgplCasemgmtContactPerson e WHERE e.initials = :initials")
    , @NamedQuery(name = "EgplCasemgmtContactPerson.findByStartGreeting", query = "SELECT e FROM EgplCasemgmtContactPerson e WHERE e.startGreeting = :startGreeting")
    , @NamedQuery(name = "EgplCasemgmtContactPerson.findByEndGreeting", query = "SELECT e FROM EgplCasemgmtContactPerson e WHERE e.endGreeting = :endGreeting")
    , @NamedQuery(name = "EgplCasemgmtContactPerson.findByGender", query = "SELECT e FROM EgplCasemgmtContactPerson e WHERE e.gender = :gender")
    , @NamedQuery(name = "EgplCasemgmtContactPerson.findByDateOfBirth", query = "SELECT e FROM EgplCasemgmtContactPerson e WHERE e.dateOfBirth = :dateOfBirth")
    , @NamedQuery(name = "EgplCasemgmtContactPerson.findByMaritalStatus", query = "SELECT e FROM EgplCasemgmtContactPerson e WHERE e.maritalStatus = :maritalStatus")
    , @NamedQuery(name = "EgplCasemgmtContactPerson.findBySpouseName", query = "SELECT e FROM EgplCasemgmtContactPerson e WHERE e.spouseName = :spouseName")
    , @NamedQuery(name = "EgplCasemgmtContactPerson.findByEmergencyContact", query = "SELECT e FROM EgplCasemgmtContactPerson e WHERE e.emergencyContact = :emergencyContact")
    , @NamedQuery(name = "EgplCasemgmtContactPerson.findByPriority", query = "SELECT e FROM EgplCasemgmtContactPerson e WHERE e.priority = :priority")
    , @NamedQuery(name = "EgplCasemgmtContactPerson.findByDefaultContactPerson", query = "SELECT e FROM EgplCasemgmtContactPerson e WHERE e.defaultContactPerson = :defaultContactPerson")
    , @NamedQuery(name = "EgplCasemgmtContactPerson.findByDeleteFlag", query = "SELECT e FROM EgplCasemgmtContactPerson e WHERE e.deleteFlag = :deleteFlag")
    , @NamedQuery(name = "EgplCasemgmtContactPerson.findByIdType", query = "SELECT e FROM EgplCasemgmtContactPerson e WHERE e.idType = :idType")
    , @NamedQuery(name = "EgplCasemgmtContactPerson.findByIdValue", query = "SELECT e FROM EgplCasemgmtContactPerson e WHERE e.idValue = :idValue")
    , @NamedQuery(name = "EgplCasemgmtContactPerson.findByCreateDate", query = "SELECT e FROM EgplCasemgmtContactPerson e WHERE e.createDate = :createDate")})
public class EgplCasemgmtContactPerson implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "CONTACT_PERSON_ID")
    private BigDecimal contactPersonId;
    @Column(name = "CONTACT_PERSON_TYPE")
    private String contactPersonType;
    @Column(name = "SALUTATION")
    private String salutation;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "FIRST_NAME_FURIGANA")
    private String firstNameFurigana;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "LAST_NAME_FURIGANA")
    private String lastNameFurigana;
    @Column(name = "MIDDLE_NAME")
    private String middleName;
    @Column(name = "MIDDLE_NAME_FURIGANA")
    private String middleNameFurigana;
    @Column(name = "SUFFIX")
    private String suffix;
    @Column(name = "INITIALS")
    private String initials;
    @Column(name = "START_GREETING")
    private String startGreeting;
    @Column(name = "END_GREETING")
    private String endGreeting;
    @Column(name = "GENDER")
    private String gender;
    @Column(name = "DATE_OF_BIRTH")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateOfBirth;
    @Column(name = "MARITAL_STATUS")
    private String maritalStatus;
    @Column(name = "SPOUSE_NAME")
    private String spouseName;
    @Column(name = "EMERGENCY_CONTACT")
    private String emergencyContact;
    @Column(name = "PRIORITY")
    private String priority;
    @Column(name = "DEFAULT_CONTACT_PERSON")
    private BigInteger defaultContactPerson;
    @Basic(optional = false)
    @Column(name = "DELETE_FLAG")
    private String deleteFlag;
    @Column(name = "ID_TYPE")
    private String idType;
    @Column(name = "ID_VALUE")
    private String idValue;
    @Basic(optional = false)
    @Column(name = "CREATE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
    @Basic(optional = false)
    //@Lob
    @Column(name = "UPDATE_VERSION")
    private byte[] updateVersion;
    @JoinColumn(name = "CUSTOMER_ID", referencedColumnName = "CUSTOMER_ID")
    @ManyToOne
    private EgplCasemgmtCustomer customerId;
    @OneToMany(mappedBy = "contactPersonId")
    private Collection<EgplCasemgmtContactPoint> egplCasemgmtContactPointCollection;

    public EgplCasemgmtContactPerson() {
    }

    public EgplCasemgmtContactPerson(BigDecimal contactPersonId) {
        this.contactPersonId = contactPersonId;
    }

    public EgplCasemgmtContactPerson(BigDecimal contactPersonId, String deleteFlag, Date createDate, byte[] updateVersion) {
        this.contactPersonId = contactPersonId;
        this.deleteFlag = deleteFlag;
        this.createDate = createDate;
        this.updateVersion = updateVersion;
    }

    public BigDecimal getContactPersonId() {
        return contactPersonId;
    }

    public void setContactPersonId(BigDecimal contactPersonId) {
        this.contactPersonId = contactPersonId;
    }

    public String getContactPersonType() {
        return contactPersonType;
    }

    public void setContactPersonType(String contactPersonType) {
        this.contactPersonType = contactPersonType;
    }

    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstNameFurigana() {
        return firstNameFurigana;
    }

    public void setFirstNameFurigana(String firstNameFurigana) {
        this.firstNameFurigana = firstNameFurigana;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastNameFurigana() {
        return lastNameFurigana;
    }

    public void setLastNameFurigana(String lastNameFurigana) {
        this.lastNameFurigana = lastNameFurigana;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getMiddleNameFurigana() {
        return middleNameFurigana;
    }

    public void setMiddleNameFurigana(String middleNameFurigana) {
        this.middleNameFurigana = middleNameFurigana;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public String getStartGreeting() {
        return startGreeting;
    }

    public void setStartGreeting(String startGreeting) {
        this.startGreeting = startGreeting;
    }

    public String getEndGreeting() {
        return endGreeting;
    }

    public void setEndGreeting(String endGreeting) {
        this.endGreeting = endGreeting;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getSpouseName() {
        return spouseName;
    }

    public void setSpouseName(String spouseName) {
        this.spouseName = spouseName;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public BigInteger getDefaultContactPerson() {
        return defaultContactPerson;
    }

    public void setDefaultContactPerson(BigInteger defaultContactPerson) {
        this.defaultContactPerson = defaultContactPerson;
    }

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getIdValue() {
        return idValue;
    }

    public void setIdValue(String idValue) {
        this.idValue = idValue;
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

    public EgplCasemgmtCustomer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(EgplCasemgmtCustomer customerId) {
        this.customerId = customerId;
    }

    @XmlTransient
    public Collection<EgplCasemgmtContactPoint> getEgplCasemgmtContactPointCollection() {
        return egplCasemgmtContactPointCollection;
    }

    public void setEgplCasemgmtContactPointCollection(Collection<EgplCasemgmtContactPoint> egplCasemgmtContactPointCollection) {
        this.egplCasemgmtContactPointCollection = egplCasemgmtContactPointCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (contactPersonId != null ? contactPersonId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EgplCasemgmtContactPerson)) {
            return false;
        }
        EgplCasemgmtContactPerson other = (EgplCasemgmtContactPerson) object;
        if ((this.contactPersonId == null && other.contactPersonId != null) || (this.contactPersonId != null && !this.contactPersonId.equals(other.contactPersonId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sevenet.model.EgplCasemgmtContactPerson[ contactPersonId=" + contactPersonId + " ]";
    }
    
}
