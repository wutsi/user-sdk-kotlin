package com.wutsi.user.dto

import kotlin.Long

public data class Follower(
  public val userId: Long = 0,
  public val followerUserId: Long = 0
)
