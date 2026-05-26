package com.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.List;
import java.util.ArrayList;

public class BugDAO {

    public void insertBug(Bug bug) {

        Connection conn = DBConnection.getConnection();

        try {

            PreparedStatement stmt = conn.prepareStatement(
                "INSERT INTO bugs (id, title, description, status) VALUES (?, ?, ?, ?)"
            );

            stmt.setInt(1, bug.getId());
            stmt.setString(2, bug.getTitle());
            stmt.setString(3, bug.getDescription());
            stmt.setString(4, bug.getStatus());

            stmt.executeUpdate();

            System.out.println("Bug inserted successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Bug> getAllBugs() {

        List<Bug> bugs = new ArrayList<>();

        Connection conn = DBConnection.getConnection();

        try {

            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM bugs");

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                Bug bug = new Bug(
                    rs.getInt("id"),
                    rs.getString("title"),
                    rs.getString("description"),
                    rs.getString("status")
                );

                bugs.add(bug);
            }

        } 
        catch (Exception e) {
            e.printStackTrace();
        }

        return bugs;
    }
}