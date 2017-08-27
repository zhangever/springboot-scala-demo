package com.github.ever.domain

import wangzx.scala_commons.sql._
  /**
  * @author dapeng-tool
  */@Table(value = "t_parameter", camelToUnderscore = true)
class TParameter extends java.io.Serializable {
   /**
   * 
   */
  @Id(auto=true)
  var id : Int =_

   /**
   * 系统参数编码
   */
  var code : String =_

   /**
   * 系统参数值
   */
  var value : String =_

   /**
   * 状态,0:无效(invalid);1:有效(valid)
   */
  var status : Int =_

   /**
   * 备注
   */
  var remark : String =_

}
