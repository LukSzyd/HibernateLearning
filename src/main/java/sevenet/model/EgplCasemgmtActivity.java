/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sevenet.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author lszydlow
 */
@Entity
@Table(name = "EGPL_CASEMGMT_ACTIVITY")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EgplCasemgmtActivity.findAll", query = "SELECT e FROM EgplCasemgmtActivity e")
    , @NamedQuery(name = "EgplCasemgmtActivity.findByActivityId", query = "SELECT e FROM EgplCasemgmtActivity e WHERE e.activityId = :activityId")
    , @NamedQuery(name = "EgplCasemgmtActivity.findByCaseId", query = "SELECT e FROM EgplCasemgmtActivity e WHERE e.caseId = :caseId")
    , @NamedQuery(name = "EgplCasemgmtActivity.findByDepartmentId", query = "SELECT e FROM EgplCasemgmtActivity e WHERE e.departmentId = :departmentId")
    , @NamedQuery(name = "EgplCasemgmtActivity.findByActivityMode", query = "SELECT e FROM EgplCasemgmtActivity e WHERE e.activityMode = :activityMode")
    , @NamedQuery(name = "EgplCasemgmtActivity.findByActivityType", query = "SELECT e FROM EgplCasemgmtActivity e WHERE e.activityType = :activityType")
    , @NamedQuery(name = "EgplCasemgmtActivity.findByActivitySubType", query = "SELECT e FROM EgplCasemgmtActivity e WHERE e.activitySubType = :activitySubType")
    , @NamedQuery(name = "EgplCasemgmtActivity.findByActivityStatus", query = "SELECT e FROM EgplCasemgmtActivity e WHERE e.activityStatus = :activityStatus")
    , @NamedQuery(name = "EgplCasemgmtActivity.findByActivitySubStatus", query = "SELECT e FROM EgplCasemgmtActivity e WHERE e.activitySubStatus = :activitySubStatus")
    , @NamedQuery(name = "EgplCasemgmtActivity.findByActivityPriority", query = "SELECT e FROM EgplCasemgmtActivity e WHERE e.activityPriority = :activityPriority")
    , @NamedQuery(name = "EgplCasemgmtActivity.findByWhenCreated", query = "SELECT e FROM EgplCasemgmtActivity e WHERE e.whenCreated = :whenCreated")
    , @NamedQuery(name = "EgplCasemgmtActivity.findByWhoCreated", query = "SELECT e FROM EgplCasemgmtActivity e WHERE e.whoCreated = :whoCreated")
    , @NamedQuery(name = "EgplCasemgmtActivity.findByWhenModified", query = "SELECT e FROM EgplCasemgmtActivity e WHERE e.whenModified = :whenModified")
    , @NamedQuery(name = "EgplCasemgmtActivity.findByDueDate", query = "SELECT e FROM EgplCasemgmtActivity e WHERE e.dueDate = :dueDate")
    , @NamedQuery(name = "EgplCasemgmtActivity.findByUserLastWorked", query = "SELECT e FROM EgplCasemgmtActivity e WHERE e.userLastWorked = :userLastWorked")
    , @NamedQuery(name = "EgplCasemgmtActivity.findByAssignedTo", query = "SELECT e FROM EgplCasemgmtActivity e WHERE e.assignedTo = :assignedTo")
    , @NamedQuery(name = "EgplCasemgmtActivity.findBySubject", query = "SELECT e FROM EgplCasemgmtActivity e WHERE e.subject = :subject")
    , @NamedQuery(name = "EgplCasemgmtActivity.findByDescription", query = "SELECT e FROM EgplCasemgmtActivity e WHERE e.description = :description")
    , @NamedQuery(name = "EgplCasemgmtActivity.findByLanguageId", query = "SELECT e FROM EgplCasemgmtActivity e WHERE e.languageId = :languageId")
    , @NamedQuery(name = "EgplCasemgmtActivity.findByCustomerId", query = "SELECT e FROM EgplCasemgmtActivity e WHERE e.customerId = :customerId")
    , @NamedQuery(name = "EgplCasemgmtActivity.findByContactPersonId", query = "SELECT e FROM EgplCasemgmtActivity e WHERE e.contactPersonId = :contactPersonId")
    , @NamedQuery(name = "EgplCasemgmtActivity.findByQueueId", query = "SELECT e FROM EgplCasemgmtActivity e WHERE e.queueId = :queueId")
    , @NamedQuery(name = "EgplCasemgmtActivity.findByContactPointData", query = "SELECT e FROM EgplCasemgmtActivity e WHERE e.contactPointData = :contactPointData")
    , @NamedQuery(name = "EgplCasemgmtActivity.findByLastActionReason", query = "SELECT e FROM EgplCasemgmtActivity e WHERE e.lastActionReason = :lastActionReason")
    , @NamedQuery(name = "EgplCasemgmtActivity.findByPinned", query = "SELECT e FROM EgplCasemgmtActivity e WHERE e.pinned = :pinned")
    , @NamedQuery(name = "EgplCasemgmtActivity.findByLocked", query = "SELECT e FROM EgplCasemgmtActivity e WHERE e.locked = :locked")
    , @NamedQuery(name = "EgplCasemgmtActivity.findByActivityAccess", query = "SELECT e FROM EgplCasemgmtActivity e WHERE e.activityAccess = :activityAccess")
    , @NamedQuery(name = "EgplCasemgmtActivity.findByFolderId", query = "SELECT e FROM EgplCasemgmtActivity e WHERE e.folderId = :folderId")
    , @NamedQuery(name = "EgplCasemgmtActivity.findByLastDepartmentId", query = "SELECT e FROM EgplCasemgmtActivity e WHERE e.lastDepartmentId = :lastDepartmentId")
    , @NamedQuery(name = "EgplCasemgmtActivity.findBySaveDraftFlag", query = "SELECT e FROM EgplCasemgmtActivity e WHERE e.saveDraftFlag = :saveDraftFlag")
    , @NamedQuery(name = "EgplCasemgmtActivity.findByLeaveOpenFlag", query = "SELECT e FROM EgplCasemgmtActivity e WHERE e.leaveOpenFlag = :leaveOpenFlag")
    , @NamedQuery(name = "EgplCasemgmtActivity.findByNumNotes", query = "SELECT e FROM EgplCasemgmtActivity e WHERE e.numNotes = :numNotes")
    , @NamedQuery(name = "EgplCasemgmtActivity.findByNumAttachments", query = "SELECT e FROM EgplCasemgmtActivity e WHERE e.numAttachments = :numAttachments")
    , @NamedQuery(name = "EgplCasemgmtActivity.findByCaseType", query = "SELECT e FROM EgplCasemgmtActivity e WHERE e.caseType = :caseType")
    , @NamedQuery(name = "EgplCasemgmtActivity.findByDeleteFlag", query = "SELECT e FROM EgplCasemgmtActivity e WHERE e.deleteFlag = :deleteFlag")
    , @NamedQuery(name = "EgplCasemgmtActivity.findByConferenceFlag", query = "SELECT e FROM EgplCasemgmtActivity e WHERE e.conferenceFlag = :conferenceFlag")
    , @NamedQuery(name = "EgplCasemgmtActivity.findByIsEscalated", query = "SELECT e FROM EgplCasemgmtActivity e WHERE e.isEscalated = :isEscalated")
    , @NamedQuery(name = "EgplCasemgmtActivity.findByCreateDate", query = "SELECT e FROM EgplCasemgmtActivity e WHERE e.createDate = :createDate")
    , @NamedQuery(name = "EgplCasemgmtActivity.findByOutboundFailed", query = "SELECT e FROM EgplCasemgmtActivity e WHERE e.outboundFailed = :outboundFailed")
    , @NamedQuery(name = "EgplCasemgmtActivity.findByVisitorSessionId", query = "SELECT e FROM EgplCasemgmtActivity e WHERE e.visitorSessionId = :visitorSessionId")
    , @NamedQuery(name = "EgplCasemgmtActivity.findByVisitorUserId", query = "SELECT e FROM EgplCasemgmtActivity e WHERE e.visitorUserId = :visitorUserId")
    , @NamedQuery(name = "EgplCasemgmtActivity.findByCustAccountId", query = "SELECT e FROM EgplCasemgmtActivity e WHERE e.custAccountId = :custAccountId")
    , @NamedQuery(name = "EgplCasemgmtActivity.findByDelayTimeInMin", query = "SELECT e FROM EgplCasemgmtActivity e WHERE e.delayTimeInMin = :delayTimeInMin")})
