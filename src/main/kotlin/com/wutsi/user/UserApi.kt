package com.wutsi.user

import com.wutsi.user.dto.GetUserResponse
import com.wutsi.user.dto.SaveWalletRequest
import com.wutsi.user.dto.SaveWalletResponse
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
  public fun searchUsers(
    @Param("blog") blog: Boolean? = null,
    @Param("limit") limit: Int = 20,
    @Param("offset") offset: Int = 0
  ): SearchUserResponse

  @RequestLine("GET /v1/users/{id}")
  @Headers("Content-Type: application/json")
  public fun getUser(@Param("id") id: Long): GetUserResponse

  @RequestLine("POST /v1/users/{id}/wallet")
  @Headers("Content-Type: application/json")
  public fun saveWallet(@Param("id") id: Long, request: SaveWalletRequest): SaveWalletResponse

  @RequestLine("GET /v1/users/{id}/followers?follower-user-id={follower-user-id}&limit={limit}&offset={offset}")
  @Headers("Content-Type: application/json")
  public fun searchFollowers(
    @Param("id") id: Long,
    @Param("follower-user-id") followerUserId: Long? = null,
    @Param("limit") limit: Int = 20,
    @Param("offset") offset: Int = 0
  ): SearchFollowerResponse
}
