package com.wutsi.user.dto

import kotlin.Boolean
import kotlin.Long
import kotlin.String

public data class UserSummary(
  public val id: Long = -1,
  public val siteId: Long = 1,
  public val name: String = "",
  public val email: String? = null,
  public val fullName: String = "",
  public val pictureUrl: String? = null,
  public val language: String? = null,
  public val testUser: Boolean = false,
  public val followerCount: Long = 0,
  public val subscriberCount: Long = 0
)