public class EgplCasemgmtActivity implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ACTIVITY_ID")
    private BigDecimal activityId;
    @Column(name = "CASE_ID")
    private BigInteger caseId;
    @Column(name = "DEPARTMENT_ID")
    private BigInteger departmentId;
    @Column(name = "ACTIVITY_MODE")
    private Short activityMode;
    @Basic(optional = false)
    @Column(name = "ACTIVITY_TYPE")
    private short activityType;
    @Basic(optional = false)
    @Column(name = "ACTIVITY_SUB_TYPE")
    private short activitySubType;
    @Basic(optional = false)
    @Column(name = "ACTIVITY_STATUS")
    private short activityStatus;
    @Basic(optional = false)
    @Column(name = "ACTIVITY_SUB_STATUS")
    private short activitySubStatus;
    @Column(name = "ACTIVITY_PRIORITY")
    private Short activityPriority;
    @Basic(optional = false)
    @Column(name = "WHEN_CREATED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date whenCreated;
    @Basic(optional = false)
    @Column(name = "WHO_CREATED")
    private BigInteger whoCreated;
    @Column(name = "WHEN_MODIFIED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date whenModified;
    @Column(name = "DUE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dueDate;
    @Column(name = "USER_LAST_WORKED")
    private BigInteger userLastWorked;
    @Column(name = "ASSIGNED_TO")
    private BigInteger assignedTo;
    @Column(name = "SUBJECT")
    private String subject;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "LANGUAGE_ID")
    private Short languageId;
    @Column(name = "CUSTOMER_ID")
    private BigInteger customerId;
    @Column(name = "CONTACT_PERSON_ID")
    private BigInteger contactPersonId;
    @Column(name = "QUEUE_ID")
    private BigInteger queueId;
    @Column(name = "CONTACT_POINT_DATA")
    private String contactPointData;
    @Column(name = "LAST_ACTION_REASON")
    private String lastActionReason;
    @Basic(optional = false)
    @Column(name = "PINNED")
    private String pinned;
    @Basic(optional = false)
    @Column(name = "LOCKED")
    private String locked;
    @Basic(optional = false)
    @Column(name = "ACTIVITY_ACCESS")
    private short activityAccess;
    @Column(name = "FOLDER_ID")
    private BigInteger folderId;
    @Column(name = "LAST_DEPARTMENT_ID")
    private BigInteger lastDepartmentId;
    @Basic(optional = false)
    @Column(name = "SAVE_DRAFT_FLAG")
    private short saveDraftFlag;
    @Column(name = "LEAVE_OPEN_FLAG")
    private Short leaveOpenFlag;
    @Column(name = "NUM_NOTES")
    private Short numNotes;
    @Column(name = "NUM_ATTACHMENTS")
    private Short numAttachments;
    @Column(name = "CASE_TYPE")
    private Short caseType;
    @Basic(optional = false)
    @Column(name = "DELETE_FLAG")
    private String deleteFlag;
    @Column(name = "CONFERENCE_FLAG")
    private String conferenceFlag;
    @Column(name = "IS_ESCALATED")
    private String isEscalated;
    @Basic(optional = false)
    @Column(name = "CREATE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
    @Basic(optional = false)
    //@Lob
    @Column(name = "UPDATE_VERSION")
    private byte[] updateVersion;
    @Basic(optional = false)
    @Column(name = "OUTBOUND_FAILED")
    private short outboundFailed;
    @Column(name = "VISITOR_SESSION_ID")
    private String visitorSessionId;
    @Column(name = "VISITOR_USER_ID")
    private String visitorUserId;
    @Column(name = "CUST_ACCOUNT_ID")
    private String custAccountId;
    @Column(name = "DELAY_TIME_IN_MIN")
    private BigInteger delayTimeInMin;
    @JoinColumn(name = "CONTACT_POINT_ID", referencedColumnName = "CONTACT_POINT_ID")
    @ManyToOne
    private EgplCasemgmtContactPoint contactPointId;

    public EgplCasemgmtActivity() {
    }

    public EgplCasemgmtActivity(BigDecimal activityId) {
        this.activityId = activityId;
    }

    public EgplCasemgmtActivity(BigDecimal activityId, short activityType, short activitySubType, short activityStatus, short activitySubStatus, Date whenCreated, BigInteger whoCreated, String pinned, String locked, short activityAccess, short saveDraftFlag, String deleteFlag, Date createDate, byte[] updateVersion, short outboundFailed) {
        this.activityId = activityId;
        this.activityType = activityType;
        this.activitySubType = activitySubType;
        this.activityStatus = activityStatus;
        this.activitySubStatus = activitySubStatus;
        this.whenCreated = whenCreated;
        this.whoCreated = whoCreated;
        this.pinned = pinned;
        this.locked = locked;
        this.activityAccess = activityAccess;
        this.saveDraftFlag = saveDraftFlag;
        this.deleteFlag = deleteFlag;
        this.createDate = createDate;
        this.updateVersion = updateVersion;
        this.outboundFailed = outboundFailed;
    }

    public BigDecimal getActivityId() {
        return activityId;
    }

    public void setActivityId(BigDecimal activityId) {
        this.activityId = activityId;
    }

    public BigInteger getCaseId() {
        return caseId;
    }

    public void setCaseId(BigInteger caseId) {
        this.caseId = caseId;
    }

    public BigInteger getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(BigInteger departmentId) {
        this.departmentId = departmentId;
    }

    public Short getActivityMode() {
        return activityMode;
    }

    public void setActivityMode(Short activityMode) {
        this.activityMode = activityMode;
    }

    public short getActivityType() {
        return activityType;
    }

    public void setActivityType(short activityType) {
        this.activityType = activityType;
    }

    public short getActivitySubType() {
        return activitySubType;
    }

    public void setActivitySubType(short activitySubType) {
        this.activitySubType = activitySubType;
    }

    public short getActivityStatus() {
        return activityStatus;
    }

    public void setActivityStatus(short activityStatus) {
        this.activityStatus = activityStatus;
    }

    public short getActivitySubStatus() {
        return activitySubStatus;
    }

    public void setActivitySubStatus(short activitySubStatus) {
        this.activitySubStatus = activitySubStatus;
    }

    public Short getActivityPriority() {
        return activityPriority;
    }

    public void setActivityPriority(Short activityPriority) {
        this.activityPriority = activityPriority;
    }

    public Date getWhenCreated() {
        return whenCreated;
    }

    public void setWhenCreated(Date whenCreated) {
        this.whenCreated = whenCreated;
    }

    public BigInteger getWhoCreated() {
        return whoCreated;
    }

    public void setWhoCreated(BigInteger whoCreated) {
        this.whoCreated = whoCreated;
    }

    public Date getWhenModified() {
        return whenModified;
    }

    public void setWhenModified(Date whenModified) {
        this.whenModified = whenModified;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public BigInteger getUserLastWorked() {
        return userLastWorked;
    }

    public void setUserLastWorked(BigInteger userLastWorked) {
        this.userLastWorked = userLastWorked;
    }

    public BigInteger getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(BigInteger assignedTo) {
        this.assignedTo = assignedTo;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Short getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Short languageId) {
        this.languageId = languageId;
    }

    public BigInteger getCustomerId() {
        return customerId;
    }

    public void setCustomerId(BigInteger customerId) {
        this.customerId = customerId;
    }

    public BigInteger getContactPersonId() {
        return contactPersonId;
    }

    public void setContactPersonId(BigInteger contactPersonId) {
        this.contactPersonId = contactPersonId;
    }

    public BigInteger getQueueId() {
        return queueId;
    }

    public void setQueueId(BigInteger queueId) {
        this.queueId = queueId;
    }

    public String getContactPointData() {
        return contactPointData;
    }

    public void setContactPointData(String contactPointData) {
        this.contactPointData = contactPointData;
    }

    public String getLastActionReason() {
        return lastActionReason;
    }

    public void setLastActionReason(String lastActionReason) {
        this.lastActionReason = lastActionReason;
    }

    public String getPinned() {
        return pinned;
    }

    public void setPinned(String pinned) {
        this.pinned = pinned;
    }

    public String getLocked() {
        return locked;
    }

    public void setLocked(String locked) {
        this.locked = locked;
    }

    public short getActivityAccess() {
        return activityAccess;
    }

    public void setActivityAccess(short activityAccess) {
        this.activityAccess = activityAccess;
    }

    public BigInteger getFolderId() {
        return folderId;
    }

    public void setFolderId(BigInteger folderId) {
        this.folderId = folderId;
    }

    public BigInteger getLastDepartmentId() {
        return lastDepartmentId;
    }

    public void setLastDepartmentId(BigInteger lastDepartmentId) {
        this.lastDepartmentId = lastDepartmentId;
    }

    public short getSaveDraftFlag() {
        return saveDraftFlag;
    }

    public void setSaveDraftFlag(short saveDraftFlag) {
        this.saveDraftFlag = saveDraftFlag;
    }

    public Short getLeaveOpenFlag() {
        return leaveOpenFlag;
    }

    public void setLeaveOpenFlag(Short leaveOpenFlag) {
        this.leaveOpenFlag = leaveOpenFlag;
    }

    public Short getNumNotes() {
        return numNotes;
    }

    public void setNumNotes(Short numNotes) {
        this.numNotes = numNotes;
    }

    public Short getNumAttachments() {
        return numAttachments;
    }

    public void setNumAttachments(Short numAttachments) {
        this.numAttachments = numAttachments;
    }

    public Short getCaseType() {
        return caseType;
    }

    public void setCaseType(Short caseType) {
        this.caseType = caseType;
    }

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public String getConferenceFlag() {
        return conferenceFlag;
    }

    public void setConferenceFlag(String conferenceFlag) {
        this.conferenceFlag = conferenceFlag;
    }

    public String getIsEscalated() {
        return isEscalated;
    }

    public void setIsEscalated(String isEscalated) {
        this.isEscalated = isEscalated;
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

    public short getOutboundFailed() {
        return outboundFailed;
    }

    public void setOutboundFailed(short outboundFailed) {
        this.outboundFailed = outboundFailed;
    }

    public String getVisitorSessionId() {
        return visitorSessionId;
    }

    public void setVisitorSessionId(String visitorSessionId) {
        this.visitorSessionId = visitorSessionId;
    }

    public String getVisitorUserId() {
        return visitorUserId;
    }

    public void setVisitorUserId(String visitorUserId) {
        this.visitorUserId = visitorUserId;
    }

    public String getCustAccountId() {
        return custAccountId;
    }

    public void setCustAccountId(String custAccountId) {
        this.custAccountId = custAccountId;
    }

    public BigInteger getDelayTimeInMin() {
        return delayTimeInMin;
    }

    public void setDelayTimeInMin(BigInteger delayTimeInMin) {
        this.delayTimeInMin = delayTimeInMin;
    }

    public EgplCasemgmtContactPoint getContactPointId() {
        return contactPointId;
    }

    public void setContactPointId(EgplCasemgmtContactPoint contactPointId) {
        this.contactPointId = contactPointId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (activityId != null ? activityId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EgplCasemgmtActivity)) {
            return false;
        }
        EgplCasemgmtActivity other = (EgplCasemgmtActivity) object;
        if ((this.activityId == null && other.activityId != null) || (this.activityId != null && !this.activityId.equals(other.activityId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EgplCasemgmtActivity{" + "activityId=" + activityId + ", caseId=" + caseId + ", departmentId=" + departmentId + ", activityMode=" + activityMode + ", activityType=" + activityType + ", activitySubType=" + activitySubType + ", activityStatus=" + activityStatus + ", activitySubStatus=" + activitySubStatus + ", activityPriority=" + activityPriority + ", whenCreated=" + whenCreated + ", whoCreated=" + whoCreated + ", whenModified=" + whenModified + ", dueDate=" + dueDate + ", userLastWorked=" + userLastWorked + ", assignedTo=" + assignedTo + ", subject=" + subject + ", description=" + description + ", languageId=" + languageId + ", customerId=" + customerId + ", contactPersonId=" + contactPersonId + ", queueId=" + queueId + ", contactPointData=" + contactPointData + ", lastActionReason=" + lastActionReason + ", pinned=" + pinned + ", locked=" + locked + ", activityAccess=" + activityAccess + ", folderId=" + folderId + ", lastDepartmentId=" + lastDepartmentId + ", saveDraftFlag=" + saveDraftFlag + ", leaveOpenFlag=" + leaveOpenFlag + ", numNotes=" + numNotes + ", numAttachments=" + numAttachments + ", caseType=" + caseType + ", deleteFlag=" + deleteFlag + ", conferenceFlag=" + conferenceFlag + ", isEscalated=" + isEscalated + ", createDate=" + createDate + ", updateVersion=" + updateVersion + ", outboundFailed=" + outboundFailed + ", visitorSessionId=" + visitorSessionId + ", visitorUserId=" + visitorUserId + ", custAccountId=" + custAccountId + ", delayTimeInMin=" + delayTimeInMin + ", contactPointId=" + contactPointId + '}';
    }

   
    
}
