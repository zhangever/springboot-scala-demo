package com.github.ever.action

import com.isuwang.commons.converters.Implicits._
import collection.JavaConverters._
import com.github.ever.BgSql
import com.github.ever.pojo.TParameter

/**
  * Created by ever on 2017/8/27.
  */
class ListAllParameters {
  def action: java.util.List[TParameter] = {
    val parameterDos = BgSql.listAllParameters()
    parameterDos.convertToList[TParameter].asJava
  }
}
