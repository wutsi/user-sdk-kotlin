package com.wutsi.user

import kotlin.String

public enum class Environment(
  public val url: String
) {
  SANDBOX("https://int-com-wutsi-blog.herokuapp.com"),
  PRODUCTION("https://com-wutsi-blog.herokuapp.com"),
  ;
}
