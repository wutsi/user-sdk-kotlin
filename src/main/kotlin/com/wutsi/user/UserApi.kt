package com.wutsi.user

import com.wutsi.user.dto.GetUserResponse
import com.wutsi.user.dto.SaveWalletRequest
import com.wutsi.user.dto.SearchFollowerResponse
import com.wutsi.user.dto.SearchUserResponse
import feign.Headers
import feign.Param
import feign.RequestLine
import kotlin.Boolean
import kotlin.Int
import kotlin.Long

public interface UserApi {
  @RequestLine("GET /v1/users?blog={blog}&limit={limit}&offset={offset}")
  @Headers("Content-Type: application/json")
  public fun search(
    @Param("blog") blog: Boolean? = null,
    @Param("limit") limit: Int = 20,
    @Param("offset") offset: Int = 0
  ): SearchUserResponse

  @RequestLine("POST /v1/users/{id}/wallet")
  @Headers("Content-Type: application/json")
  public fun wallet(@Param("id") id: Long, request: SaveWalletRequest): GetUserResponse

  @RequestLine("GET /v1/users/{id}/followers?follower-user-id={follower-user-id}&limit={limit}&offset={offset}")
  @Headers("Content-Type: application/json")
  public fun followers(
    @Param("id") id: Long,
    @Param("follower-user-id") followerUserId: Long? = null,
    @Param("limit") limit: Int = 20,
    @Param("offset") offset: Int = 0
  ): SearchFollowerResponse
}
