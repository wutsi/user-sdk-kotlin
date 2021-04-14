package com.wutsi.user.dto

import kotlin.collections.List

public data class SearchFollowerResponse(
  public val followers: List<Follower> = emptyList()
)
