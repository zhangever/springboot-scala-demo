package com.github.ever.action


import collection.JavaConverters._
import wangzx.scala_commons.sql.BeanBuilder._
import com.github.ever.BgSql
import com.github.ever.pojo.TParameter

/**
  * Created by ever on 2017/8/27.
  */
class ListAllParameters {
  def action: java.util.List[TParameter] = {
    val parameterDos = BgSql.listAllParameters()
//    parameterDos.map(parameter=>build[TParameter](parameter))
    List.empty.asJavamit
  }
}
