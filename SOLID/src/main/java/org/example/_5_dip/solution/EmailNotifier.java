package org.example._5_dip.solution;

// 2. Low‑level Email implementation
public class EmailNotifier implements Notifiable {
    @Override
    public void sendNotification() {
        System.out.println("Sending Email notification...");
    }
}
