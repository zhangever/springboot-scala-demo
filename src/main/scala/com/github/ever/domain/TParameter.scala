package com.github.ever.domain

/**
  * @author dapeng-tool
  **/
case class TParameter (
  /**
    *
    */
   id: Int,

  /**
    * 系统参数编码
    */
   code: String,

  /**
    * 系统参数值
    */
   value: String,

  /**
    * 状态,0:无效(invalid);1:有效(valid)
    */
   status: Int,

  /**
    * 备注
    */
   remark: String
                      )
