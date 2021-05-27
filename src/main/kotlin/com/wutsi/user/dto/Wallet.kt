package com.wutsi.user.dto

import kotlin.String

public data class Wallet(
  public val type: String = "",
  public val mobileNumber: String = "",
  public val mobileProvider: String = "",
  public val country: String = ""
)
