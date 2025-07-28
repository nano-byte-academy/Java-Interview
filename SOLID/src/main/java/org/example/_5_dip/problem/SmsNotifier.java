package org.example._5_dip.problem;

// Low‑level detail: sends SMS via a specific provider
public class SmsNotifier implements Notifiable{
    @Override
    public void sendNotification() {
        System.out.println("Sending SMS notification...");
    }
}
