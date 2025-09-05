package com.floret.util;

public class TestDB {
    public static void main(String[] args) {
        if (DBConnection.getConnection() != null) {
            System.out.println("✅ Database Connected Successfully!");
        } else {
            System.out.println("❌ Database Connection Failed!");
        }
    }
}
