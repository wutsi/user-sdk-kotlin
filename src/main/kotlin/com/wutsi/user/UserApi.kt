package com.wutsi.user

import com.wutsi.user.dto.GetUserResponse
import feign.Param
import feign.RequestLine
import kotlin.Long

public interface UserApi {
  @RequestLine("GET /v1/users/{id}")
  public fun `get`(@Param("id") id: Long): GetUserResponse
}
