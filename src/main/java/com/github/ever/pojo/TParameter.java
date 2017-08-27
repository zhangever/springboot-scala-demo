package com.github.ever.pojo;
  /**
  * @author auto-tool
  */public class TParameter {
   /**
   * 
   */
   int id;

   /**
   * 系统参数编码
   */
   String code;

   /**
   * 系统参数值
   */
   String value;

   /**
   * 状态,0:无效(invalid);1:有效(valid)
   */
   int status;

   /**
   * 备注
   */
   String remark;

   public int getId() {
    return id;
   }

   public void setId(int id) {
    this.id = id;
   }

   public String getCode() {
    return code;
   }

   public void setCode(String code) {
    this.code = code;
   }

   public String getValue() {
    return value;
   }

   public void setValue(String value) {
    this.value = value;
   }

   public int getStatus() {
    return status;
   }

   public void setStatus(int status) {
    this.status = status;
   }

   public String getRemark() {
    return remark;
   }

   public void setRemark(String remark) {
    this.remark = remark;
   }
  }
