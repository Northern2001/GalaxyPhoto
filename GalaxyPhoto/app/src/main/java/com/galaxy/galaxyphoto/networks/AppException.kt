package com.galaxy.galaxyphoto.networks


open class AppException(
    override val message: String = "",
    override val cause: Throwable = Throwable(""),
    val code: Int = 0,
) : Throwable(message, cause)

class AnUnKnownException(
    cause: Throwable = Throwable("")
) : AppException("AnUnKnownException", cause)

class NoNetworkException(
    message: String = "",
    cause: Throwable = Throwable("")
) : AppException(message, cause)

class AccountInvalidException(
    message: String = "",
    cause: Throwable = Throwable("")
) : AppException(message, cause)

class LoginIncorrectException(
    message: String = "",
    cause: Throwable = Throwable("")
) : AppException(message, cause)

class ErrorPerMissionChatGroupException(
    message: String = "",
    cause: Throwable = Throwable("")
) : AppException(message, cause)

class NeedLoadDBException(
    message: String = "",
    cause: Throwable = Throwable("")
) : AppException(message, cause)

