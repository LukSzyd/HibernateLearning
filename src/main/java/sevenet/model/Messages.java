/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sevenet.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "messages")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Messages.findAll", query = "SELECT m FROM Messages m")
    , @NamedQuery(name = "Messages.findById", query = "SELECT m FROM Messages m WHERE m.id = :id")
    , @NamedQuery(name = "Messages.findByUsrId", query = "SELECT m FROM Messages m WHERE m.usrId = :usrId")
    , @NamedQuery(name = "Messages.findByPmsId", query = "SELECT m FROM Messages m WHERE m.pmsId = :pmsId")
    , @NamedQuery(name = "Messages.findByThrId", query = "SELECT m FROM Messages m WHERE m.thrId = :thrId")
    , @NamedQuery(name = "Messages.findByTopic", query = "SELECT m FROM Messages m WHERE m.topic = :topic")
    , @NamedQuery(name = "Messages.findByText", query = "SELECT m FROM Messages m WHERE m.text = :text")
    , @NamedQuery(name = "Messages.findByLogin", query = "SELECT m FROM Messages m WHERE m.login = :login")
    , @NamedQuery(name = "Messages.findByEqNumber", query = "SELECT m FROM Messages m WHERE m.eqNumber = :eqNumber")
    , @NamedQuery(name = "Messages.findByCreateDate", query = "SELECT m FROM Messages m WHERE m.createDate = :createDate")
    , @NamedQuery(name = "Messages.findByCreateDateDb", query = "SELECT m FROM Messages m WHERE m.createDateDb = :createDateDb")
    , @NamedQuery(name = "Messages.findBySendDate", query = "SELECT m FROM Messages m WHERE m.sendDate = :sendDate")
    , @NamedQuery(name = "Messages.findByStatus", query = "SELECT m FROM Messages m WHERE m.status = :status")
    , @NamedQuery(name = "Messages.findByEimThrId", query = "SELECT m FROM Messages m WHERE m.eimThrId = :eimThrId")
    , @NamedQuery(name = "Messages.findBySystem", query = "SELECT m FROM Messages m WHERE m.system = :system")
    , @NamedQuery(name = "Messages.findByWorker", query = "SELECT m FROM Messages m WHERE m.worker = :worker")
    , @NamedQuery(name = "Messages.findByResend", query = "SELECT m FROM Messages m WHERE m.resend = :resend")
    , @NamedQuery(name = "Messages.findByUpdateDateDb", query = "SELECT m FROM Messages m WHERE m.updateDateDb = :updateDateDb")})
public class Messages implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Column(name = "usr_id")
    private String usrId;
    @Column(name = "pms_id")
    private String pmsId;
    @Column(name = "thr_id")
    private String thrId;
    @Column(name = "topic")
    private String topic;
    @Column(name = "text")
    private String text;
    @Column(name = "login")
    private String login;
    @Column(name = "eq_number")
    private String eqNumber;
    @Column(name = "create_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
    @Column(name = "create_date_db")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDateDb;
    @Column(name = "send_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date sendDate;
    @Column(name = "status")
    private String status;
    @Column(name = "eim_thr_id")
    private String eimThrId;
    @Column(name = "system")
    private String system;
    @Column(name = "worker")
    private String worker;
    @Column(name = "resend")
    private String resend;
    @Column(name = "update_date_db")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateDateDb;

    public Messages() {
    }

    public Messages(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsrId() {
        return usrId;
    }

    public void setUsrId(String usrId) {
        this.usrId = usrId;
    }

    public String getPmsId() {
        return pmsId;
    }

    public void setPmsId(String pmsId) {
        this.pmsId = pmsId;
    }

    public String getThrId() {
        return thrId;
    }

    public void setThrId(String thrId) {
        this.thrId = thrId;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEqNumber() {
        return eqNumber;
    }

    public void setEqNumber(String eqNumber) {
        this.eqNumber = eqNumber;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getCreateDateDb() {
        return createDateDb;
    }

    public void setCreateDateDb(Date createDateDb) {
        this.createDateDb = createDateDb;
    }

    public Date getSendDate() {
        return sendDate;
    }

    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEimThrId() {
        return eimThrId;
    }

    public void setEimThrId(String eimThrId) {
        this.eimThrId = eimThrId;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public String getWorker() {
        return worker;
    }

    public void setWorker(String worker) {
        this.worker = worker;
    }

    public String getResend() {
        return resend;
    }

    public void setResend(String resend) {
        this.resend = resend;
    }

    public Date getUpdateDateDb() {
        return updateDateDb;
    }

    public void setUpdateDateDb(Date updateDateDb) {
        this.updateDateDb = updateDateDb;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Messages)) {
            return false;
        }
        Messages other = (Messages) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sevenet.model.Messages[ topic=" + topic + " ]";
    }
    
}
