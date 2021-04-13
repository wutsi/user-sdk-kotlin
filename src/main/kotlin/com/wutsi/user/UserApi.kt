package com.wutsi.user

import com.wutsi.user.dto.GetUserResponse
import com.wutsi.user.dto.SearchFollowerResponse
import feign.Param
import feign.RequestLine
import kotlin.Int
import kotlin.Long

public interface UserApi {
  @RequestLine("GET /v1/users/{id}")
  public fun `get`(@Param("id") id: Long): GetUserResponse

  @RequestLine("GET /v1/users/{id}/followers")
  public fun `get`(
    @Param("id") id: Long,
    @Param("limit") limit: Int,
    @Param("offset") offset: Int
  ): SearchFollowerResponse
}
