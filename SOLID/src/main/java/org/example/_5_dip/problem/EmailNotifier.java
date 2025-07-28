package org.example._5_dip.problem;

// Low‑level detail: sends Email via a specific provider
public class EmailNotifier implements Notifiable{
    @Override
    public void sendNotification() {
        System.out.println("Sending Email notification...");
    }
}
