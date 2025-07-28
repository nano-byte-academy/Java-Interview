package org.example._5_dip.solution;

// 2. Low‑level SMS implementation
public class SmsNotifier implements Notifiable {
    @Override
    public void sendNotification() {
        System.out.println("Sending SMS notification...");
    }
}
