package com.wutsi.user

import com.wutsi.user.dto.GetUserResponse
import com.wutsi.user.dto.SearchFollowerResponse
import com.wutsi.user.dto.SearchUserResponse
import feign.Param
import feign.RequestLine
import kotlin.Boolean
import kotlin.Int
import kotlin.Long

public interface UserApi {
  @RequestLine("GET /v1/users?blog={blog}&limit={limit}&offset={offset}")
  public fun search(
    @Param("blog") blog: Boolean? = null,
    @Param("limit") limit: Int = 20,
    @Param("offset") offset: Int = 0
  ): SearchUserResponse

  @RequestLine("GET /v1/users/{id}")
  public fun `get`(@Param("id") id: Long): GetUserResponse

  @RequestLine("GET /v1/users/{id}/followers?limit={limit}&offset={offset}")
  public fun followers(
    @Param("id") id: Long,
    @Param("limit") limit: Int = 20,
    @Param("offset") offset: Int = 0
  ): SearchFollowerResponse
}
