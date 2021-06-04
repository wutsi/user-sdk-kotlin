package com.wutsi.user

import com.fasterxml.jackson.databind.ObjectMapper
import feign.Request
import feign.RequestInterceptor
import feign.Retryer
import kotlin.collections.List

public class UserApiBuilder {
  public fun build(
    env: Environment,
    mapper: ObjectMapper,
    interceptors: List<RequestInterceptor> = emptyList(),
    options: Request.Options = Request.Options(),
    retryer: Retryer = Retryer.Default()
  ) = feign.Feign.builder()
    .client(feign.okhttp.OkHttpClient())
    .encoder(feign.jackson.JacksonEncoder(mapper))
    .decoder(feign.jackson.JacksonDecoder(mapper))
    .logger(feign.slf4j.Slf4jLogger(UserApi::class.java))
    .logLevel(feign.Logger.Level.BASIC)
    .requestInterceptors(interceptors)
    .options(options)
    .retryer(retryer)
    .target(UserApi::class.java, env.url)
}
