package com.javaccinepassport.vaccine.passport.models

import com.fasterxml.jackson.annotation.JsonFormat
import com.fasterxml.jackson.annotation.JsonInclude
import lombok.Data
import lombok.experimental.SuperBuilder
import org.springframework.http.HttpStatus
import java.security.Timestamp
import java.time.LocalDateTime


@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
open class Response(
    protected var timestamp: LocalDateTime?,
    protected var statusCode: Int?,
    protected var httpStatus: HttpStatus?,
    @JsonInclude(JsonInclude.Include.NON_NULL)
    protected var reason: String?,

    protected var message: String?,
    protected var developerMessage: String?,
    @JsonInclude(JsonInclude.Include.NON_NULL)
    protected var data: Map<Any, Any>?
) {
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    fun getTimes(): LocalDateTime?{
        return this.timestamp
    }

    fun getStatusCodes(): Int?{
        return this.statusCode
    }

    fun getHttpStatusOut(): HttpStatus?{
        return this.httpStatus
    }

    fun getReasonOutput(): String?{
        return this.reason
    }

    fun getMessageOutput(): String?{
        return this.message
    }
    fun getDataOutput(): Map<Any, Any>?{
        return this.data
    }

}