package com.wutsi.user.dto

import kotlin.Long
import kotlin.String

public data class User(
  public val id: Long = 0,
  public val name: String = "",
  public val email: String? = null,
  public val fullName: String = "",
  public val pictureUrl: String = "",
  public val language: String = ""
)
