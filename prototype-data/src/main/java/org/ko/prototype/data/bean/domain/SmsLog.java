package org.ko.prototype.data.bean.domain;

import java.io.Serializable;
import java.util.Date;

public class SmsLog extends AbstractDomain implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_sms_log.id
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_sms_log.mobile
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private String mobile;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_sms_log.flow_type
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private Short flowType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_sms_log.start_time
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private Date startTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_sms_log.end_time
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private Date endTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_sms_log.cost
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private Integer cost;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_sms_log.status_code
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private String statusCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_sms_log.retry_count
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private Short retryCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_sms_log.error_message
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private String errorMessage;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_sms_log.trace_code
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private String traceCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_sms_log.host_name
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private String hostName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_sms_log.create_user_id
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private Integer createUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_sms_log.create_by
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private String createBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_sms_log.create_date
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_sms_log.update_user_id
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private Integer updateUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_sms_log.update_by
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private String updateBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_sms_log.update_date
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private Date updateDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_sms_log.input
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private String input;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_sms_log.output
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private String output;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table art_sms_log
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_sms_log.id
     *
     * @return the value of art_sms_log.id
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_sms_log.id
     *
     * @param id the value for art_sms_log.id
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_sms_log.mobile
     *
     * @return the value of art_sms_log.mobile
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_sms_log.mobile
     *
     * @param mobile the value for art_sms_log.mobile
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_sms_log.flow_type
     *
     * @return the value of art_sms_log.flow_type
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public Short getFlowType() {
        return flowType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_sms_log.flow_type
     *
     * @param flowType the value for art_sms_log.flow_type
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setFlowType(Short flowType) {
        this.flowType = flowType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_sms_log.start_time
     *
     * @return the value of art_sms_log.start_time
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_sms_log.start_time
     *
     * @param startTime the value for art_sms_log.start_time
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_sms_log.end_time
     *
     * @return the value of art_sms_log.end_time
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_sms_log.end_time
     *
     * @param endTime the value for art_sms_log.end_time
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_sms_log.cost
     *
     * @return the value of art_sms_log.cost
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public Integer getCost() {
        return cost;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_sms_log.cost
     *
     * @param cost the value for art_sms_log.cost
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setCost(Integer cost) {
        this.cost = cost;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_sms_log.status_code
     *
     * @return the value of art_sms_log.status_code
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_sms_log.status_code
     *
     * @param statusCode the value for art_sms_log.status_code
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode == null ? null : statusCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_sms_log.retry_count
     *
     * @return the value of art_sms_log.retry_count
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public Short getRetryCount() {
        return retryCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_sms_log.retry_count
     *
     * @param retryCount the value for art_sms_log.retry_count
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setRetryCount(Short retryCount) {
        this.retryCount = retryCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_sms_log.error_message
     *
     * @return the value of art_sms_log.error_message
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_sms_log.error_message
     *
     * @param errorMessage the value for art_sms_log.error_message
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage == null ? null : errorMessage.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_sms_log.trace_code
     *
     * @return the value of art_sms_log.trace_code
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public String getTraceCode() {
        return traceCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_sms_log.trace_code
     *
     * @param traceCode the value for art_sms_log.trace_code
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setTraceCode(String traceCode) {
        this.traceCode = traceCode == null ? null : traceCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_sms_log.host_name
     *
     * @return the value of art_sms_log.host_name
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public String getHostName() {
        return hostName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_sms_log.host_name
     *
     * @param hostName the value for art_sms_log.host_name
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setHostName(String hostName) {
        this.hostName = hostName == null ? null : hostName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_sms_log.create_user_id
     *
     * @return the value of art_sms_log.create_user_id
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public Integer getCreateUserId() {
        return createUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_sms_log.create_user_id
     *
     * @param createUserId the value for art_sms_log.create_user_id
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_sms_log.create_by
     *
     * @return the value of art_sms_log.create_by
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_sms_log.create_by
     *
     * @param createBy the value for art_sms_log.create_by
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_sms_log.create_date
     *
     * @return the value of art_sms_log.create_date
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_sms_log.create_date
     *
     * @param createDate the value for art_sms_log.create_date
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_sms_log.update_user_id
     *
     * @return the value of art_sms_log.update_user_id
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public Integer getUpdateUserId() {
        return updateUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_sms_log.update_user_id
     *
     * @param updateUserId the value for art_sms_log.update_user_id
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setUpdateUserId(Integer updateUserId) {
        this.updateUserId = updateUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_sms_log.update_by
     *
     * @return the value of art_sms_log.update_by
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_sms_log.update_by
     *
     * @param updateBy the value for art_sms_log.update_by
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_sms_log.update_date
     *
     * @return the value of art_sms_log.update_date
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_sms_log.update_date
     *
     * @param updateDate the value for art_sms_log.update_date
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_sms_log.input
     *
     * @return the value of art_sms_log.input
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public String getInput() {
        return input;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_sms_log.input
     *
     * @param input the value for art_sms_log.input
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setInput(String input) {
        this.input = input == null ? null : input.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_sms_log.output
     *
     * @return the value of art_sms_log.output
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public String getOutput() {
        return output;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_sms_log.output
     *
     * @param output the value for art_sms_log.output
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setOutput(String output) {
        this.output = output == null ? null : output.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table art_sms_log
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", mobile=").append(mobile);
        sb.append(", flowType=").append(flowType);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", cost=").append(cost);
        sb.append(", statusCode=").append(statusCode);
        sb.append(", retryCount=").append(retryCount);
        sb.append(", errorMessage=").append(errorMessage);
        sb.append(", traceCode=").append(traceCode);
        sb.append(", hostName=").append(hostName);
        sb.append(", createUserId=").append(createUserId);
        sb.append(", createBy=").append(createBy);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateUserId=").append(updateUserId);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", input=").append(input);
        sb.append(", output=").append(output);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table art_sms_log
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        SmsLog other = (SmsLog) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
            && (this.getFlowType() == null ? other.getFlowType() == null : this.getFlowType().equals(other.getFlowType()))
            && (this.getStartTime() == null ? other.getStartTime() == null : this.getStartTime().equals(other.getStartTime()))
            && (this.getEndTime() == null ? other.getEndTime() == null : this.getEndTime().equals(other.getEndTime()))
            && (this.getCost() == null ? other.getCost() == null : this.getCost().equals(other.getCost()))
            && (this.getStatusCode() == null ? other.getStatusCode() == null : this.getStatusCode().equals(other.getStatusCode()))
            && (this.getRetryCount() == null ? other.getRetryCount() == null : this.getRetryCount().equals(other.getRetryCount()))
            && (this.getErrorMessage() == null ? other.getErrorMessage() == null : this.getErrorMessage().equals(other.getErrorMessage()))
            && (this.getTraceCode() == null ? other.getTraceCode() == null : this.getTraceCode().equals(other.getTraceCode()))
            && (this.getHostName() == null ? other.getHostName() == null : this.getHostName().equals(other.getHostName()))
            && (this.getCreateUserId() == null ? other.getCreateUserId() == null : this.getCreateUserId().equals(other.getCreateUserId()))
            && (this.getCreateBy() == null ? other.getCreateBy() == null : this.getCreateBy().equals(other.getCreateBy()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getUpdateUserId() == null ? other.getUpdateUserId() == null : this.getUpdateUserId().equals(other.getUpdateUserId()))
            && (this.getUpdateBy() == null ? other.getUpdateBy() == null : this.getUpdateBy().equals(other.getUpdateBy()))
            && (this.getUpdateDate() == null ? other.getUpdateDate() == null : this.getUpdateDate().equals(other.getUpdateDate()))
            && (this.getInput() == null ? other.getInput() == null : this.getInput().equals(other.getInput()))
            && (this.getOutput() == null ? other.getOutput() == null : this.getOutput().equals(other.getOutput()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table art_sms_log
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getFlowType() == null) ? 0 : getFlowType().hashCode());
        result = prime * result + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        result = prime * result + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        result = prime * result + ((getCost() == null) ? 0 : getCost().hashCode());
        result = prime * result + ((getStatusCode() == null) ? 0 : getStatusCode().hashCode());
        result = prime * result + ((getRetryCount() == null) ? 0 : getRetryCount().hashCode());
        result = prime * result + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        result = prime * result + ((getTraceCode() == null) ? 0 : getTraceCode().hashCode());
        result = prime * result + ((getHostName() == null) ? 0 : getHostName().hashCode());
        result = prime * result + ((getCreateUserId() == null) ? 0 : getCreateUserId().hashCode());
        result = prime * result + ((getCreateBy() == null) ? 0 : getCreateBy().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getUpdateUserId() == null) ? 0 : getUpdateUserId().hashCode());
        result = prime * result + ((getUpdateBy() == null) ? 0 : getUpdateBy().hashCode());
        result = prime * result + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
        result = prime * result + ((getInput() == null) ? 0 : getInput().hashCode());
        result = prime * result + ((getOutput() == null) ? 0 : getOutput().hashCode());
        return result;
    }
}