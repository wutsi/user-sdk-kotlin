package com.wutsi.user.dto

import kotlin.collections.List

public data class SearchUserResponse(
  public val users: List<UserSummary> = emptyList()
)
