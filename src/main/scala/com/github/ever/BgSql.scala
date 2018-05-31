package com.github.ever

import javax.sql.DataSource

import com.github.ever.config.BgDbResource
import com.github.ever.domain.{TParameter}
import wangzx.scala_commons.sql._
import wangzx.scala_commons.sql.BeanBuilder.build

/**
  * Created by ever on 2017/8/27.
  */
object BgSql {
  val dataSource: DataSource = BgDbResource.localDbDataSource

  def listAllParameters(): List[TParameter] = {
    val sql =
      sql"""
                  SELECT * FROM t_parameter
              """
    dataSource.rows[TParameter](sql)
  }
}
