package ru.cobp.support.exception;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ExceptionMessage {

    public static final String TELEGRAM_BOTS_API_INSTANTIATION_FAILED = "Telegram bots Api instantiation failed";

    public static final String TELEGRAM_BOT_REGISTRATION_FAILED = "Telegram bot registration failed";

    public static final String TELEGRAM_BOT_SEND_MESSAGE_FAILED = "Telegram bot send message failed";

}
