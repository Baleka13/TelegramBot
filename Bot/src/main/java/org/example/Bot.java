package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.GetFile;
import org.telegram.telegrambots.meta.api.methods.send.SendAudio;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.*;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Comparator;
import java.util.List;


public class Bot extends TelegramLongPollingBot {


    @Override
    public String getBotUsername() {
        return "BalekaBot";
    }

    @Override
    public String getBotToken() {
        return "5824425758:AAHmOeTVyxdYLFo_y9r2ZUtVfVAcwhs2YQU";
    }

    @Override
    public void onUpdateReceived(Update update) {

        Message message = update.getMessage();
        System.out.println(message.getText());

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setText("Ты пишешь слово  " + message.getText());

        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }


    }
}
